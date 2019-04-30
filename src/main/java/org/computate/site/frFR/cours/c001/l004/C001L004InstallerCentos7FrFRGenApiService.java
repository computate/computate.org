package org.computate.site.frFR.cours.c001.l004;

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
public interface C001L004InstallerCentos7FrFRGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteFrFR siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("frFRC001L004InstallerCentos7").register(C001L004InstallerCentos7FrFRGenApiService.class, new C001L004InstallerCentos7FrFRApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L004InstallerCentos7FrFRGenApiService creer(SiteContexteFrFR siteContexte, Vertx vertx) {
		return new C001L004InstallerCentos7FrFRApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L004InstallerCentos7FrFRGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L004InstallerCentos7FrFRGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void recherchefrfrpageC001L004InstallerCentos7Id(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void recherchefrfrpageC001L004InstallerCentos7(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
