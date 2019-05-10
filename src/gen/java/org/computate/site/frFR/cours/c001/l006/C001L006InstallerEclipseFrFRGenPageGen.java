package org.computate.site.frFR.cours.c001.l006;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipse;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipseFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L006InstallerEclipseFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	//////////////////////////////
	// c001L006InstallerEclipse //
	//////////////////////////////

	/**	L'entité « c001L006InstallerEclipse »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L006InstallerEclipse c001L006InstallerEclipse;
	public Couverture<C001L006InstallerEclipse> c001L006InstallerEclipseCouverture = new Couverture<C001L006InstallerEclipse>().p(this).c(C001L006InstallerEclipse.class).var("c001L006InstallerEclipse").o(c001L006InstallerEclipse);

	/**	<br/>L'entité « c001L006InstallerEclipse »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipseFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L006InstallerEclipse">Trouver l'entité c001L006InstallerEclipse dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L006InstallerEclipse(Couverture<C001L006InstallerEclipse> c);

	public C001L006InstallerEclipse getC001L006InstallerEclipse() {
		return c001L006InstallerEclipse;
	}

	public void setC001L006InstallerEclipse(C001L006InstallerEclipse c001L006InstallerEclipse) {
		this.c001L006InstallerEclipse = c001L006InstallerEclipse;
		this.c001L006InstallerEclipseCouverture.dejaInitialise = true;
	}
	protected C001L006InstallerEclipseFrFRGenPage c001L006InstallerEclipseInit() {
		if(!c001L006InstallerEclipseCouverture.dejaInitialise) {
			_c001L006InstallerEclipse(c001L006InstallerEclipseCouverture);
			if(c001L006InstallerEclipse == null)
				setC001L006InstallerEclipse(c001L006InstallerEclipseCouverture.o);
		}
		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.initLoinPourClasse(requeteSite_);
		c001L006InstallerEclipseCouverture.dejaInitialise(true);
		return (C001L006InstallerEclipseFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L006InstallerEclipseFrFRGenPage = false;

	public C001L006InstallerEclipseFrFRGenPage initLoinC001L006InstallerEclipseFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L006InstallerEclipseFrFRGenPage) {
			dejaInitialiseC001L006InstallerEclipseFrFRGenPage = true;
			initLoinC001L006InstallerEclipseFrFRGenPage();
		}
		return (C001L006InstallerEclipseFrFRGenPage)this;
	}

	public void initLoinC001L006InstallerEclipseFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L006InstallerEclipseFrFRGenPage();
	}

	public void initC001L006InstallerEclipseFrFRGenPage() {
		c001L006InstallerEclipseInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L006InstallerEclipseFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L006InstallerEclipseFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L006InstallerEclipseFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L006InstallerEclipseFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L006InstallerEclipseFrFRGenPage(String var) {
		C001L006InstallerEclipseFrFRGenPage oC001L006InstallerEclipseFrFRGenPage = (C001L006InstallerEclipseFrFRGenPage)this;
		switch(var) {
			case "c001L006InstallerEclipse":
				return oC001L006InstallerEclipseFrFRGenPage.c001L006InstallerEclipse;
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
				o = attribuerC001L006InstallerEclipseFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L006InstallerEclipseFrFRGenPage(String var, Object val) {
		C001L006InstallerEclipseFrFRGenPage oC001L006InstallerEclipseFrFRGenPage = (C001L006InstallerEclipseFrFRGenPage)this;
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
					o = definirC001L006InstallerEclipseFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L006InstallerEclipseFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L006InstallerEclipseFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L006InstallerEclipseFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L006InstallerEclipseFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L006InstallerEclipseFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L006InstallerEclipseFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L006InstallerEclipseFrFRGenPage() {
		if(c001L006InstallerEclipse != null)
			c001L006InstallerEclipse.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L006InstallerEclipseFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L006InstallerEclipseFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L006InstallerEclipseFrFRGenPage();
		super.html();
	}

	public void htmlC001L006InstallerEclipseFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L006InstallerEclipseFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L006InstallerEclipseFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L006InstallerEclipseFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L006InstallerEclipseFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L006InstallerEclipseFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L006InstallerEclipseFrFRGenPage() {
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
		if(!(o instanceof C001L006InstallerEclipseFrFRGenPage))
			return false;
		C001L006InstallerEclipseFrFRGenPage that = (C001L006InstallerEclipseFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L006InstallerEclipseFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
