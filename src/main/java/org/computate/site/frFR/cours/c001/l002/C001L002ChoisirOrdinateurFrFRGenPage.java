package org.computate.site.frFR.cours.c001.l002;

import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.page.parti.QuestionReponse;
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


/**
 * Traduire: false
 **/
public class C001L002ChoisirOrdinateurFrFRGenPage extends C001L002ChoisirOrdinateurFrFRGenPageGen<C001LeconFrFRPage> {

	protected void _c001L002ChoisirOrdinateur(Couverture<C001L002ChoisirOrdinateur> c) {
		c.o(new C001L002ChoisirOrdinateur());
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L002ChoisirOrdinateur != null)
			c.o("Quel type d'ordinateur dois-je avoir pour construire mon propre site Web ? ");
		else
			c.o("Quel type d'ordinateur dois-je avoir pour construire mon propre site Web ? ");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("Voici les 10 considérations & les plus importantes pour l'exécution d'un site Web sur votre propre ordinateur. ");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L002ChoisirOrdinateur != null)
			c.o("le leçon");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/frFR/cours/001/002-choisir-ordinateur");
	}

	@Override protected void _pageUriEnUS(Couverture<String> c) {
		c.o("/enUS/course/001/002-choose-computer");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/frFR/cours/001/002-choisir-ordinateur-999.png");
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

	@Override public void initLoinC001L002ChoisirOrdinateurFrFRGenPage() {
		initC001L002ChoisirOrdinateurFrFRGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L002ChoisirOrdinateurFrFRGenPage() {
		e("script").a("src", "/static/js/C001L002ChoisirOrdinateurFrFRGenPage.js").f().g("script");
	}


	@Override public void htmlBodyC001L002ChoisirOrdinateurFrFRGenPage() {

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

	@Override public void htmlBodyCourtC001L002ChoisirOrdinateurFrFRGenPage() {

		c001L002ChoisirOrdinateur.htmlBodyCourt();
	}
}
