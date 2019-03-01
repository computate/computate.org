package org.computate.frFR.site.cours; 

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.common.SolrDocument;
import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.page.MiseEnPage;
import org.computate.frFR.site.page.parti.PagePart;
import org.computate.frFR.site.requete.RequeteSite;

/**  
 * Api: true
 * NomCanonique.enUS: org.computate.enUS.site.cours.Course
 * ApiUri.enUS: /api/v1/enUS/course
 * ApiUri.frFR: /api/v1/frFR/cours
 * ApiMethode: RecherchePage
 * ApiUriRecherchePage.frFR: /frFR/cours
 * ApiUriRecherchePage.enUS: /enUS/course
 * ApiTypeMedia200GETPage: text/html
 * PageRecherchePage: CoursPage
 * UnNomMinuscule.frFR: un cours
 * NomPluriel.frFR: cours
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: university
*/        
public class Cours extends CoursGen<Cluster> {   

	/**
	 * 
	 * {@inheritDoc}
	 **/
	protected void _requeteSite_(Couverture<RequeteSite> c) {
	}

	protected void _documentSolr(Couverture<SolrDocument> c) {  
		c.o(requeteSite_.getDocumentSolr());
	}

	/** 
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: Site domain name
	 * nomAffichage.frFR: Nom de domaine du site
	 * Le nom de domaine du site. 
	 * **/
	protected void _nomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	/**   
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: Display name of the site
	 * nomAffichage.frFR: Nom d'affichage du site
	 * Le nom d'hôte du site. **/
	protected void _nomSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	/**	
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: Site host name
	 * nomAffichage.frFR: Nom d'hôte du site
	 * Le nom d'hôte du site. **/
	protected void _nomHoteSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: site package name
	 * nomAffichage.frFR: nom d'ensemble du site
	 * 
	 */    
	protected void _nomEnsembleSite(Couverture<String> c) { 
		String[] partis = StringUtils.split(nomHoteSite, ".");
		ArrayUtils.reverse(partis);
		String o = StringUtils.join(partis, ".");
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: Computer host name
	 * nomAffichage.frFR: Nom d'hôte de l'ordinateur
	 * Le nom d'hôte du site. 
	 * r: tour
	 * r.enUS: tower
	 * **/    
	protected void _nomHoteOrdinateur(Couverture<String> c) {
		c.o("tour1." + nomDomaine);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: Server path
	 * nomAffichage.frFR: Chemin du serveur
	 * Le chemin vers le serveur. **/
	protected void _cheminServeur(Couverture<String> c) {
		String o = new StringBuilder("/srv/").append(nomHoteOrdinateur).toString();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: Project path
	 * nomAffichage.frFR: Chemin du projet
	 * Le chemin vers le projet du site. **/
	protected void _cheminProjet(Couverture<String> c) {
		String o = new StringBuilder(cheminServeur).append("/").append(nomDomaine).toString();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * crypte: true
	 * nomAffichage.enUS: User name
	 * nomAffichage.frFR: Nom d'utilisateur
	 * r: monutlisateur
	 * r.enUS: myuser
	 */
	protected void _utilisateurNom(Couverture<String> c) {
		String[] partis = requeteSite_.getUtilisateurNom() == null ? new String[0] : requeteSite_.getUtilisateurNom().split("\\W");
		if(partis.length > 0) {
			String o = partis[0];
			c.o(o);
		}
		else {
			c.o("monutilisateur");
		}
	}

	/**
	 * {@inheritDoc}
	 * sauvegarde: true
	 * nomAffichage.enUS: Group name
	 * nomAffichage.frFR: Nom de groupe
	 * 
	 */ 
	protected void _groupeNom(Couverture<String> c) {
		c.o(utilisateurNom);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: isCourse
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: est cours
	 * NomAffichage.enUS: is course
	 */
	protected void _estCours(Couverture<Boolean> c) {
		c.o(true);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 1
	 * HtmlColonne: 1
	 * NomAffichage.frFR: cours numéro
	 * NomAffichage.enUS: course number
	 */
	protected void _coursNumero(Couverture<Integer> c) {
		Matcher m = Pattern.compile("^C(\\d+)", Pattern.MULTILINE).matcher(getClass().getSimpleName());
		if(m.find()) {
			Integer o = Integer.parseInt(m.group(1));
			c.o(o);
		}
	}

	protected void _coursIdentifiantMinuscule(Couverture<String> c) {
		String s = "c" + String.format("%03d", coursNumero);
		c.o(s);
	}

	protected void _coursIdentifiantMajuscule(Couverture<String> c) {
		String s = StringUtils.capitalize(coursIdentifiantMinuscule);
		c.o(s);
	}

	/**  
	 * Var.enUS: _courseCreated
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _coursCree(Couverture<LocalDateTime> c) {
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 1
	 * HtmlColonne: 3
	 * NomAffichage.frFR: description
	 * NomAffichage.enUS: description
	 */
	protected void _coursDescription(Couverture<String> c) {
	}

	protected void _coursIdentifiantUri(Couverture<String> o) {}

	/**
	 * Var.enUS: _pageCreated
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageCree(Couverture<LocalDateTime> c) {
		c.o(coursCree);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH1(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H1")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _pageH2(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H2")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * r: Crée : 
	 * r.enUS: Created: 
	 */
	protected void _pageH3(Couverture<String> c) { 
		if(pageCree != null)
			c.o("Crée : " + pageCree.format(MiseEnPage.FORMATAffichage));
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 * Var.enUS: pageTitle
	 * r: Titre
	 * r.enUS: Title
	 */
	protected void _pageTitre(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_Titre")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	public void htmlBody() {
		super.htmlBody();
	}

	@Override protected void _id(Couverture<String> c) {
		c.o(getClass().getCanonicalName());
	}

	protected void _pageParts(List<PagePart> l) {
	}

	public void avantPagePart(PagePart o, String var) {
	}
}
