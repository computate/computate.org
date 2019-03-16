package org.computate.frFR.site.cours.c001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.frFR.site.recherche.ListeRecherche;
import io.vertx.core.json.JsonArray;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.cours.c001.C001Lecon;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.frFR.site.page.MiseEnPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001LeconGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001LeconGenPageGen<DEV> extends MiseEnPage {

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001LeconGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeC001Lecon">Trouver l'entité listeC001Lecon dans Solr</a>
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
	protected C001LeconGenPage listeC001LeconInit() {
		if(!listeC001LeconCouverture.dejaInitialise) {
			_listeC001Lecon(listeC001LeconCouverture);
			if(listeC001Lecon == null)
				setListeC001Lecon(listeC001LeconCouverture.o);
		}
		if(listeC001Lecon != null)
			listeC001Lecon.initLoinPourClasse(requeteSite_);
		listeC001LeconCouverture.dejaInitialise(true);
		return (C001LeconGenPage)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001LeconGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001Lecon">Trouver l'entité c001Lecon dans Solr</a>
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
	protected C001LeconGenPage c001LeconInit() {
		if(!c001LeconCouverture.dejaInitialise) {
			_c001Lecon(c001LeconCouverture);
			if(c001Lecon == null)
				setC001Lecon(c001LeconCouverture.o);
		}
		if(c001Lecon != null)
			c001Lecon.initLoinPourClasse(requeteSite_);
		c001LeconCouverture.dejaInitialise(true);
		return (C001LeconGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001LeconGenPage = false;

	public C001LeconGenPage initLoinC001LeconGenPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001LeconGenPage) {
			dejaInitialiseC001LeconGenPage = true;
			initLoinC001LeconGenPage();
		}
		return (C001LeconGenPage)this;
	}

	public void initLoinC001LeconGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initC001LeconGenPage();
	}

	public void initC001LeconGenPage() {
		listeC001LeconInit();
		c001LeconInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001LeconGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001LeconGenPage(RequeteSite requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		listeC001Lecon.setRequeteSite_(requeteSite_);
		c001Lecon.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001LeconGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001LeconGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001LeconGenPage(String var) throws Exception {
		C001LeconGenPage oC001LeconGenPage = (C001LeconGenPage)this;
		switch(var) {
			case "listeC001Lecon":
				return oC001LeconGenPage.listeC001Lecon;
			case "c001Lecon":
				return oC001LeconGenPage.c001Lecon;
			default:
				return super.obtenirMiseEnPage(var);
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
				o = attribuerC001LeconGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001LeconGenPage(String var, Object val) {
		C001LeconGenPage oC001LeconGenPage = (C001LeconGenPage)this;
		switch(var) {
			default:
				return super.attribuerMiseEnPage(var, val);
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
					o = definirC001LeconGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001LeconGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001LeconGenPage();
		super.htmlScriptsMiseEnPage();
	}

	public void htmlScriptsC001LeconGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001LeconGenPage();
		super.htmlScriptMiseEnPage();
	}

	public void htmlScriptC001LeconGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001LeconGenPage();
		super.htmlBodyMiseEnPage();
	}

	public void htmlBodyC001LeconGenPage() {
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
		if(!(o instanceof C001LeconGenPage))
			return false;
		C001LeconGenPage that = (C001LeconGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001LeconGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
