package org.computate.site.frFR.cours.c001.l009;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.frFR.cours.c001.l009.C001L009InstallerKeycloak;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerKeycloakFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerKeycloakFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	///////////////////////////////
	// c001L009InstallerKeycloak //
	///////////////////////////////

	/**	L'entité « c001L009InstallerKeycloak »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L009InstallerKeycloak c001L009InstallerKeycloak;
	public Couverture<C001L009InstallerKeycloak> c001L009InstallerKeycloakCouverture = new Couverture<C001L009InstallerKeycloak>().p(this).c(C001L009InstallerKeycloak.class).var("c001L009InstallerKeycloak").o(c001L009InstallerKeycloak);

	/**	<br/>L'entité « c001L009InstallerKeycloak »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerKeycloakFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L009InstallerKeycloak">Trouver l'entité c001L009InstallerKeycloak dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L009InstallerKeycloak(Couverture<C001L009InstallerKeycloak> c);

	public C001L009InstallerKeycloak getC001L009InstallerKeycloak() {
		return c001L009InstallerKeycloak;
	}

	public void setC001L009InstallerKeycloak(C001L009InstallerKeycloak c001L009InstallerKeycloak) {
		this.c001L009InstallerKeycloak = c001L009InstallerKeycloak;
		this.c001L009InstallerKeycloakCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerKeycloakFrFRGenPage c001L009InstallerKeycloakInit() {
		if(!c001L009InstallerKeycloakCouverture.dejaInitialise) {
			_c001L009InstallerKeycloak(c001L009InstallerKeycloakCouverture);
			if(c001L009InstallerKeycloak == null)
				setC001L009InstallerKeycloak(c001L009InstallerKeycloakCouverture.o);
		}
		if(c001L009InstallerKeycloak != null)
			c001L009InstallerKeycloak.initLoinPourClasse(requeteSite_);
		c001L009InstallerKeycloakCouverture.dejaInitialise(true);
		return (C001L009InstallerKeycloakFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerKeycloakFrFRGenPage = false;

	public C001L009InstallerKeycloakFrFRGenPage initLoinC001L009InstallerKeycloakFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerKeycloakFrFRGenPage) {
			dejaInitialiseC001L009InstallerKeycloakFrFRGenPage = true;
			initLoinC001L009InstallerKeycloakFrFRGenPage();
		}
		return (C001L009InstallerKeycloakFrFRGenPage)this;
	}

	public void initLoinC001L009InstallerKeycloakFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L009InstallerKeycloakFrFRGenPage();
	}

	public void initC001L009InstallerKeycloakFrFRGenPage() {
		c001L009InstallerKeycloakInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L009InstallerKeycloakFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerKeycloakFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L009InstallerKeycloak != null)
			c001L009InstallerKeycloak.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L009InstallerKeycloakFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerKeycloakFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerKeycloakFrFRGenPage(String var) {
		C001L009InstallerKeycloakFrFRGenPage oC001L009InstallerKeycloakFrFRGenPage = (C001L009InstallerKeycloakFrFRGenPage)this;
		switch(var) {
			case "c001L009InstallerKeycloak":
				return oC001L009InstallerKeycloakFrFRGenPage.c001L009InstallerKeycloak;
			default:
				return super.obtenirC001LeconFrFRPage(var);
		}
	}

	///////////////
	// attribuer //
	///////////////

	@Override public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerC001L009InstallerKeycloakFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerKeycloakFrFRGenPage(String var, Object val) {
		C001L009InstallerKeycloakFrFRGenPage oC001L009InstallerKeycloakFrFRGenPage = (C001L009InstallerKeycloakFrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconFrFRPage(var, val);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirC001L009InstallerKeycloakFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerKeycloakFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerKeycloakFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerKeycloakFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerKeycloakFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerKeycloakFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerKeycloakFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerKeycloakFrFRGenPage() {
		if(c001L009InstallerKeycloak != null)
			c001L009InstallerKeycloak.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerKeycloakFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerKeycloakFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L009InstallerKeycloakFrFRGenPage();
		super.html();
	}

	public void htmlC001L009InstallerKeycloakFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L009InstallerKeycloakFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L009InstallerKeycloakFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L009InstallerKeycloakFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L009InstallerKeycloakFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L009InstallerKeycloakFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L009InstallerKeycloakFrFRGenPage() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof C001L009InstallerKeycloakFrFRGenPage))
			return false;
		C001L009InstallerKeycloakFrFRGenPage that = (C001L009InstallerKeycloakFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerKeycloakFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
