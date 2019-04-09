package org.computate.site.frFR.cours.c001.l002;

import org.computate.site.frFR.contexte.SiteContexteFrFR;
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
public interface C001L002ChoisirOrdinateurFrFRGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteFrFR siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("frFRC001L002ChoisirOrdinateur").register(C001L002ChoisirOrdinateurFrFRGenApiService.class, new C001L002ChoisirOrdinateurFrFRApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L002ChoisirOrdinateurFrFRGenApiService creer(SiteContexteFrFR siteContexte, Vertx vertx) {
		return new C001L002ChoisirOrdinateurFrFRApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L002ChoisirOrdinateurFrFRGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L002ChoisirOrdinateurFrFRGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void recherchefrfrpageC001L002ChoisirOrdinateurId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void recherchefrfrpageC001L002ChoisirOrdinateur(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
