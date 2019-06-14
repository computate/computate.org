package org.computate.site.frFR.cours.c001.l010;

import java.lang.Integer;
import java.lang.String;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
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
public class C001L010InstallerSolrFrFRGenPage extends C001L010InstallerSolrFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L010InstallerSolr(Couverture<C001L010InstallerSolr> c) {
		c.o(new C001L010InstallerSolr());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L010InstallerSolr != null)
			c.o("Comment puis-je essayer un moteur de recherche dans mon projet ? ");
		else
			c.o("Comment puis-je essayer un moteur de recherche dans mon projet ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Installer Solr à partir du code source. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L010InstallerSolr != null)
			c.o("Comment puis-je essayer un moteur de recherche dans mon projet ? Installer Solr à partir du code source. ");
		else
			c.o("Comment puis-je essayer un moteur de recherche dans mon projet ? Installer Solr à partir du code source. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/010-comment-installer-une-version-recente-du-moteur-de-recherche-solr");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/010-how-to-install-a-recent-version-of-solr-search-engine");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("Les bases de données et les moteurs de recherche sont des ressources précieuses pour la gestion des données de différentes manières. Les bases de données sont idéales pour les données utilisateur persistantes et normalisées. Les moteurs de recherche sont parfaits pour les versions transformées, dénormalisées et interrogeables des données. Index rapides, mise en surbrillance des requêtes, pagination, filtres et facettisation ne sont que quelques-unes des fonctionnalités essentielles que vous pouvez ajouter à votre site avec un moteur de recherche. Je vous aiderai à installer une version récente de Solr pour ajouter la recherche à votre site Web de manière open source. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/frFR/cours/001/010-comment-installer-une-version-recente-du-moteur-de-recherche-solr-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(1666);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinC001L010InstallerSolrFrFRGenPage() {
		initC001L010InstallerSolrFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L010InstallerSolrFrFRGenPage() {
		e("script").a("src", statiqueUrlBase, "/js/C001L010InstallerSolrFrFRPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L010InstallerSolrFrFRGenPage() {

		if(StringUtils.isNotBlank(pageH1)) {
			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx(pageH1).g("span");
			} g("h1");
		}
		if(StringUtils.isNotBlank(pageH1)) {
			{ e("h2").f();
				e("span").a("class", " ").f().sx(pageH2).g("span");
			} g("h2");
		}
		if(StringUtils.isNotBlank(pageH3)) {
			{ e("h3").f();
				e("span").a("class", " ").f().sx(pageH3).g("span");
			} g("h3");
		}

		if(c001L010InstallerSolr != null)
			c001L010InstallerSolr.htmlBody();

	}

	@Override public void htmlBodyCourtC001L010InstallerSolrFrFRGenPage() {

		c001L010InstallerSolr.htmlBodyCourt();
	}
}
