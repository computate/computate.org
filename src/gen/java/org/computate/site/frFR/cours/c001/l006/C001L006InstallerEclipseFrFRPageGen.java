package org.computate.site.frFR.cours.c001.l006;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipseFrFRGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l006.C001L006InstallerEclipseFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L006InstallerEclipseFrFRPageGen<DEV> extends C001L006InstallerEclipseFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L006InstallerEclipseFrFRPage = false;

	public C001L006InstallerEclipseFrFRPage initLoinC001L006InstallerEclipseFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L006InstallerEclipseFrFRPage) {
			dejaInitialiseC001L006InstallerEclipseFrFRPage = true;
			initLoinC001L006InstallerEclipseFrFRPage();
		}
		return (C001L006InstallerEclipseFrFRPage)this;
	}

	public void initLoinC001L006InstallerEclipseFrFRPage() {
		super.initLoinC001L006InstallerEclipseFrFRGenPage(requeteSite_);
		initC001L006InstallerEclipseFrFRPage();
	}

	public void initC001L006InstallerEclipseFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L006InstallerEclipseFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L006InstallerEclipseFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L006InstallerEclipseFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L006InstallerEclipseFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L006InstallerEclipseFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L006InstallerEclipseFrFRPage(String var) {
		C001L006InstallerEclipseFrFRPage oC001L006InstallerEclipseFrFRPage = (C001L006InstallerEclipseFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L006InstallerEclipseFrFRGenPage(var);
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
				o = attribuerC001L006InstallerEclipseFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L006InstallerEclipseFrFRPage(String var, Object val) {
		C001L006InstallerEclipseFrFRPage oC001L006InstallerEclipseFrFRPage = (C001L006InstallerEclipseFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L006InstallerEclipseFrFRGenPage(var, val);
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
					o = definirC001L006InstallerEclipseFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L006InstallerEclipseFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L006InstallerEclipseFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L006InstallerEclipseFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L006InstallerEclipseFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L006InstallerEclipseFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L006InstallerEclipseFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L006InstallerEclipseFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L006InstallerEclipseFrFRPage() {
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
		if(!(o instanceof C001L006InstallerEclipseFrFRPage))
			return false;
		C001L006InstallerEclipseFrFRPage that = (C001L006InstallerEclipseFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L006InstallerEclipseFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
