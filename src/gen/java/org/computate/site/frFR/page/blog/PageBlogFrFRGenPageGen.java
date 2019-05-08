package org.computate.site.frFR.page.blog;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.page.blog.PageBlog;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.blog.PageBlogFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageBlogFrFRGenPageGen<DEV> extends ArticleFrFRPage {

	//////////////
	// pageBlog //
	//////////////

	/**	L'entité « pageBlog »
	 *	 is defined as null before being initialized. 
	 */
	protected PageBlog pageBlog;
	public Couverture<PageBlog> pageBlogCouverture = new Couverture<PageBlog>().p(this).c(PageBlog.class).var("pageBlog").o(pageBlog);

	/**	<br/>L'entité « pageBlog »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.blog.PageBlogFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageBlog">Trouver l'entité pageBlog dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageBlog(Couverture<PageBlog> c);

	public PageBlog getPageBlog() {
		return pageBlog;
	}

	public void setPageBlog(PageBlog pageBlog) {
		this.pageBlog = pageBlog;
		this.pageBlogCouverture.dejaInitialise = true;
	}
	protected PageBlogFrFRGenPage pageBlogInit() {
		if(!pageBlogCouverture.dejaInitialise) {
			_pageBlog(pageBlogCouverture);
			if(pageBlog == null)
				setPageBlog(pageBlogCouverture.o);
		}
		if(pageBlog != null)
			pageBlog.initLoinPourClasse(requeteSite_);
		pageBlogCouverture.dejaInitialise(true);
		return (PageBlogFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageBlogFrFRGenPage = false;

	public PageBlogFrFRGenPage initLoinPageBlogFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageBlogFrFRGenPage) {
			dejaInitialisePageBlogFrFRGenPage = true;
			initLoinPageBlogFrFRGenPage();
		}
		return (PageBlogFrFRGenPage)this;
	}

	public void initLoinPageBlogFrFRGenPage() {
		super.initLoinArticleFrFRPage(requeteSite_);
		initPageBlogFrFRGenPage();
	}

	public void initPageBlogFrFRGenPage() {
		pageBlogInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageBlogFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageBlogFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteArticleFrFRPage(requeteSite_);
		if(pageBlog != null)
			pageBlog.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageBlogFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageBlogFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageBlogFrFRGenPage(String var) {
		PageBlogFrFRGenPage oPageBlogFrFRGenPage = (PageBlogFrFRGenPage)this;
		switch(var) {
			case "pageBlog":
				return oPageBlogFrFRGenPage.pageBlog;
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
				o = attribuerPageBlogFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageBlogFrFRGenPage(String var, Object val) {
		PageBlogFrFRGenPage oPageBlogFrFRGenPage = (PageBlogFrFRGenPage)this;
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
					o = definirPageBlogFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageBlogFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageBlogFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageBlogFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageBlogFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageBlogFrFRGenPage() {
		if(pageBlog != null)
			pageBlog.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageBlogFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageBlogFrFRGenPage() {
		if(pageBlog != null)
			pageBlog.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageBlogFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageBlogFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageBlogFrFRGenPage();
		super.html();
	}

	public void htmlPageBlogFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageBlogFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageBlogFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageBlogFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageBlogFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageBlogFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageBlogFrFRGenPage() {
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
		if(!(o instanceof PageBlogFrFRGenPage))
			return false;
		PageBlogFrFRGenPage that = (PageBlogFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageBlogFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
