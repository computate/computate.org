package org.computate.site.enUS.cours.c001.l009;

import java.util.List;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;

public class C001L009InstallerZookeeper extends C001L009InstallerZookeeperGen<C001Lecon> {

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
		l.add(C001L009InstallerZookeeper.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override()
	protected void  _articleH1_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeper_H1);
	}

	@Override()
	protected void  _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H1);
	}

	@Override()
	protected void  _articleH2_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeper_H2);
	}

	@Override()
	protected void  _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H2);
	}

	@Override()
	protected void  _pageUri_enUS(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperEnUSPage_Uri);
	}

	@Override()
	protected void  _pageUri_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperFrFRPage_Uri);
	}

	@Override()
	protected void  _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperEnUSPage_ImageUri);
	}

	@Override()
	protected void  _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L009InstallerZookeeperFrFRPage_ImageUri);
	}

	@Override()
	protected void  _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeper_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l009.C001L009InstallerZookeeper.C001L009InstallerZookeeperVals);
	}

	@Override()
	protected void  _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L009InstallerZookeeper_H1);
		addPageRecherche_frFR(C001L009InstallerZookeeper_H2);
		addPageRecherche_frFR(C001L009InstallerZookeeperVals);
	}

	public void  htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	protected void _zookeeperVersion(Couverture<String> c) {
		if(utilisateurSite == null)
			c.o("3.5.5");
		else
			c.o(utilisateurSite.getZookeeperVersion());
	}

	protected void _zookeeperTag(Couverture<String> c) {
		c.o("release-" + zookeeperVersion);
	}

	protected void _moi(PageHtml o) {
	}

	protected void _personnaliser(PageHtml o) {
	}

	@Override()
	public void  htmlBodyPersonnaliser(PageHtml o) {
		super.htmlBodyPersonnaliser(o);
		htmlBodyPersonnaliserAvant(o);
		if(utilisateurSite != null) {
			{ e("div").a("class", "w3-cell w3-cell-middle w3-center w3-mobile ").f();
				{ e("form").a("action", "/api/site/utilisateur").a("id", "zookeeperVersionForm").a("style", "display: inline-block; ").f();
					e("label").a("for", "Page_zookeeperVersion").a("class", "").f().sx("version de Zookeeper").g("label");
	
					e("input")
						.a("type", "text")
						.a("placeholder", "version de Zookeeper")
						.a("class", "setZookeeperVersion w3-input w3-border ")
						.a("name", "setZookeeperVersion")
						.a("id", "Page_zookeeperVersion")
						.a("onclick", "enleverLueur($(this)); ")
						.a("onchange", "patchUtilisateurSiteBase($('#UtilisateurSiteForm'), $('#zookeeperVersionForm')); ")
						.a("value", strZookeeperVersion())
					.fg();
	
				} g("form");
			} g("div");
		}
		htmlBodyPersonnaliserApres(o);
	}

	protected void _questionDependences(PageHtml o) {
	}

	protected void _questionMkdirSrc(PageHtml o) {
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
