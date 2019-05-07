package org.computate.site.frFR.cours.c001.l005;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMavenFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerMavenFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	////////////////////////////
	// c001L005InstallerMaven //
	////////////////////////////

	/**	L'entité « c001L005InstallerMaven »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L005InstallerMaven c001L005InstallerMaven;
	public Couverture<C001L005InstallerMaven> c001L005InstallerMavenCouverture = new Couverture<C001L005InstallerMaven>().p(this).c(C001L005InstallerMaven.class).var("c001L005InstallerMaven").o(c001L005InstallerMaven);

	/**	<br/>L'entité « c001L005InstallerMaven »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMavenFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L005InstallerMaven">Trouver l'entité c001L005InstallerMaven dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L005InstallerMaven(Couverture<C001L005InstallerMaven> c);

	public C001L005InstallerMaven getC001L005InstallerMaven() {
		return c001L005InstallerMaven;
	}

	public void setC001L005InstallerMaven(C001L005InstallerMaven c001L005InstallerMaven) {
		this.c001L005InstallerMaven = c001L005InstallerMaven;
		this.c001L005InstallerMavenCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMavenFrFRGenPage c001L005InstallerMavenInit() {
		if(!c001L005InstallerMavenCouverture.dejaInitialise) {
			_c001L005InstallerMaven(c001L005InstallerMavenCouverture);
			if(c001L005InstallerMaven == null)
				setC001L005InstallerMaven(c001L005InstallerMavenCouverture.o);
		}
		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.initLoinPourClasse(requeteSite_);
		c001L005InstallerMavenCouverture.dejaInitialise(true);
		return (C001L005InstallerMavenFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerMavenFrFRGenPage = false;

	public C001L005InstallerMavenFrFRGenPage initLoinC001L005InstallerMavenFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerMavenFrFRGenPage) {
			dejaInitialiseC001L005InstallerMavenFrFRGenPage = true;
			initLoinC001L005InstallerMavenFrFRGenPage();
		}
		return (C001L005InstallerMavenFrFRGenPage)this;
	}

	public void initLoinC001L005InstallerMavenFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L005InstallerMavenFrFRGenPage();
	}

	public void initC001L005InstallerMavenFrFRGenPage() {
		c001L005InstallerMavenInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L005InstallerMavenFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerMavenFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L005InstallerMavenFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerMavenFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerMavenFrFRGenPage(String var) {
		C001L005InstallerMavenFrFRGenPage oC001L005InstallerMavenFrFRGenPage = (C001L005InstallerMavenFrFRGenPage)this;
		switch(var) {
			case "c001L005InstallerMaven":
				return oC001L005InstallerMavenFrFRGenPage.c001L005InstallerMaven;
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
				o = attribuerC001L005InstallerMavenFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerMavenFrFRGenPage(String var, Object val) {
		C001L005InstallerMavenFrFRGenPage oC001L005InstallerMavenFrFRGenPage = (C001L005InstallerMavenFrFRGenPage)this;
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
					o = definirC001L005InstallerMavenFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerMavenFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001L005InstallerMavenFrFRGenPage();
	}

	public void htmlScriptsC001L005InstallerMavenFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001L005InstallerMavenFrFRGenPage();
	}

	public void htmlBodyC001L005InstallerMavenFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerMavenFrFRGenPage();
	}

	public void htmlBodyCourtC001L005InstallerMavenFrFRGenPage() {
		if(c001L005InstallerMaven != null)
			c001L005InstallerMaven.htmlBodyCourt();
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
		if(!(o instanceof C001L005InstallerMavenFrFRGenPage))
			return false;
		C001L005InstallerMavenFrFRGenPage that = (C001L005InstallerMavenFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerMavenFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
