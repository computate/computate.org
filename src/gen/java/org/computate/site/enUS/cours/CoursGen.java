package org.computate.site.enUS.cours;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.article.Article;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import org.apache.solr.client.solrj.SolrClient;
import java.util.ArrayList;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.enUS.cluster.Cluster;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import java.lang.String;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursGen<DEV> extends Article {

	public static final String Cours_Couleur = "green";
	public static final String Cours_IconeGroupe = "regular";
	public static final String Cours_IconeNom = "university";
	public static final String CoursFrFRPage_Uri = "/frFR/cours";
	public static final String CoursFrFRPage_ImageUri = "/png/frFR/cours-999.png";
	public static final String CoursEnUSPage_Uri = "/enUS/course";
	public static final String CoursEnUSPage_ImageUri = "/png/enUS/course-999.png";

	/////////////////////
	// utilisateurSite //
	/////////////////////

	/**	L'entité « utilisateurSite »
	 *	 is defined as null before being initialized. 
	 */
	protected UtilisateurSite utilisateurSite;
	public Couverture<UtilisateurSite> utilisateurSiteCouverture = new Couverture<UtilisateurSite>().p(this).c(UtilisateurSite.class).var("utilisateurSite").o(utilisateurSite);

	/**	<br/>L'entité « utilisateurSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:utilisateurSite">Trouver l'entité utilisateurSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSite(Couverture<UtilisateurSite> c);

	public UtilisateurSite getUtilisateurSite() {
		return utilisateurSite;
	}

	public void setUtilisateurSite(UtilisateurSite utilisateurSite) {
		this.utilisateurSite = utilisateurSite;
		this.utilisateurSiteCouverture.dejaInitialise = true;
	}
	protected Cours utilisateurSiteInit() {
		if(!utilisateurSiteCouverture.dejaInitialise) {
			_utilisateurSite(utilisateurSiteCouverture);
			if(utilisateurSite == null)
				setUtilisateurSite(utilisateurSiteCouverture.o);
		}
		if(utilisateurSite != null)
			utilisateurSite.initLoinPourClasse(requeteSite_);
		utilisateurSiteCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	///////////////////
	// utilisateurId //
	///////////////////

	/**	L'entité « utilisateurId »
	 *	 is defined as null before being initialized. 
	 */
	protected String utilisateurId;
	public Couverture<String> utilisateurIdCouverture = new Couverture<String>().p(this).c(String.class).var("utilisateurId").o(utilisateurId);

	/**	<br/>L'entité « utilisateurId »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:utilisateurId">Trouver l'entité utilisateurId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurId(Couverture<String> c);

	public String getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(String utilisateurId) {
		this.utilisateurId = utilisateurId;
		this.utilisateurIdCouverture.dejaInitialise = true;
	}
	protected Cours utilisateurIdInit() {
		if(!utilisateurIdCouverture.dejaInitialise) {
			_utilisateurId(utilisateurIdCouverture);
			if(utilisateurId == null)
				setUtilisateurId(utilisateurIdCouverture.o);
		}
		utilisateurIdCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrUtilisateurId() {
		return utilisateurId;
	}

	public String strUtilisateurId() {
		return utilisateurId == null ? "" : utilisateurId;
	}

	public String nomAffichageUtilisateurId() {
		return null;
	}

	public String htmTooltipUtilisateurId() {
		return null;
	}

	public String htmUtilisateurId() {
		return utilisateurId == null ? "" : StringEscapeUtils.escapeHtml4(strUtilisateurId());
	}

	///////////////////////////////
	// utilisateurSiteNomDomaine //
	///////////////////////////////

	/**	L'entité « utilisateurSiteNomDomaine »
	 *	 is defined as null before being initialized. 
	 */
	protected String utilisateurSiteNomDomaine;
	public Couverture<String> utilisateurSiteNomDomaineCouverture = new Couverture<String>().p(this).c(String.class).var("utilisateurSiteNomDomaine").o(utilisateurSiteNomDomaine);

	/**	<br/>L'entité « utilisateurSiteNomDomaine »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:utilisateurSiteNomDomaine">Trouver l'entité utilisateurSiteNomDomaine dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSiteNomDomaine(Couverture<String> c);

	public String getUtilisateurSiteNomDomaine() {
		return utilisateurSiteNomDomaine;
	}

	public void setUtilisateurSiteNomDomaine(String utilisateurSiteNomDomaine) {
		this.utilisateurSiteNomDomaine = utilisateurSiteNomDomaine;
		this.utilisateurSiteNomDomaineCouverture.dejaInitialise = true;
	}
	protected Cours utilisateurSiteNomDomaineInit() {
		if(!utilisateurSiteNomDomaineCouverture.dejaInitialise) {
			_utilisateurSiteNomDomaine(utilisateurSiteNomDomaineCouverture);
			if(utilisateurSiteNomDomaine == null)
				setUtilisateurSiteNomDomaine(utilisateurSiteNomDomaineCouverture.o);
		}
		utilisateurSiteNomDomaineCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrUtilisateurSiteNomDomaine() {
		return utilisateurSiteNomDomaine;
	}

	public String strUtilisateurSiteNomDomaine() {
		return utilisateurSiteNomDomaine == null ? "" : utilisateurSiteNomDomaine;
	}

	public String nomAffichageUtilisateurSiteNomDomaine() {
		return null;
	}

	public String htmTooltipUtilisateurSiteNomDomaine() {
		return null;
	}

	public String htmUtilisateurSiteNomDomaine() {
		return utilisateurSiteNomDomaine == null ? "" : StringEscapeUtils.escapeHtml4(strUtilisateurSiteNomDomaine());
	}

	///////////////////////////////
	// coursIdentifiantMinuscule //
	///////////////////////////////

	/**	L'entité « coursIdentifiantMinuscule »
	 *	 is defined as null before being initialized. 
	 */
	protected String coursIdentifiantMinuscule;
	public Couverture<String> coursIdentifiantMinusculeCouverture = new Couverture<String>().p(this).c(String.class).var("coursIdentifiantMinuscule").o(coursIdentifiantMinuscule);

	/**	<br/>L'entité « coursIdentifiantMinuscule »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:coursIdentifiantMinuscule">Trouver l'entité coursIdentifiantMinuscule dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _coursIdentifiantMinuscule(Couverture<String> c);

	public String getCoursIdentifiantMinuscule() {
		return coursIdentifiantMinuscule;
	}

	public void setCoursIdentifiantMinuscule(String coursIdentifiantMinuscule) {
		this.coursIdentifiantMinuscule = coursIdentifiantMinuscule;
		this.coursIdentifiantMinusculeCouverture.dejaInitialise = true;
	}
	protected Cours coursIdentifiantMinusculeInit() {
		if(!coursIdentifiantMinusculeCouverture.dejaInitialise) {
			_coursIdentifiantMinuscule(coursIdentifiantMinusculeCouverture);
			if(coursIdentifiantMinuscule == null)
				setCoursIdentifiantMinuscule(coursIdentifiantMinusculeCouverture.o);
		}
		coursIdentifiantMinusculeCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrCoursIdentifiantMinuscule() {
		return coursIdentifiantMinuscule;
	}

	public String strCoursIdentifiantMinuscule() {
		return coursIdentifiantMinuscule == null ? "" : coursIdentifiantMinuscule;
	}

	public String nomAffichageCoursIdentifiantMinuscule() {
		return null;
	}

	public String htmTooltipCoursIdentifiantMinuscule() {
		return null;
	}

	public String htmCoursIdentifiantMinuscule() {
		return coursIdentifiantMinuscule == null ? "" : StringEscapeUtils.escapeHtml4(strCoursIdentifiantMinuscule());
	}

	///////////////////////////////
	// coursIdentifiantMajuscule //
	///////////////////////////////

	/**	L'entité « coursIdentifiantMajuscule »
	 *	 is defined as null before being initialized. 
	 */
	protected String coursIdentifiantMajuscule;
	public Couverture<String> coursIdentifiantMajusculeCouverture = new Couverture<String>().p(this).c(String.class).var("coursIdentifiantMajuscule").o(coursIdentifiantMajuscule);

	/**	<br/>L'entité « coursIdentifiantMajuscule »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:coursIdentifiantMajuscule">Trouver l'entité coursIdentifiantMajuscule dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _coursIdentifiantMajuscule(Couverture<String> c);

	public String getCoursIdentifiantMajuscule() {
		return coursIdentifiantMajuscule;
	}

	public void setCoursIdentifiantMajuscule(String coursIdentifiantMajuscule) {
		this.coursIdentifiantMajuscule = coursIdentifiantMajuscule;
		this.coursIdentifiantMajusculeCouverture.dejaInitialise = true;
	}
	protected Cours coursIdentifiantMajusculeInit() {
		if(!coursIdentifiantMajusculeCouverture.dejaInitialise) {
			_coursIdentifiantMajuscule(coursIdentifiantMajusculeCouverture);
			if(coursIdentifiantMajuscule == null)
				setCoursIdentifiantMajuscule(coursIdentifiantMajusculeCouverture.o);
		}
		coursIdentifiantMajusculeCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrCoursIdentifiantMajuscule() {
		return coursIdentifiantMajuscule;
	}

	public String strCoursIdentifiantMajuscule() {
		return coursIdentifiantMajuscule == null ? "" : coursIdentifiantMajuscule;
	}

	public String nomAffichageCoursIdentifiantMajuscule() {
		return null;
	}

	public String htmTooltipCoursIdentifiantMajuscule() {
		return null;
	}

	public String htmCoursIdentifiantMajuscule() {
		return coursIdentifiantMajuscule == null ? "" : StringEscapeUtils.escapeHtml4(strCoursIdentifiantMajuscule());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCours = false;

	public Cours initLoinCours(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCours) {
			dejaInitialiseCours = true;
			initLoinCours();
		}
		return (Cours)this;
	}

	public void initLoinCours() {
		super.initLoinArticle(requeteSite_);
		initCours();
	}

	public void initCours() {
		utilisateurSiteInit();
		utilisateurIdInit();
		utilisateurSiteNomDomaineInit();
		coursIdentifiantMinusculeInit();
		coursIdentifiantMajusculeInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinCours(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCours(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticle(requeteSite_);
		if(utilisateurSite != null)
			utilisateurSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteCours(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCours(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCours(String var) {
		Cours oCours = (Cours)this;
		switch(var) {
			case "utilisateurSite":
				return oCours.utilisateurSite;
			case "utilisateurId":
				return oCours.utilisateurId;
			case "utilisateurSiteNomDomaine":
				return oCours.utilisateurSiteNomDomaine;
			case "coursIdentifiantMinuscule":
				return oCours.coursIdentifiantMinuscule;
			case "coursIdentifiantMajuscule":
				return oCours.coursIdentifiantMajuscule;
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
				o = attribuerCours(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCours(String var, Object val) {
		Cours oCours = (Cours)this;
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
					o = definirCours(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCours(String var, String val) {
		switch(var) {
			default:
				return super.definirArticle(var, val);
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.Cours"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			Cours o = new Cours();
			o.requeteSiteCours(requeteSite);
			o.initLoinCours(requeteSite);
			o.indexerCours();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerCours();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerCours(document);
	}

	public void indexerCours(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerCours(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerCours() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerCours(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerCours(SolrInputDocument document) {
		super.indexerArticle(document);

	}

	public void desindexerCours() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinCours(siteContexte.getRequeteSite_());
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerCours(solrDocument);
	}
	public void stockerCours(SolrDocument solrDocument) {
		Cours oCours = (Cours)this;

		super.stockerArticle(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCours();
		super.htmlBody();
	}

	public void htmlBodyCours() {
		if(utilisateurSite != null)
			utilisateurSite.htmlBody();
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
		if(!(o instanceof Cours))
			return false;
		Cours that = (Cours)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("Cours {");
		sb.append(" }");
		return sb.toString();
	}
}
