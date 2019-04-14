package org.computate.site.enUS.page.accueil;

import java.util.List;
import java.lang.String;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.cours.Cours;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
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


/**
 * Traduire: false
 **/
public class PageAccueilEnUSGenPage extends PageAccueilEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _pageAccueil(Couverture<PageAccueil> c) {
		c.o(new PageAccueil());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(pageAccueil != null)
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
		else
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Flexible PostgreSQL database, Solr search integration, OpenAPI 3 standards, completely asynchronous Vert.x code, deployed on Red Hat OpenShift, for the very best, 100% open source solutions. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageAccueil != null)
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
		else
			c.o("Create your own data-driven, searchable website on your own computer and the cloud, with open source software. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/-999.png");
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

	@Override public void initLoinPageAccueilEnUSGenPage() {
		initPageAccueilEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageAccueilEnUSGenPage() {
		e("script").a("src", "/static/js/PageAccueilEnUSGenPage.js").f().g("script");
	}


	@Override public void htmlBodyPageAccueilEnUSGenPage() {

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

		pageAccueil.htmlBody();

	}

	@Override public void htmlBodyCourtPageAccueilEnUSGenPage() {

		pageAccueil.htmlBodyCourt();
	}
}