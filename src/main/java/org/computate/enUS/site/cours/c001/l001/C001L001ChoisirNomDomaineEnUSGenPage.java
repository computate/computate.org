package org.computate.enUS.site.cours.c001.l001;

import java.lang.String;
import org.computate.enUS.site.page.parti.PageParagraphe;
import org.computate.enUS.site.page.parti.QuestionReponse;
import org.computate.frFR.site.cours.c001.C001LeconFrFRPage;
import org.computate.enUS.site.cours.c001.C001LeconEnUSPage;
import org.computate.enUS.site.config.ConfigSite;
import org.computate.enUS.site.requete.RequeteSiteEnUS;
import org.computate.enUS.site.contexte.SiteContexteEnUS;
import org.computate.enUS.site.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.enUS.site.recherche.ListeRecherche;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.page.MiseEnPage;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;


/**
 * Traduire: false
 **/
public class C001L001ChoisirNomDomaineEnUSGenPage extends C001L001ChoisirNomDomaineEnUSGenPageGen<C001LeconEnUSPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeC001L001ChoisirNomDomaine(Couverture<ListeRecherche<C001L001ChoisirNomDomaine>> c) {
	}

	protected void _c001L001ChoisirNomDomaine(Couverture<C001L001ChoisirNomDomaine> c) {
		if(listeC001L001ChoisirNomDomaine.size() == 1)
			c.o(listeC001L001ChoisirNomDomaine.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null)
			c.o("");
		else if(listeC001L001ChoisirNomDomaine.size() == 0)
			c.o("");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(c001L001ChoisirNomDomaine != null)
			c.o("");
		else if(listeC001L001ChoisirNomDomaine.size() == 0)
			c.o("");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("book");
	}

	@Override public void initLoinC001L001ChoisirNomDomaineEnUSGenPage() {
		initC001L001ChoisirNomDomaineEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsC001L001ChoisirNomDomaineEnUSGenPage() {
		e("script").a("src", "/static/js/C001L001ChoisirNomDomaineEnUSGenPage.js").f().g("script");
	}

	@Override public void htmlScriptC001L001ChoisirNomDomaineEnUSGenPage() {
	}

	public void htmlFormPageC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
	}

	public void htmlFormPOSTC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
	}

	public void htmlFormPATCHC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
	}

	public void htmlFormRechercheC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine o) {
	}

	@Override public void htmlBodyC001L001ChoisirNomDomaineEnUSGenPage() {

		if(listeC001L001ChoisirNomDomaine.size() == 0) {
			//

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
				e("span").a("class", " ").f().sx("").g("span");
			} g("h1");
		} else if(listeC001L001ChoisirNomDomaine.size() == 1) {
			// 
			C001L001ChoisirNomDomaine o = listeC001L001ChoisirNomDomaine.first();

			if(pageH1 != null) {
				{ e("h1").f();
					if(contexteIconeClassesCss != null)
						e("i").a("class", contexteIconeClassesCss + " w3-margin-right-4 ").f().g("i");
					e("span").a("class", " ").f().sx("").g("span");
				} g("h1");
			}
			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "C001L001ChoisirNomDomaineForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageC001L001ChoisirNomDomaine(o);
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
					for(int i = 0; i < listeC001L001ChoisirNomDomaine.size(); i++) {
						C001L001ChoisirNomDomaine o = listeC001L001ChoisirNomDomaine.getList().get(i);
						String uri = "/enUS/course/001/001-choose-domain-name/" + o.getPk();
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
