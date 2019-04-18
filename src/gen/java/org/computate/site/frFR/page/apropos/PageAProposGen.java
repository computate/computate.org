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
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frFR.page.parti.PageParagraphe;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true">Trouver la classe moi dans Solr</a>
 * <br/>
 **/
public abstract class PageAProposGen<DEV> extends Article {

	public static final String PageAPropos_H1 = "Qui est Christopher Tate et computate.org ? ";
	public static final String PageAPropos_H2 = "Tout à propos de moi et mon site Web. ";
	public static final String PageAPropos_Couleur = "green";
	public static final String PageAPropos_IconeGroupe = "regular";
	public static final String PageAPropos_IconeNom = "book";
	public static final String PageAProposFrFRPage_Uri = "/frFR";
	public static final String PageAProposFrFRPage_ImageUri = "/png/frFR-999.png";
	public static final String PageAProposEnUSPage_Uri = "/";
	public static final String PageAProposEnUSPage_ImageUri = "/png/-999.png";

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

	///////////
	// intro //
	///////////

	public static final String introP1 = "Envisagez-vous de créer votre propre site Web ? ";
	public static final String introP2 = "Apprenez à créer votre propre site Web de manière open source. ";
	public static final String introP = introP1 + introP2;

	/**	L'entité « intro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe intro = new PageParagraphe();
	public Couverture<PageParagraphe> introCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("intro").o(intro);

	/**	<br/>L'entité « intro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:intro">Trouver l'entité intro dans Solr</a>
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
	protected PageAPropos introInit() {
		if(intro != null) {
			((PageAPropos)this).avantPagePart(intro, "intro");
			((PageAPropos)this).avantPagePart(intro, "intro");
		}
		if(!introCouverture.dejaInitialise) {
			_intro(intro);
		}
		intro.initLoinPourClasse(requeteSite_);
		introCouverture.dejaInitialise(true);
		return (PageAPropos)this;
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

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. ";
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe moi = new PageParagraphe();
	public Couverture<PageParagraphe> moiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.apropos.PageAPropos&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected PageAPropos moiInit() {
		if(moi != null) {
			((PageAPropos)this).avantPagePart(moi, "moi");
			((PageAPropos)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (PageAPropos)this;
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
		introInit();
		moiInit();
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
		if(intro != null)
			intro.setRequeteSite_(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
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
			case "intro":
				return oPageAPropos.intro;
			case "moi":
				return oPageAPropos.moi;
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
				new File("/usr/local/src/computate.org-static/png").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/frFR?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR-999.png"));
				System.out.println("PageAProposFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/-999.png"));
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

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageAPropos();
		super.htmlBody();
	}

	public void htmlBodyPageAPropos() {
		if(intro != null)
			intro.htmlBody();
		if(moi != null)
			moi.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageAPropos();
	}

	public void htmlBodyCourtPageAPropos() {
		if(intro != null)
			intro.htmlBodyCourt();
		if(moi != null)
			moi.htmlBodyCourt();
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

	public static final String[] PageAProposVals = new String[] { introP1, introP2, moiP1, moiP2 };
}
