package org.computate.site.enUS.page.apropos;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.article.Article;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import org.computate.site.enUS.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposGen<DEV> extends Article {

	public static final String PageAPropos_H1 = "Who is Christopher Tate? ";
	public static final String PageAPropos_H2 = "All about me. ";
	public static final String PageAPropos_Titre = "Who is Christopher Tate? All about me. ";
	public static final String PageAPropos_Couleur = "green";
	public static final String PageAPropos_IconeGroupe = "regular";
	public static final String PageAPropos_IconeNom = "book";
	public static final String PageAProposFrFRPage_Uri = "/frFR/apropos";
	public static final String PageAProposFrFRPage_ImageUri = "/png/frFR/apropos-999.png";
	public static final String PageAProposEnUSPage_Uri = "/enUS/about";
	public static final String PageAProposEnUSPage_ImageUri = "/png/enUS/about-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
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

	public static final String ouVenezVousQuestion1 = "Where are you from? ";
	public static final String ouVenezVousQuestion = ouVenezVousQuestion1;
	public static final String ouVenezVousQuestionCourt1 = "Where are you from? ";
	public static final String ouVenezVousQuestionCourt = ouVenezVousQuestionCourt1;
	public static final String ouVenezVousReponse1 = "I am from Utah and a wanderer at heart. ";
	public static final String ouVenezVousReponse = ouVenezVousReponse1;
	public static final String ouVenezVousReponseCourt1 = "I am from Utah and a wanderer at heart. ";
	public static final String ouVenezVousReponseCourt = ouVenezVousReponseCourt1;
	public static final String ouVenezVousP1 = "I love spending time in the great outdoors with my family. ";
	public static final String ouVenezVousP2 = "I've also lived in Florida, Idaho, Ontario, Quebec and France. ";
	public static final String ouVenezVousP3 = "I love the time I lived and worked in other countries, and the ways open source software brings the world together. ";
	public static final String ouVenezVousP4 = "I know the challenges of building good software systems in non-English speaking countries. ";
	public static final String ouVenezVousP = ouVenezVousP1 + ouVenezVousP2 + ouVenezVousP3 + ouVenezVousP4;

	/**	L'entité « ouVenezVous »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse ouVenezVous = new QuestionReponse();
	public Couverture<QuestionReponse> ouVenezVousCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("ouVenezVous").o(ouVenezVous);

	/**	<br/>L'entité « ouVenezVous »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:ouVenezVous">Trouver l'entité ouVenezVous dans Solr</a>
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
		{ e("p").a("class", " ouVenezVousP ").f();
			sx(ouVenezVousP1);
			sx(ouVenezVousP2);
			sx(ouVenezVousP3);
			sx(ouVenezVousP4);
		} g("p");
	}
	public void htmlBodyOuVenezVous() {
		ouVenezVous.htmlAvant();
		htmlBodyOuVenezVous(ouVenezVous);
		ouVenezVous.htmlApres();
	}

	//////////////////
	// informatique //
	//////////////////

	public static final String informatiqueQuestion1 = "How did you learn computer programming? ";
	public static final String informatiqueQuestion = informatiqueQuestion1;
	public static final String informatiqueQuestionCourt1 = "How did you learn computer programming? ";
	public static final String informatiqueQuestionCourt = informatiqueQuestionCourt1;
	public static final String informatiqueReponse1 = "A love for computers all my life. ";
	public static final String informatiqueReponse = informatiqueReponse1;
	public static final String informatiqueReponseCourt1 = "A love for computers all my life. ";
	public static final String informatiqueReponseCourt = informatiqueReponseCourt1;
	public static final String informatiqueP1 = "My dad has been a Lotus Notes database programmer as long as I can remember. ";
	public static final String informatiqueP2 = "He always had a nice computer with the latest Microsoft suite at home for the family to use. ";
	public static final String informatiqueP3 = "I spent hours every day figuring out everything I could possibly do on the computer. ";
	public static final String informatiqueP4 = "I became familiar with every application, every directory, every file, every menu item, every keyboard shortcut. ";
	public static final String informatiqueP5 = "I asked my dad many important questions, like: \"how do I write code?\" \"How do I make a database?\" ";
	public static final String informatiqueP6 = "I was then gifted a large Visual Basic manual, and he pointed me to Microsoft Access. ";
	public static final String informatiqueP = informatiqueP1 + informatiqueP2 + informatiqueP3 + informatiqueP4 + informatiqueP5 + informatiqueP6;

	/**	L'entité « informatique »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse informatique = new QuestionReponse();
	public Couverture<QuestionReponse> informatiqueCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("informatique").o(informatique);

	/**	<br/>L'entité « informatique »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:informatique">Trouver l'entité informatique dans Solr</a>
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
		{ e("p").a("class", " informatiqueP ").f();
			sx(informatiqueP1);
			sx(informatiqueP2);
			sx(informatiqueP3);
			sx(informatiqueP4);
			sx(informatiqueP5);
			sx(informatiqueP6);
		} g("p");
	}
	public void htmlBodyInformatique() {
		informatique.htmlAvant();
		htmlBodyInformatique(informatique);
		informatique.htmlApres();
	}

	////////////
	// emploi //
	////////////

	public static final String emploiQuestion1 = "How did you start working as a computer programmer? ";
	public static final String emploiQuestion = emploiQuestion1;
	public static final String emploiQuestionCourt1 = "How did you start working as a computer programmer? ";
	public static final String emploiQuestionCourt = emploiQuestionCourt1;
	public static final String emploiReponse1 = "The drive to finish each project, and be at the next opportunity to grow my career. ";
	public static final String emploiReponse = emploiReponse1;
	public static final String emploiReponseCourt1 = "The drive to finish each project, and be at the next opportunity to grow my career. ";
	public static final String emploiReponseCourt = emploiReponseCourt1;
	public static final String emploiP1 = "I started writing calculator programs and games on my TI-86 calculator. ";
	public static final String emploiP2 = "I went on to study Computer Science at University. ";
	public static final String emploiP3 = "At the same time, I became the part time computer guy for a local humanitarian organization, doing my best to solve world problems with databases. ";
	public static final String emploiP4 = "After graduation, I started as a Software Consultant and worked on many exciting projects at large companies. ";
	public static final String emploiP5 = "After 5 years, I had the opportunity to take a job in France, where I worked with a très petite société, which specialized in open source search technology, specifically Lucene. ";
	public static final String emploiP6 = "I then worked with a Linux training company in Utah where I became very familiar with the whys of the origin of Linux. ";
	public static final String emploiP7 = "My love for consulting, my experience, and being at the right place at the right time then led me to Red Hat. ";
	public static final String emploiP8 = "I have found my people, at long last, here at Red Hat and I am here to stay. ";
	public static final String emploiP = emploiP1 + emploiP2 + emploiP3 + emploiP4 + emploiP5 + emploiP6 + emploiP7 + emploiP8;

	/**	L'entité « emploi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse emploi = new QuestionReponse();
	public Couverture<QuestionReponse> emploiCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("emploi").o(emploi);

	/**	<br/>L'entité « emploi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:emploi">Trouver l'entité emploi dans Solr</a>
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
		{ e("p").a("class", " emploiP ").f();
			sx(emploiP1);
			sx(emploiP2);
			sx(emploiP3);
			sx(emploiP4);
			sx(emploiP5);
			sx(emploiP6);
			sx(emploiP7);
			sx(emploiP8);
		} g("p");
	}
	public void htmlBodyEmploi() {
		emploi.htmlAvant();
		htmlBodyEmploi(emploi);
		emploi.htmlApres();
	}

	////////////////
	// opensource //
	////////////////

	public static final String opensourceQuestion1 = "How did you become so passionate about open source? ";
	public static final String opensourceQuestion = opensourceQuestion1;
	public static final String opensourceQuestionCourt1 = "How did you become so passionate about open source? ";
	public static final String opensourceQuestionCourt = opensourceQuestionCourt1;
	public static final String opensourceReponse1 = "The freedom to build upon greatness. ";
	public static final String opensourceReponse = opensourceReponse1;
	public static final String opensourceReponseCourt1 = "The freedom to build upon greatness. ";
	public static final String opensourceReponseCourt = opensourceReponseCourt1;
	public static final String opensourceP1 = "I met my first Linux computer at the University Linux computer lab, where I figured only the noble wizards of computer programming lived and slept. ";
	public static final String opensourceP2 = "Around the same time, my cousin introduced me to Linux, and gave me some encouragement to try it myself. ";
	public static final String opensourceP3 = "One night, after realizing that Microsoft and the .NET Framework would forsake me after graduation with exorbitant fees, I made the switch. ";
	public static final String opensourceP4 = "I backed up my digital life on an expensive zip disk from the bookstore and installed Ubuntu Linux, wiping Microsoft out of my personal life forever. ";
	public static final String opensourceP5 = "I never looked back, and never regretted that decision. ";
	public static final String opensourceP = opensourceP1 + opensourceP2 + opensourceP3 + opensourceP4 + opensourceP5;

	/**	L'entité « opensource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse opensource = new QuestionReponse();
	public Couverture<QuestionReponse> opensourceCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("opensource").o(opensource);

	/**	<br/>L'entité « opensource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:opensource">Trouver l'entité opensource dans Solr</a>
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
		{ e("p").a("class", " opensourceP ").f();
			sx(opensourceP1);
			sx(opensourceP2);
			sx(opensourceP3);
			sx(opensourceP4);
			sx(opensourceP5);
		} g("p");
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

	public PageAPropos initLoinPageAPropos(RequeteSiteEnUS requeteSite_) {
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
		listeArticleInit();
		ouVenezVousInit();
		informatiqueInit();
		emploiInit();
		opensourceInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageAPropos(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageAPropos(RequeteSiteEnUS requeteSite_) {
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

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/apropos?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/apropos-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/apropos-999.png"));
				System.out.println("PageAProposFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/about?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/about-999.png"));
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
			RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.apropos.PageAPropos"));
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
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
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
		return Objects.hash(super.hashCode());
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
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PageAPropos {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageAProposVals = new String[] { ouVenezVousQuestion1, ouVenezVousQuestionCourt1, ouVenezVousReponse1, ouVenezVousReponseCourt1, ouVenezVousP1, ouVenezVousP2, ouVenezVousP3, ouVenezVousP4, informatiqueQuestion1, informatiqueQuestionCourt1, informatiqueReponse1, informatiqueReponseCourt1, informatiqueP1, informatiqueP2, informatiqueP3, informatiqueP4, informatiqueP5, informatiqueP6, emploiQuestion1, emploiQuestionCourt1, emploiReponse1, emploiReponseCourt1, emploiP1, emploiP2, emploiP3, emploiP4, emploiP5, emploiP6, emploiP7, emploiP8, opensourceQuestion1, opensourceQuestionCourt1, opensourceReponse1, opensourceReponseCourt1, opensourceP1, opensourceP2, opensourceP3, opensourceP4, opensourceP5 };
}