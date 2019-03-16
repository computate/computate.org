package org.computate.frFR.site.cours;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.frFR.site.recherche.ListeRecherche;
import io.vertx.core.json.JsonArray;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.cours.Cours;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;
import org.computate.frFR.site.page.MiseEnPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.CoursGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursGenPageGen<DEV> extends MiseEnPage {

	////////////////
	// listeCours //
	////////////////

	/**	L'entité « listeCours »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<Cours> listeCours;
	public Couverture<ListeRecherche<Cours>> listeCoursCouverture = new Couverture<ListeRecherche<Cours>>().p(this).c(ListeRecherche.class).var("listeCours").o(listeCours);

	/**	<br/>L'entité « listeCours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.CoursGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeCours">Trouver l'entité listeCours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeCours(Couverture<ListeRecherche<Cours>> c);

	public ListeRecherche<Cours> getListeCours() {
		return listeCours;
	}

	public void setListeCours(ListeRecherche<Cours> listeCours) {
		this.listeCours = listeCours;
		this.listeCoursCouverture.dejaInitialise = true;
	}
	protected CoursGenPage listeCoursInit() {
		if(!listeCoursCouverture.dejaInitialise) {
			_listeCours(listeCoursCouverture);
			if(listeCours == null)
				setListeCours(listeCoursCouverture.o);
		}
		if(listeCours != null)
			listeCours.initLoinPourClasse(requeteSite_);
		listeCoursCouverture.dejaInitialise(true);
		return (CoursGenPage)this;
	}

	///////////
	// cours //
	///////////

	/**	L'entité « cours »
	 *	 is defined as null before being initialized. 
	 */
	protected Cours cours;
	public Couverture<Cours> coursCouverture = new Couverture<Cours>().p(this).c(Cours.class).var("cours").o(cours);

	/**	<br/>L'entité « cours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.CoursGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cours">Trouver l'entité cours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cours(Couverture<Cours> c);

	public Cours getCours() {
		return cours;
	}

	public void setCours(Cours cours) {
		this.cours = cours;
		this.coursCouverture.dejaInitialise = true;
	}
	protected CoursGenPage coursInit() {
		if(!coursCouverture.dejaInitialise) {
			_cours(coursCouverture);
			if(cours == null)
				setCours(coursCouverture.o);
		}
		if(cours != null)
			cours.initLoinPourClasse(requeteSite_);
		coursCouverture.dejaInitialise(true);
		return (CoursGenPage)this;
	}

	//////////////////
	// pageUriCours //
	//////////////////

	/**	L'entité « pageUriCours »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUriCours;
	public Couverture<String> pageUriCoursCouverture = new Couverture<String>().p(this).c(String.class).var("pageUriCours").o(pageUriCours);

	/**	<br/>L'entité « pageUriCours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.CoursGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUriCours">Trouver l'entité pageUriCours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUriCours(Couverture<String> c);

	public String getPageUriCours() {
		return pageUriCours;
	}

	public void setPageUriCours(String pageUriCours) {
		this.pageUriCours = pageUriCours;
		this.pageUriCoursCouverture.dejaInitialise = true;
	}
	protected CoursGenPage pageUriCoursInit() {
		if(!pageUriCoursCouverture.dejaInitialise) {
			_pageUriCours(pageUriCoursCouverture);
			if(pageUriCours == null)
				setPageUriCours(pageUriCoursCouverture.o);
		}
		pageUriCoursCouverture.dejaInitialise(true);
		return (CoursGenPage)this;
	}

	public String solrPageUriCours() {
		return pageUriCours;
	}

	public String strPageUriCours() {
		return pageUriCours == null ? "" : pageUriCours;
	}

	public String nomAffichagePageUriCours() {
		return null;
	}

	public String htmTooltipPageUriCours() {
		return null;
	}

	public String htmPageUriCours() {
		return pageUriCours == null ? "" : StringEscapeUtils.escapeHtml4(strPageUriCours());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursGenPage = false;

	public CoursGenPage initLoinCoursGenPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursGenPage) {
			dejaInitialiseCoursGenPage = true;
			initLoinCoursGenPage();
		}
		return (CoursGenPage)this;
	}

	public void initLoinCoursGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initCoursGenPage();
	}

	public void initCoursGenPage() {
		listeCoursInit();
		coursInit();
		pageUriCoursInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinCoursGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursGenPage(RequeteSite requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		listeCours.setRequeteSite_(requeteSite_);
		cours.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteCoursGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursGenPage(String var) throws Exception {
		CoursGenPage oCoursGenPage = (CoursGenPage)this;
		switch(var) {
			case "listeCours":
				return oCoursGenPage.listeCours;
			case "cours":
				return oCoursGenPage.cours;
			case "pageUriCours":
				return oCoursGenPage.pageUriCours;
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
				o = attribuerCoursGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursGenPage(String var, Object val) {
		CoursGenPage oCoursGenPage = (CoursGenPage)this;
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
					o = definirCoursGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsCoursGenPage();
		super.htmlScriptsMiseEnPage();
	}

	public void htmlScriptsCoursGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptCoursGenPage();
		super.htmlScriptMiseEnPage();
	}

	public void htmlScriptCoursGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCoursGenPage();
		super.htmlBodyMiseEnPage();
	}

	public void htmlBodyCoursGenPage() {
		cours.htmlBody();
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), pageUriCours);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof CoursGenPage))
			return false;
		CoursGenPage that = (CoursGenPage)o;
		return super.equals(o)
				&& Objects.equals( pageUriCours, that.pageUriCours );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursGenPage {");
		sb.append( "pageUriCours: \"" ).append(pageUriCours).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
