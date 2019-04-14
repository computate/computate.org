package org.computate.site.enUS.page.accueil;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.cours.Cours;
import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import java.lang.String;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAccueilGen<DEV> extends Cluster {

	public static final String PageAccueil_H1 = "Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ";
	public static final String PageAccueil_H2 = "Flexible PostgreSQL database, Solr search integration, OpenAPI 3 standards, completely asynchronous Vert.x code, deployed on Red Hat OpenShift, for the very best, 100% open source solutions. ";
	public static final String PageAccueil_Titre = "Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ";
	public static final String PageAccueil_Couleur = "green";
	public static final String PageAccueil_IconeGroupe = "regular";
	public static final String PageAccueil_IconeNom = "book";
	public static final String PageAccueilFrFRPage_Uri = "/frFR";
	public static final String PageAccueilEnUSPage_Uri = "/";

	//////////////////////////
	// classeNomsCanoniques //
	//////////////////////////

	/**	L'entité « classeNomsCanoniques »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> classeNomsCanoniques = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> classeNomsCanoniquesCouverture = new Couverture<List<String>>().p(this).c(List.class).var("classeNomsCanoniques").o(classeNomsCanoniques);

	/**	<br/>L'entité « classeNomsCanoniques »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:classeNomsCanoniques">Trouver l'entité classeNomsCanoniques dans Solr</a>
	 * <br/>
	 * @param classeNomsCanoniques est l'entité déjà construit. 
	 **/
	protected abstract void _classeNomsCanoniques(List<String> l);

	public List<String> getClasseNomsCanoniques() {
		return classeNomsCanoniques;
	}

	public void setClasseNomsCanoniques(List<String> classeNomsCanoniques) {
		this.classeNomsCanoniques = classeNomsCanoniques;
		this.classeNomsCanoniquesCouverture.dejaInitialise = true;
	}
	public PageAccueil addClasseNomsCanoniques(String...objets) {
		for(String o : objets) {
			addClasseNomsCanoniques(o);
		}
		return (PageAccueil)this;
	}
	public PageAccueil addClasseNomsCanoniques(String o) {
		if(o != null && !classeNomsCanoniques.contains(o))
			this.classeNomsCanoniques.add(o);
		return (PageAccueil)this;
	}
	public PageAccueil setClasseNomsCanoniques(JsonArray objets) {
		classeNomsCanoniques.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClasseNomsCanoniques(o);
		}
		return (PageAccueil)this;
	}
	protected PageAccueil classeNomsCanoniquesInit() {
		if(!classeNomsCanoniquesCouverture.dejaInitialise) {
			_classeNomsCanoniques(classeNomsCanoniques);
		}
		classeNomsCanoniquesCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public List<String> solrClasseNomsCanoniques() {
		return classeNomsCanoniques;
	}

	public String strClasseNomsCanoniques() {
		return classeNomsCanoniques == null ? "" : classeNomsCanoniques.toString();
	}

	public String nomAffichageClasseNomsCanoniques() {
		return null;
	}

	public String htmTooltipClasseNomsCanoniques() {
		return null;
	}

	public String htmClasseNomsCanoniques() {
		return classeNomsCanoniques == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomsCanoniques());
	}

	//////////////////
	// pageUri_enUS //
	//////////////////

	/**	L'entité « pageUri_enUS »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUri_enUS;
	public Couverture<String> pageUri_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri_enUS").o(pageUri_enUS);

	/**	<br/>L'entité « pageUri_enUS »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_enUS">Trouver l'entité pageUri_enUS dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUri_enUS(Couverture<String> c);

	public String getPageUri_enUS() {
		return pageUri_enUS;
	}

	public void setPageUri_enUS(String pageUri_enUS) {
		this.pageUri_enUS = pageUri_enUS;
		this.pageUri_enUSCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageUri_enUSInit() {
		if(!pageUri_enUSCouverture.dejaInitialise) {
			_pageUri_enUS(pageUri_enUSCouverture);
			if(pageUri_enUS == null)
				setPageUri_enUS(pageUri_enUSCouverture.o);
		}
		pageUri_enUSCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageUri_enUS() {
		return pageUri_enUS;
	}

	public String strPageUri_enUS() {
		return pageUri_enUS == null ? "" : pageUri_enUS;
	}

	public String nomAffichagePageUri_enUS() {
		return null;
	}

	public String htmTooltipPageUri_enUS() {
		return null;
	}

	public String htmPageUri_enUS() {
		return pageUri_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strPageUri_enUS());
	}

	//////////////////
	// pageUri_frFR //
	//////////////////

	/**	L'entité « pageUri_frFR »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageUri_frFR;
	public Couverture<String> pageUri_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri_frFR").o(pageUri_frFR);

	/**	<br/>L'entité « pageUri_frFR »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_frFR">Trouver l'entité pageUri_frFR dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUri_frFR(Couverture<String> c);

	public String getPageUri_frFR() {
		return pageUri_frFR;
	}

	public void setPageUri_frFR(String pageUri_frFR) {
		this.pageUri_frFR = pageUri_frFR;
		this.pageUri_frFRCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageUri_frFRInit() {
		if(!pageUri_frFRCouverture.dejaInitialise) {
			_pageUri_frFR(pageUri_frFRCouverture);
			if(pageUri_frFR == null)
				setPageUri_frFR(pageUri_frFRCouverture.o);
		}
		pageUri_frFRCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageUri_frFR() {
		return pageUri_frFR;
	}

	public String strPageUri_frFR() {
		return pageUri_frFR == null ? "" : pageUri_frFR;
	}

	public String nomAffichagePageUri_frFR() {
		return null;
	}

	public String htmTooltipPageUri_frFR() {
		return null;
	}

	public String htmPageUri_frFR() {
		return pageUri_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strPageUri_frFR());
	}

	///////////////
	// pageTitre //
	///////////////

	/**	L'entité « pageTitre »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageTitre;
	public Couverture<String> pageTitreCouverture = new Couverture<String>().p(this).c(String.class).var("pageTitre").o(pageTitre);

	/**	<br/>L'entité « pageTitre »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageTitre">Trouver l'entité pageTitre dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageTitre(Couverture<String> c);

	public String getPageTitre() {
		return pageTitre;
	}

	public void setPageTitre(String pageTitre) {
		this.pageTitre = pageTitre;
		this.pageTitreCouverture.dejaInitialise = true;
	}
	protected PageAccueil pageTitreInit() {
		if(!pageTitreCouverture.dejaInitialise) {
			_pageTitre(pageTitreCouverture);
			if(pageTitre == null)
				setPageTitre(pageTitreCouverture.o);
		}
		pageTitreCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageTitre() {
		return pageTitre;
	}

	public String strPageTitre() {
		return pageTitre == null ? "" : pageTitre;
	}

	public String nomAffichagePageTitre() {
		return null;
	}

	public String htmTooltipPageTitre() {
		return null;
	}

	public String htmPageTitre() {
		return pageTitre == null ? "" : StringEscapeUtils.escapeHtml4(strPageTitre());
	}

	////////////
	// pageH1 //
	////////////

	/**	L'entité « pageH1 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH1;
	public Couverture<String> pageH1Couverture = new Couverture<String>().p(this).c(String.class).var("pageH1").o(pageH1);

	/**	<br/>L'entité « pageH1 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageH1">Trouver l'entité pageH1 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH1(Couverture<String> c);

	public String getPageH1() {
		return pageH1;
	}

	public void setPageH1(String pageH1) {
		this.pageH1 = pageH1;
		this.pageH1Couverture.dejaInitialise = true;
	}
	protected PageAccueil pageH1Init() {
		if(!pageH1Couverture.dejaInitialise) {
			_pageH1(pageH1Couverture);
			if(pageH1 == null)
				setPageH1(pageH1Couverture.o);
		}
		pageH1Couverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageH1() {
		return pageH1;
	}

	public String strPageH1() {
		return pageH1 == null ? "" : pageH1;
	}

	public String nomAffichagePageH1() {
		return null;
	}

	public String htmTooltipPageH1() {
		return null;
	}

	public String htmPageH1() {
		return pageH1 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH1());
	}

	////////////
	// pageH2 //
	////////////

	/**	L'entité « pageH2 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH2;
	public Couverture<String> pageH2Couverture = new Couverture<String>().p(this).c(String.class).var("pageH2").o(pageH2);

	/**	<br/>L'entité « pageH2 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageH2">Trouver l'entité pageH2 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH2(Couverture<String> c);

	public String getPageH2() {
		return pageH2;
	}

	public void setPageH2(String pageH2) {
		this.pageH2 = pageH2;
		this.pageH2Couverture.dejaInitialise = true;
	}
	protected PageAccueil pageH2Init() {
		if(!pageH2Couverture.dejaInitialise) {
			_pageH2(pageH2Couverture);
			if(pageH2 == null)
				setPageH2(pageH2Couverture.o);
		}
		pageH2Couverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	public String solrPageH2() {
		return pageH2;
	}

	public String strPageH2() {
		return pageH2 == null ? "" : pageH2;
	}

	public String nomAffichagePageH2() {
		return null;
	}

	public String htmTooltipPageH2() {
		return null;
	}

	public String htmPageH2() {
		return pageH2 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH2());
	}

	////////////////
	// listeCours //
	////////////////

	/**	L'entité « listeCours »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Cours>(). 
	 */
	protected ListeRecherche<Cours> listeCours = new ListeRecherche<Cours>();
	public Couverture<ListeRecherche<Cours>> listeCoursCouverture = new Couverture<ListeRecherche<Cours>>().p(this).c(ListeRecherche.class).var("listeCours").o(listeCours);

	/**	<br/>L'entité « listeCours »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Cours>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeCours">Trouver l'entité listeCours dans Solr</a>
	 * <br/>
	 * @param listeCours est l'entité déjà construit. 
	 **/
	protected abstract void _listeCours(ListeRecherche<Cours> o);

	public ListeRecherche<Cours> getListeCours() {
		return listeCours;
	}

	public void setListeCours(ListeRecherche<Cours> listeCours) {
		this.listeCours = listeCours;
		this.listeCoursCouverture.dejaInitialise = true;
	}
	protected PageAccueil listeCoursInit() {
		if(!listeCoursCouverture.dejaInitialise) {
			_listeCours(listeCours);
		}
		listeCours.initLoinPourClasse(requeteSite_);
		listeCoursCouverture.dejaInitialise(true);
		return (PageAccueil)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cours">Trouver l'entité cours dans Solr</a>
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
	protected PageAccueil coursInit() {
		if(!coursCouverture.dejaInitialise) {
			_cours(coursCouverture);
			if(cours == null)
				setCours(coursCouverture.o);
		}
		if(cours != null)
			cours.initLoinPourClasse(requeteSite_);
		coursCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}

	///////////
	// intro //
	///////////

	public static final String introP1 = "Are you thinking about launching your own website? ";
	public static final String introP2 = "Learn with me, how to create your very own web site the open source way. ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe intro = new PageParagraphe();
	public Couverture<PageParagraphe> introCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:intro">Trouver l'entité intro dans Solr</a>
	 * <br/>
	 * @param intro est l'entité déjà construit. 
	 **/
	protected abstract void _intro(PageParagraphe o);

	public PageParagraphe getIntro() {
		return intro;
	}

	public void setIntro(PageParagraphe intro) {
		this.intro = intro;
		this.introCouverture.dejaInitialise = true;
	}
	protected PageAccueil introInit() {
		if(intro != null) {
			((PageAccueil)this).avantPagePart(intro, "intro");
			((PageAccueil)this).avantPagePart(intro, "intro");
		}
		if(!introCouverture.dejaInitialise) {
			_intro(intro);
		}
		intro.initLoinPourClasse(requeteSite_);
		introCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}
	public void htmlBodyIntro(PageParagraphe o) {
	}
	public void htmlBodyIntro() {
		intro.htmlAvant();
		htmlBodyIntro(intro);
		intro.htmlApres();
	}

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "I will help you create your own successful website, on your own computer, using open-source software. ";
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe moi = new PageParagraphe();
	public Couverture<PageParagraphe> moiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.accueil.PageAccueil&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
	 * <br/>
	 * @param moi est l'entité déjà construit. 
	 **/
	protected abstract void _moi(PageParagraphe o);

	public PageParagraphe getMoi() {
		return moi;
	}

	public void setMoi(PageParagraphe moi) {
		this.moi = moi;
		this.moiCouverture.dejaInitialise = true;
	}
	protected PageAccueil moiInit() {
		if(moi != null) {
			((PageAccueil)this).avantPagePart(moi, "moi");
			((PageAccueil)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (PageAccueil)this;
	}
	public void htmlBodyMoi(PageParagraphe o) {
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAccueil = false;

	public PageAccueil initLoinPageAccueil(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAccueil) {
			dejaInitialisePageAccueil = true;
			initLoinPageAccueil();
		}
		return (PageAccueil)this;
	}

	public void initLoinPageAccueil() {
		super.initLoinCluster(requeteSite_);
		initPageAccueil();
	}

	public void initPageAccueil() {
		classeNomsCanoniquesInit();
		pageUri_enUSInit();
		pageUri_frFRInit();
		pageTitreInit();
		pageH1Init();
		pageH2Init();
		listeCoursInit();
		coursInit();
		introInit();
		moiInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAccueil(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAccueil(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteCluster(requeteSite_);
		listeCours.setRequeteSite_(requeteSite_);
		cours.setRequeteSite_(requeteSite_);
		intro.setRequeteSite_(requeteSite_);
		moi.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageAccueil(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAccueil(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAccueil(String var) throws Exception {
		PageAccueil oPageAccueil = (PageAccueil)this;
		switch(var) {
			case "classeNomsCanoniques":
				return oPageAccueil.classeNomsCanoniques;
			case "pageUri_enUS":
				return oPageAccueil.pageUri_enUS;
			case "pageUri_frFR":
				return oPageAccueil.pageUri_frFR;
			case "pageTitre":
				return oPageAccueil.pageTitre;
			case "pageH1":
				return oPageAccueil.pageH1;
			case "pageH2":
				return oPageAccueil.pageH2;
			case "listeCours":
				return oPageAccueil.listeCours;
			case "cours":
				return oPageAccueil.cours;
			case "intro":
				return oPageAccueil.intro;
			case "moi":
				return oPageAccueil.moi;
			default:
				return super.obtenirCluster(var);
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
				o = attribuerPageAccueil(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAccueil(String var, Object val) {
		PageAccueil oPageAccueil = (PageAccueil)this;
		switch(var) {
			default:
				return super.attribuerCluster(var, val);
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
					o = definirPageAccueil(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAccueil(String var, String val) {
		switch(var) {
			default:
				return super.definirCluster(var, val);
		}
	}

	///////////
	// image //
	///////////

	public static void image() {
		try {
			DefaultExecutor executeur = new DefaultExecutor();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.accueil.PageAccueil"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageAccueil o = new PageAccueil();
			o.requeteSitePageAccueil(requeteSite);
			o.initLoinPageAccueil(requeteSite);
			o.indexerPageAccueil();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerPageAccueil();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerPageAccueil(document);
	}

	public void indexerPageAccueil(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageAccueil(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageAccueil() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageAccueil(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageAccueil(SolrInputDocument document) throws Exception {
		if(pageTitre != null) {
			document.addField("pageTitre_indexed_string", pageTitre);
			document.addField("pageTitre_stored_string", pageTitre);
		}
		if(pageH1 != null) {
			document.addField("pageH1_indexed_string", pageH1);
			document.addField("pageH1_stored_string", pageH1);
		}
		if(pageH2 != null) {
			document.addField("pageH2_indexed_string", pageH2);
			document.addField("pageH2_stored_string", pageH2);
		}
		super.indexerCluster(document);

	}

	public void desindexerPageAccueil() throws Exception {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinPageAccueil(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerPageAccueil(solrDocument);
	}
	public void stockerPageAccueil(SolrDocument solrDocument) {
		PageAccueil oPageAccueil = (PageAccueil)this;

		String pageTitre = (String)solrDocument.get("pageTitre_stored_string");
		if(pageTitre != null)
			oPageAccueil.setPageTitre(pageTitre);

		String pageH1 = (String)solrDocument.get("pageH1_stored_string");
		if(pageH1 != null)
			oPageAccueil.setPageH1(pageH1);

		String pageH2 = (String)solrDocument.get("pageH2_stored_string");
		if(pageH2 != null)
			oPageAccueil.setPageH2(pageH2);

		super.stockerCluster(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyPageAccueil();
	}

	public void htmlBodyPageAccueil() {
		if(cours != null)
			cours.htmlBody();
		if(intro != null)
			intro.htmlBody();
		if(moi != null)
			moi.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageAccueil();
	}

	public void htmlBodyCourtPageAccueil() {
		if(intro != null)
			intro.htmlBodyCourt();
		if(moi != null)
			moi.htmlBodyCourt();
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), classeNomsCanoniques, pageUri_enUS, pageUri_frFR, pageTitre, pageH1, pageH2);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof PageAccueil))
			return false;
		PageAccueil that = (PageAccueil)o;
		return super.equals(o)
				&& Objects.equals( classeNomsCanoniques, that.classeNomsCanoniques )
				&& Objects.equals( pageUri_enUS, that.pageUri_enUS )
				&& Objects.equals( pageUri_frFR, that.pageUri_frFR )
				&& Objects.equals( pageTitre, that.pageTitre )
				&& Objects.equals( pageH1, that.pageH1 )
				&& Objects.equals( pageH2, that.pageH2 );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAccueil {");
		sb.append( "classeNomsCanoniques: " ).append(classeNomsCanoniques);
		sb.append( ", pageUri_enUS: \"" ).append(pageUri_enUS).append( "\"" );
		sb.append( ", pageUri_frFR: \"" ).append(pageUri_frFR).append( "\"" );
		sb.append( ", pageTitre: \"" ).append(pageTitre).append( "\"" );
		sb.append( ", pageH1: \"" ).append(pageH1).append( "\"" );
		sb.append( ", pageH2: \"" ).append(pageH2).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageAccueilVals = new String[] { introP1, introP2, moiP1, moiP2 };
}
