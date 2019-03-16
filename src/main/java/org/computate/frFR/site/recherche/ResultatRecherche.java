package org.computate.frFR.site.recherche;  

import org.apache.solr.common.SolrDocument;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;

public class ResultatRecherche extends ResultatRechercheGen<Object> { 

	protected void _requeteSite_(Couverture<RequeteSite> c) throws Exception {
	}

	protected void _documentSolr(Couverture<SolrDocument> c) throws Exception {
	}

	protected void _resultatIndice(Couverture<Long> c) throws Exception {
	}
}
