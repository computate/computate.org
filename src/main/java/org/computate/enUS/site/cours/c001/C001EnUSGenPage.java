package org.computate.enUS.site.cours.c001;

import io.vertx.core.http.HttpServerRequest;
import org.computate.enUS.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import java.io.IOException;
import org.computate.enUS.site.utilisateur.UtilisateurSite;
import org.computate.frFR.site.cours.c001.C001LeconFrFRPage;
import org.computate.enUS.site.page.MiseEnPage;
import org.computate.enUS.site.recherche.ListeRecherche;
import org.computate.enUS.site.couverture.Couverture;
import io.vertx.core.http.HttpServerResponse;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import org.computate.enUS.site.requete.RequeteSite;
import org.computate.enUS.site.config.ConfigSite;


/**
 * Traduire: false
 **/
public class C001EnUSGenPage extends C001EnUSGenPageGen<MiseEnPage> {

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
		if(c001 != null)
			c.o("");
		else if(listeC001.size() == 0)
			c.o("");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001 != null)
			c.o("");
		else if(listeC001.size() == 0)
			c.o("");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinC001EnUSGenPage() {
		initC001EnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001EnUSGenPage() {
		e("script").a("src", "/static/js/C001EnUSGenPage.js").f().g("script");
	}

	@Override public void htmlScriptC001EnUSGenPage() {
	}

	public void htmlFormPageC001(C001 o) {
	}

	public void htmlFormPOSTC001(C001 o) {
	}

	public void htmlFormPATCHC001(C001 o) {
	}

	public void htmlFormRechercheC001(C001 o) {
	}

	@Override public void htmlBodyC001EnUSGenPage() {

		if(listeC001.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeC001.size() == 1) {
			// 
			C001 o = listeC001.first();

			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
					e("span").a("class", " ").f().sx("").g("span");
				} g("h1");
			}
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "C001Form").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageC001(o);
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
					for(int i = 0; i < listeC001.size(); i++) {
						C001 o = listeC001.getList().get(i);
						String uri = "/enUS/course/001/" + o.getPk();
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
