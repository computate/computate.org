package org.computate.site.frFR.cours.c001.l001;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.frFR.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.frFR.page.parti.PagePart;
import java.lang.String;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.frFR.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import org.computate.site.frFR.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frFR.page.parti.PageParagraphe;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true">Trouver la classe leconRecherche_enUS dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineGen<DEV> extends C001Lecon {

	public static final String C001L001ChoisirNomDomaine_UnNom = "le leçon";
	public static final String C001L001ChoisirNomDomaine_NomSingulier = "leçon";
	public static final String C001L001ChoisirNomDomaine_NomPluriel = "lessons";
	public static final String C001L001ChoisirNomDomaine_H1 = "Quel est l'étape première pour créer mon propre site Web ? ";
	public static final String C001L001ChoisirNomDomaine_H2 = "Choisir un nom de domaine. ";
	public static final String C001L001ChoisirNomDomaine_LesNoms = "les lessons";
	public static final String C001L001ChoisirNomDomaine_NomVar = "leçon";
	public static final String C001L001ChoisirNomDomaine_Couleur = "green";
	public static final String C001L001ChoisirNomDomaine_IconeGroupe = "regular";
	public static final String C001L001ChoisirNomDomaine_IconeNom = "book";
	public static final String C001L001ChoisirNomDomaineFrFRPage_Uri = "/frFR/cours/001/001-choisir-nom-domaine";
	public static final String C001L001ChoisirNomDomaineEnUSPage_Uri = "/enUS/course/001/001-choose-domain-name";

	///////////
	// intro //
	///////////

	public static final String introP1 = "Envisagez-vous de créer votre propre site Web ? ";
	public static final String introP2 = "Peut-être vous demandez-vous quelle est la première étape de la création de votre propre site Web ? ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe intro = new PageParagraphe();
	public Couverture<PageParagraphe> introCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:intro">Trouver l'entité intro dans Solr</a>
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

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. ";
	public static final String moiP3 = "La première chose à faire est de choisir votre nom de domaine, afin que vous puissiez commencer dans la bonne direction. ";
	public static final String moiP = moiP1 + moiP2 + moiP3;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe moi = new PageParagraphe();
	public Couverture<PageParagraphe> moiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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

	public static final String aLAvanceQuestion1 = "Est-t-il important d'acheter un nom de domaine à l'avance ? ";
	public static final String aLAvanceQuestion = aLAvanceQuestion1;
	public static final String aLAvanceQuestionCourt1 = "Devrais je l'acheter à l'avance ? ";
	public static final String aLAvanceQuestionCourt = aLAvanceQuestionCourt1;
	public static final String aLAvanceReponse1 = "Vous devez savoir maintenant comment vous appelez votre site, afin que vous ne seriez pas perdu. ";
	public static final String aLAvanceReponse = aLAvanceReponse1;
	public static final String aLAvanceReponseCourt1 = "Savoir maintenant comment vous appelez votre site";
	public static final String aLAvanceReponseCourt = aLAvanceReponseCourt1;
	public static final String aLAvanceP1 = "Vous pouvez commencer aujourd'hui avec votre propre ordinateur à construire votre propre site Web, mais vous devez comprendre ce que le site s'appele. ";
	public static final String aLAvanceP2 = "Le destin du nom de votre ordinateur en dépend. ";
	public static final String aLAvanceP3 = "Les répertoires où vous mettez votre site Web l'attendent. ";
	public static final String aLAvanceP4 = "Toutes les applications qui font partie du site Web devront le connaître. ";
	public static final String aLAvanceP5 = "Alors, passez du temps et pensez au .com, .fr ou .nimporte qui représentera votre vision, puis revenez ici et je vais vous aider à partir de là. ";
	public static final String aLAvanceP = aLAvanceP1 + aLAvanceP2 + aLAvanceP3 + aLAvanceP4 + aLAvanceP5;

	/**	L'entité « aLAvance »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse aLAvance = new QuestionReponse();
	public Couverture<QuestionReponse> aLAvanceCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("aLAvance").o(aLAvance);

	/**	<br/>L'entité « aLAvance »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:aLAvance">Trouver l'entité aLAvance dans Solr</a>
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

	public static final String acheterQuestion1 = "Où puis-je acheter un nom de domaine ? ";
	public static final String acheterQuestion = acheterQuestion1;
	public static final String acheterQuestionCourt1 = "Où puis-je acheter un nom de domaine ? ";
	public static final String acheterQuestionCourt = acheterQuestionCourt1;
	public static final String acheterReponse1 = "Il y a tellement d'enregistreurs de noms de domaine à choisir, mais vous pouvez essayer brinkster.com ou gandi.net. ";
	public static final String acheterReponse = acheterReponse1;
	public static final String acheterReponseCourt1 = "Essayez brinkster.com ou gandi.net";
	public static final String acheterReponseCourt = acheterReponseCourt1;
	public static final String acheterP1 = "Je ne peux pas vous dire où l'endroit le moins cher ou le lieu le plus digne de confiance est d'acheter le nom de domaine de votre site. ";
	public static final String acheterP2 = "Mais je peux vous dire où j'ai acheté le mien il y a 12 ans, c'est ";
	public static final String acheterP3 = ". Mais brinkster.com n'est pas le moins chèr ($ 19.83 cette année). ";
	public static final String acheterP4 = "Peut-être vous voulez essayer ";
	public static final String acheterP5 = ". Leurs prix varient, mais ils ont des noms de domaine publicitaire à un bon prix, et beaucoup d'autres options à choisir. ";
	public static final String acheterP = acheterP1 + acheterP2 + acheterP3 + acheterP4 + acheterP5;

	/**	L'entité « acheter »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse acheter = new QuestionReponse();
	public Couverture<QuestionReponse> acheterCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("acheter").o(acheter);

	/**	<br/>L'entité « acheter »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:acheter">Trouver l'entité acheter dans Solr</a>
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

	public static final String appelerQuestion1 = "Qu'est-ce que je choisis comme un nom de domaine ? ";
	public static final String appelerQuestion = appelerQuestion1;
	public static final String appelerQuestionCourt1 = "Qu'est-ce que je choisis comme un nom de domaine ? ";
	public static final String appelerQuestionCourt = appelerQuestionCourt1;
	public static final String appelerReponse1 = "Trouver un nom de domaine qui atteindra votre public. ";
	public static final String appelerReponse = appelerReponse1;
	public static final String appelerReponseCourt1 = "Atteindra votre public";
	public static final String appelerReponseCourt = appelerReponseCourt1;
	public static final String appelerP1 = "Je ne connais pas votre passion, mais trouvez un nom de domaine qui atteindra votre public. ";
	public static final String appelerP2 = "C'est bon si c'est court. ";
	public static final String appelerP3 = "Que ce soit un .com, ou .org, ou .fr, tout dépend de vous aussi. ";
	public static final String appelerP4 = "Créez un endroit dont vous serez fier un jour ! ";
	public static final String appelerP = appelerP1 + appelerP2 + appelerP3 + appelerP4;

	/**	L'entité « appeler »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse appeler = new QuestionReponse();
	public Couverture<QuestionReponse> appelerCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("appeler").o(appeler);

	/**	<br/>L'entité « appeler »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:appeler">Trouver l'entité appeler dans Solr</a>
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

	public static final String apres1Question1 = "Qu'est-ce que je fais après j'ai acheté un nom de domaine ? ";
	public static final String apres1Question = apres1Question1;
	public static final String apres1QuestionCourt1 = "Quoi faire après j'ai acheté un nom de domaine ? ";
	public static final String apres1QuestionCourt = apres1QuestionCourt1;
	public static final String apres1Reponse1 = "Gérer votre domaine. ";
	public static final String apres1Reponse = apres1Reponse1;
	public static final String apres1ReponseCourt1 = "Gérer votre domaine";
	public static final String apres1ReponseCourt = apres1ReponseCourt1;
	public static final String apres1P1 = "Laissez-moi vous montrer comment gérer un nom de domaine. ";
	public static final String apres1P2 = "Je vais me connecter au site de mon propre enregistreur, ";
	public static final String apres1P3 = ". ";
	public static final String apres1P = apres1P1 + apres1P2 + apres1P3;

	/**	L'entité « apres1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse apres1 = new QuestionReponse();
	public Couverture<QuestionReponse> apres1Couverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("apres1").o(apres1);

	/**	<br/>L'entité « apres1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:apres1">Trouver l'entité apres1 dans Solr</a>
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

	public static final String apres2P1 = "Je clique sur « Login ». ";
	public static final String apres2P2 = "Je clique encore sur « Login ». ";
	public static final String apres2P3 = "Je clique sur « DOMAIN NAMES ». ";
	public static final String apres2P4 = "Et là vous pouvez voir mes noms de domaine qui sont encore vivants, et ceux qui sont morts. ";
	public static final String apres2P5 = "Ainsi, les domaines expirent chaque année et peuvent être renouvelés chaque année. ";
	public static final String apres2P6 = "Je peux également gérer mon site, je clique sur « Manage ». ";
	public static final String apres2P = apres2P1 + apres2P2 + apres2P3 + apres2P4 + apres2P5 + apres2P6;

	/**	L'entité « apres2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres2 = new PageHtml();
	public Couverture<PageHtml> apres2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres2").o(apres2);

	/**	<br/>L'entité « apres2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:apres2">Trouver l'entité apres2 dans Solr</a>
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

	public static final String apres3P1 = "Si je clique sur « Update Domain Registrant Information », je peux mettre à jour mon nom et mon adresse pour m'assurer que je reçois du spam de tous les internautes qui ont remarqué que j'ai créé un nouveau domaine. ";
	public static final String apres3P2 = "Je recommanderais un Boîte à la poste pour votre entreprise, plutôt que votre adresse personnelle, pour plus d'intimité. ";
	public static final String apres3P = apres3P1 + apres3P2;

	/**	L'entité « apres3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres3 = new PageHtml();
	public Couverture<PageHtml> apres3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres3").o(apres3);

	/**	<br/>L'entité « apres3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:apres3">Trouver l'entité apres3 dans Solr</a>
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

	public static final String apres4P1 = "Si je reviens et clique sur « Update Name Servers », je peux rediriger mon site vers une autre société DNS que mon registraire, brinkster.com. ";
	public static final String apres4P2 = "C'est pratique pour moi, car j'utilise en fait mon fournisseur de messagerie SMTP fastmail.com comme fournisseur DNS, donc j'ai mis les serveurs de noms de mon fournisseur DNS là-bas. ";
	public static final String apres4P3 = "Vous n'avez pas besoin d'un fournisseur de DNS différent, vous pouvez également utiliser votre bureau d'enregistrement pour le courrier électronique, mais j'ai choisi Fastmail pour leur confidentialité et leur excellente interface de messagerie. ";
	public static final String apres4P = apres4P1 + apres4P2 + apres4P3;

	/**	L'entité « apres4 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres4 = new PageHtml();
	public Couverture<PageHtml> apres4Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres4").o(apres4);

	/**	<br/>L'entité « apres4 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:apres4">Trouver l'entité apres4 dans Solr</a>
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

	public static final String apres5P1 = "Dans un futur leçon, nous parlerons de la création d'une adresse IP statique afin que les utilisateurs puissent trouver votre serveur Web, sur votre ordinateur, sur votre domaine. ";
	public static final String apres5P2 = "Lorsque vous avez cela, vous pouvez demander à l'équipe de support de votre enregistreur, de créer pour vous des « enregistrements A » sur votre adresse IP statique. ";
	public static final String apres5P3 = "Par exemple, je demanderais que deux enregistrements A soient créés pour « computate.org » et « *.computate.org » sur mon adresse IP statique. ";
	public static final String apres5P4 = "Mais comme j'utilise fastmail pour mon DNS, je peux créer mes propres enregistrements A pour chacun de mes domaines dans mon compte, ce qui est utile. ";
	public static final String apres5P = apres5P1 + apres5P2 + apres5P3 + apres5P4;

	/**	L'entité « apres5 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml apres5 = new PageHtml();
	public Couverture<PageHtml> apres5Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("apres5").o(apres5);

	/**	<br/>L'entité « apres5 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:apres5">Trouver l'entité apres5 dans Solr</a>
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

	public static final String plusTardQuestion1 = "Puis-je commencer à développer mon site localement avant de choisir mon nom de domaine ? ";
	public static final String plusTardQuestion = plusTardQuestion1;
	public static final String plusTardQuestionCourt1 = "Puis-je choisir un nom de domaine plus tard ? ";
	public static final String plusTardQuestionCourt = plusTardQuestionCourt1;
	public static final String plusTardReponse1 = "Le nom d'hôte de votre ordinateur dépendra de votre nom de domaine. ";
	public static final String plusTardReponse = plusTardReponse1;
	public static final String plusTardReponseCourt1 = "Le nom d'hôte de votre ordinateur le dépendra";
	public static final String plusTardReponseCourt = plusTardReponseCourt1;
	public static final String plusTardP1 = "Si vous ne connaissez pas votre nom de domaine, cela vous gâchera plus tard. ";
	public static final String plusTardP2 = "Avoir un nom d'hôte qui est un sous-domaine de votre nom de domaine facilite le développement et la mise en ligne de votre site. ";
	public static final String plusTardP3 = "Vous pouvez attribuer à vos ordinateurs des noms d'hôtes qui sont des sous-domaines de votre propre nom de domaine afin de faciliter le développement et l'affichage local et public de votre site à partir de la même URL. ";
	public static final String plusTardP4 = "J'aime créer un répertoire pour votre nom de domaine pour stocker des certificats SSL et d'autres fichiers spécifiques au domaine au même endroit pour être synchronisé avec tous vos ordinateurs. ";
	public static final String plusTardP5 = "Alors, au lieu de vous compliquer la vie, profitez de cette opportunité pour acheter votre nom de domaine, c'est moins de 20 euros par an! ";
	public static final String plusTardP6 = "Vous pouvez maintenant continuer à lancer votre propre site Web avec succès sur votre propre ordinateur. ";
	public static final String plusTardP = plusTardP1 + plusTardP2 + plusTardP3 + plusTardP4 + plusTardP5 + plusTardP6;

	/**	L'entité « plusTard »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse plusTard = new QuestionReponse();
	public Couverture<QuestionReponse> plusTardCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("plusTard").o(plusTard);

	/**	<br/>L'entité « plusTard »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:plusTard">Trouver l'entité plusTard dans Solr</a>
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

	/////////////////////////
	// leconRecherche_frFR //
	/////////////////////////

	/**	L'entité « leconRecherche_frFR »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> leconRecherche_frFR = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> leconRecherche_frFRCouverture = new Couverture<List<String>>().p(this).c(List.class).var("leconRecherche_frFR").o(leconRecherche_frFR);

	/**	<br/>L'entité « leconRecherche_frFR »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconRecherche_frFR">Trouver l'entité leconRecherche_frFR dans Solr</a>
	 * <br/>
	 * @param leconRecherche_frFR est l'entité déjà construit. 
	 **/
	protected abstract void _leconRecherche_frFR(List<String> l);

	public List<String> getLeconRecherche_frFR() {
		return leconRecherche_frFR;
	}

	public void setLeconRecherche_frFR(List<String> leconRecherche_frFR) {
		this.leconRecherche_frFR = leconRecherche_frFR;
		this.leconRecherche_frFRCouverture.dejaInitialise = true;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_frFR(String...objets) {
		for(String o : objets) {
			addLeconRecherche_frFR(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_frFR(String o) {
		if(o != null && !leconRecherche_frFR.contains(o))
			this.leconRecherche_frFR.add(o);
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine setLeconRecherche_frFR(JsonArray objets) {
		leconRecherche_frFR.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addLeconRecherche_frFR(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	protected C001L001ChoisirNomDomaine leconRecherche_frFRInit() {
		if(!leconRecherche_frFRCouverture.dejaInitialise) {
			_leconRecherche_frFR(leconRecherche_frFR);
		}
		leconRecherche_frFRCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	public List<String> solrLeconRecherche_frFR() {
		return leconRecherche_frFR;
	}

	public String strLeconRecherche_frFR() {
		return leconRecherche_frFR == null ? "" : leconRecherche_frFR.toString();
	}

	public String nomAffichageLeconRecherche_frFR() {
		return null;
	}

	public String htmTooltipLeconRecherche_frFR() {
		return null;
	}

	public String htmLeconRecherche_frFR() {
		return leconRecherche_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strLeconRecherche_frFR());
	}

	/////////////////////////
	// leconRecherche_enUS //
	/////////////////////////

	/**	L'entité « leconRecherche_enUS »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> leconRecherche_enUS = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> leconRecherche_enUSCouverture = new Couverture<List<String>>().p(this).c(List.class).var("leconRecherche_enUS").o(leconRecherche_enUS);

	/**	<br/>L'entité « leconRecherche_enUS »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconRecherche_enUS">Trouver l'entité leconRecherche_enUS dans Solr</a>
	 * <br/>
	 * @param leconRecherche_enUS est l'entité déjà construit. 
	 **/
	protected abstract void _leconRecherche_enUS(List<String> l);

	public List<String> getLeconRecherche_enUS() {
		return leconRecherche_enUS;
	}

	public void setLeconRecherche_enUS(List<String> leconRecherche_enUS) {
		this.leconRecherche_enUS = leconRecherche_enUS;
		this.leconRecherche_enUSCouverture.dejaInitialise = true;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_enUS(String...objets) {
		for(String o : objets) {
			addLeconRecherche_enUS(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine addLeconRecherche_enUS(String o) {
		if(o != null && !leconRecherche_enUS.contains(o))
			this.leconRecherche_enUS.add(o);
		return (C001L001ChoisirNomDomaine)this;
	}
	public C001L001ChoisirNomDomaine setLeconRecherche_enUS(JsonArray objets) {
		leconRecherche_enUS.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addLeconRecherche_enUS(o);
		}
		return (C001L001ChoisirNomDomaine)this;
	}
	protected C001L001ChoisirNomDomaine leconRecherche_enUSInit() {
		if(!leconRecherche_enUSCouverture.dejaInitialise) {
			_leconRecherche_enUS(leconRecherche_enUS);
		}
		leconRecherche_enUSCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	public List<String> solrLeconRecherche_enUS() {
		return leconRecherche_enUS;
	}

	public String strLeconRecherche_enUS() {
		return leconRecherche_enUS == null ? "" : leconRecherche_enUS.toString();
	}

	public String nomAffichageLeconRecherche_enUS() {
		return null;
	}

	public String htmTooltipLeconRecherche_enUS() {
		return null;
	}

	public String htmLeconRecherche_enUS() {
		return leconRecherche_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strLeconRecherche_enUS());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaine = false;

	public C001L001ChoisirNomDomaine initLoinC001L001ChoisirNomDomaine(RequeteSiteFrFR requeteSite_) {
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
		leconRecherche_frFRInit();
		leconRecherche_enUSInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L001ChoisirNomDomaine(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaine(RequeteSiteFrFR requeteSite_) {
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

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaine(requeteSite_);
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
			case "leconRecherche_frFR":
				return oC001L001ChoisirNomDomaine.leconRecherche_frFR;
			case "leconRecherche_enUS":
				return oC001L001ChoisirNomDomaine.leconRecherche_enUS;
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
			RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
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
		if(leconRecherche_frFR != null) {
			for(String o : leconRecherche_frFR) {
				document.addField("leconRecherche_frFR_text_frFR", o);
			}
		}
		if(leconRecherche_enUS != null) {
			for(String o : leconRecherche_enUS) {
				document.addField("leconRecherche_enUS_text_enUS", o);
			}
		}
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L001ChoisirNomDomaine() throws Exception {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L001ChoisirNomDomaine(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L001ChoisirNomDomaine(solrDocument);
	}
	public void stockerC001L001ChoisirNomDomaine(SolrDocument solrDocument) {
		C001L001ChoisirNomDomaine oC001L001ChoisirNomDomaine = (C001L001ChoisirNomDomaine)this;

		List<String> leconRecherche_frFR = (List<String>)solrDocument.get("leconRecherche_frFR_stored_strings");
		if(leconRecherche_frFR != null)
			oC001L001ChoisirNomDomaine.leconRecherche_frFR.addAll(leconRecherche_frFR);

		List<String> leconRecherche_enUS = (List<String>)solrDocument.get("leconRecherche_enUS_stored_strings");
		if(leconRecherche_enUS != null)
			oC001L001ChoisirNomDomaine.leconRecherche_enUS.addAll(leconRecherche_enUS);

		super.stockerC001Lecon(solrDocument);
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
		return Objects.hash(super.hashCode(), leconRecherche_frFR, leconRecherche_enUS);
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
		return super.equals(o)
				&& Objects.equals( leconRecherche_frFR, that.leconRecherche_frFR )
				&& Objects.equals( leconRecherche_enUS, that.leconRecherche_enUS );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaine {");
		sb.append( "leconRecherche_frFR: " ).append(leconRecherche_frFR);
		sb.append( ", leconRecherche_enUS: " ).append(leconRecherche_enUS);
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L001ChoisirNomDomaineVals = new String[] { introP1, introP2, moiP1, moiP2, moiP3, aLAvanceQuestion1, aLAvanceQuestionCourt1, aLAvanceReponse1, aLAvanceReponseCourt1, aLAvanceP1, aLAvanceP2, aLAvanceP3, aLAvanceP4, aLAvanceP5, acheterQuestion1, acheterQuestionCourt1, acheterReponse1, acheterReponseCourt1, acheterP1, acheterP2, acheterP3, acheterP4, acheterP5, appelerQuestion1, appelerQuestionCourt1, appelerReponse1, appelerReponseCourt1, appelerP1, appelerP2, appelerP3, appelerP4, apres1Question1, apres1QuestionCourt1, apres1Reponse1, apres1ReponseCourt1, apres1P1, apres1P2, apres1P3, apres2P1, apres2P2, apres2P3, apres2P4, apres2P5, apres2P6, apres3P1, apres3P2, apres4P1, apres4P2, apres4P3, apres5P1, apres5P2, apres5P3, apres5P4, plusTardQuestion1, plusTardQuestionCourt1, plusTardReponse1, plusTardReponseCourt1, plusTardP1, plusTardP2, plusTardP3, plusTardP4, plusTardP5, plusTardP6 };
}
