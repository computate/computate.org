package org.computate.site.enUS.cours.c001.l011;

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
public interface C001L011InstallerKeycloakEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("enUSC001L011InstallerKeycloak").register(C001L011InstallerKeycloakEnUSGenApiService.class, new C001L011InstallerKeycloakEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L011InstallerKeycloakEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new C001L011InstallerKeycloakEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L011InstallerKeycloakEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L011InstallerKeycloakEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspageC001L011InstallerKeycloakId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspageC001L011InstallerKeycloak(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
