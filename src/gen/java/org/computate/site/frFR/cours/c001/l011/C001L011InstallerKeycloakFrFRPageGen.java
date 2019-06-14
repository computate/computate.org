package org.computate.site.frFR.cours.c001.l011;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.l011.C001L011InstallerKeycloakFrFRGenPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l011.C001L011InstallerKeycloakFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L011InstallerKeycloakFrFRPageGen<DEV> extends C001L011InstallerKeycloakFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L011InstallerKeycloakFrFRPage = false;

	public C001L011InstallerKeycloakFrFRPage initLoinC001L011InstallerKeycloakFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L011InstallerKeycloakFrFRPage) {
			dejaInitialiseC001L011InstallerKeycloakFrFRPage = true;
			initLoinC001L011InstallerKeycloakFrFRPage();
		}
		return (C001L011InstallerKeycloakFrFRPage)this;
	}

	public void initLoinC001L011InstallerKeycloakFrFRPage() {
		super.initLoinC001L011InstallerKeycloakFrFRGenPage(requeteSite_);
		initC001L011InstallerKeycloakFrFRPage();
	}

	public void initC001L011InstallerKeycloakFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L011InstallerKeycloakFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L011InstallerKeycloakFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L011InstallerKeycloakFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L011InstallerKeycloakFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L011InstallerKeycloakFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L011InstallerKeycloakFrFRPage(String var) {
		C001L011InstallerKeycloakFrFRPage oC001L011InstallerKeycloakFrFRPage = (C001L011InstallerKeycloakFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L011InstallerKeycloakFrFRGenPage(var);
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
				o = attribuerC001L011InstallerKeycloakFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L011InstallerKeycloakFrFRPage(String var, Object val) {
		C001L011InstallerKeycloakFrFRPage oC001L011InstallerKeycloakFrFRPage = (C001L011InstallerKeycloakFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L011InstallerKeycloakFrFRGenPage(var, val);
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
					o = definirC001L011InstallerKeycloakFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L011InstallerKeycloakFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L011InstallerKeycloakFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L011InstallerKeycloakFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L011InstallerKeycloakFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L011InstallerKeycloakFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L011InstallerKeycloakFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L011InstallerKeycloakFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L011InstallerKeycloakFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L011InstallerKeycloakFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptC001L011InstallerKeycloakFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L011InstallerKeycloakFrFRPage();
		super.html();
	}

	public void htmlC001L011InstallerKeycloakFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L011InstallerKeycloakFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L011InstallerKeycloakFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L011InstallerKeycloakFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L011InstallerKeycloakFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L011InstallerKeycloakFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L011InstallerKeycloakFrFRPage() {
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
		if(!(o instanceof C001L011InstallerKeycloakFrFRPage))
			return false;
		C001L011InstallerKeycloakFrFRPage that = (C001L011InstallerKeycloakFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L011InstallerKeycloakFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
