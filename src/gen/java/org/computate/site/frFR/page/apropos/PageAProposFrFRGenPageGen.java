package org.computate.site.frFR.page.apropos;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.frFR.page.apropos.PageAPropos;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAProposFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposFrFRGenPageGen<DEV> extends ArticleFrFRPage {

	/////////////////
	// pageAPropos //
	/////////////////

	/**	L'entité « pageAPropos »
	 *	 is defined as null before being initialized. 
	 */
	protected PageAPropos pageAPropos;
	public Couverture<PageAPropos> pageAProposCouverture = new Couverture<PageAPropos>().p(this).c(PageAPropos.class).var("pageAPropos").o(pageAPropos);

	/**	<br/>L'entité « pageAPropos »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAProposFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageAPropos">Trouver l'entité pageAPropos dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAPropos(Couverture<PageAPropos> c);

	public PageAPropos getPageAPropos() {
		return pageAPropos;
	}

	public void setPageAPropos(PageAPropos pageAPropos) {
		this.pageAPropos = pageAPropos;
		this.pageAProposCouverture.dejaInitialise = true;
	}
	protected PageAProposFrFRGenPage pageAProposInit() {
		if(!pageAProposCouverture.dejaInitialise) {
			_pageAPropos(pageAProposCouverture);
			if(pageAPropos == null)
				setPageAPropos(pageAProposCouverture.o);
		}
		if(pageAPropos != null)
			pageAPropos.initLoinPourClasse(requeteSite_);
		pageAProposCouverture.dejaInitialise(true);
		return (PageAProposFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAProposFrFRGenPage = false;

	public PageAProposFrFRGenPage initLoinPageAProposFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAProposFrFRGenPage) {
			dejaInitialisePageAProposFrFRGenPage = true;
			initLoinPageAProposFrFRGenPage();
		}
		return (PageAProposFrFRGenPage)this;
	}

	public void initLoinPageAProposFrFRGenPage() {
		super.initLoinArticleFrFRPage(requeteSite_);
		initPageAProposFrFRGenPage();
	}

	public void initPageAProposFrFRGenPage() {
		pageAProposInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageAProposFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAProposFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteArticleFrFRPage(requeteSite_);
		if(pageAPropos != null)
			pageAPropos.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageAProposFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAProposFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAProposFrFRGenPage(String var) {
		PageAProposFrFRGenPage oPageAProposFrFRGenPage = (PageAProposFrFRGenPage)this;
		switch(var) {
			case "pageAPropos":
				return oPageAProposFrFRGenPage.pageAPropos;
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
				o = attribuerPageAProposFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAProposFrFRGenPage(String var, Object val) {
		PageAProposFrFRGenPage oPageAProposFrFRGenPage = (PageAProposFrFRGenPage)this;
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
					o = definirPageAProposFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAProposFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPageAProposFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPageAProposFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAProposFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyPageAProposFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPageAProposFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPageAProposFrFRGenPage() {
		if(pageAPropos != null)
			pageAPropos.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPageAProposFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptPageAProposFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPageAProposFrFRGenPage();
		super.html();
	}

	public void htmlPageAProposFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPageAProposFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPageAProposFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPageAProposFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPageAProposFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePageAProposFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStylePageAProposFrFRGenPage() {
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
		if(!(o instanceof PageAProposFrFRGenPage))
			return false;
		PageAProposFrFRGenPage that = (PageAProposFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAProposFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
