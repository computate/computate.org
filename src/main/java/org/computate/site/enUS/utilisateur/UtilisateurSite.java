package org.computate.site.enUS.utilisateur;

import java.time.ZonedDateTime;
import java.util.List;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;

public class UtilisateurSite extends UtilisateurSiteGen<Cluster> {

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(UtilisateurSite.class.getCanonicalName());
		l.add(org.computate.site.enUS.utilisateur.UtilisateurSite.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	protected void __userId(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurId();
		c.o(o);
	}

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

	protected void _siteNomDomaine(Couverture<String> c) {
	}

	public void  htmlBody() {
		super.htmlBody();
	}
}
