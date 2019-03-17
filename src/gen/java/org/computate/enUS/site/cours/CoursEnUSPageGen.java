package org.computate.enUS.site.cours;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import org.computate.enUS.site.cluster.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.enUS.site.cours.CoursEnUSGenPage;
import org.computate.enUS.site.couverture.Couverture;
import org.apache.commons.lang3.StringUtils;
import org.computate.enUS.site.requete.RequeteSite;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.cours.CoursEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CoursEnUSPageGen<DEV> extends CoursEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursEnUSPage = false;

	public CoursEnUSPage initLoinCoursEnUSPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursEnUSPage) {
			dejaInitialiseCoursEnUSPage = true;
			initLoinCoursEnUSPage();
		}
		return (CoursEnUSPage)this;
	}

	public void initLoinCoursEnUSPage() {
		initCoursEnUSPage();
	}

	public void initCoursEnUSPage() {
	}

	public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinCoursEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursEnUSPage(RequeteSite requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteCoursEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursEnUSPage(String var) throws Exception {
		CoursEnUSPage oCoursEnUSPage = (CoursEnUSPage)this;
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
				o = attribuerCoursEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursEnUSPage(String var, Object val) {
		CoursEnUSPage oCoursEnUSPage = (CoursEnUSPage)this;
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
					o = definirCoursEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursEnUSPage(String var, String val) {
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
		if(!(o instanceof CoursEnUSPage))
			return false;
		CoursEnUSPage that = (CoursEnUSPage)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("CoursEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
