package org.computate.site.enUS.cours.c001.l006;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSGenPage;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipseEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L006InstallerEclipseEnUSPageGen<DEV> extends C001L006InstallerEclipseEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L006InstallerEclipseEnUSPage = false;

	public C001L006InstallerEclipseEnUSPage initLoinC001L006InstallerEclipseEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L006InstallerEclipseEnUSPage) {
			dejaInitialiseC001L006InstallerEclipseEnUSPage = true;
			initLoinC001L006InstallerEclipseEnUSPage();
		}
		return (C001L006InstallerEclipseEnUSPage)this;
	}

	public void initLoinC001L006InstallerEclipseEnUSPage() {
		initC001L006InstallerEclipseEnUSPage();
	}

	public void initC001L006InstallerEclipseEnUSPage() {
	}

	public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L006InstallerEclipseEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L006InstallerEclipseEnUSPage(RequeteSiteEnUS requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L006InstallerEclipseEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L006InstallerEclipseEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L006InstallerEclipseEnUSPage(String var) {
		C001L006InstallerEclipseEnUSPage oC001L006InstallerEclipseEnUSPage = (C001L006InstallerEclipseEnUSPage)this;
		switch(var) {
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerC001L006InstallerEclipseEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L006InstallerEclipseEnUSPage(String var, Object val) {
		C001L006InstallerEclipseEnUSPage oC001L006InstallerEclipseEnUSPage = (C001L006InstallerEclipseEnUSPage)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirC001L006InstallerEclipseEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L006InstallerEclipseEnUSPage(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash();
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof C001L006InstallerEclipseEnUSPage))
			return false;
		C001L006InstallerEclipseEnUSPage that = (C001L006InstallerEclipseEnUSPage)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("C001L006InstallerEclipseEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
