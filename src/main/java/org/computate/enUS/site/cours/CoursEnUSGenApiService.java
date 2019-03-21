package org.computate.enUS.site.cours;

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
public interface CoursEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("Cours").register(CoursEnUSGenApiService.class, new CoursEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static CoursEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new CoursEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static CoursEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new CoursEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspageCoursId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspageCours(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
