package org.computate.site.frFR.cours.c001.l004;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7FrFRGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l004.C001L004InstallerCentos7FrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L004InstallerCentos7FrFRPageGen<DEV> extends C001L004InstallerCentos7FrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L004InstallerCentos7FrFRPage = false;

	public C001L004InstallerCentos7FrFRPage initLoinC001L004InstallerCentos7FrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L004InstallerCentos7FrFRPage) {
			dejaInitialiseC001L004InstallerCentos7FrFRPage = true;
			initLoinC001L004InstallerCentos7FrFRPage();
		}
		return (C001L004InstallerCentos7FrFRPage)this;
	}

	public void initLoinC001L004InstallerCentos7FrFRPage() {
		super.initLoinC001L004InstallerCentos7FrFRGenPage(requeteSite_);
		initC001L004InstallerCentos7FrFRPage();
	}

	public void initC001L004InstallerCentos7FrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L004InstallerCentos7FrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L004InstallerCentos7FrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L004InstallerCentos7FrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L004InstallerCentos7FrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L004InstallerCentos7FrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L004InstallerCentos7FrFRPage(String var) throws Exception {
		C001L004InstallerCentos7FrFRPage oC001L004InstallerCentos7FrFRPage = (C001L004InstallerCentos7FrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L004InstallerCentos7FrFRGenPage(var);
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
				o = attribuerC001L004InstallerCentos7FrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L004InstallerCentos7FrFRPage(String var, Object val) {
		C001L004InstallerCentos7FrFRPage oC001L004InstallerCentos7FrFRPage = (C001L004InstallerCentos7FrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L004InstallerCentos7FrFRGenPage(var, val);
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
					o = definirC001L004InstallerCentos7FrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L004InstallerCentos7FrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L004InstallerCentos7FrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L004InstallerCentos7FrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L004InstallerCentos7FrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L004InstallerCentos7FrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L004InstallerCentos7FrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L004InstallerCentos7FrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L004InstallerCentos7FrFRPage() {
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
		if(!(o instanceof C001L004InstallerCentos7FrFRPage))
			return false;
		C001L004InstallerCentos7FrFRPage that = (C001L004InstallerCentos7FrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L004InstallerCentos7FrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
