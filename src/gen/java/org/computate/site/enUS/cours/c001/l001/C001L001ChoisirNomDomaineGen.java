package org.computate.site.enUS.cours.c001.l001;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.apache.solr.client.solrj.SolrClient;
import java.util.ArrayList;
import java.util.Objects;
import org.computate.site.enUS.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.page.parti.PageParagraphe;
import java.util.List;
import org.computate.site.enUS.page.parti.PagePart;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineGen<DEV> extends C001Lecon {

	public static final String C001L001ChoisirNomDomaine_UnNom = "a lesson";
	public static final String C001L001ChoisirNomDomaine_NomSingulier = "lesson";
	public static final String C001L001ChoisirNomDomaine_NomPluriel = "lessons";
	public static final String C001L001ChoisirNomDomaine_H1 = "What is the first step to creating my own website? ";
	public static final String C001L001ChoisirNomDomaine_H2 = "Choose a domain name. ";
	public static final String C001L001ChoisirNomDomaine_LesNoms = "les lessons";
	public static final String C001L001ChoisirNomDomaine_NomVar = "lesson";
	public static final String C001L001ChoisirNomDomaine_Couleur = "green";
	public static final String C001L001ChoisirNomDomaine_IconeGroupe = "regular";
	public static final String C001L001ChoisirNomDomaine_IconeNom = "book";

	///////////
	// intro //
	///////////

	public static final String introP1 = "Are you thinking about launching your own website? ";
	public static final String introP2 = "Are you wondering what the very first step is to creating your own website? ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe intro = new PageParagraphe();
	public Couverture<PageParagraphe> introCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:intro">Trouver l'entité intro dans Solr</a>
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
	protected C001L001ChoisirNomDomaine introInit() {
		if(intro != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(intro, "intro");
		}
		if(!introCouverture.dejaInitialise) {
			_intro(intro);
		}
		intro.initLoinPourClasse(requeteSite_);
		introCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "I will help you create your own successful website, on your own computer, using open-source software. ";
	public static final String moiP3 = "The first thing you should do is choose your domain name so you can get started in the right direction. ";
	public static final String moiP = moiP1 + moiP2 + moiP3;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe moi = new PageParagraphe();
	public Couverture<PageParagraphe> moiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L001ChoisirNomDomaine moiInit() {
		if(moi != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	//////////////
	// aLAvance //
	//////////////

	public static final String aLAvanceQuestion1 = "Is it important to purchase a domain name ahead of time? ";
	public static final String aLAvanceQuestion = aLAvanceQuestion1;
	public static final String aLAvanceQuestionCourt1 = "Should I buy it ahead of time? ";
	public static final String aLAvanceQuestionCourt = aLAvanceQuestionCourt1;
	public static final String aLAvanceReponse1 = "You need to know now what your site will be called so you don't get lost. ";
	public static final String aLAvanceReponse = aLAvanceReponse1;
	public static final String aLAvanceReponseCourt1 = "Know what your site will be called";
	public static final String aLAvanceReponseCourt = aLAvanceReponseCourt1;
	public static final String aLAvanceP1 = "You can start today with your very own computer building your own website, but you must figure out what it will be called. ";
	public static final String aLAvanceP2 = "The fate of the name of your computer depends on it. ";
	public static final String aLAvanceP3 = "The directories where you will be putting your website are waiting for it. ";
	public static final String aLAvanceP4 = "All the applications that are part of the website will need to know it. ";
	public static final String aLAvanceP5 = "So go take some time and think of the perfect .com, .org or .whatever that will represent your vision, and then come back here and I'll help you from there. ";
	public static final String aLAvanceP = aLAvanceP1 + aLAvanceP2 + aLAvanceP3 + aLAvanceP4 + aLAvanceP5;

	/**	L'entité « aLAvance »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse aLAvance = new QuestionReponse();
	public Couverture<QuestionReponse> aLAvanceCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("aLAvance").o(aLAvance);

	/**	<br/>L'entité « aLAvance »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:aLAvance">Trouver l'entité aLAvance dans Solr</a>
	 * <br/>
	 * @param aLAvance est l'entité déjà construit. 
	 **/
	protected abstract void _aLAvance(QuestionReponse o);

	public QuestionReponse getALAvance() {
		return aLAvance;
	}

	public void setALAvance(QuestionReponse aLAvance) {
		this.aLAvance = aLAvance;
		this.aLAvanceCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine aLAvanceInit() {
		if(aLAvance != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(aLAvance, "aLAvance");
		}
		if(!aLAvanceCouverture.dejaInitialise) {
			_aLAvance(aLAvance);
		}
		aLAvance.initLoinPourClasse(requeteSite_);
		aLAvanceCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	/////////////
	// acheter //
	/////////////

	public static final String acheterQuestion1 = "Where can I purchase a domain name? ";
	public static final String acheterQuestion = acheterQuestion1;
	public static final String acheterQuestionCourt1 = "Where can I purchase a domain name? ";
	public static final String acheterQuestionCourt = acheterQuestionCourt1;
	public static final String acheterReponse1 = "There are so many domain name registrars to choose from, but you might try brinkster.com or gandi.net. ";
	public static final String acheterReponse = acheterReponse1;
	public static final String acheterReponseCourt1 = "Try brinkster.com or gandi.net";
	public static final String acheterReponseCourt = acheterReponseCourt1;
	public static final String acheterP1 = "I can't tell you where the cheapest place or most trustworthy place is to purchase your site's domain name. ";
	public static final String acheterP2 = "But I can tell you where I purchased mine 12 years ago, which is ";
	public static final String acheterP3 = ". But brinkster.com is not the cheapest ($19.83 this year). ";
	public static final String acheterP4 = "You may also want to try ";
	public static final String acheterP5 = ". Their prices vary, but they have very cheap promotional domain names, and many more options to choose from. ";
	public static final String acheterP = acheterP1 + acheterP2 + acheterP3 + acheterP4 + acheterP5;

	/**	L'entité « acheter »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse acheter = new QuestionReponse();
	public Couverture<QuestionReponse> acheterCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("acheter").o(acheter);

	/**	<br/>L'entité « acheter »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:acheter">Trouver l'entité acheter dans Solr</a>
	 * <br/>
	 * @param acheter est l'entité déjà construit. 
	 **/
	protected abstract void _acheter(QuestionReponse o);

	public QuestionReponse getAcheter() {
		return acheter;
	}

	public void setAcheter(QuestionReponse acheter) {
		this.acheter = acheter;
		this.acheterCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine acheterInit() {
		if(acheter != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(acheter, "acheter");
		}
		if(!acheterCouverture.dejaInitialise) {
			_acheter(acheter);
		}
		acheter.initLoinPourClasse(requeteSite_);
		acheterCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	/////////////
	// appeler //
	/////////////

	public static final String appelerQuestion1 = "What do I choose for a domain name? ";
	public static final String appelerQuestion = appelerQuestion1;
	public static final String appelerQuestionCourt1 = "What do I choose for a domain name? ";
	public static final String appelerQuestionCourt = appelerQuestionCourt1;
	public static final String appelerReponse1 = "Find a domain name that will reach your audience. ";
	public static final String appelerReponse = appelerReponse1;
	public static final String appelerReponseCourt1 = "Reach your audience";
	public static final String appelerReponseCourt = appelerReponseCourt1;
	public static final String appelerP1 = "I don't know your passion, but find a domain name that will reach your audience. ";
	public static final String appelerP2 = "It's good if it is short and sweet. ";
	public static final String appelerP3 = "Whether it is a .com, or .org, or .net or whatever is up to you too. ";
	public static final String appelerP4 = "Just make it a place you will be proud of someday! ";
	public static final String appelerP = appelerP1 + appelerP2 + appelerP3 + appelerP4;

	/**	L'entité « appeler »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse appeler = new QuestionReponse();
	public Couverture<QuestionReponse> appelerCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("appeler").o(appeler);

	/**	<br/>L'entité « appeler »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:appeler">Trouver l'entité appeler dans Solr</a>
	 * <br/>
	 * @param appeler est l'entité déjà construit. 
	 **/
	protected abstract void _appeler(QuestionReponse o);

	public QuestionReponse getAppeler() {
		return appeler;
	}

	public void setAppeler(QuestionReponse appeler) {
		this.appeler = appeler;
		this.appelerCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine appelerInit() {
		if(appeler != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(appeler, "appeler");
		}
		if(!appelerCouverture.dejaInitialise) {
			_appeler(appeler);
		}
		appeler.initLoinPourClasse(requeteSite_);
		appelerCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	////////////
	// apres1 //
	////////////

	public static final String apres1Question1 = "What do I do after I bought a domain name? ";
	public static final String apres1Question = apres1Question1;
	public static final String apres1QuestionCourt1 = "What do I do after I bought a domain name? ";
	public static final String apres1QuestionCourt = apres1QuestionCourt1;
	public static final String apres1Reponse1 = "Manage your domain. ";
	public static final String apres1Reponse = apres1Reponse1;
	public static final String apres1ReponseCourt1 = "Manage your domain";
	public static final String apres1ReponseCourt = apres1ReponseCourt1;
	public static final String apres1P1 = "Let me show you what it's like to manage a domain name. ";
	public static final String apres1P2 = "I will log into my own registrar's site, ";
	public static final String apres1P3 = ". ";
	public static final String apres1P = apres1P1 + apres1P2 + apres1P3;

	/**	L'entité « apres1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse apres1 = new QuestionReponse();
	public Couverture<QuestionReponse> apres1Couverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("apres1").o(apres1);

	/**	<br/>L'entité « apres1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres1">Trouver l'entité apres1 dans Solr</a>
	 * <br/>
	 * @param apres1 est l'entité déjà construit. 
	 **/
	protected abstract void _apres1(QuestionReponse o);

	public QuestionReponse getApres1() {
		return apres1;
	}

	public void setApres1(QuestionReponse apres1) {
		this.apres1 = apres1;
		this.apres1Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres1Init() {
		if(apres1 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres1, "apres1");
		}
		if(!apres1Couverture.dejaInitialise) {
			_apres1(apres1);
		}
		apres1.initLoinPourClasse(requeteSite_);
		apres1Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	////////////
	// apres2 //
	////////////

	public static final String apres2P1 = "I click on \"Login\". ";
	public static final String apres2P2 = "I click again on \"Login\". ";
	public static final String apres2P3 = "I click on \"DOMAIN NAMES\". ";
	public static final String apres2P4 = "And there you can see my domain names that are still alive, and those that are dead. ";
	public static final String apres2P5 = "So domains expire yearly, and they can be renewed each year. ";
	public static final String apres2P6 = "I can also manage my site, so I will click on \"Manage\". ";
	public static final String apres2P = apres2P1 + apres2P2 + apres2P3 + apres2P4 + apres2P5 + apres2P6;

	/**	L'entité « apres2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres2 = new PageHtml();
	public Couverture<PageHtml> apres2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres2").o(apres2);

	/**	<br/>L'entité « apres2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres2">Trouver l'entité apres2 dans Solr</a>
	 * <br/>
	 * @param apres2 est l'entité déjà construit. 
	 **/
	protected abstract void _apres2(PageHtml o);

	public PageHtml getApres2() {
		return apres2;
	}

	public void setApres2(PageHtml apres2) {
		this.apres2 = apres2;
		this.apres2Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres2Init() {
		if(apres2 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres2, "apres2");
		}
		if(!apres2Couverture.dejaInitialise) {
			_apres2(apres2);
		}
		apres2.initLoinPourClasse(requeteSite_);
		apres2Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	////////////
	// apres3 //
	////////////

	public static final String apres3P1 = "If I click on \"Update Domain Registrant Information\" I can update my name and address information to make sure I receive spam from everyone on the Web who noticed I created a new domain. ";
	public static final String apres3P2 = "I would recommend a P.O. Box for your business, rather than your home address, for more privacy. ";
	public static final String apres3P = apres3P1 + apres3P2;

	/**	L'entité « apres3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres3 = new PageHtml();
	public Couverture<PageHtml> apres3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres3").o(apres3);

	/**	<br/>L'entité « apres3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres3">Trouver l'entité apres3 dans Solr</a>
	 * <br/>
	 * @param apres3 est l'entité déjà construit. 
	 **/
	protected abstract void _apres3(PageHtml o);

	public PageHtml getApres3() {
		return apres3;
	}

	public void setApres3(PageHtml apres3) {
		this.apres3 = apres3;
		this.apres3Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres3Init() {
		if(apres3 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres3, "apres3");
		}
		if(!apres3Couverture.dejaInitialise) {
			_apres3(apres3);
		}
		apres3.initLoinPourClasse(requeteSite_);
		apres3Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	////////////
	// apres4 //
	////////////

	public static final String apres4P1 = "If I go back and click on \"Update Name Servers\" I can point my website to a different DNS company than my registrar, brinkster.com. ";
	public static final String apres4P2 = "This is handy for me, because I actually use my email SMTP provider fastmail.com as my DNS provider, so I put in the name servers of my DNS provider there. ";
	public static final String apres4P3 = "You don't need a different DNS provider, you can usually use your registrar for email as well, but I choose fastmail for their privacy and excellent email interface. ";
	public static final String apres4P = apres4P1 + apres4P2 + apres4P3;

	/**	L'entité « apres4 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres4 = new PageHtml();
	public Couverture<PageHtml> apres4Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres4").o(apres4);

	/**	<br/>L'entité « apres4 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres4">Trouver l'entité apres4 dans Solr</a>
	 * <br/>
	 * @param apres4 est l'entité déjà construit. 
	 **/
	protected abstract void _apres4(PageHtml o);

	public PageHtml getApres4() {
		return apres4;
	}

	public void setApres4(PageHtml apres4) {
		this.apres4 = apres4;
		this.apres4Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres4Init() {
		if(apres4 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres4, "apres4");
		}
		if(!apres4Couverture.dejaInitialise) {
			_apres4(apres4);
		}
		apres4.initLoinPourClasse(requeteSite_);
		apres4Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	////////////
	// apres5 //
	////////////

	public static final String apres5P1 = "In a future lesson, we'll talk about creating a static IP address so that users can find your web server, on your computer, at your domain. ";
	public static final String apres5P2 = "When you have this, you can ask the support team at your registrar, to create for you some \"A records\" at your static IP. ";
	public static final String apres5P3 = "For example, I would ask for two A records to be created for \"computate.org\" and \"*.computate.org\" to my static IP address \"209.63.89.254\". ";
	public static final String apres5P4 = "But since I use fastmail for my DNS, I can actually create my own A records for any of my domains in my account, which is nice. ";
	public static final String apres5P = apres5P1 + apres5P2 + apres5P3 + apres5P4;

	/**	L'entité « apres5 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres5 = new PageHtml();
	public Couverture<PageHtml> apres5Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres5").o(apres5);

	/**	<br/>L'entité « apres5 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:apres5">Trouver l'entité apres5 dans Solr</a>
	 * <br/>
	 * @param apres5 est l'entité déjà construit. 
	 **/
	protected abstract void _apres5(PageHtml o);

	public PageHtml getApres5() {
		return apres5;
	}

	public void setApres5(PageHtml apres5) {
		this.apres5 = apres5;
		this.apres5Couverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine apres5Init() {
		if(apres5 != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(apres5, "apres5");
		}
		if(!apres5Couverture.dejaInitialise) {
			_apres5(apres5);
		}
		apres5.initLoinPourClasse(requeteSite_);
		apres5Couverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	//////////////
	// plusTard //
	//////////////

	public static final String plusTardQuestion1 = "Can I start developing my website locally before deciding on my domain name? ";
	public static final String plusTardQuestion = plusTardQuestion1;
	public static final String plusTardQuestionCourt1 = "Can I pick a domain name later? ";
	public static final String plusTardQuestionCourt = plusTardQuestionCourt1;
	public static final String plusTardReponse1 = "The hostname of your computer will depend on your domain name. ";
	public static final String plusTardReponse = plusTardReponse1;
	public static final String plusTardReponseCourt1 = "Your computer hostname depends on it";
	public static final String plusTardReponseCourt = plusTardReponseCourt1;
	public static final String plusTardP1 = "If you don't know your domain name, it's going to bite you later. ";
	public static final String plusTardP2 = "Having a hostname that is a subdomain of your domain name makes it easier to develop and bring your site live. ";
	public static final String plusTardP3 = "You can give your computers hostnames that are subdomains of your own domain name to make it easy to develop and view your site locally and publicly from the same URL. ";
	public static final String plusTardP4 = "I like creating a directory for your domain name for storing SSL certs and other domain specific files together in the same place to be synced to all your computers. ";
	public static final String plusTardP5 = "So instead of making it harder on yourself, take this exciting opportunity to buy your domain name, it's less than $20 per year! ";
	public static final String plusTardP6 = "Now you can continue to launch your own successful website on your own computer. ";
	public static final String plusTardP = plusTardP1 + plusTardP2 + plusTardP3 + plusTardP4 + plusTardP5 + plusTardP6;

	/**	L'entité « plusTard »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse plusTard = new QuestionReponse();
	public Couverture<QuestionReponse> plusTardCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("plusTard").o(plusTard);

	/**	<br/>L'entité « plusTard »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:plusTard">Trouver l'entité plusTard dans Solr</a>
	 * <br/>
	 * @param plusTard est l'entité déjà construit. 
	 **/
	protected abstract void _plusTard(QuestionReponse o);

	public QuestionReponse getPlusTard() {
		return plusTard;
	}

	public void setPlusTard(QuestionReponse plusTard) {
		this.plusTard = plusTard;
		this.plusTardCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine plusTardInit() {
		if(plusTard != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(plusTard, "plusTard");
		}
		if(!plusTardCouverture.dejaInitialise) {
			_plusTard(plusTard);
		}
		plusTard.initLoinPourClasse(requeteSite_);
		plusTardCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaine = false;

	public C001L001ChoisirNomDomaine initLoinC001L001ChoisirNomDomaine(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaine) {
			dejaInitialiseC001L001ChoisirNomDomaine = true;
			initLoinC001L001ChoisirNomDomaine();
		}
		return (C001L001ChoisirNomDomaine)this;
	}

	public void initLoinC001L001ChoisirNomDomaine() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L001ChoisirNomDomaine();
	}

	public void initC001L001ChoisirNomDomaine() {
		introInit();
		moiInit();
		aLAvanceInit();
		acheterInit();
		appelerInit();
		apres1Init();
		apres2Init();
		apres3Init();
		apres4Init();
		apres5Init();
		plusTardInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L001ChoisirNomDomaine(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaine(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		intro.setRequeteSite_(requeteSite_);
		moi.setRequeteSite_(requeteSite_);
		aLAvance.setRequeteSite_(requeteSite_);
		acheter.setRequeteSite_(requeteSite_);
		appeler.setRequeteSite_(requeteSite_);
		apres1.setRequeteSite_(requeteSite_);
		apres2.setRequeteSite_(requeteSite_);
		apres3.setRequeteSite_(requeteSite_);
		apres4.setRequeteSite_(requeteSite_);
		apres5.setRequeteSite_(requeteSite_);
		plusTard.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaine(requeteSite_);
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
			C001L001ChoisirNomDomaine o = new C001L001ChoisirNomDomaine();
			o.requeteSiteC001L001ChoisirNomDomaine(requeteSite);
			o.initLoinC001L001ChoisirNomDomaine(requeteSite);
			o.indexerC001L001ChoisirNomDomaine();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001L001ChoisirNomDomaine();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001L001ChoisirNomDomaine(document);
	}

	public void indexerC001L001ChoisirNomDomaine(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L001ChoisirNomDomaine(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L001ChoisirNomDomaine() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L001ChoisirNomDomaine(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L001ChoisirNomDomaine(SolrInputDocument document) throws Exception {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L001ChoisirNomDomaine() throws Exception {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L001ChoisirNomDomaine(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaine(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaine(String var) throws Exception {
		C001L001ChoisirNomDomaine oC001L001ChoisirNomDomaine = (C001L001ChoisirNomDomaine)this;
		switch(var) {
			case "intro":
				return oC001L001ChoisirNomDomaine.intro;
			case "moi":
				return oC001L001ChoisirNomDomaine.moi;
			case "aLAvance":
				return oC001L001ChoisirNomDomaine.aLAvance;
			case "acheter":
				return oC001L001ChoisirNomDomaine.acheter;
			case "appeler":
				return oC001L001ChoisirNomDomaine.appeler;
			case "apres1":
				return oC001L001ChoisirNomDomaine.apres1;
			case "apres2":
				return oC001L001ChoisirNomDomaine.apres2;
			case "apres3":
				return oC001L001ChoisirNomDomaine.apres3;
			case "apres4":
				return oC001L001ChoisirNomDomaine.apres4;
			case "apres5":
				return oC001L001ChoisirNomDomaine.apres5;
			case "plusTard":
				return oC001L001ChoisirNomDomaine.plusTard;
			default:
				return super.obtenirC001Lecon(var);
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
				o = attribuerC001L001ChoisirNomDomaine(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaine(String var, Object val) {
		C001L001ChoisirNomDomaine oC001L001ChoisirNomDomaine = (C001L001ChoisirNomDomaine)this;
		switch(var) {
			default:
				return super.attribuerC001Lecon(var, val);
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
					o = definirC001L001ChoisirNomDomaine(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaine(String var, String val) {
		switch(var) {
			default:
				return super.definirC001Lecon(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L001ChoisirNomDomaine();
		super.htmlBodyC001Lecon();
	}

	public void htmlBodyC001L001ChoisirNomDomaine() {
		intro.htmlBody();
		moi.htmlBody();
		((C001L001ChoisirNomDomaine)this).htmlBodyALAvance();
		((C001L001ChoisirNomDomaine)this).htmlBodyAcheter();
		((C001L001ChoisirNomDomaine)this).htmlBodyAppeler();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres1();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres2();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres3();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres4();
		((C001L001ChoisirNomDomaine)this).htmlBodyApres5();
		((C001L001ChoisirNomDomaine)this).htmlBodyPlusTard();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L001ChoisirNomDomaine();
	}

	public void htmlBodyCourtC001L001ChoisirNomDomaine() {
		intro.htmlBodyCourt();
		moi.htmlBodyCourt();
		aLAvance.htmlBodyCourt();
		acheter.htmlBodyCourt();
		appeler.htmlBodyCourt();
		apres1.htmlBodyCourt();
		apres2.htmlBodyCourt();
		apres3.htmlBodyCourt();
		apres4.htmlBodyCourt();
		apres5.htmlBodyCourt();
		plusTard.htmlBodyCourt();
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
		if(!(o instanceof C001L001ChoisirNomDomaine))
			return false;
		C001L001ChoisirNomDomaine that = (C001L001ChoisirNomDomaine)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaine {");
		sb.append(" }");
		return sb.toString();
	}
}
