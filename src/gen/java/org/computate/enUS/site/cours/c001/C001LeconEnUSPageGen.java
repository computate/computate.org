package org.computate.enUS.site.cours.c001;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import org.computate.enUS.site.requete.RequeteSiteEnUS;
import org.computate.enUS.site.cours.c001.C001LeconEnUSGenPage;
import org.computate.enUS.site.cluster.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.enUS.site.couverture.Couverture;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.cours.c001.C001LeconEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001LeconEnUSPageGen<DEV> extends C001LeconEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001LeconEnUSPage = false;

	public C001LeconEnUSPage initLoinC001LeconEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001LeconEnUSPage) {
			dejaInitialiseC001LeconEnUSPage = true;
			initLoinC001LeconEnUSPage();
		}
		return (C001LeconEnUSPage)this;
	}

	public void initLoinC001LeconEnUSPage() {
		initC001LeconEnUSPage();
	}

	public void initC001LeconEnUSPage() {
	}

	public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001LeconEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001LeconEnUSPage(RequeteSiteEnUS requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001LeconEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001LeconEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001LeconEnUSPage(String var) throws Exception {
		C001LeconEnUSPage oC001LeconEnUSPage = (C001LeconEnUSPage)this;
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
				o = attribuerC001LeconEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001LeconEnUSPage(String var, Object val) {
		C001LeconEnUSPage oC001LeconEnUSPage = (C001LeconEnUSPage)this;
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
					o = definirC001LeconEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001LeconEnUSPage(String var, String val) {
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
		if(!(o instanceof C001LeconEnUSPage))
			return false;
		C001LeconEnUSPage that = (C001LeconEnUSPage)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("C001LeconEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
