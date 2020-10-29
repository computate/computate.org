package org.computate.site.frfr.paiement;                    

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frfr.cluster.Cluster;
import org.computate.site.frfr.config.ConfigSite;
import org.computate.site.frfr.couverture.Couverture;

/**    
 * NomCanonique.enUS: org.computate.site.enus.payment.SitePayment
 * Modele: true
 * Api: true
 * Indexe: true
 * Sauvegarde: true
 * 
 * ApiTag.frFR: Paiement
 * ApiUri.frFR: /api/paiement
 * 
 * ApiTag.enUS: Payment
 * ApiUri.enUS: /api/payment
 * 
 * ApiMethode: POST
 * 
 * ApiMethode.frFR: PUTImport
 * ApiMethode.frFR: PUTFusion
 * ApiMethode.frFR: PUTCopie
 * ApiMethode.enUS: PUTImport
 * ApiMethode.enUS: PUTMerge
 * ApiMethode.enUS: PUTCopy

 * ApiMethode: PATCH
 * ApiMethode: GET
 * ApiMethode.frFR: Recherche
 * ApiMethode.enUS: Search
 * 
 * ApiMethode.frFR: PageRecherche
 * PagePageRecherche.frFR: PaiementPage
 * PageSuperPageRecherche.frFR: ClusterPage
 * ApiUriPageRecherche.frFR: /paiement
 * 
 * ApiMethode.enUS: SearchPage
 * PageSearchPage.enUS: PaymentPage
 * PageSuperSearchPage.enUS: ClusterPage
 * ApiUriSearchPage.enUS: /payment
 * 
 * UnNom.frFR: un paiement
 * UnNom.enUS: a payment
 * Couleur: green
 * IconeGroupe: solid
 * IconeNom: search-dollar
 * 
 * Role.frFR: SiteAdmin
 * Role.enUS: SiteAdmin
 * RoleLire.frFR: User
 * RoleLire.enUS: User
 * 
 * Tri.desc: paiementDate
 * Tri.desc: paiementPar
 * 
 * Lignes: 50
*/   
public class PaiementSite extends PaiementSiteGen<Cluster> {

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentKey
	 * Indexe: true
	 * Stocke: true
	 * Description.frFR: La clé primaire de l'paiement dans la base de données. 
	 * Description.enUS: The primary key of the school payment in the database. 
	 * NomAffichage.frFR: clé
	 * NomAffichage.enUS: key
	 */         
	protected void _paiementCle(Couverture<Long> c) {
		c.o(pk);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: userKeys
	 * Indexe: true
	 * Stocke: true
	 * Description.frFR: La clé primaire des utlisateurs dans la base de données. 
	 * Description.enUS: The primary key of the users in the database. 
	 * r: utilisateurCles
	 * r.enUS: userKeys
	 * r: inscriptionRecherche
	 * r.enUS: enrollmentSearch
	 */               
	protected void _utilisateurCles(List<Long> l) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentDescription
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 4
	 * HtmlCellule: 1
	 * Description.frFR: 
	 * Description.enUS: 
	 * NomAffichage.frFR: description
	 * NomAffichage.enUS: description
	 */   
	protected void _paiementDescription(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentDate
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * HtmlCellule: 1
	 * NomAffichage.frFR: date de paiement
	 * NomAffichage.enUS: payment date
	 * HtmlColonne: 3
	 */                
	protected void _paiementDate(Couverture<LocalDate> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentYear
	 * Indexe: true
	 * Stocke: true
	 * r: paiementDate
	 * r.enUS: paymentDate
	 */                
	protected void _paiementAnnee(Couverture<Integer> c) {
		if(paiementDate != null)
			c.o(paiementDate.getYear());
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentAmount
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * HtmlCellule: 2
	 * HtmlColonne: 4
	 * Facet: sum
	 * NomAffichage.frFR: paiement montant
	 * NomAffichage.enUS: payment amount
	 */              
	protected void _paiementMontant(Couverture<BigDecimal> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentCash
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * HtmlCellule: 3
	 * NomAffichage.frFR: espèces
	 * NomAffichage.enUS: cash
	 */                   
	protected void _paiementEspeces(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentCheck
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * HtmlCellule: 4
	 * NomAffichage.frFR: chèque
	 * NomAffichage.enUS: check
	 */                     
	protected void _paiementCheque(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentECheck
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * HtmlCellule: 5
	 * NomAffichage.frFR: e-check
	 * NomAffichage.enUS: e-check
	 */                     
	protected void _paiementECheck(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentSystem
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 3
	 * HtmlCellule: 6
	 * NomAffichage.frFR: authorize.net
	 * NomAffichage.enUS: authorize.net
	 */                     
	protected void _paiementSysteme(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentType
	 * Indexe: true
	 * Stocke: true
	 * r: inscription
	 * r.enUS: enrollment
	 * r: EcoleNumeroTelephone
	 * r.enUS: SchoolPhoneNumber
	 * r: "cheque"
	 * r.enUS: "check"
	 * r: "e-cheque"
	 * r.enUS: "check"
	 * r: "espèces"
	 * r.enUS: "cash"
	 * r: paiementCheque
	 * r.enUS: paymentCheck
	 * r: paiementEspeces
	 * r.enUS: paymentCash
	 * r: paiementSysteme
	 * r.enUS: paymentSystem
	 * r: paiementECheck
	 * r.enUS: paymentECheck
	 */
	protected void _paiementType(Couverture<String> c) {
		if(BooleanUtils.isTrue(paiementCheque))
			c.o("cheque");
		else if(BooleanUtils.isTrue(paiementEspeces))
			c.o("espèces");
		else if(BooleanUtils.isTrue(paiementSysteme))
			c.o("authorize.net");
		else if(BooleanUtils.isTrue(paiementECheck))
			c.o("e-cheque");
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentBy
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 4
	 * HtmlCellule: 2
	 * NomAffichage.frFR: paiement par/pour
	 * NomAffichage.enUS: payment by/for
	 */  
	protected void _paiementPar(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: transactionId
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 5
	 * HtmlCellule: 1
	 * NomAffichage.frFR: transaction ID
	 * NomAffichage.enUS: transaction ID
	 */                     
	protected void _transactionId(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: customerProfileId
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 5
	 * HtmlCellule: 2
	 * NomAffichage.frFR: customer profile ID
	 * NomAffichage.enUS: customer profile ID
	 */                
	protected void _customerProfileId(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: transactionStatus
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 5
	 * HtmlCellule: 3
	 * NomAffichage.frFR: état de transaction
	 * NomAffichage.enUS: transaction status
	 */                  
	protected void _transactionStatus(Couverture<String> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentRecieved
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 5
	 * HtmlCellule: 5
	 * NomAffichage.frFR: paiement récu
	 * NomAffichage.enUS: payment received
	 */                  
	protected void _paiementRecu(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeAmount
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * Facet: sum
	 * HtmlLigne: 6
	 * HtmlCellule: 1
	 * HtmlColonne: 5
	 * NomAffichage.frFR: frais montant
	 * NomAffichage.enUS: charge amount
	 */                   
	protected void _fraisMontant(Couverture<BigDecimal> c) {
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeFirstLast
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 6
	 * HtmlCellule: 2
	 * NomAffichage.frFR: frais mois premier et dernier
	 * NomAffichage.enUS: first and last month charge
	 */                    
	protected void _fraisPremierDernier(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeEnrollment
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 6
	 * HtmlCellule: 3
	 * NomAffichage.frFR: frais d'inscription
	 * NomAffichage.enUS: enrollment fee
	 */                 
	protected void _fraisInscription(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeMonth
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 6
	 * HtmlCellule: 4
	 * NomAffichage.frFR: frais du mois
	 * NomAffichage.enUS: monthly fee
	 */                    
	protected void _fraisMois(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeLateFee
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * HtmlLigne: 6
	 * HtmlCellule: 5
	 * NomAffichage.frFR: frais de retard
	 * NomAffichage.enUS: late fee
	 */                    
	protected void _fraisRetard(Couverture<Boolean> c) {
		c.o(false);
	}

	/**
	 * {@inheritDoc}
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: configSite
	 * r.enUS: siteConfig
	 * r: requeteSite
	 * r.enUS: siteRequest
	 */                    
	protected void _now(Couverture<LocalDate> c) {
		ConfigSite configSite = requeteSite_.getConfigSite_();
		ZoneId zoneId = ZoneId.of(configSite.getSiteZone());
		LocalDate now = LocalDate.now(zoneId);
		c.o(now);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentDay
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: paiementProchain
	 * r.enUS: paymentNext
	 * r: PaiementProchain
	 * r.enUS: PaymentNext
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: configSite
	 * r.enUS: siteConfig
	 */                   
	protected void _paiementJour(Couverture<Integer> c) {
		ConfigSite configSite = requeteSite_.getConfigSite_();
		Integer paiementJour = configSite.getPaiementJour();
		c.o(paiementJour);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: paymentNext
	 * Indexe: true
	 * Stocke: true
	 * NomAffichage.frFR: date de paiement prochaîne
	 * NomAffichage.enUS: next payment date
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: paiementProchain
	 * r.enUS: paymentNext
	 * r: PaiementProchain
	 * r.enUS: PaymentNext
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: configSite
	 * r.enUS: siteConfig
	 */                   
	protected void _paiementProchain(Couverture<LocalDate> c) {
		c.o(now.getDayOfMonth() <= paiementJour ? now.withDayOfMonth(paiementJour) : now.plusMonths(1).withDayOfMonth(paiementJour));
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeAmountDue
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * Facet: sum
	 * Modifier: false
	 * NomAffichage.frFR: frais montant dû
	 * NomAffichage.enUS: charge amount due
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: paiementProchain
	 * r.enUS: paymentNext
	 * r: PaiementProchain
	 * r.enUS: PaymentNext
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: configSite
	 * r.enUS: siteConfig
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 */                   
	protected void _fraisMontantDu(Couverture<BigDecimal> c) {
		if(fraisMontant != null 
				&& (
						fraisInscription && paiementDate.compareTo(now.plusDays(15)) <= 0 && paiementDate.withDayOfMonth(paiementJour).compareTo(now) >= 0
						|| fraisPremierDernier && paiementDate.compareTo(now.plusDays(15)) <= 0 && paiementDate.withDayOfMonth(paiementJour).compareTo(now) >= 0
						|| paiementDate != null && paiementDate.compareTo(now.plusDays(15)) <= 0 && paiementDate.compareTo(now) >= 0
				) && (fraisInscription || fraisPremierDernier || paiementDate.compareTo(paiementProchain.minusMonths(1)) > 0) && paiementDate.compareTo(paiementProchain) <= 0)
			c.o(fraisMontant);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeAmountPassed
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * Facet: sum
	 * Modifier: false
	 * NomAffichage.frFR: frais montant du passé
	 * NomAffichage.enUS: charge amount passed
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: paiementProchain
	 * r.enUS: paymentNext
	 * r: PaiementProchain
	 * r.enUS: PaymentNext
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: configSite
	 * r.enUS: siteConfig
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 */                   
	protected void _fraisMontantPasse(Couverture<BigDecimal> c) {
		if(fraisMontant != null && (fraisRetard || paiementDate != null && paiementDate.compareTo(now) < 0))
			c.o(fraisMontant);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeAmountNotPassed
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * Facet: sum
	 * Modifier: false
	 * NomAffichage.frFR: frais montant pas du passé
	 * NomAffichage.enUS: charge amount not passed
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: paiementProchain
	 * r.enUS: paymentNext
	 * r: PaiementProchain
	 * r.enUS: PaymentNext
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: PaiementJour
	 * r.enUS: PaymentDay
	 * r: paiementJour
	 * r.enUS: paymentDay
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: configSite
	 * r.enUS: siteConfig
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 */                   
	protected void _fraisMontantNonPasse(Couverture<BigDecimal> c) {
		if(fraisMontant != null && !fraisRetard && paiementDate != null && paiementDate.compareTo(now) >= 0)
			c.o(fraisMontant);
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: chargeAmountFuture
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * Facet: sum
	 * Modifier: false
	 * NomAffichage.frFR: frais montant future
	 * NomAffichage.enUS: future charge amount
	 * r: requeteSite
	 * r.enUS: siteRequest
	 * r: ConfigSite
	 * r.enUS: SiteConfig
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: paiementProchain
	 * r.enUS: paymentNext
	 * r: PaiementProchain
	 * r.enUS: PaymentNext
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 */                  
	protected void _fraisMontantFuture(Couverture<BigDecimal> c) {
		if(fraisMontant != null && paiementDate != null 
				&& !fraisRetard
				&& paiementDate.compareTo(now.plusDays(15)) > 0)
//				&& paiementDate.compareTo(paiementProchain) > 0)
			c.o(fraisMontant);
	}

	/**    
	 * {@inheritDoc}
	 * Var.enUS: paymentShortName
	 * Indexe: true
	 * Stocke: true
	 * Definir: true
	 * NomAffichage.frFR: nom
	 * NomAffichage.enUS: name
	 * HtmlColonne: 2
	 * r: enfantNomCompletPrefere
	 * r.enUS: childCompleteNamePreferred
	 * r: EnfantNomComplet
	 * r.enUS: ChildCompleteName
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementDate
	 * r.enUS: PaymentDate
	 * r: paiementMontant
	 * r.enUS: paymentAmount
	 * r: paiementCheque
	 * r.enUS: paymentCheck
	 * r: paiementEspeces
	 * r.enUS: paymentCash
	 * r: paiementSysteme
	 * r.enUS: paymentSystem
	 * r: paiementECheck
	 * r.enUS: paymentECheck
	 * r: paiementDescription
	 * r.enUS: paymentDescription
	 * r: paiementValeur
	 * r.enUS: paymentValue
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 * r: " par chèque"
	 * r.enUS: " by check"
	 * r: " par espèces"
	 * r.enUS: " by cash"
	 * r: " par espèces"
	 * r.enUS: " by cash"
	 * r: inscription_
	 * r.enUS: enrollment_
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: SessionDateDebut
	 * r.enUS: SessionStartDate
	 * r: SessionDateFin
	 * r.enUS: SessionEndDate
	 * r: FRANCE
	 * r.enUS: US
	 * r: " pour %s"
	 * r.enUS: " for %s"
	 * r: "Frais de %s"
	 * r.enUS: "%s tuition"
	 * r: "Frais de %s + %s"
	 * r.enUS: "%s + %s tuition"
	 * r: "Frais d'inscription %s-%s"
	 * r.enUS: "%s-%s enrollment fee"
	 * r: "%s frais de retard"
	 * r.enUS: "%s late fee"
	 * r: " paiement"
	 * r.enUS: " payment"
	 * r: " pour %s"
	 * r.enUS: " for %s"
	 * r: "nouveau"
	 * r.enUS: "new"
	 * r: " et "
	 * r.enUS: " and "
	 */  
	protected void _paiementNomCourt(Couverture<String> c) {
		NumberFormat fn = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		DateTimeFormatter fd = DateTimeFormatter.ofPattern("MMMM", Locale.FRANCE);
		DateTimeFormatter fd2 = DateTimeFormatter.ofPattern("MMM d yyyy", Locale.FRANCE);
		fn.setMaximumFractionDigits(2);

		StringBuilder o = new StringBuilder();
		if(fraisMontant != null) {
			if(paiementDate != null)
				o.append(String.format("Frais de %s", fd.format(paiementDate.plusMonths(1))));
		}
		if(fraisMontant != null && paiementMontant != null) {
			o.append(" et ");
		}
		if(paiementMontant != null) {
			o.append(" ").append(fn.format(paiementMontant));
			o.append(" paiement");
			if(BooleanUtils.isTrue(paiementCheque))
				o.append(" by check");
			if(BooleanUtils.isTrue(paiementEspeces))
				o.append(" by cash");
			if(BooleanUtils.isTrue(paiementSysteme))
				o.append(" by authorize.net");
			if(BooleanUtils.isTrue(paiementECheck))
				o.append(" by e-check");
		}
		if(!StringUtils.isEmpty(paiementDescription))
			o.append(" ").append(paiementDescription);
		if(o.length() == 0)
			o.append("nouveau");
		c.o(o.toString());
	}

	/**    
	 * {@inheritDoc}
	 * Var.enUS: paymentCompleteName
	 * Indexe: true
	 * Stocke: true
	 * VarH2: true
	 * VarTitre: true
	 * NomAffichage.frFR: nom
	 * NomAffichage.enUS: name
	 * r: enfantNomCompletPrefere
	 * r.enUS: childCompleteNamePreferred
	 * r: EnfantNomComplet
	 * r.enUS: ChildCompleteName
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementDate
	 * r.enUS: PaymentDate
	 * r: paiementMontant
	 * r.enUS: paymentAmount
	 * r: paiementCheque
	 * r.enUS: paymentCheck
	 * r: paiementEspeces
	 * r.enUS: paymentCash
	 * r: paiementSysteme
	 * r.enUS: paymentSystem
	 * r: paiementECheck
	 * r.enUS: paymentECheck
	 * r: paiementDescription
	 * r.enUS: paymentDescription
	 * r: paiementValeur
	 * r.enUS: paymentValue
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 * r: " par chèque"
	 * r.enUS: " by check"
	 * r: " par espèces"
	 * r.enUS: " by cash"
	 * r: " par espèces"
	 * r.enUS: " by cash"
	 * r: inscription_
	 * r.enUS: enrollment_
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: SessionDateDebut
	 * r.enUS: SessionStartDate
	 * r: SessionDateFin
	 * r.enUS: SessionEndDate
	 * r: FRANCE
	 * r.enUS: US
	 * r: " pour %s"
	 * r.enUS: " for %s"
	 * r: "%s frais de %s"
	 * r.enUS: "%s %s tuition"
	 * r: "%s frais de %s + %s"
	 * r.enUS: "%s %s + %s tuition"
	 * r: "%s frais d'inscription %s-%s"
	 * r.enUS: "%s %s-%s enrollment fee"
	 * r: "%s frais de retard"
	 * r.enUS: "%s late fee"
	 * r: " paiement"
	 * r.enUS: " payment"
	 * r: " pour %s"
	 * r.enUS: " for %s"
	 * r: "nouveau"
	 * r.enUS: "new"
	 * r: " et "
	 * r.enUS: " and "
	 */                              
	protected void _paiementNomComplet(Couverture<String> c) {
		NumberFormat fn = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		DateTimeFormatter fd = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.FRANCE);
		DateTimeFormatter fd2 = DateTimeFormatter.ofPattern("MMM d yyyy", Locale.FRANCE);
		fn.setMaximumFractionDigits(2);
		StringBuilder o = new StringBuilder();

		if(paiementDate != null)
			o.append(paiementDate.format(fd2));
		if(fraisMontant != null) {
			if(fraisMontant != null && paiementDate != null)
				o.append(" ").append(String.format("%s frais de %s", fn.format(fraisMontant), fd.format(paiementDate.plusMonths(1))));
		}
		if(fraisMontant != null && paiementMontant != null) {
			o.append(" et ");
		}
		if(paiementMontant != null) {
			o.append(" ").append(fn.format(paiementMontant));
			o.append(" paiement");
			if(BooleanUtils.isTrue(paiementCheque))
				o.append(" by check");
			if(BooleanUtils.isTrue(paiementEspeces))
				o.append(" by cash");
			if(BooleanUtils.isTrue(paiementSysteme))
				o.append(" by authorize.net");
			if(BooleanUtils.isTrue(paiementECheck))
				o.append(" by e-check");
		}
		if(!StringUtils.isEmpty(paiementDescription))
			o.append(" ").append(paiementDescription);
		if(o.length() == 0)
			o.append("nouveau");
		c.o(o.toString());
	}

	/**
	 * {@inheritDoc}
	 * Var.enUS: _objectText
	 * r: paiementNomComplet
	 * r.enUS: paymentCompleteName
	 * r: enfantNomCompletPrefere
	 * r.enUS: childCompleteNamePreferred
	 * r: EnfantNomComplet
	 * r.enUS: ChildCompleteName
	 * r: paiementDate
	 * r.enUS: paymentDate
	 * r: PaiementDate
	 * r.enUS: PaymentDate
	 * r: paiementMontant
	 * r.enUS: paymentAmount
	 * r: paiementCheque
	 * r.enUS: paymentCheck
	 * r: paiementEspeces
	 * r.enUS: paymentCash
	 * r: paiementSysteme
	 * r.enUS: paymentSystem
	 * r: paiementECheck
	 * r.enUS: paymentECheck
	 * r: paiementDescription
	 * r.enUS: paymentDescription
	 * r: paiementValeur
	 * r.enUS: paymentValue
	 * r: fraisMontant
	 * r.enUS: chargeAmount
	 * r: fraisRetard
	 * r.enUS: chargeLateFee
	 * r: " par chèque"
	 * r.enUS: " by check"
	 * r: " par espèces"
	 * r.enUS: " by cash"
	 * r: " par espèces"
	 * r.enUS: " by cash"
	 * r: inscription_
	 * r.enUS: enrollment_
	 * r: fraisPremierDernier
	 * r.enUS: chargeFirstLast
	 * r: fraisInscription
	 * r.enUS: chargeEnrollment
	 * r: SessionDateDebut
	 * r.enUS: SessionStartDate
	 * r: SessionDateFin
	 * r.enUS: SessionEndDate
	 * r: FRANCE
	 * r.enUS: US
	 * r: " pour %s"
	 * r.enUS: " for %s"
	 * r: "%s frais de %s"
	 * r.enUS: "%s tuition"
	 * r: "%s frais de %s + %s"
	 * r.enUS: "%s + %s tuition"
	 * r: "%s frais d'inscription %s-%s"
	 * r.enUS: "%s-%s enrollment fee"
	 * r: "%s frais de retard"
	 * r.enUS: "%s late fee"
	 * r: " paiement"
	 * r.enUS: " payment"
	 * r: " pour %s"
	 * r.enUS: " for %s"
	 * r: "nouveau"
	 * r.enUS: "new"
	 * r: " et "
	 * r.enUS: " and "
	 */            
	@Override
	protected void _objetTexte(Couverture<String> c) {
		NumberFormat fn = NumberFormat.getCurrencyInstance(Locale.FRANCE);
		DateTimeFormatter fd = DateTimeFormatter.ofPattern("MMMM yyyy", Locale.FRANCE);
		DateTimeFormatter fd2 = DateTimeFormatter.ofPattern("MMM d yyyy", Locale.FRANCE);
		fn.setMaximumFractionDigits(2);
		StringBuilder o = new StringBuilder();

		if(paiementDate != null)
			o.append(paiementDate.format(fd2));
		if(fraisMontant != null) {
			if(fraisMontant != null && paiementDate != null)
				o.append(" ").append(String.format("%s frais de %s", fn.format(fraisMontant), fd.format(paiementDate.plusMonths(1))));
		}
		if(fraisMontant != null && paiementMontant != null) {
			o.append(" et ");
		}
		if(paiementMontant != null) {
			o.append(" ").append(fn.format(paiementMontant));
			o.append(" paiement");
			if(BooleanUtils.isTrue(paiementCheque))
				o.append(" by check");
			if(BooleanUtils.isTrue(paiementEspeces))
				o.append(" by cash");
			if(BooleanUtils.isTrue(paiementSysteme))
				o.append(" by authorize.net");
			if(BooleanUtils.isTrue(paiementECheck))
				o.append(" by e-check");
		}
		if(!StringUtils.isEmpty(paiementDescription))
			o.append(" ").append(paiementDescription);
		if(o.length() == 0)
			o.append("nouveau");
		c.o(o.toString());
	} 
}
