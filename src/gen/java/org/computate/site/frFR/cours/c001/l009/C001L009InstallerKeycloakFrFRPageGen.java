package org.computate.site.frFR.cours.c001.l009;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.cours.c001.l009.C001L009InstallerKeycloakFrFRGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerKeycloakFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerKeycloakFrFRPageGen<DEV> extends C001L009InstallerKeycloakFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerKeycloakFrFRPage = false;

	public C001L009InstallerKeycloakFrFRPage initLoinC001L009InstallerKeycloakFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerKeycloakFrFRPage) {
			dejaInitialiseC001L009InstallerKeycloakFrFRPage = true;
			initLoinC001L009InstallerKeycloakFrFRPage();
		}
		return (C001L009InstallerKeycloakFrFRPage)this;
	}

	public void initLoinC001L009InstallerKeycloakFrFRPage() {
		super.initLoinC001L009InstallerKeycloakFrFRGenPage(requeteSite_);
		initC001L009InstallerKeycloakFrFRPage();
	}

	public void initC001L009InstallerKeycloakFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L009InstallerKeycloakFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerKeycloakFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L009InstallerKeycloakFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L009InstallerKeycloakFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerKeycloakFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerKeycloakFrFRPage(String var) {
		C001L009InstallerKeycloakFrFRPage oC001L009InstallerKeycloakFrFRPage = (C001L009InstallerKeycloakFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L009InstallerKeycloakFrFRGenPage(var);
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
				o = attribuerC001L009InstallerKeycloakFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerKeycloakFrFRPage(String var, Object val) {
		C001L009InstallerKeycloakFrFRPage oC001L009InstallerKeycloakFrFRPage = (C001L009InstallerKeycloakFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L009InstallerKeycloakFrFRGenPage(var, val);
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
					o = definirC001L009InstallerKeycloakFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerKeycloakFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L009InstallerKeycloakFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerKeycloakFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerKeycloakFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerKeycloakFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerKeycloakFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerKeycloakFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerKeycloakFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerKeycloakFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerKeycloakFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L009InstallerKeycloakFrFRPage();
		super.html();
	}

	public void htmlC001L009InstallerKeycloakFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L009InstallerKeycloakFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L009InstallerKeycloakFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L009InstallerKeycloakFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L009InstallerKeycloakFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L009InstallerKeycloakFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L009InstallerKeycloakFrFRPage() {
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
		if(!(o instanceof C001L009InstallerKeycloakFrFRPage))
			return false;
		C001L009InstallerKeycloakFrFRPage that = (C001L009InstallerKeycloakFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerKeycloakFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
