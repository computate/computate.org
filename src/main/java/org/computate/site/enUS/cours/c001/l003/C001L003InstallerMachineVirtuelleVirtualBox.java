package org.computate.site.enUS.cours.c001.l003;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.Cmd;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;

public class C001L003InstallerMachineVirtuelleVirtualBox extends C001L003InstallerMachineVirtuelleVirtualBoxGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(2);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}

	protected void _ecraser(QuestionReponse o) {      

		o.questionIcone("fas", "eraser");
		o.setQuestion(ecraserQuestion);
		o.setQuestionCourt(ecraserQuestionCourt);

		o.reponseIcone("fab", "linux");
		o.setReponse(ecraserReponse);
		o.setReponseCourt(ecraserReponseCourt);
	}

	public void  htmlBodyEcraser(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				sx(ecraserP);
			g("div");
		g("p");
	}

	protected void _commentInstaller(QuestionReponse o) {

		o.questionIcone("fas", "person-carry");
		o.setQuestion(commentInstallerQuestion);
		o.setQuestionCourt(commentInstallerQuestionCourt);

		o.reponseIcone("fab", "cloud-download-alt");
		o.setReponse(commentInstallerReponse);
		o.setReponseCourt(commentInstallerReponseCourt);
	}

	public void  htmlBodyCommentInstaller(QuestionReponse o) {
		{ e("p").f();
			{ e("ul").f();
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP1);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP2);
					} g("span");
					{ e("a").a("href", commentInstallerP3).f();
						sx(commentInstallerP3);
					} g("a");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP4);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP5);
					} g("span");
				} g("li");
			} g("ul");
		} g("p");
	}

	protected void _telecharger(Cmd o) {

		o.questionIcone("fas", "play-circle");
		o.setQuestion(telechargerQuestion);
		o.setQuestionCourt(telechargerQuestionCourt);

		o.reponseIcone("fab", "download");
		o.setReponse(telechargerReponse);
		o.setReponseCourt(telechargerReponseCourt);
	}

	public void  htmlBodyTelecharger(Cmd o) {
		{ e("p").f();
			{ e("ul").f();
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP1);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP2);
					} g("span");
					{ e("a").a("href", telechargerP3).f();
						sx(telechargerP3);
					} g("a");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP4);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP5);
					} g("span");
				} g("li");
			} g("ul");
		} g("p");
	}
}
