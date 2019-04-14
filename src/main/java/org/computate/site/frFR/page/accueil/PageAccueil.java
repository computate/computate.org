package org.computate.site.frFR.page.accueil;  

import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.Cours;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.recherche.ListeRecherche;

/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR
 * ApiUriRechercheEnUSPage: /
 * PageRechercheFrFRPage: PageAccueilFrFRPage
 * PageRechercheEnUSPage: PageAccueilEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * 
 * Titre.frFR: Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. 
 * Titre.enUS: Create your own data-driven, searchable website on your own computer and the cloud, with open source software. 
 * 
 * H1.frFR: Construire votre site web personnel, avec données et la récherche, sur votre ordinateur et sur le cloud, avec des logiciels open source. 
 * H1.enUS: Create your own data-driven, searchable website on your own computer and the cloud, with open source software. 
 * 
 * H2.frFR: Base de données PostgreSQL flexible, intégration de la recherche Solr, normes OpenAPI 3, code Vert.x totalement asynchrone, déployé sur Red Hat OpenShift, pour les meilleures solutions 100% open sources.
 * H2.enUS: Flexible PostgreSQL database, Solr search integration, OpenAPI 3 standards, completely asynchronous Vert.x code, deployed on Red Hat OpenShift, for the very best, 100% open source solutions. 
 * 
 * PageSimple: true
 * NomPluriel.frFR: lessons
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 616
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 616
*/     
public class PageAccueil extends PageAccueilGen<Cluster> {   

	public static void main(String[] args) {  
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

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageTitre(Couverture<String> c) {
		c.o(PageAccueil_H1 + PageAccueil_H2);
	}  

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH1(Couverture<String> c) {
		c.o(PageAccueil_H1);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH2(Couverture<String> c) {
		c.o(PageAccueil_H2);
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
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

	public void htmlBody() {  
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

	public void htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Envisagez-vous de créer votre propre site Web ? 
	 * Val.P.frFR:Apprenez à créer votre propre site Web de manière open source. 
	 * Val.P.enUS:Are you thinking about launching your own website? 
	 * Val.P.enUS:Learn with me, how to create your very own web site the open source way. 
	 */  
	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 */ 
	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	} 
}
