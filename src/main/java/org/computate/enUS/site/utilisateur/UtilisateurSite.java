package org.computate.enUS.site.utilisateur;

import java.time.ZonedDateTime;
import java.util.List;
import org.computate.enUS.site.cluster.Cluster;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.requete.RequeteSiteEnUS;

public class UtilisateurSite extends UtilisateurSiteGen<Cluster> {

	protected void _calculInrPks(List<Long> l) {
	}

	protected void _requeteSite_(Couverture<RequeteSiteEnUS> c) {}

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

	public void  htmlBody() {
		super.htmlBody();
	}
}
