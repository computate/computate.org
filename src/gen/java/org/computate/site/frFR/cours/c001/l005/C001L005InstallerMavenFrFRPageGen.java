package org.computate.site.frFR.cours.c001.l005;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.l005.C001L005InstallerMavenFrFRGenPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMavenFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerMavenFrFRPageGen<DEV> extends C001L005InstallerMavenFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerMavenFrFRPage = false;

	public C001L005InstallerMavenFrFRPage initLoinC001L005InstallerMavenFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerMavenFrFRPage) {
			dejaInitialiseC001L005InstallerMavenFrFRPage = true;
			initLoinC001L005InstallerMavenFrFRPage();
		}
		return (C001L005InstallerMavenFrFRPage)this;
	}

	public void initLoinC001L005InstallerMavenFrFRPage() {
		super.initLoinC001L005InstallerMavenFrFRGenPage(requeteSite_);
		initC001L005InstallerMavenFrFRPage();
	}

	public void initC001L005InstallerMavenFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L005InstallerMavenFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerMavenFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L005InstallerMavenFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L005InstallerMavenFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerMavenFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerMavenFrFRPage(String var) {
		C001L005InstallerMavenFrFRPage oC001L005InstallerMavenFrFRPage = (C001L005InstallerMavenFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L005InstallerMavenFrFRGenPage(var);
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
				o = attribuerC001L005InstallerMavenFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerMavenFrFRPage(String var, Object val) {
		C001L005InstallerMavenFrFRPage oC001L005InstallerMavenFrFRPage = (C001L005InstallerMavenFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L005InstallerMavenFrFRGenPage(var, val);
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
					o = definirC001L005InstallerMavenFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerMavenFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L005InstallerMavenFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L005InstallerMavenFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L005InstallerMavenFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L005InstallerMavenFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerMavenFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerMavenFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L005InstallerMavenFrFRPage() {
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
		if(!(o instanceof C001L005InstallerMavenFrFRPage))
			return false;
		C001L005InstallerMavenFrFRPage that = (C001L005InstallerMavenFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerMavenFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
