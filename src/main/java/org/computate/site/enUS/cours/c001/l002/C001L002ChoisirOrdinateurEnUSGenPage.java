package org.computate.site.enUS.cours.c001.l002;

import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
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


/**
 * Traduire: false
 **/
public class C001L002ChoisirOrdinateurEnUSGenPage extends C001L002ChoisirOrdinateurEnUSGenPageGen<C001LeconEnUSPage> {

	protected void _c001L002ChoisirOrdinateur(Couverture<C001L002ChoisirOrdinateur> c) {
		c.o(new C001L002ChoisirOrdinateur());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L002ChoisirOrdinateur != null)
			c.o("What type of computer do I need to launch my own website? ");
		else
			c.o("What type of computer do I need to launch my own website? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Here are the 10 most important considerations for running a website on your own computer. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L002ChoisirOrdinateur != null)
			c.o("a lesson");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001/002-choose-computer");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001/002-choisir-ordinateur");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/enUS/course/001/002-choose-computer-999.png");
	}

	@Override protected void _pageImageLargeur(Couverture<Integer> c) {
			c.o(800);
	}

	@Override protected void _pageImageHauteur(Couverture<Integer> c) {
			c.o(616);
	}

	@Override protected void _pageVideoId(Couverture<String> c) {
			c.o("sBcDnQj9_QM");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinC001L002ChoisirOrdinateurEnUSGenPage() {
		initC001L002ChoisirOrdinateurEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L002ChoisirOrdinateurEnUSGenPage() {
		e("script").a("src", "/static/js/C001L002ChoisirOrdinateurEnUSGenPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L002ChoisirOrdinateurEnUSGenPage() {

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
		{ e("div").a("class", "site-video-box ").f();
			e("iframe").a("class", "site-video-embed ").a("width", "560").a("height", "315").a("src", pageVideoUrlEmbed).a("frameborder", "0").a("allow", "autoplay; encrypted-media").a("allowfullscreen", "").f().g("iframe");
		} g("div");

		c001L002ChoisirOrdinateur.htmlBody();

	}

	@Override public void htmlBodyCourtC001L002ChoisirOrdinateurEnUSGenPage() {

		c001L002ChoisirOrdinateur.htmlBodyCourt();
	}
}
