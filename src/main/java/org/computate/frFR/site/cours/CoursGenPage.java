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


public class CoursGenPage extends CoursGenPageGen<MiseEnPage> {

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
		if(cours != null && cours.getPageH1() != null)
			c.o(cours.getPageH1());
		else if(cours != null)
			c.o("un cours");
		else if(listeCours.size() == 0)
			c.o("aucun cours trouvé");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		if(cours != null && cours.getPageH2() != null)
			c.o(cours.getPageH2());
	}

	@Override protected void _pageH3(Couverture<String> c) {
		if(cours != null && cours.getPageH3() != null)
			c.o(cours.getPageH3());
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(cours != null && cours.getPageTitre() != null)
			c.o(cours.getPageTitre());
		else if(cours != null)
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

	@Override public void initLoinCoursGenPage() {
		initCoursGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsCoursGenPage() {
		e("script").a("src", "/static/js/CoursPage.js").f().g("script");
	}

	protected void _pageUriCours(Couverture<String> c) {
			c.o("/frFR/cours");
	}

	@Override public void htmlScriptCoursGenPage() {
	}

	public void htmlFormCours(Cours o) {
		{ e("div").a("class", "w3-cell-row ").f();
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
	}

	@Override public void htmlBodyCoursGenPage() {

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

				htmlFormCours(o);

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
