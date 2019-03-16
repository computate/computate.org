package org.computate.enUS.site.cours.c001;

import io.vertx.core.http.HttpServerRequest;
import org.computate.enUS.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.io.IOException;
import org.computate.enUS.site.utilisateur.UtilisateurSite;
import java.lang.Integer;
import org.computate.enUS.site.page.MiseEnPage;
import java.util.ArrayList;
import org.computate.enUS.site.recherche.ListeRecherche;
import org.apache.solr.common.SolrDocument;
import org.computate.enUS.site.couverture.Couverture;
import java.util.Locale;
import io.vertx.core.http.HttpServerResponse;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.lang.Boolean;
import org.computate.enUS.site.requete.RequeteSite;
import org.computate.enUS.site.config.ConfigSite;
import org.computate.enUS.site.cours.c001.C001Page;


/**
 * Traduire: false
 **/
public class C001LeconGenPage extends C001LeconGenPageGen<C001Page> {

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
			c.o("");
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
			c.o("");
		else if(listeC001Lecon.size() == 0)
			c.o("");
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
		e("script").a("src", "/static/js/C001LeconGenPage.js").f().g("script");
	}

	@Override public void htmlScriptC001LeconGenPage() {
	}

	public void htmlFormPageC001Lecon(C001Lecon o) {
	}

	public void htmlFormPOSTC001Lecon(C001Lecon o) {
	}

	public void htmlFormPATCHC001Lecon(C001Lecon o) {
	}

	public void htmlFormRechercheC001Lecon(C001Lecon o) {
	}

	@Override public void htmlBodyC001LeconGenPage() {

		if(listeC001Lecon.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeC001Lecon.size() == 1) {
			// 
			C001Lecon o = listeC001Lecon.first();

			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
					e("span").a("class", " ").f().sx("").g("span");
				} g("h1");
			}
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show ").f();

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

			} g("div");
		} else {
			// plusiers 

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("i");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeC001Lecon.size(); i++) {
						C001Lecon o = listeC001Lecon.getList().get(i);
						String uri = "/frFR/cours/001/" + o.getPk();
						{ e("tr").f();
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}
		e("div").f();

		g("div");
	}
}
