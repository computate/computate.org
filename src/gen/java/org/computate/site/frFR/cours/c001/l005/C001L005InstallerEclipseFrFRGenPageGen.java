package org.computate.site.frFR.cours.c001.l005;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.cours.c001.l004.C001L005InstallerEclipse;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerEclipseFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerEclipseFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	//////////////////////////////
	// c001L005InstallerEclipse //
	//////////////////////////////

	/**	L'entité « c001L005InstallerEclipse »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L005InstallerEclipse c001L005InstallerEclipse;
	public Couverture<C001L005InstallerEclipse> c001L005InstallerEclipseCouverture = new Couverture<C001L005InstallerEclipse>().p(this).c(C001L005InstallerEclipse.class).var("c001L005InstallerEclipse").o(c001L005InstallerEclipse);

	/**	<br/>L'entité « c001L005InstallerEclipse »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerEclipseFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L005InstallerEclipse">Trouver l'entité c001L005InstallerEclipse dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L005InstallerEclipse(Couverture<C001L005InstallerEclipse> c);

	public C001L005InstallerEclipse getC001L005InstallerEclipse() {
		return c001L005InstallerEclipse;
	}

	public void setC001L005InstallerEclipse(C001L005InstallerEclipse c001L005InstallerEclipse) {
		this.c001L005InstallerEclipse = c001L005InstallerEclipse;
		this.c001L005InstallerEclipseCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerEclipseFrFRGenPage c001L005InstallerEclipseInit() {
		if(!c001L005InstallerEclipseCouverture.dejaInitialise) {
			_c001L005InstallerEclipse(c001L005InstallerEclipseCouverture);
			if(c001L005InstallerEclipse == null)
				setC001L005InstallerEclipse(c001L005InstallerEclipseCouverture.o);
		}
		c001L005InstallerEclipseCouverture.dejaInitialise(true);
		return (C001L005InstallerEclipseFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerEclipseFrFRGenPage = false;

	public C001L005InstallerEclipseFrFRGenPage initLoinC001L005InstallerEclipseFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerEclipseFrFRGenPage) {
			dejaInitialiseC001L005InstallerEclipseFrFRGenPage = true;
			initLoinC001L005InstallerEclipseFrFRGenPage();
		}
		return (C001L005InstallerEclipseFrFRGenPage)this;
	}

	public void initLoinC001L005InstallerEclipseFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L005InstallerEclipseFrFRGenPage();
	}

	public void initC001L005InstallerEclipseFrFRGenPage() {
		c001L005InstallerEclipseInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L005InstallerEclipseFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerEclipseFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L005InstallerEclipseFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerEclipseFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerEclipseFrFRGenPage(String var) throws Exception {
		C001L005InstallerEclipseFrFRGenPage oC001L005InstallerEclipseFrFRGenPage = (C001L005InstallerEclipseFrFRGenPage)this;
		switch(var) {
			case "c001L005InstallerEclipse":
				return oC001L005InstallerEclipseFrFRGenPage.c001L005InstallerEclipse;
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
				o = attribuerC001L005InstallerEclipseFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerEclipseFrFRGenPage(String var, Object val) {
		C001L005InstallerEclipseFrFRGenPage oC001L005InstallerEclipseFrFRGenPage = (C001L005InstallerEclipseFrFRGenPage)this;
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
					o = definirC001L005InstallerEclipseFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerEclipseFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001L005InstallerEclipseFrFRGenPage();
	}

	public void htmlScriptsC001L005InstallerEclipseFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001L005InstallerEclipseFrFRGenPage();
	}

	public void htmlBodyC001L005InstallerEclipseFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerEclipseFrFRGenPage();
	}

	public void htmlBodyCourtC001L005InstallerEclipseFrFRGenPage() {
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
		if(!(o instanceof C001L005InstallerEclipseFrFRGenPage))
			return false;
		C001L005InstallerEclipseFrFRGenPage that = (C001L005InstallerEclipseFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerEclipseFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
