package org.computate.site.enUS.page.accueil;

import org.computate.site.enUS.contexte.SiteContexteEnUS;
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
public interface PageAccueilEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("enUSPageAccueil").register(PageAccueilEnUSGenApiService.class, new PageAccueilEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static PageAccueilEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new PageAccueilEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static PageAccueilEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new PageAccueilEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspagePageAccueilId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspagePageAccueil(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
