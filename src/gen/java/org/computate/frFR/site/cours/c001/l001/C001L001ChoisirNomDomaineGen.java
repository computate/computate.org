package org.computate.frFR.site.cours.c001.l001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.contexte.SiteContexte;
import org.computate.frFR.site.page.parti.PagePart;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.frFR.site.page.parti.PageParagraphe;
import org.apache.solr.client.solrj.SolrClient;
import java.util.ArrayList;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.cours.c001.C001Lecon;
import org.computate.frFR.site.requete.RequeteSite;
import java.lang.String;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageVideoId">Trouver l'entité pageVideoId dans Solr</a>
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

	/////////////////////
	// paragrapheIntro //
	/////////////////////

	/**	L'entité « paragrapheIntro »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe paragrapheIntro = new PageParagraphe();
	public Couverture<PageParagraphe> paragrapheIntroCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("paragrapheIntro").o(paragrapheIntro);

	/**	<br/>L'entité « paragrapheIntro »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paragrapheIntro">Trouver l'entité paragrapheIntro dans Solr</a>
	 * <br/>
	 * @param paragrapheIntro est l'entité déjà construit. 
	 **/
	protected abstract void _paragrapheIntro(PageParagraphe o);

	public PageParagraphe getParagrapheIntro() {
		return paragrapheIntro;
	}

	public void setParagrapheIntro(PageParagraphe paragrapheIntro) {
		this.paragrapheIntro = paragrapheIntro;
		this.paragrapheIntroCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine paragrapheIntroInit() {
		if(paragrapheIntro != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(paragrapheIntro, "paragrapheIntro");
		}
		if(!paragrapheIntroCouverture.dejaInitialise) {
			_paragrapheIntro(paragrapheIntro);
		}
		paragrapheIntro.initLoinPourClasse(requeteSite_);
		paragrapheIntroCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	///////////////////
	// paragrapheMoi //
	///////////////////

	/**	L'entité « paragrapheMoi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 */
	protected PageParagraphe paragrapheMoi = new PageParagraphe();
	public Couverture<PageParagraphe> paragrapheMoiCouverture = new Couverture<PageParagraphe>().p(this).c(PageParagraphe.class).var("paragrapheMoi").o(paragrapheMoi);

	/**	<br/>L'entité « paragrapheMoi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageParagraphe(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaine&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paragrapheMoi">Trouver l'entité paragrapheMoi dans Solr</a>
	 * <br/>
	 * @param paragrapheMoi est l'entité déjà construit. 
	 **/
	protected abstract void _paragrapheMoi(PageParagraphe o);

	public PageParagraphe getParagrapheMoi() {
		return paragrapheMoi;
	}

	public void setParagrapheMoi(PageParagraphe paragrapheMoi) {
		this.paragrapheMoi = paragrapheMoi;
		this.paragrapheMoiCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaine paragrapheMoiInit() {
		if(paragrapheMoi != null) {
			((C001L001ChoisirNomDomaine)this).avantPagePart(paragrapheMoi, "paragrapheMoi");
		}
		if(!paragrapheMoiCouverture.dejaInitialise) {
			_paragrapheMoi(paragrapheMoi);
		}
		paragrapheMoi.initLoinPourClasse(requeteSite_);
		paragrapheMoiCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaine)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaine = false;

	public C001L001ChoisirNomDomaine initLoinC001L001ChoisirNomDomaine(RequeteSite requeteSite_) {
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
		paragrapheIntroInit();
		paragrapheMoiInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001L001ChoisirNomDomaine(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaine(RequeteSite requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		paragrapheIntro.setRequeteSite_(requeteSite_);
		paragrapheMoi.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaine(requeteSite_);
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSite requeteSite = new RequeteSite();
			requeteSite.initLoinRequeteSite();
			SiteContexte siteContexte = new SiteContexte();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexte();
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
		RequeteSite requeteSite = new RequeteSite();
		requeteSite.initLoinRequeteSite();
		SiteContexte siteContexte = new SiteContexte();
		siteContexte.initLoinSiteContexte();
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
			case "paragrapheIntro":
				return oC001L001ChoisirNomDomaine.paragrapheIntro;
			case "paragrapheMoi":
				return oC001L001ChoisirNomDomaine.paragrapheMoi;
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
		paragrapheIntro.htmlBody();
		paragrapheMoi.htmlBody();
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
