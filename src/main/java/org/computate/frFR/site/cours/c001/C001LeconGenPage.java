package org.computate.frFR.site.cours.c001;

import io.vertx.core.http.HttpServerRequest;
import org.computate.frFR.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.io.IOException;
import org.computate.frFR.site.utilisateur.UtilisateurSite;
import java.lang.Integer;
import org.computate.frFR.site.page.MiseEnPage;
import java.util.ArrayList;
import org.computate.frFR.site.recherche.ListeRecherche;
import org.apache.solr.common.SolrDocument;
import org.computate.frFR.site.couverture.Couverture;
import java.util.Locale;
import io.vertx.core.http.HttpServerResponse;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.lang.Boolean;
import org.computate.frFR.site.requete.RequeteSite;
import org.computate.frFR.site.config.ConfigSite;
import org.computate.frFR.site.cours.c001.C001Page;


public class C001LeconGenPage extends C001LeconGenPageGen<MiseEnPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeC001Lecon(Couverture<ListeRecherche<C001Lecon>> c) {
	}

	protected void _c001Lecon(Couverture<C001Lecon> c) {
		if(listeC001Lecon.size() == 1)
			c.o(listeC001Lecon.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001Lecon != null && c001Lecon.getPageH1() != null)
			c.o(c001Lecon.getPageH1());
		else if(c001Lecon != null)
			c.o("un leçon");
		else if(listeC001Lecon.size() == 0)
			c.o("aucun leçon trouvé");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		if(c001Lecon != null && c001Lecon.getPageH2() != null)
			c.o(c001Lecon.getPageH2());
	}

	@Override protected void _pageH3(Couverture<String> c) {
		if(c001Lecon != null && c001Lecon.getPageH3() != null)
			c.o(c001Lecon.getPageH3());
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001Lecon != null && c001Lecon.getPageTitre() != null)
			c.o(c001Lecon.getPageTitre());
		else if(c001Lecon != null)
			c.o("un leçon");
		else if(listeC001Lecon.size() == 0)
			c.o("aucun leçon trouvé");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinC001LeconGenPage() {
		initC001LeconGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001LeconGenPage() {
		e("script").a("src", "/static/js/C001LeconPage.js").f().g("script");
	}

	@Override public void htmlScriptC001LeconGenPage() {
	}

	public void htmlFormC001Lecon(C001Lecon o) {
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("input")
					.a("type", "hidden")
					.a("name", "supprime")
					.a("value", "false")
				.fg();

				e("input")
					.a("type", "checkbox")
					.a("class", "valeurSupprime")
					.a("name", "supprime")
					.a("value", "true")
					.a("onchange", "envoyer(); ");
					if(o.getSupprime() != null && o.getSupprime())
						a("checked", "checked");
				fg();

				e("label").a("class", "").f().sx("Supprimé").g("label");
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("class", "").f().sx("cours numéro").g("label");

				e("input")
							.a("type", "text")
					.a("class", "valeurCoursNumero")
					.a("name", "coursNumero")
					.a("class", "w3-input w3-border ")
					.a("placeholder", "cours numéro")
					.a("onchange", "envoyer(); ")
				.fg();

			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				e("label").a("class", "").f().sx("description").g("label");

				e("input")
							.a("type", "text")
					.a("class", "valeurCoursDescription")
					.a("name", "coursDescription")
					.a("class", "w3-input w3-border ")
					.a("placeholder", "description")
					.a("onchange", "envoyer(); ")
				.fg();

			} g("div");
		} g("div");
		{ e("div").a("class", "w3-cell-row ").f();
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getCree();

				e("label").a("class", "").f().sx("Crée").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD/MM/YYYY")
					.a("data-timeformat", "DD/MM/YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure créées.  (DD/MM/YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD/MM/YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "valeurCree")
					.a("name", "cree")
					.a("onchange", "envoyer(); ")
					.a("value", o.strCree())
				.fg();
			} g("div");
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				LocalDateTime val = o.getModifie();

				e("label").a("class", "").f().sx("Modifié").g("label");
				e("input")
					.a("type", "text")
					.a("class", "w3-input w3-border datepicker ")
					.a("placeholder", "DD/MM/YYYY")
					.a("data-timeformat", "DD/MM/YYYY")
					.a("onclick", "enleverLueur($(this)); ")
					.a("title", "La date et l'heure modifiéés.  (DD/MM/YYYY)")
					.a("value", val == null ? "" : DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.forLanguageTag("fr-FR")).format(val))
					.a("onchange", "var t = moment(this.value, 'DD/MM/YYYY'); if(t) { var s = t.format('YYYY-MM-DD'); $(this).next().val(s); $(this).next().trigger('change'); } ")
					.fg();
				e("input")
					.a("type", "hidden")
					.a("class", "valeurModifie")
					.a("name", "modifie")
					.a("onchange", "envoyer(); ")
					.a("value", o.strModifie())
				.fg();
			} g("div");
		} g("div");
	}

	@Override public void htmlBodyC001LeconGenPage() {

		if(listeC001Lecon.size() == 0) {
			//aucun leçon trouvé

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("aucun leçon trouvé").g("span");
			} g("h1");
		} else if(listeC001Lecon.size() == 1) {
			// un leçon
			C001Lecon o = listeC001Lecon.first();

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

				htmlFormC001Lecon(o);

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
					for(int i = 0; i < listeC001Lecon.size(); i++) {
						C001Lecon o = listeC001Lecon.getList().get(i);
						{ e("tr").f();
							{ e("td").f();
								sx(o.getCoursNumero());
							} g("td");
							{ e("td").f();
								sx(o.getCoursDescription());
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
