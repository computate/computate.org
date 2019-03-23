package org.computate.site.frFR.cours.c001.l001;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenPage;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaineFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineFrFRPageGen<DEV> extends C001L001ChoisirNomDomaineFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaineFrFRPage = false;

	public C001L001ChoisirNomDomaineFrFRPage initLoinC001L001ChoisirNomDomaineFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaineFrFRPage) {
			dejaInitialiseC001L001ChoisirNomDomaineFrFRPage = true;
			initLoinC001L001ChoisirNomDomaineFrFRPage();
		}
		return (C001L001ChoisirNomDomaineFrFRPage)this;
	}

	public void initLoinC001L001ChoisirNomDomaineFrFRPage() {
		super.initLoinC001L001ChoisirNomDomaineFrFRGenPage(requeteSite_);
		initC001L001ChoisirNomDomaineFrFRPage();
	}

	public void initC001L001ChoisirNomDomaineFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L001ChoisirNomDomaineFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaineFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L001ChoisirNomDomaineFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaineFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaineFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaineFrFRPage(String var) throws Exception {
		C001L001ChoisirNomDomaineFrFRPage oC001L001ChoisirNomDomaineFrFRPage = (C001L001ChoisirNomDomaineFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L001ChoisirNomDomaineFrFRGenPage(var);
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
				o = attribuerC001L001ChoisirNomDomaineFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaineFrFRPage(String var, Object val) {
		C001L001ChoisirNomDomaineFrFRPage oC001L001ChoisirNomDomaineFrFRPage = (C001L001ChoisirNomDomaineFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L001ChoisirNomDomaineFrFRGenPage(var, val);
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
					o = definirC001L001ChoisirNomDomaineFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaineFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L001ChoisirNomDomaineFrFRGenPage(var, val);
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
		if(!(o instanceof C001L001ChoisirNomDomaineFrFRPage))
			return false;
		C001L001ChoisirNomDomaineFrFRPage that = (C001L001ChoisirNomDomaineFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaineFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
