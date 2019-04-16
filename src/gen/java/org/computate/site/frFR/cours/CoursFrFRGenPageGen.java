package org.computate.site.frFR.cours;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.cours.Cours;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.page.MiseEnPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.CoursFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursFrFRGenPageGen<DEV> extends MiseEnPage {

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.CoursFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeCours">Trouver l'entité listeCours dans Solr</a>
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
	protected CoursFrFRGenPage listeCoursInit() {
		if(!listeCoursCouverture.dejaInitialise) {
			_listeCours(listeCoursCouverture);
			if(listeCours == null)
				setListeCours(listeCoursCouverture.o);
		}
		if(listeCours != null)
			listeCours.initLoinPourClasse(requeteSite_);
		listeCoursCouverture.dejaInitialise(true);
		return (CoursFrFRGenPage)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.CoursFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cours">Trouver l'entité cours dans Solr</a>
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
	protected CoursFrFRGenPage coursInit() {
		if(!coursCouverture.dejaInitialise) {
			_cours(coursCouverture);
			if(cours == null)
				setCours(coursCouverture.o);
		}
		if(cours != null)
			cours.initLoinPourClasse(requeteSite_);
		coursCouverture.dejaInitialise(true);
		return (CoursFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursFrFRGenPage = false;

	public CoursFrFRGenPage initLoinCoursFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursFrFRGenPage) {
			dejaInitialiseCoursFrFRGenPage = true;
			initLoinCoursFrFRGenPage();
		}
		return (CoursFrFRGenPage)this;
	}

	public void initLoinCoursFrFRGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initCoursFrFRGenPage();
	}

	public void initCoursFrFRGenPage() {
		listeCoursInit();
		coursInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinCoursFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeCours != null)
			listeCours.setRequeteSite_(requeteSite_);
		if(cours != null)
			cours.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteCoursFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursFrFRGenPage(String var) throws Exception {
		CoursFrFRGenPage oCoursFrFRGenPage = (CoursFrFRGenPage)this;
		switch(var) {
			case "listeCours":
				return oCoursFrFRGenPage.listeCours;
			case "cours":
				return oCoursFrFRGenPage.cours;
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
				o = attribuerCoursFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursFrFRGenPage(String var, Object val) {
		CoursFrFRGenPage oCoursFrFRGenPage = (CoursFrFRGenPage)this;
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
					o = definirCoursFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsCoursFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsCoursFrFRGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptCoursFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptCoursFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCoursFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyCoursFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlCoursFrFRGenPage();
		super.html();
	}

	public void htmlCoursFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaCoursFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaCoursFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesCoursFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesCoursFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleCoursFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleCoursFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtCoursFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtCoursFrFRGenPage() {
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
		if(!(o instanceof CoursFrFRGenPage))
			return false;
		CoursFrFRGenPage that = (CoursFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
