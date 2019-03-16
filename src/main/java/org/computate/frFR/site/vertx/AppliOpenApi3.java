package org.computate.frFR.site.vertx;

import org.computate.frFR.site.contexte.SiteContexte;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;
/**
 */
public class AppliOpenApi3 extends AppliOpenApi3Gen<AppliSwagger2> { 

	@Override protected void _apiVersion(Couverture<String> c) {
		c.o("3.0.0");
	}

	/**
	 */
	public static void main(String[] args) {
		AppliOpenApi3 api = new AppliOpenApi3();
		RequeteSite requeteSite = new RequeteSite();
		requeteSite.initLoinRequeteSite();
		SiteContexte siteContexte = new SiteContexte();
		siteContexte.initLoinSiteContexte(requeteSite);
		api.initLoinAppliOpenApi3(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		api.ecrireOpenApi();
	}
}
