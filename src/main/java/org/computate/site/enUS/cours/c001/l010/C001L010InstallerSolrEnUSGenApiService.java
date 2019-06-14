package org.computate.site.enUS.cours.c001.l010;

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
public interface C001L010InstallerSolrEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("enUSC001L010InstallerSolr").register(C001L010InstallerSolrEnUSGenApiService.class, new C001L010InstallerSolrEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L010InstallerSolrEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new C001L010InstallerSolrEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L010InstallerSolrEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L010InstallerSolrEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspageC001L010InstallerSolrId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspageC001L010InstallerSolr(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
