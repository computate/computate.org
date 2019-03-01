package org.computate.frFR.site.cours.c001;

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
import org.computate.frFR.site.cours.c001.C001LeconPage;
import java.time.LocalDateTime;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import io.vertx.core.CompositeFuture;
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


public class C001LeconGenApiServiceImpl implements C001LeconGenApiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(C001LeconGenApiServiceImpl.class);

	private static final String SERVICE_ADDRESS = "C001LeconApiServiceImpl";

	protected SiteContexte siteContexte;

	public C001LeconGenApiServiceImpl(SiteContexte siteContexte) {
		this.siteContexte = siteContexte;
		C001LeconGenApiService service = C001LeconGenApiService.creerProxy(siteContexte.getVertx(), SERVICE_ADDRESS);
	}

	// RecherchePage //

	@Override
	public void recherchepageC001Lecon(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		RequeteSite requeteSite = genererRequeteSitePourC001Lecon(siteContexte, operationRequete);
		recherchepageC001Lecon(requeteSite, a -> {
			if(a.succeeded()) {
				ListeRecherche<C001Lecon> listeC001Lecon = a.result();
				reponse200RecherchePageC001Lecon(listeC001Lecon, b -> {
					if(b.succeeded()) {
						gestionnaireEvenements.handle(Future.succeededFuture(b.result()));
					} else {
						erreurC001Lecon(requeteSite, gestionnaireEvenements, b);
					}
				});
			} else {
				erreurC001Lecon(requeteSite, gestionnaireEvenements, a);
			}
		});
	}

	public void recherchepageC001Lecon(RequeteSite requeteSite, Handler<AsyncResult<ListeRecherche<C001Lecon>>> gestionnaireEvenements) {
		try {
			OperationRequest operationRequete = requeteSite.getOperationRequete();
			String entiteListeStr = requeteSite.getOperationRequete().getParams().getJsonObject("query").getString("fl");
			String[] entiteListe = entiteListeStr == null ? null : entiteListeStr.split(",\\s*");
			ListeRecherche<C001Lecon> listeRecherche = new ListeRecherche<C001Lecon>();
			listeRecherche.setQuery("*:*");
			listeRecherche.setC(C001Lecon.class);
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
							varIndexe = "*".equals(entiteVar) ? entiteVar : varIndexeC001Lecon(entiteVar);
							listeRecherche.setQuery(varIndexe + ":" + ("*".equals(valeurIndexe) ? valeurIndexe : ClientUtils.escapeQueryChars(valeurIndexe)));
							break;
						case "fq":
							entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
							valeurIndexe = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":"));
							varIndexe = varIndexeC001Lecon(entiteVar);
							listeRecherche.addFilterQuery(varIndexe + ":" + ClientUtils.escapeQueryChars(valeurIndexe));
							break;
						case "sort":
							entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, " "));
							valeurTri = StringUtils.trim(StringUtils.substringAfter((String)paramObjet, " "));
							varIndexe = varIndexeC001Lecon(entiteVar);
							listeRecherche.addSort(varIndexe, ORDER.valueOf(valeurTri));
							break;
						case "fl":
							entiteVar = StringUtils.trim((String)paramObjet);
							varIndexe = varIndexeC001Lecon(entiteVar);
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

	public void reponse200RecherchePageC001Lecon(ListeRecherche<C001Lecon> listeC001Lecon, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			Buffer buffer = Buffer.buffer();
			RequeteSite requeteSite = listeC001Lecon.getRequeteSite_();
			ToutEcrivain w = ToutEcrivain.creer(listeC001Lecon.getRequeteSite_(), buffer);
			C001LeconPage page = new C001LeconPage();
			page.setPageUrl("");
			SolrDocument pageDocumentSolr = new SolrDocument();

			pageDocumentSolr.setField("pageUri_frFR_stored_string", "/frFR/cours/001");
			page.setPageDocumentSolr(pageDocumentSolr);
			page.setW(w);
			page.setListeC001Lecon(listeC001Lecon);
			page.initLoinC001LeconPage(requeteSite);
			page.html();
			gestionnaireEvenements.handle(Future.succeededFuture(new OperationResponse(200, "OK", buffer, new CaseInsensitiveHeaders())));
		} catch(Exception e) {
			gestionnaireEvenements.handle(Future.failedFuture(e));
		}
	}

	public String varIndexeC001Lecon(String entiteVar) {
		switch(entiteVar) {
			case "estLecon":
				return "estLecon_indexed_boolean";
			case "leconCree":
				return "leconCree_indexed_date";
			case "leconNumero":
				return "leconNumero_indexed_int";
			case "estArticle":
				return "estArticle_indexed_boolean";
			default:
				throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		}
	}

	// Partagé //

	public void erreurC001Lecon(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements, AsyncResult<?> resultatAsync) {
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

	public void sqlC001Lecon(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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

	public RequeteSite genererRequeteSitePourC001Lecon(SiteContexte siteContexte, OperationRequest operationRequete) {
		return genererRequeteSitePourC001Lecon(siteContexte, operationRequete, null);
	}

	public RequeteSite genererRequeteSitePourC001Lecon(SiteContexte siteContexte, OperationRequest operationRequete, JsonObject body) {
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

	public void definirC001Lecon(C001Lecon o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
		try {
			RequeteSite requeteSite = o.getRequeteSite_();
			SQLConnection connexionSql = requeteSite.getConnexionSql();
			Long pk = o.getPk();
			connexionSql.queryWithParams(
					SiteContexte.SQL_definir
					, new JsonArray(Arrays.asList(pk))
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

	public void attribuerC001Lecon(C001Lecon o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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

	public void indexerC001Lecon(C001Lecon o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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
