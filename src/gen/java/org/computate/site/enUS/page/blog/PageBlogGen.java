package org.computate.site.enUS.page.blog;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import javax.imageio.ImageIO;
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
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlog&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageBlogGen<DEV> extends Article {

	public static final String PageBlog_H1 = "computate.org blog: ";
	public static final String PageBlog_H2 = "Search articles in the site computate.org. ";
	public static final String PageBlog_Titre = "Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ";
	public static final String PageBlog_Couleur = "green";
	public static final String PageBlog_IconeGroupe = "regular";
	public static final String PageBlog_IconeNom = "book";
	public static final String PageBlogFrFRPage_Uri = "/frFR/blog";
	public static final String PageBlogFrFRPage_ImageUri = "/png/frFR/blog-999.png";
	public static final String PageBlogEnUSPage_Uri = "/enUS/blog";
	public static final String PageBlogEnUSPage_ImageUri = "/png/enUS/blog-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlog&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_enUS">Trouver l'entité pageUri_enUS dans Solr</a>
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
	protected PageBlog pageUri_enUSInit() {
		if(!pageUri_enUSCouverture.dejaInitialise) {
			_pageUri_enUS(pageUri_enUSCouverture);
			if(pageUri_enUS == null)
				setPageUri_enUS(pageUri_enUSCouverture.o);
		}
		pageUri_enUSCouverture.dejaInitialise(true);
		return (PageBlog)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlog&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageUri_frFR">Trouver l'entité pageUri_frFR dans Solr</a>
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
	protected PageBlog pageUri_frFRInit() {
		if(!pageUri_frFRCouverture.dejaInitialise) {
			_pageUri_frFR(pageUri_frFRCouverture);
			if(pageUri_frFR == null)
				setPageUri_frFR(pageUri_frFRCouverture.o);
		}
		pageUri_frFRCouverture.dejaInitialise(true);
		return (PageBlog)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.page.blog.PageBlog&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeArticle">Trouver l'entité listeArticle dans Solr</a>
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
	protected PageBlog listeArticleInit() {
		if(!listeArticleCouverture.dejaInitialise) {
			_listeArticle(listeArticle);
		}
		listeArticle.initLoinPourClasse(requeteSite_);
		listeArticleCouverture.dejaInitialise(true);
		return (PageBlog)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageBlog = false;

	public PageBlog initLoinPageBlog(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageBlog) {
			dejaInitialisePageBlog = true;
			initLoinPageBlog();
		}
		return (PageBlog)this;
	}

	public void initLoinPageBlog() {
		super.initLoinArticle(requeteSite_);
		initPageBlog();
	}

	public void initPageBlog() {
		pageUri_enUSInit();
		pageUri_frFRInit();
		listeArticleInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinPageBlog(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageBlog(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(listeArticle != null)
			listeArticle.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSitePageBlog(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageBlog(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageBlog(String var) throws Exception {
		PageBlog oPageBlog = (PageBlog)this;
		switch(var) {
			case "pageUri_enUS":
				return oPageBlog.pageUri_enUS;
			case "pageUri_frFR":
				return oPageBlog.pageUri_frFR;
			case "listeArticle":
				return oPageBlog.listeArticle;
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
				o = attribuerPageBlog(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageBlog(String var, Object val) {
		PageBlog oPageBlog = (PageBlog)this;
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
					o = definirPageBlog(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageBlog(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/frFR/blog?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/blog-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/blog-999.png"));
				System.out.println("PageBlogFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/enUS/blog?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/blog-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/blog-999.png"));
				System.out.println("PageBlogEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.page.blog.PageBlog"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PageBlog o = new PageBlog();
			o.requeteSitePageBlog(requeteSite);
			o.initLoinPageBlog(requeteSite);
			o.indexerPageBlog();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerPageBlog();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerPageBlog(document);
	}

	public void indexerPageBlog(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageBlog(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageBlog() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerPageBlog(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerPageBlog(SolrInputDocument document) throws Exception {
		super.indexerArticle(document);

	}

	public void desindexerPageBlog() throws Exception {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinPageBlog(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerPageBlog(solrDocument);
	}
	public void stockerPageBlog(SolrDocument solrDocument) {
		PageBlog oPageBlog = (PageBlog)this;

		super.stockerArticle(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPageBlog();
		super.htmlBody();
	}

	public void htmlBodyPageBlog() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageBlog();
	}

	public void htmlBodyCourtPageBlog() {
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
		if(!(o instanceof PageBlog))
			return false;
		PageBlog that = (PageBlog)o;
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
		sb.append("PageBlog {");
		sb.append( "pageUri_enUS: \"" ).append(pageUri_enUS).append( "\"" );
		sb.append( ", pageUri_frFR: \"" ).append(pageUri_frFR).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
