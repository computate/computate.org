package org.computate.site.frFR.cours.c001.l004;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7FrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L004InstallerCentos7FrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	//////////////////////////////
	// c001L004InstallerCentos7 //
	//////////////////////////////

	/**	L'entité « c001L004InstallerCentos7 »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L004InstallerCentos7 c001L004InstallerCentos7;
	public Couverture<C001L004InstallerCentos7> c001L004InstallerCentos7Couverture = new Couverture<C001L004InstallerCentos7>().p(this).c(C001L004InstallerCentos7.class).var("c001L004InstallerCentos7").o(c001L004InstallerCentos7);

	/**	<br/>L'entité « c001L004InstallerCentos7 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7FrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L004InstallerCentos7">Trouver l'entité c001L004InstallerCentos7 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L004InstallerCentos7(Couverture<C001L004InstallerCentos7> c);

	public C001L004InstallerCentos7 getC001L004InstallerCentos7() {
		return c001L004InstallerCentos7;
	}

	public void setC001L004InstallerCentos7(C001L004InstallerCentos7 c001L004InstallerCentos7) {
		this.c001L004InstallerCentos7 = c001L004InstallerCentos7;
		this.c001L004InstallerCentos7Couverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7FrFRGenPage c001L004InstallerCentos7Init() {
		if(!c001L004InstallerCentos7Couverture.dejaInitialise) {
			_c001L004InstallerCentos7(c001L004InstallerCentos7Couverture);
			if(c001L004InstallerCentos7 == null)
				setC001L004InstallerCentos7(c001L004InstallerCentos7Couverture.o);
		}
		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.initLoinPourClasse(requeteSite_);
		c001L004InstallerCentos7Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7FrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L004InstallerCentos7FrFRGenPage = false;

	public C001L004InstallerCentos7FrFRGenPage initLoinC001L004InstallerCentos7FrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L004InstallerCentos7FrFRGenPage) {
			dejaInitialiseC001L004InstallerCentos7FrFRGenPage = true;
			initLoinC001L004InstallerCentos7FrFRGenPage();
		}
		return (C001L004InstallerCentos7FrFRGenPage)this;
	}

	public void initLoinC001L004InstallerCentos7FrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L004InstallerCentos7FrFRGenPage();
	}

	public void initC001L004InstallerCentos7FrFRGenPage() {
		c001L004InstallerCentos7Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L004InstallerCentos7FrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L004InstallerCentos7FrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L004InstallerCentos7FrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L004InstallerCentos7FrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L004InstallerCentos7FrFRGenPage(String var) {
		C001L004InstallerCentos7FrFRGenPage oC001L004InstallerCentos7FrFRGenPage = (C001L004InstallerCentos7FrFRGenPage)this;
		switch(var) {
			case "c001L004InstallerCentos7":
				return oC001L004InstallerCentos7FrFRGenPage.c001L004InstallerCentos7;
			default:
				return super.obtenirC001LeconFrFRPage(var);
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
				o = attribuerC001L004InstallerCentos7FrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L004InstallerCentos7FrFRGenPage(String var, Object val) {
		C001L004InstallerCentos7FrFRGenPage oC001L004InstallerCentos7FrFRGenPage = (C001L004InstallerCentos7FrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconFrFRPage(var, val);
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
					o = definirC001L004InstallerCentos7FrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L004InstallerCentos7FrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L004InstallerCentos7FrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L004InstallerCentos7FrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L004InstallerCentos7FrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L004InstallerCentos7FrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L004InstallerCentos7FrFRGenPage();
	}

	public void htmlBodyCourtC001L004InstallerCentos7FrFRGenPage() {
		if(c001L004InstallerCentos7 != null)
			c001L004InstallerCentos7.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L004InstallerCentos7FrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L004InstallerCentos7FrFRGenPage() {
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
		if(!(o instanceof C001L004InstallerCentos7FrFRGenPage))
			return false;
		C001L004InstallerCentos7FrFRGenPage that = (C001L004InstallerCentos7FrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L004InstallerCentos7FrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
