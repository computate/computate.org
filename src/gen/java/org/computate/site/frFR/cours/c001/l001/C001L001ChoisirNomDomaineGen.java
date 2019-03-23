package org.computate.site.frFR.cours.c001.l001;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.apache.solr.client.solrj.SolrClient;
import java.util.ArrayList;
import java.util.Objects;
import org.computate.site.frFR.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.page.parti.PageParagraphe;
import java.util.List;
import org.computate.site.frFR.page.parti.PagePart;
import java.lang.String;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
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

	/////////////////
	// pageVideoId //
	/////////////////

	/**	L'entité « pageVideoId »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageVideoId;
	public Couverture<String> pageVideoIdCouverture = new Couverture<String>().p(this).c(String.class).var("pageVideoId").o(pageVideoId);

	/**	<br/>L'entité « pageVideoId »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageVideoId">Trouver l'entité pageVideoId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageVideoId(Couverture<String> c);

	public String getPageVideoId() {
		return pageVideoId;
	}

	public void setPageVideoId(String pageVideoId) {
		this.pageVideoId = pageVideoId;
		this.pageVideoIdCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine pageVideoIdInit() {
		if(!pageVideoIdCouverture.dejaInitialise) {
			_pageVideoId(pageVideoIdCouverture);
			if(pageVideoId == null)
				setPageVideoId(pageVideoIdCouverture.o);
		}
		pageVideoIdCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	public String solrPageVideoId() {
		return pageVideoId;
	}

	public String strPageVideoId() {
		return pageVideoId == null ? "" : pageVideoId;
	}

	public String nomAffichagePageVideoId() {
		return null;
	}

	public String htmTooltipPageVideoId() {
		return null;
	}

	public String htmPageVideoId() {
		return pageVideoId == null ? "" : StringEscapeUtils.escapeHtml4(strPageVideoId());
	}

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
		pageVideoIdInit();
		introInit();
		moiInit();
		aLAvanceInit();
		acheterInit();
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
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaine(requeteSite_);
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
			case "pageVideoId":
				return oC001L001ChoisirNomDomaine.pageVideoId;
			case "intro":
				return oC001L001ChoisirNomDomaine.intro;
			case "moi":
				return oC001L001ChoisirNomDomaine.moi;
			case "aLAvance":
				return oC001L001ChoisirNomDomaine.aLAvance;
			case "acheter":
				return oC001L001ChoisirNomDomaine.acheter;
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
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), pageVideoId);
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
				&& Objects.equals( pageVideoId, that.pageVideoId );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaine {");
		sb.append( "pageVideoId: \"" ).append(pageVideoId).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
