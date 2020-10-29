package org.computate.site.frfr.cours;   

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.computate.site.frfr.article.Article;
import org.computate.site.frfr.couverture.Couverture;

/**
 * Modele: true
 * Api: true
 * ApiUri: /api/cours
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiMethode: Recherche
 * ApiMethode: GET
 * ApiUriRechercheFrFRPage: /frFR/cours
 * ApiUriRechercheEnUSPage: /enUS/course
 * PageRechercheFrFRPage: CoursFrFRPage
 * PageRechercheEnUSPage: CoursEnUSPage
 * UnNom.frFR: un cours
 * UnNom.enUS: a course
 * NomPluriel.frFR: cours
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: university
*/              
public class Cours extends CoursGen<Article> {         

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(Cours.class.getCanonicalName());
//		l.add(org.computate.site.enus.cours.Cours.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	@Override protected void _estCours(Couverture<Boolean> c) {
		c.o(true);
	}

	@Override protected void _estLecon(Couverture<Boolean> c) {
		c.o(false);
	}

	@Override protected void _estArticle(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _coursIdentifiantMinuscule(Couverture<String> c) {
		String s = "c" + String.format("%03d", coursNumero);
		c.o(s);
	}

	protected void _coursIdentifiantMajuscule(Couverture<String> c) {
		String s = StringUtils.capitalize(coursIdentifiantMinuscule);
		c.o(s);
	}
}
