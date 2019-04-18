package org.computate.site.enUS.page.faq;

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
import java.lang.String;
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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageFaqGen<DEV> extends Article {

	public static final String PageFaq_H1 = "Have some questions about computate.org? ";
	public static final String PageFaq_H2 = "computate.org frequently asked questions (FAQ). ";
	public static final String PageFaq_Couleur = "green";
	public static final String PageFaq_IconeGroupe = "regular";
	public static final String PageFaq_IconeNom = "book";
	public static final String PageFaqFrFRPage_Uri = "/frFR/faq";
	public static final String PageFaqFrFRPage_ImageUri = "/png/frFR/faq-999.png";
	public static final String PageFaqEnUSPage_Uri = "/enUS/faq";
	public static final String PageFaqEnUSPage_ImageUri = "/png/enUS/faq-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_enUS">Trouver l'entité pageUri_enUS dans Solr</a>
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
	protected PageFaq pageUri_enUSInit() {
		if(!pageUri_enUSCouverture.dejaInitialise) {
			_pageUri_enUS(pageUri_enUSCouverture);
			if(pageUri_enUS == null)
				setPageUri_enUS(pageUri_enUSCouverture.o);
		}
		pageUri_enUSCouverture.dejaInitialise(true);
		return (PageFaq)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_frFR">Trouver l'entité pageUri_frFR dans Solr</a>
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
	protected PageFaq pageUri_frFRInit() {
		if(!pageUri_frFRCouverture.dejaInitialise) {
			_pageUri_frFR(pageUri_frFRCouverture);
			if(pageUri_frFR == null)
				setPageUri_frFR(pageUri_frFRCouverture.o);
		}
		pageUri_frFRCouverture.dejaInitialise(true);
		return (PageFaq)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
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
	protected PageFaq listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticle);
		}
		listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (PageFaq)this;
	}

	//////////
	// i18n //
	//////////

	public static final String i18nQuestion1 = "Why is your site in French? ";
	public static final String i18nQuestion = i18nQuestion1;
	public static final String i18nQuestionCourt1 = "Why is your site in French? ";
	public static final String i18nQuestionCourt = i18nQuestionCourt1;
	public static final String i18nReponse1 = "Internationalization is important and the world deserves good software documentation. ";
	public static final String i18nReponse = i18nReponse1;
	public static final String i18nReponseCourt1 = "Internationalization is important and the world deserves good software documentation. ";
	public static final String i18nReponseCourt = i18nReponseCourt1;
	public static final String i18nP1 = "Internationalization is important and the world deserves good software documentation. ";
	public static final String i18nP2 = "I've spent four and a half years in French speaking countries and it's important for me to practice my French. ";
	public static final String i18nP3 = "I love the French and the time I spent in France, and I love the Québécois and the time I spent in Québec. ";
	public static final String i18nP4 = "I know the challenges building good software systems where the country speaks another language besides English. ";
	public static final String i18nP5 = "Computate.org breaks those barriers and provides a consistent documentation in French and English and other languages in the future. ";
	public static final String i18nP = i18nP1 + i18nP2 + i18nP3 + i18nP4 + i18nP5;

	/**	L'entité « i18n »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse i18n = new QuestionReponse();
	public Couverture<QuestionReponse> i18nCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("i18n").o(i18n);

	/**	<br/>L'entité « i18n »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.faq.PageFaq&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:i18n">Trouver l'entité i18n dans Solr</a>
	 * <br/>
	 * @param i18n est l'entité déjà construit. 
	 **/
	protected abstract void _i18n(QuestionReponse o);

	public QuestionReponse getI18n() {
		return i18n;
	}

	public void setI18n(QuestionReponse i18n) {
		this.i18n = i18n;
		this.i18nCouverture.dejaInitialise = true;
	}
	protected PageFaq i18nInit() {
		if(i18n != null) {
			((PageFaq)this).avantPagePart(i18n, "i18n");
			((PageFaq)this).avantPagePart(i18n, "i18n");
		}
		if(!i18nCouverture.dejaInitialise) {
			_i18n(i18n);
		}
		i18n.initLoinPourClasse(requeteSite_);
		i18nCouverture.dejaInitialise(true);
		return (PageFaq)this;
	}
	public void htmlBodyI18n(QuestionReponse o) {
	}
	public void htmlBodyI18n() {
		i18n.htmlAvant();
		htmlBodyI18n(i18n);
		i18n.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageFaq = false;

	public PageFaq initLoinPageFaq(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageFaq) {
			dejaInitialisePageFaq = true;
			initLoinPageFaq();
		}
		return (PageFaq)this;
	}

	public void initLoinPageFaq() {
		super.initLoinArticle(requeteSite_);
		initPageFaq();
	}

	public void initPageFaq() {
		pageUri_enUSInit();
		pageUri_frFRInit();
		listeArticleInit();
		i18nInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageFaq(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageFaq(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
		if(i18n != null)
			i18n.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageFaq(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageFaq(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageFaq(String var) throws Exception {
		PageFaq oPageFaq = (PageFaq)this;
		switch(var) {
			case "pageUri_enUS":
				return oPageFaq.pageUri_enUS;
			case "pageUri_frFR":
				return oPageFaq.pageUri_frFR;
			case "listeArticle":
				return oPageFaq.listeArticle;
			case "i18n":
				return oPageFaq.i18n;
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
				o = attribuerPageFaq(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageFaq(String var, Object val) {
		PageFaq oPageFaq = (PageFaq)this;
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
					o = definirPageFaq(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageFaq(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/frFR/faq?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/faq-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/faq-999.png"));
				System.out.println("PageFaqFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/enUS/faq?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/faq-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/faq-999.png"));
				System.out.println("PageFaqEnUSPage");
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
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.faq.PageFaq"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageFaq o = new PageFaq();
			o.requeteSitePageFaq(requeteSite);
			o.initLoinPageFaq(requeteSite);
			o.indexerPageFaq();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerPageFaq();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerPageFaq(document);
	}

	public void indexerPageFaq(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageFaq(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageFaq() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageFaq(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageFaq(SolrInputDocument document) throws Exception {
		super.indexerArticle(document);

	}

	public void desindexerPageFaq() throws Exception {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinPageFaq(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerPageFaq(solrDocument);
	}
	public void stockerPageFaq(SolrDocument solrDocument) {
		PageFaq oPageFaq = (PageFaq)this;

		super.stockerArticle(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageFaq();
	}

	public void htmlBodyCourtPageFaq() {
		if(i18n != null)
			i18n.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageFaq();
		super.htmlBody();
	}

	public void htmlBodyPageFaq() {
		((PageFaq)this).htmlBodyI18n();
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
		if(!(o instanceof PageFaq))
			return false;
		PageFaq that = (PageFaq)o;
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
		sb.append("PageFaq {");
		sb.append( "pageUri_enUS: \"" ).append(pageUri_enUS).append( "\"" );
		sb.append( ", pageUri_frFR: \"" ).append(pageUri_frFR).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] PageFaqVals = new String[] { i18nQuestion1, i18nQuestionCourt1, i18nReponse1, i18nReponseCourt1, i18nP1, i18nP2, i18nP3, i18nP4, i18nP5 };
}
