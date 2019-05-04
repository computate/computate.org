package org.computate.site.frFR.cours.c001.l005;

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
public interface C001L005InstallerEclipseFrFRGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteFrFR siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("frFRC001L005InstallerEclipse").register(C001L005InstallerEclipseFrFRGenApiService.class, new C001L005InstallerEclipseFrFRApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L005InstallerEclipseFrFRGenApiService creer(SiteContexteFrFR siteContexte, Vertx vertx) {
		return new C001L005InstallerEclipseFrFRApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L005InstallerEclipseFrFRGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L005InstallerEclipseFrFRGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void recherchefrfrpageC001L005InstallerEclipseId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void recherchefrfrpageC001L005InstallerEclipse(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
