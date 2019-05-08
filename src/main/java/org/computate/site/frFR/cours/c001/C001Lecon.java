package org.computate.site.frFR.cours.c001;         

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.computate.site.frFR.couverture.Couverture;

/**     
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/lecons
 * ApiUriRechercheEnUSPage: /enUS/course/001/lessons
 * PageRechercheFrFRPage: C001LeconFrFRPage
 * PageRechercheEnUSPage: C001LeconEnUSPage
 * PageSuperRechercheFrFRPage: C001FrFRPage
 * PageSuperRechercheEnUSPage: C001EnUSPage
 * UnNomMinuscule.frFR: un leçon
 * UnNomMinuscule.enUS: a lesson
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
*/   
public class C001Lecon extends C001LeconGen<C001> {   

	@Override
	protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001Lecon.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.C001Lecon.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _leconCree(Couverture<LocalDateTime> c) {
	}

	@Override protected void _leconNumero(Couverture<Integer> c) {
	}

	@Override protected void _pageCree(Couverture<LocalDateTime> c) {
		c.o(leconCree);
	}

	@Override protected void _estLecon(Couverture<Boolean> c) {
		c.o(true);
	}

	@Override protected void _estCours(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 */ 
	protected void _leconsACoteDocuments(ArrayList<SolrDocument> l) {
		SolrQuery recherche = new SolrQuery();
		recherche.setQuery("*:*");
		recherche.setRows(2);
		recherche.addFilterQuery("coursNumero_indexed_int:" + coursNumero);
		recherche.addFilterQuery("leconNumero_indexed_int:(" + (leconNumero - 1) + " OR " + (leconNumero + 1) + ")");
		recherche.addSort("leconNumero_indexed_int", ORDER.asc);

		try {
			QueryResponse rechercheReponse = requeteSite_.getSiteContexte_().getClientSolr().query(recherche);
			SolrDocumentList rechercheListe = rechercheReponse.getResults();
			for(int i = 0; i < rechercheListe.size(); i++) {
				SolrDocument document = rechercheListe.get(i);
				l.add(document);
			}
		} catch (SolrServerException | IOException e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void htmlBody() {
		super.htmlBody();
	}
}
