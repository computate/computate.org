package org.computate.site.frFR.utilisateur;

import java.util.List;
import java.lang.Long;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import java.lang.String;
import java.lang.Boolean;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import org.computate.site.frFR.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.MiseEnPage;
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


/**
 * Traduire: false
 **/
public class UtilisateurSiteFrFRGenPage extends UtilisateurSiteFrFRGenPageGen<ArticleFrFRPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeUtilisateurSite(Couverture<ListeRecherche<UtilisateurSite>> c) {
	}

	protected void _utilisateurSite(Couverture<UtilisateurSite> c) {
		if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1)
			c.o(listeUtilisateurSite.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o("");
		else if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0)
			c.o("");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o("");
		else if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0)
			c.o("");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/utilisateur");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/user");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/utilisateur-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(616);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinUtilisateurSiteFrFRGenPage() {
		initUtilisateurSiteFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsUtilisateurSiteFrFRGenPage() {
		e("script").a("src", "/static/js/UtilisateurSiteFrFRGenPage.js").f().g("script");
	}

	@Override public void htmlScriptUtilisateurSiteFrFRGenPage() {
	}

	public void htmlFormPageUtilisateurSite(UtilisateurSite o) {
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
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#supprimeForm')); ")
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
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#creeForm')); ")
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
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#modifieForm')); ")
						.a("value", o.strModifie())
					.fg();
				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "voirArchiveForm").a("style", "display: inline-block; ").f();
					e("input")
						.a("type", "hidden")
						.a("name", "voirArchive")
						.a("id", "Page_voirArchive")
						.a("value", "false")
					.fg();

					e("input")
						.a("type", "checkbox")
						.a("value", "true")
						.a("class", "setVoirArchive")
						.a("name", "setVoirArchive")
						.a("id", "Page_voirArchive")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#voirArchiveForm')); ")
						;
						if(o.getVoirArchive() != null && o.getVoirArchive())
							a("checked", "checked");
					fg();

					e("label").a("for", "Page_voirArchive").a("class", "").f().sx("voir archivé").g("label");
				} g("form");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("id", "voirSupprimeForm").a("style", "display: inline-block; ").f();
					e("input")
						.a("type", "hidden")
						.a("name", "voirSupprime")
						.a("id", "Page_voirSupprime")
						.a("value", "false")
					.fg();

					e("input")
						.a("type", "checkbox")
						.a("value", "true")
						.a("class", "setVoirSupprime")
						.a("name", "setVoirSupprime")
						.a("id", "Page_voirSupprime")
						.a("onchange", "patchUtilisateurSite($('#UtilisateurSiteForm'), $('#voirSupprimeForm')); ")
						;
						if(o.getVoirSupprime() != null && o.getVoirSupprime())
							a("checked", "checked");
					fg();

					e("label").a("for", "Page_voirSupprime").a("class", "").f().sx("voir supprimé").g("label");
				} g("form");
			} g("div");
		} g("div");
	}

	public void htmlFormPOSTUtilisateurSite(UtilisateurSite o) {
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
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "voirArchive")
					.a("id", "POST_voirArchive")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "valeurVoirArchive")
					.a("name", "voirArchive")
					.a("id", "POST_voirArchive")
					;
					if(o.getVoirArchive() != null && o.getVoirArchive())
						a("checked", "checked");
				fg();

				e("label").a("for", "POST_voirArchive").a("class", "").f().sx("voir archivé").g("label");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "voirSupprime")
					.a("id", "POST_voirSupprime")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "valeurVoirSupprime")
					.a("name", "voirSupprime")
					.a("id", "POST_voirSupprime")
					;
					if(o.getVoirSupprime() != null && o.getVoirSupprime())
						a("checked", "checked");
				fg();

				e("label").a("for", "POST_voirSupprime").a("class", "").f().sx("voir supprimé").g("label");
			} g("div");
		} g("div");
	}

	public void htmlFormPATCHUtilisateurSite(UtilisateurSite o) {
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
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "voirArchive")
					.a("id", "PATCH_voirArchive")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "setVoirArchive")
					.a("name", "setVoirArchive")
					.a("id", "PATCH_voirArchive")
					;
					if(o.getVoirArchive() != null && o.getVoirArchive())
						a("checked", "checked");
				fg();

				e("label").a("for", "PATCH_voirArchive").a("class", "").f().sx("voir archivé").g("label");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "voirSupprime")
					.a("id", "PATCH_voirSupprime")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "setVoirSupprime")
					.a("name", "setVoirSupprime")
					.a("id", "PATCH_voirSupprime")
					;
					if(o.getVoirSupprime() != null && o.getVoirSupprime())
						a("checked", "checked");
				fg();

				e("label").a("for", "PATCH_voirSupprime").a("class", "").f().sx("voir supprimé").g("label");
			} g("div");
		} g("div");
	}

	public void htmlFormRechercheUtilisateurSite(UtilisateurSite o) {
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
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "voirArchive")
					.a("id", "Recherche_voirArchive")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "valeurVoirArchive")
					.a("name", "voirArchive")
					.a("id", "Recherche_voirArchive")
					;
					if(o.getVoirArchive() != null && o.getVoirArchive())
						a("checked", "checked");
				fg();

				e("label").a("for", "Recherche_voirArchive").a("class", "").f().sx("voir archivé").g("label");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "voirSupprime")
					.a("id", "Recherche_voirSupprime")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("value", "true")
					.a("class", "valeurVoirSupprime")
					.a("name", "voirSupprime")
					.a("id", "Recherche_voirSupprime")
					;
					if(o.getVoirSupprime() != null && o.getVoirSupprime())
						a("checked", "checked");
				fg();

				e("label").a("for", "Recherche_voirSupprime").a("class", "").f().sx("voir supprimé").g("label");
			} g("div");
		} g("div");
	}

	@Override public void htmlBodyUtilisateurSiteFrFRGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeUtilisateurSite == null || listeUtilisateurSite.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			// 
			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
					e("span").a("class", " ").f().sx("").g("span");
				} g("h1");
			}
		} else {
			// plusiers 

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					Map<String, Map<String, List<String>>> highlighting = listeUtilisateurSite.getQueryResponse().getHighlighting();
					for(int i = 0; i < listeUtilisateurSite.size(); i++) {
						UtilisateurSite o = listeUtilisateurSite.getList().get(i);
						Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
						List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
						String uri = "/frFR/utilisateur/" + o.getPk();
						{ e("tr").f();
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}

		if(listeUtilisateurSite != null && listeUtilisateurSite.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			UtilisateurSite o = listeUtilisateurSite.first();

			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show w3-white ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "UtilisateurSiteForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageUtilisateurSite(o);
				}

				o.htmlBody();

			} g("div");
		}
		e("div").f();

		g("div");
	}

}
