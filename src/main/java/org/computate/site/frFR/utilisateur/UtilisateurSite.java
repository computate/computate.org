package org.computate.site.frFR.utilisateur;               

import java.time.ZonedDateTime;
import java.util.List;

import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;

/**
 * Api: true
 * MotCle: classeNomSimpleUtilisateurSite
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiMethode: PATCH
 * ApiUriRechercheFrFRPage: /frFR/utilisateur
 * ApiUriRechercheEnUSPage: /enUS/user
 * PageRechercheFrFRPage: UtilisateurSiteFrFRPage
 * PageRechercheEnUSPage: UtilisateurSiteEnUSPage
 * PageSuperRechercheFrFRPage: ClusterFrFRPage
 * PageSuperRechercheEnUSPage: ClusterEnUSPage
 * ApiUri: /api/site/utilisateur
 * Role.frFR: SiteAdmin
 * Filtre: utilisateurId
 * Sauvegarde: true
 * 
 * UnNom.frFR: un utilisateur du site
 * UnNom.enUS: a site user
 * NomPluriel.frFR: utilisateurs du site
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
public class UtilisateurSite extends UtilisateurSiteGen<Cluster> {  

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(org.computate.site.frFR.utilisateur.UtilisateurSite.class.getCanonicalName());
		l.add(org.computate.site.enUS.utilisateur.UtilisateurSite.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	/**  
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Description.frFR: L'identifiant Keycloak pour cet utilisateur. 
	 * NomAffichage.frFR: utilisateur ID
	 * NomAffichage.enUS: user ID
	 */      
	protected void _utilisateurId(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurId();
		c.o(o);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Attribuer: CalculInr.utilisateurPk
	 */ 
	protected void _calculInrPks(List<Long> l) {
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le nom d'utilisateur pour se connecter au site. 
	 * NomAffichage.frFR: nom d'utilisateur
	 * NomAffichage.enUS: username
	 * HtmlLigne: 2
	 * Indexe: true
	 * Stocke: true
	 */   
	protected void _utilisateurNom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNom();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le mail pour recevoir des courriels. 
	 * NomAffichage.frFR: mail
	 * NomAffichage.enUS: email
	 * Indexe: true
	 * Stocke: true
	 */  
	protected void _utilisateurMail(Couverture<String> c) {
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le prénom pour cet utilisateur. 
	 * NomAffichage.frFR: prénom
	 * NomAffichage.enUS: first name
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurPrenom(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurPrenom();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le nom de famille pour cet utilisateur. 
	 * NomAffichage.frFR: nom de famille
	 * NomAffichage.enUS: last name
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurNomFamille(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomFamille();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le prénom et nom de famille pour cet utilisateur. 
	 * NomAffichage.frFR: nom complet
	 * NomAffichage.enUS: full name
	 * HtmlLigne: 2
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurNomComplet(Couverture<String> c) {
		String o = requeteSite_.getUtilisateurNomComplet();
		c.o(o);
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: L'URL du site Web pour cet utilisateur. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurSite(Couverture<String> c) {
	}

	/**	
	 * {@inheritDoc}
	 * description.frFR: Le nom de famille pour cet utilisateur. 
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurRecevoirCourriels(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * NomAffichage.frFR: voir archivé
	 * NomAffichage.enUS: see archived
	 * Description.frFR: Filter the search results in the application to show archived records. 
	 * Description.enUS: Filtrer les résultats de recherche dans l'application à voir les données archivées. 
	**/ 
	protected void _voirArchive(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * NomAffichage.frFR: voir supprimé
	 * NomAffichage.enUS: see deleted
	 * Description.frFR: Filter the search results in the application to show deleted records. 
	 * Description.enUS: Filtrer les résultats de recherche dans l'application à voir les données supprimées. 
	 **/       
	protected void _voirSupprime(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * NomAffichage.frFR:nom de domaine
	 * NomAffichage.enUS:domain name
	 * Description.frFR:Un nom de domaine est le nom de votre site web. Un nom de domaine est l'adresse à laquelle les internautes peuvent accéder à votre site Web. 
	 * Description.enUS:A domain name is your website name. A domain name is the address where Internet users can access your website. 
	 * r: Gérer mon compte
	 * r.enUS: Manage my account
	 */   
	protected void _siteNomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	public void htmlBody() {
		super.htmlBody();
		{ e("a").a("href", requeteSite_.getConfigSite_().getAuthUrl(), "/realms/", requeteSite_.getConfigSite_().getAuthRoyaume(), "/account");
			a("class", "w3-btn w3-round w3-border w3-border-black w3-section w3-green w3-ripple w3-padding w3-margin ");
			f();
			sx("Gérer mon compte");
		} g("a");
	}  
}
