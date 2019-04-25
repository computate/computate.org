package org.computate.site.enUS.page.faq;

import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.article.Article;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.frFR.article.ArticleFrFRPage;
import org.computate.site.enUS.article.ArticleEnUSPage;
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
import java.util.List;


/**
 * Traduire: false
 **/
public class PageFaqEnUSGenPage extends PageFaqEnUSGenPageGen<ArticleEnUSPage> {

	protected void _pageFaq(Couverture<PageFaq> c) {
		c.o(new PageFaq());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(pageFaq != null)
			c.o("Have some questions about computate.org? ");
		else
			c.o("Have some questions about computate.org? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("computate.org frequently asked questions (FAQ). ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(pageFaq != null)
			c.o("");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/faq");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/faq");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/faq-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(200);
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("question");
	}

	@Override public void initLoinPageFaqEnUSGenPage() {
		initPageFaqEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsPageFaqEnUSGenPage() {
		e("script").a("src", "/static/js/PageFaqEnUSGenPage.js").f().g("script");
	}


	@Override public void htmlBodyPageFaqEnUSGenPage() {

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

		pageFaq.htmlBody();

	}

	@Override public void htmlBodyCourtPageFaqEnUSGenPage() {

		pageFaq.htmlBodyCourt();
	}
}
