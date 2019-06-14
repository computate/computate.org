package org.computate.site.enUS.utilisateur;

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.article.Article;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.recherche.ListeRecherche;
import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;

public class UtilisateurSite extends UtilisateurSiteGen<Cluster> {

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(org.computate.site.frFR.utilisateur.UtilisateurSite.class.getCanonicalName());
		l.add(org.computate.site.enUS.utilisateur.UtilisateurSite.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	protected void _utilisateurId(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurId();
		c.o(o);
	}

	protected void _calculInrPks(List<Long> l) {
	}

	protected void _utilisateurNom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNom();
		c.o(o);
	}

	protected void _utilisateurMail(Couverture<String> c) {
	}

	protected void _utilisateurPrenom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurPrenom();
		c.o(o);
	}

	protected void _utilisateurNomFamille(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomFamille();
		c.o(o);
	}

	protected void _utilisateurNomComplet(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomComplet();
		c.o(o);
	}

	protected void _utilisateurSite(Couverture<String> c) {
	}

	protected void _utilisateurRecevoirCourriels(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _voirArchive(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _voirSupprime(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _siteNomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	protected void _zookeeperVersion(Couverture<String> c) {
		c.o("3.5.5");
	}

	protected void _zookeeperPortAdmin(Couverture<Integer> c) {
		c.o(10280);
	}

	protected void _zookeeperPortClient(Couverture<Integer> c) {
		c.o(10281);
	}

	protected void _solrVersion(Couverture<String> c) {
		c.o("7.1.0");
	}

	protected void _solrPortClient(Couverture<Integer> c) {
		c.o(10380);
	}

	protected void _solrConfigset(Couverture<String> c) {
		c.o("computate");
	}

	protected void _solrCollection(Couverture<String> c) {
		c.o("site");
	}

	protected void _statiqueUrlBase(Couverture<String> c) {
		c.o(requeteSite_.getConfigSite_().getStatiqueUrlBase()); 
	}

	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("coursNumero_indexed_int", ORDER.desc);
		o.addSort("leconNumero_indexed_int", ORDER.desc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
		o.addFilterQuery("estLecon_indexed_boolean:true");
	}

	public void  htmlBody() {  
		OperationRequest operationRequete = requeteSite_.getOperationRequete();

		super.htmlBody();
		if(requeteSite_.getUtilisateurRolesRessource().contains("SiteAdmin")) {
			{ e("div").a("class", "w3-card-4 w3-margin-top w3-margin-bottom ").f();
				{ e("h1").a("class", "w3-container w3-vivid-greenish-blue ").f();
					e("i").a("class", "far fa-keyboard site-menu-icon ").f().g("i");
					sx("admin actions");
				} g("h1");
				{ e("div").a("class", "w3-padding ").f();

					// FormFiltres PATCH
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormFiltres").f();
					} g("form");
					{ e("form").a("action", "/api/cluster").a("id", "patchClusterFormValeurs").f();
					} g("form");
					e("button")
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3- ")
						.a("onclick", "patchClusterBase($('#patchClusterFormFiltres'), $('#patchClusterFormValeurs')); ")
						.f().sx("index all the pages")
					.g("button");
				} g("div");
			} g("div");
		}
		{ e("a").a("href", requeteSite_.getConfigSite_().getAuthUrl(), "/realms/", requeteSite_.getConfigSite_().getAuthRoyaume(), "/account");
			a("class", "w3-btn w3-round w3-border w3-border-black w3-section w3-vivid-greenish-blue w3-ripple w3-padding w3-margin ");
			f();
			sx("Manage my account");
		} g("a");

		{ e("div").a("class", "").f();
			{ e("form").a("id", "ArticleForm").a("style", "display: inline-block; ").a("method", "GET").a("action", "/enUS/article").a("onsubmit", "event.preventDefault(); rechercher($('#recherchePageRecherche_enUS')); return false; ").f();
				{ e("div").a("class", "w3-bar ").f();
					e("input").a("type", "text")
						.a("placeholder", "search articles")
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
						.a("class", "w3-btn w3-round w3-border w3-border-black w3-ripple w3-padding w3-bar-item w3-vivid-greenish-blue ")
						.f();
						e("i").a("class", "fas fa-search ").f().g("i");
					} g("button");
				} g("div");
			} g("form");
		} g("div");

		{ e("h1").f();
				e("i").a("class", Article.Article_IconeGroupe, " ", Article.Article_IconeNom, " site-menu-icon ").f().g("i");
			e("span").a("class", " ").f().sx("recent articles").g("span");
		} g("h1");
		{ e("div").a("class", "w3-row ").f();
			Map<String, Map<String, List<String>>> highlighting = listeArticle.getQueryResponse().getHighlighting();
			for(int i = 0; i < listeArticle.size(); i++) {
				Article o = listeArticle.getList().get(i);
				Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
				List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
				String uri = o.getPageUri();
				{ e("div").a("class", "w3-half w3-mobile ").f();
					{ e("div").a("class", "w3-card-4 w3-margin w3-white ").f();
						{ e("a").a("href", uri).f();
							{ e("span").a("class", "w3-container w3-responsive ").f();
								{ e("h3").a("class", "w3-margin-top ").f();
									sx(o.getArticleH1());
								} g("h3");
								{ e("div").a("class", "site-highlight w3-opacity ").f();
									sx(requeteSite_.getConfigSite_().getSiteUrlBase(), o.getPageUri());
								} g("div");
								{ e("h4").a("class", "w3-margin-top w3-margin-bottom ").f();
									sx(o.getArticleH2());
								} g("h4");
							} g("span");
							if(o.getPageImageUri() != null)
								e("img").a("src", statiqueUrlBase, "/", o.getPageImageUri()).a("class", "w3-image ").fg();
						} g("a");
					} g("div");
				} g("div");
			}
		} g("div");
	}
}
