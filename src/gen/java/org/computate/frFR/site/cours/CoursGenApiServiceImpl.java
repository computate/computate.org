package org.computate.frFR.site.cours;

import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Arrays;
import io.vertx.ext.web.api.validation.ParameterTypeValidator;
import org.computate.frFR.site.contexte.SiteContexte;
import org.apache.solr.common.SolrDocumentList;
import java.util.Date;
import io.vertx.core.MultiMap;
import io.vertx.ext.web.Router;
import io.vertx.ext.reactivestreams.ReactiveReadStream;
import org.computate.frFR.site.utilisateur.UtilisateurSite;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.api.OperationResponse;
import org.apache.commons.lang3.StringUtils;
import java.math.BigDecimal;
import org.computate.frFR.site.recherche.ResultatRecherche;
import java.util.Map;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.core.json.JsonObject;
import org.computate.frFR.site.config.ConfigSite;
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
import org.computate.frFR.site.recherche.ListeRecherche;
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
import org.computate.frFR.site.cours.CoursPage;
import java.nio.charset.Charset;
import io.vertx.ext.web.api.validation.HTTPRequestValidationHandler;
import io.vertx.core.AsyncResult;
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
import org.computate.frFR.site.requete.RequeteSite;
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

	// RecherchePage //

	@Override
	public void recherchepageCours(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		RequeteSite requeteSite = genererRequeteSitePourCours(siteContexte, operationRequete);
		recherchepageCours(requeteSite, a -> {
			if(a.succeeded()) {
				ListeRecherche<Cours> listeCours = a.result();
				reponse200RecherchePageCours(listeCours, b -> {
					if(b.succeeded()) {
						gestionnaireEvenements.handle(Future.succeededFuture(b.result()));
					} else {
						erreurCours(requeteSite, gestionnaireEvenements, b);
					}
				});
			} else {
				erreurCours(requeteSite, gestionnaireEvenements, a);
			}
		});
	}

	public void recherchepageCours(RequeteSite requeteSite, Handler<AsyncResult<ListeRecherche<Cours>>> gestionnaireEvenements) {
		try {
			OperationRequest operationRequete = requeteSite.getOperationRequete();
			String entiteListeStr = requeteSite.getOperationRequete().getParams().getJsonObject("query").getString("fl");
			String[] entiteListe = entiteListeStr == null ? null : entiteListeStr.split(",\\s*");
			ListeRecherche<Cours> listeRecherche = new ListeRecherche<Cours>();
			listeRecherche.setQuery("*:*");
			listeRecherche.setC(Cours.class);
			listeRecherche.setRows(1000000);
			if(entiteListe != null)
			listeRecherche.setFields(entiteListe);
			listeRecherche.addSort("partNumero_indexed_int", ORDER.asc);
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

	public void reponse200RecherchePageCours(ListeRecherche<Cours> listeCours, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSite requeteSite = listeCours.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeCours.getRequeteSite_(), buffer);
			CoursPage page = new CoursPage();
			page.setPageUrl("/api/v1/frFR/cours");
			SolrDocument pageDocumentSolr = new SolrDocument();

			pageDocumentSolr.setField("pageUri_frFR_stored_string", "/frFR/cours");
			page.setPageDocumentSolr(pageDocumentSolr);
			page.setW(w);
			page.setListeCours(listeCours);
			page.initLoinCoursPage(requeteSite);
			page.html();
			gestionnaireEvenements.handle(Future.succeededFuture(new OperationResponse(200, "OK", buffer, new CaseInsensitiveHeaders())));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public String varIndexeCours(String entiteVar) {
		switch(entiteVar) {
			case "estCours":
				return "estCours_indexed_boolean";
			case "coursNumero":
				return "coursNumero_indexed_int";
			case "coursCree":
				return "coursCree_indexed_date";
			case "coursDescription":
				return "coursDescription_indexed_string";
			case "pageCree":
				return "pageCree_indexed_date";
			case "pageH1":
				return "pageH1_indexed_string";
			case "pageH2":
				return "pageH2_indexed_string";
			case "pageH3":
				return "pageH3_indexed_string";
			case "pageTitre":
				return "pageTitre_indexed_string";
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

		UtilisateurSite utilisateurSite = new UtilisateurSite();
		utilisateurSite.initLoinUtilisateurSite(requeteSite);
		requeteSite.setUtilisateurSite(utilisateurSite);
		utilisateurSite.setRequeteSite_(requeteSite);
		return requeteSite;
	}

	public void definirCours(Cours o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSite requeteSite = o.getRequeteSite_();
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			Long  = o.get();
			connexionSql.queryWithParams(
					SiteContexte.SQL_definir
					, new JsonArray(Arrays.asList())
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
			Long  = o.get();
			connexionSql.queryWithParams(
					SiteContexte.SQL_attribuer
					, new JsonArray(Arrays.asList(, ))
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
