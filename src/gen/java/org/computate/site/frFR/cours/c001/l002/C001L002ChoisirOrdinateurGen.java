package org.computate.site.frFR.cours.c001.l002;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.frFR.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.frFR.page.parti.PagePart;
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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateur&fq=classeEtendGen_indexed_boolean:true">Trouver la classe aLAvance dans Solr</a>
 * <br/>
 **/
public abstract class C001L002ChoisirOrdinateurGen<DEV> extends C001Lecon {

	public static final String C001L002ChoisirOrdinateur_UnNom = "le leçon";
	public static final String C001L002ChoisirOrdinateur_NomSingulier = "leçon";
	public static final String C001L002ChoisirOrdinateur_NomPluriel = "lessons";
	public static final String C001L002ChoisirOrdinateur_H1 = "Quel type d'ordinateur dois-je avoir pour construire mon propre site Web ? ";
	public static final String C001L002ChoisirOrdinateur_H2 = "Voici les 10 considérations & les plus importantes pour l'exécution d'un site Web sur votre propre ordinateur. ";
	public static final String C001L002ChoisirOrdinateur_LesNoms = "les lessons";
	public static final String C001L002ChoisirOrdinateur_NomVar = "leçon";
	public static final String C001L002ChoisirOrdinateur_Couleur = "green";
	public static final String C001L002ChoisirOrdinateur_IconeGroupe = "regular";
	public static final String C001L002ChoisirOrdinateur_IconeNom = "book";
	public static final String C001L002ChoisirOrdinateurFrFRPage_Uri = "/frFR/cours/001/002-choisir-ordinateur";
	public static final String C001L002ChoisirOrdinateurEnUSPage_Uri = "/enUS/course/001/002-choose-computer";

	///////////
	// intro //
	///////////

	public static final String introP1 = "Envisagez-vous de créer votre propre site Web ? ";
	public static final String introP2 = "Peut-être vous demandez-vous quel type d'ordinateur il faut pour lancer votre propre site Web ? ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe intro = new PageParagraphe();
	public Couverture<PageParagraphe> introCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateur&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:intro">Trouver l'entité intro dans Solr</a>
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
	protected C001L002ChoisirOrdinateur introInit() {
		if(intro != null) {
			((C001L002ChoisirOrdinateur)this).avantPagePart(intro, "intro");
		}
		if(!introCouverture.dejaInitialise) {
			_intro(intro);
		}
		intro.initLoinPourClasse(requeteSite_);
		introCouverture.dejaInitialise(true);
		return (C001L002ChoisirOrdinateur)this;
	}

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. ";
	public static final String moiP3 = "Je vais vous expliquer le genre d'ordinateur que j'ai pour vous aider à décider. ";
	public static final String moiP = moiP1 + moiP2 + moiP3;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe moi = new PageParagraphe();
	public Couverture<PageParagraphe> moiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateur&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L002ChoisirOrdinateur moiInit() {
		if(moi != null) {
			((C001L002ChoisirOrdinateur)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L002ChoisirOrdinateur)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateur&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:aLAvance">Trouver l'entité aLAvance dans Solr</a>
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
	protected C001L002ChoisirOrdinateur aLAvanceInit() {
		if(aLAvance != null) {
			((C001L002ChoisirOrdinateur)this).avantPagePart(aLAvance, "aLAvance");
		}
		if(!aLAvanceCouverture.dejaInitialise) {
			_aLAvance(aLAvance);
		}
		aLAvance.initLoinPourClasse(requeteSite_);
		aLAvanceCouverture.dejaInitialise(true);
		return (C001L002ChoisirOrdinateur)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L002ChoisirOrdinateur = false;

	public C001L002ChoisirOrdinateur initLoinC001L002ChoisirOrdinateur(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L002ChoisirOrdinateur) {
			dejaInitialiseC001L002ChoisirOrdinateur = true;
			initLoinC001L002ChoisirOrdinateur();
		}
		return (C001L002ChoisirOrdinateur)this;
	}

	public void initLoinC001L002ChoisirOrdinateur() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L002ChoisirOrdinateur();
	}

	public void initC001L002ChoisirOrdinateur() {
		introInit();
		moiInit();
		aLAvanceInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L002ChoisirOrdinateur(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L002ChoisirOrdinateur(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		intro.setRequeteSite_(requeteSite_);
		moi.setRequeteSite_(requeteSite_);
		aLAvance.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L002ChoisirOrdinateur(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L002ChoisirOrdinateur(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L002ChoisirOrdinateur(String var) throws Exception {
		C001L002ChoisirOrdinateur oC001L002ChoisirOrdinateur = (C001L002ChoisirOrdinateur)this;
		switch(var) {
			case "intro":
				return oC001L002ChoisirOrdinateur.intro;
			case "moi":
				return oC001L002ChoisirOrdinateur.moi;
			case "aLAvance":
				return oC001L002ChoisirOrdinateur.aLAvance;
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
				o = attribuerC001L002ChoisirOrdinateur(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L002ChoisirOrdinateur(String var, Object val) {
		C001L002ChoisirOrdinateur oC001L002ChoisirOrdinateur = (C001L002ChoisirOrdinateur)this;
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
					o = definirC001L002ChoisirOrdinateur(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L002ChoisirOrdinateur(String var, String val) {
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateur"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L002ChoisirOrdinateur o = new C001L002ChoisirOrdinateur();
			o.requeteSiteC001L002ChoisirOrdinateur(requeteSite);
			o.initLoinC001L002ChoisirOrdinateur(requeteSite);
			o.indexerC001L002ChoisirOrdinateur();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001L002ChoisirOrdinateur();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001L002ChoisirOrdinateur(document);
	}

	public void indexerC001L002ChoisirOrdinateur(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L002ChoisirOrdinateur(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L002ChoisirOrdinateur() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L002ChoisirOrdinateur(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L002ChoisirOrdinateur(SolrInputDocument document) throws Exception {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L002ChoisirOrdinateur() throws Exception {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L002ChoisirOrdinateur(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L002ChoisirOrdinateur(solrDocument);
	}
	public void stockerC001L002ChoisirOrdinateur(SolrDocument solrDocument) {
		C001L002ChoisirOrdinateur oC001L002ChoisirOrdinateur = (C001L002ChoisirOrdinateur)this;

		super.stockerC001Lecon(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L002ChoisirOrdinateur();
		super.htmlBodyC001Lecon();
	}

	public void htmlBodyC001L002ChoisirOrdinateur() {
		intro.htmlBody();
		moi.htmlBody();
		aLAvance.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L002ChoisirOrdinateur();
	}

	public void htmlBodyCourtC001L002ChoisirOrdinateur() {
		intro.htmlBodyCourt();
		moi.htmlBodyCourt();
		aLAvance.htmlBodyCourt();
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
		if(!(o instanceof C001L002ChoisirOrdinateur))
			return false;
		C001L002ChoisirOrdinateur that = (C001L002ChoisirOrdinateur)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L002ChoisirOrdinateur {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L002ChoisirOrdinateurVals = new String[] { introP1, introP2, moiP1, moiP2, moiP3, aLAvanceQuestion1, aLAvanceQuestionCourt1, aLAvanceReponse1, aLAvanceReponseCourt1, aLAvanceP1, aLAvanceP2, aLAvanceP3, aLAvanceP4, aLAvanceP5 };
}
