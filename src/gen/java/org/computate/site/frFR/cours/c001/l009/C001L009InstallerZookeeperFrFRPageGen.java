package org.computate.site.frFR.cours.c001.l009;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeperFrFRGenPage;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeperFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerZookeeperFrFRPageGen<DEV> extends C001L009InstallerZookeeperFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerZookeeperFrFRPage = false;

	public C001L009InstallerZookeeperFrFRPage initLoinC001L009InstallerZookeeperFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerZookeeperFrFRPage) {
			dejaInitialiseC001L009InstallerZookeeperFrFRPage = true;
			initLoinC001L009InstallerZookeeperFrFRPage();
		}
		return (C001L009InstallerZookeeperFrFRPage)this;
	}

	public void initLoinC001L009InstallerZookeeperFrFRPage() {
		super.initLoinC001L009InstallerZookeeperFrFRGenPage(requeteSite_);
		initC001L009InstallerZookeeperFrFRPage();
	}

	public void initC001L009InstallerZookeeperFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L009InstallerZookeeperFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerZookeeperFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L009InstallerZookeeperFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L009InstallerZookeeperFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerZookeeperFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerZookeeperFrFRPage(String var) {
		C001L009InstallerZookeeperFrFRPage oC001L009InstallerZookeeperFrFRPage = (C001L009InstallerZookeeperFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L009InstallerZookeeperFrFRGenPage(var);
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
				o = attribuerC001L009InstallerZookeeperFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerZookeeperFrFRPage(String var, Object val) {
		C001L009InstallerZookeeperFrFRPage oC001L009InstallerZookeeperFrFRPage = (C001L009InstallerZookeeperFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L009InstallerZookeeperFrFRGenPage(var, val);
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
					o = definirC001L009InstallerZookeeperFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerZookeeperFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L009InstallerZookeeperFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerZookeeperFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerZookeeperFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerZookeeperFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerZookeeperFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerZookeeperFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerZookeeperFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerZookeeperFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerZookeeperFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L009InstallerZookeeperFrFRPage();
		super.html();
	}

	public void htmlC001L009InstallerZookeeperFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L009InstallerZookeeperFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L009InstallerZookeeperFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L009InstallerZookeeperFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L009InstallerZookeeperFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L009InstallerZookeeperFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L009InstallerZookeeperFrFRPage() {
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
		if(!(o instanceof C001L009InstallerZookeeperFrFRPage))
			return false;
		C001L009InstallerZookeeperFrFRPage that = (C001L009InstallerZookeeperFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerZookeeperFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
