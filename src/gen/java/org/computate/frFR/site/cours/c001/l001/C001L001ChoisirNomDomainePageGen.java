package org.computate.frFR.site.cours.c001.l001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaineGenPage;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomainePage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomainePageGen<DEV> extends C001L001ChoisirNomDomaineGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomainePage = false;

	public C001L001ChoisirNomDomainePage initLoinC001L001ChoisirNomDomainePage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomainePage) {
			dejaInitialiseC001L001ChoisirNomDomainePage = true;
			initLoinC001L001ChoisirNomDomainePage();
		}
		return (C001L001ChoisirNomDomainePage)this;
	}

	public void initLoinC001L001ChoisirNomDomainePage() {
		super.initLoinC001L001ChoisirNomDomaineGenPage(requeteSite_);
		initC001L001ChoisirNomDomainePage();
	}

	public void initC001L001ChoisirNomDomainePage() {
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001L001ChoisirNomDomainePage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomainePage(RequeteSite requeteSite_) {
			super.requeteSiteC001L001ChoisirNomDomaineGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001L001ChoisirNomDomainePage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomainePage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomainePage(String var) throws Exception {
		C001L001ChoisirNomDomainePage oC001L001ChoisirNomDomainePage = (C001L001ChoisirNomDomainePage)this;
		switch(var) {
			default:
				return super.obtenirC001L001ChoisirNomDomaineGenPage(var);
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
				o = attribuerC001L001ChoisirNomDomainePage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomainePage(String var, Object val) {
		C001L001ChoisirNomDomainePage oC001L001ChoisirNomDomainePage = (C001L001ChoisirNomDomainePage)this;
		switch(var) {
			default:
				return super.attribuerC001L001ChoisirNomDomaineGenPage(var, val);
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
					o = definirC001L001ChoisirNomDomainePage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomainePage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L001ChoisirNomDomaineGenPage(var, val);
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
		if(!(o instanceof C001L001ChoisirNomDomainePage))
			return false;
		C001L001ChoisirNomDomainePage that = (C001L001ChoisirNomDomainePage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomainePage {");
		sb.append(" }");
		return sb.toString();
	}
}
