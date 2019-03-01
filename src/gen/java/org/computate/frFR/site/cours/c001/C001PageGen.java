package org.computate.frFR.site.cours.c001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.cours.c001.C001GenPage;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Page&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001PageGen<DEV> extends C001GenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001Page = false;

	public C001Page initLoinC001Page(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001Page) {
			dejaInitialiseC001Page = true;
			initLoinC001Page();
		}
		return (C001Page)this;
	}

	public void initLoinC001Page() {
		super.initLoinC001GenPage(requeteSite_);
		initC001Page();
	}

	public void initC001Page() {
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001Page(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001Page(RequeteSite requeteSite_) {
			super.requeteSiteC001GenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001Page(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001Page(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001Page(String var) throws Exception {
		C001Page oC001Page = (C001Page)this;
		switch(var) {
			default:
				return super.obtenirC001GenPage(var);
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
				o = attribuerC001Page(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001Page(String var, Object val) {
		C001Page oC001Page = (C001Page)this;
		switch(var) {
			default:
				return super.attribuerC001GenPage(var, val);
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
					o = definirC001Page(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001Page(String var, String val) {
		switch(var) {
			default:
				return super.definirC001GenPage(var, val);
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
		if(!(o instanceof C001Page))
			return false;
		C001Page that = (C001Page)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001Page {");
		sb.append(" }");
		return sb.toString();
	}
}
