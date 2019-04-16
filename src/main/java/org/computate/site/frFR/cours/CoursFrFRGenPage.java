package org.computate.site.frFR.cours;

import java.lang.String;
import org.computate.site.frFR.page.MiseEnPage;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.couverture.Couverture;
import java.time.LocalDateTime;
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


/**
 * Traduire: false
 **/
public class CoursFrFRGenPage extends CoursFrFRGenPageGen<MiseEnPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeCours(Couverture<ListeRecherche<Cours>> c) {
	}

	protected void _cours(Couverture<Cours> c) {
		if(listeCours != null && listeCours.size() == 1)
			c.o(listeCours.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(cours != null)
			c.o("un cours");
		else if(listeCours == null || listeCours.size() == 0)
			c.o("aucun cours trouvé");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(cours != null)
			c.o("");
		else if(listeCours == null || listeCours.size() == 0)
			c.o("aucun cours trouvé");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/frFR/cours-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinCoursFrFRGenPage() {
		initCoursFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsCoursFrFRGenPage() {
		e("script").a("src", "/static/js/CoursFrFRGenPage.js").f().g("script");
	}

	@Override public void htmlScriptCoursFrFRGenPage() {
	}

	public void htmlFormPageCours(Cours o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "supprimeForm").a("style", "display: inline-block; ").f();
					e("input")
						.a("type", "hidden")
						.a("name", "supprime")
						.a("id", "Page_supprime")
						.a("value", "false")
					.fg();

					e("input")
						.a("type", "checkbox")
						.a("value", "true")
						.a("class", "setSupprime")
						.a("name", "setSupprime")
						.a("id", "Page_supprime")
						.a("onchange", "patchCours($('#CoursForm'), $('#supprimeForm')); ")
						;
						if(o.getSupprime() != null && o.getSupprime())
							a("checked", "checked");
					fg();

					e("label").a("for", "Page_supprime").a("class", "").f().sx("Supprimé").g("label");
				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "coursNumeroForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_coursNumero").a("class", "").f().sx("cours").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "cours")
						.a("class", "setCoursNumero w3-input w3-border ")
						.a("name", "setCoursNumero")
						.a("id", "Page_coursNumero")
						.a("onchange", "patchCours($('#CoursForm'), $('#coursNumeroForm')); ")
						.a("value", o.strCoursNumero())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "leconDescriptionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_leconDescription").a("class", "").f().sx("description").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "description")
						.a("class", "setLeconDescription w3-input w3-border ")
						.a("name", "setLeconDescription")
						.a("id", "Page_leconDescription")
						.a("onchange", "patchCours($('#CoursForm'), $('#leconDescriptionForm')); ")
						.a("value", o.strLeconDescription())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "articleDescriptionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_articleDescription").a("class", "").f().sx("description").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "description")
						.a("class", "setArticleDescription w3-input w3-border ")
						.a("name", "setArticleDescription")
						.a("id", "Page_articleDescription")
						.a("onchange", "patchCours($('#CoursForm'), $('#articleDescriptionForm')); ")
						.a("value", o.strArticleDescription())
					.fg();

				} g("form");
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "creeForm").a("style", "display: inline-block; ").f();
					LocalDateTime val = o.getCree();

					e("label").a("for", "Page_cree").a("class", "").f().sx("Crée").g("label");
					e("input")
						.a("type", "text")
						.a("class", "w3-input w3-border datepicker ")
						.a("placeholder", "DD-MM-YYYY")
						.a("data-timeformat", "DD-MM-YYYY")
						.a("onclick", "enleverLueur($(this)); ")
						.a("title", "La date et l'heure créées.  (DD-MM-YYYY)")
						.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
						.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
						.fg();
					e("input")
						.a("type", "hidden")
						.a("class", "setCree")
						.a("name", "setCree")
						.a("id", "Page_cree")
						.a("onchange", "patchCours($('#CoursForm'), $('#creeForm')); ")
						.a("value", o.strCree())
					.fg();
				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "modifieForm").a("style", "display: inline-block; ").f();
					LocalDateTime val = o.getModifie();

					e("label").a("for", "Page_modifie").a("class", "").f().sx("Modifié").g("label");
					e("input")
						.a("type", "text")
						.a("class", "w3-input w3-border datepicker ")
						.a("placeholder", "DD-MM-YYYY")
						.a("data-timeformat", "DD-MM-YYYY")
						.a("onclick", "enleverLueur($(this)); ")
						.a("title", "La date et l'heure modifiéés.  (DD-MM-YYYY)")
						.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
						.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
						.fg();
					e("input")
						.a("type", "hidden")
						.a("class", "setModifie")
						.a("name", "setModifie")
						.a("id", "Page_modifie")
						.a("onchange", "patchCours($('#CoursForm'), $('#modifieForm')); ")
						.a("value", o.strModifie())
					.fg();
				} g("form");
			} g("div");
		} g("div");
	}

	public void htmlFormPOSTCours(Cours o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "supprime")
					.a("id", "POST_supprime")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "valeurSupprime")
					.a("name", "supprime")
					.a("id", "POST_supprime")
					;
					if(o.getSupprime() != null && o.getSupprime())
						a("checked", "checked");
				fg();

				e("label").a("for", "POST_supprime").a("class", "").f().sx("Supprimé").g("label");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_coursNumero").a("class", "").f().sx("cours").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "cours")
					.a("class", "valeurCoursNumero w3-input w3-border ")
					.a("name", "coursNumero")
					.a("id", "POST_coursNumero")
					.a("value", o.strCoursNumero())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_leconDescription").a("class", "").f().sx("description").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "description")
					.a("class", "valeurLeconDescription w3-input w3-border ")
					.a("name", "leconDescription")
					.a("id", "POST_leconDescription")
					.a("value", o.strLeconDescription())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_articleDescription").a("class", "").f().sx("description").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "description")
					.a("class", "valeurArticleDescription w3-input w3-border ")
					.a("name", "articleDescription")
					.a("id", "POST_articleDescription")
					.a("value", o.strArticleDescription())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getCree();

				e("label").a("for", "POST_cree").a("class", "").f().sx("Crée").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD-MM-YYYY")
					.a("data-timeformat", "DD-MM-YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure créées.  (DD-MM-YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "valeurCree")
					.a("name", "cree")
					.a("id", "POST_cree")
					.a("value", o.strCree())
				.fg();
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getModifie();

				e("label").a("for", "POST_modifie").a("class", "").f().sx("Modifié").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD-MM-YYYY")
					.a("data-timeformat", "DD-MM-YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure modifiéés.  (DD-MM-YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "valeurModifie")
					.a("name", "modifie")
					.a("id", "POST_modifie")
					.a("value", o.strModifie())
				.fg();
			} g("div");
		} g("div");
	}

	public void htmlFormPATCHCours(Cours o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_coursNumero").a("class", "").f().sx("cours").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "cours")
					.a("class", "setCoursNumero w3-input w3-border ")
					.a("name", "setCoursNumero")
					.a("id", "PATCH_coursNumero")
					.a("value", o.strCoursNumero())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getCree();

				e("label").a("for", "PATCH_cree").a("class", "").f().sx("Crée").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD-MM-YYYY")
					.a("data-timeformat", "DD-MM-YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure créées.  (DD-MM-YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "setCree")
					.a("name", "setCree")
					.a("id", "PATCH_cree")
					.a("value", o.strCree())
				.fg();
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getModifie();

				e("label").a("for", "PATCH_modifie").a("class", "").f().sx("Modifié").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD-MM-YYYY")
					.a("data-timeformat", "DD-MM-YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure modifiéés.  (DD-MM-YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "setModifie")
					.a("name", "setModifie")
					.a("id", "PATCH_modifie")
					.a("value", o.strModifie())
				.fg();
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_leconNumero").a("class", "").f().sx("leçon").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "leçon")
					.a("class", "setLeconNumero w3-input w3-border ")
					.a("name", "setLeconNumero")
					.a("id", "PATCH_leconNumero")
					.a("value", o.strLeconNumero())
				.fg();

			} g("div");
		} g("div");
	}

	public void htmlFormRechercheCours(Cours o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_coursNumero").a("class", "").f().sx("cours").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "cours")
					.a("class", "valeurCoursNumero w3-input w3-border ")
					.a("name", "coursNumero")
					.a("id", "Recherche_coursNumero")
					.a("value", o.strCoursNumero())
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getCree();

				e("label").a("for", "Recherche_cree").a("class", "").f().sx("Crée").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD-MM-YYYY")
					.a("data-timeformat", "DD-MM-YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure créées.  (DD-MM-YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "valeurCree")
					.a("name", "cree")
					.a("id", "Recherche_cree")
					.a("value", o.strCree())
				.fg();
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getModifie();

				e("label").a("for", "Recherche_modifie").a("class", "").f().sx("Modifié").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD-MM-YYYY")
					.a("data-timeformat", "DD-MM-YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure modifiéés.  (DD-MM-YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD-MM-YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "valeurModifie")
					.a("name", "modifie")
					.a("id", "Recherche_modifie")
					.a("value", o.strModifie())
				.fg();
			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_leconNumero").a("class", "").f().sx("leçon").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "leçon")
					.a("class", "valeurLeconNumero w3-input w3-border ")
					.a("name", "leconNumero")
					.a("id", "Recherche_leconNumero")
					.a("value", o.strLeconNumero())
				.fg();

			} g("div");
		} g("div");
	}

	@Override public void htmlBodyCoursFrFRGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeCours == null || listeCours.size() == 0) {
			//aucun cours trouvé

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("aucun cours trouvé").g("span");
			} g("h1");
		} else if(listeCours != null && listeCours.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			// un cours
			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx(pageH1).g("span");
				} g("h1");
			}
			if(pageH2 != null) {
				{ e("h2").f();
					e("span").a("class", " ").f().sx(pageH2).g("span");
				} g("h2");
			}
			if(pageH3 != null) {
				{ e("h3").f();
					e("span").a("class", " ").f().sx(pageH3).g("span");
				} g("h3");
			}
		} else {
			// plusiers cours

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("cours").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("cours").g("th");
						e("th").f().sx("leçon").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					Map<String, Map<String, List<String>>> highlighting = listeCours.getQueryResponse().getHighlighting();
					for(int i = 0; i < listeCours.size(); i++) {
						Cours o = listeCours.getList().get(i);
						Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
						List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
						String uri = o.getPageUri();
						{ e("tr").f();
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getCoursNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getLeconNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getArticleDescription());
								} g("a");
								if(highlightList != null) {
									{ e("div").a("class", "site-highlight ").f();
										s(StringUtils.join(highlightList, " ... "));
									} g("div");
								}
							} g("td");
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}

		{ e("div").a("class", "").f();
			{ e("form").a("id", "CoursForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/frFR/cours").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_frFR')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "rechercher cours")
						.a("title", "")
						.a("class", "recherchePageRecherche_frFR w3-input w3-border w3-bar-item ")
						.a("name", "pageRecherche_frFR")
						.a("id", "recherchePageRecherche_frFR");
					operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
						String entiteVar = null;
						String valeurIndexe = null;
						String paramNom = paramRequete.getKey();
						Object paramValeursObjet = paramRequete.getValue();
						JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

						try {
							for(Object paramObjet : paramObjets) {
								switch(paramNom) {
									case "q":
										entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
										valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
										if("pageRecherche_frFR".equals(entiteVar))
											a("value", URLDecoder.decode(valeurIndexe, "UTF-8"));
								}
							}
						} catch(Exception e) {
							ExceptionUtils.rethrow(e);
						}
					});
					fg();
					{ e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
						.f();
						e("i").a("class", "fas fa-search ").f().g("i");
					} g("button");
				} g("div");
			} g("form");
		} g("div");

		if(listeCours != null && listeCours.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			Cours o = listeCours.first();

			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show w3-white ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "CoursForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageCours(o);
				}

				o.htmlBody();

			} g("div");
		}
		e("div").f();

		g("div");
	}

}
