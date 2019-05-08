package org.computate.site.frFR.page.faq;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.faq.PageFaqFrFRGenPage;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.faq.PageFaqFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageFaqFrFRPageGen<DEV> extends PageFaqFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageFaqFrFRPage = false;

	public PageFaqFrFRPage initLoinPageFaqFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageFaqFrFRPage) {
			dejaInitialisePageFaqFrFRPage = true;
			initLoinPageFaqFrFRPage();
		}
		return (PageFaqFrFRPage)this;
	}

	public void initLoinPageFaqFrFRPage() {
		super.initLoinPageFaqFrFRGenPage(requeteSite_);
		initPageFaqFrFRPage();
	}

	public void initPageFaqFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageFaqFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageFaqFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSitePageFaqFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageFaqFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageFaqFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageFaqFrFRPage(String var) {
		PageFaqFrFRPage oPageFaqFrFRPage = (PageFaqFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirPageFaqFrFRGenPage(var);
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
				o = attribuerPageFaqFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageFaqFrFRPage(String var, Object val) {
		PageFaqFrFRPage oPageFaqFrFRPage = (PageFaqFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerPageFaqFrFRGenPage(var, val);
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
					o = definirPageFaqFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageFaqFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageFaqFrFRGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageFaqFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyPageFaqFrFRPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageFaqFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageFaqFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageFaqFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageFaqFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageFaqFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptPageFaqFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageFaqFrFRPage();
		super.html();
	}

	public void htmlPageFaqFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageFaqFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaPageFaqFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageFaqFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesPageFaqFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageFaqFrFRPage();
		super.htmlStyle();
	}

	public void htmlStylePageFaqFrFRPage() {
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
		if(!(o instanceof PageFaqFrFRPage))
			return false;
		PageFaqFrFRPage that = (PageFaqFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageFaqFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
