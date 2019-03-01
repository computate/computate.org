package org.computate.frFR.site.cours.c001.l001;

import org.computate.frFR.site.cours.c001.C001LeconPage;
import io.vertx.core.http.HttpServerRequest;
import org.computate.frFR.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.io.IOException;
import org.computate.frFR.site.utilisateur.UtilisateurSite;
import org.computate.frFR.site.page.parti.PageParagraphe;
import org.computate.frFR.site.page.MiseEnPage;
import org.computate.frFR.site.recherche.ListeRecherche;
import org.computate.frFR.site.couverture.Couverture;
import io.vertx.core.http.HttpServerResponse;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.computate.frFR.site.requete.RequeteSite;
import java.lang.String;
import org.computate.frFR.site.config.ConfigSite;


public class C001L001ChoisirNomDomaineGenPage extends C001L001ChoisirNomDomaineGenPageGen<MiseEnPage> {

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
		if(c001L001ChoisirNomDomaine != null && c001L001ChoisirNomDomaine.getPageH1() != null)
			c.o(c001L001ChoisirNomDomaine.getPageH1());
		else if(c001L001ChoisirNomDomaine != null)
			c.o("Quel est l'étape première pour créer mon propre site Web ? ");
		else if(listeC001L001ChoisirNomDomaine.size() == 0)
			c.o("");
		else
			c.o("Quel est l'étape première pour créer mon propre site Web ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null && c001L001ChoisirNomDomaine.getPageH2() != null)
			c.o(c001L001ChoisirNomDomaine.getPageH2());
		else
			c.o("Choisir un nom de domaine. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null && c001L001ChoisirNomDomaine.getPageH3() != null)
			c.o(c001L001ChoisirNomDomaine.getPageH3());
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null && c001L001ChoisirNomDomaine.getPageTitre() != null)
			c.o(c001L001ChoisirNomDomaine.getPageTitre());
		else if(c001L001ChoisirNomDomaine != null)
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

	@Override public void initLoinC001L001ChoisirNomDomaineGenPage() {
		initC001L001ChoisirNomDomaineGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L001ChoisirNomDomaineGenPage() {
		e("script").a("src", "/static/js/C001L001ChoisirNomDomainePage.js").f().g("script");
	}

	@Override public void htmlScriptC001L001ChoisirNomDomaineGenPage() {
	}

	public void htmlFormC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
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

	@Override public void htmlBodyC001L001ChoisirNomDomaineGenPage() {

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

				if(o.getPk() != null)
					htmlFormC001L001ChoisirNomDomaine(o);

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
