package org.computate.site.frFR.page.faq;

import java.util.List;

import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.QuestionReponse;
import org.computate.site.frFR.recherche.ListeRecherche;

/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/faq
 * ApiUriRechercheEnUSPage: /enUS/faq
 * PageRechercheFrFRPage: PageFaqFrFRPage
 * PageRechercheEnUSPage: PageFaqEnUSPage
 * PageSuperRechercheFrFRPage: ArticleFrFRPage
 * PageSuperRechercheEnUSPage: ArticleEnUSPage
 * 
 * H1.frFR: Avez-vous des questions concernant computate.org ? 
 * H1.enUS: Have some questions about computate.org? 
 * 
 * H2.frFR: computate.org foire aux questions (FAQ). 
 * H2.enUS: computate.org frequently asked questions (FAQ). 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 616
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 616
*/ 
public class PageFaq extends PageFaqGen<Article> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(PageFaq.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.faq.PageFaq.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageFaqEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageFaqFrFRPage_Uri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaqVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageFaq_H1);
		addPageRecherche_frFR(PageFaq_H2);
		addPageRecherche_frFR(PageFaqVals);
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		c.o(PageFaq_H1 + PageFaq_H2);
	}  

	@Override protected void _pageH1(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("archive_indexed_boolean", ORDER.asc);
		o.addSort("supprime_indexed_boolean", ORDER.asc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
	}

	public void htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Pourquoi est votre site traduit en français ? 
	 * Val.Question.enUS:Why is your site in French? 
	 * Val.QuestionCourt.frFR:Pourquoi est votre site traduit en français ? 
	 * Val.QuestionCourt.enUS:Why is your site in French? 
	 * Val.Reponse.frFR:L'internationalisation est importante et le monde mérite la bonne documentation logicielle. 
	 * Val.Reponse.enUS:Internationalization is important and the world deserves good software documentation. 
	 * Val.ReponseCourt.frFR:L'internationalisation est importante et le monde mérite la bonne documentation logicielle. 
	 * Val.ReponseCourt.enUS:Internationalization is important and the world deserves good software documentation. 
	 * Val.P.frFR:L'internationalisation est importante et le monde mérite la bonne documentation logicielle. 
	 * Val.P.frFR:J'ai passé quatre ans et demi dans les pays francophones et c'est important pour moi de pratiquer mon français. 
	 * Val.P.frFR:J'aime les français et les années que j'ai passé en France, j'aime les Québécois et les années que j'ai passé au Québec. 
	 * Val.P.frFR:Je connais les défis à créer de bons systèmes logiciels où le pays parle une autre langue que l'anglais. 
	 * Val.P.frFR:Computate.org brise ces barrières et fournit une documentation cohérente en français et en anglais et dans d'autres langues à l'avenir. 
	 * Val.P.enUS:Internationalization is important and the world deserves good software documentation. 
	 * Val.P.enUS:I've spent four and a half years in French speaking countries and it's important for me to practice my French. 
	 * Val.P.enUS:I love the French and the time I spent in France, and I love the Québécois and the time I spent in Québec. 
	 * Val.P.enUS:I know the challenges building good software systems where the country speaks another language besides English. 
	 * Val.P.enUS:Computate.org breaks those barriers and provides a consistent documentation in French and English and other languages in the future. 
	 */ 
	protected void _i18n(QuestionReponse o) {

		o.questionIcone("fas", "archway");
		o.setQuestion(i18nQuestion);
		o.setQuestionCourt(i18nQuestionCourt);

		o.reponseIcone("fas", "book-spells");
		o.setReponse(i18nReponse);
		o.setReponseCourt(i18nReponseCourt);
	}
	public void htmlBodyI18n(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				e("i").a("class", "fas fa-globe-africa site-menu-icon ").f().g("i");
				sx(i18nP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-comments site-menu-icon ").f().g("i");
				sx(i18nP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-heart-square site-menu-icon ").f().g("i");
				sx(i18nP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-robot site-menu-icon ").f().g("i");
				sx(i18nP4);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-window-restore site-menu-icon ").f().g("i");
				sx(i18nP5);
			g("div");
		g("p");
	}
}
