package org.computate.site.frFR.page.apropos; 

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
 * ApiUriRechercheFrFRPage: /frFR/apropos
 * ApiUriRechercheEnUSPage: /enUS/about
 * PageRechercheFrFRPage: PageAProposFrFRPage
 * PageRechercheEnUSPage: PageAProposEnUSPage
 * PageSuperRechercheFrFRPage: ArticleFrFRPage
 * PageSuperRechercheEnUSPage: ArticleEnUSPage
 * 
 * Titre.frFR: Qui est Christopher Tate ? Tout à propos de moi. 
 * Titre.enUS: Who is Christopher Tate? All about me. 
 * 
 * H1.frFR: Qui est Christopher Tate ? 
 * H1.enUS: Who is Christopher Tate? 
 * 
 * H2.frFR: Tout à propos de moi. 
 * H2.enUS: All about me. 
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
public class PageAPropos extends PageAProposGen<Article> {   

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(PageAPropos.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.apropos.PageAPropos.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_Uri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAProposVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageAPropos_H1);
		addPageRecherche_frFR(PageAPropos_H2);
		addPageRecherche_frFR(PageAProposVals);
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		c.o(PageAPropos_H1 + PageAPropos_H2);
	}  

	@Override protected void _pageH1(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o(PageAPropos_H2);
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
	 * Val.Question.frFR:D'où venez-vous ? 
	 * Val.Question.enUS:Where are you from? 
	 * Val.QuestionCourt.frFR:D'où venez-vous ? 
	 * Val.QuestionCourt.enUS:Where are you from? 
	 * Val.Reponse.frFR:Je suis un Américain d'Utah qui adore se balader. 
	 * Val.Reponse.enUS:I am from Utah and a wanderer at heart. 
	 * Val.ReponseCourt.frFR:Je suis un Américain d'Utah qui adore se balader. 
	 * Val.ReponseCourt.enUS:I am from Utah and a wanderer at heart. 
	 * Val.P.frFR:J'aime faire de la randonnée dans des montagnes avec ma famille. 
	 * Val.P.frFR:J'ai aussi vécu en Floride, en Idaho, en Ontario, au Québec et en France.
	 * Val.P.frFR:J'adore le temps que j'ai vécu et travaillé dans d'autres pays et la manière dont les logiciels open source rapprochent le monde.
	 * Val.P.frFR:Je connais les défis à créer de bons systèmes logiciels où le pays parle une autre langue que l'anglais. 
	 * Val.P.enUS:I love spending time in the great outdoors with my family. 
	 * Val.P.enUS:I've also lived in Florida, Idaho, Ontario, Quebec and France. 
	 * Val.P.enUS:I love the time I lived and worked in other countries, and the ways open source software brings the world together. 
	 * Val.P.enUS:I know the challenges of building good software systems in non-English speaking countries. 
	 */ 
	protected void _ouVenezVous(QuestionReponse o) {

		o.questionIcone("fas", "location");
		o.setQuestion(ouVenezVousQuestion);
		o.setQuestionCourt(ouVenezVousQuestionCourt);

		o.reponseIcone("fas", "globe-americas");
		o.setReponse(ouVenezVousReponse);
		o.setReponseCourt(ouVenezVousReponseCourt);
	}
	public void htmlBodyOuVenezVous(QuestionReponse o) { 
		e("p").f();
			e("div").a("class", "w3-row w3-mobile ").f();
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/idaho-winter.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/idaho-winter.jpg").fg();
					g("a");
					e("a").a("href", statiqueUrlBase, "/jpg/utah-mountains2.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/utah-mountains2.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/utah-mountains.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/utah-mountains.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/idaho.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/idaho.jpg").fg();
					g("a");
					e("a").a("href", statiqueUrlBase, "/jpg/quebec.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/quebec.jpg").fg();
					g("a");
				g("div");
				e("div").a("class", "w3-quarter w3-mobile ").f();
					e("a").a("href", statiqueUrlBase, "/jpg/france.jpg").f();
						e("img").a("class", "w3-image w3-hover-opacity ").a("src", statiqueUrlBase, "/jpg/france.jpg").fg();
					g("a");
				g("div");
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-mountains site-menu-icon ").f().g("i");
				sx(ouVenezVousP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-globe-africa site-menu-icon ").f().g("i");
				sx(ouVenezVousP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-heart-square site-menu-icon ").f().g("i");
				sx(ouVenezVousP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-robot site-menu-icon ").f().g("i");
				sx(ouVenezVousP4);
			g("div");
		g("p");
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Comment vous avez appris l'informatique ? 
	 * Val.Question.enUS:How did you learn computer programming? 
	 * Val.QuestionCourt.frFR:Comment vous avez appris l'informatique ? 
	 * Val.QuestionCourt.enUS:How did you learn computer programming? 
	 * Val.Reponse.frFR:Une passion pour les ordinateurs toute ma vie. 
	 * Val.Reponse.enUS:A love for computers all my life. 
	 * Val.ReponseCourt.frFR:Une passion pour les ordinateurs toute ma vie. 
	 * Val.ReponseCourt.enUS:A love for computers all my life. 
	 * Val.P.frFR:Tant que je connaissais mon père, il était programmeur de bases de données Lotus Notes. 
	 * Val.P.frFR:Il avait toujours à la maison, un bon ordinateur avec la dernière suite Microsoft à la maison.
	 * Val.P.frFR:Je passais des heures, chaque jour, à imaginer tout ce que je pouvais faire sur l'ordinateur.
	 * Val.P.frFR:Chaque appli, chaque répertoire, chaque fichier, chaque élément de menu, chaque raccourci clavier, je les connais bien.
	 * Val.P.frFR:J'ai posé à mon père de nombreuses questions importantes, comme comment écrire du code? Comment créer une base de données?
	 * Val.P.frFR:J'ai reçu un grand manuel Visual Basic et il m'a indiqué Microsoft Access.
	 * Val.P.enUS:My dad has been a Lotus Notes database programmer as long as I can remember. 
	 * Val.P.enUS:He always had a nice computer with the latest Microsoft suite at home for the family to use. 
	 * Val.P.enUS:I spent hours every day figuring out everything I could possibly do on the computer. 
	 * Val.P.enUS:I became familiar with every application, every directory, every file, every menu item, every keyboard shortcut. 
	 * Val.P.enUS:I asked my dad many important questions, like: "how do I write code?" "How do I make a database?" 
	 * Val.P.enUS:I was then gifted a large Visual Basic manual, and he pointed me to Microsoft Access. 
	 */ 
	protected void _informatique(QuestionReponse o) {

		o.questionIcone("fas", "book");
		o.setQuestion(informatiqueQuestion);
		o.setQuestionCourt(informatiqueQuestionCourt);

		o.reponseIcone("fas", "save");
		o.setReponse(informatiqueReponse);
		o.setReponseCourt(informatiqueReponseCourt);
	}
	public void htmlBodyInformatique(QuestionReponse o) { 
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

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Comment avez-vous commencé à travailler en tant que programmeur en informatique ? 
	 * Val.Question.enUS:How did you start working as a computer programmer? 
	 * Val.QuestionCourt.frFR:Comment avez-vous commencé à travailler en tant que programmeur en informatique ? 
	 * Val.QuestionCourt.enUS:How did you start working as a computer programmer? 
	 * Val.Reponse.frFR:La poussée de terminer chaque projet et d’être à la prochaine occasion de faire évoluer ma carrière. 
	 * Val.Reponse.enUS:The drive to finish each project, and be at the next opportunity to grow my career. 
	 * Val.ReponseCourt.frFR:La poussée de terminer chaque projet et d’être à la prochaine occasion de faire évoluer ma carrière. 
	 * Val.ReponseCourt.enUS:The drive to finish each project, and be at the next opportunity to grow my career. 
	 * Val.P.frFR:J'ai commencé à écrire des programmes et des jeux sur ma calculatrice TI-86.
	 * Val.P.frFR:Je savais, à partir de l'université, que j'étudierais l'informatique.
	 * Val.P.frFR:Au même temps, je suis devenu informaticien à temps partiel pour une société humanitaire locale, faisant mon mieux à résoudre des problèmes mondiaux avec une bases de données.
	 * Val.P.frFR:Après avoir obtenu mon diplôme en Informatique, j'ai commencé en tant que consultant en logiciels; j'ai travaillé sur de nombreux projets passionnants dans de grandes entreprises.
	 * Val.P.frFR:Après 5 ans, j'ai chercher un travail en France, où j'ai travaillé avec une très petite société spécialisée dans les technologies de recherche open source, notamment Lucene.
	 * Val.P.frFR:Et ensuite, dans une entreprise de formation Linux en Utah, où je me suis familiarisé avec les principes de l'origine de Linux.
	 * Val.P.frFR:Mon amour pour le conseil, mon expérience, et le fait d'être au bon endroit au bon moment m'ont ensuite conduit à Red Hat.
	 * Val.P.frFR:J'ai enfin trouvé mes collegues similaires ici chez Red Hat, et je suis là pour rester.
	 * Val.P.enUS:I started writing calculator programs and games on my TI-86 calculator. 
	 * Val.P.enUS:I went on to study Computer Science at University. 
	 * Val.P.enUS:At the same time, I became the part time computer guy for a local humanitarian organization, doing my best to solve world problems with databases. 
	 * Val.P.enUS:After graduation, I started as a Software Consultant and worked on many exciting projects at large companies. 
	 * Val.P.enUS:After 5 years, I had the opportunity to take a job in France, where I worked with a très petite société, which specialized in open source search technology, specifically Lucene. 
	 * Val.P.enUS:I then worked with a Linux training company in Utah where I became very familiar with the whys of the origin of Linux. 
	 * Val.P.enUS:My love for consulting, my experience, and being at the right place at the right time then led me to Red Hat. 
	 * Val.P.enUS:I have found my people, at long last, here at Red Hat and I am here to stay. 
	 */ 
	protected void _emploi(QuestionReponse o) {

		o.questionIcone("fas", "briefcase");
		o.setQuestion(emploiQuestion);
		o.setQuestionCourt(emploiQuestionCourt);

		o.reponseIcone("fas", "rocket");
		o.setReponse(emploiReponse);
		o.setReponseCourt(emploiReponseCourt);
	}
	public void htmlBodyEmploi(QuestionReponse o) { 
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
				e("i").a("class", "fab fa-linux site-menu-icon ").f().g("i");
				sx(emploiP6);
			g("div");
			e("div").f();
				e("i").a("class", "fab fa-redhat site-menu-icon ").f().g("i");
				sx(emploiP7);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-laugh-beam site-menu-icon ").f().g("i");
				sx(emploiP8);
			g("div");
		g("p");
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Comment êtes-vous devenu si passionné par l'open source? 
	 * Val.Question.enUS:How did you become so passionate about open source? 
	 * Val.QuestionCourt.frFR:Comment êtes-vous devenu si passionné par l'open source? 
	 * Val.QuestionCourt.enUS:How did you become so passionate about open source? 
	 * Val.Reponse.frFR:La liberté de construire sur la merveille. 
	 * Val.Reponse.enUS:The freedom to build upon greatness. 
	 * Val.ReponseCourt.frFR:La liberté de construire sur la merveille. 
	 * Val.ReponseCourt.enUS:The freedom to build upon greatness. 
	 * Val.P.frFR:J'ai rencontré mon premier ordinateur Linux au laboratoire d'informatique Linux à l'Université, où je pensais que seuls les nobles magiciens de la programmation informatique vivaient et dormaient. 
	 * Val.P.frFR:Au même temps, mon cousin utilisé Linux et m'a encouragé à l'essayer moi-même. 
	 * Val.P.frFR:Une nuit, après avoir réalisé que Microsoft et le .NET Framework m'abandonnaient après l'obtention de mon diplôme avec des frais exorbitants, j'ai changé. 
	 * Val.P.frFR:J'ai sauvegardé ma vie numérique sur un disque zip coûteux de la librairie, installé Ubuntu Linux et effacé Microsoft de ma vie personnelle pour toujours. 
	 * Val.P.frFR:Je n'ai jamais regardé en arrière et jamais regretté cette décision. 
	 * Val.P.enUS:I met my first Linux computer at the University Linux computer lab, where I figured only the noble wizards of computer programming lived and slept. 
	 * Val.P.enUS:Around the same time, my cousin introduced me to Linux, and gave me some encouragement to try it myself. 
	 * Val.P.enUS:One night, after realizing that Microsoft and the .NET Framework would forsake me after graduation with exorbitant fees, I made the switch. 
	 * Val.P.enUS:I backed up my digital life on an expensive zip disk from the bookstore and installed Ubuntu Linux, wiping Microsoft out of my personal life forever. 
	 * Val.P.enUS:I never looked back, and never regretted that decision. 
	 */ 
	protected void _opensource(QuestionReponse o) {

		o.questionIcone("fas", "heart");
		o.setQuestion(opensourceQuestion);
		o.setQuestionCourt(opensourceQuestionCourt);

		o.reponseIcone("fas", "dove");
		o.setReponse(opensourceReponse);
		o.setReponseCourt(opensourceReponseCourt);
	}
	public void htmlBodyOpensource(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				e("i").a("class", "fas fa-hat-wizard site-menu-icon ").f().g("i");
				sx(opensourceP1);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-laptop site-menu-icon ").f().g("i");
				sx(opensourceP2);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-strikethrough site-menu-icon ").f().g("i");
				sx(opensourceP3);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-save site-menu-icon ").f().g("i");
				sx(opensourceP4);
			g("div");
			e("div").f();
				e("i").a("class", "fas fa-arrow-alt-square-right site-menu-icon ").f().g("i");
				sx(opensourceP5);
			g("div");
		g("p");
	}
}
