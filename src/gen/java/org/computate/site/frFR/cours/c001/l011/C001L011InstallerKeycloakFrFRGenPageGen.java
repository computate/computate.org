package org.computate.site.frFR.cours.c001.l011;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.cours.c001.l011.C001L011InstallerKeycloak;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l011.C001L011InstallerKeycloakFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L011InstallerKeycloakFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	///////////////////////////////
	// c001L011InstallerKeycloak //
	///////////////////////////////

	/**	L'entité « c001L011InstallerKeycloak »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L011InstallerKeycloak c001L011InstallerKeycloak;
	public Couverture<C001L011InstallerKeycloak> c001L011InstallerKeycloakCouverture = new Couverture<C001L011InstallerKeycloak>().p(this).c(C001L011InstallerKeycloak.class).var("c001L011InstallerKeycloak").o(c001L011InstallerKeycloak);

	/**	<br/>L'entité « c001L011InstallerKeycloak »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l011.C001L011InstallerKeycloakFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L011InstallerKeycloak">Trouver l'entité c001L011InstallerKeycloak dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L011InstallerKeycloak(Couverture<C001L011InstallerKeycloak> c);

	public C001L011InstallerKeycloak getC001L011InstallerKeycloak() {
		return c001L011InstallerKeycloak;
	}

	public void setC001L011InstallerKeycloak(C001L011InstallerKeycloak c001L011InstallerKeycloak) {
		this.c001L011InstallerKeycloak = c001L011InstallerKeycloak;
		this.c001L011InstallerKeycloakCouverture.dejaInitialise = true;
	}
	protected C001L011InstallerKeycloakFrFRGenPage c001L011InstallerKeycloakInit() {
		if(!c001L011InstallerKeycloakCouverture.dejaInitialise) {
			_c001L011InstallerKeycloak(c001L011InstallerKeycloakCouverture);
			if(c001L011InstallerKeycloak == null)
				setC001L011InstallerKeycloak(c001L011InstallerKeycloakCouverture.o);
		}
		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.initLoinPourClasse(requeteSite_);
		c001L011InstallerKeycloakCouverture.dejaInitialise(true);
		return (C001L011InstallerKeycloakFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L011InstallerKeycloakFrFRGenPage = false;

	public C001L011InstallerKeycloakFrFRGenPage initLoinC001L011InstallerKeycloakFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L011InstallerKeycloakFrFRGenPage) {
			dejaInitialiseC001L011InstallerKeycloakFrFRGenPage = true;
			initLoinC001L011InstallerKeycloakFrFRGenPage();
		}
		return (C001L011InstallerKeycloakFrFRGenPage)this;
	}

	public void initLoinC001L011InstallerKeycloakFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L011InstallerKeycloakFrFRGenPage();
	}

	public void initC001L011InstallerKeycloakFrFRGenPage() {
		c001L011InstallerKeycloakInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L011InstallerKeycloakFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L011InstallerKeycloakFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L011InstallerKeycloakFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L011InstallerKeycloakFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L011InstallerKeycloakFrFRGenPage(String var) {
		C001L011InstallerKeycloakFrFRGenPage oC001L011InstallerKeycloakFrFRGenPage = (C001L011InstallerKeycloakFrFRGenPage)this;
		switch(var) {
			case "c001L011InstallerKeycloak":
				return oC001L011InstallerKeycloakFrFRGenPage.c001L011InstallerKeycloak;
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
				o = attribuerC001L011InstallerKeycloakFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L011InstallerKeycloakFrFRGenPage(String var, Object val) {
		C001L011InstallerKeycloakFrFRGenPage oC001L011InstallerKeycloakFrFRGenPage = (C001L011InstallerKeycloakFrFRGenPage)this;
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
					o = definirC001L011InstallerKeycloakFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L011InstallerKeycloakFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L011InstallerKeycloakFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L011InstallerKeycloakFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L011InstallerKeycloakFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L011InstallerKeycloakFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L011InstallerKeycloakFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L011InstallerKeycloakFrFRGenPage() {
		if(c001L011InstallerKeycloak != null)
			c001L011InstallerKeycloak.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L011InstallerKeycloakFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L011InstallerKeycloakFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L011InstallerKeycloakFrFRGenPage();
		super.html();
	}

	public void htmlC001L011InstallerKeycloakFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L011InstallerKeycloakFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L011InstallerKeycloakFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L011InstallerKeycloakFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L011InstallerKeycloakFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L011InstallerKeycloakFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L011InstallerKeycloakFrFRGenPage() {
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
		if(!(o instanceof C001L011InstallerKeycloakFrFRGenPage))
			return false;
		C001L011InstallerKeycloakFrFRGenPage that = (C001L011InstallerKeycloakFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L011InstallerKeycloakFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
