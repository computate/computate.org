package org.computate.site.enUS.cours.c001.l001;

import org.computate.site.enUS.contexte.SiteContexteEnUS;

import io.vertx.codegen.annotations.ProxyGen;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.ext.web.api.OperationResponse;
import io.vertx.ext.web.api.generator.WebApiServiceGen;
import io.vertx.serviceproxy.ServiceBinder;

/**
 * Traduire: false
 * Gen: false
 **/
@WebApiServiceGen
@ProxyGen
public interface C001L001ChoisirNomDomaineEnUSGenApiService {
	// Une méthode d'usine pour créer une instance et un proxy. 
	static void enregistrerService(SiteContexteEnUS siteContexte, Vertx vertx) {
		new ServiceBinder(vertx).setAddress("enUSC001L001ChoisirNomDomaine").register(C001L001ChoisirNomDomaineEnUSGenApiService.class, new C001L001ChoisirNomDomaineEnUSApiServiceImpl(siteContexte));
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L001ChoisirNomDomaineEnUSGenApiService creer(SiteContexteEnUS siteContexte, Vertx vertx) {
		return new C001L001ChoisirNomDomaineEnUSApiServiceImpl(siteContexte);
	}

	// Une méthode d'usine pour créer une instance et un proxy. 
	static C001L001ChoisirNomDomaineEnUSGenApiService creerProxy(Vertx vertx, String addresse) {
		return new C001L001ChoisirNomDomaineEnUSGenApiServiceVertxEBProxy(vertx, addresse);
	}

	public void rechercheenuspageC001L001ChoisirNomDomaineId(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
	public void rechercheenuspageC001L001ChoisirNomDomaine(OperationRequest operationRequete, Handler<AsyncResult<OperationResponse>> gestionnaireEvenements);
}
