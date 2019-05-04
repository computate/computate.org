package org.computate.site.enUS.cours.c001.l005;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipseEnUSGenPage;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipseEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerEclipseEnUSPageGen<DEV> extends C001L005InstallerEclipseEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerEclipseEnUSPage = false;

	public C001L005InstallerEclipseEnUSPage initLoinC001L005InstallerEclipseEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerEclipseEnUSPage) {
			dejaInitialiseC001L005InstallerEclipseEnUSPage = true;
			initLoinC001L005InstallerEclipseEnUSPage();
		}
		return (C001L005InstallerEclipseEnUSPage)this;
	}

	public void initLoinC001L005InstallerEclipseEnUSPage() {
		super.initLoinC001L005InstallerEclipseEnUSGenPage(requeteSite_);
		initC001L005InstallerEclipseEnUSPage();
	}

	public void initC001L005InstallerEclipseEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L005InstallerEclipseEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerEclipseEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L005InstallerEclipseEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L005InstallerEclipseEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerEclipseEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerEclipseEnUSPage(String var) throws Exception {
		C001L005InstallerEclipseEnUSPage oC001L005InstallerEclipseEnUSPage = (C001L005InstallerEclipseEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L005InstallerEclipseEnUSGenPage(var);
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
				o = attribuerC001L005InstallerEclipseEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerEclipseEnUSPage(String var, Object val) {
		C001L005InstallerEclipseEnUSPage oC001L005InstallerEclipseEnUSPage = (C001L005InstallerEclipseEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L005InstallerEclipseEnUSGenPage(var, val);
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
					o = definirC001L005InstallerEclipseEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerEclipseEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L005InstallerEclipseEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L005InstallerEclipseEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L005InstallerEclipseEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L005InstallerEclipseEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerEclipseEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerEclipseEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L005InstallerEclipseEnUSPage() {
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
		if(!(o instanceof C001L005InstallerEclipseEnUSPage))
			return false;
		C001L005InstallerEclipseEnUSPage that = (C001L005InstallerEclipseEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerEclipseEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
