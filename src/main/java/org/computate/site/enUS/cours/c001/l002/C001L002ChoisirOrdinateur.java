package org.computate.site.enUS.cours.c001.l002;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.page.parti.QuestionReponse;

public class C001L002ChoisirOrdinateur extends C001L002ChoisirOrdinateurGen<C001Lecon> {

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
		l.add(C001L002ChoisirOrdinateur.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _coursH1_frFR(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateur_H1);
	}

	@Override()
	protected void  _coursH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H1);
	}

	@Override()
	protected void  _coursH2_frFR(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateur_H2);
	}

	@Override()
	protected void  _coursH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateurEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L002ChoisirOrdinateurFrFRPage_Uri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateur_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur.C001L002ChoisirOrdinateurVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L002ChoisirOrdinateur_H1);
		addPageRecherche_frFR(C001L002ChoisirOrdinateur_H2);
		addPageRecherche_frFR(C001L002ChoisirOrdinateurVals);
	}

	public void  htmlBody() {
		super.htmlBody();
	}

	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}

	protected void _aLAvance(QuestionReponse o) {      

	}
}
