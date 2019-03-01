package org.computate.frFR.site.utilisateur;

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


public class UtilisateurSiteGenApiServiceImpl implements UtilisateurSiteGenApiService {

	private static final Logger LOGGER = LoggerFactory.getLogger(UtilisateurSiteGenApiServiceImpl.class);

	private static final String SERVICE_ADDRESS = "UtilisateurSiteApiServiceImpl";

	protected SiteContexte siteContexte;

	public UtilisateurSiteGenApiServiceImpl(SiteContexte siteContexte) {
		this.siteContexte = siteContexte;
		UtilisateurSiteGenApiService service = UtilisateurSiteGenApiService.creerProxy(siteContexte.getVertx(), SERVICE_ADDRESS);
	}

	public String varIndexeUtilisateurSite(String entiteVar) {
		switch(entiteVar) {
			case "calculInrPks":
				return "calculInrPks_indexed_longs";
			case "utilisateurNom":
				return "utilisateurNom_indexed_string";
			case "utilisateurMail":
				return "utilisateurMail_indexed_string";
			case "utilisateurId":
				return "utilisateurId_indexed_string";
			case "utilisateurPrenom":
				return "utilisateurPrenom_indexed_string";
			case "utilisateurNomFamille":
				return "utilisateurNomFamille_indexed_string";
			case "utilisateurNomComplet":
				return "utilisateurNomComplet_indexed_string";
			case "utilisateurSite":
				return "utilisateurSite_indexed_string";
			case "utilisateurRecevoirCourriels":
				return "utilisateurRecevoirCourriels_indexed_boolean";
			case "modeleSupprime":
				return "modeleSupprime_indexed_boolean";
			case "modeleCree":
				return "modeleCree_indexed_date";
			case "modeleModifie":
				return "modeleModifie_indexed_date";
			case "modeleClasseNomCanonique":
				return "modeleClasseNomCanonique_indexed_string";
			case "modeleCle":
				return "modeleCle_indexed_long";
			case "modeleSuggestionStocke":
				return "modeleSuggestionStocke_indexed_string";
			case "modeleSuggestionIndexe":
				return "modeleSuggestionIndexe_indexed_string";
			default:
				throw new RuntimeException(String.format("\"%s\" n'est pas une entité indexé. ", entiteVar));
		}
	}

	// Partagé //

	public void erreurUtilisateurSite(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements, AsyncResult<?> resultatAsync) {
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

	public void sqlUtilisateurSite(RequeteSite requeteSite, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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

	public RequeteSite genererRequeteSitePourUtilisateurSite(SiteContexte siteContexte, OperationRequest operationRequete) {
		return genererRequeteSitePourUtilisateurSite(siteContexte, operationRequete, null);
	}

	public RequeteSite genererRequeteSitePourUtilisateurSite(SiteContexte siteContexte, OperationRequest operationRequete, JsonObject body) {
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

	public void definirUtilisateurSite(UtilisateurSite o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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

	public void attribuerUtilisateurSite(UtilisateurSite o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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

	public void indexerUtilisateurSite(UtilisateurSite o, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements) {
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
