package org.computate.frFR.site.cours;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.frFR.site.cours.CoursFrFRGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.CoursFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursFrFRPageGen<DEV> extends CoursFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursFrFRPage = false;

	public CoursFrFRPage initLoinCoursFrFRPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursFrFRPage) {
			dejaInitialiseCoursFrFRPage = true;
			initLoinCoursFrFRPage();
		}
		return (CoursFrFRPage)this;
	}

	public void initLoinCoursFrFRPage() {
		super.initLoinCoursFrFRGenPage(requeteSite_);
		initCoursFrFRPage();
	}

	public void initCoursFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinCoursFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursFrFRPage(RequeteSite requeteSite_) {
			super.requeteSiteCoursFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteCoursFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursFrFRPage(String var) throws Exception {
		CoursFrFRPage oCoursFrFRPage = (CoursFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirCoursFrFRGenPage(var);
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
				o = attribuerCoursFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursFrFRPage(String var, Object val) {
		CoursFrFRPage oCoursFrFRPage = (CoursFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerCoursFrFRGenPage(var, val);
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
					o = definirCoursFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirCoursFrFRGenPage(var, val);
		}
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
		if(!(o instanceof CoursFrFRPage))
			return false;
		CoursFrFRPage that = (CoursFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
