package org.computate.site.frFR.page.apropos;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.page.apropos.PageAProposFrFRGenPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAProposFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposFrFRPageGen<DEV> extends PageAProposFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAProposFrFRPage = false;

	public PageAProposFrFRPage initLoinPageAProposFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAProposFrFRPage) {
			dejaInitialisePageAProposFrFRPage = true;
			initLoinPageAProposFrFRPage();
		}
		return (PageAProposFrFRPage)this;
	}

	public void initLoinPageAProposFrFRPage() {
		super.initLoinPageAProposFrFRGenPage(requeteSite_);
		initPageAProposFrFRPage();
	}

	public void initPageAProposFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageAProposFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAProposFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSitePageAProposFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageAProposFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAProposFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAProposFrFRPage(String var) {
		PageAProposFrFRPage oPageAProposFrFRPage = (PageAProposFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirPageAProposFrFRGenPage(var);
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
				o = attribuerPageAProposFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAProposFrFRPage(String var, Object val) {
		PageAProposFrFRPage oPageAProposFrFRPage = (PageAProposFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerPageAProposFrFRGenPage(var, val);
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
					o = definirPageAProposFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAProposFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageAProposFrFRGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAProposFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyPageAProposFrFRPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAProposFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAProposFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAProposFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAProposFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageAProposFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptPageAProposFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageAProposFrFRPage();
		super.html();
	}

	public void htmlPageAProposFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageAProposFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaPageAProposFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageAProposFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesPageAProposFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageAProposFrFRPage();
		super.htmlStyle();
	}

	public void htmlStylePageAProposFrFRPage() {
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
		if(!(o instanceof PageAProposFrFRPage))
			return false;
		PageAProposFrFRPage that = (PageAProposFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAProposFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
