package org.computate.site.frfr.article;

import java.util.Arrays;
import java.util.Date;
import java.time.ZonedDateTime;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.util.Locale;
import org.computate.site.frfr.utilisateur.UtilisateurSite;
import io.vertx.core.json.JsonObject;
import java.time.ZoneOffset;
import io.vertx.core.logging.Logger;
import java.math.RoundingMode;
import java.math.MathContext;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.Instant;
import java.time.ZoneId;
import java.util.Objects;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import java.util.Optional;
import org.apache.solr.client.solrj.util.ClientUtils;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import java.time.LocalDateTime;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import io.vertx.core.logging.LoggerFactory;
import java.text.NumberFormat;
import java.util.ArrayList;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.annotation.JsonIgnore;
import java.lang.Boolean;
import java.lang.String;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import org.computate.site.frfr.contexte.SiteContexteFrFR;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.computate.site.frfr.ecrivain.ToutEcrivain;
import org.apache.solr.client.solrj.SolrClient;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import org.apache.commons.lang3.math.NumberUtils;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class ArticleGen<DEV> extends Cluster {
	protected static final Logger LOGGER = LoggerFactory.getLogger(Article.class);

	public static final String Article_UnNom = "un article";
	public static final String Article_Ce = "ce ";
	public static final String Article_CeNom = "cet article";
	public static final String Article_Un = "un ";
	public static final String Article_LeNom = "l'article";
	public static final String Article_NomSingulier = "article";
	public static final String Article_NomPluriel = "articles";
	public static final String Article_NomActuel = "article actuel";
	public static final String Article_TousNom = "tous les articles";
	public static final String Article_RechercherTousNomPar = "rechercher articles par ";
	public static final String Article_RechercherTousNom = "rechercher articles";
	public static final String Article_Titre = "articles";
	public static final String Article_LesNom = "les articles";
	public static final String Article_AucunNomTrouve = "aucun article trouvé";
	public static final String Article_NomVar = "article";
	public static final String Article_DeNom = "d'article";
	public static final String Article_NomAdjectifSingulier = "article";
	public static final String Article_NomAdjectifPluriel = "articles";
	public static final String Article_Couleur = "green";
	public static final String Article_IconeGroupe = "regular";
	public static final String Article_IconeNom = "university";

	/////////////////////
	// statiqueUrlBase //
	/////////////////////

	/**	 L'entité statiqueUrlBase
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String statiqueUrlBase;
	@JsonIgnore
	public Couverture<String> statiqueUrlBaseCouverture = new Couverture<String>().p(this).c(String.class).var("statiqueUrlBase").o(statiqueUrlBase);

	/**	<br/> L'entité statiqueUrlBase
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:statiqueUrlBase">Trouver l'entité statiqueUrlBase dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _statiqueUrlBase(Couverture<String> c);

	public String getStatiqueUrlBase() {
		return statiqueUrlBase;
	}

	public void setStatiqueUrlBase(String statiqueUrlBase) {
		this.statiqueUrlBase = statiqueUrlBase;
		this.statiqueUrlBaseCouverture.dejaInitialise = true;
	}
	protected Article statiqueUrlBaseInit() {
		if(!statiqueUrlBaseCouverture.dejaInitialise) {
			_statiqueUrlBase(statiqueUrlBaseCouverture);
			if(statiqueUrlBase == null)
				setStatiqueUrlBase(statiqueUrlBaseCouverture.o);
		}
		statiqueUrlBaseCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrStatiqueUrlBase() {
		return statiqueUrlBase;
	}

	public String strStatiqueUrlBase() {
		return statiqueUrlBase == null ? "" : statiqueUrlBase;
	}

	public String jsonStatiqueUrlBase() {
		return statiqueUrlBase == null ? "" : statiqueUrlBase;
	}

	public String nomAffichageStatiqueUrlBase() {
		return null;
	}

	public String htmTooltipStatiqueUrlBase() {
		return null;
	}

	public String htmStatiqueUrlBase() {
		return statiqueUrlBase == null ? "" : StringEscapeUtils.escapeHtml4(strStatiqueUrlBase());
	}

	//////////////////
	// documentSolr //
	//////////////////

	/**	 L'entité documentSolr
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected SolrDocument documentSolr;
	@JsonIgnore
	public Couverture<SolrDocument> documentSolrCouverture = new Couverture<SolrDocument>().p(this).c(SolrDocument.class).var("documentSolr").o(documentSolr);

	/**	<br/> L'entité documentSolr
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:documentSolr">Trouver l'entité documentSolr dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _documentSolr(Couverture<SolrDocument> c);

	public SolrDocument getDocumentSolr() {
		return documentSolr;
	}

	public void setDocumentSolr(SolrDocument documentSolr) {
		this.documentSolr = documentSolr;
		this.documentSolrCouverture.dejaInitialise = true;
	}
	protected Article documentSolrInit() {
		if(!documentSolrCouverture.dejaInitialise) {
			_documentSolr(documentSolrCouverture);
			if(documentSolr == null)
				setDocumentSolr(documentSolrCouverture.o);
		}
		documentSolrCouverture.dejaInitialise(true);
		return (Article)this;
	}

	////////////////
	// nomDomaine //
	////////////////

	/**	 L'entité nomDomaine
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String nomDomaine;
	@JsonIgnore
	public Couverture<String> nomDomaineCouverture = new Couverture<String>().p(this).c(String.class).var("nomDomaine").o(nomDomaine);

	/**	<br/> L'entité nomDomaine
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:nomDomaine">Trouver l'entité nomDomaine dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _nomDomaine(Couverture<String> c);

	public String getNomDomaine() {
		return nomDomaine;
	}

	public void setNomDomaine(String nomDomaine) {
		this.nomDomaine = nomDomaine;
		this.nomDomaineCouverture.dejaInitialise = true;
	}
	protected Article nomDomaineInit() {
		if(!nomDomaineCouverture.dejaInitialise) {
			_nomDomaine(nomDomaineCouverture);
			if(nomDomaine == null)
				setNomDomaine(nomDomaineCouverture.o);
		}
		nomDomaineCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrNomDomaine() {
		return nomDomaine;
	}

	public String strNomDomaine() {
		return nomDomaine == null ? "" : nomDomaine;
	}

	public String jsonNomDomaine() {
		return nomDomaine == null ? "" : nomDomaine;
	}

	public String nomAffichageNomDomaine() {
		return "Nom de domaine du site";
	}

	public String htmTooltipNomDomaine() {
		return null;
	}

	public String htmNomDomaine() {
		return nomDomaine == null ? "" : StringEscapeUtils.escapeHtml4(strNomDomaine());
	}

	/////////////
	// nomSite //
	/////////////

	/**	 L'entité nomSite
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String nomSite;
	@JsonIgnore
	public Couverture<String> nomSiteCouverture = new Couverture<String>().p(this).c(String.class).var("nomSite").o(nomSite);

	/**	<br/> L'entité nomSite
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:nomSite">Trouver l'entité nomSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _nomSite(Couverture<String> c);

	public String getNomSite() {
		return nomSite;
	}

	public void setNomSite(String nomSite) {
		this.nomSite = nomSite;
		this.nomSiteCouverture.dejaInitialise = true;
	}
	protected Article nomSiteInit() {
		if(!nomSiteCouverture.dejaInitialise) {
			_nomSite(nomSiteCouverture);
			if(nomSite == null)
				setNomSite(nomSiteCouverture.o);
		}
		nomSiteCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrNomSite() {
		return nomSite;
	}

	public String strNomSite() {
		return nomSite == null ? "" : nomSite;
	}

	public String jsonNomSite() {
		return nomSite == null ? "" : nomSite;
	}

	public String nomAffichageNomSite() {
		return "Nom d'affichage du site";
	}

	public String htmTooltipNomSite() {
		return null;
	}

	public String htmNomSite() {
		return nomSite == null ? "" : StringEscapeUtils.escapeHtml4(strNomSite());
	}

	/////////////////
	// nomHoteSite //
	/////////////////

	/**	 L'entité nomHoteSite
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String nomHoteSite;
	@JsonIgnore
	public Couverture<String> nomHoteSiteCouverture = new Couverture<String>().p(this).c(String.class).var("nomHoteSite").o(nomHoteSite);

	/**	<br/> L'entité nomHoteSite
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:nomHoteSite">Trouver l'entité nomHoteSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _nomHoteSite(Couverture<String> c);

	public String getNomHoteSite() {
		return nomHoteSite;
	}

	public void setNomHoteSite(String nomHoteSite) {
		this.nomHoteSite = nomHoteSite;
		this.nomHoteSiteCouverture.dejaInitialise = true;
	}
	protected Article nomHoteSiteInit() {
		if(!nomHoteSiteCouverture.dejaInitialise) {
			_nomHoteSite(nomHoteSiteCouverture);
			if(nomHoteSite == null)
				setNomHoteSite(nomHoteSiteCouverture.o);
		}
		nomHoteSiteCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrNomHoteSite() {
		return nomHoteSite;
	}

	public String strNomHoteSite() {
		return nomHoteSite == null ? "" : nomHoteSite;
	}

	public String jsonNomHoteSite() {
		return nomHoteSite == null ? "" : nomHoteSite;
	}

	public String nomAffichageNomHoteSite() {
		return "Nom d'hôte du site";
	}

	public String htmTooltipNomHoteSite() {
		return null;
	}

	public String htmNomHoteSite() {
		return nomHoteSite == null ? "" : StringEscapeUtils.escapeHtml4(strNomHoteSite());
	}

	/////////////////////
	// nomEnsembleSite //
	/////////////////////

	/**	 L'entité nomEnsembleSite
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String nomEnsembleSite;
	@JsonIgnore
	public Couverture<String> nomEnsembleSiteCouverture = new Couverture<String>().p(this).c(String.class).var("nomEnsembleSite").o(nomEnsembleSite);

	/**	<br/> L'entité nomEnsembleSite
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:nomEnsembleSite">Trouver l'entité nomEnsembleSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _nomEnsembleSite(Couverture<String> c);

	public String getNomEnsembleSite() {
		return nomEnsembleSite;
	}

	public void setNomEnsembleSite(String nomEnsembleSite) {
		this.nomEnsembleSite = nomEnsembleSite;
		this.nomEnsembleSiteCouverture.dejaInitialise = true;
	}
	protected Article nomEnsembleSiteInit() {
		if(!nomEnsembleSiteCouverture.dejaInitialise) {
			_nomEnsembleSite(nomEnsembleSiteCouverture);
			if(nomEnsembleSite == null)
				setNomEnsembleSite(nomEnsembleSiteCouverture.o);
		}
		nomEnsembleSiteCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrNomEnsembleSite() {
		return nomEnsembleSite;
	}

	public String strNomEnsembleSite() {
		return nomEnsembleSite == null ? "" : nomEnsembleSite;
	}

	public String jsonNomEnsembleSite() {
		return nomEnsembleSite == null ? "" : nomEnsembleSite;
	}

	public String nomAffichageNomEnsembleSite() {
		return "nom d'ensemble du site";
	}

	public String htmTooltipNomEnsembleSite() {
		return null;
	}

	public String htmNomEnsembleSite() {
		return nomEnsembleSite == null ? "" : StringEscapeUtils.escapeHtml4(strNomEnsembleSite());
	}

	///////////////////////
	// nomHoteOrdinateur //
	///////////////////////

	/**	 L'entité nomHoteOrdinateur
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String nomHoteOrdinateur;
	@JsonIgnore
	public Couverture<String> nomHoteOrdinateurCouverture = new Couverture<String>().p(this).c(String.class).var("nomHoteOrdinateur").o(nomHoteOrdinateur);

	/**	<br/> L'entité nomHoteOrdinateur
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:nomHoteOrdinateur">Trouver l'entité nomHoteOrdinateur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _nomHoteOrdinateur(Couverture<String> c);

	public String getNomHoteOrdinateur() {
		return nomHoteOrdinateur;
	}

	public void setNomHoteOrdinateur(String nomHoteOrdinateur) {
		this.nomHoteOrdinateur = nomHoteOrdinateur;
		this.nomHoteOrdinateurCouverture.dejaInitialise = true;
	}
	protected Article nomHoteOrdinateurInit() {
		if(!nomHoteOrdinateurCouverture.dejaInitialise) {
			_nomHoteOrdinateur(nomHoteOrdinateurCouverture);
			if(nomHoteOrdinateur == null)
				setNomHoteOrdinateur(nomHoteOrdinateurCouverture.o);
		}
		nomHoteOrdinateurCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrNomHoteOrdinateur() {
		return nomHoteOrdinateur;
	}

	public String strNomHoteOrdinateur() {
		return nomHoteOrdinateur == null ? "" : nomHoteOrdinateur;
	}

	public String jsonNomHoteOrdinateur() {
		return nomHoteOrdinateur == null ? "" : nomHoteOrdinateur;
	}

	public String nomAffichageNomHoteOrdinateur() {
		return "Nom d'hôte de l'ordinateur";
	}

	public String htmTooltipNomHoteOrdinateur() {
		return null;
	}

	public String htmNomHoteOrdinateur() {
		return nomHoteOrdinateur == null ? "" : StringEscapeUtils.escapeHtml4(strNomHoteOrdinateur());
	}

	///////////////////
	// cheminServeur //
	///////////////////

	/**	 L'entité cheminServeur
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String cheminServeur;
	@JsonIgnore
	public Couverture<String> cheminServeurCouverture = new Couverture<String>().p(this).c(String.class).var("cheminServeur").o(cheminServeur);

	/**	<br/> L'entité cheminServeur
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cheminServeur">Trouver l'entité cheminServeur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cheminServeur(Couverture<String> c);

	public String getCheminServeur() {
		return cheminServeur;
	}

	public void setCheminServeur(String cheminServeur) {
		this.cheminServeur = cheminServeur;
		this.cheminServeurCouverture.dejaInitialise = true;
	}
	protected Article cheminServeurInit() {
		if(!cheminServeurCouverture.dejaInitialise) {
			_cheminServeur(cheminServeurCouverture);
			if(cheminServeur == null)
				setCheminServeur(cheminServeurCouverture.o);
		}
		cheminServeurCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrCheminServeur() {
		return cheminServeur;
	}

	public String strCheminServeur() {
		return cheminServeur == null ? "" : cheminServeur;
	}

	public String jsonCheminServeur() {
		return cheminServeur == null ? "" : cheminServeur;
	}

	public String nomAffichageCheminServeur() {
		return "Chemin du serveur";
	}

	public String htmTooltipCheminServeur() {
		return null;
	}

	public String htmCheminServeur() {
		return cheminServeur == null ? "" : StringEscapeUtils.escapeHtml4(strCheminServeur());
	}

	//////////////////
	// cheminProjet //
	//////////////////

	/**	 L'entité cheminProjet
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String cheminProjet;
	@JsonIgnore
	public Couverture<String> cheminProjetCouverture = new Couverture<String>().p(this).c(String.class).var("cheminProjet").o(cheminProjet);

	/**	<br/> L'entité cheminProjet
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cheminProjet">Trouver l'entité cheminProjet dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cheminProjet(Couverture<String> c);

	public String getCheminProjet() {
		return cheminProjet;
	}

	public void setCheminProjet(String cheminProjet) {
		this.cheminProjet = cheminProjet;
		this.cheminProjetCouverture.dejaInitialise = true;
	}
	protected Article cheminProjetInit() {
		if(!cheminProjetCouverture.dejaInitialise) {
			_cheminProjet(cheminProjetCouverture);
			if(cheminProjet == null)
				setCheminProjet(cheminProjetCouverture.o);
		}
		cheminProjetCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrCheminProjet() {
		return cheminProjet;
	}

	public String strCheminProjet() {
		return cheminProjet == null ? "" : cheminProjet;
	}

	public String jsonCheminProjet() {
		return cheminProjet == null ? "" : cheminProjet;
	}

	public String nomAffichageCheminProjet() {
		return "Chemin du projet";
	}

	public String htmTooltipCheminProjet() {
		return null;
	}

	public String htmCheminProjet() {
		return cheminProjet == null ? "" : StringEscapeUtils.escapeHtml4(strCheminProjet());
	}

	////////////////////
	// utilisateurNom //
	////////////////////

	/**	 L'entité utilisateurNom
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurNom;
	@JsonIgnore
	public Couverture<String> utilisateurNomCouverture = new Couverture<String>().p(this).c(String.class).var("utilisateurNom").o(utilisateurNom);

	/**	<br/> L'entité utilisateurNom
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurNom">Trouver l'entité utilisateurNom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurNom(Couverture<String> c);

	public String getUtilisateurNom() {
		return utilisateurNom;
	}

	public void setUtilisateurNom(String utilisateurNom) {
		this.utilisateurNom = utilisateurNom;
		this.utilisateurNomCouverture.dejaInitialise = true;
	}
	protected Article utilisateurNomInit() {
		if(!utilisateurNomCouverture.dejaInitialise) {
			_utilisateurNom(utilisateurNomCouverture);
			if(utilisateurNom == null)
				setUtilisateurNom(utilisateurNomCouverture.o);
		}
		utilisateurNomCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrUtilisateurNom() {
		return utilisateurNom;
	}

	public String strUtilisateurNom() {
		return utilisateurNom == null ? "" : utilisateurNom;
	}

	public String jsonUtilisateurNom() {
		return utilisateurNom == null ? "" : utilisateurNom;
	}

	public String nomAffichageUtilisateurNom() {
		return "Nom d'utilisateur";
	}

	public String htmTooltipUtilisateurNom() {
		return null;
	}

	public String htmUtilisateurNom() {
		return utilisateurNom == null ? "" : StringEscapeUtils.escapeHtml4(strUtilisateurNom());
	}

	///////////////
	// groupeNom //
	///////////////

	/**	 L'entité groupeNom
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String groupeNom;
	@JsonIgnore
	public Couverture<String> groupeNomCouverture = new Couverture<String>().p(this).c(String.class).var("groupeNom").o(groupeNom);

	/**	<br/> L'entité groupeNom
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:groupeNom">Trouver l'entité groupeNom dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _groupeNom(Couverture<String> c);

	public String getGroupeNom() {
		return groupeNom;
	}

	public void setGroupeNom(String groupeNom) {
		this.groupeNom = groupeNom;
		this.groupeNomCouverture.dejaInitialise = true;
	}
	protected Article groupeNomInit() {
		if(!groupeNomCouverture.dejaInitialise) {
			_groupeNom(groupeNomCouverture);
			if(groupeNom == null)
				setGroupeNom(groupeNomCouverture.o);
		}
		groupeNomCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrGroupeNom() {
		return groupeNom;
	}

	public String strGroupeNom() {
		return groupeNom == null ? "" : groupeNom;
	}

	public String jsonGroupeNom() {
		return groupeNom == null ? "" : groupeNom;
	}

	public String nomAffichageGroupeNom() {
		return "Nom de groupe";
	}

	public String htmTooltipGroupeNom() {
		return null;
	}

	public String htmGroupeNom() {
		return groupeNom == null ? "" : StringEscapeUtils.escapeHtml4(strGroupeNom());
	}

	//////////////
	// estCours //
	//////////////

	/**	 L'entité estCours
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean estCours;
	@JsonIgnore
	public Couverture<Boolean> estCoursCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("estCours").o(estCours);

	/**	<br/> L'entité estCours
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:estCours">Trouver l'entité estCours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _estCours(Couverture<Boolean> c);

	public Boolean getEstCours() {
		return estCours;
	}

	public void setEstCours(Boolean estCours) {
		this.estCours = estCours;
		this.estCoursCouverture.dejaInitialise = true;
	}
	public Article setEstCours(String o) {
		this.estCours = Boolean.parseBoolean(o);
		this.estCoursCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article estCoursInit() {
		if(!estCoursCouverture.dejaInitialise) {
			_estCours(estCoursCouverture);
			if(estCours == null)
				setEstCours(estCoursCouverture.o);
		}
		estCoursCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Boolean solrEstCours() {
		return estCours;
	}

	public String strEstCours() {
		return estCours == null ? "" : estCours.toString();
	}

	public String jsonEstCours() {
		return estCours == null ? "" : estCours.toString();
	}

	public String nomAffichageEstCours() {
		return "est cours";
	}

	public String htmTooltipEstCours() {
		return null;
	}

	public String htmEstCours() {
		return estCours == null ? "" : StringEscapeUtils.escapeHtml4(strEstCours());
	}

	//////////////
	// estLecon //
	//////////////

	/**	 L'entité estLecon
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean estLecon;
	@JsonIgnore
	public Couverture<Boolean> estLeconCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("estLecon").o(estLecon);

	/**	<br/> L'entité estLecon
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:estLecon">Trouver l'entité estLecon dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _estLecon(Couverture<Boolean> c);

	public Boolean getEstLecon() {
		return estLecon;
	}

	public void setEstLecon(Boolean estLecon) {
		this.estLecon = estLecon;
		this.estLeconCouverture.dejaInitialise = true;
	}
	public Article setEstLecon(String o) {
		this.estLecon = Boolean.parseBoolean(o);
		this.estLeconCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article estLeconInit() {
		if(!estLeconCouverture.dejaInitialise) {
			_estLecon(estLeconCouverture);
			if(estLecon == null)
				setEstLecon(estLeconCouverture.o);
		}
		estLeconCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Boolean solrEstLecon() {
		return estLecon;
	}

	public String strEstLecon() {
		return estLecon == null ? "" : estLecon.toString();
	}

	public String jsonEstLecon() {
		return estLecon == null ? "" : estLecon.toString();
	}

	public String nomAffichageEstLecon() {
		return "est leçon";
	}

	public String htmTooltipEstLecon() {
		return null;
	}

	public String htmEstLecon() {
		return estLecon == null ? "" : StringEscapeUtils.escapeHtml4(strEstLecon());
	}

	////////////////
	// estArticle //
	////////////////

	/**	 L'entité estArticle
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean estArticle;
	@JsonIgnore
	public Couverture<Boolean> estArticleCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("estArticle").o(estArticle);

	/**	<br/> L'entité estArticle
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:estArticle">Trouver l'entité estArticle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _estArticle(Couverture<Boolean> c);

	public Boolean getEstArticle() {
		return estArticle;
	}

	public void setEstArticle(Boolean estArticle) {
		this.estArticle = estArticle;
		this.estArticleCouverture.dejaInitialise = true;
	}
	public Article setEstArticle(String o) {
		this.estArticle = Boolean.parseBoolean(o);
		this.estArticleCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article estArticleInit() {
		if(!estArticleCouverture.dejaInitialise) {
			_estArticle(estArticleCouverture);
			if(estArticle == null)
				setEstArticle(estArticleCouverture.o);
		}
		estArticleCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Boolean solrEstArticle() {
		return estArticle;
	}

	public String strEstArticle() {
		return estArticle == null ? "" : estArticle.toString();
	}

	public String jsonEstArticle() {
		return estArticle == null ? "" : estArticle.toString();
	}

	public String nomAffichageEstArticle() {
		return "est article";
	}

	public String htmTooltipEstArticle() {
		return null;
	}

	public String htmEstArticle() {
		return estArticle == null ? "" : StringEscapeUtils.escapeHtml4(strEstArticle());
	}

	/////////////////
	// coursNumero //
	/////////////////

	/**	 L'entité coursNumero
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer coursNumero;
	@JsonIgnore
	public Couverture<Integer> coursNumeroCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("coursNumero").o(coursNumero);

	/**	<br/> L'entité coursNumero
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:coursNumero">Trouver l'entité coursNumero dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _coursNumero(Couverture<Integer> c);

	public Integer getCoursNumero() {
		return coursNumero;
	}

	public void setCoursNumero(Integer coursNumero) {
		this.coursNumero = coursNumero;
		this.coursNumeroCouverture.dejaInitialise = true;
	}
	public Article setCoursNumero(String o) {
		if(NumberUtils.isParsable(o))
			this.coursNumero = Integer.parseInt(o);
		this.coursNumeroCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article coursNumeroInit() {
		if(!coursNumeroCouverture.dejaInitialise) {
			_coursNumero(coursNumeroCouverture);
			if(coursNumero == null)
				setCoursNumero(coursNumeroCouverture.o);
		}
		coursNumeroCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Integer solrCoursNumero() {
		return coursNumero;
	}

	public String strCoursNumero() {
		return coursNumero == null ? "" : coursNumero.toString();
	}

	public String jsonCoursNumero() {
		return coursNumero == null ? "" : coursNumero.toString();
	}

	public String nomAffichageCoursNumero() {
		return "cours";
	}

	public String htmTooltipCoursNumero() {
		return null;
	}

	public String htmCoursNumero() {
		return coursNumero == null ? "" : StringEscapeUtils.escapeHtml4(strCoursNumero());
	}

	public void inputCoursNumero(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{
			e("input")
				.a("type", "text")
				.a("placeholder", "cours")
				.a("id", classeApiMethodeMethode, "_coursNumero");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setCoursNumero classArticle inputArticle", pk, "CoursNumero w3-input w3-border ");
					a("name", "setCoursNumero");
				} else {
					a("class", "valeurCoursNumero w3-input w3-border classArticle inputArticle", pk, "CoursNumero w3-input w3-border ");
					a("name", "coursNumero");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setCoursNumero', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_coursNumero')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_coursNumero')); }); ");
				}
				a("value", strCoursNumero())
			.fg();

		}
	}

	public void htmCoursNumero(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "ArticleCoursNumero").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_coursNumero").a("class", "").f().sx("cours").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputCoursNumero(classeApiMethodeMethode);
							} g("div");
							{
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_coursNumero')); $('#", classeApiMethodeMethode, "_coursNumero').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#ArticleForm :input[name=pk]').val() }], 'setCoursNumero', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_coursNumero')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_coursNumero')); }); ")
											.f();
											e("i").a("class", "far fa-eraser ").f().g("i");
										} g("button");
									} g("div");
								}
							}
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	/////////////////
	// leconNumero //
	/////////////////

	/**	 L'entité leconNumero
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer leconNumero;
	@JsonIgnore
	public Couverture<Integer> leconNumeroCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("leconNumero").o(leconNumero);

	/**	<br/> L'entité leconNumero
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconNumero">Trouver l'entité leconNumero dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _leconNumero(Couverture<Integer> c);

	public Integer getLeconNumero() {
		return leconNumero;
	}

	public void setLeconNumero(Integer leconNumero) {
		this.leconNumero = leconNumero;
		this.leconNumeroCouverture.dejaInitialise = true;
	}
	public Article setLeconNumero(String o) {
		if(NumberUtils.isParsable(o))
			this.leconNumero = Integer.parseInt(o);
		this.leconNumeroCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article leconNumeroInit() {
		if(!leconNumeroCouverture.dejaInitialise) {
			_leconNumero(leconNumeroCouverture);
			if(leconNumero == null)
				setLeconNumero(leconNumeroCouverture.o);
		}
		leconNumeroCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Integer solrLeconNumero() {
		return leconNumero;
	}

	public String strLeconNumero() {
		return leconNumero == null ? "" : leconNumero.toString();
	}

	public String jsonLeconNumero() {
		return leconNumero == null ? "" : leconNumero.toString();
	}

	public String nomAffichageLeconNumero() {
		return "leçon";
	}

	public String htmTooltipLeconNumero() {
		return null;
	}

	public String htmLeconNumero() {
		return leconNumero == null ? "" : StringEscapeUtils.escapeHtml4(strLeconNumero());
	}

	public void inputLeconNumero(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{
			e("input")
				.a("type", "text")
				.a("placeholder", "leçon")
				.a("id", classeApiMethodeMethode, "_leconNumero");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setLeconNumero classArticle inputArticle", pk, "LeconNumero w3-input w3-border ");
					a("name", "setLeconNumero");
				} else {
					a("class", "valeurLeconNumero w3-input w3-border classArticle inputArticle", pk, "LeconNumero w3-input w3-border ");
					a("name", "leconNumero");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setLeconNumero', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_leconNumero')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_leconNumero')); }); ");
				}
				a("value", strLeconNumero())
			.fg();

		}
	}

	public void htmLeconNumero(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "ArticleLeconNumero").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_leconNumero").a("class", "").f().sx("leçon").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputLeconNumero(classeApiMethodeMethode);
							} g("div");
							{
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_leconNumero')); $('#", classeApiMethodeMethode, "_leconNumero').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#ArticleForm :input[name=pk]').val() }], 'setLeconNumero', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_leconNumero')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_leconNumero')); }); ")
											.f();
											e("i").a("class", "far fa-eraser ").f().g("i");
										} g("button");
									} g("div");
								}
							}
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	//////////////////////
	// leconDescription //
	//////////////////////

	/**	 L'entité leconDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String leconDescription;
	@JsonIgnore
	public Couverture<String> leconDescriptionCouverture = new Couverture<String>().p(this).c(String.class).var("leconDescription").o(leconDescription);

	/**	<br/> L'entité leconDescription
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconDescription">Trouver l'entité leconDescription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _leconDescription(Couverture<String> c);

	public String getLeconDescription() {
		return leconDescription;
	}

	public void setLeconDescription(String leconDescription) {
		this.leconDescription = leconDescription;
		this.leconDescriptionCouverture.dejaInitialise = true;
	}
	protected Article leconDescriptionInit() {
		if(!leconDescriptionCouverture.dejaInitialise) {
			_leconDescription(leconDescriptionCouverture);
			if(leconDescription == null)
				setLeconDescription(leconDescriptionCouverture.o);
		}
		leconDescriptionCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrLeconDescription() {
		return leconDescription;
	}

	public String strLeconDescription() {
		return leconDescription == null ? "" : leconDescription;
	}

	public String jsonLeconDescription() {
		return leconDescription == null ? "" : leconDescription;
	}

	public String nomAffichageLeconDescription() {
		return "description";
	}

	public String htmTooltipLeconDescription() {
		return null;
	}

	public String htmLeconDescription() {
		return leconDescription == null ? "" : StringEscapeUtils.escapeHtml4(strLeconDescription());
	}

	public void inputLeconDescription(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{
			e("input")
				.a("type", "text")
				.a("placeholder", "description")
				.a("id", classeApiMethodeMethode, "_leconDescription");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setLeconDescription classArticle inputArticle", pk, "LeconDescription w3-input w3-border ");
					a("name", "setLeconDescription");
				} else {
					a("class", "valeurLeconDescription w3-input w3-border classArticle inputArticle", pk, "LeconDescription w3-input w3-border ");
					a("name", "leconDescription");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setLeconDescription', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_leconDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_leconDescription')); }); ");
				}
				a("value", strLeconDescription())
			.fg();

		}
	}

	public void htmLeconDescription(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "ArticleLeconDescription").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_leconDescription").a("class", "").f().sx("description").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputLeconDescription(classeApiMethodeMethode);
							} g("div");
							{
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_leconDescription')); $('#", classeApiMethodeMethode, "_leconDescription').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#ArticleForm :input[name=pk]').val() }], 'setLeconDescription', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_leconDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_leconDescription')); }); ")
											.f();
											e("i").a("class", "far fa-eraser ").f().g("i");
										} g("button");
									} g("div");
								}
							}
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	////////////////////
	// articleH1_enUS //
	////////////////////

	/**	 L'entité articleH1_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleH1_enUS;
	@JsonIgnore
	public Couverture<String> articleH1_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("articleH1_enUS").o(articleH1_enUS);

	/**	<br/> L'entité articleH1_enUS
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleH1_enUS">Trouver l'entité articleH1_enUS dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleH1_enUS(Couverture<String> c);

	public String getArticleH1_enUS() {
		return articleH1_enUS;
	}

	public void setArticleH1_enUS(String articleH1_enUS) {
		this.articleH1_enUS = articleH1_enUS;
		this.articleH1_enUSCouverture.dejaInitialise = true;
	}
	protected Article articleH1_enUSInit() {
		if(!articleH1_enUSCouverture.dejaInitialise) {
			_articleH1_enUS(articleH1_enUSCouverture);
			if(articleH1_enUS == null)
				setArticleH1_enUS(articleH1_enUSCouverture.o);
		}
		articleH1_enUSCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleH1_enUS() {
		return articleH1_enUS;
	}

	public String strArticleH1_enUS() {
		return articleH1_enUS == null ? "" : articleH1_enUS;
	}

	public String jsonArticleH1_enUS() {
		return articleH1_enUS == null ? "" : articleH1_enUS;
	}

	public String nomAffichageArticleH1_enUS() {
		return null;
	}

	public String htmTooltipArticleH1_enUS() {
		return null;
	}

	public String htmArticleH1_enUS() {
		return articleH1_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strArticleH1_enUS());
	}

	////////////////////
	// articleH1_frFR //
	////////////////////

	/**	 L'entité articleH1_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleH1_frFR;
	@JsonIgnore
	public Couverture<String> articleH1_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("articleH1_frFR").o(articleH1_frFR);

	/**	<br/> L'entité articleH1_frFR
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleH1_frFR">Trouver l'entité articleH1_frFR dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleH1_frFR(Couverture<String> c);

	public String getArticleH1_frFR() {
		return articleH1_frFR;
	}

	public void setArticleH1_frFR(String articleH1_frFR) {
		this.articleH1_frFR = articleH1_frFR;
		this.articleH1_frFRCouverture.dejaInitialise = true;
	}
	protected Article articleH1_frFRInit() {
		if(!articleH1_frFRCouverture.dejaInitialise) {
			_articleH1_frFR(articleH1_frFRCouverture);
			if(articleH1_frFR == null)
				setArticleH1_frFR(articleH1_frFRCouverture.o);
		}
		articleH1_frFRCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleH1_frFR() {
		return articleH1_frFR;
	}

	public String strArticleH1_frFR() {
		return articleH1_frFR == null ? "" : articleH1_frFR;
	}

	public String jsonArticleH1_frFR() {
		return articleH1_frFR == null ? "" : articleH1_frFR;
	}

	public String nomAffichageArticleH1_frFR() {
		return "titre en français";
	}

	public String htmTooltipArticleH1_frFR() {
		return null;
	}

	public String htmArticleH1_frFR() {
		return articleH1_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strArticleH1_frFR());
	}

	////////////////////
	// articleH2_enUS //
	////////////////////

	/**	 L'entité articleH2_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleH2_enUS;
	@JsonIgnore
	public Couverture<String> articleH2_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("articleH2_enUS").o(articleH2_enUS);

	/**	<br/> L'entité articleH2_enUS
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleH2_enUS">Trouver l'entité articleH2_enUS dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleH2_enUS(Couverture<String> c);

	public String getArticleH2_enUS() {
		return articleH2_enUS;
	}

	public void setArticleH2_enUS(String articleH2_enUS) {
		this.articleH2_enUS = articleH2_enUS;
		this.articleH2_enUSCouverture.dejaInitialise = true;
	}
	protected Article articleH2_enUSInit() {
		if(!articleH2_enUSCouverture.dejaInitialise) {
			_articleH2_enUS(articleH2_enUSCouverture);
			if(articleH2_enUS == null)
				setArticleH2_enUS(articleH2_enUSCouverture.o);
		}
		articleH2_enUSCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleH2_enUS() {
		return articleH2_enUS;
	}

	public String strArticleH2_enUS() {
		return articleH2_enUS == null ? "" : articleH2_enUS;
	}

	public String jsonArticleH2_enUS() {
		return articleH2_enUS == null ? "" : articleH2_enUS;
	}

	public String nomAffichageArticleH2_enUS() {
		return null;
	}

	public String htmTooltipArticleH2_enUS() {
		return null;
	}

	public String htmArticleH2_enUS() {
		return articleH2_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strArticleH2_enUS());
	}

	////////////////////
	// articleH2_frFR //
	////////////////////

	/**	 L'entité articleH2_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleH2_frFR;
	@JsonIgnore
	public Couverture<String> articleH2_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("articleH2_frFR").o(articleH2_frFR);

	/**	<br/> L'entité articleH2_frFR
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleH2_frFR">Trouver l'entité articleH2_frFR dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleH2_frFR(Couverture<String> c);

	public String getArticleH2_frFR() {
		return articleH2_frFR;
	}

	public void setArticleH2_frFR(String articleH2_frFR) {
		this.articleH2_frFR = articleH2_frFR;
		this.articleH2_frFRCouverture.dejaInitialise = true;
	}
	protected Article articleH2_frFRInit() {
		if(!articleH2_frFRCouverture.dejaInitialise) {
			_articleH2_frFR(articleH2_frFRCouverture);
			if(articleH2_frFR == null)
				setArticleH2_frFR(articleH2_frFRCouverture.o);
		}
		articleH2_frFRCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleH2_frFR() {
		return articleH2_frFR;
	}

	public String strArticleH2_frFR() {
		return articleH2_frFR == null ? "" : articleH2_frFR;
	}

	public String jsonArticleH2_frFR() {
		return articleH2_frFR == null ? "" : articleH2_frFR;
	}

	public String nomAffichageArticleH2_frFR() {
		return null;
	}

	public String htmTooltipArticleH2_frFR() {
		return null;
	}

	public String htmArticleH2_frFR() {
		return articleH2_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strArticleH2_frFR());
	}

	///////////////
	// articleH1 //
	///////////////

	/**	 L'entité articleH1
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleH1;
	@JsonIgnore
	public Couverture<String> articleH1Couverture = new Couverture<String>().p(this).c(String.class).var("articleH1").o(articleH1);

	/**	<br/> L'entité articleH1
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleH1">Trouver l'entité articleH1 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleH1(Couverture<String> c);

	public String getArticleH1() {
		return articleH1;
	}

	public void setArticleH1(String articleH1) {
		this.articleH1 = articleH1;
		this.articleH1Couverture.dejaInitialise = true;
	}
	protected Article articleH1Init() {
		if(!articleH1Couverture.dejaInitialise) {
			_articleH1(articleH1Couverture);
			if(articleH1 == null)
				setArticleH1(articleH1Couverture.o);
		}
		articleH1Couverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleH1() {
		return articleH1;
	}

	public String strArticleH1() {
		return articleH1 == null ? "" : articleH1;
	}

	public String jsonArticleH1() {
		return articleH1 == null ? "" : articleH1;
	}

	public String nomAffichageArticleH1() {
		return null;
	}

	public String htmTooltipArticleH1() {
		return null;
	}

	public String htmArticleH1() {
		return articleH1 == null ? "" : StringEscapeUtils.escapeHtml4(strArticleH1());
	}

	///////////////
	// articleH2 //
	///////////////

	/**	 L'entité articleH2
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleH2;
	@JsonIgnore
	public Couverture<String> articleH2Couverture = new Couverture<String>().p(this).c(String.class).var("articleH2").o(articleH2);

	/**	<br/> L'entité articleH2
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleH2">Trouver l'entité articleH2 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleH2(Couverture<String> c);

	public String getArticleH2() {
		return articleH2;
	}

	public void setArticleH2(String articleH2) {
		this.articleH2 = articleH2;
		this.articleH2Couverture.dejaInitialise = true;
	}
	protected Article articleH2Init() {
		if(!articleH2Couverture.dejaInitialise) {
			_articleH2(articleH2Couverture);
			if(articleH2 == null)
				setArticleH2(articleH2Couverture.o);
		}
		articleH2Couverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleH2() {
		return articleH2;
	}

	public String strArticleH2() {
		return articleH2 == null ? "" : articleH2;
	}

	public String jsonArticleH2() {
		return articleH2 == null ? "" : articleH2;
	}

	public String nomAffichageArticleH2() {
		return null;
	}

	public String htmTooltipArticleH2() {
		return null;
	}

	public String htmArticleH2() {
		return articleH2 == null ? "" : StringEscapeUtils.escapeHtml4(strArticleH2());
	}

	////////////////////////
	// articleDescription //
	////////////////////////

	/**	 L'entité articleDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String articleDescription;
	@JsonIgnore
	public Couverture<String> articleDescriptionCouverture = new Couverture<String>().p(this).c(String.class).var("articleDescription").o(articleDescription);

	/**	<br/> L'entité articleDescription
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleDescription">Trouver l'entité articleDescription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleDescription(Couverture<String> c);

	public String getArticleDescription() {
		return articleDescription;
	}

	public void setArticleDescription(String articleDescription) {
		this.articleDescription = articleDescription;
		this.articleDescriptionCouverture.dejaInitialise = true;
	}
	protected Article articleDescriptionInit() {
		if(!articleDescriptionCouverture.dejaInitialise) {
			_articleDescription(articleDescriptionCouverture);
			if(articleDescription == null)
				setArticleDescription(articleDescriptionCouverture.o);
		}
		articleDescriptionCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrArticleDescription() {
		return articleDescription;
	}

	public String strArticleDescription() {
		return articleDescription == null ? "" : articleDescription;
	}

	public String jsonArticleDescription() {
		return articleDescription == null ? "" : articleDescription;
	}

	public String nomAffichageArticleDescription() {
		return "description";
	}

	public String htmTooltipArticleDescription() {
		return null;
	}

	public String htmArticleDescription() {
		return articleDescription == null ? "" : StringEscapeUtils.escapeHtml4(strArticleDescription());
	}

	public void inputArticleDescription(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{
			e("input")
				.a("type", "text")
				.a("placeholder", "description")
				.a("id", classeApiMethodeMethode, "_articleDescription");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setArticleDescription classArticle inputArticle", pk, "ArticleDescription w3-input w3-border ");
					a("name", "setArticleDescription");
				} else {
					a("class", "valeurArticleDescription w3-input w3-border classArticle inputArticle", pk, "ArticleDescription w3-input w3-border ");
					a("name", "articleDescription");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setArticleDescription', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_articleDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_articleDescription')); }); ");
				}
				a("value", strArticleDescription())
			.fg();

		}
	}

	public void htmArticleDescription(String classeApiMethodeMethode) {
		Article s = (Article)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "ArticleArticleDescription").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_articleDescription").a("class", "").f().sx("description").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputArticleDescription(classeApiMethodeMethode);
							} g("div");
							{
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_articleDescription')); $('#", classeApiMethodeMethode, "_articleDescription').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#ArticleForm :input[name=pk]').val() }], 'setArticleDescription', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_articleDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_articleDescription')); }); ")
											.f();
											e("i").a("class", "far fa-eraser ").f().g("i");
										} g("button");
									} g("div");
								}
							}
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	/////////////////////
	// pageDescription //
	/////////////////////

	/**	 L'entité pageDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageDescription;
	@JsonIgnore
	public Couverture<String> pageDescriptionCouverture = new Couverture<String>().p(this).c(String.class).var("pageDescription").o(pageDescription);

	/**	<br/> L'entité pageDescription
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageDescription">Trouver l'entité pageDescription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageDescription(Couverture<String> c);

	public String getPageDescription() {
		return pageDescription;
	}

	public void setPageDescription(String pageDescription) {
		this.pageDescription = pageDescription;
		this.pageDescriptionCouverture.dejaInitialise = true;
	}
	protected Article pageDescriptionInit() {
		if(!pageDescriptionCouverture.dejaInitialise) {
			_pageDescription(pageDescriptionCouverture);
			if(pageDescription == null)
				setPageDescription(pageDescriptionCouverture.o);
		}
		pageDescriptionCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageDescription() {
		return pageDescription;
	}

	public String strPageDescription() {
		return pageDescription == null ? "" : pageDescription;
	}

	public String jsonPageDescription() {
		return pageDescription == null ? "" : pageDescription;
	}

	public String nomAffichagePageDescription() {
		return null;
	}

	public String htmTooltipPageDescription() {
		return null;
	}

	public String htmPageDescription() {
		return pageDescription == null ? "" : StringEscapeUtils.escapeHtml4(strPageDescription());
	}

	/////////////////
	// articleCree //
	/////////////////

	/**	 L'entité articleCree
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected LocalDateTime articleCree;
	@JsonIgnore
	public Couverture<LocalDateTime> articleCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("articleCree").o(articleCree);

	/**	<br/> L'entité articleCree
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:articleCree">Trouver l'entité articleCree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _articleCree(Couverture<LocalDateTime> c);

	public LocalDateTime getArticleCree() {
		return articleCree;
	}

	public void setArticleCree(LocalDateTime articleCree) {
		this.articleCree = articleCree;
		this.articleCreeCouverture.dejaInitialise = true;
	}
	public Article setArticleCree(Instant o) {
		this.articleCree = o == null ? null : LocalDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
		this.articleCreeCouverture.dejaInitialise = true;
		return (Article)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Article setArticleCree(String o) {
		this.articleCree = o == null ? null : LocalDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		this.articleCreeCouverture.dejaInitialise = true;
		return (Article)this;
	}
	public Article setArticleCree(Date o) {
		this.articleCree = o == null ? null : LocalDateTime.ofInstant(o.toInstant(), ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).truncatedTo(ChronoUnit.MILLIS);
		this.articleCreeCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article articleCreeInit() {
		if(!articleCreeCouverture.dejaInitialise) {
			_articleCree(articleCreeCouverture);
			if(articleCree == null)
				setArticleCree(articleCreeCouverture.o);
		}
		articleCreeCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Date solrArticleCree() {
		return articleCree == null ? null : Date.from(articleCree.atZone(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z")).toInstant());
	}

	public String strArticleCree() {
		return articleCree == null ? "" : articleCree.format(DateTimeFormatter.ofPattern("EEE d MMM yyyy H'h'mm:ss a zz", Locale.forLanguageTag("fr-FR")));
	}

	public String jsonArticleCree() {
		return articleCree == null ? "" : articleCree.format(DateTimeFormatter.ISO_DATE_TIME);
	}

	public String nomAffichageArticleCree() {
		return null;
	}

	public String htmTooltipArticleCree() {
		return null;
	}

	public String htmArticleCree() {
		return articleCree == null ? "" : StringEscapeUtils.escapeHtml4(strArticleCree());
	}

	//////////////////
	// pageUri_enUS //
	//////////////////

	/**	 L'entité pageUri_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageUri_enUS;
	@JsonIgnore
	public Couverture<String> pageUri_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri_enUS").o(pageUri_enUS);

	/**	<br/> L'entité pageUri_enUS
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUri_enUS">Trouver l'entité pageUri_enUS dans Solr</a>
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
	protected Article pageUri_enUSInit() {
		if(!pageUri_enUSCouverture.dejaInitialise) {
			_pageUri_enUS(pageUri_enUSCouverture);
			if(pageUri_enUS == null)
				setPageUri_enUS(pageUri_enUSCouverture.o);
		}
		pageUri_enUSCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageUri_enUS() {
		return pageUri_enUS;
	}

	public String strPageUri_enUS() {
		return pageUri_enUS == null ? "" : pageUri_enUS;
	}

	public String jsonPageUri_enUS() {
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

	/**	 L'entité pageUri_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageUri_frFR;
	@JsonIgnore
	public Couverture<String> pageUri_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri_frFR").o(pageUri_frFR);

	/**	<br/> L'entité pageUri_frFR
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUri_frFR">Trouver l'entité pageUri_frFR dans Solr</a>
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
	protected Article pageUri_frFRInit() {
		if(!pageUri_frFRCouverture.dejaInitialise) {
			_pageUri_frFR(pageUri_frFRCouverture);
			if(pageUri_frFR == null)
				setPageUri_frFR(pageUri_frFRCouverture.o);
		}
		pageUri_frFRCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageUri_frFR() {
		return pageUri_frFR;
	}

	public String strPageUri_frFR() {
		return pageUri_frFR == null ? "" : pageUri_frFR;
	}

	public String jsonPageUri_frFR() {
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

	/////////////
	// pageUri //
	/////////////

	/**	 L'entité pageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageUri;
	@JsonIgnore
	public Couverture<String> pageUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageUri").o(pageUri);

	/**	<br/> L'entité pageUri
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageUri">Trouver l'entité pageUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageUri(Couverture<String> c);

	public String getPageUri() {
		return pageUri;
	}

	public void setPageUri(String pageUri) {
		this.pageUri = pageUri;
		this.pageUriCouverture.dejaInitialise = true;
	}
	protected Article pageUriInit() {
		if(!pageUriCouverture.dejaInitialise) {
			_pageUri(pageUriCouverture);
			if(pageUri == null)
				setPageUri(pageUriCouverture.o);
		}
		pageUriCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageUri() {
		return pageUri;
	}

	public String strPageUri() {
		return pageUri == null ? "" : pageUri;
	}

	public String jsonPageUri() {
		return pageUri == null ? "" : pageUri;
	}

	public String nomAffichagePageUri() {
		return null;
	}

	public String htmTooltipPageUri() {
		return null;
	}

	public String htmPageUri() {
		return pageUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageUri());
	}

	///////////////////////
	// pageImageUri_enUS //
	///////////////////////

	/**	 L'entité pageImageUri_enUS
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri_enUS;
	@JsonIgnore
	public Couverture<String> pageImageUri_enUSCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUri_enUS").o(pageImageUri_enUS);

	/**	<br/> L'entité pageImageUri_enUS
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageUri_enUS">Trouver l'entité pageImageUri_enUS dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUri_enUS(Couverture<String> c);

	public String getPageImageUri_enUS() {
		return pageImageUri_enUS;
	}

	public void setPageImageUri_enUS(String pageImageUri_enUS) {
		this.pageImageUri_enUS = pageImageUri_enUS;
		this.pageImageUri_enUSCouverture.dejaInitialise = true;
	}
	protected Article pageImageUri_enUSInit() {
		if(!pageImageUri_enUSCouverture.dejaInitialise) {
			_pageImageUri_enUS(pageImageUri_enUSCouverture);
			if(pageImageUri_enUS == null)
				setPageImageUri_enUS(pageImageUri_enUSCouverture.o);
		}
		pageImageUri_enUSCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageImageUri_enUS() {
		return pageImageUri_enUS;
	}

	public String strPageImageUri_enUS() {
		return pageImageUri_enUS == null ? "" : pageImageUri_enUS;
	}

	public String jsonPageImageUri_enUS() {
		return pageImageUri_enUS == null ? "" : pageImageUri_enUS;
	}

	public String nomAffichagePageImageUri_enUS() {
		return null;
	}

	public String htmTooltipPageImageUri_enUS() {
		return null;
	}

	public String htmPageImageUri_enUS() {
		return pageImageUri_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUri_enUS());
	}

	///////////////////////
	// pageImageUri_frFR //
	///////////////////////

	/**	 L'entité pageImageUri_frFR
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri_frFR;
	@JsonIgnore
	public Couverture<String> pageImageUri_frFRCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUri_frFR").o(pageImageUri_frFR);

	/**	<br/> L'entité pageImageUri_frFR
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageUri_frFR">Trouver l'entité pageImageUri_frFR dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUri_frFR(Couverture<String> c);

	public String getPageImageUri_frFR() {
		return pageImageUri_frFR;
	}

	public void setPageImageUri_frFR(String pageImageUri_frFR) {
		this.pageImageUri_frFR = pageImageUri_frFR;
		this.pageImageUri_frFRCouverture.dejaInitialise = true;
	}
	protected Article pageImageUri_frFRInit() {
		if(!pageImageUri_frFRCouverture.dejaInitialise) {
			_pageImageUri_frFR(pageImageUri_frFRCouverture);
			if(pageImageUri_frFR == null)
				setPageImageUri_frFR(pageImageUri_frFRCouverture.o);
		}
		pageImageUri_frFRCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageImageUri_frFR() {
		return pageImageUri_frFR;
	}

	public String strPageImageUri_frFR() {
		return pageImageUri_frFR == null ? "" : pageImageUri_frFR;
	}

	public String jsonPageImageUri_frFR() {
		return pageImageUri_frFR == null ? "" : pageImageUri_frFR;
	}

	public String nomAffichagePageImageUri_frFR() {
		return null;
	}

	public String htmTooltipPageImageUri_frFR() {
		return null;
	}

	public String htmPageImageUri_frFR() {
		return pageImageUri_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUri_frFR());
	}

	//////////////////
	// pageImageUri //
	//////////////////

	/**	 L'entité pageImageUri
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageImageUri;
	@JsonIgnore
	public Couverture<String> pageImageUriCouverture = new Couverture<String>().p(this).c(String.class).var("pageImageUri").o(pageImageUri);

	/**	<br/> L'entité pageImageUri
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageImageUri">Trouver l'entité pageImageUri dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageImageUri(Couverture<String> c);

	public String getPageImageUri() {
		return pageImageUri;
	}

	public void setPageImageUri(String pageImageUri) {
		this.pageImageUri = pageImageUri;
		this.pageImageUriCouverture.dejaInitialise = true;
	}
	protected Article pageImageUriInit() {
		if(!pageImageUriCouverture.dejaInitialise) {
			_pageImageUri(pageImageUriCouverture);
			if(pageImageUri == null)
				setPageImageUri(pageImageUriCouverture.o);
		}
		pageImageUriCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageImageUri() {
		return pageImageUri;
	}

	public String strPageImageUri() {
		return pageImageUri == null ? "" : pageImageUri;
	}

	public String jsonPageImageUri() {
		return pageImageUri == null ? "" : pageImageUri;
	}

	public String nomAffichagePageImageUri() {
		return null;
	}

	public String htmTooltipPageImageUri() {
		return null;
	}

	public String htmPageImageUri() {
		return pageImageUri == null ? "" : StringEscapeUtils.escapeHtml4(strPageImageUri());
	}

	//////////////
	// pageCree //
	//////////////

	/**	 L'entité pageCree
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected LocalDateTime pageCree;
	@JsonIgnore
	public Couverture<LocalDateTime> pageCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("pageCree").o(pageCree);

	/**	<br/> L'entité pageCree
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageCree">Trouver l'entité pageCree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageCree(Couverture<LocalDateTime> c);

	public LocalDateTime getPageCree() {
		return pageCree;
	}

	public void setPageCree(LocalDateTime pageCree) {
		this.pageCree = pageCree;
		this.pageCreeCouverture.dejaInitialise = true;
	}
	public Article setPageCree(Instant o) {
		this.pageCree = o == null ? null : LocalDateTime.from(o).truncatedTo(ChronoUnit.MILLIS);
		this.pageCreeCouverture.dejaInitialise = true;
		return (Article)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Article setPageCree(String o) {
		this.pageCree = o == null ? null : LocalDateTime.parse(o, DateTimeFormatter.ISO_DATE_TIME).truncatedTo(ChronoUnit.MILLIS);
		this.pageCreeCouverture.dejaInitialise = true;
		return (Article)this;
	}
	public Article setPageCree(Date o) {
		this.pageCree = o == null ? null : LocalDateTime.ofInstant(o.toInstant(), ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).truncatedTo(ChronoUnit.MILLIS);
		this.pageCreeCouverture.dejaInitialise = true;
		return (Article)this;
	}
	protected Article pageCreeInit() {
		if(!pageCreeCouverture.dejaInitialise) {
			_pageCree(pageCreeCouverture);
			if(pageCree == null)
				setPageCree(pageCreeCouverture.o);
		}
		pageCreeCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public Date solrPageCree() {
		return pageCree == null ? null : Date.from(pageCree.atZone(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z")).toInstant());
	}

	public String strPageCree() {
		return pageCree == null ? "" : pageCree.format(DateTimeFormatter.ofPattern("EEE d MMM yyyy H'h'mm:ss a zz", Locale.forLanguageTag("fr-FR")));
	}

	public String jsonPageCree() {
		return pageCree == null ? "" : pageCree.format(DateTimeFormatter.ISO_DATE_TIME);
	}

	public String nomAffichagePageCree() {
		return null;
	}

	public String htmTooltipPageCree() {
		return null;
	}

	public String htmPageCree() {
		return pageCree == null ? "" : StringEscapeUtils.escapeHtml4(strPageCree());
	}

	////////////
	// pageH1 //
	////////////

	/**	 L'entité pageH1
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageH1;
	@JsonIgnore
	public Couverture<String> pageH1Couverture = new Couverture<String>().p(this).c(String.class).var("pageH1").o(pageH1);

	/**	<br/> L'entité pageH1
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH1">Trouver l'entité pageH1 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH1(Couverture<String> c);

	public String getPageH1() {
		return pageH1;
	}

	public void setPageH1(String pageH1) {
		this.pageH1 = pageH1;
		this.pageH1Couverture.dejaInitialise = true;
	}
	protected Article pageH1Init() {
		if(!pageH1Couverture.dejaInitialise) {
			_pageH1(pageH1Couverture);
			if(pageH1 == null)
				setPageH1(pageH1Couverture.o);
		}
		pageH1Couverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageH1() {
		return pageH1;
	}

	public String strPageH1() {
		return pageH1 == null ? "" : pageH1;
	}

	public String jsonPageH1() {
		return pageH1 == null ? "" : pageH1;
	}

	public String nomAffichagePageH1() {
		return null;
	}

	public String htmTooltipPageH1() {
		return null;
	}

	public String htmPageH1() {
		return pageH1 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH1());
	}

	////////////
	// pageH2 //
	////////////

	/**	 L'entité pageH2
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageH2;
	@JsonIgnore
	public Couverture<String> pageH2Couverture = new Couverture<String>().p(this).c(String.class).var("pageH2").o(pageH2);

	/**	<br/> L'entité pageH2
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH2">Trouver l'entité pageH2 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH2(Couverture<String> c);

	public String getPageH2() {
		return pageH2;
	}

	public void setPageH2(String pageH2) {
		this.pageH2 = pageH2;
		this.pageH2Couverture.dejaInitialise = true;
	}
	protected Article pageH2Init() {
		if(!pageH2Couverture.dejaInitialise) {
			_pageH2(pageH2Couverture);
			if(pageH2 == null)
				setPageH2(pageH2Couverture.o);
		}
		pageH2Couverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageH2() {
		return pageH2;
	}

	public String strPageH2() {
		return pageH2 == null ? "" : pageH2;
	}

	public String jsonPageH2() {
		return pageH2 == null ? "" : pageH2;
	}

	public String nomAffichagePageH2() {
		return null;
	}

	public String htmTooltipPageH2() {
		return null;
	}

	public String htmPageH2() {
		return pageH2 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH2());
	}

	////////////
	// pageH3 //
	////////////

	/**	 L'entité pageH3
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageH3;
	@JsonIgnore
	public Couverture<String> pageH3Couverture = new Couverture<String>().p(this).c(String.class).var("pageH3").o(pageH3);

	/**	<br/> L'entité pageH3
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageH3">Trouver l'entité pageH3 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageH3(Couverture<String> c);

	public String getPageH3() {
		return pageH3;
	}

	public void setPageH3(String pageH3) {
		this.pageH3 = pageH3;
		this.pageH3Couverture.dejaInitialise = true;
	}
	protected Article pageH3Init() {
		if(!pageH3Couverture.dejaInitialise) {
			_pageH3(pageH3Couverture);
			if(pageH3 == null)
				setPageH3(pageH3Couverture.o);
		}
		pageH3Couverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageH3() {
		return pageH3;
	}

	public String strPageH3() {
		return pageH3 == null ? "" : pageH3;
	}

	public String jsonPageH3() {
		return pageH3 == null ? "" : pageH3;
	}

	public String nomAffichagePageH3() {
		return null;
	}

	public String htmTooltipPageH3() {
		return null;
	}

	public String htmPageH3() {
		return pageH3 == null ? "" : StringEscapeUtils.escapeHtml4(strPageH3());
	}

	///////////////
	// pageTitre //
	///////////////

	/**	 L'entité pageTitre
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String pageTitre;
	@JsonIgnore
	public Couverture<String> pageTitreCouverture = new Couverture<String>().p(this).c(String.class).var("pageTitre").o(pageTitre);

	/**	<br/> L'entité pageTitre
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageTitre">Trouver l'entité pageTitre dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pageTitre(Couverture<String> c);

	public String getPageTitre() {
		return pageTitre;
	}

	public void setPageTitre(String pageTitre) {
		this.pageTitre = pageTitre;
		this.pageTitreCouverture.dejaInitialise = true;
	}
	protected Article pageTitreInit() {
		if(!pageTitreCouverture.dejaInitialise) {
			_pageTitre(pageTitreCouverture);
			if(pageTitre == null)
				setPageTitre(pageTitreCouverture.o);
		}
		pageTitreCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrPageTitre() {
		return pageTitre;
	}

	public String strPageTitre() {
		return pageTitre == null ? "" : pageTitre;
	}

	public String jsonPageTitre() {
		return pageTitre == null ? "" : pageTitre;
	}

	public String nomAffichagePageTitre() {
		return null;
	}

	public String htmTooltipPageTitre() {
		return null;
	}

	public String htmPageTitre() {
		return pageTitre == null ? "" : StringEscapeUtils.escapeHtml4(strPageTitre());
	}

	////////////////////////
	// pageRecherche_enUS //
	////////////////////////

	/**	 L'entité pageRecherche_enUS
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected List<String> pageRecherche_enUS = new ArrayList<String>();
	@JsonIgnore
	public Couverture<List<String>> pageRecherche_enUSCouverture = new Couverture<List<String>>().p(this).c(List.class).var("pageRecherche_enUS").o(pageRecherche_enUS);

	/**	<br/> L'entité pageRecherche_enUS
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageRecherche_enUS">Trouver l'entité pageRecherche_enUS dans Solr</a>
	 * <br/>
	 * @param pageRecherche_enUS est l'entité déjà construit. 
	 **/
	protected abstract void _pageRecherche_enUS(List<String> l);

	public List<String> getPageRecherche_enUS() {
		return pageRecherche_enUS;
	}

	public void setPageRecherche_enUS(List<String> pageRecherche_enUS) {
		this.pageRecherche_enUS = pageRecherche_enUS;
		this.pageRecherche_enUSCouverture.dejaInitialise = true;
	}
	public Article addPageRecherche_enUS(String...objets) {
		for(String o : objets) {
			addPageRecherche_enUS(o);
		}
		return (Article)this;
	}
	public Article addPageRecherche_enUS(String o) {
		if(o != null && !pageRecherche_enUS.contains(o))
			this.pageRecherche_enUS.add(o);
		return (Article)this;
	}
	public Article setPageRecherche_enUS(JsonArray objets) {
		pageRecherche_enUS.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addPageRecherche_enUS(o);
		}
		return (Article)this;
	}
	protected Article pageRecherche_enUSInit() {
		if(!pageRecherche_enUSCouverture.dejaInitialise) {
			_pageRecherche_enUS(pageRecherche_enUS);
		}
		pageRecherche_enUSCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public List<String> solrPageRecherche_enUS() {
		return pageRecherche_enUS;
	}

	public String strPageRecherche_enUS() {
		return pageRecherche_enUS == null ? "" : pageRecherche_enUS.toString();
	}

	public String jsonPageRecherche_enUS() {
		return pageRecherche_enUS == null ? "" : pageRecherche_enUS.toString();
	}

	public String nomAffichagePageRecherche_enUS() {
		return null;
	}

	public String htmTooltipPageRecherche_enUS() {
		return null;
	}

	public String htmPageRecherche_enUS() {
		return pageRecherche_enUS == null ? "" : StringEscapeUtils.escapeHtml4(strPageRecherche_enUS());
	}

	////////////////////////
	// pageRecherche_frFR //
	////////////////////////

	/**	 L'entité pageRecherche_frFR
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	@JsonInclude(Include.NON_NULL)
	protected List<String> pageRecherche_frFR = new ArrayList<String>();
	@JsonIgnore
	public Couverture<List<String>> pageRecherche_frFRCouverture = new Couverture<List<String>>().p(this).c(List.class).var("pageRecherche_frFR").o(pageRecherche_frFR);

	/**	<br/> L'entité pageRecherche_frFR
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:pageRecherche_frFR">Trouver l'entité pageRecherche_frFR dans Solr</a>
	 * <br/>
	 * @param pageRecherche_frFR est l'entité déjà construit. 
	 **/
	protected abstract void _pageRecherche_frFR(List<String> l);

	public List<String> getPageRecherche_frFR() {
		return pageRecherche_frFR;
	}

	public void setPageRecherche_frFR(List<String> pageRecherche_frFR) {
		this.pageRecherche_frFR = pageRecherche_frFR;
		this.pageRecherche_frFRCouverture.dejaInitialise = true;
	}
	public Article addPageRecherche_frFR(String...objets) {
		for(String o : objets) {
			addPageRecherche_frFR(o);
		}
		return (Article)this;
	}
	public Article addPageRecherche_frFR(String o) {
		if(o != null && !pageRecherche_frFR.contains(o))
			this.pageRecherche_frFR.add(o);
		return (Article)this;
	}
	public Article setPageRecherche_frFR(JsonArray objets) {
		pageRecherche_frFR.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addPageRecherche_frFR(o);
		}
		return (Article)this;
	}
	protected Article pageRecherche_frFRInit() {
		if(!pageRecherche_frFRCouverture.dejaInitialise) {
			_pageRecherche_frFR(pageRecherche_frFR);
		}
		pageRecherche_frFRCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public List<String> solrPageRecherche_frFR() {
		return pageRecherche_frFR;
	}

	public String strPageRecherche_frFR() {
		return pageRecherche_frFR == null ? "" : pageRecherche_frFR.toString();
	}

	public String jsonPageRecherche_frFR() {
		return pageRecherche_frFR == null ? "" : pageRecherche_frFR.toString();
	}

	public String nomAffichagePageRecherche_frFR() {
		return null;
	}

	public String htmTooltipPageRecherche_frFR() {
		return null;
	}

	public String htmPageRecherche_frFR() {
		return pageRecherche_frFR == null ? "" : StringEscapeUtils.escapeHtml4(strPageRecherche_frFR());
	}

	/////////////////////
	// utilisateurSite //
	/////////////////////

	/**	 L'entité utilisateurSite
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected UtilisateurSite utilisateurSite;
	@JsonIgnore
	public Couverture<UtilisateurSite> utilisateurSiteCouverture = new Couverture<UtilisateurSite>().p(this).c(UtilisateurSite.class).var("utilisateurSite").o(utilisateurSite);

	/**	<br/> L'entité utilisateurSite
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurSite">Trouver l'entité utilisateurSite dans Solr</a>
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
	protected Article utilisateurSiteInit() {
		if(!utilisateurSiteCouverture.dejaInitialise) {
			_utilisateurSite(utilisateurSiteCouverture);
			if(utilisateurSite == null)
				setUtilisateurSite(utilisateurSiteCouverture.o);
		}
		if(utilisateurSite != null)
			utilisateurSite.initLoinPourClasse(requeteSite_);
		utilisateurSiteCouverture.dejaInitialise(true);
		return (Article)this;
	}

	///////////////////
	// utilisateurId //
	///////////////////

	/**	 L'entité utilisateurId
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String utilisateurId;
	@JsonIgnore
	public Couverture<String> utilisateurIdCouverture = new Couverture<String>().p(this).c(String.class).var("utilisateurId").o(utilisateurId);

	/**	<br/> L'entité utilisateurId
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.article.Article&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurId">Trouver l'entité utilisateurId dans Solr</a>
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
	protected Article utilisateurIdInit() {
		if(!utilisateurIdCouverture.dejaInitialise) {
			_utilisateurId(utilisateurIdCouverture);
			if(utilisateurId == null)
				setUtilisateurId(utilisateurIdCouverture.o);
		}
		utilisateurIdCouverture.dejaInitialise(true);
		return (Article)this;
	}

	public String solrUtilisateurId() {
		return utilisateurId;
	}

	public String strUtilisateurId() {
		return utilisateurId == null ? "" : utilisateurId;
	}

	public String jsonUtilisateurId() {
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

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseArticle = false;

	public Article initLoinArticle(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseArticle) {
			dejaInitialiseArticle = true;
			initLoinArticle();
		}
		return (Article)this;
	}

	public void initLoinArticle() {
		initArticle();
		super.initLoinCluster(requeteSite_);
	}

	public void initArticle() {
		statiqueUrlBaseInit();
		documentSolrInit();
		nomDomaineInit();
		nomSiteInit();
		nomHoteSiteInit();
		nomEnsembleSiteInit();
		nomHoteOrdinateurInit();
		cheminServeurInit();
		cheminProjetInit();
		utilisateurNomInit();
		groupeNomInit();
		estCoursInit();
		estLeconInit();
		estArticleInit();
		coursNumeroInit();
		leconNumeroInit();
		leconDescriptionInit();
		articleH1_enUSInit();
		articleH1_frFRInit();
		articleH2_enUSInit();
		articleH2_frFRInit();
		articleH1Init();
		articleH2Init();
		articleDescriptionInit();
		pageDescriptionInit();
		articleCreeInit();
		pageUri_enUSInit();
		pageUri_frFRInit();
		pageUriInit();
		pageImageUri_enUSInit();
		pageImageUri_frFRInit();
		pageImageUriInit();
		pageCreeInit();
		pageH1Init();
		pageH2Init();
		pageH3Init();
		pageTitreInit();
		pageRecherche_enUSInit();
		pageRecherche_frFRInit();
		utilisateurSiteInit();
		utilisateurIdInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinArticle(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteArticle(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteCluster(requeteSite_);
		if(utilisateurSite != null)
			utilisateurSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteArticle(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirArticle(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirArticle(String var) {
		Article oArticle = (Article)this;
		switch(var) {
			case "statiqueUrlBase":
				return oArticle.statiqueUrlBase;
			case "documentSolr":
				return oArticle.documentSolr;
			case "nomDomaine":
				return oArticle.nomDomaine;
			case "nomSite":
				return oArticle.nomSite;
			case "nomHoteSite":
				return oArticle.nomHoteSite;
			case "nomEnsembleSite":
				return oArticle.nomEnsembleSite;
			case "nomHoteOrdinateur":
				return oArticle.nomHoteOrdinateur;
			case "cheminServeur":
				return oArticle.cheminServeur;
			case "cheminProjet":
				return oArticle.cheminProjet;
			case "utilisateurNom":
				return oArticle.utilisateurNom;
			case "groupeNom":
				return oArticle.groupeNom;
			case "estCours":
				return oArticle.estCours;
			case "estLecon":
				return oArticle.estLecon;
			case "estArticle":
				return oArticle.estArticle;
			case "coursNumero":
				return oArticle.coursNumero;
			case "leconNumero":
				return oArticle.leconNumero;
			case "leconDescription":
				return oArticle.leconDescription;
			case "articleH1_enUS":
				return oArticle.articleH1_enUS;
			case "articleH1_frFR":
				return oArticle.articleH1_frFR;
			case "articleH2_enUS":
				return oArticle.articleH2_enUS;
			case "articleH2_frFR":
				return oArticle.articleH2_frFR;
			case "articleH1":
				return oArticle.articleH1;
			case "articleH2":
				return oArticle.articleH2;
			case "articleDescription":
				return oArticle.articleDescription;
			case "pageDescription":
				return oArticle.pageDescription;
			case "articleCree":
				return oArticle.articleCree;
			case "pageUri_enUS":
				return oArticle.pageUri_enUS;
			case "pageUri_frFR":
				return oArticle.pageUri_frFR;
			case "pageUri":
				return oArticle.pageUri;
			case "pageImageUri_enUS":
				return oArticle.pageImageUri_enUS;
			case "pageImageUri_frFR":
				return oArticle.pageImageUri_frFR;
			case "pageImageUri":
				return oArticle.pageImageUri;
			case "pageCree":
				return oArticle.pageCree;
			case "pageH1":
				return oArticle.pageH1;
			case "pageH2":
				return oArticle.pageH2;
			case "pageH3":
				return oArticle.pageH3;
			case "pageTitre":
				return oArticle.pageTitre;
			case "pageRecherche_enUS":
				return oArticle.pageRecherche_enUS;
			case "pageRecherche_frFR":
				return oArticle.pageRecherche_frFR;
			case "utilisateurSite":
				return oArticle.utilisateurSite;
			case "utilisateurId":
				return oArticle.utilisateurId;
			default:
				return super.obtenirCluster(var);
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
				o = attribuerArticle(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerArticle(String var, Object val) {
		Article oArticle = (Article)this;
		switch(var) {
			default:
				return super.attribuerCluster(var, val);
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
					o = definirArticle(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirArticle(String var, String val) {
		switch(var) {
			case "coursNumero":
				if(val != null)
					setCoursNumero(val);
				sauvegardes.add(var);
				return val;
			case "leconNumero":
				if(val != null)
					setLeconNumero(val);
				sauvegardes.add(var);
				return val;
			case "leconDescription":
				if(val != null)
					setLeconDescription(val);
				sauvegardes.add(var);
				return val;
			case "articleDescription":
				if(val != null)
					setArticleDescription(val);
				sauvegardes.add(var);
				return val;
			default:
				return super.definirCluster(var, val);
		}
	}

	/////////////
	// peupler //
	/////////////

	@Override public void peuplerPourClasse(SolrDocument solrDocument) {
		peuplerArticle(solrDocument);
	}
	public void peuplerArticle(SolrDocument solrDocument) {
		Article oArticle = (Article)this;
		sauvegardes = (List<String>)solrDocument.get("sauvegardes_stored_strings");
		if(sauvegardes != null) {

			if(sauvegardes.contains("estCours")) {
				Boolean estCours = (Boolean)solrDocument.get("estCours_stored_boolean");
				if(estCours != null)
					oArticle.setEstCours(estCours);
			}

			if(sauvegardes.contains("estLecon")) {
				Boolean estLecon = (Boolean)solrDocument.get("estLecon_stored_boolean");
				if(estLecon != null)
					oArticle.setEstLecon(estLecon);
			}

			if(sauvegardes.contains("estArticle")) {
				Boolean estArticle = (Boolean)solrDocument.get("estArticle_stored_boolean");
				if(estArticle != null)
					oArticle.setEstArticle(estArticle);
			}

			if(sauvegardes.contains("coursNumero")) {
				Integer coursNumero = (Integer)solrDocument.get("coursNumero_stored_int");
				if(coursNumero != null)
					oArticle.setCoursNumero(coursNumero);
			}

			if(sauvegardes.contains("leconNumero")) {
				Integer leconNumero = (Integer)solrDocument.get("leconNumero_stored_int");
				if(leconNumero != null)
					oArticle.setLeconNumero(leconNumero);
			}

			if(sauvegardes.contains("leconDescription")) {
				String leconDescription = (String)solrDocument.get("leconDescription_stored_string");
				if(leconDescription != null)
					oArticle.setLeconDescription(leconDescription);
			}

			if(sauvegardes.contains("articleH1_enUS")) {
				String articleH1_enUS = (String)solrDocument.get("articleH1_enUS_stored_string");
				if(articleH1_enUS != null)
					oArticle.setArticleH1_enUS(articleH1_enUS);
			}

			if(sauvegardes.contains("articleH1_frFR")) {
				String articleH1_frFR = (String)solrDocument.get("articleH1_frFR_stored_string");
				if(articleH1_frFR != null)
					oArticle.setArticleH1_frFR(articleH1_frFR);
			}

			if(sauvegardes.contains("articleH2_enUS")) {
				String articleH2_enUS = (String)solrDocument.get("articleH2_enUS_stored_string");
				if(articleH2_enUS != null)
					oArticle.setArticleH2_enUS(articleH2_enUS);
			}

			if(sauvegardes.contains("articleH2_frFR")) {
				String articleH2_frFR = (String)solrDocument.get("articleH2_frFR_stored_string");
				if(articleH2_frFR != null)
					oArticle.setArticleH2_frFR(articleH2_frFR);
			}

			if(sauvegardes.contains("articleDescription")) {
				String articleDescription = (String)solrDocument.get("articleDescription_stored_string");
				if(articleDescription != null)
					oArticle.setArticleDescription(articleDescription);
			}

			if(sauvegardes.contains("articleCree")) {
				Date articleCree = (Date)solrDocument.get("articleCree_stored_date");
				if(articleCree != null)
					oArticle.setArticleCree(articleCree);
			}

			if(sauvegardes.contains("pageUri_enUS")) {
				String pageUri_enUS = (String)solrDocument.get("pageUri_enUS_stored_string");
				if(pageUri_enUS != null)
					oArticle.setPageUri_enUS(pageUri_enUS);
			}

			if(sauvegardes.contains("pageUri_frFR")) {
				String pageUri_frFR = (String)solrDocument.get("pageUri_frFR_stored_string");
				if(pageUri_frFR != null)
					oArticle.setPageUri_frFR(pageUri_frFR);
			}

			if(sauvegardes.contains("pageImageUri_enUS")) {
				String pageImageUri_enUS = (String)solrDocument.get("pageImageUri_enUS_stored_string");
				if(pageImageUri_enUS != null)
					oArticle.setPageImageUri_enUS(pageImageUri_enUS);
			}

			if(sauvegardes.contains("pageImageUri_frFR")) {
				String pageImageUri_frFR = (String)solrDocument.get("pageImageUri_frFR_stored_string");
				if(pageImageUri_frFR != null)
					oArticle.setPageImageUri_frFR(pageImageUri_frFR);
			}

			if(sauvegardes.contains("pageCree")) {
				Date pageCree = (Date)solrDocument.get("pageCree_stored_date");
				if(pageCree != null)
					oArticle.setPageCree(pageCree);
			}

			if(sauvegardes.contains("pageH1")) {
				String pageH1 = (String)solrDocument.get("pageH1_stored_string");
				if(pageH1 != null)
					oArticle.setPageH1(pageH1);
			}

			if(sauvegardes.contains("pageH2")) {
				String pageH2 = (String)solrDocument.get("pageH2_stored_string");
				if(pageH2 != null)
					oArticle.setPageH2(pageH2);
			}

			if(sauvegardes.contains("pageH3")) {
				String pageH3 = (String)solrDocument.get("pageH3_stored_string");
				if(pageH3 != null)
					oArticle.setPageH3(pageH3);
			}

			if(sauvegardes.contains("pageTitre")) {
				String pageTitre = (String)solrDocument.get("pageTitre_stored_string");
				if(pageTitre != null)
					oArticle.setPageTitre(pageTitre);
			}
		}

		super.peuplerCluster(solrDocument);
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
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frfr.article.Article"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			Article o = new Article();
			o.requeteSiteArticle(requeteSite);
			o.initLoinArticle(requeteSite);
			o.indexerArticle();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerArticle();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerArticle(document);
	}

	public void indexerArticle(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerArticle(document);
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerArticle() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerArticle(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerArticle(SolrInputDocument document) {
		if(estCours != null) {
			document.addField("estCours_indexed_boolean", estCours);
			document.addField("estCours_stored_boolean", estCours);
		}
		if(estLecon != null) {
			document.addField("estLecon_indexed_boolean", estLecon);
			document.addField("estLecon_stored_boolean", estLecon);
		}
		if(estArticle != null) {
			document.addField("estArticle_indexed_boolean", estArticle);
			document.addField("estArticle_stored_boolean", estArticle);
		}
		if(coursNumero != null) {
			document.addField("coursNumero_indexed_int", coursNumero);
			document.addField("coursNumero_stored_int", coursNumero);
		}
		if(leconNumero != null) {
			document.addField("leconNumero_indexed_int", leconNumero);
			document.addField("leconNumero_stored_int", leconNumero);
		}
		if(leconDescription != null) {
			document.addField("leconDescription_indexed_string", leconDescription);
			document.addField("leconDescription_stored_string", leconDescription);
		}
		if(articleH1_enUS != null) {
			document.addField("articleH1_enUS_indexed_string", articleH1_enUS);
			document.addField("articleH1_enUS_stored_string", articleH1_enUS);
		}
		if(articleH1_frFR != null) {
			document.addField("articleH1_frFR_indexed_string", articleH1_frFR);
			document.addField("articleH1_frFR_stored_string", articleH1_frFR);
		}
		if(articleH2_enUS != null) {
			document.addField("articleH2_enUS_indexed_string", articleH2_enUS);
			document.addField("articleH2_enUS_stored_string", articleH2_enUS);
		}
		if(articleH2_frFR != null) {
			document.addField("articleH2_frFR_indexed_string", articleH2_frFR);
			document.addField("articleH2_frFR_stored_string", articleH2_frFR);
		}
		if(articleDescription != null) {
			document.addField("articleDescription_indexed_string", articleDescription);
			document.addField("articleDescription_stored_string", articleDescription);
		}
		if(articleCree != null) {
			document.addField("articleCree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(articleCree.atOffset(ZoneOffset.UTC)));
			document.addField("articleCree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(articleCree.atOffset(ZoneOffset.UTC)));
		}
		if(pageUri_enUS != null) {
			document.addField("pageUri_enUS_indexed_string", pageUri_enUS);
			document.addField("pageUri_enUS_stored_string", pageUri_enUS);
		}
		if(pageUri_frFR != null) {
			document.addField("pageUri_frFR_indexed_string", pageUri_frFR);
			document.addField("pageUri_frFR_stored_string", pageUri_frFR);
		}
		if(pageImageUri_enUS != null) {
			document.addField("pageImageUri_enUS_indexed_string", pageImageUri_enUS);
			document.addField("pageImageUri_enUS_stored_string", pageImageUri_enUS);
		}
		if(pageImageUri_frFR != null) {
			document.addField("pageImageUri_frFR_indexed_string", pageImageUri_frFR);
			document.addField("pageImageUri_frFR_stored_string", pageImageUri_frFR);
		}
		if(pageCree != null) {
			document.addField("pageCree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(pageCree.atOffset(ZoneOffset.UTC)));
			document.addField("pageCree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(pageCree.atOffset(ZoneOffset.UTC)));
		}
		if(pageH1 != null) {
			document.addField("pageH1_indexed_string", pageH1);
			document.addField("pageH1_stored_string", pageH1);
		}
		if(pageH2 != null) {
			document.addField("pageH2_indexed_string", pageH2);
			document.addField("pageH2_stored_string", pageH2);
		}
		if(pageH3 != null) {
			document.addField("pageH3_indexed_string", pageH3);
			document.addField("pageH3_stored_string", pageH3);
		}
		if(pageTitre != null) {
			document.addField("pageTitre_indexed_string", pageTitre);
			document.addField("pageTitre_stored_string", pageTitre);
		}
		if(pageRecherche_enUS != null) {
			for(String o : pageRecherche_enUS) {
				document.addField("pageRecherche_enUS_text_enUS", o);
			}
			for(java.lang.String o : pageRecherche_enUS) {
				document.addField("pageRecherche_enUS_indexed_strings", o);
			}
		}
		if(pageRecherche_frFR != null) {
			for(String o : pageRecherche_frFR) {
				document.addField("pageRecherche_frFR_text_frFR", o);
			}
			for(java.lang.String o : pageRecherche_frFR) {
				document.addField("pageRecherche_frFR_indexed_strings", o);
			}
		}
		super.indexerCluster(document);

	}

	public void desindexerArticle() {
		try {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.initLoinSiteContexteFrFR();
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinArticle(requeteSite);
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public static String varIndexeArticle(String entiteVar) {
		switch(entiteVar) {
			case "estCours":
				return "estCours_indexed_boolean";
			case "estLecon":
				return "estLecon_indexed_boolean";
			case "estArticle":
				return "estArticle_indexed_boolean";
			case "coursNumero":
				return "coursNumero_indexed_int";
			case "leconNumero":
				return "leconNumero_indexed_int";
			case "leconDescription":
				return "leconDescription_indexed_string";
			case "articleH1_enUS":
				return "articleH1_enUS_indexed_string";
			case "articleH1_frFR":
				return "articleH1_frFR_indexed_string";
			case "articleH2_enUS":
				return "articleH2_enUS_indexed_string";
			case "articleH2_frFR":
				return "articleH2_frFR_indexed_string";
			case "articleDescription":
				return "articleDescription_indexed_string";
			case "articleCree":
				return "articleCree_indexed_date";
			case "pageUri_enUS":
				return "pageUri_enUS_indexed_string";
			case "pageUri_frFR":
				return "pageUri_frFR_indexed_string";
			case "pageImageUri_enUS":
				return "pageImageUri_enUS_indexed_string";
			case "pageImageUri_frFR":
				return "pageImageUri_frFR_indexed_string";
			case "pageCree":
				return "pageCree_indexed_date";
			case "pageH1":
				return "pageH1_indexed_string";
			case "pageH2":
				return "pageH2_indexed_string";
			case "pageH3":
				return "pageH3_indexed_string";
			case "pageTitre":
				return "pageTitre_indexed_string";
			case "pageRecherche_enUS":
				return "pageRecherche_enUS_indexed_strings";
			case "pageRecherche_frFR":
				return "pageRecherche_frFR_indexed_strings";
			default:
				return Cluster.varIndexeCluster(entiteVar);
		}
	}

	public static String varRechercheArticle(String entiteVar) {
		switch(entiteVar) {
			case "pageRecherche_enUS":
				return "pageRecherche_enUS_text_enUS";
			case "pageRecherche_frFR":
				return "pageRecherche_frFR_text_frFR";
			default:
				return Cluster.varRechercheCluster(entiteVar);
		}
	}

	public static String varSuggereArticle(String entiteVar) {
		switch(entiteVar) {
			default:
				return Cluster.varSuggereCluster(entiteVar);
		}
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerArticle(solrDocument);
	}
	public void stockerArticle(SolrDocument solrDocument) {
		Article oArticle = (Article)this;

		Boolean estCours = (Boolean)solrDocument.get("estCours_stored_boolean");
		if(estCours != null)
			oArticle.setEstCours(estCours);

		Boolean estLecon = (Boolean)solrDocument.get("estLecon_stored_boolean");
		if(estLecon != null)
			oArticle.setEstLecon(estLecon);

		Boolean estArticle = (Boolean)solrDocument.get("estArticle_stored_boolean");
		if(estArticle != null)
			oArticle.setEstArticle(estArticle);

		Integer coursNumero = (Integer)solrDocument.get("coursNumero_stored_int");
		if(coursNumero != null)
			oArticle.setCoursNumero(coursNumero);

		Integer leconNumero = (Integer)solrDocument.get("leconNumero_stored_int");
		if(leconNumero != null)
			oArticle.setLeconNumero(leconNumero);

		String leconDescription = (String)solrDocument.get("leconDescription_stored_string");
		if(leconDescription != null)
			oArticle.setLeconDescription(leconDescription);

		String articleH1_enUS = (String)solrDocument.get("articleH1_enUS_stored_string");
		if(articleH1_enUS != null)
			oArticle.setArticleH1_enUS(articleH1_enUS);

		String articleH1_frFR = (String)solrDocument.get("articleH1_frFR_stored_string");
		if(articleH1_frFR != null)
			oArticle.setArticleH1_frFR(articleH1_frFR);

		String articleH2_enUS = (String)solrDocument.get("articleH2_enUS_stored_string");
		if(articleH2_enUS != null)
			oArticle.setArticleH2_enUS(articleH2_enUS);

		String articleH2_frFR = (String)solrDocument.get("articleH2_frFR_stored_string");
		if(articleH2_frFR != null)
			oArticle.setArticleH2_frFR(articleH2_frFR);

		String articleDescription = (String)solrDocument.get("articleDescription_stored_string");
		if(articleDescription != null)
			oArticle.setArticleDescription(articleDescription);

		Date articleCree = (Date)solrDocument.get("articleCree_stored_date");
		if(articleCree != null)
			oArticle.setArticleCree(articleCree);

		String pageUri_enUS = (String)solrDocument.get("pageUri_enUS_stored_string");
		if(pageUri_enUS != null)
			oArticle.setPageUri_enUS(pageUri_enUS);

		String pageUri_frFR = (String)solrDocument.get("pageUri_frFR_stored_string");
		if(pageUri_frFR != null)
			oArticle.setPageUri_frFR(pageUri_frFR);

		String pageImageUri_enUS = (String)solrDocument.get("pageImageUri_enUS_stored_string");
		if(pageImageUri_enUS != null)
			oArticle.setPageImageUri_enUS(pageImageUri_enUS);

		String pageImageUri_frFR = (String)solrDocument.get("pageImageUri_frFR_stored_string");
		if(pageImageUri_frFR != null)
			oArticle.setPageImageUri_frFR(pageImageUri_frFR);

		Date pageCree = (Date)solrDocument.get("pageCree_stored_date");
		if(pageCree != null)
			oArticle.setPageCree(pageCree);

		String pageH1 = (String)solrDocument.get("pageH1_stored_string");
		if(pageH1 != null)
			oArticle.setPageH1(pageH1);

		String pageH2 = (String)solrDocument.get("pageH2_stored_string");
		if(pageH2 != null)
			oArticle.setPageH2(pageH2);

		String pageH3 = (String)solrDocument.get("pageH3_stored_string");
		if(pageH3 != null)
			oArticle.setPageH3(pageH3);

		String pageTitre = (String)solrDocument.get("pageTitre_stored_string");
		if(pageTitre != null)
			oArticle.setPageTitre(pageTitre);

		List<String> pageRecherche_enUS = (List<String>)solrDocument.get("pageRecherche_enUS_stored_strings");
		if(pageRecherche_enUS != null)
			oArticle.pageRecherche_enUS.addAll(pageRecherche_enUS);

		List<String> pageRecherche_frFR = (List<String>)solrDocument.get("pageRecherche_frFR_stored_strings");
		if(pageRecherche_frFR != null)
			oArticle.pageRecherche_frFR.addAll(pageRecherche_frFR);

		super.stockerCluster(solrDocument);
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyArticle();
	}

	public void htmlBodyArticle() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiArticle() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof Article) {
			Article original = (Article)o;
			if(!Objects.equals(estCours, original.getEstCours()))
				requeteApi.addVars("estCours");
			if(!Objects.equals(estLecon, original.getEstLecon()))
				requeteApi.addVars("estLecon");
			if(!Objects.equals(estArticle, original.getEstArticle()))
				requeteApi.addVars("estArticle");
			if(!Objects.equals(coursNumero, original.getCoursNumero()))
				requeteApi.addVars("coursNumero");
			if(!Objects.equals(leconNumero, original.getLeconNumero()))
				requeteApi.addVars("leconNumero");
			if(!Objects.equals(leconDescription, original.getLeconDescription()))
				requeteApi.addVars("leconDescription");
			if(!Objects.equals(articleH1_enUS, original.getArticleH1_enUS()))
				requeteApi.addVars("articleH1_enUS");
			if(!Objects.equals(articleH1_frFR, original.getArticleH1_frFR()))
				requeteApi.addVars("articleH1_frFR");
			if(!Objects.equals(articleH2_enUS, original.getArticleH2_enUS()))
				requeteApi.addVars("articleH2_enUS");
			if(!Objects.equals(articleH2_frFR, original.getArticleH2_frFR()))
				requeteApi.addVars("articleH2_frFR");
			if(!Objects.equals(articleDescription, original.getArticleDescription()))
				requeteApi.addVars("articleDescription");
			if(!Objects.equals(articleCree, original.getArticleCree()))
				requeteApi.addVars("articleCree");
			if(!Objects.equals(pageUri_enUS, original.getPageUri_enUS()))
				requeteApi.addVars("pageUri_enUS");
			if(!Objects.equals(pageUri_frFR, original.getPageUri_frFR()))
				requeteApi.addVars("pageUri_frFR");
			if(!Objects.equals(pageImageUri_enUS, original.getPageImageUri_enUS()))
				requeteApi.addVars("pageImageUri_enUS");
			if(!Objects.equals(pageImageUri_frFR, original.getPageImageUri_frFR()))
				requeteApi.addVars("pageImageUri_frFR");
			if(!Objects.equals(pageCree, original.getPageCree()))
				requeteApi.addVars("pageCree");
			if(!Objects.equals(pageH1, original.getPageH1()))
				requeteApi.addVars("pageH1");
			if(!Objects.equals(pageH2, original.getPageH2()))
				requeteApi.addVars("pageH2");
			if(!Objects.equals(pageH3, original.getPageH3()))
				requeteApi.addVars("pageH3");
			if(!Objects.equals(pageTitre, original.getPageTitre()))
				requeteApi.addVars("pageTitre");
			if(!Objects.equals(pageRecherche_enUS, original.getPageRecherche_enUS()))
				requeteApi.addVars("pageRecherche_enUS");
			if(!Objects.equals(pageRecherche_frFR, original.getPageRecherche_frFR()))
				requeteApi.addVars("pageRecherche_frFR");
			super.requeteApiCluster();
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), estCours, estLecon, estArticle, coursNumero, leconNumero, leconDescription, articleH1_enUS, articleH1_frFR, articleH2_enUS, articleH2_frFR, articleDescription, articleCree, pageUri_enUS, pageUri_frFR, pageImageUri_enUS, pageImageUri_frFR, pageCree, pageH1, pageH2, pageH3, pageTitre, pageRecherche_enUS, pageRecherche_frFR);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Article))
			return false;
		Article that = (Article)o;
		return super.equals(o)
				&& Objects.equals( estCours, that.estCours )
				&& Objects.equals( estLecon, that.estLecon )
				&& Objects.equals( estArticle, that.estArticle )
				&& Objects.equals( coursNumero, that.coursNumero )
				&& Objects.equals( leconNumero, that.leconNumero )
				&& Objects.equals( leconDescription, that.leconDescription )
				&& Objects.equals( articleH1_enUS, that.articleH1_enUS )
				&& Objects.equals( articleH1_frFR, that.articleH1_frFR )
				&& Objects.equals( articleH2_enUS, that.articleH2_enUS )
				&& Objects.equals( articleH2_frFR, that.articleH2_frFR )
				&& Objects.equals( articleDescription, that.articleDescription )
				&& Objects.equals( articleCree, that.articleCree )
				&& Objects.equals( pageUri_enUS, that.pageUri_enUS )
				&& Objects.equals( pageUri_frFR, that.pageUri_frFR )
				&& Objects.equals( pageImageUri_enUS, that.pageImageUri_enUS )
				&& Objects.equals( pageImageUri_frFR, that.pageImageUri_frFR )
				&& Objects.equals( pageCree, that.pageCree )
				&& Objects.equals( pageH1, that.pageH1 )
				&& Objects.equals( pageH2, that.pageH2 )
				&& Objects.equals( pageH3, that.pageH3 )
				&& Objects.equals( pageTitre, that.pageTitre )
				&& Objects.equals( pageRecherche_enUS, that.pageRecherche_enUS )
				&& Objects.equals( pageRecherche_frFR, that.pageRecherche_frFR );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("Article { ");
		sb.append( "estCours: " ).append(estCours);
		sb.append( ", estLecon: " ).append(estLecon);
		sb.append( ", estArticle: " ).append(estArticle);
		sb.append( ", coursNumero: " ).append(coursNumero);
		sb.append( ", leconNumero: " ).append(leconNumero);
		sb.append( ", leconDescription: \"" ).append(leconDescription).append( "\"" );
		sb.append( ", articleH1_enUS: \"" ).append(articleH1_enUS).append( "\"" );
		sb.append( ", articleH1_frFR: \"" ).append(articleH1_frFR).append( "\"" );
		sb.append( ", articleH2_enUS: \"" ).append(articleH2_enUS).append( "\"" );
		sb.append( ", articleH2_frFR: \"" ).append(articleH2_frFR).append( "\"" );
		sb.append( ", articleDescription: \"" ).append(articleDescription).append( "\"" );
		sb.append( ", articleCree: " ).append(articleCree);
		sb.append( ", pageUri_enUS: \"" ).append(pageUri_enUS).append( "\"" );
		sb.append( ", pageUri_frFR: \"" ).append(pageUri_frFR).append( "\"" );
		sb.append( ", pageImageUri_enUS: \"" ).append(pageImageUri_enUS).append( "\"" );
		sb.append( ", pageImageUri_frFR: \"" ).append(pageImageUri_frFR).append( "\"" );
		sb.append( ", pageCree: " ).append(pageCree);
		sb.append( ", pageH1: \"" ).append(pageH1).append( "\"" );
		sb.append( ", pageH2: \"" ).append(pageH2).append( "\"" );
		sb.append( ", pageH3: \"" ).append(pageH3).append( "\"" );
		sb.append( ", pageTitre: \"" ).append(pageTitre).append( "\"" );
		sb.append( ", pageRecherche_enUS: " ).append(pageRecherche_enUS);
		sb.append( ", pageRecherche_frFR: " ).append(pageRecherche_frFR);
		sb.append(" }");
		return sb.toString();
	}
}
