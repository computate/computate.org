package org.computate.site.frfr.article;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vertx.core.logging.Logger;
import java.math.RoundingMode;
import java.math.MathContext;
import org.computate.site.frfr.article.ArticleEnUSGenPage;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.computate.site.frfr.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.ArticleEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class ArticleEnUSPageGen<DEV> extends ArticleEnUSGenPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(ArticleEnUSPage.class);

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseArticleEnUSPage = false;

	public ArticleEnUSPage initLoinArticleEnUSPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseArticleEnUSPage) {
			dejaInitialiseArticleEnUSPage = true;
			initLoinArticleEnUSPage();
		}
		return (ArticleEnUSPage)this;
	}

	public void initLoinArticleEnUSPage() {
		initArticleEnUSPage();
		super.initLoinArticleEnUSGenPage(requeteSite_);
	}

	public void initArticleEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinArticleEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteArticleEnUSPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteArticleEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteArticleEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirArticleEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirArticleEnUSPage(String var) {
		ArticleEnUSPage oArticleEnUSPage = (ArticleEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirArticleEnUSGenPage(var);
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
				o = attribuerArticleEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerArticleEnUSPage(String var, Object val) {
		ArticleEnUSPage oArticleEnUSPage = (ArticleEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerArticleEnUSGenPage(var, val);
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
					o = definirArticleEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirArticleEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsArticleEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsArticleEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptArticleEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptArticleEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyArticleEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyArticleEnUSPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlArticleEnUSPage();
		super.html();
	}

	public void htmlArticleEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaArticleEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaArticleEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesArticleEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesArticleEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleArticleEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleArticleEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtArticleEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtArticleEnUSPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiArticleEnUSPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof ArticleEnUSPage) {
			ArticleEnUSPage original = (ArticleEnUSPage)o;
			super.requeteApiArticleEnUSGenPage();
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
		if(!(o instanceof ArticleEnUSPage))
			return false;
		ArticleEnUSPage that = (ArticleEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ArticleEnUSPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
