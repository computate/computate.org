package org.computate.enUS.site.recherche;

import org.apache.solr.common.SolrDocument;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.requete.RequeteSite;

public class ResultatRecherche extends ResultatRechercheGen<Object> {

	protected void _requeteSite_(Couverture<RequeteSite> c) {
	}

	protected void _documentSolr(Couverture<SolrDocument> c) {
	}

	protected void _resultatIndice(Couverture<Long> c) {
	}
}
