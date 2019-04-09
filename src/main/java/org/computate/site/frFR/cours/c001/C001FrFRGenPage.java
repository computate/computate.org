package org.computate.site.frFR.cours.c001;

import org.computate.site.frFR.cours.CoursFrFRPage;
import org.computate.site.frFR.config.ConfigSite;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
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


/**
 * Traduire: false
 **/
public class C001FrFRGenPage extends C001FrFRGenPageGen<CoursFrFRPage> {

	protected void _c001(Couverture<C001> c) {
		c.o(new C001());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001 != null)
			c.o("Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ");
		else
			c.o("Construire des applications Web modernes et async avec les meilleurs logiciels open sources. ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001 != null)
			c.o("un cours n ° 1");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/frFR/cours/001-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinC001FrFRGenPage() {
		initC001FrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001FrFRGenPage() {
		e("script").a("src", "/static/js/C001FrFRGenPage.js").f().g("script");
	}


	@Override public void htmlBodyC001FrFRGenPage() {

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

		c001.htmlBody();

	}

}
