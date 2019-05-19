package org.computate.site.enUS.cours.c001.l009;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloakEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l009.C001L009InstallerKeycloakEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerKeycloakEnUSPageGen<DEV> extends C001L009InstallerKeycloakEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerKeycloakEnUSPage = false;

	public C001L009InstallerKeycloakEnUSPage initLoinC001L009InstallerKeycloakEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerKeycloakEnUSPage) {
			dejaInitialiseC001L009InstallerKeycloakEnUSPage = true;
			initLoinC001L009InstallerKeycloakEnUSPage();
		}
		return (C001L009InstallerKeycloakEnUSPage)this;
	}

	public void initLoinC001L009InstallerKeycloakEnUSPage() {
		super.initLoinC001L009InstallerKeycloakEnUSGenPage(requeteSite_);
		initC001L009InstallerKeycloakEnUSPage();
	}

	public void initC001L009InstallerKeycloakEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L009InstallerKeycloakEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerKeycloakEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L009InstallerKeycloakEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L009InstallerKeycloakEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerKeycloakEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerKeycloakEnUSPage(String var) {
		C001L009InstallerKeycloakEnUSPage oC001L009InstallerKeycloakEnUSPage = (C001L009InstallerKeycloakEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L009InstallerKeycloakEnUSGenPage(var);
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
				o = attribuerC001L009InstallerKeycloakEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerKeycloakEnUSPage(String var, Object val) {
		C001L009InstallerKeycloakEnUSPage oC001L009InstallerKeycloakEnUSPage = (C001L009InstallerKeycloakEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L009InstallerKeycloakEnUSGenPage(var, val);
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
					o = definirC001L009InstallerKeycloakEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerKeycloakEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L009InstallerKeycloakEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerKeycloakEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerKeycloakEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerKeycloakEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerKeycloakEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerKeycloakEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerKeycloakEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerKeycloakEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerKeycloakEnUSPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L009InstallerKeycloakEnUSPage();
		super.html();
	}

	public void htmlC001L009InstallerKeycloakEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L009InstallerKeycloakEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L009InstallerKeycloakEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L009InstallerKeycloakEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L009InstallerKeycloakEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L009InstallerKeycloakEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L009InstallerKeycloakEnUSPage() {
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
		if(!(o instanceof C001L009InstallerKeycloakEnUSPage))
			return false;
		C001L009InstallerKeycloakEnUSPage that = (C001L009InstallerKeycloakEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerKeycloakEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
