package org.computate.enUS.site.cours.c001.l001;

import org.computate.enUS.site.cours.c001.C001Lecon;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.page.parti.PageParagraphe;
import org.computate.enUS.site.page.parti.QuestionReponse;

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

	protected void _paragrapheIntro(PageParagraphe o) {
		o.getTexte().s(IntroParagraphe);
	}

	public void  htmlBody() {
		super.htmlBody();
	}

	protected void _paragrapheMoi(PageParagraphe o) {
		o.getTexte().s(MoiParagraphe);
	}

	protected void _acheterNomDomaineALAvance(QuestionReponse o) {      

		o.questionIconeAvant("solid", "history");
		o.setQuestion(ALAvanceQuestion);
		o.setQuestionCourt(ALAvanceQuestionCourt);

		o.reponseIconeAvant("solid", "map-pin");
		o.setReponse(ALAvanceReponse);
		o.setReponseCourt(ALAvanceReponseCourt);
	}

	public void  htmlBodyAcheterNomDomaineALAvance() {
		e("p").f();
			e("div").f();
				sx(ALAvanceParagraphe);
			g("div");
		g("p");
	}
}
