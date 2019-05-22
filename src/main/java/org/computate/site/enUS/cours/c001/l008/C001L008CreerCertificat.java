package org.computate.site.enUS.cours.c001.l008;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.utilisateur.UtilisateurSite;

public class C001L008CreerCertificat extends C001L008CreerCertificatGen<C001Lecon> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	@Override()
	protected void  _leconNumero(Couverture<Integer> c) { 
		c.o(8);
	}

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(C001L008CreerCertificat.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificatVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L008CreerCertificat_H1);
		addPageRecherche_frFR(C001L008CreerCertificat_H2);
		addPageRecherche_frFR(C001L008CreerCertificatVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _moi(PageHtml o) {
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrv(PageHtml o) {
	}

	protected void _questionCertbot1(PageHtml o) {
	}

	protected void _questionCertbot2(PageHtml o) {
	}

	@Override()
	public void  htmlBodyQuestionCertbot2(PageHtml o) {
		UtilisateurSite utilisateurSite = requeteSite_.getUtilisateurSite();
		if(utilisateurSite == null) {
			super.htmlBodyQuestionCertbot2(o);
		}
		else {
			{ e("pre").a("class", " questionCertbot2Pre ").f();
				{ e("span").a("class", " questionCertbot2PreSpan01 questionCertbot2PreSpan odd ").f();
					sx(questionCertbot2PreSpan011);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan02 questionCertbot2PreSpan even ").f();
					sx(questionCertbot2PreSpan021);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan03 questionCertbot2PreSpan odd ").f();
					sx(questionCertbot2PreSpan031);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan04 questionCertbot2PreSpan even ").f();
					sx(questionCertbot2PreSpan041);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan05 questionCertbot2PreSpan odd ").f();
					sx(questionCertbot2PreSpan051);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan06 questionCertbot2PreSpan even ").f();
					sx(questionCertbot2PreSpan061);
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan07 questionCertbot2PreSpan odd ").f();
					sx(" -d ", utilisateurSite.getSiteNomDomaine());
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan08 questionCertbot2PreSpan even ").f();
					sx(" -d *.", utilisateurSite.getSiteNomDomaine());
				} g("span");
				{ e("span").a("class", " questionCertbot2PreSpan09 questionCertbot2PreSpan odd ").f();
					sx(" -d *.apps.", utilisateurSite.getSiteNomDomaine());
				} g("span");
			} g("pre");
		}
	}

	protected void _questionCertbot3(PageHtml o) {
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
