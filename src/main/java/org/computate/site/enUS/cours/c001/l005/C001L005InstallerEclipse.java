package org.computate.site.enUS.cours.c001.l005;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;

public class C001L005InstallerEclipse extends C001L005InstallerEclipseGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L005InstallerEclipse.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipse_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipse_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerEclipseEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipseFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerEclipseEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipseFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipseVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L005InstallerEclipse_H1);
		addPageRecherche_frFR(C001L005InstallerEclipse_H2);
		addPageRecherche_frFR(C001L005InstallerEclipseVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _questionTelechargerCentos7(PageHtml o) {
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}
