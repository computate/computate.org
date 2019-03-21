package org.computate.enUS.site.cours.c001;

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
 **/
@WebApiServiceGen
@ProxyGen
public interface C001LeconEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("C001Lecon").register(C001LeconEnUSGenApiService.class, new C001LeconEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001LeconEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new C001LeconEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001LeconEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001LeconEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspageC001LeconId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspageC001Lecon(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
