package org.computate.site.frFR.site;

import org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.computate.site.frFR.cours.c001.l002.C001L002ChoisirSystemeExploitation;
import org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox;
import org.computate.site.frFR.page.accueil.PageAccueil;
import org.computate.site.frFR.page.apropos.PageAPropos;
import org.computate.site.frFR.page.faq.PageFaq;

/**
 * Traduire: false
 */
public class SiteIndexer {

	public static void main(String[] args) {  
		PageAccueil.indexer();
		PageAPropos.indexer();
		PageFaq.indexer();
//		C001.indexer();
		C001L001ChoisirNomDomaine.indexer();
		C001L002ChoisirSystemeExploitation.indexer();
		C001L003InstallerMachineVirtuelleVirtualBox.indexer();
	} 
}
