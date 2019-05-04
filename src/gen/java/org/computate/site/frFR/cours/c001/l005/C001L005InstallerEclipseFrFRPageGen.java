package org.computate.site.frFR.cours.c001.l005;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.cours.c001.l005.C001L005InstallerEclipseFrFRGenPage;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerEclipseFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerEclipseFrFRPageGen<DEV> extends C001L005InstallerEclipseFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerEclipseFrFRPage = false;

	public C001L005InstallerEclipseFrFRPage initLoinC001L005InstallerEclipseFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerEclipseFrFRPage) {
			dejaInitialiseC001L005InstallerEclipseFrFRPage = true;
			initLoinC001L005InstallerEclipseFrFRPage();
		}
		return (C001L005InstallerEclipseFrFRPage)this;
	}

	public void initLoinC001L005InstallerEclipseFrFRPage() {
		super.initLoinC001L005InstallerEclipseFrFRGenPage(requeteSite_);
		initC001L005InstallerEclipseFrFRPage();
	}

	public void initC001L005InstallerEclipseFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L005InstallerEclipseFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerEclipseFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L005InstallerEclipseFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L005InstallerEclipseFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerEclipseFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerEclipseFrFRPage(String var) throws Exception {
		C001L005InstallerEclipseFrFRPage oC001L005InstallerEclipseFrFRPage = (C001L005InstallerEclipseFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L005InstallerEclipseFrFRGenPage(var);
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
				o = attribuerC001L005InstallerEclipseFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerEclipseFrFRPage(String var, Object val) {
		C001L005InstallerEclipseFrFRPage oC001L005InstallerEclipseFrFRPage = (C001L005InstallerEclipseFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L005InstallerEclipseFrFRGenPage(var, val);
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
					o = definirC001L005InstallerEclipseFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerEclipseFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L005InstallerEclipseFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L005InstallerEclipseFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L005InstallerEclipseFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L005InstallerEclipseFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerEclipseFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerEclipseFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L005InstallerEclipseFrFRPage() {
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
		if(!(o instanceof C001L005InstallerEclipseFrFRPage))
			return false;
		C001L005InstallerEclipseFrFRPage that = (C001L005InstallerEclipseFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerEclipseFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
