package org.computate.site.frFR.page.blog;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.page.blog.PageBlogFrFRGenPage;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.blog.PageBlogFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageBlogFrFRPageGen<DEV> extends PageBlogFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageBlogFrFRPage = false;

	public PageBlogFrFRPage initLoinPageBlogFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageBlogFrFRPage) {
			dejaInitialisePageBlogFrFRPage = true;
			initLoinPageBlogFrFRPage();
		}
		return (PageBlogFrFRPage)this;
	}

	public void initLoinPageBlogFrFRPage() {
		super.initLoinPageBlogFrFRGenPage(requeteSite_);
		initPageBlogFrFRPage();
	}

	public void initPageBlogFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageBlogFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageBlogFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSitePageBlogFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageBlogFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageBlogFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageBlogFrFRPage(String var) {
		PageBlogFrFRPage oPageBlogFrFRPage = (PageBlogFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirPageBlogFrFRGenPage(var);
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
				o = attribuerPageBlogFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageBlogFrFRPage(String var, Object val) {
		PageBlogFrFRPage oPageBlogFrFRPage = (PageBlogFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerPageBlogFrFRGenPage(var, val);
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
					o = definirPageBlogFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageBlogFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPageBlogFrFRGenPage(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageBlogFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyPageBlogFrFRPage() {
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageBlogFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageBlogFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageBlogFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageBlogFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageBlogFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptPageBlogFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageBlogFrFRPage();
		super.html();
	}

	public void htmlPageBlogFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageBlogFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaPageBlogFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageBlogFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesPageBlogFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageBlogFrFRPage();
		super.htmlStyle();
	}

	public void htmlStylePageBlogFrFRPage() {
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
		if(!(o instanceof PageBlogFrFRPage))
			return false;
		PageBlogFrFRPage that = (PageBlogFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageBlogFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
