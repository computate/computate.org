package org.computate.frFR.site.cours;

import io.vertx.core.http.HttpServerRequest;
import org.computate.frFR.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.computate.frFR.site.page.parti.PagePart;
import java.io.IOException;
import org.computate.frFR.site.utilisateur.UtilisateurSite;
import java.lang.Integer;
import org.computate.frFR.site.page.MiseEnPage;
import org.computate.frFR.site.recherche.ListeRecherche;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.frFR.site.couverture.Couverture;
import java.util.Locale;
import io.vertx.core.http.HttpServerResponse;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.lang.Boolean;
import org.computate.frFR.site.requete.RequeteSite;
import java.lang.String;
import org.computate.frFR.site.config.ConfigSite;


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
		if(listeCours.size() == 1)
			c.o(listeCours.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(cours != null)
			c.o("un cours");
		else if(listeCours.size() == 0)
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
			c.o("un cours");
		else if(listeCours.size() == 0)
			c.o("aucun cours trouvé");
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
					e("label").a("for", "Page_coursNumero").a("class", "").f().sx("cours numéro").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "cours numéro")
						.a("class", "setCoursNumero w3-input w3-border ")
						.a("name", "setCoursNumero")
						.a("id", "Page_coursNumero")
						.a("onchange", "patchCours($('#CoursForm'), $('#coursNumeroForm')); ")
						.a("value", o.strCoursNumero())
					.fg();

				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "coursDescriptionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_coursDescription").a("class", "").f().sx("description").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "description")
						.a("class", "setCoursDescription w3-input w3-border ")
						.a("name", "setCoursDescription")
						.a("id", "Page_coursDescription")
						.a("onchange", "patchCours($('#CoursForm'), $('#coursDescriptionForm')); ")
						.a("value", o.strCoursDescription())
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
				e("label").a("for", "POST_coursNumero").a("class", "").f().sx("cours numéro").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "cours numéro")
					.a("class", "valeurCoursNumero w3-input w3-border ")
					.a("name", "coursNumero")
					.a("id", "POST_coursNumero")
					.a("value", o.strCoursNumero())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "POST_coursDescription").a("class", "").f().sx("description").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "description")
					.a("class", "valeurCoursDescription w3-input w3-border ")
					.a("name", "coursDescription")
					.a("id", "POST_coursDescription")
					.a("value", o.strCoursDescription())
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
				e("label").a("for", "PATCH_coursNumero").a("class", "").f().sx("cours numéro").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "cours numéro")
					.a("class", "setCoursNumero w3-input w3-border ")
					.a("name", "setCoursNumero")
					.a("id", "PATCH_coursNumero")
					.a("value", o.strCoursNumero())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "PATCH_coursDescription").a("class", "").f().sx("description").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "description")
					.a("class", "setCoursDescription w3-input w3-border ")
					.a("name", "setCoursDescription")
					.a("id", "PATCH_coursDescription")
					.a("value", o.strCoursDescription())
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
	}

	public void htmlFormRechercheCours(Cours o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_coursNumero").a("class", "").f().sx("cours numéro").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "cours numéro")
					.a("class", "valeurCoursNumero w3-input w3-border ")
					.a("name", "coursNumero")
					.a("id", "Recherche_coursNumero")
					.a("value", o.strCoursNumero())
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("for", "Recherche_coursDescription").a("class", "").f().sx("description").g("label");

				e("input")
					.a("type", "text")
					.a("placeholder", "description")
					.a("class", "valeurCoursDescription w3-input w3-border ")
					.a("name", "coursDescription")
					.a("id", "Recherche_coursDescription")
					.a("value", o.strCoursDescription())
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
	}

	@Override public void htmlBodyCoursFrFRGenPage() {

		if(listeCours.size() == 0) {
			//aucun cours trouvé

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("aucun cours trouvé").g("span");
			} g("h1");
		} else if(listeCours.size() == 1) {
			// un cours
			Cours o = listeCours.first();

			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
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
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show ").f();

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
		} else {
			// plusiers cours

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("cours").g("i");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("cours numéro").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeCours.size(); i++) {
						Cours o = listeCours.getList().get(i);
						String uri = "/frFR/cours/" + o.getPk();
						{ e("tr").f();
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getCoursNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getCoursDescription());
								} g("a");
							} g("td");
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}
		e("div").f();

		g("div");
	}
}
