package org.computate.site.frFR.contexte;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import io.opentracing.Tracer;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import io.vertx.core.Vertx;
import io.vertx.ext.web.handler.OAuth2AuthHandler;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import io.vertx.core.WorkerExecutor;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import io.opentracing.contrib.vertx.ext.web.TracingHandler;
import java.lang.Object;
import io.vertx.ext.web.api.contract.openapi3.OpenAPI3RouterFactory;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.oauth2.OAuth2Auth;
import java.lang.String;
import io.vertx.ext.sql.SQLClient;
import org.computate.site.frFR.config.ConfigSite;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class SiteContexteFrFRGen<DEV> extends Object {

	///////////
	// vertx //
	///////////

	/**	L'entité « vertx »
	 *	 is defined as null before being initialized. 
	 */
	protected Vertx vertx;
	public Couverture<Vertx> vertxCouverture = new Couverture<Vertx>().p(this).c(Vertx.class).var("vertx").o(vertx);

	/**	<br/>L'entité « vertx »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:vertx">Trouver l'entité vertx dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _vertx(Couverture<Vertx> c);

	public Vertx getVertx() {
		return vertx;
	}

	public void setVertx(Vertx vertx) {
		this.vertx = vertx;
		this.vertxCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR vertxInit() {
		if(!vertxCouverture.dejaInitialise) {
			_vertx(vertxCouverture);
			if(vertx == null)
				setVertx(vertxCouverture.o);
		}
		vertxCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	//////////////////
	// usineRouteur //
	//////////////////

	/**	L'entité « usineRouteur »
	 *	 is defined as null before being initialized. 
	 */
	protected OpenAPI3RouterFactory usineRouteur;
	public Couverture<OpenAPI3RouterFactory> usineRouteurCouverture = new Couverture<OpenAPI3RouterFactory>().p(this).c(OpenAPI3RouterFactory.class).var("usineRouteur").o(usineRouteur);

	/**	<br/>L'entité « usineRouteur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:usineRouteur">Trouver l'entité usineRouteur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _usineRouteur(Couverture<OpenAPI3RouterFactory> c);

	public OpenAPI3RouterFactory getUsineRouteur() {
		return usineRouteur;
	}

	public void setUsineRouteur(OpenAPI3RouterFactory usineRouteur) {
		this.usineRouteur = usineRouteur;
		this.usineRouteurCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR usineRouteurInit() {
		if(!usineRouteurCouverture.dejaInitialise) {
			_usineRouteur(usineRouteurCouverture);
			if(usineRouteur == null)
				setUsineRouteur(usineRouteurCouverture.o);
		}
		usineRouteurCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	//////////////////////
	// gestionnaireAuth //
	//////////////////////

	/**	L'entité « gestionnaireAuth »
	 *	 is defined as null before being initialized. 
	 */
	protected OAuth2AuthHandler gestionnaireAuth;
	public Couverture<OAuth2AuthHandler> gestionnaireAuthCouverture = new Couverture<OAuth2AuthHandler>().p(this).c(OAuth2AuthHandler.class).var("gestionnaireAuth").o(gestionnaireAuth);

	/**	<br/>L'entité « gestionnaireAuth »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:gestionnaireAuth">Trouver l'entité gestionnaireAuth dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _gestionnaireAuth(Couverture<OAuth2AuthHandler> c);

	public OAuth2AuthHandler getGestionnaireAuth() {
		return gestionnaireAuth;
	}

	public void setGestionnaireAuth(OAuth2AuthHandler gestionnaireAuth) {
		this.gestionnaireAuth = gestionnaireAuth;
		this.gestionnaireAuthCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR gestionnaireAuthInit() {
		if(!gestionnaireAuthCouverture.dejaInitialise) {
			_gestionnaireAuth(gestionnaireAuthCouverture);
			if(gestionnaireAuth == null)
				setGestionnaireAuth(gestionnaireAuthCouverture.o);
		}
		gestionnaireAuthCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	/////////////////////
	// authFournisseur //
	/////////////////////

	/**	L'entité « authFournisseur »
	 *	 is defined as null before being initialized. 
	 */
	protected OAuth2Auth authFournisseur;
	public Couverture<OAuth2Auth> authFournisseurCouverture = new Couverture<OAuth2Auth>().p(this).c(OAuth2Auth.class).var("authFournisseur").o(authFournisseur);

	/**	<br/>L'entité « authFournisseur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:authFournisseur">Trouver l'entité authFournisseur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _authFournisseur(Couverture<OAuth2Auth> c);

	public OAuth2Auth getAuthFournisseur() {
		return authFournisseur;
	}

	public void setAuthFournisseur(OAuth2Auth authFournisseur) {
		this.authFournisseur = authFournisseur;
		this.authFournisseurCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR authFournisseurInit() {
		if(!authFournisseurCouverture.dejaInitialise) {
			_authFournisseur(authFournisseurCouverture);
			if(authFournisseur == null)
				setAuthFournisseur(authFournisseurCouverture.o);
		}
		authFournisseurCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	//////////////////////////
	// executeurTravailleur //
	//////////////////////////

	/**	L'entité « executeurTravailleur »
	 *	 is defined as null before being initialized. 
	 */
	protected WorkerExecutor executeurTravailleur;
	public Couverture<WorkerExecutor> executeurTravailleurCouverture = new Couverture<WorkerExecutor>().p(this).c(WorkerExecutor.class).var("executeurTravailleur").o(executeurTravailleur);

	/**	<br/>L'entité « executeurTravailleur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:executeurTravailleur">Trouver l'entité executeurTravailleur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _executeurTravailleur(Couverture<WorkerExecutor> c);

	public WorkerExecutor getExecuteurTravailleur() {
		return executeurTravailleur;
	}

	public void setExecuteurTravailleur(WorkerExecutor executeurTravailleur) {
		this.executeurTravailleur = executeurTravailleur;
		this.executeurTravailleurCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR executeurTravailleurInit() {
		if(!executeurTravailleurCouverture.dejaInitialise) {
			_executeurTravailleur(executeurTravailleurCouverture);
			if(executeurTravailleur == null)
				setExecuteurTravailleur(executeurTravailleurCouverture.o);
		}
		executeurTravailleurCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	////////////////
	// configSite //
	////////////////

	/**	L'entité « configSite »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut ConfigSite(). 
	 */
	protected ConfigSite configSite = new ConfigSite();
	public Couverture<ConfigSite> configSiteCouverture = new Couverture<ConfigSite>().p(this).c(ConfigSite.class).var("configSite").o(configSite);

	/**	<br/>L'entité « configSite »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut ConfigSite(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:configSite">Trouver l'entité configSite dans Solr</a>
	 * <br/>
	 * @param configSite est l'entité déjà construit. 
	 **/
	protected abstract void _configSite(ConfigSite o);

	public ConfigSite getConfigSite() {
		return configSite;
	}

	public void setConfigSite(ConfigSite configSite) {
		this.configSite = configSite;
		this.configSiteCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR configSiteInit() {
		if(!configSiteCouverture.dejaInitialise) {
			_configSite(configSite);
		}
		configSite.initLoinPourClasse(requeteSite_);
		configSiteCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	////////////////
	// jdbcConfig //
	////////////////

	/**	L'entité « jdbcConfig »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut JsonObject(). 
	 */
	protected JsonObject jdbcConfig = new JsonObject();
	public Couverture<JsonObject> jdbcConfigCouverture = new Couverture<JsonObject>().p(this).c(JsonObject.class).var("jdbcConfig").o(jdbcConfig);

	/**	<br/>L'entité « jdbcConfig »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut JsonObject(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:jdbcConfig">Trouver l'entité jdbcConfig dans Solr</a>
	 * <br/>
	 * @param jdbcConfig est l'entité déjà construit. 
	 **/
	protected abstract void _jdbcConfig(JsonObject o);

	public JsonObject getJdbcConfig() {
		return jdbcConfig;
	}

	public void setJdbcConfig(JsonObject jdbcConfig) {
		this.jdbcConfig = jdbcConfig;
		this.jdbcConfigCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR jdbcConfigInit() {
		if(!jdbcConfigCouverture.dejaInitialise) {
			_jdbcConfig(jdbcConfig);
		}
		jdbcConfigCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	///////////////
	// clientSql //
	///////////////

	/**	L'entité « clientSql »
	 *	 is defined as null before being initialized. 
	 */
	protected SQLClient clientSql;
	public Couverture<SQLClient> clientSqlCouverture = new Couverture<SQLClient>().p(this).c(SQLClient.class).var("clientSql").o(clientSql);

	/**	<br/>L'entité « clientSql »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:clientSql">Trouver l'entité clientSql dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _clientSql(Couverture<SQLClient> c);

	public SQLClient getClientSql() {
		return clientSql;
	}

	public void setClientSql(SQLClient clientSql) {
		this.clientSql = clientSql;
		this.clientSqlCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR clientSqlInit() {
		if(!clientSqlCouverture.dejaInitialise) {
			_clientSql(clientSqlCouverture);
			if(clientSql == null)
				setClientSql(clientSqlCouverture.o);
		}
		clientSqlCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	////////////////
	// clientSolr //
	////////////////

	/**	L'entité « clientSolr »
	 *	 is defined as null before being initialized. 
	 */
	protected HttpSolrClient clientSolr;
	public Couverture<HttpSolrClient> clientSolrCouverture = new Couverture<HttpSolrClient>().p(this).c(HttpSolrClient.class).var("clientSolr").o(clientSolr);

	/**	<br/>L'entité « clientSolr »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:clientSolr">Trouver l'entité clientSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _clientSolr(Couverture<HttpSolrClient> c);

	public HttpSolrClient getClientSolr() {
		return clientSolr;
	}

	public void setClientSolr(HttpSolrClient clientSolr) {
		this.clientSolr = clientSolr;
		this.clientSolrCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR clientSolrInit() {
		if(!clientSolrCouverture.dejaInitialise) {
			_clientSolr(clientSolrCouverture);
			if(clientSolr == null)
				setClientSolr(clientSolrCouverture.o);
		}
		clientSolrCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	/////////////////////////
	// clientSolrComputate //
	/////////////////////////

	/**	L'entité « clientSolrComputate »
	 *	 is defined as null before being initialized. 
	 */
	protected HttpSolrClient clientSolrComputate;
	public Couverture<HttpSolrClient> clientSolrComputateCouverture = new Couverture<HttpSolrClient>().p(this).c(HttpSolrClient.class).var("clientSolrComputate").o(clientSolrComputate);

	/**	<br/>L'entité « clientSolrComputate »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:clientSolrComputate">Trouver l'entité clientSolrComputate dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _clientSolrComputate(Couverture<HttpSolrClient> c);

	public HttpSolrClient getClientSolrComputate() {
		return clientSolrComputate;
	}

	public void setClientSolrComputate(HttpSolrClient clientSolrComputate) {
		this.clientSolrComputate = clientSolrComputate;
		this.clientSolrComputateCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR clientSolrComputateInit() {
		if(!clientSolrComputateCouverture.dejaInitialise) {
			_clientSolrComputate(clientSolrComputateCouverture);
			if(clientSolrComputate == null)
				setClientSolrComputate(clientSolrComputateCouverture.o);
		}
		clientSolrComputateCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	////////////////
	// siteTracer //
	////////////////

	/**	L'entité « siteTracer »
	 *	 is defined as null before being initialized. 
	 */
	protected Tracer siteTracer;
	public Couverture<Tracer> siteTracerCouverture = new Couverture<Tracer>().p(this).c(Tracer.class).var("siteTracer").o(siteTracer);

	/**	<br/>L'entité « siteTracer »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:siteTracer">Trouver l'entité siteTracer dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _siteTracer(Couverture<Tracer> c);

	public Tracer getSiteTracer() {
		return siteTracer;
	}

	public void setSiteTracer(Tracer siteTracer) {
		this.siteTracer = siteTracer;
		this.siteTracerCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR siteTracerInit() {
		if(!siteTracerCouverture.dejaInitialise) {
			_siteTracer(siteTracerCouverture);
			if(siteTracer == null)
				setSiteTracer(siteTracerCouverture.o);
		}
		siteTracerCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	////////////////////////
	// siteTracingHandler //
	////////////////////////

	/**	L'entité « siteTracingHandler »
	 *	 is defined as null before being initialized. 
	 */
	protected TracingHandler siteTracingHandler;
	public Couverture<TracingHandler> siteTracingHandlerCouverture = new Couverture<TracingHandler>().p(this).c(TracingHandler.class).var("siteTracingHandler").o(siteTracingHandler);

	/**	<br/>L'entité « siteTracingHandler »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:siteTracingHandler">Trouver l'entité siteTracingHandler dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _siteTracingHandler(Couverture<TracingHandler> c);

	public TracingHandler getSiteTracingHandler() {
		return siteTracingHandler;
	}

	public void setSiteTracingHandler(TracingHandler siteTracingHandler) {
		this.siteTracingHandler = siteTracingHandler;
		this.siteTracingHandlerCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR siteTracingHandlerInit() {
		if(!siteTracingHandlerCouverture.dejaInitialise) {
			_siteTracingHandler(siteTracingHandlerCouverture);
			if(siteTracingHandler == null)
				setSiteTracingHandler(siteTracingHandlerCouverture.o);
		}
		siteTracingHandlerCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	///////////////////////
	// clientSolrTracing //
	///////////////////////

	/**	L'entité « clientSolrTracing »
	 *	 is defined as null before being initialized. 
	 */
	protected HttpSolrClient clientSolrTracing;
	public Couverture<HttpSolrClient> clientSolrTracingCouverture = new Couverture<HttpSolrClient>().p(this).c(HttpSolrClient.class).var("clientSolrTracing").o(clientSolrTracing);

	/**	<br/>L'entité « clientSolrTracing »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:clientSolrTracing">Trouver l'entité clientSolrTracing dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _clientSolrTracing(Couverture<HttpSolrClient> c);

	public HttpSolrClient getClientSolrTracing() {
		return clientSolrTracing;
	}

	public void setClientSolrTracing(HttpSolrClient clientSolrTracing) {
		this.clientSolrTracing = clientSolrTracing;
		this.clientSolrTracingCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR clientSolrTracingInit() {
		if(!clientSolrTracingCouverture.dejaInitialise) {
			_clientSolrTracing(clientSolrTracingCouverture);
			if(clientSolrTracing == null)
				setClientSolrTracing(clientSolrTracingCouverture.o);
		}
		clientSolrTracingCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	/////////////////
	// selCryptage //
	/////////////////

	/**	L'entité « selCryptage »
	 *	 is defined as null before being initialized. 
	 */
	protected String selCryptage;
	public Couverture<String> selCryptageCouverture = new Couverture<String>().p(this).c(String.class).var("selCryptage").o(selCryptage);

	/**	<br/>L'entité « selCryptage »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:selCryptage">Trouver l'entité selCryptage dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _selCryptage(Couverture<String> c);

	public String getSelCryptage() {
		return selCryptage;
	}

	public void setSelCryptage(String selCryptage) {
		this.selCryptage = selCryptage;
		this.selCryptageCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR selCryptageInit() {
		if(!selCryptageCouverture.dejaInitialise) {
			_selCryptage(selCryptageCouverture);
			if(selCryptage == null)
				setSelCryptage(selCryptageCouverture.o);
		}
		selCryptageCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	public String solrSelCryptage() {
		return selCryptage;
	}

	public String strSelCryptage() {
		return selCryptage == null ? "" : selCryptage;
	}

	public String nomAffichageSelCryptage() {
		return null;
	}

	public String htmTooltipSelCryptage() {
		return null;
	}

	public String htmSelCryptage() {
		return selCryptage == null ? "" : StringEscapeUtils.escapeHtml4(strSelCryptage());
	}

	////////////////////////
	// motDePasseCryptage //
	////////////////////////

	/**	L'entité « motDePasseCryptage »
	 *	 is defined as null before being initialized. 
	 */
	protected String motDePasseCryptage;
	public Couverture<String> motDePasseCryptageCouverture = new Couverture<String>().p(this).c(String.class).var("motDePasseCryptage").o(motDePasseCryptage);

	/**	<br/>L'entité « motDePasseCryptage »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:motDePasseCryptage">Trouver l'entité motDePasseCryptage dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _motDePasseCryptage(Couverture<String> c);

	public String getMotDePasseCryptage() {
		return motDePasseCryptage;
	}

	public void setMotDePasseCryptage(String motDePasseCryptage) {
		this.motDePasseCryptage = motDePasseCryptage;
		this.motDePasseCryptageCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR motDePasseCryptageInit() {
		if(!motDePasseCryptageCouverture.dejaInitialise) {
			_motDePasseCryptage(motDePasseCryptageCouverture);
			if(motDePasseCryptage == null)
				setMotDePasseCryptage(motDePasseCryptageCouverture.o);
		}
		motDePasseCryptageCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	public String solrMotDePasseCryptage() {
		return motDePasseCryptage;
	}

	public String strMotDePasseCryptage() {
		return motDePasseCryptage == null ? "" : motDePasseCryptage;
	}

	public String nomAffichageMotDePasseCryptage() {
		return null;
	}

	public String htmTooltipMotDePasseCryptage() {
		return null;
	}

	public String htmMotDePasseCryptage() {
		return motDePasseCryptage == null ? "" : StringEscapeUtils.escapeHtml4(strMotDePasseCryptage());
	}

	/////////////////////////
	// jetonIdentitePaypal //
	/////////////////////////

	/**	L'entité « jetonIdentitePaypal »
	 *	 is defined as null before being initialized. 
	 */
	protected String jetonIdentitePaypal;
	public Couverture<String> jetonIdentitePaypalCouverture = new Couverture<String>().p(this).c(String.class).var("jetonIdentitePaypal").o(jetonIdentitePaypal);

	/**	<br/>L'entité « jetonIdentitePaypal »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:jetonIdentitePaypal">Trouver l'entité jetonIdentitePaypal dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _jetonIdentitePaypal(Couverture<String> c);

	public String getJetonIdentitePaypal() {
		return jetonIdentitePaypal;
	}

	public void setJetonIdentitePaypal(String jetonIdentitePaypal) {
		this.jetonIdentitePaypal = jetonIdentitePaypal;
		this.jetonIdentitePaypalCouverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR jetonIdentitePaypalInit() {
		if(!jetonIdentitePaypalCouverture.dejaInitialise) {
			_jetonIdentitePaypal(jetonIdentitePaypalCouverture);
			if(jetonIdentitePaypal == null)
				setJetonIdentitePaypal(jetonIdentitePaypalCouverture.o);
		}
		jetonIdentitePaypalCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	public String solrJetonIdentitePaypal() {
		return jetonIdentitePaypal;
	}

	public String strJetonIdentitePaypal() {
		return jetonIdentitePaypal == null ? "" : jetonIdentitePaypal;
	}

	public String nomAffichageJetonIdentitePaypal() {
		return null;
	}

	public String htmTooltipJetonIdentitePaypal() {
		return null;
	}

	public String htmJetonIdentitePaypal() {
		return jetonIdentitePaypal == null ? "" : StringEscapeUtils.escapeHtml4(strJetonIdentitePaypal());
	}

	//////////////////////
	// nombreExecuteurs //
	//////////////////////

	/**	L'entité « nombreExecuteurs »
	 *	 is defined as null before being initialized. 
	 */
	protected Integer nombreExecuteurs;
	public Couverture<Integer> nombreExecuteursCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("nombreExecuteurs").o(nombreExecuteurs);

	/**	<br/>L'entité « nombreExecuteurs »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:nombreExecuteurs">Trouver l'entité nombreExecuteurs dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _nombreExecuteurs(Couverture<Integer> c);

	public Integer getNombreExecuteurs() {
		return nombreExecuteurs;
	}

	public void setNombreExecuteurs(Integer nombreExecuteurs) {
		this.nombreExecuteurs = nombreExecuteurs;
		this.nombreExecuteursCouverture.dejaInitialise = true;
	}
	public SiteContexteFrFR setNombreExecuteurs(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.nombreExecuteurs = Integer.parseInt(o);
		this.nombreExecuteursCouverture.dejaInitialise = true;
		return (SiteContexteFrFR)this;
	}
	protected SiteContexteFrFR nombreExecuteursInit() {
		if(!nombreExecuteursCouverture.dejaInitialise) {
			_nombreExecuteurs(nombreExecuteursCouverture);
			if(nombreExecuteurs == null)
				setNombreExecuteurs(nombreExecuteursCouverture.o);
		}
		nombreExecuteursCouverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	public Integer solrNombreExecuteurs() {
		return nombreExecuteurs;
	}

	public String strNombreExecuteurs() {
		return nombreExecuteurs == null ? "" : nombreExecuteurs.toString();
	}

	public String nomAffichageNombreExecuteurs() {
		return null;
	}

	public String htmTooltipNombreExecuteurs() {
		return null;
	}

	public String htmNombreExecuteurs() {
		return nombreExecuteurs == null ? "" : StringEscapeUtils.escapeHtml4(strNombreExecuteurs());
	}

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	L'entité « requeteSite_ »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut RequeteSiteFrFR(). 
	 */
	protected RequeteSiteFrFR requeteSite_ = new RequeteSiteFrFR();
	public Couverture<RequeteSiteFrFR> requeteSite_Couverture = new Couverture<RequeteSiteFrFR>().p(this).c(RequeteSiteFrFR.class).var("requeteSite_").o(requeteSite_);

	/**	<br/>L'entité « requeteSite_ »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut RequeteSiteFrFR(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.contexte.SiteContexteFrFR&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
	 * <br/>
	 * @param requeteSite_ est l'entité déjà construit. 
	 **/
	protected abstract void _requeteSite_(RequeteSiteFrFR o);

	public RequeteSiteFrFR getRequeteSite_() {
		return requeteSite_;
	}

	public void setRequeteSite_(RequeteSiteFrFR requeteSite_) {
		this.requeteSite_ = requeteSite_;
		this.requeteSite_Couverture.dejaInitialise = true;
	}
	protected SiteContexteFrFR requeteSite_Init() {
		if(!requeteSite_Couverture.dejaInitialise) {
			_requeteSite_(requeteSite_);
		}
		requeteSite_Couverture.dejaInitialise(true);
		return (SiteContexteFrFR)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseSiteContexteFrFR = false;

	public SiteContexteFrFR initLoinSiteContexteFrFR(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseSiteContexteFrFR) {
			dejaInitialiseSiteContexteFrFR = true;
			initLoinSiteContexteFrFR();
		}
		return (SiteContexteFrFR)this;
	}

	public void initLoinSiteContexteFrFR() {
		initSiteContexteFrFR();
	}

	public void initSiteContexteFrFR() {
		vertxInit();
		usineRouteurInit();
		gestionnaireAuthInit();
		authFournisseurInit();
		executeurTravailleurInit();
		configSiteInit();
		jdbcConfigInit();
		clientSqlInit();
		clientSolrInit();
		clientSolrComputateInit();
		siteTracerInit();
		siteTracingHandlerInit();
		clientSolrTracingInit();
		selCryptageInit();
		motDePasseCryptageInit();
		jetonIdentitePaypalInit();
		nombreExecuteursInit();
		requeteSite_Init();
	}

	public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinSiteContexteFrFR(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteSiteContexteFrFR(RequeteSiteFrFR requeteSite_) {
		if(configSite != null)
			configSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteSiteContexteFrFR(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirSiteContexteFrFR(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirSiteContexteFrFR(String var) {
		SiteContexteFrFR oSiteContexteFrFR = (SiteContexteFrFR)this;
		switch(var) {
			case "vertx":
				return oSiteContexteFrFR.vertx;
			case "usineRouteur":
				return oSiteContexteFrFR.usineRouteur;
			case "gestionnaireAuth":
				return oSiteContexteFrFR.gestionnaireAuth;
			case "authFournisseur":
				return oSiteContexteFrFR.authFournisseur;
			case "executeurTravailleur":
				return oSiteContexteFrFR.executeurTravailleur;
			case "configSite":
				return oSiteContexteFrFR.configSite;
			case "jdbcConfig":
				return oSiteContexteFrFR.jdbcConfig;
			case "clientSql":
				return oSiteContexteFrFR.clientSql;
			case "clientSolr":
				return oSiteContexteFrFR.clientSolr;
			case "clientSolrComputate":
				return oSiteContexteFrFR.clientSolrComputate;
			case "siteTracer":
				return oSiteContexteFrFR.siteTracer;
			case "siteTracingHandler":
				return oSiteContexteFrFR.siteTracingHandler;
			case "clientSolrTracing":
				return oSiteContexteFrFR.clientSolrTracing;
			case "selCryptage":
				return oSiteContexteFrFR.selCryptage;
			case "motDePasseCryptage":
				return oSiteContexteFrFR.motDePasseCryptage;
			case "jetonIdentitePaypal":
				return oSiteContexteFrFR.jetonIdentitePaypal;
			case "nombreExecuteurs":
				return oSiteContexteFrFR.nombreExecuteurs;
			case "requeteSite_":
				return oSiteContexteFrFR.requeteSite_;
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerSiteContexteFrFR(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerSiteContexteFrFR(String var, Object val) {
		SiteContexteFrFR oSiteContexteFrFR = (SiteContexteFrFR)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirSiteContexteFrFR(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirSiteContexteFrFR(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash();
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof SiteContexteFrFR))
			return false;
		SiteContexteFrFR that = (SiteContexteFrFR)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("SiteContexteFrFR {");
		sb.append(" }");
		return sb.toString();
	}
}
