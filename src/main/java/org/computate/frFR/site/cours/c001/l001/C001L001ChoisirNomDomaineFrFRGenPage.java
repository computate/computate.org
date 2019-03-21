package org.computate.frFR.site.cours.c001.l001;

import java.lang.String;
import org.computate.frFR.site.page.parti.PageParagraphe;
import org.computate.frFR.site.page.parti.QuestionReponse;
import org.computate.frFR.site.cours.c001.C001LeconFrFRPage;
import org.computate.frFR.site.config.ConfigSite;
import org.computate.frFR.site.requete.RequeteSiteFrFR;
import org.computate.frFR.site.contexte.SiteContexteFrFR;
import org.computate.frFR.site.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.frFR.site.recherche.ListeRecherche;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.page.MiseEnPage;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * Traduire: false
 **/
public class C001L001ChoisirNomDomaineFrFRGenPage extends C001L001ChoisirNomDomaineFrFRGenPageGen<C001LeconFrFRPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeC001L001ChoisirNomDomaine(Couverture<ListeRecherche<C001L001ChoisirNomDomaine>> c) {
	}

	protected void _c001L001ChoisirNomDomaine(Couverture<C001L001ChoisirNomDomaine> c) {
		if(listeC001L001ChoisirNomDomaine.size() == 1)
			c.o(listeC001L001ChoisirNomDomaine.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null)
			c.o("Quel est l'étape première pour créer mon propre site Web ? ");
		else if(listeC001L001ChoisirNomDomaine.size() == 0)
			c.o("");
		else
			c.o("Quel est l'étape première pour créer mon propre site Web ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Choisir un nom de domaine. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null)
			c.o("le leçon");
		else if(listeC001L001ChoisirNomDomaine.size() == 0)
			c.o("");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinC001L001ChoisirNomDomaineFrFRGenPage() {
		initC001L001ChoisirNomDomaineFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L001ChoisirNomDomaineFrFRGenPage() {
		e("script").a("src", "/static/js/C001L001ChoisirNomDomaineFrFRGenPage.js").f().g("script");
	}

	@Override public void htmlScriptC001L001ChoisirNomDomaineFrFRGenPage() {
	}

	public void htmlFormPageC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "coursNumeroForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_coursNumero").a("class", "").f().sx("cours numéro").g("label");

					e("input")
						.a("type", "text")
						.a("placeholder", "cours numéro")
						.a("class", "setCoursNumero w3-input w3-border ")
						.a("name", "setCoursNumero")
						.a("id", "Page_coursNumero")
						.a("onchange", "patchC001L001ChoisirNomDomaine($('#C001L001ChoisirNomDomaineForm'), $('#coursNumeroForm')); ")
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
						.a("onchange", "patchC001L001ChoisirNomDomaine($('#C001L001ChoisirNomDomaineForm'), $('#coursDescriptionForm')); ")
						.a("value", o.strCoursDescription())
					.fg();

				} g("form");
			} g("div");
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
						.a("onchange", "patchC001L001ChoisirNomDomaine($('#C001L001ChoisirNomDomaineForm'), $('#supprimeForm')); ")
						;
						if(o.getSupprime() != null && o.getSupprime())
							a("checked", "checked");
					fg();

					e("label").a("for", "Page_supprime").a("class", "").f().sx("Supprimé").g("label");
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
						.a("onchange", "patchC001L001ChoisirNomDomaine($('#C001L001ChoisirNomDomaineForm'), $('#creeForm')); ")
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
						.a("onchange", "patchC001L001ChoisirNomDomaine($('#C001L001ChoisirNomDomaineForm'), $('#modifieForm')); ")
						.a("value", o.strModifie())
					.fg();
				} g("form");
			} g("div");
		} g("div");
	}

	public void htmlFormPOSTC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
		{ e("div").a("class", "w3-cell-row ").f();
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

	public void htmlFormPATCHC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
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

	public void htmlFormRechercheC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
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

	@Override public void htmlBodyC001L001ChoisirNomDomaineFrFRGenPage() {

		if(listeC001L001ChoisirNomDomaine.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeC001L001ChoisirNomDomaine.size() == 1) {
			// le leçon
			C001L001ChoisirNomDomaine o = listeC001L001ChoisirNomDomaine.first();

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
					{ e("form").a("id", "C001L001ChoisirNomDomaineForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageC001L001ChoisirNomDomaine(o);
				}

				o.htmlBody();

			} g("div");
		} else {
			// plusiers lessons

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("lessons").g("i");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("cours numéro").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeC001L001ChoisirNomDomaine.size(); i++) {
						C001L001ChoisirNomDomaine o = listeC001L001ChoisirNomDomaine.getList().get(i);
						String uri = "/frFR/cours/001/001-choisir-nom-domaine/" + o.getPk();
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
