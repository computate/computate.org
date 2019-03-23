package org.computate.site.frFR.cluster;    

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;

import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.chaine.Chaine;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.page.MiseEnPage;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.xml.OutilXml;



/**       
 * MotCle: classeNomSimpleCluster
 * Modele: true
 */  
public class Cluster extends ClusterGen<Object> {   

	public static DateTimeFormatter FORMAT_dateMedicalCourt = DateTimeFormatter.ofPattern("M/d/yyyy", Locale.FRANCE);

//	/**
//	 * Ignorer: true
//	 */
//	@Override public void requeteSiteCluster(RequeteSite requeteSite) {  
//		super.requeteSiteCluster(requeteSite);
//		requeteSite(requeteSite);
//	}

	/**
	 * {@inheritDoc}
	 */       
	protected void _requeteSite_(Couverture<RequeteSiteFrFR> c) {}
	protected void _page_(Couverture<MiseEnPage> c) {}

	/**
	 * {@inheritDoc}
	 * Indexe: true
	 * Stocke: true
	 * ClePrimaire: true
	 * Description.frFR: La clé primaire dans la base de données. 
	 * Description.enUS: The primary key in the database. 
	 * NomAffichage.frFR: clé primaire
	 * NomAffichage.enUS: primary key
	 */                          
	protected void _pk(Couverture<Long> c) {}

	/**
	 * {@inheritDoc}
	 * CleUnique: true
	 */
	protected void _id(Couverture<String> c) {
		if(pk != null)
			c.o(pk.toString());
	}

	/**        
	 * HtmlLigne: 1
	 * Description.frFR: Supprimé. 
	 * Description.enUS: Deleted. 
	 * NomAffichage.frFR: Supprimé
	 * NomAffichage.enUS: Deleted
	 */
	protected void _supprime(Couverture<Boolean> c) {
		Boolean o = false;
		c.o(o);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */
	protected void _utilisateurId(Couverture<String> c) {}

	/**
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 2
	 * Description.frFR: La date et l'heure créées. 
	 * Description.enUS: The date and time created. 
	 * NomAffichage.frFR: Crée
	 * NomAffichage.enUS: Created
	 */
	protected void _cree(Couverture<LocalDateTime> c) {}

	/**
	 * Indexe: true
	 * Stocke: true
	 * HtmlLigne: 2
	 * Description.frFR: La date et l'heure modifiéés. 
	 * Description.enUS: The date and time modified. 
	 * NomAffichage.frFR: Modifié
	 * NomAffichage.enUS: Modified
	 */
	protected void _modifie(Couverture<LocalDateTime> c) {}

	/**
	 * Indexe: true
	 * Stocke: true
	 */      
	protected void _classeNomCanonique(Couverture<String> c) {
		String o = getClass().getCanonicalName();
		c.o(o);
	}

	/**
	 * Indexe: true
	 * Stocke: true
	 */          
	protected void _classeNomSimple(Couverture<String> c) {
		String o = getClass().getSimpleName();
		c.o(o);
	}
//
//	/**
//	 * genInclure: true
//	 */
//	public Cluster e(String nomLocal) {
//		if(page_ != null)
//			page_.e(nomLocal);
//		return page_;
//	}
//
//	/**
//	 * genInclure: true
//	 */
//	public Cluster a(String nomAttribut, Object...objets) {
//		if(page_ != null)
//			page_.a(nomAttribut, objets);
//		return page_;
//	}

	/**
	 */
	public Cluster e(String nomLocal) {
		ToutEcrivain w = requeteSite_.getW();
		String nomLocalParent = requeteSite_.getXmlPile().isEmpty() ? null : requeteSite_.getXmlPile().peek();

		boolean eNoWrapParent = nomLocalParent == null || MiseEnPage.HTML_ELEMENTS_NO_WRAP.contains(nomLocalParent);
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		requeteSite_.getXmlPile().push(nomLocal);
		if(StringUtils.equals(nomLocal, "html"))
			w.s("<!DOCTYPE html>\n");
		if(!eNoWrapParent && !tabulationsEchappes.isEmpty()) {
			w.l();
			w.s(tabulations);
		}
		w.s("<");
		w.s(nomLocal);
		
		return this;
	}

	public Cluster a1(String nomAttribut, Object...objets) {
		ToutEcrivain w = requeteSite_.getW();
		w.s(" ");
		w.s(nomAttribut);
		w.s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				w.s(OutilXml.echapperDansCitatations(s));
			}
		}
		
		return this;
	}

	/**  
	 */
	public Cluster a(String nomAttribut, Object...objets) {
		ToutEcrivain w = requeteSite_.getW();
		w.s(" ");
		w.s(nomAttribut);
		w.s("=\"");
		for(Object objet : objets) {
			if(objet != null) {
				String s = objet.toString();
				w.s(OutilXml.echapperDansCitatations(s));
			}
		}
		w.s("\"");
		
		return this;
	}

	public Cluster a2() {
		ToutEcrivain w = requeteSite_.getW();
		w.s("\"");
		
		return this;
	}

	/** 
	 */
	public Cluster f() {
		ToutEcrivain w = requeteSite_.getW();
		w.s(">");
		
		return this;
	}

	/**
	 */
	public Cluster s(Object...objets) {
		ToutEcrivain w = requeteSite_.getW();
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.s();
					w.s(s);
				}
				else {
					String s = objet.toString();
					w.s(s);
				}
			}
		}
		
		return this;
	}

	/**
	 */
	public Cluster t(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s("\t");
		s(objets);
		return this;
	}

	/**
	 */
	public Cluster tl(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			s("\t");
		s(objets);
		s("\n");
		return this;
	}

	/** 
	 */
	public Cluster l(Object...objets) {
		s(objets);
		s("\n");
		return this;
	}

	public Cluster lx(Object...objets) {
		s(objets);
		sx("\n");
		return this;
	}

	/** 
	 */
	public Cluster sx(Object...objets) {
		ToutEcrivain w = requeteSite_.getW();
		for(Object objet : objets) {
			if(objet != null) {
				if(objet instanceof Chaine) {
					Chaine chaine = (Chaine)objet;
					String s = chaine.toString();
					w.s(OutilXml.echapper(s));
				}
				else {
					String s = objet.toString();
					w.s(OutilXml.echapper(s));
				}
			}
		}
		
		return this;
	}

	/**
	 */
	public Cluster tx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		return this;
	}

	/**
	 */
	public Cluster tlx(int nombreTabulations, Object...objets) {
		for(int i = 0; i < nombreTabulations; i++)
			sx("\t");
		sx(objets);
		sx("\n");
		return this;
	}

	/**
	 */
	public Cluster fg() {
		ToutEcrivain w = requeteSite_.getW();
		w.s("/>");
		requeteSite_.getXmlPile().pop();
		
		return this;
	}

	/**    
	 */
	public Cluster g(String nomLocal) {
		ToutEcrivain w = requeteSite_.getW();
		String nomLocalParent = requeteSite_.getXmlPile().peek();
		boolean eNoWrap = nomLocalParent == null || MiseEnPage.HTML_ELEMENTS_NO_WRAP.contains(nomLocal);

		requeteSite_.getXmlPile().pop();
		String tabulations = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\t"));
		String tabulationsEchappes = String.join("", Collections.nCopies(requeteSite_.getXmlPile().size(), "\\t"));

		if(!eNoWrap && !tabulationsEchappes.isEmpty()) {
			w.l();
			w.s(tabulations);
		}
		w.s("</");
		w.s(nomLocal);
		w.s(">");
		
		return this;
	}
}
