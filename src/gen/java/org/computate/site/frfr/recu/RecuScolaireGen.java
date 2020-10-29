package org.computate.site.frfr.recu;

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
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class RecuScolaireGen<DEV> extends Cluster {
	protected static final Logger LOGGER = LoggerFactory.getLogger(RecuScolaire.class);

	public static final List<String> ROLES = Arrays.asList("SiteManager");
	public static final List<String> ROLE_READS = Arrays.asList("");

	public static final String RecuScolaire_UnNom = "un reçu";
	public static final String RecuScolaire_Ce = "ce ";
	public static final String RecuScolaire_CeNom = "ce reçu";
	public static final String RecuScolaire_Un = "un ";
	public static final String RecuScolaire_LeNom = "le reçu";
	public static final String RecuScolaire_NomSingulier = "reçu";
	public static final String RecuScolaire_NomPluriel = "reçus";
	public static final String RecuScolaire_NomActuel = "reçu actuel";
	public static final String RecuScolaire_TousNom = "tous les reçus";
	public static final String RecuScolaire_RechercherTousNomPar = "rechercher reçus par ";
	public static final String RecuScolaire_RechercherTousNom = "rechercher reçus";
	public static final String RecuScolaire_Titre = "reçus";
	public static final String RecuScolaire_LesNom = "les reçus";
	public static final String RecuScolaire_AucunNomTrouve = "aucun reçu trouvé";
	public static final String RecuScolaire_NomVar = "reçu";
	public static final String RecuScolaire_DeNom = "de reçu";
	public static final String RecuScolaire_NomAdjectifSingulier = "reçu";
	public static final String RecuScolaire_NomAdjectifPluriel = "reçus";
	public static final String RecuScolaire_Couleur = "light-green";
	public static final String RecuScolaire_IconeGroupe = "solid";
	public static final String RecuScolaire_IconeNom = "file-invoice-dollar";
	public static final Integer RecuScolaire_Lignes = 100;

	/////////////
	// recuCle //
	/////////////

	/**	 L'entité recuCle
	 *	 is defined as null before being initialized. 
	 */
	@JsonSerialize(using = ToStringSerializer.class)
	@JsonInclude(Include.NON_NULL)
	protected Long recuCle;
	@JsonIgnore
	public Couverture<Long> recuCleCouverture = new Couverture<Long>().p(this).c(Long.class).var("recuCle").o(recuCle);

	/**	<br/> L'entité recuCle
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recuCle">Trouver l'entité recuCle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _recuCle(Couverture<Long> c);

	public Long getRecuCle() {
		return recuCle;
	}

	public void setRecuCle(Long recuCle) {
		this.recuCle = recuCle;
		this.recuCleCouverture.dejaInitialise = true;
	}
	public RecuScolaire setRecuCle(String o) {
		if(NumberUtils.isParsable(o))
			this.recuCle = Long.parseLong(o);
		this.recuCleCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	protected RecuScolaire recuCleInit() {
		if(!recuCleCouverture.dejaInitialise) {
			_recuCle(recuCleCouverture);
			if(recuCle == null)
				setRecuCle(recuCleCouverture.o);
		}
		recuCleCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
	}

	public Long solrRecuCle() {
		return recuCle;
	}

	public String strRecuCle() {
		return recuCle == null ? "" : recuCle.toString();
	}

	public String jsonRecuCle() {
		return recuCle == null ? "" : recuCle.toString();
	}

	public String nomAffichageRecuCle() {
		return "clé";
	}

	public String htmTooltipRecuCle() {
		return null;
	}

	public String htmRecuCle() {
		return recuCle == null ? "" : StringEscapeUtils.escapeHtml4(strRecuCle());
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementDate">Trouver l'entité paiementDate dans Solr</a>
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
	public RecuScolaire setPaiementDate(Instant o) {
		this.paiementDate = o == null ? null : LocalDate.from(o);
		this.paiementDateCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	/** Example: 2011-12-03+01:00 **/
	public RecuScolaire setPaiementDate(String o) {
		this.paiementDate = o == null ? null : LocalDate.parse(o, DateTimeFormatter.ISO_DATE);
		this.paiementDateCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	public RecuScolaire setPaiementDate(Date o) {
		this.paiementDate = o == null ? null : o.toInstant().atZone(ZoneId.of(requeteSite_.getConfigSite_().getSiteZone())).toLocalDate();
		this.paiementDateCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	protected RecuScolaire paiementDateInit() {
		if(!paiementDateCouverture.dejaInitialise) {
			_paiementDate(paiementDateCouverture);
			if(paiementDate == null)
				setPaiementDate(paiementDateCouverture.o);
		}
		paiementDateCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
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
		RecuScolaire s = (RecuScolaire)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("class", "w3-input w3-border datepicker setPaiementDate classRecuScolaire inputRecuScolaire", pk, "PaiementDate w3-input w3-border ")
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
				) {
				e("span").a("class", "varRecuScolaire", pk, "PaiementDate ").f().sx(htmPaiementDate()).g("span");
			}
		}
	}

	public void htmPaiementDate(String classeApiMethodeMethode) {
		RecuScolaire s = (RecuScolaire)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "RecuScolairePaiementDate").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-light-green ").f();
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
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-light-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementDate')); $('#", classeApiMethodeMethode, "_paiementDate').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#RecuScolaireForm :input[name=pk]').val() }], 'setPaiementDate', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementDate')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementDate')); }); ")
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementAnnee">Trouver l'entité paiementAnnee dans Solr</a>
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
	public RecuScolaire setPaiementAnnee(String o) {
		if(NumberUtils.isParsable(o))
			this.paiementAnnee = Integer.parseInt(o);
		this.paiementAnneeCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	protected RecuScolaire paiementAnneeInit() {
		if(!paiementAnneeCouverture.dejaInitialise) {
			_paiementAnnee(paiementAnneeCouverture);
			if(paiementAnnee == null)
				setPaiementAnnee(paiementAnneeCouverture.o);
		}
		paiementAnneeCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementMontant">Trouver l'entité paiementMontant dans Solr</a>
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
	public RecuScolaire setPaiementMontant(String o) {
		o = StringUtils.removeAll(o, "[^\\d\\.]");
		if(NumberUtils.isParsable(o))
			this.paiementMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.paiementMontantCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	public RecuScolaire setPaiementMontant(Double o) {
			this.paiementMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.paiementMontantCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	public RecuScolaire setPaiementMontant(Integer o) {
			this.paiementMontant = new BigDecimal(o, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP);
		this.paiementMontantCouverture.dejaInitialise = true;
		return (RecuScolaire)this;
	}
	protected RecuScolaire paiementMontantInit() {
		if(!paiementMontantCouverture.dejaInitialise) {
			_paiementMontant(paiementMontantCouverture);
			if(paiementMontant == null)
				setPaiementMontant(paiementMontantCouverture.o);
		}
		paiementMontantCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
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
		RecuScolaire s = (RecuScolaire)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "paiement montant")
				.a("id", classeApiMethodeMethode, "_paiementMontant");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementMontant classRecuScolaire inputRecuScolaire", pk, "PaiementMontant w3-input w3-border ");
					a("name", "setPaiementMontant");
				} else {
					a("class", "valeurPaiementMontant w3-input w3-border classRecuScolaire inputRecuScolaire", pk, "PaiementMontant w3-input w3-border ");
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
				) {
				e("span").a("class", "varRecuScolaire", pk, "PaiementMontant ").f().sx(htmPaiementMontant()).g("span");
			}
		}
	}

	public void htmPaiementMontant(String classeApiMethodeMethode) {
		RecuScolaire s = (RecuScolaire)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "RecuScolairePaiementMontant").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-light-green ").f();
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
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-light-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementMontant')); $('#", classeApiMethodeMethode, "_paiementMontant').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#RecuScolaireForm :input[name=pk]').val() }], 'setPaiementMontant', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementMontant')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementMontant')); }); ")
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementDescription">Trouver l'entité paiementDescription dans Solr</a>
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
	protected RecuScolaire paiementDescriptionInit() {
		if(!paiementDescriptionCouverture.dejaInitialise) {
			_paiementDescription(paiementDescriptionCouverture);
			if(paiementDescription == null)
				setPaiementDescription(paiementDescriptionCouverture.o);
		}
		paiementDescriptionCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
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
		RecuScolaire s = (RecuScolaire)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "description")
				.a("id", classeApiMethodeMethode, "_paiementDescription");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementDescription classRecuScolaire inputRecuScolaire", pk, "PaiementDescription w3-input w3-border ");
					a("name", "setPaiementDescription");
				} else {
					a("class", "valeurPaiementDescription w3-input w3-border classRecuScolaire inputRecuScolaire", pk, "PaiementDescription w3-input w3-border ");
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
				) {
				e("span").a("class", "varRecuScolaire", pk, "PaiementDescription ").f().sx(htmPaiementDescription()).g("span");
			}
		}
	}

	public void htmPaiementDescription(String classeApiMethodeMethode) {
		RecuScolaire s = (RecuScolaire)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "RecuScolairePaiementDescription").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-light-green ").f();
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
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-light-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementDescription')); $('#", classeApiMethodeMethode, "_paiementDescription').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#RecuScolaireForm :input[name=pk]').val() }], 'setPaiementDescription', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementDescription')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementDescription')); }); ")
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementNomCourt">Trouver l'entité paiementNomCourt dans Solr</a>
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
	protected RecuScolaire paiementNomCourtInit() {
		if(!paiementNomCourtCouverture.dejaInitialise) {
			_paiementNomCourt(paiementNomCourtCouverture);
			if(paiementNomCourt == null)
				setPaiementNomCourt(paiementNomCourtCouverture.o);
		}
		paiementNomCourtCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
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
		RecuScolaire s = (RecuScolaire)this;
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("input")
				.a("type", "text")
				.a("placeholder", "nom")
				.a("id", classeApiMethodeMethode, "_paiementNomCourt");
				if("Page".equals(classeApiMethodeMethode) || "PATCH".equals(classeApiMethodeMethode)) {
					a("class", "setPaiementNomCourt classRecuScolaire inputRecuScolaire", pk, "PaiementNomCourt w3-input w3-border ");
					a("name", "setPaiementNomCourt");
				} else {
					a("class", "valeurPaiementNomCourt w3-input w3-border classRecuScolaire inputRecuScolaire", pk, "PaiementNomCourt w3-input w3-border ");
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
				) {
				e("span").a("class", "varRecuScolaire", pk, "PaiementNomCourt ").f().sx(htmPaiementNomCourt()).g("span");
			}
		}
	}

	public void htmPaiementNomCourt(String classeApiMethodeMethode) {
		RecuScolaire s = (RecuScolaire)this;
		{ e("div").a("class", "w3-cell w3-cell-top w3-center w3-mobile ").f();
			{ e("div").a("class", "w3-padding ").f();
				{ e("div").a("id", "suggere", classeApiMethodeMethode, "RecuScolairePaiementNomCourt").f();
					{ e("div").a("class", "w3-card ").f();
						{ e("div").a("class", "w3-cell-row w3-light-green ").f();
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
											.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-light-green ")
										.a("onclick", "enleverLueur($('#", classeApiMethodeMethode, "_paiementNomCourt')); $('#", classeApiMethodeMethode, "_paiementNomCourt').val(null); patch", getClass().getSimpleName(), "Val([{ name: 'fq', value: 'pk:' + $('#RecuScolaireForm :input[name=pk]').val() }], 'setPaiementNomCourt', null, function() { ajouterLueur($('#", classeApiMethodeMethode, "_paiementNomCourt')); }, function() { ajouterErreur($('#", classeApiMethodeMethode, "_paiementNomCourt')); }); ")
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
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.recu.RecuScolaire&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementNomComplet">Trouver l'entité paiementNomComplet dans Solr</a>
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
	protected RecuScolaire paiementNomCompletInit() {
		if(!paiementNomCompletCouverture.dejaInitialise) {
			_paiementNomComplet(paiementNomCompletCouverture);
			if(paiementNomComplet == null)
				setPaiementNomComplet(paiementNomCompletCouverture.o);
		}
		paiementNomCompletCouverture.dejaInitialise(true);
		return (RecuScolaire)this;
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

	protected boolean dejaInitialiseRecuScolaire = false;

	public RecuScolaire initLoinRecuScolaire(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseRecuScolaire) {
			dejaInitialiseRecuScolaire = true;
			initLoinRecuScolaire();
		}
		return (RecuScolaire)this;
	}

	public void initLoinRecuScolaire() {
		initRecuScolaire();
		super.initLoinCluster(requeteSite_);
	}

	public void initRecuScolaire() {
		recuCleInit();
		paiementDateInit();
		paiementAnneeInit();
		paiementMontantInit();
		paiementDescriptionInit();
		paiementNomCourtInit();
		paiementNomCompletInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinRecuScolaire(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteRecuScolaire(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteCluster(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteRecuScolaire(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirRecuScolaire(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirRecuScolaire(String var) {
		RecuScolaire oRecuScolaire = (RecuScolaire)this;
		switch(var) {
			case "recuCle":
				return oRecuScolaire.recuCle;
			case "paiementDate":
				return oRecuScolaire.paiementDate;
			case "paiementAnnee":
				return oRecuScolaire.paiementAnnee;
			case "paiementMontant":
				return oRecuScolaire.paiementMontant;
			case "paiementDescription":
				return oRecuScolaire.paiementDescription;
			case "paiementNomCourt":
				return oRecuScolaire.paiementNomCourt;
			case "paiementNomComplet":
				return oRecuScolaire.paiementNomComplet;
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
				o = attribuerRecuScolaire(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerRecuScolaire(String var, Object val) {
		RecuScolaire oRecuScolaire = (RecuScolaire)this;
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
					o = definirRecuScolaire(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirRecuScolaire(String var, String val) {
		switch(var) {
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
			case "paiementDescription":
				if(val != null)
					setPaiementDescription(val);
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
		peuplerRecuScolaire(solrDocument);
	}
	public void peuplerRecuScolaire(SolrDocument solrDocument) {
		RecuScolaire oRecuScolaire = (RecuScolaire)this;
		sauvegardes = (List<String>)solrDocument.get("sauvegardes_stored_strings");
		if(sauvegardes != null) {

			if(sauvegardes.contains("recuCle")) {
				Long recuCle = (Long)solrDocument.get("recuCle_stored_long");
				if(recuCle != null)
					oRecuScolaire.setRecuCle(recuCle);
			}

			if(sauvegardes.contains("paiementDate")) {
				Date paiementDate = (Date)solrDocument.get("paiementDate_stored_date");
				if(paiementDate != null)
					oRecuScolaire.setPaiementDate(paiementDate);
			}

			if(sauvegardes.contains("paiementAnnee")) {
				Integer paiementAnnee = (Integer)solrDocument.get("paiementAnnee_stored_int");
				if(paiementAnnee != null)
					oRecuScolaire.setPaiementAnnee(paiementAnnee);
			}

			if(sauvegardes.contains("paiementMontant")) {
				Double paiementMontant = (Double)solrDocument.get("paiementMontant_stored_double");
				if(paiementMontant != null)
					oRecuScolaire.setPaiementMontant(paiementMontant);
			}

			if(sauvegardes.contains("paiementDescription")) {
				String paiementDescription = (String)solrDocument.get("paiementDescription_stored_string");
				if(paiementDescription != null)
					oRecuScolaire.setPaiementDescription(paiementDescription);
			}

			if(sauvegardes.contains("paiementNomCourt")) {
				String paiementNomCourt = (String)solrDocument.get("paiementNomCourt_stored_string");
				if(paiementNomCourt != null)
					oRecuScolaire.setPaiementNomCourt(paiementNomCourt);
			}

			if(sauvegardes.contains("paiementNomComplet")) {
				String paiementNomComplet = (String)solrDocument.get("paiementNomComplet_stored_string");
				if(paiementNomComplet != null)
					oRecuScolaire.setPaiementNomComplet(paiementNomComplet);
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frfr.recu.RecuScolaire"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			RecuScolaire o = new RecuScolaire();
			o.requeteSiteRecuScolaire(requeteSite);
			o.initLoinRecuScolaire(requeteSite);
			o.indexerRecuScolaire();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerRecuScolaire();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerRecuScolaire(document);
	}

	public void indexerRecuScolaire(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerRecuScolaire(document);
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerRecuScolaire() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerRecuScolaire(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerRecuScolaire(SolrInputDocument document) {
		if(recuCle != null) {
			document.addField("recuCle_indexed_long", recuCle);
			document.addField("recuCle_stored_long", recuCle);
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
		if(paiementDescription != null) {
			document.addField("paiementDescription_indexed_string", paiementDescription);
			document.addField("paiementDescription_stored_string", paiementDescription);
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

	public void desindexerRecuScolaire() {
		try {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.initLoinSiteContexteFrFR();
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinRecuScolaire(requeteSite);
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit(false, false, true);
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public static String varIndexeRecuScolaire(String entiteVar) {
		switch(entiteVar) {
			case "recuCle":
				return "recuCle_indexed_long";
			case "paiementDate":
				return "paiementDate_indexed_date";
			case "paiementAnnee":
				return "paiementAnnee_indexed_int";
			case "paiementMontant":
				return "paiementMontant_indexed_double";
			case "paiementDescription":
				return "paiementDescription_indexed_string";
			case "paiementNomCourt":
				return "paiementNomCourt_indexed_string";
			case "paiementNomComplet":
				return "paiementNomComplet_indexed_string";
			default:
				return Cluster.varIndexeCluster(entiteVar);
		}
	}

	public static String varRechercheRecuScolaire(String entiteVar) {
		switch(entiteVar) {
			default:
				return Cluster.varRechercheCluster(entiteVar);
		}
	}

	public static String varSuggereRecuScolaire(String entiteVar) {
		switch(entiteVar) {
			default:
				return Cluster.varSuggereCluster(entiteVar);
		}
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerRecuScolaire(solrDocument);
	}
	public void stockerRecuScolaire(SolrDocument solrDocument) {
		RecuScolaire oRecuScolaire = (RecuScolaire)this;

		Long recuCle = (Long)solrDocument.get("recuCle_stored_long");
		if(recuCle != null)
			oRecuScolaire.setRecuCle(recuCle);

		Date paiementDate = (Date)solrDocument.get("paiementDate_stored_date");
		if(paiementDate != null)
			oRecuScolaire.setPaiementDate(paiementDate);

		Integer paiementAnnee = (Integer)solrDocument.get("paiementAnnee_stored_int");
		if(paiementAnnee != null)
			oRecuScolaire.setPaiementAnnee(paiementAnnee);

		Double paiementMontant = (Double)solrDocument.get("paiementMontant_stored_double");
		if(paiementMontant != null)
			oRecuScolaire.setPaiementMontant(paiementMontant);

		String paiementDescription = (String)solrDocument.get("paiementDescription_stored_string");
		if(paiementDescription != null)
			oRecuScolaire.setPaiementDescription(paiementDescription);

		String paiementNomCourt = (String)solrDocument.get("paiementNomCourt_stored_string");
		if(paiementNomCourt != null)
			oRecuScolaire.setPaiementNomCourt(paiementNomCourt);

		String paiementNomComplet = (String)solrDocument.get("paiementNomComplet_stored_string");
		if(paiementNomComplet != null)
			oRecuScolaire.setPaiementNomComplet(paiementNomComplet);

		super.stockerCluster(solrDocument);
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiRecuScolaire() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof RecuScolaire) {
			RecuScolaire original = (RecuScolaire)o;
			if(!Objects.equals(recuCle, original.getRecuCle()))
				requeteApi.addVars("recuCle");
			if(!Objects.equals(paiementDate, original.getPaiementDate()))
				requeteApi.addVars("paiementDate");
			if(!Objects.equals(paiementAnnee, original.getPaiementAnnee()))
				requeteApi.addVars("paiementAnnee");
			if(!Objects.equals(paiementMontant, original.getPaiementMontant()))
				requeteApi.addVars("paiementMontant");
			if(!Objects.equals(paiementDescription, original.getPaiementDescription()))
				requeteApi.addVars("paiementDescription");
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
		return Objects.hash(super.hashCode(), recuCle, paiementDate, paiementAnnee, paiementMontant, paiementDescription, paiementNomCourt, paiementNomComplet);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof RecuScolaire))
			return false;
		RecuScolaire that = (RecuScolaire)o;
		return super.equals(o)
				&& Objects.equals( recuCle, that.recuCle )
				&& Objects.equals( paiementDate, that.paiementDate )
				&& Objects.equals( paiementAnnee, that.paiementAnnee )
				&& Objects.equals( paiementMontant, that.paiementMontant )
				&& Objects.equals( paiementDescription, that.paiementDescription )
				&& Objects.equals( paiementNomCourt, that.paiementNomCourt )
				&& Objects.equals( paiementNomComplet, that.paiementNomComplet );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("RecuScolaire { ");
		sb.append( "recuCle: " ).append(recuCle);
		sb.append( ", paiementDate: " ).append(paiementDate);
		sb.append( ", paiementAnnee: " ).append(paiementAnnee);
		sb.append( ", paiementMontant: " ).append(paiementMontant);
		sb.append( ", paiementDescription: \"" ).append(paiementDescription).append( "\"" );
		sb.append( ", paiementNomCourt: \"" ).append(paiementNomCourt).append( "\"" );
		sb.append( ", paiementNomComplet: \"" ).append(paiementNomComplet).append( "\"" );
		sb.append(" }");
		return sb.toString();
	}
}
