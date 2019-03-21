package org.computate.enUS.site.utilisateur;

import org.computate.enUS.site.contexte.SiteContexteEnUS;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.ext.web.api.generator.WebApiServiceGen;
import io.vertx.serviceproxy.ServiceBinder;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;

/**
 * Traduire: false
 * Gen: false
 **/
@WebApiServiceGen
@ProxyGen
public interface UtilisateurSiteEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("UtilisateurSite").register(UtilisateurSiteEnUSGenApiService.class, new UtilisateurSiteEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static UtilisateurSiteEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new UtilisateurSiteEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static UtilisateurSiteEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new UtilisateurSiteEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

}
