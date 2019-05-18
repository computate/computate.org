package org.computate.site.enUS.cours.c001.l009;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloakEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerKeycloakEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloakEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L009InstallerKeycloak">Trouver l'entité c001L009InstallerKeycloak dans Solr</a>
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
	protected C001L009InstallerKeycloakEnUSGenPage c001L009InstallerKeycloakInit() {
		if(!c001L009InstallerKeycloakCouverture.dejaInitialise) {
			_c001L009InstallerKeycloak(c001L009InstallerKeycloakCouverture);
			if(c001L009InstallerKeycloak == null)
				setC001L009InstallerKeycloak(c001L009InstallerKeycloakCouverture.o);
		}
		if(c001L009InstallerKeycloak != null)
			c001L009InstallerKeycloak.initLoinPourClasse(requeteSite_);
		c001L009InstallerKeycloakCouverture.dejaInitialise(true);
		return (C001L009InstallerKeycloakEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerKeycloakEnUSGenPage = false;

	public C001L009InstallerKeycloakEnUSGenPage initLoinC001L009InstallerKeycloakEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerKeycloakEnUSGenPage) {
			dejaInitialiseC001L009InstallerKeycloakEnUSGenPage = true;
			initLoinC001L009InstallerKeycloakEnUSGenPage();
		}
		return (C001L009InstallerKeycloakEnUSGenPage)this;
	}

	public void initLoinC001L009InstallerKeycloakEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L009InstallerKeycloakEnUSGenPage();
	}

	public void initC001L009InstallerKeycloakEnUSGenPage() {
		c001L009InstallerKeycloakInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L009InstallerKeycloakEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerKeycloakEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		if(c001L009InstallerKeycloak != null)
			c001L009InstallerKeycloak.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L009InstallerKeycloakEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerKeycloakEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerKeycloakEnUSGenPage(String var) {
		C001L009InstallerKeycloakEnUSGenPage oC001L009InstallerKeycloakEnUSGenPage = (C001L009InstallerKeycloakEnUSGenPage)this;
		switch(var) {
			case "c001L009InstallerKeycloak":
				return oC001L009InstallerKeycloakEnUSGenPage.c001L009InstallerKeycloak;
			default:
				return super.obtenirC001LeconEnUSPage(var);
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
				o = attribuerC001L009InstallerKeycloakEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerKeycloakEnUSGenPage(String var, Object val) {
		C001L009InstallerKeycloakEnUSGenPage oC001L009InstallerKeycloakEnUSGenPage = (C001L009InstallerKeycloakEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconEnUSPage(var, val);
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
					o = definirC001L009InstallerKeycloakEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerKeycloakEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerKeycloakEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerKeycloakEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerKeycloakEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerKeycloakEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerKeycloakEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerKeycloakEnUSGenPage() {
		if(c001L009InstallerKeycloak != null)
			c001L009InstallerKeycloak.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerKeycloakEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerKeycloakEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L009InstallerKeycloakEnUSGenPage();
		super.html();
	}

	public void htmlC001L009InstallerKeycloakEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L009InstallerKeycloakEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L009InstallerKeycloakEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L009InstallerKeycloakEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L009InstallerKeycloakEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L009InstallerKeycloakEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L009InstallerKeycloakEnUSGenPage() {
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
		if(!(o instanceof C001L009InstallerKeycloakEnUSGenPage))
			return false;
		C001L009InstallerKeycloakEnUSGenPage that = (C001L009InstallerKeycloakEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerKeycloakEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
