package org.computate.site.frFR.article;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.article.Article;
import java.lang.String;
import org.computate.site.frFR.page.MiseEnPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.article.ArticleFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ArticleFrFRGenPageGen<DEV> extends MiseEnPage {

	//////////////////
	// listeArticle //
	//////////////////

	/**	L'entité « listeArticle »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<Article> listeArticle;
	public Couverture<ListeRecherche<Article>> listeArticleCouverture = new Couverture<ListeRecherche<Article>>().p(this).c(ListeRecherche.class).var("listeArticle").o(listeArticle);

	/**	<br/>L'entité « listeArticle »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.article.ArticleFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeArticle(Couverture<ListeRecherche<Article>> c);

	public ListeRecherche<Article> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ListeRecherche<Article> listeArticle) {
		this.listeArticle = listeArticle;
		this.listeArticleCouverture.dejaInitialise = true;
	}
	protected ArticleFrFRGenPage listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticleCouverture);
			if(listeArticle == null)
				setListeArticle(listeArticleCouverture.o);
		}
		if(listeArticle != null)
			listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (ArticleFrFRGenPage)this;
	}

	/////////////
	// article //
	/////////////

	/**	L'entité « article »
	 *	 is defined as null before being initialized. 
	 */
	protected Article article;
	public Couverture<Article> articleCouverture = new Couverture<Article>().p(this).c(Article.class).var("article").o(article);

	/**	<br/>L'entité « article »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.article.ArticleFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:article">Trouver l'entité article dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _article(Couverture<Article> c);

	public Article getArticle() {
		return article;
	}

	public void setArticle(Article article) {
		this.article = article;
		this.articleCouverture.dejaInitialise = true;
	}
	protected ArticleFrFRGenPage articleInit() {
		if(!articleCouverture.dejaInitialise) {
			_article(articleCouverture);
			if(article == null)
				setArticle(articleCouverture.o);
		}
		if(article != null)
			article.initLoinPourClasse(requeteSite_);
		articleCouverture.dejaInitialise(true);
		return (ArticleFrFRGenPage)this;
	}

	////////////////////
	// pageUriArticle //
	////////////////////

	/**	L'entité « pageUriArticle »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUriArticle;
	public Couverture<String> pageUriArticleCouverture = new Couverture<String>().p(this).c(String.class).var("pageUriArticle").o(pageUriArticle);

	/**	<br/>L'entité « pageUriArticle »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.article.ArticleFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUriArticle">Trouver l'entité pageUriArticle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUriArticle(Couverture<String> c);

	public String getPageUriArticle() {
		return pageUriArticle;
	}

	public void setPageUriArticle(String pageUriArticle) {
		this.pageUriArticle = pageUriArticle;
		this.pageUriArticleCouverture.dejaInitialise = true;
	}
	protected ArticleFrFRGenPage pageUriArticleInit() {
		if(!pageUriArticleCouverture.dejaInitialise) {
			_pageUriArticle(pageUriArticleCouverture);
			if(pageUriArticle == null)
				setPageUriArticle(pageUriArticleCouverture.o);
		}
		pageUriArticleCouverture.dejaInitialise(true);
		return (ArticleFrFRGenPage)this;
	}

	public String solrPageUriArticle() {
		return pageUriArticle;
	}

	public String strPageUriArticle() {
		return pageUriArticle == null ? "" : pageUriArticle;
	}

	public String nomAffichagePageUriArticle() {
		return null;
	}

	public String htmTooltipPageUriArticle() {
		return null;
	}

	public String htmPageUriArticle() {
		return pageUriArticle == null ? "" : StringEscapeUtils.escapeHtml4(strPageUriArticle());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseArticleFrFRGenPage = false;

	public ArticleFrFRGenPage initLoinArticleFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseArticleFrFRGenPage) {
			dejaInitialiseArticleFrFRGenPage = true;
			initLoinArticleFrFRGenPage();
		}
		return (ArticleFrFRGenPage)this;
	}

	public void initLoinArticleFrFRGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initArticleFrFRGenPage();
	}

	public void initArticleFrFRGenPage() {
		listeArticleInit();
		articleInit();
		pageUriArticleInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinArticleFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteArticleFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(article != null)
			article.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteArticleFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirArticleFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirArticleFrFRGenPage(String var) {
		ArticleFrFRGenPage oArticleFrFRGenPage = (ArticleFrFRGenPage)this;
		switch(var) {
			case "listeArticle":
				return oArticleFrFRGenPage.listeArticle;
			case "article":
				return oArticleFrFRGenPage.article;
			case "pageUriArticle":
				return oArticleFrFRGenPage.pageUriArticle;
			default:
				return super.obtenirMiseEnPage(var);
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
				o = attribuerArticleFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerArticleFrFRGenPage(String var, Object val) {
		ArticleFrFRGenPage oArticleFrFRGenPage = (ArticleFrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerMiseEnPage(var, val);
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
					o = definirArticleFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirArticleFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsArticleFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsArticleFrFRGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptArticleFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptArticleFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyArticleFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyArticleFrFRGenPage() {
		if(article != null)
			article.htmlBody();
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlArticleFrFRGenPage();
		super.html();
	}

	public void htmlArticleFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaArticleFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaArticleFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesArticleFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesArticleFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleArticleFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleArticleFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtArticleFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtArticleFrFRGenPage() {
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
		if(!(o instanceof ArticleFrFRGenPage))
			return false;
		ArticleFrFRGenPage that = (ArticleFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ArticleFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
