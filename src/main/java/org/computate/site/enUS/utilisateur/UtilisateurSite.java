package org.computate.site.enUS.utilisateur;

import java.time.ZonedDateTime;
import java.util.List;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;

public class UtilisateurSite extends UtilisateurSiteGen<Cluster> {

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(org.computate.site.frFR.utilisateur.UtilisateurSite.class.getCanonicalName());
		l.add(org.computate.site.enUS.utilisateur.UtilisateurSite.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	protected void _utilisateurId(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurId();
		c.o(o);
	}

	protected void _calculInrPks(List<Long> l) {
	}

	protected void _utilisateurNom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNom();
		c.o(o);
	}

	protected void _utilisateurMail(Couverture<String> c) {
	}

	protected void _utilisateurPrenom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurPrenom();
		c.o(o);
	}

	protected void _utilisateurNomFamille(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomFamille();
		c.o(o);
	}

	protected void _utilisateurNomComplet(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomComplet();
		c.o(o);
	}

	protected void _utilisateurSite(Couverture<String> c) {
	}

	protected void _utilisateurRecevoirCourriels(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _voirArchive(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _voirSupprime(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _siteNomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	public void  htmlBody() {
		super.htmlBody();
		{ e("a").a("href", requeteSite_.getConfigSite_().getAuthUrl(), "/realms/", requeteSite_.getConfigSite_().getAuthRoyaume(), "/account");
			a("class", "w3-btn w3-round w3-border w3-border-black w3-section w3-green w3-ripple w3-padding w3-margin ");
			f();
			sx("Gérer mon compte");
		} g("a");
	}
}
