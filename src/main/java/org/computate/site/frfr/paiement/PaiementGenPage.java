package org.computate.site.frfr.paiement;

import org.computate.site.frfr.cluster.ClusterPage;
import org.computate.site.frfr.page.MiseEnPage;
import org.computate.site.frfr.config.ConfigSite;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.computate.site.frfr.contexte.SiteContexteFrFR;
import org.computate.site.frfr.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.frfr.recherche.ListeRecherche;
import org.computate.site.frfr.couverture.Couverture;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;
import java.util.Map;
import java.util.List;
import java.util.Optional;
import org.apache.solr.common.util.SimpleOrderedMap;
import java.util.stream.Collectors;
import java.util.Arrays;
import org.apache.solr.client.solrj.response.QueryResponse;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.math.MathContext;
import org.apache.commons.collections.CollectionUtils;
import java.util.Objects;
import org.apache.solr.client.solrj.SolrQuery.SortClause;


/**
 * Traduire: false
 **/
public class PaiementGenPage extends PaiementGenPageGen<ClusterPage> {

	public static final List<String> ROLES = Arrays.asList("SiteAdmin");
	public static final List<String> ROLE_READS = Arrays.asList("User");

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listePaiementSite(Couverture<ListeRecherche<PaiementSite>> c) {
	}

	protected void _paiementSite_(Couverture<PaiementSite> c) {
		if(listePaiementSite != null && listePaiementSite.size() == 1)
			c.o(listePaiementSite.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
			c.o("paiements");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		if(paiementSite_ != null && paiementSite_.getPaiementNomComplet() != null)
			c.o(paiementSite_.getPaiementNomComplet());
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(paiementSite_ != null && paiementSite_.getPaiementNomComplet() != null)
			c.o(paiementSite_.getPaiementNomComplet());
		else if(paiementSite_ != null)
			c.o("paiements");
		else if(listePaiementSite == null || listePaiementSite.size() == 0)
			c.o("aucun paiement trouvé");
		else
			c.o("paiements");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/paiement");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/paiement-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("solid");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("search-dollar");
	}

	@Override public void initLoinPaiementGenPage() {
		initPaiementGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPaiementGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/frFR/PaiementPage.js").f().g("script");
	}

	@Override public void htmlScriptPaiementGenPage() {
		l("$(document).ready(function() {");
		tl(1, "document.onkeydown = function(evt) {");
		tl(2, "evt = evt || window.event;");
		tl(2, "var isEscape = false;");
		tl(2, "if ('key' in evt) {");
		tl(3, "isEscape = (evt.key === 'Escape' || evt.key === 'Esc');");
		tl(2, "} else {");
		tl(3, "isEscape = (evt.keyCode === 27);");
		tl(2, "}");
		tl(2, "if (isEscape) {");
		tl(3, "$('.w3-modal:visible').hide();");
		tl(2, "}");
		tl(1, "};");
		tl(1, "window.eventBus = new EventBus('/eventbus');");
		tl(1, "var pk = ", Optional.ofNullable(requeteSite_.getRequetePk()).map(l -> l.toString()).orElse("null"), ";");
		tl(1, "if(pk != null) {");
		tl(1, "}");
		tl(1, "websocketPaiementSite(websocketPaiementSiteInner);");
		l("});");
	}

	public void htmlFormPagePaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPk("Page");
			o.htmCree("Page");
			o.htmModifie("Page");
			o.htmObjetId("Page");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmArchive("Page");
			o.htmSupprime("Page");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDate("Page");
			o.htmPaiementMontant("Page");
			o.htmPaiementEspeces("Page");
			o.htmPaiementCheque("Page");
			o.htmPaiementECheck("Page");
			o.htmPaiementSysteme("Page");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDescription("Page");
			o.htmPaiementPar("Page");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmTransactionId("Page");
			o.htmCustomerProfileId("Page");
			o.htmTransactionStatus("Page");
			o.htmPaiementRecu("Page");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmFraisMontant("Page");
			o.htmFraisPremierDernier("Page");
			o.htmFraisInscription("Page");
			o.htmFraisMois("Page");
			o.htmFraisRetard("Page");
		} g("div");
	}

	public void htmlFormPOSTPaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPk("POST");
			o.htmCree("POST");
			o.htmModifie("POST");
			o.htmObjetId("POST");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmArchive("POST");
			o.htmSupprime("POST");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDate("POST");
			o.htmPaiementMontant("POST");
			o.htmPaiementEspeces("POST");
			o.htmPaiementCheque("POST");
			o.htmPaiementECheck("POST");
			o.htmPaiementSysteme("POST");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDescription("POST");
			o.htmPaiementPar("POST");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmTransactionId("POST");
			o.htmCustomerProfileId("POST");
			o.htmTransactionStatus("POST");
			o.htmPaiementRecu("POST");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmFraisMontant("POST");
			o.htmFraisPremierDernier("POST");
			o.htmFraisInscription("POST");
			o.htmFraisMois("POST");
			o.htmFraisRetard("POST");
		} g("div");
	}

	public void htmlFormPUTImportPaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			e("textarea")
				.a("class", "PUTImport_liste w3-input w3-border ")
				.a("style", "height: 400px; ")
				.a("placeholder", "{ \"liste\": [ { \"pk\": ... , \"sauvegardes\": [ ... ] }, ... ] }")
				;
				f();
			g("textarea");
		} g("div");
	}

	public void htmlFormPUTFusionPaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			e("textarea")
				.a("class", "PUTFusion_liste w3-input w3-border ")
				.a("style", "height: 400px; ")
				.a("placeholder", "{ \"liste\": [ { \"pk\": ... , \"sauvegardes\": [ ... ] }, ... ] }")
				;
				f();
			g("textarea");
		} g("div");
	}

	public void htmlFormPUTCopiePaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmCree("PUTCopie");
			o.htmModifie("PUTCopie");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmArchive("PUTCopie");
			o.htmSupprime("PUTCopie");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDate("PUTCopie");
			o.htmPaiementMontant("PUTCopie");
			o.htmPaiementEspeces("PUTCopie");
			o.htmPaiementCheque("PUTCopie");
			o.htmPaiementECheck("PUTCopie");
			o.htmPaiementSysteme("PUTCopie");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDescription("PUTCopie");
			o.htmPaiementPar("PUTCopie");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmTransactionId("PUTCopie");
			o.htmCustomerProfileId("PUTCopie");
			o.htmTransactionStatus("PUTCopie");
			o.htmPaiementRecu("PUTCopie");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmFraisMontant("PUTCopie");
			o.htmFraisPremierDernier("PUTCopie");
			o.htmFraisInscription("PUTCopie");
			o.htmFraisMois("PUTCopie");
			o.htmFraisRetard("PUTCopie");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmInheritPk("PUTCopie");
			o.htmSessionId("PUTCopie");
			o.htmUtilisateurId("PUTCopie");
			o.htmUtilisateurCle("PUTCopie");
			o.htmFraisMontantDu("PUTCopie");
			o.htmFraisMontantPasse("PUTCopie");
			o.htmFraisMontantNonPasse("PUTCopie");
			o.htmFraisMontantFuture("PUTCopie");
			o.htmPaiementNomCourt("PUTCopie");
		} g("div");
	}

	public void htmlFormPATCHPaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmCree("PATCH");
			o.htmModifie("PATCH");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmArchive("PATCH");
			o.htmSupprime("PATCH");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDate("PATCH");
			o.htmPaiementMontant("PATCH");
			o.htmPaiementEspeces("PATCH");
			o.htmPaiementCheque("PATCH");
			o.htmPaiementECheck("PATCH");
			o.htmPaiementSysteme("PATCH");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDescription("PATCH");
			o.htmPaiementPar("PATCH");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmTransactionId("PATCH");
			o.htmCustomerProfileId("PATCH");
			o.htmTransactionStatus("PATCH");
			o.htmPaiementRecu("PATCH");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmFraisMontant("PATCH");
			o.htmFraisPremierDernier("PATCH");
			o.htmFraisInscription("PATCH");
			o.htmFraisMois("PATCH");
			o.htmFraisRetard("PATCH");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmInheritPk("PATCH");
			o.htmSessionId("PATCH");
			o.htmUtilisateurId("PATCH");
			o.htmUtilisateurCle("PATCH");
			o.htmFraisMontantDu("PATCH");
			o.htmFraisMontantPasse("PATCH");
			o.htmFraisMontantNonPasse("PATCH");
			o.htmFraisMontantFuture("PATCH");
			o.htmPaiementNomCourt("PATCH");
		} g("div");
	}

	public void htmlFormRecherchePaiementSite(PaiementSite o) {
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPk("Recherche");
			o.htmCree("Recherche");
			o.htmModifie("Recherche");
			o.htmObjetId("Recherche");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmArchive("Recherche");
			o.htmSupprime("Recherche");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDate("Recherche");
			o.htmPaiementMontant("Recherche");
			o.htmPaiementEspeces("Recherche");
			o.htmPaiementCheque("Recherche");
			o.htmPaiementECheck("Recherche");
			o.htmPaiementSysteme("Recherche");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmPaiementDescription("Recherche");
			o.htmPaiementPar("Recherche");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmTransactionId("Recherche");
			o.htmCustomerProfileId("Recherche");
			o.htmTransactionStatus("Recherche");
			o.htmPaiementRecu("Recherche");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmFraisMontant("Recherche");
			o.htmFraisPremierDernier("Recherche");
			o.htmFraisInscription("Recherche");
			o.htmFraisMois("Recherche");
			o.htmFraisRetard("Recherche");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			o.htmInheritPk("Recherche");
			o.htmSessionId("Recherche");
			o.htmUtilisateurId("Recherche");
			o.htmUtilisateurCle("Recherche");
			o.htmObjetTitre("Recherche");
			o.htmFraisMontantDu("Recherche");
			o.htmFraisMontantPasse("Recherche");
			o.htmFraisMontantNonPasse("Recherche");
			o.htmFraisMontantFuture("Recherche");
			o.htmPaiementNomCourt("Recherche");
		} g("div");
	}

	@Override public void htmlBodyPaiementGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listePaiementSite == null || listePaiementSite.size() == 0) {

			{ e("h1").f();
				{ e("a").a("href", "/paiement").a("class", "w3-bar-item w3-btn w3-center w3-block w3-green w3-hover-green ").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx("paiements").g("span");
				} g("a");
			} g("h1");
			e("div").a("class", "w3-padding-16 w3-card-4 w3-light-grey ").f();
			{ e("h2").f();
				{ e("span").a("class", "w3-bar-item w3-padding w3-center w3-block w3-green ").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx("aucun paiement trouvé").g("span");
				} g("span");
			} g("h2");
		} else if(listePaiementSite != null && listePaiementSite.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*")) {
			PaiementSite o = listePaiementSite.get(0);
			requeteSite_.setRequetePk(o.getPk());
			if(StringUtils.isNotEmpty(pageH1)) {
				{ e("h1").f();
					{ e("a").a("href", "/paiement").a("class", "w3-bar-item w3-btn w3-center w3-block w3-green w3-hover-green ").f();
						if(contexteIconeClassesCss != null)
							e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
						e("span").a("class", " ").f().sx(pageH1).g("span");
					} g("a");
				} g("h1");
			}
			e("div").a("class", "w3-padding-16 w3-card-4 w3-light-grey ").f();
			if(StringUtils.isNotEmpty(pageH2)) {
				{ e("h2").f();
					{ e("span").a("class", "w3-bar-item w3-padding w3-center w3-block w3-green ").f();
						e("span").a("class", " ").f().sx(pageH2).g("span");
					} g("span");
				} g("h2");
			}
			if(StringUtils.isNotEmpty(pageH3)) {
				{ e("h3").f();
					{ e("span").a("class", "w3-bar-item w3-padding w3-center w3-block w3-green ").f();
						e("span").a("class", " ").f().sx(pageH3).g("span");
					} g("span");
				} g("h3");
			}
		} else {

			{ e("h1").f();
				{ e("a").a("href", "/paiement").a("class", "w3-bar-item w3-btn w3-center w3-block w3-green w3-hover-green ").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx(pageH1).g("span");
				} g("a");
			} g("h1");
			e("div").a("class", "").f();
				{ e("div").f();
					JsonObject queryParams = Optional.ofNullable(operationRequete).map(OperationRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
					Long num = listePaiementSite.getQueryResponse().getResults().getNumFound();
					String q = "*:*";
					String query1 = "objetTexte";
					String query2 = "";
					String query = "*:*";
					for(String paramNom : queryParams.fieldNames()) {
						String entiteVar = null;
						String valeurIndexe = null;
						Object paramValeursObjet = queryParams.getValue(paramNom);
						JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

						try {
							for(Object paramObjet : paramObjets) {
								switch(paramNom) {
									case "q":
										q = (String)paramObjet;
										entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
										valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
										query1 = entiteVar.equals("*") ? query1 : entiteVar;
										query2 = valeurIndexe;
										query = query1 + ":" + query2;
								}
							}
						} catch(Exception e) {
							ExceptionUtils.rethrow(e);
						}
					}

					Integer rows1 = Optional.ofNullable(listePaiementSite).map(l -> l.getRows()).orElse(10);
					Integer start1 = Optional.ofNullable(listePaiementSite).map(l -> l.getStart()).orElse(1);
					Integer start2 = start1 - rows1;
					Integer start3 = start1 + rows1;
					Integer rows2 = rows1 / 2;
					Integer rows3 = rows1 * 2;
					start2 = start2 < 0 ? 0 : start2;
					StringBuilder fqs = new StringBuilder();
					for(String fq : Optional.ofNullable(listePaiementSite).map(l -> l.getFilterQueries()).orElse(new String[0])) {
						if(!StringUtils.contains(fq, "(")) {
							String fq1 = StringUtils.substringBefore(fq, "_");
							String fq2 = StringUtils.substringAfter(fq, ":");
							if(!StringUtils.startsWithAny(fq, "classeNomsCanoniques_", "archive_", "supprime_", "sessionId", "utilisateurCles"))
								fqs.append("&fq=").append(fq1).append(":").append(fq2);
						}
					}
					StringBuilder sorts = new StringBuilder();
					for(SortClause sort : Optional.ofNullable(listePaiementSite).map(l -> l.getSorts()).orElse(Arrays.asList())) {
						sorts.append("&sort=").append(StringUtils.substringBefore(sort.getItem(), "_")).append(" ").append(sort.getOrder().name());
					}

					if(start1 == 0) {
						e("i").a("class", "fas fa-arrow-square-left w3-opacity ").f().g("i");
					} else {
						{ e("a").a("href", "/paiement?q=", query, fqs, sorts, "&start=", start2, "&rows=", rows1).f();
							e("i").a("class", "fas fa-arrow-square-left ").f().g("i");
						} g("a");
					}

					if(rows1 <= 1) {
						e("i").a("class", "fas fa-minus-square w3-opacity ").f().g("i");
					} else {
						{ e("a").a("href", "/paiement?q=", query, fqs, sorts, "&start=", start1, "&rows=", rows2).f();
							e("i").a("class", "fas fa-minus-square ").f().g("i");
						} g("a");
					}

					{ e("a").a("href", "/paiement?q=", query, fqs, sorts, "&start=", start1, "&rows=", rows3).f();
						e("i").a("class", "fas fa-plus-square ").f().g("i");
					} g("a");

					if(start3 >= num) {
						e("i").a("class", "fas fa-arrow-square-right w3-opacity ").f().g("i");
					} else {
						{ e("a").a("href", "/paiement?q=", query, fqs, sorts, "&start=", start3, "&rows=", rows1).f();
							e("i").a("class", "fas fa-arrow-square-right ").f().g("i");
						} g("a");
					}
						e("span").f().sx((start1 + 1), " - ", (start1 + rows1), " de ", num).g("span");
				} g("div");
				table1PaiementGenPage();
		}

		if(listePaiementSite != null && listePaiementSite.size() == 1 && params.getJsonObject("query").getString("q").equals("*:*")) {
			PaiementSite o = listePaiementSite.first();

			{ e("div").a("class", "").f();

				if(o.getPk() != null) {
					{ e("form").a("action", "").a("id", "PaiementSiteForm").a("style", "display: inline-block; width: 100%; ").a("onsubmit", "event.preventDefault(); return false; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
						e("input")
						.a("name", "focusId")
						.a("type", "hidden")
						.fg();
					} g("form");
					htmlFormPagePaiementSite(o);
				}

			} g("div");

		}
		htmlBodyFormsPaiementGenPage();
		g("div");
	}

	public void table1PaiementGenPage() {
		{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
			table2PaiementGenPage();
		} g("table");
	}

	public void table2PaiementGenPage() {
		thead1PaiementGenPage();
		tbody1PaiementGenPage();
		tfoot1PaiementGenPage();
	}

	public void thead1PaiementGenPage() {
		{ e("thead").a("class", "w3-green w3-hover-green ").f();
			thead2PaiementGenPage();
		} g("thead");
	}

	public void thead2PaiementGenPage() {
			{ e("tr").f();
			if(getColonneCree()) {
				e("th").f().sx("crée").g("th");
			}
			if(getColonneObjetTitre()) {
				e("th").f().sx("").g("th");
			}
			if(getColonnePaiementNomCourt()) {
				e("th").f().sx("nom").g("th");
			}
			if(getColonnePaiementDate()) {
				e("th").f().sx("date de paiement").g("th");
			}
			if(getColonnePaiementMontant()) {
				e("th").f().sx("paiement montant").g("th");
			}
			if(getColonneFraisMontant()) {
				e("th").f().sx("frais montant").g("th");
			}
			} g("tr");
	}

	public void tbody1PaiementGenPage() {
		{ e("tbody").f();
			tbody2PaiementGenPage();
		} g("tbody");
	}

	public void tbody2PaiementGenPage() {
		Map<String, Map<String, List<String>>> highlighting = listePaiementSite.getQueryResponse().getHighlighting();
		for(int i = 0; i < listePaiementSite.size(); i++) {
			PaiementSite o = listePaiementSite.getList().get(i);
			Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
			List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
			String uri = "/paiement/" + o.getPk();
			{ e("tr").f();
				if(getColonneCree()) {
					{ e("td").f();
						{ e("a").a("href", uri).f();
							{ e("span").f();
								sx(o.strCree());
							} g("span");
						} g("a");
					} g("td");
				}
				if(getColonneObjetTitre()) {
					{ e("td").f();
						{ e("a").a("href", uri).f();
							e("i").a("class", "fas fa-search-dollar ").f().g("i");
							{ e("span").f();
								sx(o.strObjetTitre());
							} g("span");
						} g("a");
					} g("td");
				}
				if(getColonnePaiementNomCourt()) {
					{ e("td").f();
						{ e("a").a("href", uri).f();
							{ e("span").f();
								sx(o.strPaiementNomCourt());
							} g("span");
						} g("a");
					} g("td");
				}
				if(getColonnePaiementDate()) {
					{ e("td").f();
						{ e("a").a("href", uri).f();
							{ e("span").f();
								sx(o.strPaiementDate());
							} g("span");
						} g("a");
					} g("td");
				}
				if(getColonnePaiementMontant()) {
					{ e("td").f();
						{ e("a").a("href", uri).f();
							{ e("span").f();
								sx(o.strPaiementMontant());
							} g("span");
						} g("a");
					} g("td");
				}
				if(getColonneFraisMontant()) {
					{ e("td").f();
						{ e("a").a("href", uri).f();
							{ e("span").f();
								sx(o.strFraisMontant());
							} g("span");
						} g("a");
					} g("td");
				}
			} g("tr");
		}
	}

	public void tfoot1PaiementGenPage() {
		{ e("tfoot").a("class", "w3-green w3-hover-green ").f();
			tfoot2PaiementGenPage();
		} g("tfoot");
	}

	public void tfoot2PaiementGenPage() {
		{ e("tr").f();
			SimpleOrderedMap facets = (SimpleOrderedMap)Optional.ofNullable(listePaiementSite.getQueryResponse()).map(QueryResponse::getResponse).map(r -> r.get("facets")).orElse(new SimpleOrderedMap());
			if(getColonneCree()) {
				e("td").f();
				g("td");
			}
			if(getColonneObjetTitre()) {
				e("td").f();
				g("td");
			}
			if(getColonnePaiementNomCourt()) {
				e("td").f();
				g("td");
			}
			if(getColonnePaiementDate()) {
				e("td").f();
				g("td");
			}
			if(getColonnePaiementMontant()) {
				e("td").f();
				BigDecimal sum_paiementMontant = Optional.ofNullable((Double)facets.get("sum_paiementMontant")).map(d -> new BigDecimal(d, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP)).orElse(new BigDecimal(0, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
				e("span").a("class", "font-weight-bold ").f().sx(sum_paiementMontant).g("span");
				g("td");
			}
			if(getColonneFraisMontant()) {
				e("td").f();
				BigDecimal sum_fraisMontant = Optional.ofNullable((Double)facets.get("sum_fraisMontant")).map(d -> new BigDecimal(d, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP)).orElse(new BigDecimal(0, MathContext.DECIMAL64).setScale(2, RoundingMode.HALF_UP));
				e("span").a("class", "font-weight-bold ").f().sx(sum_fraisMontant).g("span");
				g("td");
			}
		} g("tr");
	}

	public Boolean getColonneCree() {
		return true;
	}

	public Boolean getColonneObjetTitre() {
		return true;
	}

	public Boolean getColonnePaiementNomCourt() {
		return true;
	}

	public Boolean getColonnePaiementDate() {
		return true;
	}

	public Boolean getColonnePaiementMontant() {
		return true;
	}

	public Boolean getColonneFraisMontant() {
		return true;
	}

	public void htmlBodyFormsPaiementGenPage() {
		if(
				CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), ROLES)
				|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), ROLES)
				) {
			e("div").a("class", "w3-margin-top ").f();

			if(listePaiementSite != null && listePaiementSite.size() == 1) {
				{ e("button")
					.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("id", "rechargerCePaiementGenPage")
						.a("onclick", "patchPaiementSiteVals( [ {name: 'fq', value: 'pk:' + " + requeteSite_.getRequetePk() + " } ], {}, function() { ajouterLueur($('#rechargerCePaiementGenPage')); }, function() { ajouterErreur($('#rechargerCePaiementGenPage')); }); return false; ").f();
						e("i").a("class", "fas fa-sync-alt ").f().g("i");
					sx("recharger ce paiement");
				} g("button");
			}

			{ e("button")
				.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
				.a("onclick", "$('#postPaiementSiteModale').show(); ")
				.f();
				e("i").a("class", "fas fa-file-plus ").f().g("i");
				sx("Créer un paiement");
			} g("button");
			{ e("div").a("id", "postPaiementSiteModale").a("class", "w3-modal w3-padding-32 ").f();
				{ e("div").a("class", "w3-modal-content ").f();
					{ e("div").a("class", "w3-card-4 ").f();
						{ e("header").a("class", "w3-container w3-green ").f();
							e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#postPaiementSiteModale').hide(); ").f().sx("×").g("span");
							e("h2").a("class", "w3-padding ").f().sx("Créer un paiement").g("h2");
						} g("header");
						{ e("div").a("class", "w3-container ").a("id", "postPaiementSiteFormulaireValeurs").f();
							PaiementSite o = new PaiementSite();
							o.setRequeteSite_(requeteSite_);

							// Form POST
							{ e("div").a("id", "postPaiementSiteForm").f();
								htmlFormPOSTPaiementSite(o);
							} g("div");
							e("button")
								.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-margin w3-green ")
								.a("onclick", "postPaiementSite($('#postPaiementSiteForm')); ")
								.f().sx("Créer un paiement")
							.g("button");

						} g("div");
					} g("div");
				} g("div");
			} g("div");


			{ e("button")
				.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
				.a("onclick", "$('#putimportPaiementSiteModale').show(); ")
				.f();
				e("i").a("class", "fas fa-file-import ").f().g("i");
				sx("Importer paiements");
			} g("button");
			{ e("div").a("id", "putimportPaiementSiteModale").a("class", "w3-modal w3-padding-32 ").f();
				{ e("div").a("class", "w3-modal-content ").f();
					{ e("div").a("class", "w3-card-4 ").f();
						{ e("header").a("class", "w3-container w3-green ").f();
							e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#putimportPaiementSiteModale').hide(); ").f().sx("×").g("span");
							e("h2").a("class", "w3-padding ").f().sx("Importer paiements").g("h2");
						} g("header");
						{ e("div").a("class", "w3-container ").a("id", "putimportPaiementSiteFormulaireValeurs").f();
							PaiementSite o = new PaiementSite();
							o.setRequeteSite_(requeteSite_);

							// Form PUT
							{ e("div").a("id", "putimportPaiementSiteForm").f();
								htmlFormPUTImportPaiementSite(o);
							} g("div");
							e("button")
								.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-margin w3-green ")
								.a("onclick", "putimportPaiementSite($('#putimportPaiementSiteForm')); ")
								.f().sx("Importer paiements")
							.g("button");

						} g("div");
					} g("div");
				} g("div");
			} g("div");


			{ e("button")
				.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
				.a("onclick", "$('#putfusionPaiementSiteModale').show(); ")
				.f();
				e("i").a("class", "fas fa-code-merge ").f().g("i");
				sx("Fusionner paiements");
			} g("button");
			{ e("div").a("id", "putfusionPaiementSiteModale").a("class", "w3-modal w3-padding-32 ").f();
				{ e("div").a("class", "w3-modal-content ").f();
					{ e("div").a("class", "w3-card-4 ").f();
						{ e("header").a("class", "w3-container w3-green ").f();
							e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#putfusionPaiementSiteModale').hide(); ").f().sx("×").g("span");
							e("h2").a("class", "w3-padding ").f().sx("Fusionner paiements").g("h2");
						} g("header");
						{ e("div").a("class", "w3-container ").a("id", "putfusionPaiementSiteFormulaireValeurs").f();
							PaiementSite o = new PaiementSite();
							o.setRequeteSite_(requeteSite_);

							// Form PUT
							{ e("div").a("id", "putfusionPaiementSiteForm").f();
								htmlFormPUTFusionPaiementSite(o);
							} g("div");
							e("button")
								.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-margin w3-green ")
								.a("onclick", "putfusionPaiementSite($('#putfusionPaiementSiteForm')); ")
								.f().sx("Fusionner paiements")
							.g("button");

						} g("div");
					} g("div");
				} g("div");
			} g("div");


			{ e("button")
				.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
				.a("onclick", "$('#putcopiePaiementSiteModale').show(); ")
				.f();
				e("i").a("class", "fas fa-copy ").f().g("i");
				sx("Dupliquer paiements");
			} g("button");
			{ e("div").a("id", "putcopiePaiementSiteModale").a("class", "w3-modal w3-padding-32 ").f();
				{ e("div").a("class", "w3-modal-content ").f();
					{ e("div").a("class", "w3-card-4 ").f();
						{ e("header").a("class", "w3-container w3-green ").f();
							e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#putcopiePaiementSiteModale').hide(); ").f().sx("×").g("span");
							e("h2").a("class", "w3-padding ").f().sx("Dupliquer paiements").g("h2");
						} g("header");
						{ e("div").a("class", "w3-container ").a("id", "putcopiePaiementSiteFormulaireValeurs").f();
							PaiementSite o = new PaiementSite();
							o.setRequeteSite_(requeteSite_);

							// Form PUT
							{ e("div").a("id", "putcopiePaiementSiteForm").f();
								htmlFormPUTCopiePaiementSite(o);
							} g("div");
							e("button")
								.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-margin w3-green ")
								.a("onclick", "putcopiePaiementSite($('#putcopiePaiementSiteForm'), ", paiementSite_ == null ? "null" : paiementSite_.getPk(), "); ")
								.f().sx("Dupliquer paiements")
							.g("button");

						} g("div");
					} g("div");
				} g("div");
			} g("div");


			{ e("button")
				.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
				.a("onclick", "$('#patchPaiementSiteModale').show(); ")
				.f();
				e("i").a("class", "fas fa-edit ").f().g("i");
				sx("Modifier paiements");
			} g("button");
			{ e("div").a("id", "patchPaiementSiteModale").a("class", "w3-modal w3-padding-32 ").f();
				{ e("div").a("class", "w3-modal-content ").f();
					{ e("div").a("class", "w3-card-4 ").f();
						{ e("header").a("class", "w3-container w3-green ").f();
							e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#patchPaiementSiteModale').hide(); ").f().sx("×").g("span");
							e("h2").a("class", "w3-padding ").f().sx("Modifier paiements").g("h2");
						} g("header");
						{ e("div").a("class", "w3-container ").a("id", "patchPaiementSiteFormulaireValeurs").f();
							PaiementSite o = new PaiementSite();
							o.setRequeteSite_(requeteSite_);

							htmlFormPATCHPaiementSite(o);
							e("button")
								.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-margin w3-green ")
								.a("onclick", "patchPaiementSite(null, $('#patchPaiementSiteFormulaireValeurs'), ", Optional.ofNullable(paiementSite_).map(PaiementSite::getPk).map(a -> a.toString()).orElse("null"), ", function() {}, function() {}); ")
								.f().sx("Modifier paiements")
							.g("button");

						} g("div");
					} g("div");
				} g("div");
			} g("div");

			g("div");
		}
		htmlSuggerePaiementGenPage(this, null, listePaiementSite);
	}

	/**
	**/
	public static void htmlSuggerePaiementGenPage(MiseEnPage p, String id, ListeRecherche<PaiementSite> listePaiementSite) {
		RequeteSiteFrFR requeteSite_ = p.getRequeteSite_();
		try {
			OperationRequest operationRequete = requeteSite_.getOperationRequete();
			JsonObject queryParams = Optional.ofNullable(operationRequete).map(OperationRequest::getParams).map(or -> or.getJsonObject("query")).orElse(new JsonObject());
			String q = "*:*";
			String query1 = "objetTexte";
			String query2 = "";
			for(String paramNom : queryParams.fieldNames()) {
				String entiteVar = null;
				String valeurIndexe = null;
				Object paramValeursObjet = queryParams.getValue(paramNom);
				JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

				try {
					for(Object paramObjet : paramObjets) {
						switch(paramNom) {
							case "q":
								q = (String)paramObjet;
								entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
								valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
								query1 = entiteVar.equals("*") ? query1 : entiteVar;
								query2 = valeurIndexe.equals("*") ? "" : valeurIndexe;
						}
					}
				} catch(Exception e) {
					ExceptionUtils.rethrow(e);
				}
			}

			Integer rows1 = Optional.ofNullable(listePaiementSite).map(l -> l.getRows()).orElse(10);
			Integer start1 = Optional.ofNullable(listePaiementSite).map(l -> l.getStart()).orElse(1);
			Integer start2 = start1 - rows1;
			Integer start3 = start1 + rows1;
			Integer rows2 = rows1 / 2;
			Integer rows3 = rows1 * 2;
			start2 = start2 < 0 ? 0 : start2;
			StringBuilder fqs = new StringBuilder();
			for(String fq : Optional.ofNullable(listePaiementSite).map(l -> l.getFilterQueries()).orElse(new String[0])) {
				if(!StringUtils.contains(fq, "(")) {
					String fq1 = StringUtils.substringBefore(fq, "_");
					String fq2 = StringUtils.substringAfter(fq, ":");
					if(!StringUtils.startsWithAny(fq, "classeNomsCanoniques_", "archive_", "supprime_", "sessionId", "utilisateurCles"))
						fqs.append("&fq=").append(fq1).append(":").append(fq2);
				}
			}
			StringBuilder sorts = new StringBuilder();
			for(SortClause sort : Optional.ofNullable(listePaiementSite).map(l -> l.getSorts()).orElse(Arrays.asList())) {
				sorts.append("&sort=").append(StringUtils.substringBefore(sort.getItem(), "_")).append(" ").append(sort.getOrder().name());
			}

			if(
					CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRessource(), PaiementGenPage.ROLES)
					|| CollectionUtils.containsAny(requeteSite_.getUtilisateurRolesRoyaume(), PaiementGenPage.ROLES)
					) {
					{ p.e("div").a("class", "").f();
						{ p.e("button").a("id", "rechargerTousPaiementGenPage", id).a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ").a("onclick", "patchPaiementSiteVals([], {}, function() { ajouterLueur($('#rechargerTousPaiementGenPage", id, "')); }, function() { ajouterErreur($('#rechargerTousPaiementGenPage", id, "')); }); ").f();
							p.e("i").a("class", "fas fa-sync-alt ").f().g("i");
							p.sx("recharger tous les paiements");
						} p.g("button");
					} p.g("div");
			}
			{ p.e("div").a("class", "w3-cell-row ").f();
				{ p.e("div").a("class", "w3-cell ").f();
					{ p.e("span").f();
						p.sx("rechercher paiements : ");
					} p.g("span");
				} p.g("div");
			} p.g("div");
			{ p.e("div").a("class", "w3-bar ").f();

				p.e("input")
					.a("type", "text")
					.a("placeholder", "rechercher paiements")
					.a("class", "suggerePaiementSite w3-input w3-border w3-bar-item ")
					.a("name", "suggerePaiementSite")
					.a("id", "suggerePaiementSite", id)
					.a("autocomplete", "off")
					.a("oninput", "suggerePaiementSiteObjetSuggere( [ { 'name': 'q', 'value': 'objetSuggere:' + $(this).val() }, { 'name': 'rows', 'value': '10' }, { 'name': 'fl', 'value': 'pk,pageUrlPk,paiementNomComplet' } ], $('#suggereListPaiementSite", id, "'), ", p.getRequeteSite_().getRequetePk(), "); ")
					.a("onkeyup", "if (event.keyCode === 13) { event.preventDefault(); window.location.href = '/paiement?q=", query1, ":' + encodeURIComponent(this.value) + '", fqs, sorts, "&start=", start2, "&rows=", rows1, "'; }"); 
				if(listePaiementSite != null)
					p.a("value", query2);
				p.fg();
				{ p.e("button")
					.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
					.a("onclick", "window.location.href = '/paiement?q=", query1, ":' + encodeURIComponent(this.previousElementSibling.value) + '", fqs, sorts, "&start=", start2, "&rows=", rows1, "'; ") 
					.f();
					p.e("i").a("class", "fas fa-search ").f().g("i");
				} p.g("button");

			} p.g("div");
			{ p.e("div").a("class", "w3-cell-row ").f();
				{ p.e("div").a("class", "w3-cell w3-left-align w3-cell-top ").f();
					{ p.e("ul").a("class", "w3-ul w3-hoverable ").a("id", "suggereListPaiementSite", id).f();
					} p.g("ul");
				} p.g("div");
			} p.g("div");
			{ p.e("div").a("class", "").f();
				{ p.e("a").a("href", "/paiement").a("class", "").f();
					p.e("i").a("class", "fas fa-search-dollar ").f().g("i");
					p.sx("voir tous les paiements");
				} p.g("a");
			} p.g("div");
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

}
