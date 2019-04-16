package org.computate.site.frFR.site;

import org.computate.site.frFR.cours.c001.C001;
import org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.computate.site.frFR.cours.c001.l002.C001L002ChoisirSystemeExploitation;
import org.computate.site.frFR.page.accueil.PageAccueil;

/**
 * Traduire: false
 */
public class SiteIndexer {

	public static void main(String[] args) {  
		PageAccueil.indexer();
//		C001.indexer();
		C001L001ChoisirNomDomaine.indexer();
		C001L002ChoisirSystemeExploitation.indexer();
	} 
}
