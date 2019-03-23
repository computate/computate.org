package org.computate.site.enUS.cours;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import java.util.Date;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import java.lang.Boolean;
import org.computate.site.enUS.page.parti.PagePart;
import java.lang.String;
import java.time.ZoneOffset;
import org.apache.commons.text.StringEscapeUtils;
import java.time.Instant;
import java.time.ZoneId;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import java.time.format.DateTimeFormatter;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursGen<DEV> extends Cluster {

	public static final String Cours_Couleur = "green";
	public static final String Cours_IconeGroupe = "regular";
	public static final String Cours_IconeNom = "university";

	//////////////////
	// documentSolr //
	//////////////////

	/**	L'entité « documentSolr »
	 *	 is defined as null before being initialized. 
	 */
	protected SolrDocument documentSolr;
	public Couverture<SolrDocument> documentSolrCouverture = new Couverture<SolrDocument>().p(this).c(SolrDocument.class).var("documentSolr").o(documentSolr);

	/**	<br/>L'entité « documentSolr »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:documentSolr">Trouver l'entité documentSolr dans Solr</a>
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
	protected Cours documentSolrInit() {
		if(!documentSolrCouverture.dejaInitialise) {
			_documentSolr(documentSolrCouverture);
			if(documentSolr == null)
				setDocumentSolr(documentSolrCouverture.o);
		}
		documentSolrCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	////////////////
	// nomDomaine //
	////////////////

	/**	L'entité « nomDomaine »
	 *	 is defined as null before being initialized. 
	 */
	protected String nomDomaine;
	public Couverture<String> nomDomaineCouverture = new Couverture<String>().p(this).c(String.class).var("nomDomaine").o(nomDomaine);

	/**	<br/>L'entité « nomDomaine »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:nomDomaine">Trouver l'entité nomDomaine dans Solr</a>
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
	protected Cours nomDomaineInit() {
		if(!nomDomaineCouverture.dejaInitialise) {
			_nomDomaine(nomDomaineCouverture);
			if(nomDomaine == null)
				setNomDomaine(nomDomaineCouverture.o);
		}
		nomDomaineCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrNomDomaine() {
		return nomDomaine;
	}

	public String strNomDomaine() {
		return nomDomaine == null ? "" : nomDomaine;
	}

	public String nomAffichageNomDomaine() {
		return "Site domain name";
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

	/**	L'entité « nomSite »
	 *	 is defined as null before being initialized. 
	 */
	protected String nomSite;
	public Couverture<String> nomSiteCouverture = new Couverture<String>().p(this).c(String.class).var("nomSite").o(nomSite);

	/**	<br/>L'entité « nomSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:nomSite">Trouver l'entité nomSite dans Solr</a>
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
	protected Cours nomSiteInit() {
		if(!nomSiteCouverture.dejaInitialise) {
			_nomSite(nomSiteCouverture);
			if(nomSite == null)
				setNomSite(nomSiteCouverture.o);
		}
		nomSiteCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrNomSite() {
		return nomSite;
	}

	public String strNomSite() {
		return nomSite == null ? "" : nomSite;
	}

	public String nomAffichageNomSite() {
		return "Display name of the site";
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

	/**	L'entité « nomHoteSite »
	 *	 is defined as null before being initialized. 
	 */
	protected String nomHoteSite;
	public Couverture<String> nomHoteSiteCouverture = new Couverture<String>().p(this).c(String.class).var("nomHoteSite").o(nomHoteSite);

	/**	<br/>L'entité « nomHoteSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:nomHoteSite">Trouver l'entité nomHoteSite dans Solr</a>
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
	protected Cours nomHoteSiteInit() {
		if(!nomHoteSiteCouverture.dejaInitialise) {
			_nomHoteSite(nomHoteSiteCouverture);
			if(nomHoteSite == null)
				setNomHoteSite(nomHoteSiteCouverture.o);
		}
		nomHoteSiteCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrNomHoteSite() {
		return nomHoteSite;
	}

	public String strNomHoteSite() {
		return nomHoteSite == null ? "" : nomHoteSite;
	}

	public String nomAffichageNomHoteSite() {
		return "Site host name";
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

	/**	L'entité « nomEnsembleSite »
	 *	 is defined as null before being initialized. 
	 */
	protected String nomEnsembleSite;
	public Couverture<String> nomEnsembleSiteCouverture = new Couverture<String>().p(this).c(String.class).var("nomEnsembleSite").o(nomEnsembleSite);

	/**	<br/>L'entité « nomEnsembleSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:nomEnsembleSite">Trouver l'entité nomEnsembleSite dans Solr</a>
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
	protected Cours nomEnsembleSiteInit() {
		if(!nomEnsembleSiteCouverture.dejaInitialise) {
			_nomEnsembleSite(nomEnsembleSiteCouverture);
			if(nomEnsembleSite == null)
				setNomEnsembleSite(nomEnsembleSiteCouverture.o);
		}
		nomEnsembleSiteCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrNomEnsembleSite() {
		return nomEnsembleSite;
	}

	public String strNomEnsembleSite() {
		return nomEnsembleSite == null ? "" : nomEnsembleSite;
	}

	public String nomAffichageNomEnsembleSite() {
		return "site package name";
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

	/**	L'entité « nomHoteOrdinateur »
	 *	 is defined as null before being initialized. 
	 */
	protected String nomHoteOrdinateur;
	public Couverture<String> nomHoteOrdinateurCouverture = new Couverture<String>().p(this).c(String.class).var("nomHoteOrdinateur").o(nomHoteOrdinateur);

	/**	<br/>L'entité « nomHoteOrdinateur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:nomHoteOrdinateur">Trouver l'entité nomHoteOrdinateur dans Solr</a>
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
	protected Cours nomHoteOrdinateurInit() {
		if(!nomHoteOrdinateurCouverture.dejaInitialise) {
			_nomHoteOrdinateur(nomHoteOrdinateurCouverture);
			if(nomHoteOrdinateur == null)
				setNomHoteOrdinateur(nomHoteOrdinateurCouverture.o);
		}
		nomHoteOrdinateurCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrNomHoteOrdinateur() {
		return nomHoteOrdinateur;
	}

	public String strNomHoteOrdinateur() {
		return nomHoteOrdinateur == null ? "" : nomHoteOrdinateur;
	}

	public String nomAffichageNomHoteOrdinateur() {
		return "Computer host name";
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

	/**	L'entité « cheminServeur »
	 *	 is defined as null before being initialized. 
	 */
	protected String cheminServeur;
	public Couverture<String> cheminServeurCouverture = new Couverture<String>().p(this).c(String.class).var("cheminServeur").o(cheminServeur);

	/**	<br/>L'entité « cheminServeur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cheminServeur">Trouver l'entité cheminServeur dans Solr</a>
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
	protected Cours cheminServeurInit() {
		if(!cheminServeurCouverture.dejaInitialise) {
			_cheminServeur(cheminServeurCouverture);
			if(cheminServeur == null)
				setCheminServeur(cheminServeurCouverture.o);
		}
		cheminServeurCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrCheminServeur() {
		return cheminServeur;
	}

	public String strCheminServeur() {
		return cheminServeur == null ? "" : cheminServeur;
	}

	public String nomAffichageCheminServeur() {
		return "Server path";
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

	/**	L'entité « cheminProjet »
	 *	 is defined as null before being initialized. 
	 */
	protected String cheminProjet;
	public Couverture<String> cheminProjetCouverture = new Couverture<String>().p(this).c(String.class).var("cheminProjet").o(cheminProjet);

	/**	<br/>L'entité « cheminProjet »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cheminProjet">Trouver l'entité cheminProjet dans Solr</a>
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
	protected Cours cheminProjetInit() {
		if(!cheminProjetCouverture.dejaInitialise) {
			_cheminProjet(cheminProjetCouverture);
			if(cheminProjet == null)
				setCheminProjet(cheminProjetCouverture.o);
		}
		cheminProjetCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrCheminProjet() {
		return cheminProjet;
	}

	public String strCheminProjet() {
		return cheminProjet == null ? "" : cheminProjet;
	}

	public String nomAffichageCheminProjet() {
		return "Project path";
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

	/**	L'entité « utilisateurNom »
	 *	 is defined as null before being initialized. 
	 */
	protected String utilisateurNom;
	public Couverture<String> utilisateurNomCouverture = new Couverture<String>().p(this).c(String.class).var("utilisateurNom").o(utilisateurNom);

	/**	<br/>L'entité « utilisateurNom »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:utilisateurNom">Trouver l'entité utilisateurNom dans Solr</a>
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
	protected Cours utilisateurNomInit() {
		if(!utilisateurNomCouverture.dejaInitialise) {
			_utilisateurNom(utilisateurNomCouverture);
			if(utilisateurNom == null)
				setUtilisateurNom(utilisateurNomCouverture.o);
		}
		utilisateurNomCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrUtilisateurNom() {
		return utilisateurNom;
	}

	public String strUtilisateurNom() {
		return utilisateurNom == null ? "" : utilisateurNom;
	}

	public String nomAffichageUtilisateurNom() {
		return "User name";
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

	/**	L'entité « groupeNom »
	 *	 is defined as null before being initialized. 
	 */
	protected String groupeNom;
	public Couverture<String> groupeNomCouverture = new Couverture<String>().p(this).c(String.class).var("groupeNom").o(groupeNom);

	/**	<br/>L'entité « groupeNom »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:groupeNom">Trouver l'entité groupeNom dans Solr</a>
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
	protected Cours groupeNomInit() {
		if(!groupeNomCouverture.dejaInitialise) {
			_groupeNom(groupeNomCouverture);
			if(groupeNom == null)
				setGroupeNom(groupeNomCouverture.o);
		}
		groupeNomCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrGroupeNom() {
		return groupeNom;
	}

	public String strGroupeNom() {
		return groupeNom == null ? "" : groupeNom;
	}

	public String nomAffichageGroupeNom() {
		return "Group name";
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

	/**	L'entité « estCours »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean estCours;
	public Couverture<Boolean> estCoursCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("estCours").o(estCours);

	/**	<br/>L'entité « estCours »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:estCours">Trouver l'entité estCours dans Solr</a>
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
	public Cours setEstCours(String o) {
		this.estCours = Boolean.parseBoolean(o);
		this.estCoursCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	protected Cours estCoursInit() {
		if(!estCoursCouverture.dejaInitialise) {
			_estCours(estCoursCouverture);
			if(estCours == null)
				setEstCours(estCoursCouverture.o);
		}
		estCoursCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public Boolean solrEstCours() {
		return estCours;
	}

	public String strEstCours() {
		return estCours == null ? "" : estCours.toString();
	}

	public String nomAffichageEstCours() {
		return "is course";
	}

	public String htmTooltipEstCours() {
		return null;
	}

	public String htmEstCours() {
		return estCours == null ? "" : StringEscapeUtils.escapeHtml4(strEstCours());
	}

	/////////////////
	// coursNumero //
	/////////////////

	/**	L'entité « coursNumero »
	 *	 is defined as null before being initialized. 
	 */
	protected Integer coursNumero;
	public Couverture<Integer> coursNumeroCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("coursNumero").o(coursNumero);

	/**	<br/>L'entité « coursNumero »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:coursNumero">Trouver l'entité coursNumero dans Solr</a>
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
	public Cours setCoursNumero(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.coursNumero = Integer.parseInt(o);
		this.coursNumeroCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	protected Cours coursNumeroInit() {
		if(!coursNumeroCouverture.dejaInitialise) {
			_coursNumero(coursNumeroCouverture);
			if(coursNumero == null)
				setCoursNumero(coursNumeroCouverture.o);
		}
		coursNumeroCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public Integer solrCoursNumero() {
		return coursNumero;
	}

	public String strCoursNumero() {
		return coursNumero == null ? "" : coursNumero.toString();
	}

	public String nomAffichageCoursNumero() {
		return "course number";
	}

	public String htmTooltipCoursNumero() {
		return null;
	}

	public String htmCoursNumero() {
		return coursNumero == null ? "" : StringEscapeUtils.escapeHtml4(strCoursNumero());
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

	///////////////
	// coursCree //
	///////////////

	/**	L'entité « coursCree »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime coursCree;
	public Couverture<LocalDateTime> coursCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("coursCree").o(coursCree);

	/**	<br/>L'entité « coursCree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:coursCree">Trouver l'entité coursCree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _coursCree(Couverture<LocalDateTime> c);

	public LocalDateTime getCoursCree() {
		return coursCree;
	}

	public void setCoursCree(LocalDateTime coursCree) {
		this.coursCree = coursCree;
		this.coursCreeCouverture.dejaInitialise = true;
	}
	public Cours setCoursCree(Instant o) {
		this.coursCree = LocalDateTime.from(o);
		this.coursCreeCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cours setCoursCree(String o) {
		this.coursCree = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.coursCreeCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	public Cours setCoursCree(Date o) {
		this.coursCree = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.coursCreeCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	protected Cours coursCreeInit() {
		if(!coursCreeCouverture.dejaInitialise) {
			_coursCree(coursCreeCouverture);
			if(coursCree == null)
				setCoursCree(coursCreeCouverture.o);
		}
		coursCreeCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public Date solrCoursCree() {
		return coursCree == null ? null : Date.from(coursCree.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strCoursCree() {
		return coursCree == null ? "" : coursCree.toString();
	}

	public String nomAffichageCoursCree() {
		return null;
	}

	public String htmTooltipCoursCree() {
		return null;
	}

	public String htmCoursCree() {
		return coursCree == null ? "" : StringEscapeUtils.escapeHtml4(strCoursCree());
	}

	//////////////////////
	// coursDescription //
	//////////////////////

	/**	L'entité « coursDescription »
	 *	 is defined as null before being initialized. 
	 */
	protected String coursDescription;
	public Couverture<String> coursDescriptionCouverture = new Couverture<String>().p(this).c(String.class).var("coursDescription").o(coursDescription);

	/**	<br/>L'entité « coursDescription »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:coursDescription">Trouver l'entité coursDescription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _coursDescription(Couverture<String> c);

	public String getCoursDescription() {
		return coursDescription;
	}

	public void setCoursDescription(String coursDescription) {
		this.coursDescription = coursDescription;
		this.coursDescriptionCouverture.dejaInitialise = true;
	}
	protected Cours coursDescriptionInit() {
		if(!coursDescriptionCouverture.dejaInitialise) {
			_coursDescription(coursDescriptionCouverture);
			if(coursDescription == null)
				setCoursDescription(coursDescriptionCouverture.o);
		}
		coursDescriptionCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrCoursDescription() {
		return coursDescription;
	}

	public String strCoursDescription() {
		return coursDescription == null ? "" : coursDescription;
	}

	public String nomAffichageCoursDescription() {
		return "description";
	}

	public String htmTooltipCoursDescription() {
		return null;
	}

	public String htmCoursDescription() {
		return coursDescription == null ? "" : StringEscapeUtils.escapeHtml4(strCoursDescription());
	}

	/////////////////////////
	// coursIdentifiantUri //
	/////////////////////////

	/**	L'entité « coursIdentifiantUri »
	 *	 is defined as null before being initialized. 
	 */
	protected String coursIdentifiantUri;
	public Couverture<String> coursIdentifiantUriCouverture = new Couverture<String>().p(this).c(String.class).var("coursIdentifiantUri").o(coursIdentifiantUri);

	/**	<br/>L'entité « coursIdentifiantUri »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:coursIdentifiantUri">Trouver l'entité coursIdentifiantUri dans Solr</a>
	 * <br/>
	 * @param o est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _coursIdentifiantUri(Couverture<String> o);

	public String getCoursIdentifiantUri() {
		return coursIdentifiantUri;
	}

	public void setCoursIdentifiantUri(String coursIdentifiantUri) {
		this.coursIdentifiantUri = coursIdentifiantUri;
		this.coursIdentifiantUriCouverture.dejaInitialise = true;
	}
	protected Cours coursIdentifiantUriInit() {
		if(!coursIdentifiantUriCouverture.dejaInitialise) {
			_coursIdentifiantUri(coursIdentifiantUriCouverture);
			if(coursIdentifiantUri == null)
				setCoursIdentifiantUri(coursIdentifiantUriCouverture.o);
		}
		coursIdentifiantUriCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrCoursIdentifiantUri() {
		return coursIdentifiantUri;
	}

	public String strCoursIdentifiantUri() {
		return coursIdentifiantUri == null ? "" : coursIdentifiantUri;
	}

	public String nomAffichageCoursIdentifiantUri() {
		return null;
	}

	public String htmTooltipCoursIdentifiantUri() {
		return null;
	}

	public String htmCoursIdentifiantUri() {
		return coursIdentifiantUri == null ? "" : StringEscapeUtils.escapeHtml4(strCoursIdentifiantUri());
	}

	//////////////
	// pageCree //
	//////////////

	/**	L'entité « pageCree »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime pageCree;
	public Couverture<LocalDateTime> pageCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("pageCree").o(pageCree);

	/**	<br/>L'entité « pageCree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageCree">Trouver l'entité pageCree dans Solr</a>
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
	public Cours setPageCree(Instant o) {
		this.pageCree = LocalDateTime.from(o);
		this.pageCreeCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cours setPageCree(String o) {
		this.pageCree = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.pageCreeCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	public Cours setPageCree(Date o) {
		this.pageCree = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.pageCreeCouverture.dejaInitialise = true;
		return (Cours)this;
	}
	protected Cours pageCreeInit() {
		if(!pageCreeCouverture.dejaInitialise) {
			_pageCree(pageCreeCouverture);
			if(pageCree == null)
				setPageCree(pageCreeCouverture.o);
		}
		pageCreeCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public Date solrPageCree() {
		return pageCree == null ? null : Date.from(pageCree.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strPageCree() {
		return pageCree == null ? "" : pageCree.toString();
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

	/**	L'entité « pageH1 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH1;
	public Couverture<String> pageH1Couverture = new Couverture<String>().p(this).c(String.class).var("pageH1").o(pageH1);

	/**	<br/>L'entité « pageH1 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageH1">Trouver l'entité pageH1 dans Solr</a>
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
	protected Cours pageH1Init() {
		if(!pageH1Couverture.dejaInitialise) {
			_pageH1(pageH1Couverture);
			if(pageH1 == null)
				setPageH1(pageH1Couverture.o);
		}
		pageH1Couverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrPageH1() {
		return pageH1;
	}

	public String strPageH1() {
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

	/**	L'entité « pageH2 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH2;
	public Couverture<String> pageH2Couverture = new Couverture<String>().p(this).c(String.class).var("pageH2").o(pageH2);

	/**	<br/>L'entité « pageH2 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageH2">Trouver l'entité pageH2 dans Solr</a>
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
	protected Cours pageH2Init() {
		if(!pageH2Couverture.dejaInitialise) {
			_pageH2(pageH2Couverture);
			if(pageH2 == null)
				setPageH2(pageH2Couverture.o);
		}
		pageH2Couverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrPageH2() {
		return pageH2;
	}

	public String strPageH2() {
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

	/**	L'entité « pageH3 »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageH3;
	public Couverture<String> pageH3Couverture = new Couverture<String>().p(this).c(String.class).var("pageH3").o(pageH3);

	/**	<br/>L'entité « pageH3 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageH3">Trouver l'entité pageH3 dans Solr</a>
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
	protected Cours pageH3Init() {
		if(!pageH3Couverture.dejaInitialise) {
			_pageH3(pageH3Couverture);
			if(pageH3 == null)
				setPageH3(pageH3Couverture.o);
		}
		pageH3Couverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrPageH3() {
		return pageH3;
	}

	public String strPageH3() {
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

	/**	L'entité « pageTitre »
	 *	 is defined as null before being initialized. 
	 */
	protected String pageTitre;
	public Couverture<String> pageTitreCouverture = new Couverture<String>().p(this).c(String.class).var("pageTitre").o(pageTitre);

	/**	<br/>L'entité « pageTitre »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageTitre">Trouver l'entité pageTitre dans Solr</a>
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
	protected Cours pageTitreInit() {
		if(!pageTitreCouverture.dejaInitialise) {
			_pageTitre(pageTitreCouverture);
			if(pageTitre == null)
				setPageTitre(pageTitreCouverture.o);
		}
		pageTitreCouverture.dejaInitialise(true);
		return (Cours)this;
	}

	public String solrPageTitre() {
		return pageTitre;
	}

	public String strPageTitre() {
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

	///////////////
	// pageParts //
	///////////////

	/**	L'entité « pageParts »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<PagePart>(). 
	 */
	protected List<PagePart> pageParts = new java.util.ArrayList<org.computate.site.enUS.page.parti.PagePart>();
	public Couverture<List<PagePart>> pagePartsCouverture = new Couverture<List<PagePart>>().p(this).c(List.class).var("pageParts").o(pageParts);

	/**	<br/>L'entité « pageParts »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<PagePart>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.Cours&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageParts">Trouver l'entité pageParts dans Solr</a>
	 * <br/>
	 * @param pageParts est l'entité déjà construit. 
	 **/
	protected abstract void _pageParts(List<PagePart> l);

	public List<PagePart> getPageParts() {
		return pageParts;
	}

	public void setPageParts(List<PagePart> pageParts) {
		this.pageParts = pageParts;
		this.pagePartsCouverture.dejaInitialise = true;
	}
	public Cours addPageParts(PagePart...objets) {
		for(PagePart o : objets) {
			addPageParts(o);
		}
		return (Cours)this;
	}
	public Cours addPageParts(PagePart o) {
		if(o != null && !pageParts.contains(o))
			this.pageParts.add(o);
		return (Cours)this;
	}
	public abstract void avantPagePart(PagePart o, String entiteVar);
	protected Cours pagePartsInit() {
		if(!pagePartsCouverture.dejaInitialise) {
			_pageParts(pageParts);
		}
		pagePartsCouverture.dejaInitialise(true);
		return (Cours)this;
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
		super.initLoinCluster(requeteSite_);
		initCours();
	}

	public void initCours() {
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
		coursNumeroInit();
		coursIdentifiantMinusculeInit();
		coursIdentifiantMajusculeInit();
		coursCreeInit();
		coursDescriptionInit();
		coursIdentifiantUriInit();
		pageCreeInit();
		pageH1Init();
		pageH2Init();
		pageH3Init();
		pageTitreInit();
		pagePartsInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinCours(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCours(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteCluster(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteCours(requeteSite_);
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
			Cours o = new Cours();
			o.requeteSiteCours(requeteSite);
			o.initLoinCours(requeteSite);
			o.indexerCours();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerCours();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerCours(document);
	}

	public void indexerCours(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerCours(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerCours() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerCours(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerCours(SolrInputDocument document) throws Exception {
		if(estCours != null) {
			document.addField("estCours_indexed_boolean", estCours);
			document.addField("estCours_stored_boolean", estCours);
		}
		if(coursNumero != null) {
			document.addField("coursNumero_indexed_int", coursNumero);
			document.addField("coursNumero_stored_int", coursNumero);
		}
		if(coursCree != null) {
			document.addField("coursCree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(coursCree.atOffset(ZoneOffset.UTC)));
			document.addField("coursCree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(coursCree.atOffset(ZoneOffset.UTC)));
		}
		if(coursDescription != null) {
			document.addField("coursDescription_indexed_string", coursDescription);
			document.addField("coursDescription_stored_string", coursDescription);
		}
		if(pageCree != null) {
			document.addField("pageCree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(pageCree.atOffset(ZoneOffset.UTC)));
			document.addField("pageCree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(pageCree.atOffset(ZoneOffset.UTC)));
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
		super.indexerCluster(document);

	}

	public void desindexerCours() throws Exception {
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
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
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
	public Object obtenirCours(String var) throws Exception {
		Cours oCours = (Cours)this;
		switch(var) {
			case "documentSolr":
				return oCours.documentSolr;
			case "nomDomaine":
				return oCours.nomDomaine;
			case "nomSite":
				return oCours.nomSite;
			case "nomHoteSite":
				return oCours.nomHoteSite;
			case "nomEnsembleSite":
				return oCours.nomEnsembleSite;
			case "nomHoteOrdinateur":
				return oCours.nomHoteOrdinateur;
			case "cheminServeur":
				return oCours.cheminServeur;
			case "cheminProjet":
				return oCours.cheminProjet;
			case "utilisateurNom":
				return oCours.utilisateurNom;
			case "groupeNom":
				return oCours.groupeNom;
			case "estCours":
				return oCours.estCours;
			case "coursNumero":
				return oCours.coursNumero;
			case "coursIdentifiantMinuscule":
				return oCours.coursIdentifiantMinuscule;
			case "coursIdentifiantMajuscule":
				return oCours.coursIdentifiantMajuscule;
			case "coursCree":
				return oCours.coursCree;
			case "coursDescription":
				return oCours.coursDescription;
			case "coursIdentifiantUri":
				return oCours.coursIdentifiantUri;
			case "pageCree":
				return oCours.pageCree;
			case "pageH1":
				return oCours.pageH1;
			case "pageH2":
				return oCours.pageH2;
			case "pageH3":
				return oCours.pageH3;
			case "pageTitre":
				return oCours.pageTitre;
			case "pageParts":
				return oCours.pageParts;
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
				return super.definirCluster(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyCours();
	}

	public void htmlBodyCours() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), nomDomaine, nomSite, nomHoteSite, nomEnsembleSite, nomHoteOrdinateur, cheminServeur, cheminProjet, utilisateurNom, groupeNom, estCours, coursNumero, coursIdentifiantMinuscule, coursIdentifiantMajuscule, coursCree, coursDescription, coursIdentifiantUri, pageCree, pageH1, pageH2, pageH3, pageTitre);
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
		return super.equals(o)
				&& Objects.equals( nomDomaine, that.nomDomaine )
				&& Objects.equals( nomSite, that.nomSite )
				&& Objects.equals( nomHoteSite, that.nomHoteSite )
				&& Objects.equals( nomEnsembleSite, that.nomEnsembleSite )
				&& Objects.equals( nomHoteOrdinateur, that.nomHoteOrdinateur )
				&& Objects.equals( cheminServeur, that.cheminServeur )
				&& Objects.equals( cheminProjet, that.cheminProjet )
				&& Objects.equals( utilisateurNom, that.utilisateurNom )
				&& Objects.equals( groupeNom, that.groupeNom )
				&& Objects.equals( estCours, that.estCours )
				&& Objects.equals( coursNumero, that.coursNumero )
				&& Objects.equals( coursIdentifiantMinuscule, that.coursIdentifiantMinuscule )
				&& Objects.equals( coursIdentifiantMajuscule, that.coursIdentifiantMajuscule )
				&& Objects.equals( coursCree, that.coursCree )
				&& Objects.equals( coursDescription, that.coursDescription )
				&& Objects.equals( coursIdentifiantUri, that.coursIdentifiantUri )
				&& Objects.equals( pageCree, that.pageCree )
				&& Objects.equals( pageH1, that.pageH1 )
				&& Objects.equals( pageH2, that.pageH2 )
				&& Objects.equals( pageH3, that.pageH3 )
				&& Objects.equals( pageTitre, that.pageTitre );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("Cours {");
		sb.append( "nomDomaine: \"" ).append(nomDomaine).append( "\"" );
		sb.append( ", nomSite: \"" ).append(nomSite).append( "\"" );
		sb.append( ", nomHoteSite: \"" ).append(nomHoteSite).append( "\"" );
		sb.append( ", nomEnsembleSite: \"" ).append(nomEnsembleSite).append( "\"" );
		sb.append( ", nomHoteOrdinateur: \"" ).append(nomHoteOrdinateur).append( "\"" );
		sb.append( ", cheminServeur: \"" ).append(cheminServeur).append( "\"" );
		sb.append( ", cheminProjet: \"" ).append(cheminProjet).append( "\"" );
		sb.append( ", utilisateurNom: \"" ).append(utilisateurNom).append( "\"" );
		sb.append( ", groupeNom: \"" ).append(groupeNom).append( "\"" );
		sb.append( ", estCours: " ).append(estCours);
		sb.append( ", coursNumero: " ).append(coursNumero);
		sb.append( ", coursIdentifiantMinuscule: \"" ).append(coursIdentifiantMinuscule).append( "\"" );
		sb.append( ", coursIdentifiantMajuscule: \"" ).append(coursIdentifiantMajuscule).append( "\"" );
		sb.append( ", coursCree: " ).append(coursCree);
		sb.append( ", coursDescription: \"" ).append(coursDescription).append( "\"" );
		sb.append( ", coursIdentifiantUri: \"" ).append(coursIdentifiantUri).append( "\"" );
		sb.append( ", pageCree: " ).append(pageCree);
		sb.append( ", pageH1: \"" ).append(pageH1).append( "\"" );
		sb.append( ", pageH2: \"" ).append(pageH2).append( "\"" );
		sb.append( ", pageH3: \"" ).append(pageH3).append( "\"" );
		sb.append( ", pageTitre: \"" ).append(pageTitre).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
