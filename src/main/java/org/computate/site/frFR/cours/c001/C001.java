package org.computate.site.frFR.cours.c001;        

import java.util.List;

import org.computate.site.frFR.cours.Cours;
import org.computate.site.frFR.couverture.Couverture;

/**  
 * Api: true
 * ApiUri: /api/cours/c001
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiMethode: Recherche
 * ApiMethode: POST
 * ApiMethode: PATCH
 * ApiMethode: GET
 * ApiMethode: DELETE
 * ApiUriRechercheFrFRPage: /frFR/cours/001
 * ApiUriRechercheEnUSPage: /enUS/course/001
 * PageRechercheFrFRPage: C001FrFRPage
 * PageRechercheEnUSPage: C001EnUSPage
 * PageSuperRechercheFrFRPage: CoursFrFRPage
 * PageSuperRechercheEnUSPage: CoursEnUSPage
 * UnNomMinuscule.frFR: un cours n ° 1
 * UnNomMinuscule.enUS: a course #1
 * NomPluriel.frFR: courses
 * 
 * H1.frFR: Construire des applications Web modernes et async avec les meilleurs logiciels open sources. 
 * H1.enUS: Build modern asynchronous web applications with the best open source software. 
 * 
 * H2.frFR: Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. 
 * H2.enUS: With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. 
 * 
 * Titre.frFR: Construire des applications Web modernes et async avec les meilleurs logiciels open sources. 
 * Titre.enUS: Build modern asynchronous web applications with the best open source software. 
 * 
 * Description.frFR: Avec Vert.x, sur Linux, données PostgreSQL, recherche Solr, construit comme containers Linux sur OpenShift. 
 * Description.enUS: With Vert.x, on Linux, PostgreSQL data, Solr search, deployable as Linux containers on OpenShift. 
 * 
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: university
 * Page: true
*/ 
public class C001 extends C001Gen<Cours> {    

	public static void main(String[] args) {  
		indexer(); 
	} 

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.C001.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.C001.C001_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.C001.C001_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001EnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001FrFRPage_Uri);
	}

	public void htmlBody() {
		super.htmlBody();
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 1
	 * NomAffichage.frFR:nom de domaine
	 * NomAffichage.enUS:domain name
	 * Description.frFR:Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. 
	 * Description.enUS:A domain name is your website name. A domain name is the address where Internet users can access your website. 
	 */ 
	protected void _siteNomDomaine(Couverture<String> c) {
	}
}
