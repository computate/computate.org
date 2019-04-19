package org.computate.site.enUS.page.apropos;

import java.util.List;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.article.Article;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.QuestionReponse;
import org.computate.site.enUS.recherche.ListeRecherche;

public class PageAPropos extends PageAProposGen<Article> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(PageAPropos.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.apropos.PageAPropos.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_Uri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAProposVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageAPropos_H1);
		addPageRecherche_frFR(PageAPropos_H2);
		addPageRecherche_frFR(PageAProposVals);
	}

	@Override()
	protected void  _pageTitre(Couverture<String> c) {
		c.o(PageAPropos_H1 + PageAPropos_H2);
	}

	@Override()
	protected void  _pageH1(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override()
	protected void  _pageH2(Couverture<String> c) {
		c.o(PageAPropos_H2);
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

	protected void _ouVenezVous(QuestionReponse o) {

		o.questionIcone("fas", "location");
		o.setQuestion(ouVenezVousQuestion);
		o.setQuestionCourt(ouVenezVousQuestionCourt);

		o.reponseIcone("fas", "globe-americas");
		o.setReponse(ouVenezVousReponse);
		o.setReponseCourt(ouVenezVousReponseCourt);
	}

	public void  htmlBodyOuVenezVous(QuestionReponse o) { 
		e("p").f();
			e("div").a("class", "w3-row w3-mobile ").f();
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", "https://computate.neocities.org/jpg/idaho-winter.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", "https://computate.neocities.org/jpg/idaho-winter.jpg").fg();
					g("a");
					e("a").a("href", "https://computate.neocities.org/jpg/utah-mountains2.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", "https://computate.neocities.org/jpg/utah-mountains2.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", "https://computate.neocities.org/jpg/utah-mountains.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", "https://computate.neocities.org/jpg/utah-mountains.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", "https://computate.neocities.org/jpg/idaho.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", "https://computate.neocities.org/jpg/idaho.jpg").fg();
					g("a");
					e("a").a("href", "https://computate.neocities.org/jpg/quebec.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", "https://computate.neocities.org/jpg/quebec.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", "https://computate.neocities.org/jpg/france.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", "https://computate.neocities.org/jpg/france.jpg").fg();
					g("a");
				g("div");
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-temperature-hot site-menu-icon ").f().g("i");
				sx(ouVenezVousP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-sledding site-menu-icon ").f().g("i");
				sx(ouVenezVousP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-mountains site-menu-icon ").f().g("i");
				sx(ouVenezVousP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-globe-africa site-menu-icon ").f().g("i");
				sx(ouVenezVousP4);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-heart-square site-menu-icon ").f().g("i");
				sx(ouVenezVousP5);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-robot site-menu-icon ").f().g("i");
				sx(ouVenezVousP6);
			g("div");
		g("p");
	}

	protected void _informatique(QuestionReponse o) {

		o.questionIcone("fas", "book");
		o.setQuestion(informatiqueQuestion);
		o.setQuestionCourt(informatiqueQuestionCourt);

		o.reponseIcone("fas", "save");
		o.setReponse(informatiqueReponse);
		o.setReponseCourt(informatiqueReponseCourt);
	}

	public void  htmlBodyInformatique(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				e("i").a("class", "fas fa-male site-menu-icon ").f().g("i");
				sx(informatiqueP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-window-alt site-menu-icon ").f().g("i");
				sx(informatiqueP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-keyboard site-menu-icon ").f().g("i");
				sx(informatiqueP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-folders site-menu-icon ").f().g("i");
				sx(informatiqueP4);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-database site-menu-icon ").f().g("i");
				sx(informatiqueP5);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-book-spells site-menu-icon ").f().g("i");
				sx(informatiqueP6);
			g("div");
		g("p");
	}

	protected void _emploi(QuestionReponse o) {

		o.questionIcone("fas", "briefcase");
		o.setQuestion(emploiQuestion);
		o.setQuestionCourt(emploiQuestionCourt);

		o.reponseIcone("fas", "rocket");
		o.setReponse(emploiReponse);
		o.setReponseCourt(emploiReponseCourt);
	}

	public void  htmlBodyEmploi(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				e("i").a("class", "fas fa-calculator site-menu-icon ").f().g("i");
				sx(emploiP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-university site-menu-icon ").f().g("i");
				sx(emploiP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-hands-helping site-menu-icon ").f().g("i");
				sx(emploiP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-building site-menu-icon ").f().g("i");
				sx(emploiP4);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-flag-alt site-menu-icon ").f().g("i");
				sx(emploiP5);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-search site-menu-icon ").f().g("i");
				sx(emploiP6);
			g("div");
			e("div").f();
				e("i").a("class", "fab fa-linux site-menu-icon ").f().g("i");
				sx(emploiP7);
			g("div");
			e("div").f();
				e("i").a("class", "fab fa-redhat site-menu-icon ").f().g("i");
				sx(emploiP8);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-laugh-beam site-menu-icon ").f().g("i");
				sx(emploiP9);
			g("div");
		g("p");
	}

	protected void _opensource(QuestionReponse o) {

		o.questionIcone("fas", "heart");
		o.setQuestion(opensourceQuestion);
		o.setQuestionCourt(opensourceQuestionCourt);

		o.reponseIcone("fas", "dove");
		o.setReponse(opensourceReponse);
		o.setReponseCourt(opensourceReponseCourt);
	}

	public void  htmlBodyOpensource(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				e("i").a("class", "fas fa-hat-wizard site-menu-icon ").f().g("i");
				sx(opensourceP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-people-carry site-menu-icon ").f().g("i");
				sx(opensourceP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-laptop site-menu-icon ").f().g("i");
				sx(opensourceP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-strikethrough site-menu-icon ").f().g("i");
				sx(opensourceP4);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-save site-menu-icon ").f().g("i");
				sx(opensourceP5);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-arrow-alt-square-right site-menu-icon ").f().g("i");
				sx(opensourceP6);
			g("div");
		g("p");
	}
}
