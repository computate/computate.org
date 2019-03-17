package org.computate.enUS.site.cours;

import java.util.Arrays;
import io.vertx.ext.web.api.validation.ParameterTypeValidator;
import org.computate.enUS.site.contexte.SiteContexte;
import org.apache.solr.common.SolrDocumentList;
import java.util.Date;
import io.vertx.core.MultiMap;
import io.vertx.ext.web.Router;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import org.computate.enUS.site.utilisateur.UtilisateurSite;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.api.OperationResponse;
import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import org.computate.enUS.site.recherche.ResultatRecherche;
import java.util.Map;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.core.json.JsonObject;
import org.computate.enUS.site.config.ConfigSite;
import io.vertx.core.logging.Logger;
import io.vertx.core.http.CaseInsensitiveHeaders;
import java.io.PrintWriter;
import java.util.Collection;
import java.sql.Timestamp;
import java.util.Set;
import io.netty.handler.codec.http.HttpResponseStatus;
import java.util.stream.Collectors;
import io.vertx.core.Future;
import java.time.ZoneId;
import org.computate.enUS.site.recherche.ListeRecherche;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import java.util.List;
import java.security.Principal;
import java.util.stream.Stream;
import io.vertx.core.buffer.Buffer;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.http.client.utils.URLEncodedUtils;
import java.util.Optional;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import org.apache.solr.client.solrj.util.ClientUtils;
import io.vertx.ext.sql.SQLClient;
import org.apache.http.NameValuePair;
import org.apache.commons.lang3.exception.ExceptionUtils;
import io.vertx.core.json.Json;
import java.time.LocalDateTime;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import io.vertx.core.CompositeFuture;
import io.vertx.ext.auth.oauth2.KeycloakHelper;
import java.nio.charset.Charset;
import io.vertx.ext.web.api.validation.HTTPRequestValidationHandler;
import io.vertx.core.AsyncResult;
import org.computate.frFR.site.cours.CoursFrFRPage;
import org.computate.enUS.site.cours.CoursEnUSPage;
import io.vertx.ext.web.api.validation.ValidationException;
import org.apache.solr.client.solrj.response.QueryResponse;
import io.vertx.core.Vertx;
import java.io.IOException;
import io.vertx.ext.reactivestreams.ReactiveWriteStream;
import java.util.concurrent.TimeUnit;
import org.apache.solr.common.SolrDocument;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;
import java.time.format.DateTimeFormatter;
import io.vertx.ext.sql.SQLConnection;
import org.computate.enUS.site.requete.RequeteSite;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import io.vertx.core.Handler;
import java.util.Collections;


public class CoursGenApiServiceImpl implements CoursGenApiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(CoursGenApiServiceImpl.class);

	private static final String SERVICE_ADDRESS = "CoursApiServiceImpl";

	protected SiteContexte siteContexte;

	public CoursGenApiServiceImpl(SiteContexte siteContexte) {
		this.siteContexte = siteContexte;
		CoursGenApiService service = CoursGenApiService.creerProxy(siteContexte.getVertx(), SERVICE_ADDRESS);
	}

	// RechercheFrFRPage //

	@Override
	public void recherchefrfrpageCoursId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		recherchefrfrpageCours(operationRequete, gestionnaireEvenements);
	}

	@Override
	public void recherchefrfrpageCours(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSite requeteSite = genererRequeteSitePourCours(siteContexte, operationRequete);
			sqlCours(requeteSite, a -> {
				if(a.succeeded()) {
					utilisateurCours(requeteSite, b -> {
						if(b.succeeded()) {
							rechercheCours(requeteSite, false, true, "/frFR/cours", c -> {
								if(c.succeeded()) {
									ListeRecherche<Cours> listeCours = c.result();
									reponse200RechercheFrFRPageCours(listeCours, d -> {
										if(d.succeeded()) {
											SQLConnection connexionSql = requeteSite.getConnexionSql();
											connexionSql.commit(e -> {
												if(e.succeeded()) {
													connexionSql.close(f -> {
														if(f.succeeded()) {
															gestionnaireEvenements.handle(Future.succeededFuture(d.result()));
														} else {
															erreurCours(requeteSite, gestionnaireEvenements, f);
														}
													});
												} else {
													erreurCours(requeteSite, gestionnaireEvenements, e);
												}
											});
										} else {
											erreurCours(requeteSite, gestionnaireEvenements, d);
										}
									});
								} else {
									erreurCours(requeteSite, gestionnaireEvenements, c);
								}
							});
						} else {
							erreurCours(requeteSite, gestionnaireEvenements, b);
						}
					});
				} else {
					erreurCours(requeteSite, gestionnaireEvenements, a);
				}
			});
		} catch(Exception e) {
			erreurCours(null, gestionnaireEvenements, Future.failedFuture(e));
		}
	}

	public void reponse200RechercheFrFRPageCours(ListeRecherche<Cours> listeCours, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSite requeteSite = listeCours.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeCours.getRequeteSite_(), buffer);
			requeteSite.setW(w);
			CoursFrFRPage page = new CoursFrFRPage();
			page.setPageUrl("");
			SolrDocument pageDocumentSolr = new SolrDocument();

			pageDocumentSolr.setField("pageUri_frFR_stored_string", "/frFR/cours");
			page.setPageDocumentSolr(pageDocumentSolr);
			page.setW(w);
			page.setListeCours(listeCours);
			page.initLoinCoursFrFRPage(requeteSite);
			page.html();
			gestionnaireEvenements.handle(Future.succeededFuture(new OperationResponse(200, "OK", buffer, new CaseInsensitiveHeaders())));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	// RechercheEnUSPage //

	@Override
	public void rechercheenuspageCoursId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		rechercheenuspageCours(operationRequete, gestionnaireEvenements);
	}

	@Override
	public void rechercheenuspageCours(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSite requeteSite = genererRequeteSitePourCours(siteContexte, operationRequete);
			sqlCours(requeteSite, a -> {
				if(a.succeeded()) {
					utilisateurCours(requeteSite, b -> {
						if(b.succeeded()) {
							rechercheCours(requeteSite, false, true, "/enUS/course", c -> {
								if(c.succeeded()) {
									ListeRecherche<Cours> listeCours = c.result();
									reponse200RechercheEnUSPageCours(listeCours, d -> {
										if(d.succeeded()) {
											SQLConnection connexionSql = requeteSite.getConnexionSql();
											connexionSql.commit(e -> {
												if(e.succeeded()) {
													connexionSql.close(f -> {
														if(f.succeeded()) {
															gestionnaireEvenements.handle(Future.succeededFuture(d.result()));
														} else {
															erreurCours(requeteSite, gestionnaireEvenements, f);
														}
													});
												} else {
													erreurCours(requeteSite, gestionnaireEvenements, e);
												}
											});
										} else {
											erreurCours(requeteSite, gestionnaireEvenements, d);
										}
									});
								} else {
									erreurCours(requeteSite, gestionnaireEvenements, c);
								}
							});
						} else {
							erreurCours(requeteSite, gestionnaireEvenements, b);
						}
					});
				} else {
					erreurCours(requeteSite, gestionnaireEvenements, a);
				}
			});
		} catch(Exception e) {
			erreurCours(null, gestionnaireEvenements, Future.failedFuture(e));
		}
	}

	public void reponse200RechercheEnUSPageCours(ListeRecherche<Cours> listeCours, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSite requeteSite = listeCours.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeCours.getRequeteSite_(), buffer);
			requeteSite.setW(w);
			CoursEnUSPage page = new CoursEnUSPage();
			page.setPageUrl("");
			SolrDocument pageDocumentSolr = new SolrDocument();

			pageDocumentSolr.setField("pageUri_frFR_stored_string", "/enUS/course");
			page.setPageDocumentSolr(pageDocumentSolr);
			page.setW(w);
			page.setListeCours(listeCours);
			page.initLoinCoursEnUSPage(requeteSite);
			page.html();
			gestionnaireEvenements.handle(Future.succeededFuture(new OperationResponse(200, "OK", buffer, new CaseInsensitiveHeaders())));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public String varIndexeCours(String entiteVar) {
		switch(entiteVar) {
			default:
				throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		}
	}

	// Partagé //

	public void erreurCours(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements, AsyncResult<?> resultatAsync) {
		Throwable e = resultatAsync.cause();
		ExceptionUtils.printRootCauseStackTrace(e);
		OperationResponse reponseOperation = new OperationResponse(400, "BAD REQUEST", 
			Buffer.buffer().appendString(
				new JsonObject() {{
					put("erreur", new JsonObject() {{
					put("message", e.getMessage());
					}});
				}}.encodePrettily()
			)
			, new CaseInsensitiveHeaders()
		);
		if(requeteSite != null) {
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			if(connexionSql != null) {
				connexionSql.rollback(a -> {
					if(a.succeeded()) {
						connexionSql.close(b -> {
							if(a.succeeded()) {
								gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
							} else {
								gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
							}
						});
					} else {
						gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
					}
				});
			} else {
				gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
			}
		} else {
			gestionnaireEvenements.handle(Future.succeededFuture(reponseOperation));
		}
	}

	public void sqlCours(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			SQLClient clientSql = requeteSite.getSiteContexte_().getClientSql();

			clientSql.getConnection(sqlAsync -> {
				if(sqlAsync.succeeded()) {
					SQLConnection connexionSql = sqlAsync.result();
					connexionSql.setAutoCommit(false, a -> {
						if(a.succeeded()) {
							requeteSite.setConnexionSql(connexionSql);
							gestionnaireEvenements.handle(Future.succeededFuture());
						} else {
							gestionnaireEvenements.handle(Future.failedFuture(a.cause()));
						}
					});
				} else {
					gestionnaireEvenements.handle(Future.failedFuture(sqlAsync.cause()));
				}
			});
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public RequeteSite genererRequeteSitePourCours(SiteContexte siteContexte, OperationRequest operationRequete) {
		return genererRequeteSitePourCours(siteContexte, operationRequete, null);
	}

	public RequeteSite genererRequeteSitePourCours(SiteContexte siteContexte, OperationRequest operationRequete, JsonObject body) {
		Vertx vertx = siteContexte.getVertx();
		RequeteSite requeteSite = new RequeteSite();
		requeteSite.setObjetJson(body);
		requeteSite.setVertx(vertx);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		requeteSite.setOperationRequete(operationRequete);
		requeteSite.initLoinRequeteSite(requeteSite);

		return requeteSite;
	}

	public void utilisateurCours(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			String utilisateurId = requeteSite.getUtilisateurId();
			if(utilisateurId == null) {
				gestionnaireEvenements.handle(Future.succeededFuture());
			} else {
				connexionSql.queryWithParams(
						SiteContexte.SQL_selectC
						, new JsonArray(Arrays.asList("org.computate.frFR.site.utilisateur.UtilisateurSite", utilisateurId))
						, selectCAsync
				-> {
					if(selectCAsync.succeeded()) {
						JsonArray utilisateurValeurs = selectCAsync.result().getResults().stream().findFirst().orElse(null);
						if(utilisateurValeurs == null) {
							connexionSql.queryWithParams(
									SiteContexte.SQL_creer
									, new JsonArray(Arrays.asList(UtilisateurSite.class.getCanonicalName(), utilisateurId))
									, creerAsync
							-> {
								JsonArray creerLigne = creerAsync.result().getResults().stream().findFirst().orElseGet(() -> null);
								Long pkUtilisateur = creerLigne.getLong(0);
								UtilisateurSite utilisateurSite = new UtilisateurSite();
								utilisateurSite.setPk(pkUtilisateur);

								connexionSql.queryWithParams(
										SiteContexte.SQL_definir
										, new JsonArray(Arrays.asList(pkUtilisateur, pkUtilisateur, pkUtilisateur))
										, definirAsync
								-> {
									if(definirAsync.succeeded()) {
										try {
											for(JsonArray definition : definirAsync.result().getResults()) {
												utilisateurSite.definirPourClasse(definition.getString(0), definition.getString(1));
											}
											JsonObject utilisateurVertx = requeteSite.getOperationRequete().getUser();
											JsonObject principalJson = KeycloakHelper.parseToken(utilisateurVertx.getString("access_token"));
											utilisateurSite.setUtilisateurNom(principalJson.getString("preferred_username"));
											utilisateurSite.setUtilisateurPrenom(principalJson.getString("given_name"));
											utilisateurSite.setUtilisateurNomFamille(principalJson.getString("family_name"));
											utilisateurSite.setUtilisateurId(principalJson.getString("sub"));
											utilisateurSite.initLoinPourClasse(requeteSite);
											utilisateurSite.indexerPourClasse();
											requeteSite.setUtilisateurSite(utilisateurSite);
											gestionnaireEvenements.handle(Future.succeededFuture());
										} catch(Exception e) {
											gestionnaireEvenements.handle(Future.failedFuture(e));
										}
									} else {
										gestionnaireEvenements.handle(Future.failedFuture(definirAsync.cause()));
									}
								});
							});
						} else {
							Long pkUtilisateur = utilisateurValeurs.getLong(0);
							UtilisateurSite utilisateurSite = new UtilisateurSite();
							utilisateurSite.setPk(pkUtilisateur);

							connexionSql.queryWithParams(
									SiteContexte.SQL_definir
									, new JsonArray(Arrays.asList(pkUtilisateur, pkUtilisateur, pkUtilisateur))
									, definirAsync
							-> {
								if(definirAsync.succeeded()) {
									for(JsonArray definition : definirAsync.result().getResults()) {
										utilisateurSite.definirPourClasse(definition.getString(0), definition.getString(1));
									}
									JsonObject utilisateurVertx = requeteSite.getOperationRequete().getUser();
									JsonObject principalJson = KeycloakHelper.parseToken(utilisateurVertx.getString("access_token"));
									utilisateurSite.setUtilisateurNom(principalJson.getString("preferred_username"));
									utilisateurSite.setUtilisateurPrenom(principalJson.getString("given_name"));
									utilisateurSite.setUtilisateurNomFamille(principalJson.getString("family_name"));
									utilisateurSite.setUtilisateurId(principalJson.getString("sub"));
									utilisateurSite.initLoinPourClasse(requeteSite);
									requeteSite.setUtilisateurSite(utilisateurSite);
									gestionnaireEvenements.handle(Future.succeededFuture());
								} else {
									gestionnaireEvenements.handle(Future.failedFuture(definirAsync.cause()));
								}
							});
						}
					} else {
						gestionnaireEvenements.handle(Future.failedFuture(selectCAsync.cause()));
					}
				});
			}
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void rechercheCours(RequeteSite requeteSite, Boolean peupler, Boolean stocker, String classeApiUriMethode, Handler<AsyncResult<ListeRecherche<Cours>>> gestionnaireEvenements) {
		try {
			OperationRequest operationRequete = requeteSite.getOperationRequete();
			String entiteListeStr = requeteSite.getOperationRequete().getParams().getJsonObject("query").getString("fl");
			String[] entiteListe = entiteListeStr == null ? null : entiteListeStr.split(",\\s*");
			ListeRecherche<Cours> listeRecherche = new ListeRecherche<Cours>();
			listeRecherche.setPeupler(peupler);
			listeRecherche.setStocker(stocker);
			listeRecherche.setQuery("*:*");
			listeRecherche.setC(Cours.class);
			if(entiteListe != null)
			listeRecherche.setFields(entiteListe);
			listeRecherche.addSort("archive_indexed_boolean", ORDER.asc);
			listeRecherche.addSort("supprime_indexed_boolean", ORDER.asc);
			listeRecherche.addFilterQuery("classeNomCanonique_indexed_string:" + ClientUtils.escapeQueryChars("org.computate.enUS.site.cours.Cours"));
			UtilisateurSite utilisateurSite = requeteSite.getUtilisateurSite();
			if(utilisateurSite != null && !utilisateurSite.getVoirSupprime())
				listeRecherche.addFilterQuery("supprime_indexed_boolean:false");
			if(utilisateurSite != null && !utilisateurSite.getVoirArchive())
				listeRecherche.addFilterQuery("archive_indexed_boolean:false");

			String pageUri = null;
			String id = operationRequete.getParams().getJsonObject("path").getString("id");
			if(id != null) {
				pageUri = classeApiUriMethode + "/" + id;
				listeRecherche.addFilterQuery("pageUri_indexed_string:" + ClientUtils.escapeQueryChars(pageUri));
			}

			operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
				String entiteVar = null;
				String valeurIndexe = null;
				String varIndexe = null;
				String valeurTri = null;
				Integer rechercheDebut = null;
				Integer rechercheNum = null;
				String paramNom = paramRequete.getKey();
				Object paramValeursObjet = paramRequete.getValue();
				JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

				for(Object paramObjet : paramObjets) {
					switch(paramNom) {
						case "q":
							entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
							valeurIndexe = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":"));
							varIndexe = "*".equals(entiteVar) ? entiteVar : varIndexeCours(entiteVar);
							listeRecherche.setQuery(varIndexe + ":" + ("*".equals(valeurIndexe) ? valeurIndexe : ClientUtils.escapeQueryChars(valeurIndexe)));
							break;
						case "fq":
							entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
							valeurIndexe = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":"));
							varIndexe = varIndexeCours(entiteVar);
							listeRecherche.addFilterQuery(varIndexe + ":" + ClientUtils.escapeQueryChars(valeurIndexe));
							break;
						case "sort":
							entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, " "));
							valeurTri = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, " "));
							varIndexe = varIndexeCours(entiteVar);
							listeRecherche.addSort(varIndexe, ORDER.valueOf(valeurTri));
							break;
						case "fl":
							entiteVar = StringUtils.trim((String)paramObjet);
							varIndexe = varIndexeCours(entiteVar);
							listeRecherche.addField(varIndexe);
							break;
						case "start":
							rechercheDebut = (Integer)paramObjet;
							listeRecherche.setStart(rechercheDebut);
							break;
						case "rows":
							rechercheNum = (Integer)paramObjet;
							listeRecherche.setRows(rechercheNum);
							break;
					}
				}
			});
			listeRecherche.initLoinPourClasse(requeteSite);
			gestionnaireEvenements.handle(Future.succeededFuture(listeRecherche));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void definirCours(Cours o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSite requeteSite = o.getRequeteSite_();
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			Long pk = o.getPk();
			connexionSql.queryWithParams(
					SiteContexte.SQL_definir
					, new JsonArray(Arrays.asList(pk, pk, pk))
					, definirAsync
			-> {
				if(definirAsync.succeeded()) {
					for(JsonArray definition : definirAsync.result().getResults()) {
						o.definirPourClasse(definition.getString(0), definition.getString(1));
					}
					gestionnaireEvenements.handle(Future.succeededFuture());
				} else {
					gestionnaireEvenements.handle(Future.failedFuture(definirAsync.cause()));
				}
			});
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void attribuerCours(Cours o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSite requeteSite = o.getRequeteSite_();
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			Long pk = o.getPk();
			connexionSql.queryWithParams(
					SiteContexte.SQL_attribuer
					, new JsonArray(Arrays.asList(pk, pk))
					, attribuerAsync
			-> {
				if(attribuerAsync.succeeded()) {
					if(attribuerAsync.result() != null) {
						for(JsonArray definition : attribuerAsync.result().getResults()) {
							o.attribuerPourClasse(definition.getString(0), definition.getString(1));
						}
					}
					gestionnaireEvenements.handle(Future.succeededFuture());
				} else {
					gestionnaireEvenements.handle(Future.failedFuture(attribuerAsync.cause()));
				}
			});
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public void indexerCours(Cours o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		RequeteSite requeteSite = o.getRequeteSite_();
		try {
			o.initLoinPourClasse(requeteSite);
			o.indexerPourClasse();
			gestionnaireEvenements.handle(Future.succeededFuture());
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}
}
