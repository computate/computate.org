package org.computate.site.frFR.cours.c001.l002; 

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.page.parti.QuestionReponse;

/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/002-choisir-ordinateur
 * ApiUriRechercheEnUSPage: /enUS/course/001/002-choose-computer
 * PageRechercheFrFRPage: C001L002ChoisirOrdinateurFrFRPage
 * PageRechercheEnUSPage: C001L002ChoisirOrdinateurEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Quel type d'ordinateur dois-je avoir pour construire mon propre site Web ? 
 * H1.enUS: What type of computer do I need to launch my own website? 
 * 
 * H2.frFR: Voici les 10 considérations & les plus importantes pour l'exécution d'un site Web sur votre propre ordinateur. 
 * H2.enUS: Here are the 10 most important considerations for running a website on your own computer. 
 * 
 * PageSimple: true
 * NomPluriel.frFR: lessons
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 616
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 616
 * VideoId.frFR: sBcDnQj9_QM
 * VideoId.enUS: sBcDnQj9_QM
*/ 
public class C001L002ChoisirOrdinateur extends C001L002ChoisirOrdinateurGen<C001Lecon> { 

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(2);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L002ChoisirOrdinateur.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _coursH1_frFR(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateur_H1);
	}

	@Override protected void _coursH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H1);
	}

	@Override protected void _coursH2_frFR(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateur_H2);
	}

	@Override protected void _coursH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateurEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateurFrFRPage_Uri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateurVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L002ChoisirOrdinateur_H1);
		addPageRecherche_frFR(C001L002ChoisirOrdinateur_H2);
		addPageRecherche_frFR(C001L002ChoisirOrdinateurVals);
	}

	public void htmlBody() {
		super.htmlBody();
	}

	public void htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	/**
	 * 
	 * Val.P.frFR:Envisagez-vous de créer votre propre site Web ? 
	 * Val.P.frFR:Peut-être vous demandez-vous quel type d'ordinateur il faut pour lancer votre propre site Web ? 
	 * Val.P.enUS:Are you thinking about launching your own website? 
	 * Val.P.enUS:Are you wondering what kind of computer it takes to launch your own website? 
	 */
	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	/**
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.frFR:Je vais vous expliquer le genre d'ordinateur que j'ai pour vous aider à décider. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 * Val.P.enUS:I'll take you through the kind of computer I have to help you decide. 
	 */
	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}

	/**
	 * 
	 * Val.Question.frFR:Est-t-il important d'acheter un nom de domaine à l'avance ? 
	 * Val.Question.enUS:Is it important to purchase a domain name ahead of time? 
	 * Val.QuestionCourt.frFR:Devrais je l'acheter à l'avance ? 
	 * Val.QuestionCourt.enUS:Should I buy it ahead of time? 
	 * Val.Reponse.frFR:Vous devez savoir maintenant comment vous appelez votre site, afin que vous ne seriez pas perdu. 
	 * Val.Reponse.enUS:You need to know now what your site will be called so you don't get lost. 
	 * Val.ReponseCourt.frFR:Savoir maintenant comment vous appelez votre site
	 * Val.ReponseCourt.enUS:Know what your site will be called
	 * Val.P.frFR:Vous pouvez commencer aujourd'hui avec votre propre ordinateur à construire votre propre site Web, mais vous devez comprendre ce que le site s'appele. 
	 * Val.P.frFR:Le destin du nom de votre ordinateur en dépend. 
	 * Val.P.frFR:Les répertoires où vous mettez votre site Web l'attendent. 
	 * Val.P.frFR:Toutes les applications qui font partie du site Web devront le connaître. 
	 * Val.P.frFR:Alors, passez du temps et pensez au .com, .fr ou .nimporte qui représentera votre vision, puis revenez ici et je vais vous aider à partir de là. 
	 * Val.P.enUS:You can start today with your very own computer building your own website, but you must figure out what it will be called. 
	 * Val.P.enUS:The fate of the name of your computer depends on it. 
	 * Val.P.enUS:The directories where you will be putting your website are waiting for it. 
	 * Val.P.enUS:All the applications that are part of the website will need to know it. 
	 * Val.P.enUS:So go take some time and think of the perfect .com, .org or .whatever that will represent your vision, and then come back here and I'll help you from there. 
	 */  
	protected void _aLAvance(QuestionReponse o) {      

	}

}
