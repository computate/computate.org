package org.computate.site.frFR.cours.c001.l007;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresqlFrFRGenPage;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresqlFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L007InstallerPostgresqlFrFRPageGen<DEV> extends C001L007InstallerPostgresqlFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L007InstallerPostgresqlFrFRPage = false;

	public C001L007InstallerPostgresqlFrFRPage initLoinC001L007InstallerPostgresqlFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L007InstallerPostgresqlFrFRPage) {
			dejaInitialiseC001L007InstallerPostgresqlFrFRPage = true;
			initLoinC001L007InstallerPostgresqlFrFRPage();
		}
		return (C001L007InstallerPostgresqlFrFRPage)this;
	}

	public void initLoinC001L007InstallerPostgresqlFrFRPage() {
		super.initLoinC001L007InstallerPostgresqlFrFRGenPage(requeteSite_);
		initC001L007InstallerPostgresqlFrFRPage();
	}

	public void initC001L007InstallerPostgresqlFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L007InstallerPostgresqlFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L007InstallerPostgresqlFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L007InstallerPostgresqlFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L007InstallerPostgresqlFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L007InstallerPostgresqlFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L007InstallerPostgresqlFrFRPage(String var) {
		C001L007InstallerPostgresqlFrFRPage oC001L007InstallerPostgresqlFrFRPage = (C001L007InstallerPostgresqlFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L007InstallerPostgresqlFrFRGenPage(var);
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
				o = attribuerC001L007InstallerPostgresqlFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L007InstallerPostgresqlFrFRPage(String var, Object val) {
		C001L007InstallerPostgresqlFrFRPage oC001L007InstallerPostgresqlFrFRPage = (C001L007InstallerPostgresqlFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L007InstallerPostgresqlFrFRGenPage(var, val);
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
					o = definirC001L007InstallerPostgresqlFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L007InstallerPostgresqlFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L007InstallerPostgresqlFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L007InstallerPostgresqlFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L007InstallerPostgresqlFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L007InstallerPostgresqlFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L007InstallerPostgresqlFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L007InstallerPostgresqlFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L007InstallerPostgresqlFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L007InstallerPostgresqlFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptC001L007InstallerPostgresqlFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L007InstallerPostgresqlFrFRPage();
		super.html();
	}

	public void htmlC001L007InstallerPostgresqlFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L007InstallerPostgresqlFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L007InstallerPostgresqlFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L007InstallerPostgresqlFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L007InstallerPostgresqlFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L007InstallerPostgresqlFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L007InstallerPostgresqlFrFRPage() {
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
		if(!(o instanceof C001L007InstallerPostgresqlFrFRPage))
			return false;
		C001L007InstallerPostgresqlFrFRPage that = (C001L007InstallerPostgresqlFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L007InstallerPostgresqlFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
