package org.computate.frFR.site.openshift;

import java.io.File;

import org.computate.frFR.site.config.ConfigSite;
import org.computate.frFR.site.contexte.SiteContexteFrFR;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import org.computate.frFR.site.requete.RequeteSiteFrFR;

public class OpenshiftTemplate extends OpenshiftTemplateGen<Object> {

	/**
	 */
	public static void main(String[] args) {
		OpenshiftTemplate api = new OpenshiftTemplate();
		api.initLoinOpenshiftTemplate();
		api.ecrireOpenshiftTemplate();
	}

	/**
	 */
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {
	}

	/**
	 */
	protected void _siteContexte(SiteContexteFrFR o) {
	}

	/**
	 */
	protected void _configSite(Couverture<ConfigSite> c) {
		c.o(siteContexte.getConfigSite());
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _appliChemin(Couverture<String> c) {
		c.o(configSite.getAppliChemin());
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _openApiYamlChemin(Couverture<String> c) {
		c.o(appliChemin + "/.yaml");
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _openApiYamlFichier(Couverture<File> c) {
		c.o(new File(openApiYamlChemin));
	}

	/**
	 * {@inheritDoc}
	 **/
	protected void _w(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, openApiYamlFichier, "  "));
	}

	private void ecrireOpenshiftTemplate() {
		// TODO Auto-generated method stub
		
	}
}
