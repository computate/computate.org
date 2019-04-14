package org.computate.site.frFR.page.accueil;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.accueil.PageAccueil;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.accueil.PageAccueilFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAccueilFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	/////////////////
	// pageAccueil //
	/////////////////

	/**	L'entité « pageAccueil »
	 *	 is defined as null before being initialized. 
	 */
	protected PageAccueil pageAccueil;
	public Couverture<PageAccueil> pageAccueilCouverture = new Couverture<PageAccueil>().p(this).c(PageAccueil.class).var("pageAccueil").o(pageAccueil);

	/**	<br/>L'entité « pageAccueil »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.accueil.PageAccueilFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageAccueil">Trouver l'entité pageAccueil dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageAccueil(Couverture<PageAccueil> c);

	public PageAccueil getPageAccueil() {
		return pageAccueil;
	}

	public void setPageAccueil(PageAccueil pageAccueil) {
		this.pageAccueil = pageAccueil;
		this.pageAccueilCouverture.dejaInitialise = true;
	}
	protected PageAccueilFrFRGenPage pageAccueilInit() {
		if(!pageAccueilCouverture.dejaInitialise) {
			_pageAccueil(pageAccueilCouverture);
			if(pageAccueil == null)
				setPageAccueil(pageAccueilCouverture.o);
		}
		if(pageAccueil != null)
			pageAccueil.initLoinPourClasse(requeteSite_);
		pageAccueilCouverture.dejaInitialise(true);
		return (PageAccueilFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAccueilFrFRGenPage = false;

	public PageAccueilFrFRGenPage initLoinPageAccueilFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAccueilFrFRGenPage) {
			dejaInitialisePageAccueilFrFRGenPage = true;
			initLoinPageAccueilFrFRGenPage();
		}
		return (PageAccueilFrFRGenPage)this;
	}

	public void initLoinPageAccueilFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initPageAccueilFrFRGenPage();
	}

	public void initPageAccueilFrFRGenPage() {
		pageAccueilInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageAccueilFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAccueilFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		pageAccueil.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageAccueilFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAccueilFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAccueilFrFRGenPage(String var) throws Exception {
		PageAccueilFrFRGenPage oPageAccueilFrFRGenPage = (PageAccueilFrFRGenPage)this;
		switch(var) {
			case "pageAccueil":
				return oPageAccueilFrFRGenPage.pageAccueil;
			default:
				return super.obtenirC001LeconFrFRPage(var);
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
				o = attribuerPageAccueilFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAccueilFrFRGenPage(String var, Object val) {
		PageAccueilFrFRGenPage oPageAccueilFrFRGenPage = (PageAccueilFrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconFrFRPage(var, val);
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
					o = definirPageAccueilFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAccueilFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsPageAccueilFrFRGenPage();
	}

	public void htmlScriptsPageAccueilFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyPageAccueilFrFRGenPage();
	}

	public void htmlBodyPageAccueilFrFRGenPage() {
		if(pageAccueil != null)
			pageAccueil.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageAccueilFrFRGenPage();
	}

	public void htmlBodyCourtPageAccueilFrFRGenPage() {
		if(pageAccueil != null)
			pageAccueil.htmlBodyCourt();
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
		if(!(o instanceof PageAccueilFrFRGenPage))
			return false;
		PageAccueilFrFRGenPage that = (PageAccueilFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAccueilFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}