package org.computate.site.frFR.cours.c001.l010;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolrFrFRGenPage;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l010.C001L010InstallerSolrFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L010InstallerSolrFrFRPageGen<DEV> extends C001L010InstallerSolrFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L010InstallerSolrFrFRPage = false;

	public C001L010InstallerSolrFrFRPage initLoinC001L010InstallerSolrFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L010InstallerSolrFrFRPage) {
			dejaInitialiseC001L010InstallerSolrFrFRPage = true;
			initLoinC001L010InstallerSolrFrFRPage();
		}
		return (C001L010InstallerSolrFrFRPage)this;
	}

	public void initLoinC001L010InstallerSolrFrFRPage() {
		super.initLoinC001L010InstallerSolrFrFRGenPage(requeteSite_);
		initC001L010InstallerSolrFrFRPage();
	}

	public void initC001L010InstallerSolrFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L010InstallerSolrFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L010InstallerSolrFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L010InstallerSolrFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L010InstallerSolrFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L010InstallerSolrFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L010InstallerSolrFrFRPage(String var) {
		C001L010InstallerSolrFrFRPage oC001L010InstallerSolrFrFRPage = (C001L010InstallerSolrFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L010InstallerSolrFrFRGenPage(var);
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
				o = attribuerC001L010InstallerSolrFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L010InstallerSolrFrFRPage(String var, Object val) {
		C001L010InstallerSolrFrFRPage oC001L010InstallerSolrFrFRPage = (C001L010InstallerSolrFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L010InstallerSolrFrFRGenPage(var, val);
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
					o = definirC001L010InstallerSolrFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L010InstallerSolrFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L010InstallerSolrFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L010InstallerSolrFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L010InstallerSolrFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L010InstallerSolrFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L010InstallerSolrFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L010InstallerSolrFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L010InstallerSolrFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L010InstallerSolrFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptC001L010InstallerSolrFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L010InstallerSolrFrFRPage();
		super.html();
	}

	public void htmlC001L010InstallerSolrFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L010InstallerSolrFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L010InstallerSolrFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L010InstallerSolrFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L010InstallerSolrFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L010InstallerSolrFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L010InstallerSolrFrFRPage() {
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
		if(!(o instanceof C001L010InstallerSolrFrFRPage))
			return false;
		C001L010InstallerSolrFrFRPage that = (C001L010InstallerSolrFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L010InstallerSolrFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
