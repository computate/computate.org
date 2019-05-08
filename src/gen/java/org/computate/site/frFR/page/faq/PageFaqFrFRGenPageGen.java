package org.computate.site.frFR.page.faq;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.page.faq.PageFaq;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.faq.PageFaqFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageFaqFrFRGenPageGen<DEV> extends ArticleFrFRPage {

	/////////////
	// pageFaq //
	/////////////

	/**	L'entité « pageFaq »
	 *	 is defined as null before being initialized. 
	 */
	protected PageFaq pageFaq;
	public Couverture<PageFaq> pageFaqCouverture = new Couverture<PageFaq>().p(this).c(PageFaq.class).var("pageFaq").o(pageFaq);

	/**	<br/>L'entité « pageFaq »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.faq.PageFaqFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageFaq">Trouver l'entité pageFaq dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageFaq(Couverture<PageFaq> c);

	public PageFaq getPageFaq() {
		return pageFaq;
	}

	public void setPageFaq(PageFaq pageFaq) {
		this.pageFaq = pageFaq;
		this.pageFaqCouverture.dejaInitialise = true;
	}
	protected PageFaqFrFRGenPage pageFaqInit() {
		if(!pageFaqCouverture.dejaInitialise) {
			_pageFaq(pageFaqCouverture);
			if(pageFaq == null)
				setPageFaq(pageFaqCouverture.o);
		}
		if(pageFaq != null)
			pageFaq.initLoinPourClasse(requeteSite_);
		pageFaqCouverture.dejaInitialise(true);
		return (PageFaqFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageFaqFrFRGenPage = false;

	public PageFaqFrFRGenPage initLoinPageFaqFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageFaqFrFRGenPage) {
			dejaInitialisePageFaqFrFRGenPage = true;
			initLoinPageFaqFrFRGenPage();
		}
		return (PageFaqFrFRGenPage)this;
	}

	public void initLoinPageFaqFrFRGenPage() {
		super.initLoinArticleFrFRPage(requeteSite_);
		initPageFaqFrFRGenPage();
	}

	public void initPageFaqFrFRGenPage() {
		pageFaqInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageFaqFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageFaqFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteArticleFrFRPage(requeteSite_);
		if(pageFaq != null)
			pageFaq.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageFaqFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageFaqFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageFaqFrFRGenPage(String var) {
		PageFaqFrFRGenPage oPageFaqFrFRGenPage = (PageFaqFrFRGenPage)this;
		switch(var) {
			case "pageFaq":
				return oPageFaqFrFRGenPage.pageFaq;
			default:
				return super.obtenirArticleFrFRPage(var);
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
				o = attribuerPageFaqFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageFaqFrFRGenPage(String var, Object val) {
		PageFaqFrFRGenPage oPageFaqFrFRGenPage = (PageFaqFrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerArticleFrFRPage(var, val);
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
					o = definirPageFaqFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageFaqFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageFaqFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageFaqFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageFaqFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageFaqFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageFaqFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageFaqFrFRGenPage() {
		if(pageFaq != null)
			pageFaq.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageFaqFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageFaqFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageFaqFrFRGenPage();
		super.html();
	}

	public void htmlPageFaqFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageFaqFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageFaqFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageFaqFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageFaqFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageFaqFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageFaqFrFRGenPage() {
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
		if(!(o instanceof PageFaqFrFRGenPage))
			return false;
		PageFaqFrFRGenPage that = (PageFaqFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageFaqFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
