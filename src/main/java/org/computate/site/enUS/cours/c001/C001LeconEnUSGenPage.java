package org.computate.site.enUS.cours.c001;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.ArrayList;
import org.apache.solr.common.SolrDocument;
import org.computate.site.frFR.cours.c001.C001FrFRPage;
import org.computate.site.enUS.cours.c001.C001EnUSPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.MiseEnPage;
import java.time.LocalDate;
import java.time.ZonedDateTime;


/**
 * Traduire: false
 **/
public class C001LeconEnUSGenPage extends C001LeconEnUSGenPageGen<C001EnUSPage> {

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
		if(c001Lecon != null)
			c.o("a lesson");
		else if(listeC001Lecon.size() == 0)
			c.o("");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001Lecon != null)
			c.o("a lesson");
		else if(listeC001Lecon.size() == 0)
			c.o("");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/lessons");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/lecons");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/enUS/course/001/lessons-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinC001LeconEnUSGenPage() {
		initC001LeconEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001LeconEnUSGenPage() {
		e("script").a("src", "/static/js/C001LeconEnUSGenPage.js").f().g("script");
	}

	@Override public void htmlScriptC001LeconEnUSGenPage() {
	}

	public void htmlFormPageC001Lecon(C001Lecon o) {
	}

	public void htmlFormPOSTC001Lecon(C001Lecon o) {
	}

	public void htmlFormPATCHC001Lecon(C001Lecon o) {
	}

	public void htmlFormRechercheC001Lecon(C001Lecon o) {
	}

	@Override public void htmlBodyC001LeconEnUSGenPage() {

		if(listeC001Lecon.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeC001Lecon.size() == 1) {
			// a lesson
			C001Lecon o = listeC001Lecon.first();

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
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show w3-white ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "C001LeconForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageC001Lecon(o);
				}

				o.htmlBody();

			} g("div");
		} else {
			// plusiers lessons

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("lessons").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("course number").g("th");
						e("th").f().sx("course").g("th");
						e("th").f().sx("lesson").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeC001Lecon.size(); i++) {
						C001Lecon o = listeC001Lecon.getList().get(i);
						String uri = o.getPageUri();
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
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getLeconDescription());
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
