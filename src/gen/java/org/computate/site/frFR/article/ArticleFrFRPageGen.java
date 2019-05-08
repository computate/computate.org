package org.computate.site.frFR.article;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.article.ArticleFrFRGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.article.ArticleFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ArticleFrFRPageGen<DEV> extends ArticleFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseArticleFrFRPage = false;

	public ArticleFrFRPage initLoinArticleFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseArticleFrFRPage) {
			dejaInitialiseArticleFrFRPage = true;
			initLoinArticleFrFRPage();
		}
		return (ArticleFrFRPage)this;
	}

	public void initLoinArticleFrFRPage() {
		super.initLoinArticleFrFRGenPage(requeteSite_);
		initArticleFrFRPage();
	}

	public void initArticleFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinArticleFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteArticleFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteArticleFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteArticleFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirArticleFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirArticleFrFRPage(String var) {
		ArticleFrFRPage oArticleFrFRPage = (ArticleFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirArticleFrFRGenPage(var);
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
				o = attribuerArticleFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerArticleFrFRPage(String var, Object val) {
		ArticleFrFRPage oArticleFrFRPage = (ArticleFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerArticleFrFRGenPage(var, val);
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
					o = definirArticleFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirArticleFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsArticleFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsArticleFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptArticleFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptArticleFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyArticleFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyArticleFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlArticleFrFRPage();
		super.html();
	}

	public void htmlArticleFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaArticleFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaArticleFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesArticleFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesArticleFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleArticleFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleArticleFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtArticleFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtArticleFrFRPage() {
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
		if(!(o instanceof ArticleFrFRPage))
			return false;
		ArticleFrFRPage that = (ArticleFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("ArticleFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
