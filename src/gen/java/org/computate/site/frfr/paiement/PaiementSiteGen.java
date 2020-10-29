package org.computate.site.frfr.paiement;

import java.util.Arrays;
import java.util.Date;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.math.BigDecimal;
import java.lang.Long;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import java.util.Locale;
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
import java.time.LocalDate;
import org.apache.solr.client.solrj.SolrQuery;
import java.util.Optional;
import org.apache.solr.client.solrj.util.ClientUtils;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import org.computate.site.frfr.couverture.Couverture;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
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
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class PaiementSiteGen<DEV> extends Cluster {
	protected static final Logger LOGGER = LoggerFactory.getLogger(PaiementSite.class);

	public static final List<String> ROLES = Arrays.asList("SiteAdmin");
	public static final List<String> ROLE_READS = Arrays.asList("User");

	public static final String PaiementSite_UnNom = "un paiement";
	public static final String PaiementSite_Ce = "ce ";
	public static final String PaiementSite_CeNom = "ce paiement";
	public static final String PaiementSite_Un = "un ";
	public static final String PaiementSite_LeNom = "le paiement";
	public static final String PaiementSite_NomSingulier = "paiement";
	public static final String PaiementSite_NomPluriel = "paiements";
	public static final String PaiementSite_NomActuel = "paiement actuel";
	public static final String PaiementSite_TousNom = "tous les paiements";
	public static final String PaiementSite_RechercherTousNomPar = "rechercher paiements par ";
	public static final String PaiementSite_RechercherTousNom = "rechercher paiements";
	public static final String PaiementSite_Titre = "paiements";
	public static final String PaiementSite_LesNom = "les paiements";
	public static final String PaiementSite_AucunNomTrouve = "aucun paiement trouvé";
	public static final String PaiementSite_NomVar = "paiement";
	public static final String PaiementSite_DeNom = "de paiement";
	public static final String PaiementSite_NomAdjectifSingulier = "paiement";
	public static final String PaiementSite_NomAdjectifPluriel = "paiements";
	public static final String PaiementSite_Couleur = "green";
	public static final String PaiementSite_IconeGroupe = "solid";
	public static final String PaiementSite_IconeNom = "search-dollar";
	public static final Integer PaiementSite_Lignes = 50;

	/////////////////
	// paiementCle //
	/////////////////

	/**	 L'entité paiementCle
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long paiementCle;
	@JsonIgnore
	public Couverture<Long> paiementCleCouverture = new Couverture<Long>().p(this).c(Long.class).var("paiementCle").o(paiementCle);

	/**	<br/> L'entité paiementCle
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementCle">Trouver l'entité paiementCle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementCle(Couverture<Long> c);

	public Long getPaiementCle() {
		return paiementCle;
	}

	public void setPaiementCle(Long paiementCle) {
		this.paiementCle = paiementCle;
		this.paiementCleCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementCle(String o) {
		if(NumberUtils.isParsable(o))
			this.paiementCle = Long.parseLong(o);
		this.paiementCleCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementCleInit() {
		if(!paiementCleCouverture.dejaInitialise) {
			_paiementCle(paiementCleCouverture);
			if(paiementCle == null)
				setPaiementCle(paiementCleCouverture.o);
		}
		paiementCleCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Long solrPaiementCle() {
		return paiementCle;
	}

	public String strPaiementCle() {
		return paiementCle == null ? "" : paiementCle.toString();
	}

	public String jsonPaiementCle() {
		return paiementCle == null ? "" : paiementCle.toString();
	}

	public String nomAffichagePaiementCle() {
		return "clé";
	}

	public String htmTooltipPaiementCle() {
		return null;
	}

	public String htmPaiementCle() {
		return paiementCle == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementCle());
	}

	/////////////////////
	// utilisateurCles //
	/////////////////////

	/**	 L'entité utilisateurCles
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 */
	@JsonSerialize(contentUsing = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected List<Long> utilisateurCles = new ArrayList<Long>();
	@JsonIgnore
	public Couverture<List<Long>> utilisateurClesCouverture = new Couverture<List<Long>>().p(this).c(List.class).var("utilisateurCles").o(utilisateurCles);

	/**	<br/> L'entité utilisateurCles
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<Long>(). 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:utilisateurCles">Trouver l'entité utilisateurCles dans Solr</a>
	 * <br/>
	 * @param utilisateurCles est l'entité déjà construit. 
	 **/
	protected abstract void _utilisateurCles(List<Long> l);

	public List<Long> getUtilisateurCles() {
		return utilisateurCles;
	}

	public void setUtilisateurCles(List<Long> utilisateurCles) {
		this.utilisateurCles = utilisateurCles;
		this.utilisateurClesCouverture.dejaInitialise = true;
	}
	public PaiementSite addUtilisateurCles(Long...objets) {
		for(Long o : objets) {
			addUtilisateurCles(o);
		}
		return (PaiementSite)this;
	}
	public PaiementSite addUtilisateurCles(Long o) {
		if(o != null && !utilisateurCles.contains(o))
			this.utilisateurCles.add(o);
		return (PaiementSite)this;
	}
	public PaiementSite setUtilisateurCles(JsonArray objets) {
		utilisateurCles.clear();
		for(int i = 0; i < objets.size(); i++) {
			Long o = objets.getLong(i);
			addUtilisateurCles(o);
		}
		return (PaiementSite)this;
	}
	public PaiementSite addUtilisateurCles(String o) {
		if(NumberUtils.isParsable(o)) {
			Long p = Long.parseLong(o);
			addUtilisateurCles(p);
		}
		return (PaiementSite)this;
	}
	protected PaiementSite utilisateurClesInit() {
		if(!utilisateurClesCouverture.dejaInitialise) {
			_utilisateurCles(utilisateurCles);
		}
		utilisateurClesCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public List<Long> solrUtilisateurCles() {
		return utilisateurCles;
	}

	public String strUtilisateurCles() {
		return utilisateurCles == null ? "" : utilisateurCles.toString();
	}

	public String jsonUtilisateurCles() {
		return utilisateurCles == null ? "" : utilisateurCles.toString();
	}

	public String nomAffichageUtilisateurCles() {
		return null;
	}

	public String htmTooltipUtilisateurCles() {
		return null;
	}

	public String htmUtilisateurCles() {
		return utilisateurCles == null ? "" : StringEscapeUtils.escapeHtml4(strUtilisateurCles());
	}

	/////////////////////////
	// paiementDescription //
	/////////////////////////

	/**	 L'entité paiementDescription
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String paiementDescription;
	@JsonIgnore
	public Couverture<String> paiementDescriptionCouverture = new Couverture<String>().p(this).c(String.class).var("paiementDescription").o(paiementDescription);

	/**	<br/> L'entité paiementDescription
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementDescription">Trouver l'entité paiementDescription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementDescription(Couverture<String> c);

	public String getPaiementDescription() {
		return paiementDescription;
	}

	public void setPaiementDescription(String paiementDescription) {
		this.paiementDescription = paiementDescription;
		this.paiementDescriptionCouverture.dejaInitialise = true;
	}
	protected PaiementSite paiementDescriptionInit() {
		if(!paiementDescriptionCouverture.dejaInitialise) {
			_paiementDescription(paiementDescriptionCouverture);
			if(paiementDescription == null)
				setPaiementDescription(paiementDescriptionCouverture.o);
		}
		paiementDescriptionCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrPaiementDescription() {
		return paiementDescription;
	}

	public String strPaiementDescription() {
		return paiementDescription == null ? "" : paiementDescription;
	}

	public String jsonPaiementDescription() {
		return paiementDescription == null ? "" : paiementDescription;
	}

	public String nomAffichagePaiementDescription() {
		return "description";
	}

	public String htmTooltipPaiementDescription() {
		return null;
	}

	public String htmPaiementDescription() {
		return paiementDescription == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementDescription());
	}

	public void inputPaiementDescription(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "description")
				.a("id", classeApiMethodeMethode, "_paiementDescription");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementDescription classPaiementSite inputPaiementSite", pk, "PaiementDescription w3-input w3-border ");
					a("name", "setPaiementDescription");
				} else {
					a("class", "valeurPaiementDescription w3-input w3-border classPaiementSite inputPaiementSite", pk, "PaiementDescription w3-input w3-border ");
					a("name", "paiementDescription");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementDescription', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementDescription')); }); ");
				}
				a("value", strPaiementDescription())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementDescription ").f().sx(htmPaiementDescription()).g("span");
			}
		}
	}

	public void htmPaiementDescription(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementDescription").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementDescription").a("class", "").f().sx("description").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementDescription(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementDescription')); $('#", classeApiMethodeMethode, "_paiementDescription').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setPaiementDescription', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementDescription')); }); ")
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

	//////////////////
	// paiementDate //
	//////////////////

	/**	 L'entité paiementDate
	 *	 is defined as null before being initialized. 
	 */
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonInclude(Include.NON_NULL)
	protected LocalDate paiementDate;
	@JsonIgnore
	public Couverture<LocalDate> paiementDateCouverture = new Couverture<LocalDate>().p(this).c(LocalDate.class).var("paiementDate").o(paiementDate);

	/**	<br/> L'entité paiementDate
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementDate">Trouver l'entité paiementDate dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementDate(Couverture<LocalDate> c);

	public LocalDate getPaiementDate() {
		return paiementDate;
	}

	public void setPaiementDate(LocalDate paiementDate) {
		this.paiementDate = paiementDate;
		this.paiementDateCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementDate(Instant o) {
		this.paiementDate = o == null ? null : LocalDate.from(o);
		this.paiementDateCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	/** Example: 2011-12-03+01:00 **/
	public PaiementSite setPaiementDate(String o) {
		this.paiementDate = o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE);
		this.paiementDateCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setPaiementDate(Date o) {
		this.paiementDate = o == null ? null : o.toInstant().atZone(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toLocalDate();
		this.paiementDateCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementDateInit() {
		if(!paiementDateCouverture.dejaInitialise) {
			_paiementDate(paiementDateCouverture);
			if(paiementDate == null)
				setPaiementDate(paiementDateCouverture.o);
		}
		paiementDateCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Date solrPaiementDate() {
		return paiementDate == null ? null : Date.from(paiementDate.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z")).toInstant());
	}

	public String strPaiementDate() {
		return paiementDate == null ? "" : paiementDate.format(DateTimeFormatter.ofPattern("EEE d MMM yyyy", Locale.forLanguageTag("fr-FR")));
	}

	public String jsonPaiementDate() {
		return paiementDate == null ? "" : paiementDate.format(DateTimeFormatter.ISO_DATE);
	}

	public String nomAffichagePaiementDate() {
		return "date de paiement";
	}

	public String htmTooltipPaiementDate() {
		return null;
	}

	public String htmPaiementDate() {
		return paiementDate == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementDate());
	}

	public void inputPaiementDate(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("class", "w3-input w3-border datepicker setPaiementDate classPaiementSite inputPaiementSite", pk, "PaiementDate w3-input w3-border ")
				.a("placeholder", "DD-MM-YYYY")
				.a("data-timeformat", "dd-MM-yyyy")
				.a("id", classeApiMethodeMethode, "_paiementDate")
				.a("onclick", "enleverLueur($(this)); ")
				.a("value", paiementDate == null ? "" : DateTimeFormatter.ofPattern("dd-MM-yyyy").format(paiementDate))
				.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementDate', s, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementDate')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementDate')); }); } ")
				.fg();
		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementDate ").f().sx(htmPaiementDate()).g("span");
			}
		}
	}

	public void htmPaiementDate(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementDate").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementDate").a("class", "").f().sx("date de paiement").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row  ").f();
							{ e("div").a("class", "w3-cell ").f();
								inputPaiementDate(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementDate')); $('#", classeApiMethodeMethode, "_paiementDate').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setPaiementDate', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementDate')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementDate')); }); ")
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

	///////////////////
	// paiementAnnee //
	///////////////////

	/**	 L'entité paiementAnnee
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paiementAnnee;
	@JsonIgnore
	public Couverture<Integer> paiementAnneeCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("paiementAnnee").o(paiementAnnee);

	/**	<br/> L'entité paiementAnnee
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementAnnee">Trouver l'entité paiementAnnee dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementAnnee(Couverture<Integer> c);

	public Integer getPaiementAnnee() {
		return paiementAnnee;
	}

	public void setPaiementAnnee(Integer paiementAnnee) {
		this.paiementAnnee = paiementAnnee;
		this.paiementAnneeCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementAnnee(String o) {
		if(NumberUtils.isParsable(o))
			this.paiementAnnee = Integer.parseInt(o);
		this.paiementAnneeCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementAnneeInit() {
		if(!paiementAnneeCouverture.dejaInitialise) {
			_paiementAnnee(paiementAnneeCouverture);
			if(paiementAnnee == null)
				setPaiementAnnee(paiementAnneeCouverture.o);
		}
		paiementAnneeCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Integer solrPaiementAnnee() {
		return paiementAnnee;
	}

	public String strPaiementAnnee() {
		return paiementAnnee == null ? "" : paiementAnnee.toString();
	}

	public String jsonPaiementAnnee() {
		return paiementAnnee == null ? "" : paiementAnnee.toString();
	}

	public String nomAffichagePaiementAnnee() {
		return null;
	}

	public String htmTooltipPaiementAnnee() {
		return null;
	}

	public String htmPaiementAnnee() {
		return paiementAnnee == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementAnnee());
	}

	/////////////////////
	// paiementMontant //
	/////////////////////

	/**	 L'entité paiementMontant
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal paiementMontant;
	@JsonIgnore
	public Couverture<BigDecimal> paiementMontantCouverture = new Couverture<BigDecimal>().p(this).c(BigDecimal.class).var("paiementMontant").o(paiementMontant);

	/**	<br/> L'entité paiementMontant
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementMontant">Trouver l'entité paiementMontant dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementMontant(Couverture<BigDecimal> c);

	public BigDecimal getPaiementMontant() {
		return paiementMontant;
	}

	public void setPaiementMontant(BigDecimal paiementMontant) {
		this.paiementMontant = paiementMontant;
		this.paiementMontantCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementMontant(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.paiementMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.paiementMontantCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setPaiementMontant(Double o) {
			this.paiementMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.paiementMontantCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setPaiementMontant(Integer o) {
			this.paiementMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.paiementMontantCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementMontantInit() {
		if(!paiementMontantCouverture.dejaInitialise) {
			_paiementMontant(paiementMontantCouverture);
			if(paiementMontant == null)
				setPaiementMontant(paiementMontantCouverture.o);
		}
		paiementMontantCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Double solrPaiementMontant() {
		return paiementMontant == null ? null : paiementMontant.doubleValue();
	}

	public String strPaiementMontant() {
		return paiementMontant == null ? "" : paiementMontant.setScale(2, RoundingMode.HALF_UP).toString();
	}

	public String jsonPaiementMontant() {
		return paiementMontant == null ? "" : paiementMontant.toString();
	}

	public String nomAffichagePaiementMontant() {
		return "paiement montant";
	}

	public String htmTooltipPaiementMontant() {
		return null;
	}

	public String htmPaiementMontant() {
		return paiementMontant == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementMontant());
	}

	public void inputPaiementMontant(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "paiement montant")
				.a("id", classeApiMethodeMethode, "_paiementMontant");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementMontant classPaiementSite inputPaiementSite", pk, "PaiementMontant w3-input w3-border ");
					a("name", "setPaiementMontant");
				} else {
					a("class", "valeurPaiementMontant w3-input w3-border classPaiementSite inputPaiementSite", pk, "PaiementMontant w3-input w3-border ");
					a("name", "paiementMontant");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementMontant', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementMontant')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementMontant')); }); ");
				}
				a("value", strPaiementMontant())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementMontant ").f().sx(htmPaiementMontant()).g("span");
			}
		}
	}

	public void htmPaiementMontant(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementMontant").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementMontant").a("class", "").f().sx("paiement montant").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementMontant(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementMontant')); $('#", classeApiMethodeMethode, "_paiementMontant').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setPaiementMontant', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementMontant')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementMontant')); }); ")
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
	// paiementEspeces //
	/////////////////////

	/**	 L'entité paiementEspeces
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean paiementEspeces;
	@JsonIgnore
	public Couverture<Boolean> paiementEspecesCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("paiementEspeces").o(paiementEspeces);

	/**	<br/> L'entité paiementEspeces
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementEspeces">Trouver l'entité paiementEspeces dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementEspeces(Couverture<Boolean> c);

	public Boolean getPaiementEspeces() {
		return paiementEspeces;
	}

	public void setPaiementEspeces(Boolean paiementEspeces) {
		this.paiementEspeces = paiementEspeces;
		this.paiementEspecesCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementEspeces(String o) {
		this.paiementEspeces = Boolean.parseBoolean(o);
		this.paiementEspecesCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementEspecesInit() {
		if(!paiementEspecesCouverture.dejaInitialise) {
			_paiementEspeces(paiementEspecesCouverture);
			if(paiementEspeces == null)
				setPaiementEspeces(paiementEspecesCouverture.o);
		}
		paiementEspecesCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrPaiementEspeces() {
		return paiementEspeces;
	}

	public String strPaiementEspeces() {
		return paiementEspeces == null ? "" : paiementEspeces.toString();
	}

	public String jsonPaiementEspeces() {
		return paiementEspeces == null ? "" : paiementEspeces.toString();
	}

	public String nomAffichagePaiementEspeces() {
		return "espèces";
	}

	public String htmTooltipPaiementEspeces() {
		return null;
	}

	public String htmPaiementEspeces() {
		return paiementEspeces == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementEspeces());
	}

	public void inputPaiementEspeces(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_paiementEspeces")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_paiementEspeces");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setPaiementEspeces classPaiementSite inputPaiementSite", pk, "PaiementEspeces w3-input w3-border ");
				a("name", "setPaiementEspeces");
			} else {
				a("class", "valeurPaiementEspeces classPaiementSite inputPaiementSite", pk, "PaiementEspeces w3-input w3-border ");
				a("name", "paiementEspeces");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementEspeces', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementEspeces')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementEspeces')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getPaiementEspeces() != null && getPaiementEspeces())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementEspeces ").f().sx(htmPaiementEspeces()).g("span");
			}
		}
	}

	public void htmPaiementEspeces(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementEspeces").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementEspeces").a("class", "").f().sx("espèces").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementEspeces(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	////////////////////
	// paiementCheque //
	////////////////////

	/**	 L'entité paiementCheque
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean paiementCheque;
	@JsonIgnore
	public Couverture<Boolean> paiementChequeCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("paiementCheque").o(paiementCheque);

	/**	<br/> L'entité paiementCheque
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementCheque">Trouver l'entité paiementCheque dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementCheque(Couverture<Boolean> c);

	public Boolean getPaiementCheque() {
		return paiementCheque;
	}

	public void setPaiementCheque(Boolean paiementCheque) {
		this.paiementCheque = paiementCheque;
		this.paiementChequeCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementCheque(String o) {
		this.paiementCheque = Boolean.parseBoolean(o);
		this.paiementChequeCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementChequeInit() {
		if(!paiementChequeCouverture.dejaInitialise) {
			_paiementCheque(paiementChequeCouverture);
			if(paiementCheque == null)
				setPaiementCheque(paiementChequeCouverture.o);
		}
		paiementChequeCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrPaiementCheque() {
		return paiementCheque;
	}

	public String strPaiementCheque() {
		return paiementCheque == null ? "" : paiementCheque.toString();
	}

	public String jsonPaiementCheque() {
		return paiementCheque == null ? "" : paiementCheque.toString();
	}

	public String nomAffichagePaiementCheque() {
		return "chèque";
	}

	public String htmTooltipPaiementCheque() {
		return null;
	}

	public String htmPaiementCheque() {
		return paiementCheque == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementCheque());
	}

	public void inputPaiementCheque(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_paiementCheque")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_paiementCheque");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setPaiementCheque classPaiementSite inputPaiementSite", pk, "PaiementCheque w3-input w3-border ");
				a("name", "setPaiementCheque");
			} else {
				a("class", "valeurPaiementCheque classPaiementSite inputPaiementSite", pk, "PaiementCheque w3-input w3-border ");
				a("name", "paiementCheque");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementCheque', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementCheque')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementCheque')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getPaiementCheque() != null && getPaiementCheque())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementCheque ").f().sx(htmPaiementCheque()).g("span");
			}
		}
	}

	public void htmPaiementCheque(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementCheque").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementCheque").a("class", "").f().sx("chèque").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementCheque(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	////////////////////
	// paiementECheck //
	////////////////////

	/**	 L'entité paiementECheck
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean paiementECheck;
	@JsonIgnore
	public Couverture<Boolean> paiementECheckCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("paiementECheck").o(paiementECheck);

	/**	<br/> L'entité paiementECheck
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementECheck">Trouver l'entité paiementECheck dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementECheck(Couverture<Boolean> c);

	public Boolean getPaiementECheck() {
		return paiementECheck;
	}

	public void setPaiementECheck(Boolean paiementECheck) {
		this.paiementECheck = paiementECheck;
		this.paiementECheckCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementECheck(String o) {
		this.paiementECheck = Boolean.parseBoolean(o);
		this.paiementECheckCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementECheckInit() {
		if(!paiementECheckCouverture.dejaInitialise) {
			_paiementECheck(paiementECheckCouverture);
			if(paiementECheck == null)
				setPaiementECheck(paiementECheckCouverture.o);
		}
		paiementECheckCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrPaiementECheck() {
		return paiementECheck;
	}

	public String strPaiementECheck() {
		return paiementECheck == null ? "" : paiementECheck.toString();
	}

	public String jsonPaiementECheck() {
		return paiementECheck == null ? "" : paiementECheck.toString();
	}

	public String nomAffichagePaiementECheck() {
		return "e-check";
	}

	public String htmTooltipPaiementECheck() {
		return null;
	}

	public String htmPaiementECheck() {
		return paiementECheck == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementECheck());
	}

	public void inputPaiementECheck(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_paiementECheck")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_paiementECheck");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setPaiementECheck classPaiementSite inputPaiementSite", pk, "PaiementECheck w3-input w3-border ");
				a("name", "setPaiementECheck");
			} else {
				a("class", "valeurPaiementECheck classPaiementSite inputPaiementSite", pk, "PaiementECheck w3-input w3-border ");
				a("name", "paiementECheck");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementECheck', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementECheck')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementECheck')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getPaiementECheck() != null && getPaiementECheck())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementECheck ").f().sx(htmPaiementECheck()).g("span");
			}
		}
	}

	public void htmPaiementECheck(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementECheck").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementECheck").a("class", "").f().sx("e-check").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementECheck(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	/////////////////////
	// paiementSysteme //
	/////////////////////

	/**	 L'entité paiementSysteme
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean paiementSysteme;
	@JsonIgnore
	public Couverture<Boolean> paiementSystemeCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("paiementSysteme").o(paiementSysteme);

	/**	<br/> L'entité paiementSysteme
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementSysteme">Trouver l'entité paiementSysteme dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementSysteme(Couverture<Boolean> c);

	public Boolean getPaiementSysteme() {
		return paiementSysteme;
	}

	public void setPaiementSysteme(Boolean paiementSysteme) {
		this.paiementSysteme = paiementSysteme;
		this.paiementSystemeCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementSysteme(String o) {
		this.paiementSysteme = Boolean.parseBoolean(o);
		this.paiementSystemeCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementSystemeInit() {
		if(!paiementSystemeCouverture.dejaInitialise) {
			_paiementSysteme(paiementSystemeCouverture);
			if(paiementSysteme == null)
				setPaiementSysteme(paiementSystemeCouverture.o);
		}
		paiementSystemeCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrPaiementSysteme() {
		return paiementSysteme;
	}

	public String strPaiementSysteme() {
		return paiementSysteme == null ? "" : paiementSysteme.toString();
	}

	public String jsonPaiementSysteme() {
		return paiementSysteme == null ? "" : paiementSysteme.toString();
	}

	public String nomAffichagePaiementSysteme() {
		return "authorize.net";
	}

	public String htmTooltipPaiementSysteme() {
		return null;
	}

	public String htmPaiementSysteme() {
		return paiementSysteme == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementSysteme());
	}

	public void inputPaiementSysteme(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_paiementSysteme")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_paiementSysteme");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setPaiementSysteme classPaiementSite inputPaiementSite", pk, "PaiementSysteme w3-input w3-border ");
				a("name", "setPaiementSysteme");
			} else {
				a("class", "valeurPaiementSysteme classPaiementSite inputPaiementSite", pk, "PaiementSysteme w3-input w3-border ");
				a("name", "paiementSysteme");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementSysteme', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementSysteme')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementSysteme')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getPaiementSysteme() != null && getPaiementSysteme())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementSysteme ").f().sx(htmPaiementSysteme()).g("span");
			}
		}
	}

	public void htmPaiementSysteme(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementSysteme").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementSysteme").a("class", "").f().sx("authorize.net").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementSysteme(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	//////////////////
	// paiementType //
	//////////////////

	/**	 L'entité paiementType
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String paiementType;
	@JsonIgnore
	public Couverture<String> paiementTypeCouverture = new Couverture<String>().p(this).c(String.class).var("paiementType").o(paiementType);

	/**	<br/> L'entité paiementType
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementType">Trouver l'entité paiementType dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementType(Couverture<String> c);

	public String getPaiementType() {
		return paiementType;
	}

	public void setPaiementType(String paiementType) {
		this.paiementType = paiementType;
		this.paiementTypeCouverture.dejaInitialise = true;
	}
	protected PaiementSite paiementTypeInit() {
		if(!paiementTypeCouverture.dejaInitialise) {
			_paiementType(paiementTypeCouverture);
			if(paiementType == null)
				setPaiementType(paiementTypeCouverture.o);
		}
		paiementTypeCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrPaiementType() {
		return paiementType;
	}

	public String strPaiementType() {
		return paiementType == null ? "" : paiementType;
	}

	public String jsonPaiementType() {
		return paiementType == null ? "" : paiementType;
	}

	public String nomAffichagePaiementType() {
		return null;
	}

	public String htmTooltipPaiementType() {
		return null;
	}

	public String htmPaiementType() {
		return paiementType == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementType());
	}

	/////////////////
	// paiementPar //
	/////////////////

	/**	 L'entité paiementPar
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String paiementPar;
	@JsonIgnore
	public Couverture<String> paiementParCouverture = new Couverture<String>().p(this).c(String.class).var("paiementPar").o(paiementPar);

	/**	<br/> L'entité paiementPar
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementPar">Trouver l'entité paiementPar dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementPar(Couverture<String> c);

	public String getPaiementPar() {
		return paiementPar;
	}

	public void setPaiementPar(String paiementPar) {
		this.paiementPar = paiementPar;
		this.paiementParCouverture.dejaInitialise = true;
	}
	protected PaiementSite paiementParInit() {
		if(!paiementParCouverture.dejaInitialise) {
			_paiementPar(paiementParCouverture);
			if(paiementPar == null)
				setPaiementPar(paiementParCouverture.o);
		}
		paiementParCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrPaiementPar() {
		return paiementPar;
	}

	public String strPaiementPar() {
		return paiementPar == null ? "" : paiementPar;
	}

	public String jsonPaiementPar() {
		return paiementPar == null ? "" : paiementPar;
	}

	public String nomAffichagePaiementPar() {
		return "paiement par/pour";
	}

	public String htmTooltipPaiementPar() {
		return null;
	}

	public String htmPaiementPar() {
		return paiementPar == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementPar());
	}

	public void inputPaiementPar(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "paiement par/pour")
				.a("id", classeApiMethodeMethode, "_paiementPar");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementPar classPaiementSite inputPaiementSite", pk, "PaiementPar w3-input w3-border ");
					a("name", "setPaiementPar");
				} else {
					a("class", "valeurPaiementPar w3-input w3-border classPaiementSite inputPaiementSite", pk, "PaiementPar w3-input w3-border ");
					a("name", "paiementPar");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementPar', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementPar')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementPar')); }); ");
				}
				a("value", strPaiementPar())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementPar ").f().sx(htmPaiementPar()).g("span");
			}
		}
	}

	public void htmPaiementPar(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementPar").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementPar").a("class", "").f().sx("paiement par/pour").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementPar(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementPar')); $('#", classeApiMethodeMethode, "_paiementPar').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setPaiementPar', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementPar')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementPar')); }); ")
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

	///////////////////
	// transactionId //
	///////////////////

	/**	 L'entité transactionId
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String transactionId;
	@JsonIgnore
	public Couverture<String> transactionIdCouverture = new Couverture<String>().p(this).c(String.class).var("transactionId").o(transactionId);

	/**	<br/> L'entité transactionId
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:transactionId">Trouver l'entité transactionId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _transactionId(Couverture<String> c);

	public String getTransactionId() {
		return transactionId;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
		this.transactionIdCouverture.dejaInitialise = true;
	}
	protected PaiementSite transactionIdInit() {
		if(!transactionIdCouverture.dejaInitialise) {
			_transactionId(transactionIdCouverture);
			if(transactionId == null)
				setTransactionId(transactionIdCouverture.o);
		}
		transactionIdCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrTransactionId() {
		return transactionId;
	}

	public String strTransactionId() {
		return transactionId == null ? "" : transactionId;
	}

	public String jsonTransactionId() {
		return transactionId == null ? "" : transactionId;
	}

	public String nomAffichageTransactionId() {
		return "transaction ID";
	}

	public String htmTooltipTransactionId() {
		return null;
	}

	public String htmTransactionId() {
		return transactionId == null ? "" : StringEscapeUtils.escapeHtml4(strTransactionId());
	}

	public void inputTransactionId(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "transaction ID")
				.a("id", classeApiMethodeMethode, "_transactionId");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setTransactionId classPaiementSite inputPaiementSite", pk, "TransactionId w3-input w3-border ");
					a("name", "setTransactionId");
				} else {
					a("class", "valeurTransactionId w3-input w3-border classPaiementSite inputPaiementSite", pk, "TransactionId w3-input w3-border ");
					a("name", "transactionId");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setTransactionId', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_transactionId')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_transactionId')); }); ");
				}
				a("value", strTransactionId())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "TransactionId ").f().sx(htmTransactionId()).g("span");
			}
		}
	}

	public void htmTransactionId(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteTransactionId").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_transactionId").a("class", "").f().sx("transaction ID").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputTransactionId(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_transactionId')); $('#", classeApiMethodeMethode, "_transactionId').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setTransactionId', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_transactionId')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_transactionId')); }); ")
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

	///////////////////////
	// customerProfileId //
	///////////////////////

	/**	 L'entité customerProfileId
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String customerProfileId;
	@JsonIgnore
	public Couverture<String> customerProfileIdCouverture = new Couverture<String>().p(this).c(String.class).var("customerProfileId").o(customerProfileId);

	/**	<br/> L'entité customerProfileId
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:customerProfileId">Trouver l'entité customerProfileId dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _customerProfileId(Couverture<String> c);

	public String getCustomerProfileId() {
		return customerProfileId;
	}

	public void setCustomerProfileId(String customerProfileId) {
		this.customerProfileId = customerProfileId;
		this.customerProfileIdCouverture.dejaInitialise = true;
	}
	protected PaiementSite customerProfileIdInit() {
		if(!customerProfileIdCouverture.dejaInitialise) {
			_customerProfileId(customerProfileIdCouverture);
			if(customerProfileId == null)
				setCustomerProfileId(customerProfileIdCouverture.o);
		}
		customerProfileIdCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrCustomerProfileId() {
		return customerProfileId;
	}

	public String strCustomerProfileId() {
		return customerProfileId == null ? "" : customerProfileId;
	}

	public String jsonCustomerProfileId() {
		return customerProfileId == null ? "" : customerProfileId;
	}

	public String nomAffichageCustomerProfileId() {
		return "customer profile ID";
	}

	public String htmTooltipCustomerProfileId() {
		return null;
	}

	public String htmCustomerProfileId() {
		return customerProfileId == null ? "" : StringEscapeUtils.escapeHtml4(strCustomerProfileId());
	}

	public void inputCustomerProfileId(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "customer profile ID")
				.a("id", classeApiMethodeMethode, "_customerProfileId");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setCustomerProfileId classPaiementSite inputPaiementSite", pk, "CustomerProfileId w3-input w3-border ");
					a("name", "setCustomerProfileId");
				} else {
					a("class", "valeurCustomerProfileId w3-input w3-border classPaiementSite inputPaiementSite", pk, "CustomerProfileId w3-input w3-border ");
					a("name", "customerProfileId");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setCustomerProfileId', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_customerProfileId')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_customerProfileId')); }); ");
				}
				a("value", strCustomerProfileId())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "CustomerProfileId ").f().sx(htmCustomerProfileId()).g("span");
			}
		}
	}

	public void htmCustomerProfileId(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteCustomerProfileId").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_customerProfileId").a("class", "").f().sx("customer profile ID").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputCustomerProfileId(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_customerProfileId')); $('#", classeApiMethodeMethode, "_customerProfileId').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setCustomerProfileId', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_customerProfileId')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_customerProfileId')); }); ")
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

	///////////////////////
	// transactionStatus //
	///////////////////////

	/**	 L'entité transactionStatus
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String transactionStatus;
	@JsonIgnore
	public Couverture<String> transactionStatusCouverture = new Couverture<String>().p(this).c(String.class).var("transactionStatus").o(transactionStatus);

	/**	<br/> L'entité transactionStatus
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:transactionStatus">Trouver l'entité transactionStatus dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _transactionStatus(Couverture<String> c);

	public String getTransactionStatus() {
		return transactionStatus;
	}

	public void setTransactionStatus(String transactionStatus) {
		this.transactionStatus = transactionStatus;
		this.transactionStatusCouverture.dejaInitialise = true;
	}
	protected PaiementSite transactionStatusInit() {
		if(!transactionStatusCouverture.dejaInitialise) {
			_transactionStatus(transactionStatusCouverture);
			if(transactionStatus == null)
				setTransactionStatus(transactionStatusCouverture.o);
		}
		transactionStatusCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrTransactionStatus() {
		return transactionStatus;
	}

	public String strTransactionStatus() {
		return transactionStatus == null ? "" : transactionStatus;
	}

	public String jsonTransactionStatus() {
		return transactionStatus == null ? "" : transactionStatus;
	}

	public String nomAffichageTransactionStatus() {
		return "état de transaction";
	}

	public String htmTooltipTransactionStatus() {
		return null;
	}

	public String htmTransactionStatus() {
		return transactionStatus == null ? "" : StringEscapeUtils.escapeHtml4(strTransactionStatus());
	}

	public void inputTransactionStatus(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "état de transaction")
				.a("id", classeApiMethodeMethode, "_transactionStatus");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setTransactionStatus classPaiementSite inputPaiementSite", pk, "TransactionStatus w3-input w3-border ");
					a("name", "setTransactionStatus");
				} else {
					a("class", "valeurTransactionStatus w3-input w3-border classPaiementSite inputPaiementSite", pk, "TransactionStatus w3-input w3-border ");
					a("name", "transactionStatus");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setTransactionStatus', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_transactionStatus')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_transactionStatus')); }); ");
				}
				a("value", strTransactionStatus())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "TransactionStatus ").f().sx(htmTransactionStatus()).g("span");
			}
		}
	}

	public void htmTransactionStatus(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteTransactionStatus").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_transactionStatus").a("class", "").f().sx("état de transaction").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputTransactionStatus(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_transactionStatus')); $('#", classeApiMethodeMethode, "_transactionStatus').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setTransactionStatus', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_transactionStatus')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_transactionStatus')); }); ")
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

	//////////////////
	// paiementRecu //
	//////////////////

	/**	 L'entité paiementRecu
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean paiementRecu;
	@JsonIgnore
	public Couverture<Boolean> paiementRecuCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("paiementRecu").o(paiementRecu);

	/**	<br/> L'entité paiementRecu
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementRecu">Trouver l'entité paiementRecu dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementRecu(Couverture<Boolean> c);

	public Boolean getPaiementRecu() {
		return paiementRecu;
	}

	public void setPaiementRecu(Boolean paiementRecu) {
		this.paiementRecu = paiementRecu;
		this.paiementRecuCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementRecu(String o) {
		this.paiementRecu = Boolean.parseBoolean(o);
		this.paiementRecuCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementRecuInit() {
		if(!paiementRecuCouverture.dejaInitialise) {
			_paiementRecu(paiementRecuCouverture);
			if(paiementRecu == null)
				setPaiementRecu(paiementRecuCouverture.o);
		}
		paiementRecuCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrPaiementRecu() {
		return paiementRecu;
	}

	public String strPaiementRecu() {
		return paiementRecu == null ? "" : paiementRecu.toString();
	}

	public String jsonPaiementRecu() {
		return paiementRecu == null ? "" : paiementRecu.toString();
	}

	public String nomAffichagePaiementRecu() {
		return "paiement récu";
	}

	public String htmTooltipPaiementRecu() {
		return null;
	}

	public String htmPaiementRecu() {
		return paiementRecu == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementRecu());
	}

	public void inputPaiementRecu(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_paiementRecu")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_paiementRecu");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setPaiementRecu classPaiementSite inputPaiementSite", pk, "PaiementRecu w3-input w3-border ");
				a("name", "setPaiementRecu");
			} else {
				a("class", "valeurPaiementRecu classPaiementSite inputPaiementSite", pk, "PaiementRecu w3-input w3-border ");
				a("name", "paiementRecu");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementRecu', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementRecu')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementRecu')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getPaiementRecu() != null && getPaiementRecu())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementRecu ").f().sx(htmPaiementRecu()).g("span");
			}
		}
	}

	public void htmPaiementRecu(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementRecu").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementRecu").a("class", "").f().sx("paiement récu").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementRecu(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	//////////////////
	// fraisMontant //
	//////////////////

	/**	 L'entité fraisMontant
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal fraisMontant;
	@JsonIgnore
	public Couverture<BigDecimal> fraisMontantCouverture = new Couverture<BigDecimal>().p(this).c(BigDecimal.class).var("fraisMontant").o(fraisMontant);

	/**	<br/> L'entité fraisMontant
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisMontant">Trouver l'entité fraisMontant dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisMontant(Couverture<BigDecimal> c);

	public BigDecimal getFraisMontant() {
		return fraisMontant;
	}

	public void setFraisMontant(BigDecimal fraisMontant) {
		this.fraisMontant = fraisMontant;
		this.fraisMontantCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisMontant(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.fraisMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontant(Double o) {
			this.fraisMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontant(Integer o) {
			this.fraisMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisMontantInit() {
		if(!fraisMontantCouverture.dejaInitialise) {
			_fraisMontant(fraisMontantCouverture);
			if(fraisMontant == null)
				setFraisMontant(fraisMontantCouverture.o);
		}
		fraisMontantCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Double solrFraisMontant() {
		return fraisMontant == null ? null : fraisMontant.doubleValue();
	}

	public String strFraisMontant() {
		return fraisMontant == null ? "" : fraisMontant.setScale(2, RoundingMode.HALF_UP).toString();
	}

	public String jsonFraisMontant() {
		return fraisMontant == null ? "" : fraisMontant.toString();
	}

	public String nomAffichageFraisMontant() {
		return "frais montant";
	}

	public String htmTooltipFraisMontant() {
		return null;
	}

	public String htmFraisMontant() {
		return fraisMontant == null ? "" : StringEscapeUtils.escapeHtml4(strFraisMontant());
	}

	public void inputFraisMontant(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "frais montant")
				.a("id", classeApiMethodeMethode, "_fraisMontant");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setFraisMontant classPaiementSite inputPaiementSite", pk, "FraisMontant w3-input w3-border ");
					a("name", "setFraisMontant");
				} else {
					a("class", "valeurFraisMontant w3-input w3-border classPaiementSite inputPaiementSite", pk, "FraisMontant w3-input w3-border ");
					a("name", "fraisMontant");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setFraisMontant', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_fraisMontant')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_fraisMontant')); }); ");
				}
				a("value", strFraisMontant())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "FraisMontant ").f().sx(htmFraisMontant()).g("span");
			}
		}
	}

	public void htmFraisMontant(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisMontant").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisMontant").a("class", "").f().sx("frais montant").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisMontant(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_fraisMontant')); $('#", classeApiMethodeMethode, "_fraisMontant').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setFraisMontant', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_fraisMontant')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_fraisMontant')); }); ")
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

	/////////////////////////
	// fraisPremierDernier //
	/////////////////////////

	/**	 L'entité fraisPremierDernier
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean fraisPremierDernier;
	@JsonIgnore
	public Couverture<Boolean> fraisPremierDernierCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("fraisPremierDernier").o(fraisPremierDernier);

	/**	<br/> L'entité fraisPremierDernier
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisPremierDernier">Trouver l'entité fraisPremierDernier dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisPremierDernier(Couverture<Boolean> c);

	public Boolean getFraisPremierDernier() {
		return fraisPremierDernier;
	}

	public void setFraisPremierDernier(Boolean fraisPremierDernier) {
		this.fraisPremierDernier = fraisPremierDernier;
		this.fraisPremierDernierCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisPremierDernier(String o) {
		this.fraisPremierDernier = Boolean.parseBoolean(o);
		this.fraisPremierDernierCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisPremierDernierInit() {
		if(!fraisPremierDernierCouverture.dejaInitialise) {
			_fraisPremierDernier(fraisPremierDernierCouverture);
			if(fraisPremierDernier == null)
				setFraisPremierDernier(fraisPremierDernierCouverture.o);
		}
		fraisPremierDernierCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrFraisPremierDernier() {
		return fraisPremierDernier;
	}

	public String strFraisPremierDernier() {
		return fraisPremierDernier == null ? "" : fraisPremierDernier.toString();
	}

	public String jsonFraisPremierDernier() {
		return fraisPremierDernier == null ? "" : fraisPremierDernier.toString();
	}

	public String nomAffichageFraisPremierDernier() {
		return "frais mois premier et dernier";
	}

	public String htmTooltipFraisPremierDernier() {
		return null;
	}

	public String htmFraisPremierDernier() {
		return fraisPremierDernier == null ? "" : StringEscapeUtils.escapeHtml4(strFraisPremierDernier());
	}

	public void inputFraisPremierDernier(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_fraisPremierDernier")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_fraisPremierDernier");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setFraisPremierDernier classPaiementSite inputPaiementSite", pk, "FraisPremierDernier w3-input w3-border ");
				a("name", "setFraisPremierDernier");
			} else {
				a("class", "valeurFraisPremierDernier classPaiementSite inputPaiementSite", pk, "FraisPremierDernier w3-input w3-border ");
				a("name", "fraisPremierDernier");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setFraisPremierDernier', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_fraisPremierDernier')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_fraisPremierDernier')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getFraisPremierDernier() != null && getFraisPremierDernier())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "FraisPremierDernier ").f().sx(htmFraisPremierDernier()).g("span");
			}
		}
	}

	public void htmFraisPremierDernier(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisPremierDernier").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisPremierDernier").a("class", "").f().sx("frais mois premier et dernier").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisPremierDernier(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	//////////////////////
	// fraisInscription //
	//////////////////////

	/**	 L'entité fraisInscription
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean fraisInscription;
	@JsonIgnore
	public Couverture<Boolean> fraisInscriptionCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("fraisInscription").o(fraisInscription);

	/**	<br/> L'entité fraisInscription
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisInscription">Trouver l'entité fraisInscription dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisInscription(Couverture<Boolean> c);

	public Boolean getFraisInscription() {
		return fraisInscription;
	}

	public void setFraisInscription(Boolean fraisInscription) {
		this.fraisInscription = fraisInscription;
		this.fraisInscriptionCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisInscription(String o) {
		this.fraisInscription = Boolean.parseBoolean(o);
		this.fraisInscriptionCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisInscriptionInit() {
		if(!fraisInscriptionCouverture.dejaInitialise) {
			_fraisInscription(fraisInscriptionCouverture);
			if(fraisInscription == null)
				setFraisInscription(fraisInscriptionCouverture.o);
		}
		fraisInscriptionCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrFraisInscription() {
		return fraisInscription;
	}

	public String strFraisInscription() {
		return fraisInscription == null ? "" : fraisInscription.toString();
	}

	public String jsonFraisInscription() {
		return fraisInscription == null ? "" : fraisInscription.toString();
	}

	public String nomAffichageFraisInscription() {
		return "frais d'inscription";
	}

	public String htmTooltipFraisInscription() {
		return null;
	}

	public String htmFraisInscription() {
		return fraisInscription == null ? "" : StringEscapeUtils.escapeHtml4(strFraisInscription());
	}

	public void inputFraisInscription(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_fraisInscription")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_fraisInscription");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setFraisInscription classPaiementSite inputPaiementSite", pk, "FraisInscription w3-input w3-border ");
				a("name", "setFraisInscription");
			} else {
				a("class", "valeurFraisInscription classPaiementSite inputPaiementSite", pk, "FraisInscription w3-input w3-border ");
				a("name", "fraisInscription");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setFraisInscription', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_fraisInscription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_fraisInscription')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getFraisInscription() != null && getFraisInscription())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "FraisInscription ").f().sx(htmFraisInscription()).g("span");
			}
		}
	}

	public void htmFraisInscription(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisInscription").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisInscription").a("class", "").f().sx("frais d'inscription").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisInscription(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	///////////////
	// fraisMois //
	///////////////

	/**	 L'entité fraisMois
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean fraisMois;
	@JsonIgnore
	public Couverture<Boolean> fraisMoisCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("fraisMois").o(fraisMois);

	/**	<br/> L'entité fraisMois
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisMois">Trouver l'entité fraisMois dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisMois(Couverture<Boolean> c);

	public Boolean getFraisMois() {
		return fraisMois;
	}

	public void setFraisMois(Boolean fraisMois) {
		this.fraisMois = fraisMois;
		this.fraisMoisCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisMois(String o) {
		this.fraisMois = Boolean.parseBoolean(o);
		this.fraisMoisCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisMoisInit() {
		if(!fraisMoisCouverture.dejaInitialise) {
			_fraisMois(fraisMoisCouverture);
			if(fraisMois == null)
				setFraisMois(fraisMoisCouverture.o);
		}
		fraisMoisCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrFraisMois() {
		return fraisMois;
	}

	public String strFraisMois() {
		return fraisMois == null ? "" : fraisMois.toString();
	}

	public String jsonFraisMois() {
		return fraisMois == null ? "" : fraisMois.toString();
	}

	public String nomAffichageFraisMois() {
		return "frais du mois";
	}

	public String htmTooltipFraisMois() {
		return null;
	}

	public String htmFraisMois() {
		return fraisMois == null ? "" : StringEscapeUtils.escapeHtml4(strFraisMois());
	}

	public void inputFraisMois(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_fraisMois")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_fraisMois");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setFraisMois classPaiementSite inputPaiementSite", pk, "FraisMois w3-input w3-border ");
				a("name", "setFraisMois");
			} else {
				a("class", "valeurFraisMois classPaiementSite inputPaiementSite", pk, "FraisMois w3-input w3-border ");
				a("name", "fraisMois");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setFraisMois', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_fraisMois')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_fraisMois')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getFraisMois() != null && getFraisMois())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "FraisMois ").f().sx(htmFraisMois()).g("span");
			}
		}
	}

	public void htmFraisMois(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisMois").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisMois").a("class", "").f().sx("frais du mois").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisMois(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	/////////////////
	// fraisRetard //
	/////////////////

	/**	 L'entité fraisRetard
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Boolean fraisRetard;
	@JsonIgnore
	public Couverture<Boolean> fraisRetardCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("fraisRetard").o(fraisRetard);

	/**	<br/> L'entité fraisRetard
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisRetard">Trouver l'entité fraisRetard dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisRetard(Couverture<Boolean> c);

	public Boolean getFraisRetard() {
		return fraisRetard;
	}

	public void setFraisRetard(Boolean fraisRetard) {
		this.fraisRetard = fraisRetard;
		this.fraisRetardCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisRetard(String o) {
		this.fraisRetard = Boolean.parseBoolean(o);
		this.fraisRetardCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisRetardInit() {
		if(!fraisRetardCouverture.dejaInitialise) {
			_fraisRetard(fraisRetardCouverture);
			if(fraisRetard == null)
				setFraisRetard(fraisRetardCouverture.o);
		}
		fraisRetardCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Boolean solrFraisRetard() {
		return fraisRetard;
	}

	public String strFraisRetard() {
		return fraisRetard == null ? "" : fraisRetard.toString();
	}

	public String jsonFraisRetard() {
		return fraisRetard == null ? "" : fraisRetard.toString();
	}

	public String nomAffichageFraisRetard() {
		return "frais de retard";
	}

	public String htmTooltipFraisRetard() {
		return null;
	}

	public String htmFraisRetard() {
		return fraisRetard == null ? "" : StringEscapeUtils.escapeHtml4(strFraisRetard());
	}

	public void inputFraisRetard(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			if("Page".equals(classeApiMethodeMethode)) {
				e("input")
					.a("type", "checkbox")
					.a("id", classeApiMethodeMethode, "_fraisRetard")
					.a("value", "true");
			} else {
				e("select")
					.a("id", classeApiMethodeMethode, "_fraisRetard");
			}
			if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
				a("class", "setFraisRetard classPaiementSite inputPaiementSite", pk, "FraisRetard w3-input w3-border ");
				a("name", "setFraisRetard");
			} else {
				a("class", "valeurFraisRetard classPaiementSite inputPaiementSite", pk, "FraisRetard w3-input w3-border ");
				a("name", "fraisRetard");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setFraisRetard', $(this).prop('checked'), function() { ajouterLueur($('#", classeApiMethodeMethode, "_fraisRetard')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_fraisRetard')); }); ");
			}
			if("Page".equals(classeApiMethodeMethode)) {
				if(getFraisRetard() != null && getFraisRetard())
					a("checked", "checked");
				fg();
			} else {
				f();
				e("option").a("value", "").a("selected", "selected").f().g("option");
				e("option").a("value", "true").f().sx("true").g("option");
				e("option").a("value", "false").f().sx("false").g("option");
				g("select");
			}

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "FraisRetard ").f().sx(htmFraisRetard()).g("span");
			}
		}
	}

	public void htmFraisRetard(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisRetard").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisRetard").a("class", "").f().sx("frais de retard").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisRetard(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	/////////
	// now //
	/////////

	/**	 L'entité now
	 *	 is defined as null before being initialized. 
	 */
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonInclude(Include.NON_NULL)
	protected LocalDate now;
	@JsonIgnore
	public Couverture<LocalDate> nowCouverture = new Couverture<LocalDate>().p(this).c(LocalDate.class).var("now").o(now);

	/**	<br/> L'entité now
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:now">Trouver l'entité now dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _now(Couverture<LocalDate> c);

	public LocalDate getNow() {
		return now;
	}

	public void setNow(LocalDate now) {
		this.now = now;
		this.nowCouverture.dejaInitialise = true;
	}
	public PaiementSite setNow(Instant o) {
		this.now = o == null ? null : LocalDate.from(o);
		this.nowCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	/** Example: 2011-12-03+01:00 **/
	public PaiementSite setNow(String o) {
		this.now = o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE);
		this.nowCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setNow(Date o) {
		this.now = o == null ? null : o.toInstant().atZone(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toLocalDate();
		this.nowCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite nowInit() {
		if(!nowCouverture.dejaInitialise) {
			_now(nowCouverture);
			if(now == null)
				setNow(nowCouverture.o);
		}
		nowCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Date solrNow() {
		return now == null ? null : Date.from(now.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z")).toInstant());
	}

	public String strNow() {
		return now == null ? "" : now.format(DateTimeFormatter.ofPattern("EEE d MMM yyyy", Locale.forLanguageTag("fr-FR")));
	}

	public String jsonNow() {
		return now == null ? "" : now.format(DateTimeFormatter.ISO_DATE);
	}

	public String nomAffichageNow() {
		return null;
	}

	public String htmTooltipNow() {
		return null;
	}

	public String htmNow() {
		return now == null ? "" : StringEscapeUtils.escapeHtml4(strNow());
	}

	//////////////////
	// paiementJour //
	//////////////////

	/**	 L'entité paiementJour
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Integer paiementJour;
	@JsonIgnore
	public Couverture<Integer> paiementJourCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("paiementJour").o(paiementJour);

	/**	<br/> L'entité paiementJour
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementJour">Trouver l'entité paiementJour dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementJour(Couverture<Integer> c);

	public Integer getPaiementJour() {
		return paiementJour;
	}

	public void setPaiementJour(Integer paiementJour) {
		this.paiementJour = paiementJour;
		this.paiementJourCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementJour(String o) {
		if(NumberUtils.isParsable(o))
			this.paiementJour = Integer.parseInt(o);
		this.paiementJourCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementJourInit() {
		if(!paiementJourCouverture.dejaInitialise) {
			_paiementJour(paiementJourCouverture);
			if(paiementJour == null)
				setPaiementJour(paiementJourCouverture.o);
		}
		paiementJourCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Integer solrPaiementJour() {
		return paiementJour;
	}

	public String strPaiementJour() {
		return paiementJour == null ? "" : paiementJour.toString();
	}

	public String jsonPaiementJour() {
		return paiementJour == null ? "" : paiementJour.toString();
	}

	public String nomAffichagePaiementJour() {
		return null;
	}

	public String htmTooltipPaiementJour() {
		return null;
	}

	public String htmPaiementJour() {
		return paiementJour == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementJour());
	}

	//////////////////////
	// paiementProchain //
	//////////////////////

	/**	 L'entité paiementProchain
	 *	 is defined as null before being initialized. 
	 */
	@JsonDeserialize(using = LocalDateDeserializer.class)
	@JsonSerialize(using = LocalDateSerializer.class)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@JsonInclude(Include.NON_NULL)
	protected LocalDate paiementProchain;
	@JsonIgnore
	public Couverture<LocalDate> paiementProchainCouverture = new Couverture<LocalDate>().p(this).c(LocalDate.class).var("paiementProchain").o(paiementProchain);

	/**	<br/> L'entité paiementProchain
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementProchain">Trouver l'entité paiementProchain dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementProchain(Couverture<LocalDate> c);

	public LocalDate getPaiementProchain() {
		return paiementProchain;
	}

	public void setPaiementProchain(LocalDate paiementProchain) {
		this.paiementProchain = paiementProchain;
		this.paiementProchainCouverture.dejaInitialise = true;
	}
	public PaiementSite setPaiementProchain(Instant o) {
		this.paiementProchain = o == null ? null : LocalDate.from(o);
		this.paiementProchainCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	/** Example: 2011-12-03+01:00 **/
	public PaiementSite setPaiementProchain(String o) {
		this.paiementProchain = o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE);
		this.paiementProchainCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setPaiementProchain(Date o) {
		this.paiementProchain = o == null ? null : o.toInstant().atZone(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toLocalDate();
		this.paiementProchainCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite paiementProchainInit() {
		if(!paiementProchainCouverture.dejaInitialise) {
			_paiementProchain(paiementProchainCouverture);
			if(paiementProchain == null)
				setPaiementProchain(paiementProchainCouverture.o);
		}
		paiementProchainCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Date solrPaiementProchain() {
		return paiementProchain == null ? null : Date.from(paiementProchain.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z")).toInstant());
	}

	public String strPaiementProchain() {
		return paiementProchain == null ? "" : paiementProchain.format(DateTimeFormatter.ofPattern("EEE d MMM yyyy", Locale.forLanguageTag("fr-FR")));
	}

	public String jsonPaiementProchain() {
		return paiementProchain == null ? "" : paiementProchain.format(DateTimeFormatter.ISO_DATE);
	}

	public String nomAffichagePaiementProchain() {
		return "date de paiement prochaîne";
	}

	public String htmTooltipPaiementProchain() {
		return null;
	}

	public String htmPaiementProchain() {
		return paiementProchain == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementProchain());
	}

	////////////////////
	// fraisMontantDu //
	////////////////////

	/**	 L'entité fraisMontantDu
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal fraisMontantDu;
	@JsonIgnore
	public Couverture<BigDecimal> fraisMontantDuCouverture = new Couverture<BigDecimal>().p(this).c(BigDecimal.class).var("fraisMontantDu").o(fraisMontantDu);

	/**	<br/> L'entité fraisMontantDu
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisMontantDu">Trouver l'entité fraisMontantDu dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisMontantDu(Couverture<BigDecimal> c);

	public BigDecimal getFraisMontantDu() {
		return fraisMontantDu;
	}

	public void setFraisMontantDu(BigDecimal fraisMontantDu) {
		this.fraisMontantDu = fraisMontantDu;
		this.fraisMontantDuCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisMontantDu(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.fraisMontantDu = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantDuCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantDu(Double o) {
			this.fraisMontantDu = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantDuCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantDu(Integer o) {
			this.fraisMontantDu = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantDuCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisMontantDuInit() {
		if(!fraisMontantDuCouverture.dejaInitialise) {
			_fraisMontantDu(fraisMontantDuCouverture);
			if(fraisMontantDu == null)
				setFraisMontantDu(fraisMontantDuCouverture.o);
		}
		fraisMontantDuCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Double solrFraisMontantDu() {
		return fraisMontantDu == null ? null : fraisMontantDu.doubleValue();
	}

	public String strFraisMontantDu() {
		return fraisMontantDu == null ? "" : fraisMontantDu.setScale(2, RoundingMode.HALF_UP).toString();
	}

	public String jsonFraisMontantDu() {
		return fraisMontantDu == null ? "" : fraisMontantDu.toString();
	}

	public String nomAffichageFraisMontantDu() {
		return "frais montant dû";
	}

	public String htmTooltipFraisMontantDu() {
		return null;
	}

	public String htmFraisMontantDu() {
		return fraisMontantDu == null ? "" : StringEscapeUtils.escapeHtml4(strFraisMontantDu());
	}

	public void inputFraisMontantDu(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		e("span").a("class", "varPaiementSite", pk, "FraisMontantDu ").f().sx(htmFraisMontantDu()).g("span");
	}

	public void htmFraisMontantDu(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisMontantDu").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisMontantDu").a("class", "").f().sx("frais montant dû").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisMontantDu(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	///////////////////////
	// fraisMontantPasse //
	///////////////////////

	/**	 L'entité fraisMontantPasse
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal fraisMontantPasse;
	@JsonIgnore
	public Couverture<BigDecimal> fraisMontantPasseCouverture = new Couverture<BigDecimal>().p(this).c(BigDecimal.class).var("fraisMontantPasse").o(fraisMontantPasse);

	/**	<br/> L'entité fraisMontantPasse
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisMontantPasse">Trouver l'entité fraisMontantPasse dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisMontantPasse(Couverture<BigDecimal> c);

	public BigDecimal getFraisMontantPasse() {
		return fraisMontantPasse;
	}

	public void setFraisMontantPasse(BigDecimal fraisMontantPasse) {
		this.fraisMontantPasse = fraisMontantPasse;
		this.fraisMontantPasseCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisMontantPasse(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.fraisMontantPasse = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantPasseCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantPasse(Double o) {
			this.fraisMontantPasse = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantPasseCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantPasse(Integer o) {
			this.fraisMontantPasse = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantPasseCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisMontantPasseInit() {
		if(!fraisMontantPasseCouverture.dejaInitialise) {
			_fraisMontantPasse(fraisMontantPasseCouverture);
			if(fraisMontantPasse == null)
				setFraisMontantPasse(fraisMontantPasseCouverture.o);
		}
		fraisMontantPasseCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Double solrFraisMontantPasse() {
		return fraisMontantPasse == null ? null : fraisMontantPasse.doubleValue();
	}

	public String strFraisMontantPasse() {
		return fraisMontantPasse == null ? "" : fraisMontantPasse.setScale(2, RoundingMode.HALF_UP).toString();
	}

	public String jsonFraisMontantPasse() {
		return fraisMontantPasse == null ? "" : fraisMontantPasse.toString();
	}

	public String nomAffichageFraisMontantPasse() {
		return "frais montant du passé";
	}

	public String htmTooltipFraisMontantPasse() {
		return null;
	}

	public String htmFraisMontantPasse() {
		return fraisMontantPasse == null ? "" : StringEscapeUtils.escapeHtml4(strFraisMontantPasse());
	}

	public void inputFraisMontantPasse(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		e("span").a("class", "varPaiementSite", pk, "FraisMontantPasse ").f().sx(htmFraisMontantPasse()).g("span");
	}

	public void htmFraisMontantPasse(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisMontantPasse").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisMontantPasse").a("class", "").f().sx("frais montant du passé").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisMontantPasse(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	//////////////////////////
	// fraisMontantNonPasse //
	//////////////////////////

	/**	 L'entité fraisMontantNonPasse
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal fraisMontantNonPasse;
	@JsonIgnore
	public Couverture<BigDecimal> fraisMontantNonPasseCouverture = new Couverture<BigDecimal>().p(this).c(BigDecimal.class).var("fraisMontantNonPasse").o(fraisMontantNonPasse);

	/**	<br/> L'entité fraisMontantNonPasse
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisMontantNonPasse">Trouver l'entité fraisMontantNonPasse dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisMontantNonPasse(Couverture<BigDecimal> c);

	public BigDecimal getFraisMontantNonPasse() {
		return fraisMontantNonPasse;
	}

	public void setFraisMontantNonPasse(BigDecimal fraisMontantNonPasse) {
		this.fraisMontantNonPasse = fraisMontantNonPasse;
		this.fraisMontantNonPasseCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisMontantNonPasse(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.fraisMontantNonPasse = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantNonPasseCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantNonPasse(Double o) {
			this.fraisMontantNonPasse = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantNonPasseCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantNonPasse(Integer o) {
			this.fraisMontantNonPasse = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantNonPasseCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisMontantNonPasseInit() {
		if(!fraisMontantNonPasseCouverture.dejaInitialise) {
			_fraisMontantNonPasse(fraisMontantNonPasseCouverture);
			if(fraisMontantNonPasse == null)
				setFraisMontantNonPasse(fraisMontantNonPasseCouverture.o);
		}
		fraisMontantNonPasseCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Double solrFraisMontantNonPasse() {
		return fraisMontantNonPasse == null ? null : fraisMontantNonPasse.doubleValue();
	}

	public String strFraisMontantNonPasse() {
		return fraisMontantNonPasse == null ? "" : fraisMontantNonPasse.setScale(2, RoundingMode.HALF_UP).toString();
	}

	public String jsonFraisMontantNonPasse() {
		return fraisMontantNonPasse == null ? "" : fraisMontantNonPasse.toString();
	}

	public String nomAffichageFraisMontantNonPasse() {
		return "frais montant pas du passé";
	}

	public String htmTooltipFraisMontantNonPasse() {
		return null;
	}

	public String htmFraisMontantNonPasse() {
		return fraisMontantNonPasse == null ? "" : StringEscapeUtils.escapeHtml4(strFraisMontantNonPasse());
	}

	public void inputFraisMontantNonPasse(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		e("span").a("class", "varPaiementSite", pk, "FraisMontantNonPasse ").f().sx(htmFraisMontantNonPasse()).g("span");
	}

	public void htmFraisMontantNonPasse(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisMontantNonPasse").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisMontantNonPasse").a("class", "").f().sx("frais montant pas du passé").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisMontantNonPasse(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	////////////////////////
	// fraisMontantFuture //
	////////////////////////

	/**	 L'entité fraisMontantFuture
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected BigDecimal fraisMontantFuture;
	@JsonIgnore
	public Couverture<BigDecimal> fraisMontantFutureCouverture = new Couverture<BigDecimal>().p(this).c(BigDecimal.class).var("fraisMontantFuture").o(fraisMontantFuture);

	/**	<br/> L'entité fraisMontantFuture
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:fraisMontantFuture">Trouver l'entité fraisMontantFuture dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _fraisMontantFuture(Couverture<BigDecimal> c);

	public BigDecimal getFraisMontantFuture() {
		return fraisMontantFuture;
	}

	public void setFraisMontantFuture(BigDecimal fraisMontantFuture) {
		this.fraisMontantFuture = fraisMontantFuture;
		this.fraisMontantFutureCouverture.dejaInitialise = true;
	}
	public PaiementSite setFraisMontantFuture(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.fraisMontantFuture = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantFutureCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantFuture(Double o) {
			this.fraisMontantFuture = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantFutureCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	public PaiementSite setFraisMontantFuture(Integer o) {
			this.fraisMontantFuture = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.fraisMontantFutureCouverture.dejaInitialise = true;
		return (PaiementSite)this;
	}
	protected PaiementSite fraisMontantFutureInit() {
		if(!fraisMontantFutureCouverture.dejaInitialise) {
			_fraisMontantFuture(fraisMontantFutureCouverture);
			if(fraisMontantFuture == null)
				setFraisMontantFuture(fraisMontantFutureCouverture.o);
		}
		fraisMontantFutureCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public Double solrFraisMontantFuture() {
		return fraisMontantFuture == null ? null : fraisMontantFuture.doubleValue();
	}

	public String strFraisMontantFuture() {
		return fraisMontantFuture == null ? "" : fraisMontantFuture.setScale(2, RoundingMode.HALF_UP).toString();
	}

	public String jsonFraisMontantFuture() {
		return fraisMontantFuture == null ? "" : fraisMontantFuture.toString();
	}

	public String nomAffichageFraisMontantFuture() {
		return "frais montant future";
	}

	public String htmTooltipFraisMontantFuture() {
		return null;
	}

	public String htmFraisMontantFuture() {
		return fraisMontantFuture == null ? "" : StringEscapeUtils.escapeHtml4(strFraisMontantFuture());
	}

	public void inputFraisMontantFuture(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		e("span").a("class", "varPaiementSite", pk, "FraisMontantFuture ").f().sx(htmFraisMontantFuture()).g("span");
	}

	public void htmFraisMontantFuture(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSiteFraisMontantFuture").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_fraisMontantFuture").a("class", "").f().sx("frais montant future").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputFraisMontantFuture(classeApiMethodeMethode);
							} g("div");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		} g("div");
	}

	//////////////////////
	// paiementNomCourt //
	//////////////////////

	/**	 L'entité paiementNomCourt
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String paiementNomCourt;
	@JsonIgnore
	public Couverture<String> paiementNomCourtCouverture = new Couverture<String>().p(this).c(String.class).var("paiementNomCourt").o(paiementNomCourt);

	/**	<br/> L'entité paiementNomCourt
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementNomCourt">Trouver l'entité paiementNomCourt dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementNomCourt(Couverture<String> c);

	public String getPaiementNomCourt() {
		return paiementNomCourt;
	}

	public void setPaiementNomCourt(String paiementNomCourt) {
		this.paiementNomCourt = paiementNomCourt;
		this.paiementNomCourtCouverture.dejaInitialise = true;
	}
	protected PaiementSite paiementNomCourtInit() {
		if(!paiementNomCourtCouverture.dejaInitialise) {
			_paiementNomCourt(paiementNomCourtCouverture);
			if(paiementNomCourt == null)
				setPaiementNomCourt(paiementNomCourtCouverture.o);
		}
		paiementNomCourtCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrPaiementNomCourt() {
		return paiementNomCourt;
	}

	public String strPaiementNomCourt() {
		return paiementNomCourt == null ? "" : paiementNomCourt;
	}

	public String jsonPaiementNomCourt() {
		return paiementNomCourt == null ? "" : paiementNomCourt;
	}

	public String nomAffichagePaiementNomCourt() {
		return "nom";
	}

	public String htmTooltipPaiementNomCourt() {
		return null;
	}

	public String htmPaiementNomCourt() {
		return paiementNomCourt == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementNomCourt());
	}

	public void inputPaiementNomCourt(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "nom")
				.a("id", classeApiMethodeMethode, "_paiementNomCourt");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementNomCourt classPaiementSite inputPaiementSite", pk, "PaiementNomCourt w3-input w3-border ");
					a("name", "setPaiementNomCourt");
				} else {
					a("class", "valeurPaiementNomCourt w3-input w3-border classPaiementSite inputPaiementSite", pk, "PaiementNomCourt w3-input w3-border ");
					a("name", "paiementNomCourt");
				}
				if("Page".equals(classeApiMethodeMethode)) {
					a("onclick", "enleverLueur($(this)); ");
					a("onchange", "patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:", pk, "' }], 'setPaiementNomCourt', $(this).val(), function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementNomCourt')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementNomCourt')); }); ");
				}
				a("value", strPaiementNomCourt())
			.fg();

		} else {
			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLE_READS)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLE_READS)
				) {
				e("span").a("class", "varPaiementSite", pk, "PaiementNomCourt ").f().sx(htmPaiementNomCourt()).g("span");
			}
		}
	}

	public void htmPaiementNomCourt(String classeApiMethodeMethode) {
		PaiementSite s = (PaiementSite)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "PaiementSitePaiementNomCourt").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-green ").f();
							e("label").a("for", classeApiMethodeMethode, "_paiementNomCourt").a("class", "").f().sx("nom").g("label");
						} g("div");
						{ e("div").a("class", "w3-cell-row w3-padding ").f();
							{ e("div").a("class", "w3-cell ").f();

								inputPaiementNomCourt(classeApiMethodeMethode);
							} g("div");
							if(
									CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
									|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
									) {
								if("Page".equals(classeApiMethodeMethode)) {
									{ e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
										{ e("button")
											.a("tabindex", "-1")
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementNomCourt')); $('#", classeApiMethodeMethode, "_paiementNomCourt').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#PaiementSiteForm :input[name=pk]').val() }], 'setPaiementNomCourt', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementNomCourt')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementNomCourt')); }); ")
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

	////////////////////////
	// paiementNomComplet //
	////////////////////////

	/**	 L'entité paiementNomComplet
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected String paiementNomComplet;
	@JsonIgnore
	public Couverture<String> paiementNomCompletCouverture = new Couverture<String>().p(this).c(String.class).var("paiementNomComplet").o(paiementNomComplet);

	/**	<br/> L'entité paiementNomComplet
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementSite&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementNomComplet">Trouver l'entité paiementNomComplet dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementNomComplet(Couverture<String> c);

	public String getPaiementNomComplet() {
		return paiementNomComplet;
	}

	public void setPaiementNomComplet(String paiementNomComplet) {
		this.paiementNomComplet = paiementNomComplet;
		this.paiementNomCompletCouverture.dejaInitialise = true;
	}
	protected PaiementSite paiementNomCompletInit() {
		if(!paiementNomCompletCouverture.dejaInitialise) {
			_paiementNomComplet(paiementNomCompletCouverture);
			if(paiementNomComplet == null)
				setPaiementNomComplet(paiementNomCompletCouverture.o);
		}
		paiementNomCompletCouverture.dejaInitialise(true);
		return (PaiementSite)this;
	}

	public String solrPaiementNomComplet() {
		return paiementNomComplet;
	}

	public String strPaiementNomComplet() {
		return paiementNomComplet == null ? "" : paiementNomComplet;
	}

	public String jsonPaiementNomComplet() {
		return paiementNomComplet == null ? "" : paiementNomComplet;
	}

	public String nomAffichagePaiementNomComplet() {
		return "nom";
	}

	public String htmTooltipPaiementNomComplet() {
		return null;
	}

	public String htmPaiementNomComplet() {
		return paiementNomComplet == null ? "" : StringEscapeUtils.escapeHtml4(strPaiementNomComplet());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePaiementSite = false;

	public PaiementSite initLoinPaiementSite(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePaiementSite) {
			dejaInitialisePaiementSite = true;
			initLoinPaiementSite();
		}
		return (PaiementSite)this;
	}

	public void initLoinPaiementSite() {
		initPaiementSite();
		super.initLoinCluster(requeteSite_);
	}

	public void initPaiementSite() {
		paiementCleInit();
		utilisateurClesInit();
		paiementDescriptionInit();
		paiementDateInit();
		paiementAnneeInit();
		paiementMontantInit();
		paiementEspecesInit();
		paiementChequeInit();
		paiementECheckInit();
		paiementSystemeInit();
		paiementTypeInit();
		paiementParInit();
		transactionIdInit();
		customerProfileIdInit();
		transactionStatusInit();
		paiementRecuInit();
		fraisMontantInit();
		fraisPremierDernierInit();
		fraisInscriptionInit();
		fraisMoisInit();
		fraisRetardInit();
		nowInit();
		paiementJourInit();
		paiementProchainInit();
		fraisMontantDuInit();
		fraisMontantPasseInit();
		fraisMontantNonPasseInit();
		fraisMontantFutureInit();
		paiementNomCourtInit();
		paiementNomCompletInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPaiementSite(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePaiementSite(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteCluster(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePaiementSite(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPaiementSite(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPaiementSite(String var) {
		PaiementSite oPaiementSite = (PaiementSite)this;
		switch(var) {
			case "paiementCle":
				return oPaiementSite.paiementCle;
			case "utilisateurCles":
				return oPaiementSite.utilisateurCles;
			case "paiementDescription":
				return oPaiementSite.paiementDescription;
			case "paiementDate":
				return oPaiementSite.paiementDate;
			case "paiementAnnee":
				return oPaiementSite.paiementAnnee;
			case "paiementMontant":
				return oPaiementSite.paiementMontant;
			case "paiementEspeces":
				return oPaiementSite.paiementEspeces;
			case "paiementCheque":
				return oPaiementSite.paiementCheque;
			case "paiementECheck":
				return oPaiementSite.paiementECheck;
			case "paiementSysteme":
				return oPaiementSite.paiementSysteme;
			case "paiementType":
				return oPaiementSite.paiementType;
			case "paiementPar":
				return oPaiementSite.paiementPar;
			case "transactionId":
				return oPaiementSite.transactionId;
			case "customerProfileId":
				return oPaiementSite.customerProfileId;
			case "transactionStatus":
				return oPaiementSite.transactionStatus;
			case "paiementRecu":
				return oPaiementSite.paiementRecu;
			case "fraisMontant":
				return oPaiementSite.fraisMontant;
			case "fraisPremierDernier":
				return oPaiementSite.fraisPremierDernier;
			case "fraisInscription":
				return oPaiementSite.fraisInscription;
			case "fraisMois":
				return oPaiementSite.fraisMois;
			case "fraisRetard":
				return oPaiementSite.fraisRetard;
			case "now":
				return oPaiementSite.now;
			case "paiementJour":
				return oPaiementSite.paiementJour;
			case "paiementProchain":
				return oPaiementSite.paiementProchain;
			case "fraisMontantDu":
				return oPaiementSite.fraisMontantDu;
			case "fraisMontantPasse":
				return oPaiementSite.fraisMontantPasse;
			case "fraisMontantNonPasse":
				return oPaiementSite.fraisMontantNonPasse;
			case "fraisMontantFuture":
				return oPaiementSite.fraisMontantFuture;
			case "paiementNomCourt":
				return oPaiementSite.paiementNomCourt;
			case "paiementNomComplet":
				return oPaiementSite.paiementNomComplet;
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
				o = attribuerPaiementSite(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPaiementSite(String var, Object val) {
		PaiementSite oPaiementSite = (PaiementSite)this;
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
					o = definirPaiementSite(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPaiementSite(String var, String val) {
		switch(var) {
			case "paiementDescription":
				if(val != null)
					setPaiementDescription(val);
				sauvegardes.add(var);
				return val;
			case "paiementDate":
				if(val != null)
					setPaiementDate(val);
				sauvegardes.add(var);
				return val;
			case "paiementMontant":
				if(val != null)
					setPaiementMontant(val);
				sauvegardes.add(var);
				return val;
			case "paiementEspeces":
				if(val != null)
					setPaiementEspeces(val);
				sauvegardes.add(var);
				return val;
			case "paiementCheque":
				if(val != null)
					setPaiementCheque(val);
				sauvegardes.add(var);
				return val;
			case "paiementECheck":
				if(val != null)
					setPaiementECheck(val);
				sauvegardes.add(var);
				return val;
			case "paiementSysteme":
				if(val != null)
					setPaiementSysteme(val);
				sauvegardes.add(var);
				return val;
			case "paiementPar":
				if(val != null)
					setPaiementPar(val);
				sauvegardes.add(var);
				return val;
			case "transactionId":
				if(val != null)
					setTransactionId(val);
				sauvegardes.add(var);
				return val;
			case "customerProfileId":
				if(val != null)
					setCustomerProfileId(val);
				sauvegardes.add(var);
				return val;
			case "transactionStatus":
				if(val != null)
					setTransactionStatus(val);
				sauvegardes.add(var);
				return val;
			case "paiementRecu":
				if(val != null)
					setPaiementRecu(val);
				sauvegardes.add(var);
				return val;
			case "fraisMontant":
				if(val != null)
					setFraisMontant(val);
				sauvegardes.add(var);
				return val;
			case "fraisPremierDernier":
				if(val != null)
					setFraisPremierDernier(val);
				sauvegardes.add(var);
				return val;
			case "fraisInscription":
				if(val != null)
					setFraisInscription(val);
				sauvegardes.add(var);
				return val;
			case "fraisMois":
				if(val != null)
					setFraisMois(val);
				sauvegardes.add(var);
				return val;
			case "fraisRetard":
				if(val != null)
					setFraisRetard(val);
				sauvegardes.add(var);
				return val;
			case "fraisMontantDu":
				if(val != null)
					setFraisMontantDu(val);
				sauvegardes.add(var);
				return val;
			case "fraisMontantPasse":
				if(val != null)
					setFraisMontantPasse(val);
				sauvegardes.add(var);
				return val;
			case "fraisMontantNonPasse":
				if(val != null)
					setFraisMontantNonPasse(val);
				sauvegardes.add(var);
				return val;
			case "fraisMontantFuture":
				if(val != null)
					setFraisMontantFuture(val);
				sauvegardes.add(var);
				return val;
			case "paiementNomCourt":
				if(val != null)
					setPaiementNomCourt(val);
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
		peuplerPaiementSite(solrDocument);
	}
	public void peuplerPaiementSite(SolrDocument solrDocument) {
		PaiementSite oPaiementSite = (PaiementSite)this;
		sauvegardes = (List<String>)solrDocument.get("sauvegardes_stored_strings");
		if(sauvegardes != null) {

			if(sauvegardes.contains("paiementCle")) {
				Long paiementCle = (Long)solrDocument.get("paiementCle_stored_long");
				if(paiementCle != null)
					oPaiementSite.setPaiementCle(paiementCle);
			}

			if(sauvegardes.contains("utilisateurCles")) {
				List<Long> utilisateurCles = (List<Long>)solrDocument.get("utilisateurCles_stored_longs");
				if(utilisateurCles != null)
					oPaiementSite.utilisateurCles.addAll(utilisateurCles);
			}

			if(sauvegardes.contains("paiementDescription")) {
				String paiementDescription = (String)solrDocument.get("paiementDescription_stored_string");
				if(paiementDescription != null)
					oPaiementSite.setPaiementDescription(paiementDescription);
			}

			if(sauvegardes.contains("paiementDate")) {
				Date paiementDate = (Date)solrDocument.get("paiementDate_stored_date");
				if(paiementDate != null)
					oPaiementSite.setPaiementDate(paiementDate);
			}

			if(sauvegardes.contains("paiementAnnee")) {
				Integer paiementAnnee = (Integer)solrDocument.get("paiementAnnee_stored_int");
				if(paiementAnnee != null)
					oPaiementSite.setPaiementAnnee(paiementAnnee);
			}

			if(sauvegardes.contains("paiementMontant")) {
				Double paiementMontant = (Double)solrDocument.get("paiementMontant_stored_double");
				if(paiementMontant != null)
					oPaiementSite.setPaiementMontant(paiementMontant);
			}

			if(sauvegardes.contains("paiementEspeces")) {
				Boolean paiementEspeces = (Boolean)solrDocument.get("paiementEspeces_stored_boolean");
				if(paiementEspeces != null)
					oPaiementSite.setPaiementEspeces(paiementEspeces);
			}

			if(sauvegardes.contains("paiementCheque")) {
				Boolean paiementCheque = (Boolean)solrDocument.get("paiementCheque_stored_boolean");
				if(paiementCheque != null)
					oPaiementSite.setPaiementCheque(paiementCheque);
			}

			if(sauvegardes.contains("paiementECheck")) {
				Boolean paiementECheck = (Boolean)solrDocument.get("paiementECheck_stored_boolean");
				if(paiementECheck != null)
					oPaiementSite.setPaiementECheck(paiementECheck);
			}

			if(sauvegardes.contains("paiementSysteme")) {
				Boolean paiementSysteme = (Boolean)solrDocument.get("paiementSysteme_stored_boolean");
				if(paiementSysteme != null)
					oPaiementSite.setPaiementSysteme(paiementSysteme);
			}

			if(sauvegardes.contains("paiementType")) {
				String paiementType = (String)solrDocument.get("paiementType_stored_string");
				if(paiementType != null)
					oPaiementSite.setPaiementType(paiementType);
			}

			if(sauvegardes.contains("paiementPar")) {
				String paiementPar = (String)solrDocument.get("paiementPar_stored_string");
				if(paiementPar != null)
					oPaiementSite.setPaiementPar(paiementPar);
			}

			if(sauvegardes.contains("transactionId")) {
				String transactionId = (String)solrDocument.get("transactionId_stored_string");
				if(transactionId != null)
					oPaiementSite.setTransactionId(transactionId);
			}

			if(sauvegardes.contains("customerProfileId")) {
				String customerProfileId = (String)solrDocument.get("customerProfileId_stored_string");
				if(customerProfileId != null)
					oPaiementSite.setCustomerProfileId(customerProfileId);
			}

			if(sauvegardes.contains("transactionStatus")) {
				String transactionStatus = (String)solrDocument.get("transactionStatus_stored_string");
				if(transactionStatus != null)
					oPaiementSite.setTransactionStatus(transactionStatus);
			}

			if(sauvegardes.contains("paiementRecu")) {
				Boolean paiementRecu = (Boolean)solrDocument.get("paiementRecu_stored_boolean");
				if(paiementRecu != null)
					oPaiementSite.setPaiementRecu(paiementRecu);
			}

			if(sauvegardes.contains("fraisMontant")) {
				Double fraisMontant = (Double)solrDocument.get("fraisMontant_stored_double");
				if(fraisMontant != null)
					oPaiementSite.setFraisMontant(fraisMontant);
			}

			if(sauvegardes.contains("fraisPremierDernier")) {
				Boolean fraisPremierDernier = (Boolean)solrDocument.get("fraisPremierDernier_stored_boolean");
				if(fraisPremierDernier != null)
					oPaiementSite.setFraisPremierDernier(fraisPremierDernier);
			}

			if(sauvegardes.contains("fraisInscription")) {
				Boolean fraisInscription = (Boolean)solrDocument.get("fraisInscription_stored_boolean");
				if(fraisInscription != null)
					oPaiementSite.setFraisInscription(fraisInscription);
			}

			if(sauvegardes.contains("fraisMois")) {
				Boolean fraisMois = (Boolean)solrDocument.get("fraisMois_stored_boolean");
				if(fraisMois != null)
					oPaiementSite.setFraisMois(fraisMois);
			}

			if(sauvegardes.contains("fraisRetard")) {
				Boolean fraisRetard = (Boolean)solrDocument.get("fraisRetard_stored_boolean");
				if(fraisRetard != null)
					oPaiementSite.setFraisRetard(fraisRetard);
			}

			if(sauvegardes.contains("paiementProchain")) {
				Date paiementProchain = (Date)solrDocument.get("paiementProchain_stored_date");
				if(paiementProchain != null)
					oPaiementSite.setPaiementProchain(paiementProchain);
			}

			if(sauvegardes.contains("fraisMontantDu")) {
				Double fraisMontantDu = (Double)solrDocument.get("fraisMontantDu_stored_double");
				if(fraisMontantDu != null)
					oPaiementSite.setFraisMontantDu(fraisMontantDu);
			}

			if(sauvegardes.contains("fraisMontantPasse")) {
				Double fraisMontantPasse = (Double)solrDocument.get("fraisMontantPasse_stored_double");
				if(fraisMontantPasse != null)
					oPaiementSite.setFraisMontantPasse(fraisMontantPasse);
			}

			if(sauvegardes.contains("fraisMontantNonPasse")) {
				Double fraisMontantNonPasse = (Double)solrDocument.get("fraisMontantNonPasse_stored_double");
				if(fraisMontantNonPasse != null)
					oPaiementSite.setFraisMontantNonPasse(fraisMontantNonPasse);
			}

			if(sauvegardes.contains("fraisMontantFuture")) {
				Double fraisMontantFuture = (Double)solrDocument.get("fraisMontantFuture_stored_double");
				if(fraisMontantFuture != null)
					oPaiementSite.setFraisMontantFuture(fraisMontantFuture);
			}

			if(sauvegardes.contains("paiementNomCourt")) {
				String paiementNomCourt = (String)solrDocument.get("paiementNomCourt_stored_string");
				if(paiementNomCourt != null)
					oPaiementSite.setPaiementNomCourt(paiementNomCourt);
			}

			if(sauvegardes.contains("paiementNomComplet")) {
				String paiementNomComplet = (String)solrDocument.get("paiementNomComplet_stored_string");
				if(paiementNomComplet != null)
					oPaiementSite.setPaiementNomComplet(paiementNomComplet);
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frfr.paiement.PaiementSite"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			PaiementSite o = new PaiementSite();
			o.requeteSitePaiementSite(requeteSite);
			o.initLoinPaiementSite(requeteSite);
			o.indexerPaiementSite();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerPaiementSite();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerPaiementSite(document);
	}

	public void indexerPaiementSite(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPaiementSite(document);
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPaiementSite() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerPaiementSite(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerPaiementSite(SolrInputDocument document) {
		if(paiementCle != null) {
			document.addField("paiementCle_indexed_long", paiementCle);
			document.addField("paiementCle_stored_long", paiementCle);
		}
		if(utilisateurCles != null) {
			for(java.lang.Long o : utilisateurCles) {
				document.addField("utilisateurCles_indexed_longs", o);
			}
			for(java.lang.Long o : utilisateurCles) {
				document.addField("utilisateurCles_stored_longs", o);
			}
		}
		if(paiementDescription != null) {
			document.addField("paiementDescription_indexed_string", paiementDescription);
			document.addField("paiementDescription_stored_string", paiementDescription);
		}
		if(paiementDate != null) {
			document.addField("paiementDate_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(paiementDate.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z"))));
			document.addField("paiementDate_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(paiementDate.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z"))));
		}
		if(paiementAnnee != null) {
			document.addField("paiementAnnee_indexed_int", paiementAnnee);
			document.addField("paiementAnnee_stored_int", paiementAnnee);
		}
		if(paiementMontant != null) {
			document.addField("paiementMontant_indexed_double", paiementMontant.doubleValue());
			document.addField("paiementMontant_stored_double", paiementMontant.doubleValue());
		}
		if(paiementEspeces != null) {
			document.addField("paiementEspeces_indexed_boolean", paiementEspeces);
			document.addField("paiementEspeces_stored_boolean", paiementEspeces);
		}
		if(paiementCheque != null) {
			document.addField("paiementCheque_indexed_boolean", paiementCheque);
			document.addField("paiementCheque_stored_boolean", paiementCheque);
		}
		if(paiementECheck != null) {
			document.addField("paiementECheck_indexed_boolean", paiementECheck);
			document.addField("paiementECheck_stored_boolean", paiementECheck);
		}
		if(paiementSysteme != null) {
			document.addField("paiementSysteme_indexed_boolean", paiementSysteme);
			document.addField("paiementSysteme_stored_boolean", paiementSysteme);
		}
		if(paiementType != null) {
			document.addField("paiementType_indexed_string", paiementType);
			document.addField("paiementType_stored_string", paiementType);
		}
		if(paiementPar != null) {
			document.addField("paiementPar_indexed_string", paiementPar);
			document.addField("paiementPar_stored_string", paiementPar);
		}
		if(transactionId != null) {
			document.addField("transactionId_indexed_string", transactionId);
			document.addField("transactionId_stored_string", transactionId);
		}
		if(customerProfileId != null) {
			document.addField("customerProfileId_indexed_string", customerProfileId);
			document.addField("customerProfileId_stored_string", customerProfileId);
		}
		if(transactionStatus != null) {
			document.addField("transactionStatus_indexed_string", transactionStatus);
			document.addField("transactionStatus_stored_string", transactionStatus);
		}
		if(paiementRecu != null) {
			document.addField("paiementRecu_indexed_boolean", paiementRecu);
			document.addField("paiementRecu_stored_boolean", paiementRecu);
		}
		if(fraisMontant != null) {
			document.addField("fraisMontant_indexed_double", fraisMontant.doubleValue());
			document.addField("fraisMontant_stored_double", fraisMontant.doubleValue());
		}
		if(fraisPremierDernier != null) {
			document.addField("fraisPremierDernier_indexed_boolean", fraisPremierDernier);
			document.addField("fraisPremierDernier_stored_boolean", fraisPremierDernier);
		}
		if(fraisInscription != null) {
			document.addField("fraisInscription_indexed_boolean", fraisInscription);
			document.addField("fraisInscription_stored_boolean", fraisInscription);
		}
		if(fraisMois != null) {
			document.addField("fraisMois_indexed_boolean", fraisMois);
			document.addField("fraisMois_stored_boolean", fraisMois);
		}
		if(fraisRetard != null) {
			document.addField("fraisRetard_indexed_boolean", fraisRetard);
			document.addField("fraisRetard_stored_boolean", fraisRetard);
		}
		if(paiementProchain != null) {
			document.addField("paiementProchain_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(paiementProchain.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z"))));
			document.addField("paiementProchain_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'").format(paiementProchain.atStartOfDay(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toInstant().atZone(ZoneId.of("Z"))));
		}
		if(fraisMontantDu != null) {
			document.addField("fraisMontantDu_indexed_double", fraisMontantDu.doubleValue());
			document.addField("fraisMontantDu_stored_double", fraisMontantDu.doubleValue());
		}
		if(fraisMontantPasse != null) {
			document.addField("fraisMontantPasse_indexed_double", fraisMontantPasse.doubleValue());
			document.addField("fraisMontantPasse_stored_double", fraisMontantPasse.doubleValue());
		}
		if(fraisMontantNonPasse != null) {
			document.addField("fraisMontantNonPasse_indexed_double", fraisMontantNonPasse.doubleValue());
			document.addField("fraisMontantNonPasse_stored_double", fraisMontantNonPasse.doubleValue());
		}
		if(fraisMontantFuture != null) {
			document.addField("fraisMontantFuture_indexed_double", fraisMontantFuture.doubleValue());
			document.addField("fraisMontantFuture_stored_double", fraisMontantFuture.doubleValue());
		}
		if(paiementNomCourt != null) {
			document.addField("paiementNomCourt_indexed_string", paiementNomCourt);
			document.addField("paiementNomCourt_stored_string", paiementNomCourt);
		}
		if(paiementNomComplet != null) {
			document.addField("paiementNomComplet_indexed_string", paiementNomComplet);
			document.addField("paiementNomComplet_stored_string", paiementNomComplet);
		}
		super.indexerCluster(document);

	}

	public void desindexerPaiementSite() {
		try {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.initLoinSiteContexteFrFR();
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinPaiementSite(requeteSite);
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public static String varIndexePaiementSite(String entiteVar) {
		switch(entiteVar) {
			case "paiementCle":
				return "paiementCle_indexed_long";
			case "utilisateurCles":
				return "utilisateurCles_indexed_longs";
			case "paiementDescription":
				return "paiementDescription_indexed_string";
			case "paiementDate":
				return "paiementDate_indexed_date";
			case "paiementAnnee":
				return "paiementAnnee_indexed_int";
			case "paiementMontant":
				return "paiementMontant_indexed_double";
			case "paiementEspeces":
				return "paiementEspeces_indexed_boolean";
			case "paiementCheque":
				return "paiementCheque_indexed_boolean";
			case "paiementECheck":
				return "paiementECheck_indexed_boolean";
			case "paiementSysteme":
				return "paiementSysteme_indexed_boolean";
			case "paiementType":
				return "paiementType_indexed_string";
			case "paiementPar":
				return "paiementPar_indexed_string";
			case "transactionId":
				return "transactionId_indexed_string";
			case "customerProfileId":
				return "customerProfileId_indexed_string";
			case "transactionStatus":
				return "transactionStatus_indexed_string";
			case "paiementRecu":
				return "paiementRecu_indexed_boolean";
			case "fraisMontant":
				return "fraisMontant_indexed_double";
			case "fraisPremierDernier":
				return "fraisPremierDernier_indexed_boolean";
			case "fraisInscription":
				return "fraisInscription_indexed_boolean";
			case "fraisMois":
				return "fraisMois_indexed_boolean";
			case "fraisRetard":
				return "fraisRetard_indexed_boolean";
			case "paiementProchain":
				return "paiementProchain_indexed_date";
			case "fraisMontantDu":
				return "fraisMontantDu_indexed_double";
			case "fraisMontantPasse":
				return "fraisMontantPasse_indexed_double";
			case "fraisMontantNonPasse":
				return "fraisMontantNonPasse_indexed_double";
			case "fraisMontantFuture":
				return "fraisMontantFuture_indexed_double";
			case "paiementNomCourt":
				return "paiementNomCourt_indexed_string";
			case "paiementNomComplet":
				return "paiementNomComplet_indexed_string";
			default:
				return Cluster.varIndexeCluster(entiteVar);
		}
	}

	public static String varRecherchePaiementSite(String entiteVar) {
		switch(entiteVar) {
			default:
				return Cluster.varRechercheCluster(entiteVar);
		}
	}

	public static String varSuggerePaiementSite(String entiteVar) {
		switch(entiteVar) {
			default:
				return Cluster.varSuggereCluster(entiteVar);
		}
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerPaiementSite(solrDocument);
	}
	public void stockerPaiementSite(SolrDocument solrDocument) {
		PaiementSite oPaiementSite = (PaiementSite)this;

		Long paiementCle = (Long)solrDocument.get("paiementCle_stored_long");
		if(paiementCle != null)
			oPaiementSite.setPaiementCle(paiementCle);

		List<Long> utilisateurCles = (List<Long>)solrDocument.get("utilisateurCles_stored_longs");
		if(utilisateurCles != null)
			oPaiementSite.utilisateurCles.addAll(utilisateurCles);

		String paiementDescription = (String)solrDocument.get("paiementDescription_stored_string");
		if(paiementDescription != null)
			oPaiementSite.setPaiementDescription(paiementDescription);

		Date paiementDate = (Date)solrDocument.get("paiementDate_stored_date");
		if(paiementDate != null)
			oPaiementSite.setPaiementDate(paiementDate);

		Integer paiementAnnee = (Integer)solrDocument.get("paiementAnnee_stored_int");
		if(paiementAnnee != null)
			oPaiementSite.setPaiementAnnee(paiementAnnee);

		Double paiementMontant = (Double)solrDocument.get("paiementMontant_stored_double");
		if(paiementMontant != null)
			oPaiementSite.setPaiementMontant(paiementMontant);

		Boolean paiementEspeces = (Boolean)solrDocument.get("paiementEspeces_stored_boolean");
		if(paiementEspeces != null)
			oPaiementSite.setPaiementEspeces(paiementEspeces);

		Boolean paiementCheque = (Boolean)solrDocument.get("paiementCheque_stored_boolean");
		if(paiementCheque != null)
			oPaiementSite.setPaiementCheque(paiementCheque);

		Boolean paiementECheck = (Boolean)solrDocument.get("paiementECheck_stored_boolean");
		if(paiementECheck != null)
			oPaiementSite.setPaiementECheck(paiementECheck);

		Boolean paiementSysteme = (Boolean)solrDocument.get("paiementSysteme_stored_boolean");
		if(paiementSysteme != null)
			oPaiementSite.setPaiementSysteme(paiementSysteme);

		String paiementType = (String)solrDocument.get("paiementType_stored_string");
		if(paiementType != null)
			oPaiementSite.setPaiementType(paiementType);

		String paiementPar = (String)solrDocument.get("paiementPar_stored_string");
		if(paiementPar != null)
			oPaiementSite.setPaiementPar(paiementPar);

		String transactionId = (String)solrDocument.get("transactionId_stored_string");
		if(transactionId != null)
			oPaiementSite.setTransactionId(transactionId);

		String customerProfileId = (String)solrDocument.get("customerProfileId_stored_string");
		if(customerProfileId != null)
			oPaiementSite.setCustomerProfileId(customerProfileId);

		String transactionStatus = (String)solrDocument.get("transactionStatus_stored_string");
		if(transactionStatus != null)
			oPaiementSite.setTransactionStatus(transactionStatus);

		Boolean paiementRecu = (Boolean)solrDocument.get("paiementRecu_stored_boolean");
		if(paiementRecu != null)
			oPaiementSite.setPaiementRecu(paiementRecu);

		Double fraisMontant = (Double)solrDocument.get("fraisMontant_stored_double");
		if(fraisMontant != null)
			oPaiementSite.setFraisMontant(fraisMontant);

		Boolean fraisPremierDernier = (Boolean)solrDocument.get("fraisPremierDernier_stored_boolean");
		if(fraisPremierDernier != null)
			oPaiementSite.setFraisPremierDernier(fraisPremierDernier);

		Boolean fraisInscription = (Boolean)solrDocument.get("fraisInscription_stored_boolean");
		if(fraisInscription != null)
			oPaiementSite.setFraisInscription(fraisInscription);

		Boolean fraisMois = (Boolean)solrDocument.get("fraisMois_stored_boolean");
		if(fraisMois != null)
			oPaiementSite.setFraisMois(fraisMois);

		Boolean fraisRetard = (Boolean)solrDocument.get("fraisRetard_stored_boolean");
		if(fraisRetard != null)
			oPaiementSite.setFraisRetard(fraisRetard);

		Date paiementProchain = (Date)solrDocument.get("paiementProchain_stored_date");
		if(paiementProchain != null)
			oPaiementSite.setPaiementProchain(paiementProchain);

		Double fraisMontantDu = (Double)solrDocument.get("fraisMontantDu_stored_double");
		if(fraisMontantDu != null)
			oPaiementSite.setFraisMontantDu(fraisMontantDu);

		Double fraisMontantPasse = (Double)solrDocument.get("fraisMontantPasse_stored_double");
		if(fraisMontantPasse != null)
			oPaiementSite.setFraisMontantPasse(fraisMontantPasse);

		Double fraisMontantNonPasse = (Double)solrDocument.get("fraisMontantNonPasse_stored_double");
		if(fraisMontantNonPasse != null)
			oPaiementSite.setFraisMontantNonPasse(fraisMontantNonPasse);

		Double fraisMontantFuture = (Double)solrDocument.get("fraisMontantFuture_stored_double");
		if(fraisMontantFuture != null)
			oPaiementSite.setFraisMontantFuture(fraisMontantFuture);

		String paiementNomCourt = (String)solrDocument.get("paiementNomCourt_stored_string");
		if(paiementNomCourt != null)
			oPaiementSite.setPaiementNomCourt(paiementNomCourt);

		String paiementNomComplet = (String)solrDocument.get("paiementNomComplet_stored_string");
		if(paiementNomComplet != null)
			oPaiementSite.setPaiementNomComplet(paiementNomComplet);

		super.stockerCluster(solrDocument);
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiPaiementSite() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof PaiementSite) {
			PaiementSite original = (PaiementSite)o;
			if(!Objects.equals(paiementCle, original.getPaiementCle()))
				requeteApi.addVars("paiementCle");
			if(!Objects.equals(utilisateurCles, original.getUtilisateurCles()))
				requeteApi.addVars("utilisateurCles");
			if(!Objects.equals(paiementDescription, original.getPaiementDescription()))
				requeteApi.addVars("paiementDescription");
			if(!Objects.equals(paiementDate, original.getPaiementDate()))
				requeteApi.addVars("paiementDate");
			if(!Objects.equals(paiementAnnee, original.getPaiementAnnee()))
				requeteApi.addVars("paiementAnnee");
			if(!Objects.equals(paiementMontant, original.getPaiementMontant()))
				requeteApi.addVars("paiementMontant");
			if(!Objects.equals(paiementEspeces, original.getPaiementEspeces()))
				requeteApi.addVars("paiementEspeces");
			if(!Objects.equals(paiementCheque, original.getPaiementCheque()))
				requeteApi.addVars("paiementCheque");
			if(!Objects.equals(paiementECheck, original.getPaiementECheck()))
				requeteApi.addVars("paiementECheck");
			if(!Objects.equals(paiementSysteme, original.getPaiementSysteme()))
				requeteApi.addVars("paiementSysteme");
			if(!Objects.equals(paiementType, original.getPaiementType()))
				requeteApi.addVars("paiementType");
			if(!Objects.equals(paiementPar, original.getPaiementPar()))
				requeteApi.addVars("paiementPar");
			if(!Objects.equals(transactionId, original.getTransactionId()))
				requeteApi.addVars("transactionId");
			if(!Objects.equals(customerProfileId, original.getCustomerProfileId()))
				requeteApi.addVars("customerProfileId");
			if(!Objects.equals(transactionStatus, original.getTransactionStatus()))
				requeteApi.addVars("transactionStatus");
			if(!Objects.equals(paiementRecu, original.getPaiementRecu()))
				requeteApi.addVars("paiementRecu");
			if(!Objects.equals(fraisMontant, original.getFraisMontant()))
				requeteApi.addVars("fraisMontant");
			if(!Objects.equals(fraisPremierDernier, original.getFraisPremierDernier()))
				requeteApi.addVars("fraisPremierDernier");
			if(!Objects.equals(fraisInscription, original.getFraisInscription()))
				requeteApi.addVars("fraisInscription");
			if(!Objects.equals(fraisMois, original.getFraisMois()))
				requeteApi.addVars("fraisMois");
			if(!Objects.equals(fraisRetard, original.getFraisRetard()))
				requeteApi.addVars("fraisRetard");
			if(!Objects.equals(paiementProchain, original.getPaiementProchain()))
				requeteApi.addVars("paiementProchain");
			if(!Objects.equals(fraisMontantDu, original.getFraisMontantDu()))
				requeteApi.addVars("fraisMontantDu");
			if(!Objects.equals(fraisMontantPasse, original.getFraisMontantPasse()))
				requeteApi.addVars("fraisMontantPasse");
			if(!Objects.equals(fraisMontantNonPasse, original.getFraisMontantNonPasse()))
				requeteApi.addVars("fraisMontantNonPasse");
			if(!Objects.equals(fraisMontantFuture, original.getFraisMontantFuture()))
				requeteApi.addVars("fraisMontantFuture");
			if(!Objects.equals(paiementNomCourt, original.getPaiementNomCourt()))
				requeteApi.addVars("paiementNomCourt");
			if(!Objects.equals(paiementNomComplet, original.getPaiementNomComplet()))
				requeteApi.addVars("paiementNomComplet");
			super.requeteApiCluster();
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), paiementCle, utilisateurCles, paiementDescription, paiementDate, paiementAnnee, paiementMontant, paiementEspeces, paiementCheque, paiementECheck, paiementSysteme, paiementType, paiementPar, transactionId, customerProfileId, transactionStatus, paiementRecu, fraisMontant, fraisPremierDernier, fraisInscription, fraisMois, fraisRetard, paiementProchain, fraisMontantDu, fraisMontantPasse, fraisMontantNonPasse, fraisMontantFuture, paiementNomCourt, paiementNomComplet);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof PaiementSite))
			return false;
		PaiementSite that = (PaiementSite)o;
		return super.equals(o)
				&& Objects.equals( paiementCle, that.paiementCle )
				&& Objects.equals( utilisateurCles, that.utilisateurCles )
				&& Objects.equals( paiementDescription, that.paiementDescription )
				&& Objects.equals( paiementDate, that.paiementDate )
				&& Objects.equals( paiementAnnee, that.paiementAnnee )
				&& Objects.equals( paiementMontant, that.paiementMontant )
				&& Objects.equals( paiementEspeces, that.paiementEspeces )
				&& Objects.equals( paiementCheque, that.paiementCheque )
				&& Objects.equals( paiementECheck, that.paiementECheck )
				&& Objects.equals( paiementSysteme, that.paiementSysteme )
				&& Objects.equals( paiementType, that.paiementType )
				&& Objects.equals( paiementPar, that.paiementPar )
				&& Objects.equals( transactionId, that.transactionId )
				&& Objects.equals( customerProfileId, that.customerProfileId )
				&& Objects.equals( transactionStatus, that.transactionStatus )
				&& Objects.equals( paiementRecu, that.paiementRecu )
				&& Objects.equals( fraisMontant, that.fraisMontant )
				&& Objects.equals( fraisPremierDernier, that.fraisPremierDernier )
				&& Objects.equals( fraisInscription, that.fraisInscription )
				&& Objects.equals( fraisMois, that.fraisMois )
				&& Objects.equals( fraisRetard, that.fraisRetard )
				&& Objects.equals( paiementProchain, that.paiementProchain )
				&& Objects.equals( fraisMontantDu, that.fraisMontantDu )
				&& Objects.equals( fraisMontantPasse, that.fraisMontantPasse )
				&& Objects.equals( fraisMontantNonPasse, that.fraisMontantNonPasse )
				&& Objects.equals( fraisMontantFuture, that.fraisMontantFuture )
				&& Objects.equals( paiementNomCourt, that.paiementNomCourt )
				&& Objects.equals( paiementNomComplet, that.paiementNomComplet );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PaiementSite { ");
		sb.append( "paiementCle: " ).append(paiementCle);
		sb.append( ", utilisateurCles: " ).append(utilisateurCles);
		sb.append( ", paiementDescription: \"" ).append(paiementDescription).append( "\"" );
		sb.append( ", paiementDate: " ).append(paiementDate);
		sb.append( ", paiementAnnee: " ).append(paiementAnnee);
		sb.append( ", paiementMontant: " ).append(paiementMontant);
		sb.append( ", paiementEspeces: " ).append(paiementEspeces);
		sb.append( ", paiementCheque: " ).append(paiementCheque);
		sb.append( ", paiementECheck: " ).append(paiementECheck);
		sb.append( ", paiementSysteme: " ).append(paiementSysteme);
		sb.append( ", paiementType: \"" ).append(paiementType).append( "\"" );
		sb.append( ", paiementPar: \"" ).append(paiementPar).append( "\"" );
		sb.append( ", transactionId: \"" ).append(transactionId).append( "\"" );
		sb.append( ", customerProfileId: \"" ).append(customerProfileId).append( "\"" );
		sb.append( ", transactionStatus: \"" ).append(transactionStatus).append( "\"" );
		sb.append( ", paiementRecu: " ).append(paiementRecu);
		sb.append( ", fraisMontant: " ).append(fraisMontant);
		sb.append( ", fraisPremierDernier: " ).append(fraisPremierDernier);
		sb.append( ", fraisInscription: " ).append(fraisInscription);
		sb.append( ", fraisMois: " ).append(fraisMois);
		sb.append( ", fraisRetard: " ).append(fraisRetard);
		sb.append( ", paiementProchain: " ).append(paiementProchain);
		sb.append( ", fraisMontantDu: " ).append(fraisMontantDu);
		sb.append( ", fraisMontantPasse: " ).append(fraisMontantPasse);
		sb.append( ", fraisMontantNonPasse: " ).append(fraisMontantNonPasse);
		sb.append( ", fraisMontantFuture: " ).append(fraisMontantFuture);
		sb.append( ", paiementNomCourt: \"" ).append(paiementNomCourt).append( "\"" );
		sb.append( ", paiementNomComplet: \"" ).append(paiementNomComplet).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
