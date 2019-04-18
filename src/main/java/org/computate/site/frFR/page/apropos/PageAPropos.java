package org.computate.site.frFR.page.apropos; 

import java.net.URLDecoder;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery.ORDER;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.computate.site.frFR.article.Article;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.recherche.ListeRecherche;

import io.vertx.core.json.JsonArray;
import io.vertx.ext.web.api.OperationRequest;

/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/apropos
 * ApiUriRechercheEnUSPage: /enUS/about
 * PageRechercheFrFRPage: PageAProposFrFRPage
 * PageRechercheEnUSPage: PageAProposEnUSPage
 * PageSuperRechercheFrFRPage: ArticleFrFRPage
 * PageSuperRechercheEnUSPage: ArticleEnUSPage
 * 
 * H1.frFR: Qui est Christopher Tate et computate.org ? 
 * H1.enUS: Who is Christopher Tate and computate.org? 
 * 
 * H2.frFR: Tout à propos de moi et mon site Web. 
 * H2.enUS: All about me and my web site. 
 * 
 * PageSimple: true
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
public class PageAPropos extends PageAProposGen<Article> {   

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(PageAPropos.class.getCanonicalName());
		l.add(org.computate.site.frFR.page.apropos.PageAPropos.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
		c.o(PageAProposEnUSPage_Uri);
	}

	protected void _pageUri_frFR(Couverture<String> c) {
		c.o(PageAProposFrFRPage_Uri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H1);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAPropos_H2);
		addPageRecherche_enUS(org.computate.site.enUS.page.apropos.PageAPropos.PageAProposVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(PageAPropos_H1);
		addPageRecherche_frFR(PageAPropos_H2);
		addPageRecherche_frFR(PageAProposVals);
	}

	@Override protected void _pageTitre(Couverture<String> c) {
		c.o(PageAPropos_H1 + PageAPropos_H2);
	}  

	@Override protected void _pageH1(Couverture<String> c) {
		c.o(PageAPropos_H1);
	}

	@Override protected void _pageH2(Couverture<String> c) {
		c.o(PageAPropos_H2);
	}

	/**
	 * {@inheritDoc}
	 * 
	 **/
	protected void _listeArticle(ListeRecherche<Article> o) {
		o.setC(Article.class);
		o.setQuery("*:*");
		o.addSort("archive_indexed_boolean", ORDER.asc);
		o.addSort("supprime_indexed_boolean", ORDER.asc);
		o.addFilterQuery("classeNomsCanoniques_indexed_strings:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.article.Article"));
	}

	/**
	 * r: frFR
	 * r.enUS: enUS
	 * r: rechercher articles
	 * r.enUS: search articles
	 * r: leçon
	 * r.enUS: lesson
	 * r: cours
	 * r.enUS: course
	 */
	public void htmlBody() {  
		OperationRequest operationRequete = requeteSite_.getOperationRequete();
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
