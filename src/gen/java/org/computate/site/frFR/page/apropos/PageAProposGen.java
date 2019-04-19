package org.computate.site.frFR.page.apropos;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.couverture.Couverture;
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
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import org.computate.site.frFR.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true">Trouver la classe opensource dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposGen<DEV> extends Article {

	public static final String PageAPropos_H1 = "Qui est Christopher Tate et computate.org ? ";
	public static final String PageAPropos_H2 = "Tout à propos de moi et mon site Web. ";
	public static final String PageAPropos_Titre = "Qui est Christopher Tate et computate.org ? Tout à propos de moi et mon site Web. ";
	public static final String PageAPropos_Couleur = "green";
	public static final String PageAPropos_IconeGroupe = "regular";
	public static final String PageAPropos_IconeNom = "book";
	public static final String PageAProposFrFRPage_Uri = "/frFR/apropos";
	public static final String PageAProposFrFRPage_ImageUri = "/png/frFR/apropos-999.png";
	public static final String PageAProposEnUSPage_Uri = "/enUS/about";
	public static final String PageAProposEnUSPage_ImageUri = "/png/enUS/about-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUri_enUS">Trouver l'entité pageUri_enUS dans Solr</a>
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
	protected PageAPropos pageUri_enUSInit() {
		if(!pageUri_enUSCouverture.dejaInitialise) {
			_pageUri_enUS(pageUri_enUSCouverture);
			if(pageUri_enUS == null)
				setPageUri_enUS(pageUri_enUSCouverture.o);
		}
		pageUri_enUSCouverture.dejaInitialise(true);
		return (PageAPropos)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUri_frFR">Trouver l'entité pageUri_frFR dans Solr</a>
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
	protected PageAPropos pageUri_frFRInit() {
		if(!pageUri_frFRCouverture.dejaInitialise) {
			_pageUri_frFR(pageUri_frFRCouverture);
			if(pageUri_frFR == null)
				setPageUri_frFR(pageUri_frFRCouverture.o);
		}
		pageUri_frFRCouverture.dejaInitialise(true);
		return (PageAPropos)this;
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

	//////////////////
	// listeArticle //
	//////////////////

	/**	L'entité « listeArticle »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Article>(). 
	 */
	protected ListeRecherche<Article> listeArticle = new ListeRecherche<Article>();
	public Couverture<ListeRecherche<Article>> listeArticleCouverture = new Couverture<ListeRecherche<Article>>().p(this).c(ListeRecherche.class).var("listeArticle").o(listeArticle);

	/**	<br/>L'entité « listeArticle »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut ListeRecherche<Article>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
	 * <br/>
	 * @param listeArticle est l'entité déjà construit. 
	 **/
	protected abstract void _listeArticle(ListeRecherche<Article> o);

	public ListeRecherche<Article> getListeArticle() {
		return listeArticle;
	}

	public void setListeArticle(ListeRecherche<Article> listeArticle) {
		this.listeArticle = listeArticle;
		this.listeArticleCouverture.dejaInitialise = true;
	}
	protected PageAPropos listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticle);
		}
		listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}

	/////////////////
	// ouVenezVous //
	/////////////////

	public static final String ouVenezVousQuestion1 = "D'où venez-vous ? ";
	public static final String ouVenezVousQuestion = ouVenezVousQuestion1;
	public static final String ouVenezVousQuestionCourt1 = "D'où venez-vous ? ";
	public static final String ouVenezVousQuestionCourt = ouVenezVousQuestionCourt1;
	public static final String ouVenezVousReponse1 = "Je suis un Américain d'Utah qui adore se balader. ";
	public static final String ouVenezVousReponse = ouVenezVousReponse1;
	public static final String ouVenezVousReponseCourt1 = "Je suis un Américain d'Utah qui adore se balader. ";
	public static final String ouVenezVousReponseCourt = ouVenezVousReponseCourt1;
	public static final String ouVenezVousP1 = "Je suis né en Utah où il fait chaud comme le désert en été et il neige en hiver. ";
	public static final String ouVenezVousP2 = "Je ne suis pas un skieur, malgré la renommée de l'Utah pour les montagnes enneigées, mais j'adore faire de la luge. ";
	public static final String ouVenezVousP3 = "Je préfère faire du vélo, crossfit et faire de la randonnée dans des montagnes avec ma famille. ";
	public static final String ouVenezVousP4 = "J'ai aussi vécu en Floride, en Idaho, en Ontario, au Québec et en France.";
	public static final String ouVenezVousP5 = "J'aime les français et les années que j'ai passé en France, j'aime les Québécois et les années que j'ai passé au Québec. ";
	public static final String ouVenezVousP6 = "Je connais les défis à créer de bons systèmes logiciels où le pays parle une autre langue que l'anglais. ";
	public static final String ouVenezVousP = ouVenezVousP1 + ouVenezVousP2 + ouVenezVousP3 + ouVenezVousP4 + ouVenezVousP5 + ouVenezVousP6;

	/**	L'entité « ouVenezVous »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse ouVenezVous = new QuestionReponse();
	public Couverture<QuestionReponse> ouVenezVousCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("ouVenezVous").o(ouVenezVous);

	/**	<br/>L'entité « ouVenezVous »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:ouVenezVous">Trouver l'entité ouVenezVous dans Solr</a>
	 * <br/>
	 * @param ouVenezVous est l'entité déjà construit. 
	 **/
	protected abstract void _ouVenezVous(QuestionReponse o);

	public QuestionReponse getOuVenezVous() {
		return ouVenezVous;
	}

	public void setOuVenezVous(QuestionReponse ouVenezVous) {
		this.ouVenezVous = ouVenezVous;
		this.ouVenezVousCouverture.dejaInitialise = true;
	}
	protected PageAPropos ouVenezVousInit() {
		if(ouVenezVous != null) {
			((PageAPropos)this).avantPagePart(ouVenezVous, "ouVenezVous");
			((PageAPropos)this).avantPagePart(ouVenezVous, "ouVenezVous");
		}
		if(!ouVenezVousCouverture.dejaInitialise) {
			_ouVenezVous(ouVenezVous);
		}
		ouVenezVous.initLoinPourClasse(requeteSite_);
		ouVenezVousCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyOuVenezVous(QuestionReponse o) {
	}
	public void htmlBodyOuVenezVous() {
		ouVenezVous.htmlAvant();
		htmlBodyOuVenezVous(ouVenezVous);
		ouVenezVous.htmlApres();
	}

	//////////////////
	// informatique //
	//////////////////

	public static final String informatiqueQuestion1 = "Comment vous avez appris l'informatique ? ";
	public static final String informatiqueQuestion = informatiqueQuestion1;
	public static final String informatiqueQuestionCourt1 = "Comment vous avez appris l'informatique ? ";
	public static final String informatiqueQuestionCourt = informatiqueQuestionCourt1;
	public static final String informatiqueReponse1 = "Une passion pour les ordinateurs toute ma vie. ";
	public static final String informatiqueReponse = informatiqueReponse1;
	public static final String informatiqueReponseCourt1 = "Une passion pour les ordinateurs toute ma vie. ";
	public static final String informatiqueReponseCourt = informatiqueReponseCourt1;
	public static final String informatiqueP1 = "Tant que je connaissais mon père, il était programmeur de bases de données Lotus Notes. ";
	public static final String informatiqueP2 = "Il avait toujours à la maison, un bon ordinateur avec la dernière suite Microsoft à la maison.";
	public static final String informatiqueP3 = "Je passais des heures, chaque jour, à imaginer tout ce que je pouvais faire sur l'ordinateur.";
	public static final String informatiqueP4 = "Chaque appli, chaque répertoire, chaque fichier, chaque élément de menu, chaque raccourci clavier, je les connais bien.";
	public static final String informatiqueP5 = "J'ai posé à mon père de nombreuses questions importantes, comme comment écrire du code? Comment créer une base de données?";
	public static final String informatiqueP6 = "J'ai reçu un grand manuel Visual Basic et il m'a indiqué Microsoft Access.";
	public static final String informatiqueP = informatiqueP1 + informatiqueP2 + informatiqueP3 + informatiqueP4 + informatiqueP5 + informatiqueP6;

	/**	L'entité « informatique »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse informatique = new QuestionReponse();
	public Couverture<QuestionReponse> informatiqueCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("informatique").o(informatique);

	/**	<br/>L'entité « informatique »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:informatique">Trouver l'entité informatique dans Solr</a>
	 * <br/>
	 * @param informatique est l'entité déjà construit. 
	 **/
	protected abstract void _informatique(QuestionReponse o);

	public QuestionReponse getInformatique() {
		return informatique;
	}

	public void setInformatique(QuestionReponse informatique) {
		this.informatique = informatique;
		this.informatiqueCouverture.dejaInitialise = true;
	}
	protected PageAPropos informatiqueInit() {
		if(informatique != null) {
			((PageAPropos)this).avantPagePart(informatique, "informatique");
			((PageAPropos)this).avantPagePart(informatique, "informatique");
		}
		if(!informatiqueCouverture.dejaInitialise) {
			_informatique(informatique);
		}
		informatique.initLoinPourClasse(requeteSite_);
		informatiqueCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyInformatique(QuestionReponse o) {
	}
	public void htmlBodyInformatique() {
		informatique.htmlAvant();
		htmlBodyInformatique(informatique);
		informatique.htmlApres();
	}

	////////////
	// emploi //
	////////////

	public static final String emploiQuestion1 = "Comment avez-vous commencé à travailler en tant que programmeur en informatique ? ";
	public static final String emploiQuestion = emploiQuestion1;
	public static final String emploiQuestionCourt1 = "Comment avez-vous commencé à travailler en tant que programmeur en informatique ? ";
	public static final String emploiQuestionCourt = emploiQuestionCourt1;
	public static final String emploiReponse1 = "La poussée de terminer chaque projet et d’être à la prochaine occasion de faire évoluer ma carrière. ";
	public static final String emploiReponse = emploiReponse1;
	public static final String emploiReponseCourt1 = "La poussée de terminer chaque projet et d’être à la prochaine occasion de faire évoluer ma carrière. ";
	public static final String emploiReponseCourt = emploiReponseCourt1;
	public static final String emploiP1 = "Depuis là, j'ai commencé à écrire des programmes et des jeux sur ma calculatrice TI-86.";
	public static final String emploiP2 = "Je savais, à partir de l'université, que j'étudierais l'informatique.";
	public static final String emploiP3 = "Au même temps, je suis devenu informaticien à temps partiel pour une société humanitaire locale CHOICE Humanitarian, j'ai aidé à résoudre des problèmes mondiaux avec une bases de données.";
	public static final String emploiP4 = "Après avoir obtenu mon diplôme en Informatique, j'ai commencé en tant que consultant en logiciels; j'ai travaillé sur de nombreux projets passionnants dans de grandes entreprises.";
	public static final String emploiP5 = "Après 5 ans, j'ai chercher un travail en France, avec mon expérience de la langue française.";
	public static final String emploiP6 = "Mon expérience en bases de données et la recherche m'a également conduit en France, où j'ai travaillé avec une très petite société spécialisée dans les technologies de recherche open source, notamment Lucene.";
	public static final String emploiP7 = "Et ensuite, dans une entreprise de formation Linux en Utah, où je me suis familiarisé avec les principes de l'origine de Linux.";
	public static final String emploiP8 = "Mon amour pour le conseil, mon expérience, et le fait d'être au bon endroit au bon moment m'ont ensuite conduit à Red Hat.";
	public static final String emploiP9 = "J'ai enfin trouvé mes collegues similaires ici chez Red Hat, et je suis là pour rester.";
	public static final String emploiP = emploiP1 + emploiP2 + emploiP3 + emploiP4 + emploiP5 + emploiP6 + emploiP7 + emploiP8 + emploiP9;

	/**	L'entité « emploi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse emploi = new QuestionReponse();
	public Couverture<QuestionReponse> emploiCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("emploi").o(emploi);

	/**	<br/>L'entité « emploi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:emploi">Trouver l'entité emploi dans Solr</a>
	 * <br/>
	 * @param emploi est l'entité déjà construit. 
	 **/
	protected abstract void _emploi(QuestionReponse o);

	public QuestionReponse getEmploi() {
		return emploi;
	}

	public void setEmploi(QuestionReponse emploi) {
		this.emploi = emploi;
		this.emploiCouverture.dejaInitialise = true;
	}
	protected PageAPropos emploiInit() {
		if(emploi != null) {
			((PageAPropos)this).avantPagePart(emploi, "emploi");
			((PageAPropos)this).avantPagePart(emploi, "emploi");
		}
		if(!emploiCouverture.dejaInitialise) {
			_emploi(emploi);
		}
		emploi.initLoinPourClasse(requeteSite_);
		emploiCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyEmploi(QuestionReponse o) {
	}
	public void htmlBodyEmploi() {
		emploi.htmlAvant();
		htmlBodyEmploi(emploi);
		emploi.htmlApres();
	}

	////////////////
	// opensource //
	////////////////

	public static final String opensourceQuestion1 = "Comment êtes-vous devenu si passionné par l'open source? ";
	public static final String opensourceQuestion = opensourceQuestion1;
	public static final String opensourceQuestionCourt1 = "Comment êtes-vous devenu si passionné par l'open source? ";
	public static final String opensourceQuestionCourt = opensourceQuestionCourt1;
	public static final String opensourceReponse1 = "La liberté de construire sur la merveille. ";
	public static final String opensourceReponse = opensourceReponse1;
	public static final String opensourceReponseCourt1 = "La liberté de construire sur la merveille. ";
	public static final String opensourceReponseCourt = opensourceReponseCourt1;
	public static final String opensourceP1 = "J'ai rencontré mon premier ordinateur Linux au laboratoire d'informatique Linux à l'Université, où je pensais que seuls les nobles magiciens de la programmation informatique vivaient et dormaient. ";
	public static final String opensourceP2 = "Vers la même époque, mon cousin lointain est venu dans la même école et était mon colocataire. ";
	public static final String opensourceP3 = "Il a lui-même utilisé Linux et m'a encouragé à l'essayer moi-même. ";
	public static final String opensourceP4 = "Une nuit, après avoir réalisé que Microsoft et le .NET Framework m'abandonnaient après l'obtention de mon diplôme, avec des frais exorbitants, j'ai opéré le changement. ";
	public static final String opensourceP5 = "J'ai sauvegardé ma vie numérique sur un disque zip coûteux de la librairie, installé Ubuntu Linux et effacé Microsoft de ma vie personnelle pour toujours. ";
	public static final String opensourceP6 = "Je n'ai jamais regardé en arrière et jamais regretté cette décision. ";
	public static final String opensourceP = opensourceP1 + opensourceP2 + opensourceP3 + opensourceP4 + opensourceP5 + opensourceP6;

	/**	L'entité « opensource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse opensource = new QuestionReponse();
	public Couverture<QuestionReponse> opensourceCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("opensource").o(opensource);

	/**	<br/>L'entité « opensource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:opensource">Trouver l'entité opensource dans Solr</a>
	 * <br/>
	 * @param opensource est l'entité déjà construit. 
	 **/
	protected abstract void _opensource(QuestionReponse o);

	public QuestionReponse getOpensource() {
		return opensource;
	}

	public void setOpensource(QuestionReponse opensource) {
		this.opensource = opensource;
		this.opensourceCouverture.dejaInitialise = true;
	}
	protected PageAPropos opensourceInit() {
		if(opensource != null) {
			((PageAPropos)this).avantPagePart(opensource, "opensource");
			((PageAPropos)this).avantPagePart(opensource, "opensource");
		}
		if(!opensourceCouverture.dejaInitialise) {
			_opensource(opensource);
		}
		opensource.initLoinPourClasse(requeteSite_);
		opensourceCouverture.dejaInitialise(true);
		return (PageAPropos)this;
	}
	public void htmlBodyOpensource(QuestionReponse o) {
	}
	public void htmlBodyOpensource() {
		opensource.htmlAvant();
		htmlBodyOpensource(opensource);
		opensource.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageAPropos = false;

	public PageAPropos initLoinPageAPropos(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageAPropos) {
			dejaInitialisePageAPropos = true;
			initLoinPageAPropos();
		}
		return (PageAPropos)this;
	}

	public void initLoinPageAPropos() {
		super.initLoinArticle(requeteSite_);
		initPageAPropos();
	}

	public void initPageAPropos() {
		pageUri_enUSInit();
		pageUri_frFRInit();
		listeArticleInit();
		ouVenezVousInit();
		informatiqueInit();
		emploiInit();
		opensourceInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPageAPropos(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAPropos(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(ouVenezVous != null)
			ouVenezVous.setRequeteSite_(requeteSite_);
		if(informatique != null)
			informatique.setRequeteSite_(requeteSite_);
		if(emploi != null)
			emploi.setRequeteSite_(requeteSite_);
		if(opensource != null)
			opensource.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePageAPropos(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageAPropos(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageAPropos(String var) throws Exception {
		PageAPropos oPageAPropos = (PageAPropos)this;
		switch(var) {
			case "pageUri_enUS":
				return oPageAPropos.pageUri_enUS;
			case "pageUri_frFR":
				return oPageAPropos.pageUri_frFR;
			case "listeArticle":
				return oPageAPropos.listeArticle;
			case "ouVenezVous":
				return oPageAPropos.ouVenezVous;
			case "informatique":
				return oPageAPropos.informatique;
			case "emploi":
				return oPageAPropos.emploi;
			case "opensource":
				return oPageAPropos.opensource;
			default:
				return super.obtenirArticle(var);
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
				o = attribuerPageAPropos(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageAPropos(String var, Object val) {
		PageAPropos oPageAPropos = (PageAPropos)this;
		switch(var) {
			default:
				return super.attribuerArticle(var, val);
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
					o = definirPageAPropos(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageAPropos(String var, String val) {
		switch(var) {
			default:
				return super.definirArticle(var, val);
		}
	}

	///////////
	// image //
	///////////

	public static void image() {
		try {
			DefaultExecutor executeur = new DefaultExecutor();
			{
				new File("/usr/local/src/computate.org-static/png/frFR").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/frFR/apropos?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/apropos-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/apropos-999.png"));
				System.out.println("PageAProposFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/enUS/about?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/about-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/about-999.png"));
				System.out.println("PageAProposEnUSPage");
				System.out.println(" * ImageLargeur.enUS: " + img.getWidth());
				System.out.println(" * ImageHauteur.enUS: " + img.getHeight());
			}
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.page.apropos.PageAPropos"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageAPropos o = new PageAPropos();
			o.requeteSitePageAPropos(requeteSite);
			o.initLoinPageAPropos(requeteSite);
			o.indexerPageAPropos();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerPageAPropos();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerPageAPropos(document);
	}

	public void indexerPageAPropos(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageAPropos(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageAPropos() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageAPropos(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageAPropos(SolrInputDocument document) throws Exception {
		super.indexerArticle(document);

	}

	public void desindexerPageAPropos() throws Exception {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinPageAPropos(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerPageAPropos(solrDocument);
	}
	public void stockerPageAPropos(SolrDocument solrDocument) {
		PageAPropos oPageAPropos = (PageAPropos)this;

		super.stockerArticle(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageAPropos();
	}

	public void htmlBodyCourtPageAPropos() {
		if(ouVenezVous != null)
			ouVenezVous.htmlBodyCourt();
		if(informatique != null)
			informatique.htmlBodyCourt();
		if(emploi != null)
			emploi.htmlBodyCourt();
		if(opensource != null)
			opensource.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAPropos();
		super.htmlBody();
	}

	public void htmlBodyPageAPropos() {
		((PageAPropos)this).htmlBodyOuVenezVous();
		((PageAPropos)this).htmlBodyInformatique();
		((PageAPropos)this).htmlBodyEmploi();
		((PageAPropos)this).htmlBodyOpensource();
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), pageUri_enUS, pageUri_frFR);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof PageAPropos))
			return false;
		PageAPropos that = (PageAPropos)o;
		return super.equals(o)
				&& Objects.equals( pageUri_enUS, that.pageUri_enUS )
				&& Objects.equals( pageUri_frFR, that.pageUri_frFR );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAPropos {");
		sb.append( "pageUri_enUS: \"" ).append(pageUri_enUS).append( "\"" );
		sb.append( ", pageUri_frFR: \"" ).append(pageUri_frFR).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageAProposVals = new String[] { ouVenezVousQuestion1, ouVenezVousQuestionCourt1, ouVenezVousReponse1, ouVenezVousReponseCourt1, ouVenezVousP1, ouVenezVousP2, ouVenezVousP3, ouVenezVousP4, ouVenezVousP5, ouVenezVousP6, informatiqueQuestion1, informatiqueQuestionCourt1, informatiqueReponse1, informatiqueReponseCourt1, informatiqueP1, informatiqueP2, informatiqueP3, informatiqueP4, informatiqueP5, informatiqueP6, emploiQuestion1, emploiQuestionCourt1, emploiReponse1, emploiReponseCourt1, emploiP1, emploiP2, emploiP3, emploiP4, emploiP5, emploiP6, emploiP7, emploiP8, emploiP9, opensourceQuestion1, opensourceQuestionCourt1, opensourceReponse1, opensourceReponseCourt1, opensourceP1, opensourceP2, opensourceP3, opensourceP4, opensourceP5, opensourceP6 };
}
