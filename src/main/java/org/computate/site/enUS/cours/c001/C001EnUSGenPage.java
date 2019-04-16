package org.computate.site.enUS.cours.c001;

import org.computate.site.frFR.cours.CoursFrFRPage;
import org.computate.site.enUS.cours.CoursEnUSPage;
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
import java.util.List;


/**
 * Traduire: false
 **/
public class C001EnUSGenPage extends C001EnUSGenPageGen<CoursEnUSPage> {

	protected void _c001(Couverture<C001> c) {
		c.o(new C001());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001 != null)
			c.o("Build modern asynchronous web applications with the best open source software. ");
		else
			c.o("Build modern asynchronous web applications with the best open source software. ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001 != null)
			c.o("");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/enUS/course/001-999.png");
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


	@Override public void htmlBodyC001EnUSGenPage() {

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
