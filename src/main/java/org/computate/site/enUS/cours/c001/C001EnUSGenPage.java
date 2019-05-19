package org.computate.site.enUS.cours.c001;

import java.lang.String;
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

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeC001(Couverture<ListeRecherche<C001>> c) {
	}

	protected void _c001(Couverture<C001> c) {
		if(listeC001 != null && listeC001.size() == 1)
			c.o(listeC001.get(0));
	}

	@Override protected void _pageH1(Couverture<String> c) {
		if(c001 != null)
			c.o("Build modern asynchronous web applications with the best open source software. ");
		else if(listeC001 == null || listeC001.size() == 0)
			c.o("no course #1 found");
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
			c.o("Build modern asynchronous web applications with the best open source software. ");
		else if(listeC001 == null || listeC001.size() == 0)
			c.o("no course #1 found");
		else
			c.o("Build modern asynchronous web applications with the best open source software. ");
	}

	@Override protected void _pageUri(Couverture<String> c) {
		c.o("/enUS/course/001");
	}

	@Override protected void _pageUriFrFR(Couverture<String> c) {
		c.o("/frFR/cours/001");
	}

	@Override protected void _pageDescription(Couverture<String> c) {
			c.o("With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. ");
	}

	@Override protected void _pageImageUri(Couverture<String> c) {
			c.o("/png/enUS/course/001-999.png");
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
		e("script").a("src", "/static/js/C001EnUSPage.js").f().g("script");
	}

	@Override public void htmlScriptC001EnUSGenPage() {
	}

	public void htmlFormPageC001(C001 o) {
	}

	public void htmlFormPOSTC001(C001 o) {
	}

	public void htmlFormPATCHC001(C001 o) {
	}

	public void htmlFormRechercheC001(C001 o) {
	}

	@Override public void htmlBodyC001EnUSGenPage() {

		OperationRequest operationRequete = requeteSite_.getOperationRequete();
		JsonObject params = operationRequete.getParams();
		if(listeC001 == null || listeC001.size() == 0) {
			//no course #1 found

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("no course #1 found").g("span");
			} g("h1");
		} else if(listeC001 != null && listeC001.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			// a course #1
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
			// plusiers course #1s

			{ e("h1").f();
				if(contexteIconeClassesCss != null)
					e("i").a("class", contexteIconeClassesCss + " site-menu-icon ").f().g("i");
				e("span").a("class", " ").f().sx("course #1s").g("span");
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
					Map<String, Map<String, List<String>>> highlighting = listeC001.getQueryResponse().getHighlighting();
					for(int i = 0; i < listeC001.size(); i++) {
						C001 o = listeC001.getList().get(i);
						Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
						List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
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
									sx(o.getArticleDescription());
								} g("a");
								if(highlightList != null) {
									{ e("div").a("class", "site-highlight ").f();
										s(StringUtils.join(highlightList, " ... "));
									} g("div");
								}
							} g("td");
						} g("tr");
					}
				} g("tbody");
			} g("table");
		}

		{ e("div").a("class", "").f();
			{ e("form").a("id", "C001Form").a("style", "display: inline-block; ").a("method", "GET").a("action", "/enUS/course/001").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_enUS')); return false; ").f();
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

		if(listeC001 != null && listeC001.size() == 1 && params.getJsonObject("query").getString("q") == null && params.getJsonObject("query").getJsonArray("fq").size() == 0) {
			C001 o = listeC001.first();

			{ e("div").a("class", "w3-card w3-margin w3-padding w3-margin-top w3-show w3-white ").f();

				if(o.getPk() != null) {
					{ e("form").a("id", "C001Form").a("style", "display: inline-block; ").f();
						e("input")
						.a("name", "pk")
						.a("class", "valeurPk")
						.a("type", "hidden")
						.a("value", o.getPk())
						.fg();
					} g("form");
					htmlFormPageC001(o);
				}

				if(o != null)
					o.htmlBody();

			} g("div");
		}
		e("div").f();


		e("button")
			.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
			.a("onclick", "$('#postC001Modale').show(); ")
			.f().sx("Créer a course #1")
		.g("button");
		{ e("div").a("id", "postC001Modale").a("class", "w3-modal ").f();
			{ e("div").a("class", "w3-modal-content w3-card-4 ").f();
				{ e("header").a("class", "w3-container w3-green ").f();
					e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#postC001Modale').hide(); ").f().sx("×").g("span");
					e("h2").a("class", "").f().sx("Créer a course #1").g("h2");
				} g("header");
				{ e("div").a("class", "w3-container ").f();
					C001 o = new C001();

					{ e("form").a("id", "postC001Form").f();
						htmlFormPOSTC001(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "postC001($('#postC001Form')); ")
						.f().sx("Créer a course #1")
					.g("button");

				} g("div");
			} g("div");
		} g("div");


		e("button")
			.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
			.a("onclick", "$('#patchC001Modale').show(); ")
			.f().sx("Modifier des course #1s")
		.g("button");
		{ e("div").a("id", "patchC001Modale").a("class", "w3-modal ").f();
			{ e("div").a("class", "w3-modal-content w3-card-4 ").f();
				{ e("header").a("class", "w3-container w3-green ").f();
					e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#patchC001Modale').hide(); ").f().sx("×").g("span");
					e("h2").a("class", "").f().sx("Modifier des course #1s").g("h2");
				} g("header");
				{ e("div").a("class", "w3-container ").f();
					C001 o = new C001();

					{ e("form").a("id", "patchC001FormFiltres").f();
						htmlFormRechercheC001(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "rechercheC001($('#patchC001FormFiltres')); ")
						.f().sx("Modifier des course #1s")
					.g("button");


					{ e("form").a("id", "patchC001FormValeurs").f();
						htmlFormPATCHC001(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "patchC001($('#patchC001FormFiltres'), $('#patchC001FormValeurs')); ")
						.f().sx("Modifier des course #1s")
					.g("button");

				} g("div");
			} g("div");
		} g("div");


		e("button")
			.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
			.a("onclick", "$('#deleteC001Modale').show(); ")
			.f().sx("Supprimer des course #1s")
		.g("button");
		{ e("div").a("id", "deleteC001Modale").a("class", "w3-modal ").f();
			{ e("div").a("class", "w3-modal-content w3-card-4 ").f();
				{ e("header").a("class", "w3-container w3-green ").f();
					e("span").a("class", "w3-button w3-display-topright ").a("onclick", "$('#deleteC001Modale').hide(); ").f().sx("×").g("span");
					e("h2").a("class", "").f().sx("Supprimer des course #1s").g("h2");
				} g("header");
				{ e("div").a("class", "w3-container ").f();
					C001 o = new C001();

					{ e("form").a("id", "deleteC001Form").f();
						htmlFormPATCHC001(o);
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-green ")
						.a("onclick", "deleteC001(); ")
						.f().sx("Supprimer des course #1s")
					.g("button");

				} g("div");
			} g("div");
		} g("div");

		g("div");
	}

}
