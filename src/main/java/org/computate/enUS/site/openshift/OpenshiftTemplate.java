package org.computate.enUS.site.openshift;

import java.io.File;
import org.computate.enUS.site.config.ConfigSite;
import org.computate.enUS.site.contexte.SiteContexte;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import org.computate.enUS.site.requete.RequeteSite;

public class OpenshiftTemplate extends OpenshiftTemplateGen<Object> {

	public static void  main(String[] args) {
		OpenshiftTemplate api = new OpenshiftTemplate();
		api.initLoinOpenshiftTemplate();
		api.ecrireOpenshiftTemplate();
	}

	protected void _requeteSite_(Couverture<RequeteSite> c) {
	}

	protected void _siteContexte(SiteContexte o) {
	}

	protected void _configSite(Couverture<ConfigSite> c) {
		c.o(siteContexte.getConfigSite());
	}

	protected void _appliChemin(Couverture<String> c) {
		c.o(configSite.getAppliChemin());
	}

	protected void _openApiYamlChemin(Couverture<String> c) {
		c.o(appliChemin + "/.yaml");
	}

	protected void _openApiYamlFichier(Couverture<File> c) {
		c.o(new File(openApiYamlChemin));
	}

	protected void _w(Couverture<ToutEcrivain> c) {
		c.o(ToutEcrivain.creer(requeteSite_, openApiYamlFichier, "  "));
	}

	private void  ecrireOpenshiftTemplate() {
		// TODO Auto-generated method stub
		
	}
}
