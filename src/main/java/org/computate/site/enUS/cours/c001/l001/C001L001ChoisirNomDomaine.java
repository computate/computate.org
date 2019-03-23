package org.computate.site.enUS.cours.c001.l001;

import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;

public class C001L001ChoisirNomDomaine extends C001L001ChoisirNomDomaineGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(1);
	}

	protected void _pageVideoId(Couverture<String> c) {
		c.o("ZJTDpIpan8M");
	}

	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	public void  htmlBody() {
		super.htmlBody();
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

		o.setQuestion(acheterQuestion);
		o.setQuestionCourt(acheterQuestionCourt);

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
}
