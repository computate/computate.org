package org.computate.site.enUS.cours.c001.l009;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;

public class C001L009InstallerKeycloak extends C001L009InstallerKeycloakGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(9);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L009InstallerKeycloak.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L009InstallerKeycloak_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak.C001L009InstallerKeycloak_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L009InstallerKeycloak_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak.C001L009InstallerKeycloak_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L009InstallerKeycloakEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L009InstallerKeycloakFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L009InstallerKeycloakEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L009InstallerKeycloakFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak.C001L009InstallerKeycloak_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak.C001L009InstallerKeycloak_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloak.C001L009InstallerKeycloakVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L009InstallerKeycloak_H1);
		addPageRecherche_frFR(C001L009InstallerKeycloak_H2);
		addPageRecherche_frFR(C001L009InstallerKeycloakVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrc(PageHtml o) {
	}

	protected void _questionMkdirPostgreSQL(PageHtml o) {
	}

	protected void _questionClonerSource(PageHtml o) {
	}

	protected void _questionListerTags(PageHtml o) {
	}

	protected void _questionCheckoutTag(PageHtml o) {
	}

	protected void _questionConstruireSource(PageHtml o) {
	}

	protected void _questionMkdirServeur(PageHtml o) {
	}

	protected void _questionDonnees(PageHtml o) {
	}

	protected void _questionService(PageHtml o) {
	}

	protected void _questionSystemctlDaemonReload(PageHtml o) {
	}

	protected void _questionSystemctlEnable(PageHtml o) {
	}

	protected void _questionSystemctlStart(PageHtml o) {
	}

	protected void _questionSystemctlStatus(PageHtml o) {
	}

	protected void _recapituler1(PageHtml o) {      
	}

	protected void _recapituler2(PageHtml o) {    
	}

	protected void _recapituler3(PageHtml o) {      
	}
}