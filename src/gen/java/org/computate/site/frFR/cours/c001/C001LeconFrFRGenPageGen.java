package org.computate.site.frFR.cours.c001;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.recherche.ListeRecherche;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.cours.c001.C001FrFRPage;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.C001LeconFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001LeconFrFRGenPageGen<DEV> extends C001FrFRPage {

	////////////////////
	// listeC001Lecon //
	////////////////////

	/**	L'entité « listeC001Lecon »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<C001Lecon> listeC001Lecon;
	public Couverture<ListeRecherche<C001Lecon>> listeC001LeconCouverture = new Couverture<ListeRecherche<C001Lecon>>().p(this).c(ListeRecherche.class).var("listeC001Lecon").o(listeC001Lecon);

	/**	<br/>L'entité « listeC001Lecon »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.C001LeconFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeC001Lecon">Trouver l'entité listeC001Lecon dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeC001Lecon(Couverture<ListeRecherche<C001Lecon>> c);

	public ListeRecherche<C001Lecon> getListeC001Lecon() {
		return listeC001Lecon;
	}

	public void setListeC001Lecon(ListeRecherche<C001Lecon> listeC001Lecon) {
		this.listeC001Lecon = listeC001Lecon;
		this.listeC001LeconCouverture.dejaInitialise = true;
	}
	protected C001LeconFrFRGenPage listeC001LeconInit() {
		if(!listeC001LeconCouverture.dejaInitialise) {
			_listeC001Lecon(listeC001LeconCouverture);
			if(listeC001Lecon == null)
				setListeC001Lecon(listeC001LeconCouverture.o);
		}
		if(listeC001Lecon != null)
			listeC001Lecon.initLoinPourClasse(requeteSite_);
		listeC001LeconCouverture.dejaInitialise(true);
		return (C001LeconFrFRGenPage)this;
	}

	///////////////
	// c001Lecon //
	///////////////

	/**	L'entité « c001Lecon »
	 *	 is defined as null before being initialized. 
	 */
	protected C001Lecon c001Lecon;
	public Couverture<C001Lecon> c001LeconCouverture = new Couverture<C001Lecon>().p(this).c(C001Lecon.class).var("c001Lecon").o(c001Lecon);

	/**	<br/>L'entité « c001Lecon »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.C001LeconFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001Lecon">Trouver l'entité c001Lecon dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001Lecon(Couverture<C001Lecon> c);

	public C001Lecon getC001Lecon() {
		return c001Lecon;
	}

	public void setC001Lecon(C001Lecon c001Lecon) {
		this.c001Lecon = c001Lecon;
		this.c001LeconCouverture.dejaInitialise = true;
	}
	protected C001LeconFrFRGenPage c001LeconInit() {
		if(!c001LeconCouverture.dejaInitialise) {
			_c001Lecon(c001LeconCouverture);
			if(c001Lecon == null)
				setC001Lecon(c001LeconCouverture.o);
		}
		if(c001Lecon != null)
			c001Lecon.initLoinPourClasse(requeteSite_);
		c001LeconCouverture.dejaInitialise(true);
		return (C001LeconFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001LeconFrFRGenPage = false;

	public C001LeconFrFRGenPage initLoinC001LeconFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001LeconFrFRGenPage) {
			dejaInitialiseC001LeconFrFRGenPage = true;
			initLoinC001LeconFrFRGenPage();
		}
		return (C001LeconFrFRGenPage)this;
	}

	public void initLoinC001LeconFrFRGenPage() {
		super.initLoinC001FrFRPage(requeteSite_);
		initC001LeconFrFRGenPage();
	}

	public void initC001LeconFrFRGenPage() {
		listeC001LeconInit();
		c001LeconInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001LeconFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001LeconFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001FrFRPage(requeteSite_);
		listeC001Lecon.setRequeteSite_(requeteSite_);
		c001Lecon.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001LeconFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001LeconFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001LeconFrFRGenPage(String var) throws Exception {
		C001LeconFrFRGenPage oC001LeconFrFRGenPage = (C001LeconFrFRGenPage)this;
		switch(var) {
			case "listeC001Lecon":
				return oC001LeconFrFRGenPage.listeC001Lecon;
			case "c001Lecon":
				return oC001LeconFrFRGenPage.c001Lecon;
			default:
				return super.obtenirC001FrFRPage(var);
		}
	}

	///////////////
	// attribuer //
	///////////////

	@Override public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerC001LeconFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001LeconFrFRGenPage(String var, Object val) {
		C001LeconFrFRGenPage oC001LeconFrFRGenPage = (C001LeconFrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001FrFRPage(var, val);
		}
	}

	/////////////
	// definir //
	/////////////

	@Override public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirC001LeconFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001LeconFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001FrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001LeconFrFRGenPage();
	}

	public void htmlScriptsC001LeconFrFRGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	public void htmlScript() {
		htmlScriptC001LeconFrFRGenPage();
	}

	public void htmlScriptC001LeconFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001LeconFrFRGenPage();
	}

	public void htmlBodyC001LeconFrFRGenPage() {
		c001Lecon.htmlBody();
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode());
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof C001LeconFrFRGenPage))
			return false;
		C001LeconFrFRGenPage that = (C001LeconFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001LeconFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
