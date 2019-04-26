package org.computate.site.enUS.cours.c001.l003;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.Cmd;
import org.computate.site.enUS.page.parti.PageHtml;
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
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _ecraser(PageHtml o) {      
	}

	protected void _commentInstaller(PageHtml o) {
	}

	protected void _telecharger(PageHtml o) {
	}

	protected void _deplacerDepot(PageHtml o) {
	}

	protected void _yumSearch(PageHtml o) {
	}

	protected void _yumInstallPaquets(PageHtml o) {
	}

	protected void _telechargerIso(PageHtml o) {
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {      
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
