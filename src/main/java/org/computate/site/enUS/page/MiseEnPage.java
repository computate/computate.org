package org.computate.site.enUS.page;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.common.SolrDocument;
import org.computate.site.enUS.chaine.Chaine;
import org.computate.site.enUS.config.ConfigSite;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.page.parti.PagePart;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.computate.site.enUS.xml.OutilXml;
import io.vertx.core.json.JsonObject;

public class MiseEnPage extends MiseEnPageGen<Object> {

	public static List<String> HTML_ELEMENTS_FERMES = Arrays.asList("area", "base", "br", "col", "command", "embed", "hr", "img", "input", "keygen", "link", "meta", "param", "source", "track", "wbr");

	public static List<String> HTML_ELEMENTS_NO_WRAP = Arrays.asList("script", "span", "a", "b", "i", "u", "title", "use", "h1", "h2", "h3", "h4", "h5", "h6", "pre", "p");

	public static DateTimeFormatter FORMATDateHeureCourt = DateTimeFormatter.ofPattern("MMM d yyyy h:mm a", Locale.US);

	public static DateTimeFormatter FORMATDateCourt = DateTimeFormatter.ofPattern("EEE MMM d yyyy", Locale.US);

	public static DateTimeFormatter FORMATAffichage = DateTimeFormatter.ofPattern("EEEE MMMM d yyyy h:mm a", Locale.US);

	protected void _pageParts(List<PagePart> l) {
	}

	public void  avantPagePart(PagePart o, String var) {
		o.setPage_(this);
	}

	protected void _requeteSite_(Couverture<RequeteSiteEnUS> c) {
	}

	protected void _statiqueUrlBase(Couverture<String> c) {
		c.o(requeteSite_.getConfigSite_().getStatiqueUrlBase()); 
	}

	protected void _pageDocumentSolr(Couverture<SolrDocument> c) {
		
	}

	protected void _w(Couverture<ToutEcrivain> c) {
		c.o(requeteSite_.getW());
	}

	protected void _contexteIconeGroupe(Couverture<String> c) {
	}

	protected void _contexteIconeNom(Couverture<String> c) {
	}

	protected void _contexteIconeClassesCss(Couverture<String> c) {
		if(contexteIconeGroupe != null && contexteIconeNom != null)
			c.o("fa" + StringUtils.substring(contexteIconeGroupe, 0, 1) + " fa-" + contexteIconeNom + " ");
	}

	protected void _pageVisibleAuxBots(Couverture<Boolean> c) {
		c.o(BooleanUtils.toBooleanDefaultIfNull((Boolean)pageDocumentSolr.get(c.var + "_stored_boolean"), false));
	}

	protected void _pageH1(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	protected void _pageH2(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	protected void _pageH3(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	protected void _pageH1Court(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), pageH1));
	}

	protected void _pageH2Court(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), pageH2));
	}

	protected void _pageH3Court(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), pageH2));
	}

	protected void _pageTitre(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_enUS_stored_string"), StringUtils.join(pageH1, pageH2)));
	}

	protected void _pageUri(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_enUS_stored_string"), null));
	}

	protected void _pageUriFrFR(Couverture<String> c) {
	}

	protected void _pageUris(List<String> l) {
		l.add(pageUri.toString());
		l.add(pageUri + "/");
	}

	protected void _pageUrl(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), requeteSite_.getConfigSite_().getSiteUrlBase() + pageUri));
	}

	protected void _pageImageUri(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	protected void _pageImageUrl(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), statiqueUrlBase + pageImageUri));
	}

	protected void _pageVideoId(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	protected void _pageVideoUrl(Couverture<String> c) {
		if(pageVideoId != null) {
			c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), "https://youtu.be/" + pageVideoId));
		}
	}

	protected void _pageVideoUrlEmbed(Couverture<String> c) {
		if(pageVideoId != null) {
			c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), "https://www.youtube.com/embed/" + pageVideoId));
		}
	}

	protected void _pageImageLargeur(Couverture<Integer> c) {
		c.o((Integer)pageDocumentSolr.get(c.var + "_stored_int"));
	}

	protected void _pageImageHauteur(Couverture<Integer> c) {
		c.o((Integer)pageDocumentSolr.get(c.var + "_stored_int"));
	}

	protected void _pageImageTypeContenu(Couverture<String> c) {
		c.o(StringUtils.defaultIfBlank((String)pageDocumentSolr.get(c.var + "_stored_string"), null));
	}

	protected void _pageTypeContenu(Couverture<String> c) {
//		if(requeteSite_.requete != null && requeteSite_.requete.getRequestURI().endsWith(".svg"))
//			c.o("image/svg+xml");
//		if(requeteSite_.requete != null && requeteSite_.requete.getRequestURI().endsWith(".sh.html"))
//			c.o("text/html;charset=UTF-8");
//		if(requeteSite_.requete != null && requeteSite_.requete.getRequestURI().endsWith(".sh"))
//			c.o("text/x-shellscript");
//		else
			c.o("text/html;charset=UTF-8");
	}

	protected void _pageCree(Couverture<LocalDateTime> c) {   
		Date solrVal = (Date)pageDocumentSolr.get(c.var + "_stored_date");
		if(solrVal != null)
			c.o(solrVal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
	}

	protected void _pageModifiee(Couverture<LocalDateTime> c) {
		Date solrVal = (Date)pageDocumentSolr.get(c.var + "_stored_date");
		if(solrVal != null)
			c.o(solrVal.toInstant().atZone(ZoneId.systemDefault()).toLocalDateTime());
		else
			c.o(pageCree);
	}

	protected void _pageMotsCles(Couverture<String> c) {
	}

	protected void _pageDescription(Couverture<String> c) {
	}

	protected void _pageAccueilUri(Couverture<String> c) {
		c.o(" /");
	}

	protected void _pageAProposUri(Couverture<String> c) {
		c.o(" /enUS/about");
	}

	protected void _pageBlogUri(Couverture<String> c) {
		c.o(" /enUS/blog");
	}

	protected void _pageLeconUri(Couverture<String> c) {
		c.o(" /enUS/lesson");
	}

	protected void _pageCoursUri(Couverture<String> c) {
		c.o(" /enUS/course");
	}

	protected void _pageFaqUri(Couverture<String> c) {
		c.o(" /enUS/faq");
	}

	protected void _pageUtilisateurUri(Couverture<String> c) {
		c.o(" /enUS/user");
	}

	protected void _pageDeconnexionUri(Couverture<String> c) {
		try {
			ConfigSite configSite = requeteSite_.getConfigSite_();
			String o = configSite.getAuthUrl() + "/realms/" + configSite.getAuthRessource() + "/protocol/openid-connect/logout?redirect_uri=" + URLEncoder.encode(configSite.getSiteUrlBase() + "/deconnexion", "UTF-8");
			c.o(o);
		} catch (UnsupportedEncodingException e) {
			ExceptionUtils.rethrow(e);
		}
	}

	protected void _pageYoutubeUrl(Couverture<String> c) {
		c.o("https://www.youtube.com/channel/UC3ryOB2snhO7fItkx6dGx2Q");
	}

	protected void _pagePinterestUrl(Couverture<String> c) {
		c.o(" https://www.pinterest.com/computateorg/computate-in-english/");
	}

	public void  pageRecapituler() {
		{ e("html").a("xmlns:xlink", "http://www.w3.org/1999/xlink").a("xmlns", "http://www.w3.org/1999/xhtml").a("xmlns:fb", "http://ogp.me/ns/fb#").f();
			{ e("head").f();
				e("title").f();
					sx(pageTitre);
				g("title");
				htmlScripts();
				e("script").f().l("/*<![CDATA[*/");
				htmlScript();
				s("/*]]>*/").g("script");
				htmlStyles();
				e("style").f().l("/*<![CDATA[*/");
				htmlStyle();
				s("/*]]>*/").g("style");
	
			} g("head");
			{ e("body").a("class", "w3-light-grey ").f(); 
				{ e("div").a("class", "w3-margin-top ").f();
					{ e("div").a("class", "w3-row w3-margin-left ").f();
						htmlBodyCourt();
					} g("div");
				} g("div");
			} g("body");
		} g("html");
	}

	@Override()
	public void  htmlBodyCourtMiseEnPage() {
	}

	@Override()
	public void  htmlMetaMiseEnPage() {
		e("meta").a("charset", "UTF-8").fg();
		e("meta").a("name", "viewport").a("content", "width=device-width, initial-scale=1").fg();
		e("meta").a("name", "keywords").a("content", pageMotsCles).fg();
		e("meta").a("property", "og:title").a("content", pageTitre).fg();
		e("meta").a("property", "og:description").a("content", pageDescription).fg();
		e("meta").a("property", "og:url").a("content", pageUrl).fg();
		e("meta").a("property", "og:site_name").a("content", requeteSite_.getConfigSite_().getNomDomaine()).fg();
		e("meta").a("property", "og:image").a("content", pageImageUrl).fg();
		e("meta").a("property", "og:image:width").a("content", pageImageLargeur).fg();
		e("meta").a("property", "og:image:height").a("content", pageImageHauteur).fg();
		e("meta").a("property", "og:image:type").a("content", pageImageTypeContenu).fg();
		e("meta").a("property", "og:image:alt").a("content", pageTitre).fg();
		e("meta").a("property", "og:type").a("content", "article").fg();
		e("meta").a("name", "twitter:card").a("content", "summary_large_image").fg();
		e("meta").a("name", "twitter:site").a("content", "@computateorg").fg();
		e("meta").a("name", "twitter:creator").a("content", "@computateorg").fg();
		e("meta").a("name", "twitter:title").a("content", pageTitre).fg();
		e("meta").a("name", "twitter:description").a("content", pageDescription).fg();
		e("meta").a("name", "twitter:image").a("content", pageImageUrl).fg();
		e("meta").a("name", "description").a("content", pageDescription).fg();
	}

	@Override()
	public void  htmlScriptsMiseEnPage() {
//		e("script").a("src", "https://code.jquery.com/jquery-1.12.4.min.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/jquery-1.12.4.min.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/site.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/moment.min.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/jqDatePicker.js").f().g("script");
		e("script").a("src", statiqueUrlBase, "/js/jquery.serialize-object.js").f().g("script");
//		e("script").a("async", "").a("defer", "").a("src", "https://apis.google.com/js/platform.js").f().g("script");
//		e("script").a("async", "").a("src", "https://www.googletagmanager.com/gtag/js?id=UA-118970786-1").f().g("script");
//		e("script").f().l("/*<![CDATA[*/");
//			l("window.dataLayer = window.dataLayer || [];");
//			l("function gtag(){dataLayer.push(arguments);}");
//			l("gtag('js', new Date());");
//			l("gtag('config', 'UA-118970786-1');");
//		s("/*]]>*/").g("script");
	}

	@Override()
	public void  htmlScriptMiseEnPage() {
	}

	@Override()
	public void  htmlStylesMiseEnPage() {
		e("link").a("rel", "stylesheet").a("href", statiqueUrlBase, "/css/w3.css").fg();
		e("link").a("rel", "stylesheet").a("href", statiqueUrlBase, "/css/site.css").fg();
		e("link").a("rel", "stylesheet").a("href", statiqueUrlBase, "/css/datePicker.css").fg();
		e("link").a("rel", "stylesheet").a("href", "https://fonts.googleapis.com/css?family=Khand").fg();
		e("link").a("rel", "stylesheet").a("href", "https://fonts.googleapis.com/css?family=Raleway").fg();
		e("link").a("rel", "stylesheet").a("href", "https://pro.fontawesome.com/releases/v5.7.1/css/all.css").a("integrity", "sha384-6jHF7Z3XI3fF4XZixAuSu0gGKrXwoX/w3uFPxC56OtjChio7wtTGJWRW53Nhx6Ev").a("crossorigin", "anonymous").fg();
	}

	@Override()
	public void  htmlStyleMiseEnPage() {
	}

	@Override()
	public void  htmlBodyMiseEnPage() {
	}

	@Override()
	public void  htmlMiseEnPage() {
		if(requeteSite_.getOperationRequete().getParams().getJsonObject("query").getBoolean("pageRecapituler")) {
			pageRecapituler();
		}
		else {
			e("html").a("xmlns:xlink", "http://www.w3.org/1999/xlink").a("xmlns", "http://www.w3.org/1999/xhtml").a("xmlns:fb", "http://ogp.me/ns/fb#").f();
				e("head").f();
					e("title").f();
						sx(pageTitre);
					g("title");
					htmlMeta();
					htmlScripts();
					e("script").f().l("/*<![CDATA[*/");
					htmlScript();
					s("/*]]>*/").g("script");
					htmlStyles();
					e("style").f().l("/*<![CDATA[*/");
					htmlStyle();
					s("/*]]>*/").g("style");
		
				g("head");
				e("body").a("class", "w3-light-grey ").f(); 
					e("a").a("name", "top").f().g("a");
					JsonObject params = requeteSite_.getOperationRequete().getParams();
					if(StringUtils.equals("*:*", params.getJsonObject("query").getString("q")) && params.getJsonObject("query").getJsonArray("fq") == null) {
						e("script").a("type", "text/javascript").a("async", "").a("defer", "").a("src", "//assets.pinterest.com/js/pinit_main.js?0.8726554954646004").f().g("script");
						e("div").a("id", "fb-root").f().g("div");
						e("script").f().l("/*<![CDATA[*/");
							l("(function(d, s, id) {");
							l("var js, fjs = d.getElementsByTagName(s)[0];");
							l("if (d.getElementById(id)) return;");
							l("js = d.createElement(s); js.id = id;");
							s("js.src = '");
							s("//connect.facebook.net/en_US/sdk.js#xfbml=1&version=v2.10&appId=1871568493111919");
							l("';");
							l("fjs.parentNode.insertBefore(js, fjs);");
							l("}(document, 'script', 'facebook-jssdk'));");
						s("/*]]>*/").g("script");
						e("script").f().l("/*<![CDATA[*/");
							s("var _ctct_m = \"805a4a78c2843d257b9b05ea244b6ec7\"; ");
						s("/*]]>*/").g("script");
						e("script").a("id", "signupScript").a("src", "//static.ctctcdn.com/js/signup-form-widget/current/signup-form-widget.min.js").a("async", "").a("defer", "").f();
						g("script");
					}
					e("div").a("id", "modaleErreur").a("class", "w3-modal").a("onclick", "this.style.display = 'none';").f();
						e("div").a("class", "w3-modal-content w3-animate-zoom").f();
							e("header").a("class", "w3-container w3-center w3-red ").f();
								e("h3").f();
									sx("Une erreur s'est produite. ");
								g("h3");
							g("header");
						g("div");
						e("div").a("id", "modaleErreurMessage").a("class", "w3-container w3-center").f().g("div");
						e("header").a("class", "w3-container w3-center w3-padding-16 ").f();
							sx("L'erreur a été envoyée par e-mail à l'administrateur pour analyse. ");
						g("header");
					g("div");
					e("div").a("class", "site-section-all ").f();
						e("div").a("class", "site-section-above w3-light-grey ").f();
							e("div").a("class", "w3-center w3-black w3-text-white ").f();
		//							e("img").a("src", "/img/trailblaze-top.jpg").a("class", "w3-img ").a("style", "width: 100%; margin-bottom: -10px; ").fg();
								menu();
							g("div");
							e("div").a("id", "site-section-primary").a("class", "site-section-primary w3-text-black w3-padding-bottom-32 ").f();
								e("div").a("class", "w3-content ").f();
		
									{ t(3).e("div").a("class", "w3-card w3-padding w3-margin-top w3-show w3-white ").f();
										htmlBody();
									} t(3).g("div");
	
									{ t(3).e("div").a("class", "w3-row ").f();
										htmlBodyCourt();
									} t(3).g("div");
		
									abondonnezPas();
		
									partagerPage();
	
								g("div");
								e("footer").a("class", "w3-center w3-black w3-padding-48 ").f();
									e("div").a("class", "w3-xxlarge ").f();
										sx("This site is open source. ");
									g("div");
									e("div").a("class", "w3-large ").f();
										String urlSource = "https://github.com/computate/computate.org/blob/master/src/main/java/" + StringUtils.replace(getClass().getSuperclass().getSuperclass().getCanonicalName(), ".", "/") + ".java";
										e("a").a("href", urlSource).a("target", "_new").a("class", "grow-30 ").f();
											sx("View the source code here on github. ");
										g("a");
									g("div");
									e("div").a("class", "grow-30 w3-margin ").f();
										e("a").a("href", "https://www.openshift.com/").a("target", "_new").f();
											e("span").a("class", "w3-large ").f();
												sx("Powered by ");
											g("span");
											e("img").a("class", "w3-image ").a("style", "display: inline-block; width: 200px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/openshift.svg").fg();
										g("a");
									g("div");
								g("footer");
							g("div");
						g("div");
					g("div");
					e("div").a("class", "w3-row site-section-contact w3-text-white ").f();
						e("div").a("class", "w3-content w3-center  w3-cell-row w3-margin-bottom-32 ").f();
							menu();
							e("div").a("class", "w3-container ").f();
								e("div").a("class", "w3-container w3-text-black w3-margin-top ").f();
									e("h6").a("id", "h2-contactez-nous").a("class",  "w3-xlarge w3-text-white ").f();
										sx("Let's get connected. ");
									g("h6");
									e("div").a("style", "").f();
										e("a").a("target", "_new").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://www.facebook.com/computateorg/").f();
											e("img").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/facebook.svg").fg();
										g("a");
										e("a").a("target", "_new").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://twitter.com/computateorg").f();
											e("img").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/twitter.svg").fg();
										g("a");
										e("a").a("target", "_new").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://www.instagram.com/computateorg/").f();
											e("img").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/instagram.svg").fg();
										g("a");
										e("a").a("target", "_new").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", "https://openclipart.org/user-detail/computateorg").f();
											e("img").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/openclipart.svg").fg();
										g("a");
										e("a").a("target", "_new").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", pageYoutubeUrl).f();
											e("img").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/youtube.svg").fg();
										g("a");
										e("a").a("target", "_new").a("rel", "noopener noreferrer").a("data-ajax", "false").a("href", pagePinterestUrl).f();
											e("img").a("class", "grow-30 ").a("style", "display: inline-block; width: 50px; height: 50px; margin: 0 10px;").a("src", statiqueUrlBase, "/svg/pinterest.svg").fg();
										g("a");
									g("div");
									e("h6").f();
										e("a").a("href", "#top").a("class", "w3-text-white ").f();
											sx("Up to the top. ");
										g("a");
									g("h6");
								g("div");
							g("div");
						g("div");
					g("div");
				g("body");
			g("html");
		}
	}

	public void  menu() {
		e("div").a("class", "w3-bar w3-text-white w3-padding-bottom-8 w3-padding-top-8 ").a("style", "padding-left: 16px; padding-right: 16px; ").f();
//			e("div").a("class", "site-bar-item w3-bar-item ").f();
//				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageAccueilUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/computate-keys.svg").a("style", "width: 250px; ").fg();
//					e("br").fg();
////					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
////						sx("computate");
////					g("span");
//				g("a");
//			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("span").a("class", "header-icon-a grow-30 w3-center ").f();
					e("a").a("class", "w3-hover-opacity").a("title", "English").a("href", pageUri).f();
						e("img").a("src", statiqueUrlBase, "/svg/flag-US.svg").a("style", "height: 50px; ").fg();
					g("a");
					e("a").a("class", "w3-hover-opacity").a("title", "français").a("href", pageUriFrFR).f();
						e("img").a("src", statiqueUrlBase, "/svg/flag-FR.svg").a("style", "height: 50px; ").fg();
					g("a");
					e("br").fg();
					e("span").a("class", "site-menu-item").f();
						sx("Language");
					g("span");
				g("span");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageAccueilUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/computate-keys.svg").a("style", "width: 250px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
						sx("Home");
					g("span");
				g("a");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageBlogUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/full-moon.svg").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
						sx("Blog");
					g("span");
				g("a");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageCoursUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/cluster.svg").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
						sx("Courses");
					g("span");
				g("a");
			g("div");
//			e("div").a("class", "site-bar-item w3-bar-item ").f();
//				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageCoursUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/full-moon.svg").a("style", "height: 50px; ").fg();
//					e("br").fg();
//					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
//						sx("Lessons");
//					g("span");
//				g("a");
//			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageAProposUri).f();
//					e("img").a("src", statiqueUrlBase, "/png/computate.png").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
						sx("About");
					g("span");
				g("a");
			g("div");
			e("div").a("class", "site-bar-item w3-bar-item ").f();
				e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageFaqUri).f();
//					e("img").a("src", statiqueUrlBase, "/svg/ufo.svg").a("style", "height: 50px; ").fg();
					e("br").fg();
					e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
						sx("FAQ");
					g("span");
				g("a");
			g("div");
			if(requeteSite_.getUtilisateurId() == null) {
				e("div").a("class", "site-bar-item w3-bar-item ").f();
					e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageUtilisateurUri).f(); 
//						e("img").a("src", statiqueUrlBase, "/svg/astronaut-helmet.svg").a("style", "height: 50px; ").fg();
						e("br").fg();
						e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
							sx("Login");
						g("span");
					g("a");
				g("div");
			}
			if(requeteSite_.getUtilisateurId() != null) {
				e("div").a("class", "site-bar-item w3-bar-item ").f();
					e("a").a("class", "header-icon-a grow-30 w3-hover-opacity w3-center ").a("href", pageDeconnexionUri).f();
//						e("img").a("src", statiqueUrlBase, "/svg/light-speed.svg").a("style", "height: 50px; ").fg();
						e("br").fg();
						e("span").a("class", "site-menu-item").a("id", "computate_org_span").f();
							sx("Logout");
						g("span");
					g("a");
				g("div");
			}
		g("div");
	}

	public void  abondonnezPas() {
		{ e("div").a("class", "w3-padding w3-margin-top w3-center site-abondonnezPas-div ").f();
			e("h3").f().sx("Don't give up on your dreams. You can do hard things! ").g("h3");
			{ e("div").f();
				e("img").a("class", "w3-image ").a("src", statiqueUrlBase, "/svg/computate-keys.svg").fg();
			} g("div");
		} g("div");
	}

	public void  partagerPage() {
		JsonObject params = requeteSite_.getOperationRequete().getParams();
		if(StringUtils.equals("*:*", params.getJsonObject("query").getString("q")) && params.getJsonObject("query").getJsonArray("fq") == null) {
			{ e("div").a("class", "w3-content w3-center w3-margin w3-padding-top-32 ").f();
				e("h3").f().sx("Share this story. ").g("h3");
				{ e("div").a("class", "w3-cell-row ").f();
					{ e("div").a("class", "blog-publication-social-div w3-cell ").f();
						e("img").a("class", "blog-publication-social-img").a("src", statiqueUrlBase, "/svg/facebook.svg").fg();
						{ e("div").f();
							e("div").a("class", "fb-like").a("data-href", pageUrl).a("data-layout", "box_count").a("data-action", "like").a("data-size", "small").a("data-show-faces", "true").a("data-share", "true").f().g("div");
						} g("div");
					} g("div");
					{ e("div").a("class", "blog-publication-social-div w3-cell ").f();
						e("img").a("class", "blog-publication-social-img").a("src", statiqueUrlBase, "/svg/twitter.svg").fg();
						{ e("div").f();
							e("a").a("href", "https://twitter.com/share").a("class", "twitter-share-button ").a("data-show-count", "false").f().g("a");
							e("script").a("async", "").a("charset", "utf-8").a("src", "//platform.twitter.com/widgets.js").f().g("script");
						} g("div");
					}g("div");
					{ e("div").a("class", "blog-publication-social-div w3-cell ").f();
						e("img").a("class", "blog-publication-social-img").a("src", statiqueUrlBase, "/svg/pinterest.svg").fg();
						{ e("div").a("class",  "pinterest-div ").f();
							{ e("a");
								a("data-pin-media", pageImageUrl);
								a("data-pin-description", pageDescription);
								a("data-pin-url", pageUrl);
								a("data-pin-id", "");
								a("href", "https://www.pinterest.com/pin/create/button/");
								a("data-pin-do", "buttonPin");
								f();
									e("img").a("src", "//assets.pinterest.com/images/pidgets/pinit_fg_en_rect_gray_20.png").fg();
							} g("a");
						} g("div");
					} g("div");
				} g("div");
			} g("div");
		}
	}

	public String formaterDateHeureCourt(Date date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATDateHeureCourt.format(date.toInstant().atZone(ZoneId.systemDefault()));
		}
		return resultat;
	}

	public String formaterDateCourt(Date date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATDateCourt.format(date.toInstant().atZone(ZoneId.systemDefault()));
		}
		return resultat;
	}

	public String formaterDateAffichage(Date date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATAffichage.format(date.toInstant());
		}
		return resultat;
	}

	public String formaterDateAffichage(LocalDateTime date) {
		String resultat = "";
		if(date != null) {
			resultat = FORMATAffichage.format(date);
		}
		return resultat;
	}

	public MiseEnPage e(String nomLocal) {
		String nomLocalParent = requeteSite_.getXmlPile().isEmpty() ? null : requeteSite_.getXmlPile().peek();

		boolean eNoWrapParent = nomLocalParent == null || HTML_ELEMENTS_NO_WRAP.contains(nomLocalParent);
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		requeteSite_.getXmlPile().push(nomLocal);
		if(StringUtils.equals(nomLocal, "html"))
			w.s("<!DOCTYPE html>\n");
		if(!eNoWrapParent && !tabulationsEchappes.isEmpty()) {
			w.l();
			w.s(tabulations);
		}
		w.s("<");
		w.s(nomLocal);
		
		return this;
	}

	public MiseEnPage a1(String nomAttribut, Object...objets) {
		w.s(" ");
		w.s(nomAttribut);
		w.s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				w.s(OutilXml.echapperDansCitatations(s));
			}
		}
		
		return this;
	}

	public MiseEnPage a(String nomAttribut, Object...objets) {
		w.s(" ");
		w.s(nomAttribut);
		w.s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				w.s(OutilXml.echapperDansCitatations(s));
			}
		}
		w.s("\"");
		
		return this;
	}

	public MiseEnPage a2() {
		w.s("\"");
		
		return this;
	}

	public MiseEnPage f() {
		w.s(">");
		
		return this;
	}

	public MiseEnPage s(Object...objets) {
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.s();
					w.s(s);
				}
				else {
					String s = objet.toString();
					w.s(s);
				}
			}
		}
		
		return this;
	}

	public MiseEnPage t(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s("\t");
		s(objets);
		return this;
	}

	public MiseEnPage tl(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s("\t");
		s(objets);
		s("\n");
		return this;
	}

	public MiseEnPage l(Object...objets) {
		s(objets);
		s("\n");
		return this;
	}

	public MiseEnPage lx(Object...objets) {
		s(objets);
		sx("\n");
		return this;
	}

	public MiseEnPage sx(Object...objets) {
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.toString();
					w.s(OutilXml.echapper(s));
				}
				else {
					String s = objet.toString();
					w.s(OutilXml.echapper(s));
				}
			}
		}
		
		return this;
	}

	public MiseEnPage tx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		return this;
	}

	public MiseEnPage tlx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		sx("\n");
		return this;
	}

	public MiseEnPage fg() {
		w.s("/>");
		requeteSite_.getXmlPile().pop();
		
		return this;
	}

	public MiseEnPage g(String nomLocal) {
		String nomLocalParent = requeteSite_.getXmlPile().peek();
		boolean eNoWrap = nomLocalParent == null || HTML_ELEMENTS_NO_WRAP.contains(nomLocal);

		requeteSite_.getXmlPile().pop();
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		if(!eNoWrap && !tabulationsEchappes.isEmpty()) {
			w.l();
			w.s(tabulations);
		}
		w.s("</");
		w.s(nomLocal);
		w.s(">");
		
		return this;
	}
}
