package org.computate.frFR.site.cours.c001;

import io.vertx.core.http.HttpServerRequest;
import org.computate.frFR.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.io.IOException;
import org.computate.frFR.site.utilisateur.UtilisateurSite;
import org.computate.frFR.site.page.MiseEnPage;
import org.computate.frFR.site.recherche.ListeRecherche;
import org.computate.frFR.site.cours.CoursPage;
import org.computate.frFR.site.couverture.Couverture;
import io.vertx.core.http.HttpServerResponse;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.computate.frFR.site.requete.RequeteSite;
import org.computate.frFR.site.config.ConfigSite;


public class C001GenPage extends C001GenPageGen<MiseEnPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeC001(Couverture<ListeRecherche<C001>> c) {
	}

	protected void _c001(Couverture<C001> c) {
		if(listeC001.size() == 1)
			c.o(listeC001.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001 != null && c001.getPageH1() != null)
			c.o(c001.getPageH1());
		else if(c001 != null)
			c.o("un cours n ° 1");
		else if(listeC001.size() == 0)
			c.o("aucun cours n ° 1 trouvé");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		if(c001 != null && c001.getPageH2() != null)
			c.o(c001.getPageH2());
	}

	@Override protected void _pageH3(Couverture<String> c) {
		if(c001 != null && c001.getPageH3() != null)
			c.o(c001.getPageH3());
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001 != null && c001.getPageTitre() != null)
			c.o(c001.getPageTitre());
		else if(c001 != null)
			c.o("un cours n ° 1");
		else if(listeC001.size() == 0)
			c.o("aucun cours n ° 1 trouvé");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinC001GenPage() {
		initC001GenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001GenPage() {
		e("script").a("src", "/static/js/C001Page.js").f().g("script");
	}

	@Override public void htmlScriptC001GenPage() {
	}

	public void htmlFormC001(C001 o) {
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

	@Override public void htmlBodyC001GenPage() {

		if(listeC001.size() == 0) {
			//aucun cours n ° 1 trouvé

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("aucun cours n ° 1 trouvé").g("span");
			} g("h1");
		} else if(listeC001.size() == 1) {
			// un cours n ° 1
			C001 o = listeC001.first();

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

				htmlFormC001(o);

			} g("div");
		} else {
			// plusiers courses

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("courses").g("i");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("cours numéro").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeC001.size(); i++) {
						C001 o = listeC001.getList().get(i);
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
