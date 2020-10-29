package org.computate.site.frfr.article;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.computate.site.frfr.recherche.ListeRecherche;
import org.computate.site.frfr.page.MiseEnPage;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vertx.core.logging.Logger;
import java.math.RoundingMode;
import java.math.MathContext;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.computate.site.frfr.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.computate.site.frfr.article.Article;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class ArticleEnUSGenPageGen<DEV> extends MiseEnPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(ArticleEnUSGenPage.class);

	//////////////////
	// listeArticle //
	//////////////////

	/**	 L'entité listeArticle
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected ListeRecherche<Article> listeArticle;
	@JsonIgnore
	public Couverture<ListeRecherche<Article>> listeArticleCouverture = new Couverture<ListeRecherche<Article>>().p(this).c(ListeRecherche.class).var("listeArticle").o(listeArticle);

	/**	<br/> L'entité listeArticle
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
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
	protected ArticleEnUSGenPage listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticleCouverture);
			if(listeArticle == null)
				setListeArticle(listeArticleCouverture.o);
		}
		if(listeArticle != null)
			listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (ArticleEnUSGenPage)this;
	}

	//////////////
	// article_ //
	//////////////

	/**	 L'entité article_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Article article_;
	@JsonIgnore
	public Couverture<Article> article_Couverture = new Couverture<Article>().p(this).c(Article.class).var("article_").o(article_);

	/**	<br/> L'entité article_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.ArticleEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:article_">Trouver l'entité article_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _article_(Couverture<Article> c);

	public Article getArticle_() {
		return article_;
	}

	public void setArticle_(Article article_) {
		this.article_ = article_;
		this.article_Couverture.dejaInitialise = true;
	}
	protected ArticleEnUSGenPage article_Init() {
		if(!article_Couverture.dejaInitialise) {
			_article_(article_Couverture);
			if(article_ == null)
				setArticle_(article_Couverture.o);
		}
		article_Couverture.dejaInitialise(true);
		return (ArticleEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseArticleEnUSGenPage = false;

	public ArticleEnUSGenPage initLoinArticleEnUSGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseArticleEnUSGenPage) {
			dejaInitialiseArticleEnUSGenPage = true;
			initLoinArticleEnUSGenPage();
		}
		return (ArticleEnUSGenPage)this;
	}

	public void initLoinArticleEnUSGenPage() {
		initArticleEnUSGenPage();
		super.initLoinMiseEnPage(requeteSite_);
	}

	public void initArticleEnUSGenPage() {
		listeArticleInit();
		article_Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinArticleEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteArticleEnUSGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteArticleEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirArticleEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirArticleEnUSGenPage(String var) {
		ArticleEnUSGenPage oArticleEnUSGenPage = (ArticleEnUSGenPage)this;
		switch(var) {
			case "listeArticle":
				return oArticleEnUSGenPage.listeArticle;
			case "article_":
				return oArticleEnUSGenPage.article_;
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
				o = attribuerArticleEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerArticleEnUSGenPage(String var, Object val) {
		ArticleEnUSGenPage oArticleEnUSGenPage = (ArticleEnUSGenPage)this;
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
					o = definirArticleEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirArticleEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsArticleEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsArticleEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptArticleEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptArticleEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyArticleEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyArticleEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlArticleEnUSGenPage();
		super.html();
	}

	public void htmlArticleEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaArticleEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaArticleEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesArticleEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesArticleEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleArticleEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleArticleEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtArticleEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtArticleEnUSGenPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiArticleEnUSGenPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof ArticleEnUSGenPage) {
			ArticleEnUSGenPage original = (ArticleEnUSGenPage)o;
			super.requeteApiMiseEnPage();
		}
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
		if(!(o instanceof ArticleEnUSGenPage))
			return false;
		ArticleEnUSGenPage that = (ArticleEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ArticleEnUSGenPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
