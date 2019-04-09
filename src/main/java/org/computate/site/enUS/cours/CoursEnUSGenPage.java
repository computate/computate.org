package org.computate.site.enUS.cours;

import org.apache.solr.common.SolrDocument;
import java.lang.String;
import java.lang.Boolean;
import java.lang.Integer;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.List;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import java.io.IOException;
import io.vertx.core.http.HttpServerRequest;
import io.vertx.core.http.HttpServerResponse;
import org.computate.site.enUS.recherche.ListeRecherche;
import org.computate.site.enUS.couverture.Couverture;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.web.api.OperationRequest;
import io.vertx.core.json.JsonArray;
import java.net.URLDecoder;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.StringUtils;


/**
 * Traduire: false
 **/
public class CoursEnUSGenPage extends CoursEnUSGenPageGen<MiseEnPage> {

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeCours(Couverture<ListeRecherche<Cours>> c) {
	}

	protected void _cours(Couverture<Cours> c) {
		if(listeCours.size() == 1)
			c.o(listeCours.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(cours != null)
			c.o("a course");
		else if(listeCours.size() == 0)
			c.o("no course found");
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageH3(Couverture<String> c) {
		c.o("");
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		if(cours != null)
			c.o("a course");
		else if(listeCours.size() == 0)
			c.o("no course found");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/static/png/enUS/course-999.png");
	}

	@Override protected void _contexteIconeGroupe(Couverture<String> c) {
			c.o("regular");
	}

	@Override protected void _contexteIconeNom(Couverture<String> c) {
			c.o("university");
	}

	@Override public void initLoinCoursEnUSGenPage() {
		initCoursEnUSGenPage();
		super.initLoinMiseEnPage();
	}

	@Override public void htmlScriptsCoursEnUSGenPage() {
		e("script").a("src", "/static/js/CoursEnUSGenPage.js").f().g("script");
	}

	@Override public void htmlScriptCoursEnUSGenPage() {
	}

	public void htmlFormPageCours(Cours o) {
	}

	public void htmlFormPOSTCours(Cours o) {
	}

	public void htmlFormPATCHCours(Cours o) {
	}

	public void htmlFormRechercheCours(Cours o) {
	}

	@Override public void htmlBodyCoursEnUSGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeCours.size() == 0) {
			//no course found

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("no course found").g("span");
			} g("h1");
		} else if(listeCours.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			// a course
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
		} else {
			// plusiers courses

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("courses").g("span");
			} g("h1");
			{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
				{ e("thead").f();
					{ e("tr").f();
						e("th").f().sx("course").g("th");
						e("th").f().sx("lesson").g("th");
						e("th").f().sx("description").g("th");
					} g("tr");
				} g("thead");
				{ e("tbody").f();
					for(int i = 0; i < listeCours.size(); i++) {
						Cours o = listeCours.getList().get(i);
						String uri = o.getPageUri();
						{ e("tr").f();
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getCoursNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getLeconNumero());
								} g("a");
							} g("td");
							{ e("td").f();
								{ e("a").a("href", uri).f();
									sx(o.getCoursDescription());
								} g("a");
							} g("td");
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}

		{ e("div").a("class", "").f();
			{ e("form").a("id", "CoursForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/enUS/course").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_enUS')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "")
						.a("title", "")
						.a("class", "recherchePageRecherche_enUS w3-input w3-border w3-bar-item ")
						.a("name", "pageRecherche_enUS")
						.a("id", "recherchePageRecherche_enUS");
					operationRequete.getParams().getJsonObject("query").forEach(paramRequete -> {
						String entiteVar = null;
						String valeurIndexe = null;
						String paramNom = paramRequete.getKey();
						Object paramValeursObjet = paramRequete.getValue();
						JsonArray paramObjets = paramValeursObjet instanceof JsonArray ? (JsonArray)paramValeursObjet : new JsonArray().add(paramValeursObjet);

						try {
							for(Object paramObjet : paramObjets) {
								switch(paramNom) {
									case "q":
										entiteVar = StringUtils.trim(StringUtils.substringBefore((String)paramObjet, ":"));
										valeurIndexe = URLDecoder.decode(StringUtils.trim(StringUtils.substringAfter((String)paramObjet, ":")), "UTF-8");
										if("pageRecherche_enUS".equals(entiteVar))
											a("value", URLDecoder.decode(valeurIndexe, "UTF-8"));
								}
							}
						} catch(Exception e) {
							ExceptionUtils.rethrow(e);
						}
					});
					fg();
					{ e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-green ")
						.f();
						e("i").a("class", "fas fa-search ").f().g("i");
					} g("button");
				} g("div");
			} g("form");
		} g("div");

		if(listeCours.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			Cours o = listeCours.first();

			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show w3-white ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "CoursForm").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageCours(o);
				}

				o.htmlBody();

			} g("div");
		}
		e("div").f();

		g("div");
	}

}
