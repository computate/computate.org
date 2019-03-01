package org.computate.frFR.site.cours.c001;

import org.computate.frFR.site.contexte.SiteContexte;
import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.ext.web.api.generator.WebApiServiceGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;

@WebApiServiceGen
@ProxyGen
public interface C001GenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001GenApiService creer(SiteContexte siteContexte, Vertx vertx) {
		return new C001ApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001GenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001GenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void recherchepageC001(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
