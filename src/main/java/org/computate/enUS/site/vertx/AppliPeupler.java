package org.computate.enUS.site.vertx;

import org.computate.enUS.site.config.ConfigSite;
import org.computate.enUS.site.contexte.SiteContexte;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.requete.RequeteSite;

public class AppliPeupler extends AppliPeuplerGen<Object> {

	protected void _requeteSite_(Couverture<RequeteSite> c) {
	}

	protected void _siteContexte(SiteContexte o) {
	}

	protected void _configSite(Couverture<ConfigSite> c) {
		c.o(siteContexte.getConfigSite());
	}

	public static void  main(String[] args) throws Exception, Exception {
		AppliPeupler api = new AppliPeupler();
		api.initLoinAppliPeupler();
		api.peuplerDonnees();
	}

	public void  peuplerDonnees() throws Exception, Exception {
//		CalculInr calculInr;
//		UtilisateurSite employeEntreprise;
//		UtilisateurSite patientWarfarin;
//		CalculInrApiGen apiCalculInr = new CalculInrApiGen();
//		UtilisateurSiteApiGen apiUtilisateurSite = new UtilisateurSiteApiGen();
//		
//		employeEntreprise = new UtilisateurSite() {{
//			setUtilisateurPrenom("Employee");
//			setUtilisateurNomFamille("Jones");
//			setUtilisateurMail("employee.jones@mailinator.com");
//			setUtilisateurId("43c229ce-87ec-5bc2-9ae1-3321d1f88321");
//		}}.initLoinUtilisateurSite(requeteSite_);
////		apiUtilisateurSite.postUtilisateurSite(patientWarfarin);
//
//		patientWarfarin = new UtilisateurSite() {{
//			setUtilisateurPrenom("Jane");
//			setUtilisateurNomFamille("Doe");
//			setUtilisateurMail("jane.doe@mailinator.com");
//		}}.initLoinUtilisateurSite(requeteSite_);
////		apiUtilisateurSite.postUtilisateurSite(patientWarfarin);
//
//		calculInr = new CalculInr() {{
//			setPatientPrendCoumadin(CalculInr.VAL_patientPrendCoumadinOui);
//			setButActuel("1. PAF 2. Goal 2-3. 3. Therapy since 2012. ");
//			setDoseActuel("4mg daily except 2mg sat");
//			setMedicamentActuel("Wrfarin. 4mg tabs available");
//			setChangementDose("11/15 INR @ 1.99. If dose verified/none missed change to 4mg");
//			setNotesComplementaires("MDINR (Goes by Pearl); Sensitive to 2mg/titration. ");
//			setInfoContact("Home #785-7892 Call after 4pm");
//			setDateInr(LocalDate.of(2018, 11, 15));
//			setDateReverifier(LocalDate.of(2018,  11,  26));
//		}}.initLoinCalculInr(requeteSite_);
////		apiCalculInr.postCalculInr(calculInr);
	}
}
