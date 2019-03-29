package org.computate.site.enUS.cours.c001.l001;

import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;

public class C001L001ChoisirNomDomaine extends C001L001ChoisirNomDomaineGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(1);
	}

	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	public void  htmlBody() {
		super.htmlBody();
	}

	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}

	protected void _aLAvance(QuestionReponse o) {      

		o.questionIcone("fas", "history");
		o.setQuestion(aLAvanceQuestion);
		o.setQuestionCourt(aLAvanceQuestionCourt);

		o.reponseIcone("fas", "map-pin");
		o.setReponse(aLAvanceReponse);
		o.setReponseCourt(aLAvanceReponseCourt);
	}

	public void  htmlBodyALAvance() {
		aLAvance.htmlAvant();
		e("p").f();
			sx(aLAvanceP);
		g("p");
		aLAvance.htmlApres();
	}

	protected void _acheter(QuestionReponse o) {      

		o.questionIcone("fas", "credit-card");
		o.setQuestion(acheterQuestion);
		o.setQuestionCourt(acheterQuestionCourt);

		o.reponseIcone("fas", "building");
		o.setReponse(acheterReponse);
		o.setReponseCourt(acheterReponseCourt);
	}

	public void  htmlBodyAcheter() { 
		acheter.htmlAvant();
		e("p").f();
			e("span").f();
				sx(acheterP1, acheterP2);
			g("span");
			e("a").a("href", "https://secure.brinkster.com/Domains/").f();
				sx("brinkster.com");
			g("a");
			e("span").f();
				sx(acheterP3, acheterP4);
			g("span");
			e("a").a("href", "https://secure.brinkster.com/Domains/").f();
				sx("gandi.net");
			g("a");
			e("span").f();
				sx(acheterP5);
			g("span");
		g("p");
		acheter.htmlApres();
	}

	protected void _appeler(QuestionReponse o) {      

		o.questionIcone("fab", "wpforms");
		o.setQuestion(appelerQuestion);
		o.setQuestionCourt(appelerQuestionCourt);

		o.reponseIcone("fas", "bullhorn");
		o.setReponse(appelerReponse);
		o.setReponseCourt(appelerReponseCourt);
	}

	public void  htmlBodyAppeler() { 
		appeler.htmlAvant();
		e("p").f();
			e("span").f();
				sx(appelerP);
			g("span");
		g("p");
		appeler.htmlApres();
	}

	protected void _apres1(QuestionReponse o) {      

		o.questionIcone("fas", "cart-plus");
		o.setQuestion(apres1Question);
		o.setQuestionCourt(apres1QuestionCourt);

		o.reponseIcone("fas", "clipboard-check");
		o.setReponse(apres1Reponse);
		o.setReponseCourt(apres1ReponseCourt);
	}

	public void  htmlBodyApres1() { 
		apres1.htmlAvant();
		e("p").f();
			e("span").f();
				sx(apres1P1, apres1P2);
			g("span");
			e("a").a("href", "https://www.brinkster.com").f();
				sx("brinkster.com");
			g("a");
			e("span").f();
				sx(apres1P3);
			g("span");
		g("p");
		apres1.htmlApres();
	}

	protected void _apres2(PageHtml o) {      
	}

	public void  htmlBodyApres2() { 
		e("ul").f();
			e("li").f();
				e("span").f();
					sx(apres2P1);
				g("span");
			g("li");
			e("li").f();
				e("span").f();
					sx(apres2P2);
				g("span");
			g("li");
			e("li").f();
				e("span").f();
					sx(apres2P3, apres2P4, apres2P5);
				g("span");
			g("li");
			e("li").f();
				e("span").f();
					sx(apres2P6);
				g("span");
			g("li");
		g("ul");
	}

	protected void _apres3(PageHtml o) {      
	}

	public void  htmlBodyApres3() { 
		e("ul").f();
			e("li").f();
				e("span").f();
					sx(apres3P);
				g("span");
			g("li");
		g("ul");
	}

	protected void _apres4(PageHtml o) {      
	}

	public void  htmlBodyApres4() { 
		e("ul").f();
			e("li").f();
				e("span").f();
					sx(apres4P);
				g("span");
			g("li");
		g("ul");
	}

	protected void _apres5(PageHtml o) {      
	}

	public void  htmlBodyApres5() { 
		e("ul").f();
			e("li").f();
				e("span").f();
					sx(apres5P);
				g("span");
			g("li");
		g("ul");
	}

	protected void _plusTard(QuestionReponse o) {      

		o.questionIcone("fas", "fast-forward");
		o.setQuestion(plusTardQuestion);
		o.setQuestionCourt(plusTardQuestionCourt);

		o.reponseIcone("fas", "list-ol");
		o.setReponse(plusTardReponse);
		o.setReponseCourt(plusTardReponseCourt);
	}

	public void  htmlBodyPlusTard() { 
		plusTard.htmlAvant();
		e("p").f();
			e("span").f();
				sx(plusTardP);
			g("span");
		g("p");
		plusTard.htmlApres();
	}
}
