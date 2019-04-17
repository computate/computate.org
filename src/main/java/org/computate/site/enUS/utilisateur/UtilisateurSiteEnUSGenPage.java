package org.computate.site.enUS.utilisateur;

import java.util.List;
import java.lang.Long;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import java.lang.String;
import java.lang.Boolean;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.enUS.article.ArticleEnUSPage;
import org.computate.site.enUS.config.ConfigSite;
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


/**
 * Traduire: false
 **/
public class UtilisateurSiteEnUSGenPage extends UtilisateurSiteEnUSGenPageGen<ArticleEnUSPage> {

	protected void _utilisateurSite(Couverture<UtilisateurSite> c) {
		c.o(new UtilisateurSite());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o("");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(utilisateurSite != null)
			c.o("");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/user");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/utilisateur");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/user-999.png");
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

	@Override public void initLoinUtilisateurSiteEnUSGenPage() {
		initUtilisateurSiteEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsUtilisateurSiteEnUSGenPage() {
		e("script").a("src", "/static/js/UtilisateurSiteEnUSGenPage.js").f().g("script");
	}


	@Override public void htmlBodyUtilisateurSiteEnUSGenPage() {

		if(pageH1 != null) {
			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		}

		utilisateurSite.htmlBody();

	}

}
