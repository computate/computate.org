package org.computate.enUS.site.cours.c001;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import org.computate.enUS.site.cours.c001.C001EnUSGenPage;
import org.computate.enUS.site.requete.RequeteSiteEnUS;
import org.computate.enUS.site.cluster.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.enUS.site.couverture.Couverture;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.cours.c001.C001EnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001EnUSPageGen<DEV> extends C001EnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001EnUSPage = false;

	public C001EnUSPage initLoinC001EnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001EnUSPage) {
			dejaInitialiseC001EnUSPage = true;
			initLoinC001EnUSPage();
		}
		return (C001EnUSPage)this;
	}

	public void initLoinC001EnUSPage() {
		initC001EnUSPage();
	}

	public void initC001EnUSPage() {
	}

	public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001EnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001EnUSPage(RequeteSiteEnUS requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001EnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001EnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001EnUSPage(String var) throws Exception {
		C001EnUSPage oC001EnUSPage = (C001EnUSPage)this;
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
				o = attribuerC001EnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001EnUSPage(String var, Object val) {
		C001EnUSPage oC001EnUSPage = (C001EnUSPage)this;
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
					o = definirC001EnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001EnUSPage(String var, String val) {
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
		if(!(o instanceof C001EnUSPage))
			return false;
		C001EnUSPage that = (C001EnUSPage)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("C001EnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
