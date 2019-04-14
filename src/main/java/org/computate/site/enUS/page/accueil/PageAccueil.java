package org.computate.site.enUS.page.accueil;

import java.util.List;
import java.util.Map;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.cours.Cours;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageParagraphe;
import org.computate.site.enUS.recherche.ListeRecherche;

public class PageAccueil extends PageAccueilGen<Cluster> {

	public static void  main(String[] args) {  
		indexer(); 
		image();
	}

	protected void _classeNomsCanoniques(List<String> l) {
		l.add(PageAccueil.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.accueil.PageAccueil.class.getCanonicalName());
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageAccueilEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageAccueilFrFRPage_Uri);
	}

	protected void _pageTitre(Couverture<String> c) {
		c.o(PageAccueil_H1 + PageAccueil_H2);
	}

	protected void _pageH1(Couverture<String> c) {
		c.o(PageAccueil_H1);
	}

	protected void _pageH2(Couverture<String> c) {
		c.o(PageAccueil_H2);
	}

	protected void _listeCours(ListeRecherche<Cours> o) {
		o.setC(Cours.class);
		o.setQuery("*:*");
		o.addSort("archive_indexed_boolean", ORDER.asc);
		o.addSort("supprime_indexed_boolean", ORDER.asc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.Cours"));
	}

	protected void _cours(Couverture<Cours> c) {
		if(listeCours.size() == 1)
			c.o(listeCours.get(0));
	}

	public void  htmlBody() {  
		super.htmlBody();

		{ e("h1").f();
				e("i").a("class", Cours.Cours_IconeGroupe, " ", Cours.Cours_IconeNom, " site-menu-icon ").f().g("i");
			e("span").a("class", " ").f().sx("cours").g("span");
		} g("h1");
		{ e("table").a("class", "w3-table w3-bordered w3-striped w3-border w3-hoverable ").f();
			{ e("thead").f();
				{ e("tr").f();
					e("th").f().sx("cours").g("th");
					e("th").f().sx("leçon").g("th");
					e("th").f().sx("description").g("th");
				} g("tr");
			} g("thead");
			{ e("tbody").f();
				Map<String, Map<String, List<String>>> highlighting = listeCours.getQueryResponse().getHighlighting();
				for(int i = 0; i < listeCours.size(); i++) {
					Cours o = listeCours.getList().get(i);
					Map<String, List<String>> highlights = highlighting == null ? null : highlighting.get(o.getId());
					List<String> highlightList = highlights == null ? null : highlights.get(highlights.keySet().stream().findFirst().orElse(null));
					String uri = o.getPageUri();
					{ e("tr").f();
						{ e("td").f();
							{ e("a").a("href", uri).f();
								sx(o.getCoursNumero());
							} g("a");
						} g("td");
						{ e("td").f();
							{ e("a").a("href", uri).f();
								sx(o.getLeconNumero());
							} g("a");
						} g("td");
						{ e("td").f();
							{ e("a").a("href", uri).f();
								sx(o.getCoursDescription());
							} g("a");
							if(highlightList != null) {
								{ e("div").a("class", "site-highlight ").f();
									s(StringUtils.join(highlightList, " ... "));
								} g("div");
							}
						} g("td");
					} g("tr");
				}
			} g("tbody");
		} g("table");
	}

	public void  htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}
}
