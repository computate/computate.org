package org.computate.site.frFR.cours.c001.l010;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolr;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolrFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L010InstallerSolrFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	///////////////////////////
	// c001L010InstallerSolr //
	///////////////////////////

	/**	L'entité « c001L010InstallerSolr »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L010InstallerSolr c001L010InstallerSolr;
	public Couverture<C001L010InstallerSolr> c001L010InstallerSolrCouverture = new Couverture<C001L010InstallerSolr>().p(this).c(C001L010InstallerSolr.class).var("c001L010InstallerSolr").o(c001L010InstallerSolr);

	/**	<br/>L'entité « c001L010InstallerSolr »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolrFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L010InstallerSolr">Trouver l'entité c001L010InstallerSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L010InstallerSolr(Couverture<C001L010InstallerSolr> c);

	public C001L010InstallerSolr getC001L010InstallerSolr() {
		return c001L010InstallerSolr;
	}

	public void setC001L010InstallerSolr(C001L010InstallerSolr c001L010InstallerSolr) {
		this.c001L010InstallerSolr = c001L010InstallerSolr;
		this.c001L010InstallerSolrCouverture.dejaInitialise = true;
	}
	protected C001L010InstallerSolrFrFRGenPage c001L010InstallerSolrInit() {
		if(!c001L010InstallerSolrCouverture.dejaInitialise) {
			_c001L010InstallerSolr(c001L010InstallerSolrCouverture);
			if(c001L010InstallerSolr == null)
				setC001L010InstallerSolr(c001L010InstallerSolrCouverture.o);
		}
		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.initLoinPourClasse(requeteSite_);
		c001L010InstallerSolrCouverture.dejaInitialise(true);
		return (C001L010InstallerSolrFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L010InstallerSolrFrFRGenPage = false;

	public C001L010InstallerSolrFrFRGenPage initLoinC001L010InstallerSolrFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L010InstallerSolrFrFRGenPage) {
			dejaInitialiseC001L010InstallerSolrFrFRGenPage = true;
			initLoinC001L010InstallerSolrFrFRGenPage();
		}
		return (C001L010InstallerSolrFrFRGenPage)this;
	}

	public void initLoinC001L010InstallerSolrFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L010InstallerSolrFrFRGenPage();
	}

	public void initC001L010InstallerSolrFrFRGenPage() {
		c001L010InstallerSolrInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L010InstallerSolrFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L010InstallerSolrFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L010InstallerSolrFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L010InstallerSolrFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L010InstallerSolrFrFRGenPage(String var) {
		C001L010InstallerSolrFrFRGenPage oC001L010InstallerSolrFrFRGenPage = (C001L010InstallerSolrFrFRGenPage)this;
		switch(var) {
			case "c001L010InstallerSolr":
				return oC001L010InstallerSolrFrFRGenPage.c001L010InstallerSolr;
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
				o = attribuerC001L010InstallerSolrFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L010InstallerSolrFrFRGenPage(String var, Object val) {
		C001L010InstallerSolrFrFRGenPage oC001L010InstallerSolrFrFRGenPage = (C001L010InstallerSolrFrFRGenPage)this;
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
					o = definirC001L010InstallerSolrFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L010InstallerSolrFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L010InstallerSolrFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L010InstallerSolrFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L010InstallerSolrFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L010InstallerSolrFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L010InstallerSolrFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L010InstallerSolrFrFRGenPage() {
		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L010InstallerSolrFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L010InstallerSolrFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L010InstallerSolrFrFRGenPage();
		super.html();
	}

	public void htmlC001L010InstallerSolrFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L010InstallerSolrFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L010InstallerSolrFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L010InstallerSolrFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L010InstallerSolrFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L010InstallerSolrFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L010InstallerSolrFrFRGenPage() {
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
		if(!(o instanceof C001L010InstallerSolrFrFRGenPage))
			return false;
		C001L010InstallerSolrFrFRGenPage that = (C001L010InstallerSolrFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L010InstallerSolrFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
