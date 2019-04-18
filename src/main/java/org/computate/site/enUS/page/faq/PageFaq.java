package org.computate.site.enUS.page.faq;

import java.util.List;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.article.Article;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.enUS.recherche.ListeRecherche;

public class PageFaq extends PageFaqGen<Article> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(PageFaq.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.faq.PageFaq.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageFaqEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageFaqFrFRPage_Uri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaq_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.faq.PageFaq.PageFaqVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageFaq_H1);
		addPageRecherche_frFR(PageFaq_H2);
		addPageRecherche_frFR(PageFaqVals);
	}

	@Override()
	protected void  _pageTitre(Couverture<String> c) {
		c.o(PageFaq_H1 + PageFaq_H2);
	}

	@Override()
	protected void  _pageH1(Couverture<String> c) {
		c.o(PageFaq_H1);
	}

	@Override()
	protected void  _pageH2(Couverture<String> c) {
		c.o(PageFaq_H2);
	}

	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("archive_indexed_boolean", ORDER.asc);
		o.addSort("supprime_indexed_boolean", ORDER.asc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
	}

	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	protected void _i18n(QuestionReponse o) {

		o.questionIcone("fas", "archway");
		o.setQuestion(i18nQuestion);
		o.setQuestionCourt(i18nQuestionCourt);

		o.reponseIcone("fas", "book-spells");
		o.setReponse(i18nReponse);
		o.setReponseCourt(i18nReponseCourt);
	}

	public void  htmlBodyI18n(QuestionReponse o) { 
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
