package org.computate.site.enUS.cours.c001.l003;

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
public interface C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("enUSC001L003InstallerMachineVirtuelleVirtualBox").register(C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiService.class, new C001L003InstallerMachineVirtuelleVirtualBoxEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new C001L003InstallerMachineVirtuelleVirtualBoxEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L003InstallerMachineVirtuelleVirtualBoxEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspageC001L003InstallerMachineVirtuelleVirtualBoxId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspageC001L003InstallerMachineVirtuelleVirtualBox(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
