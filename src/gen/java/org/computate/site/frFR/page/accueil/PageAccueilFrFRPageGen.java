package org.computate.site.frFR.page.accueil;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.page.accueil.PageAccueilFrFRGenPage;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.accueil.PageAccueilFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAccueilFrFRPageGen<DEV> extends PageAccueilFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAccueilFrFRPage = false;

	public PageAccueilFrFRPage initLoinPageAccueilFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAccueilFrFRPage) {
			dejaInitialisePageAccueilFrFRPage = true;
			initLoinPageAccueilFrFRPage();
		}
		return (PageAccueilFrFRPage)this;
	}

	public void initLoinPageAccueilFrFRPage() {
		super.initLoinPageAccueilFrFRGenPage(requeteSite_);
		initPageAccueilFrFRPage();
	}

	public void initPageAccueilFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageAccueilFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAccueilFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSitePageAccueilFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageAccueilFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAccueilFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAccueilFrFRPage(String var) {
		PageAccueilFrFRPage oPageAccueilFrFRPage = (PageAccueilFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirPageAccueilFrFRGenPage(var);
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
				o = attribuerPageAccueilFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAccueilFrFRPage(String var, Object val) {
		PageAccueilFrFRPage oPageAccueilFrFRPage = (PageAccueilFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerPageAccueilFrFRGenPage(var, val);
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
					o = definirPageAccueilFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAccueilFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageAccueilFrFRGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAccueilFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyPageAccueilFrFRPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAccueilFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAccueilFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAccueilFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAccueilFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageAccueilFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptPageAccueilFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageAccueilFrFRPage();
		super.html();
	}

	public void htmlPageAccueilFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageAccueilFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaPageAccueilFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageAccueilFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesPageAccueilFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageAccueilFrFRPage();
		super.htmlStyle();
	}

	public void htmlStylePageAccueilFrFRPage() {
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
		if(!(o instanceof PageAccueilFrFRPage))
			return false;
		PageAccueilFrFRPage that = (PageAccueilFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAccueilFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
