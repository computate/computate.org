package org.computate.frFR.site.page.parti;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.page.parti.PagePart;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.page.parti.PageHtml&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class PageHtmlGen<DEV> extends PagePart {

	public PageHtmlGen() {
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePageHtml = false;

	public PageHtml initLoinPageHtml(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePageHtml) {
			dejaInitialisePageHtml = true;
			initLoinPageHtml();
		}
		return (PageHtml)this;
	}

	public void initLoinPageHtml() {
		initPageHtml();
	}

	public void initPageHtml() {
	}

	public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinPageHtml(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePageHtml(RequeteSite requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSitePageHtml(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPageHtml(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPageHtml(String var) throws Exception {
		PageHtml oPageHtml = (PageHtml)this;
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
				o = attribuerPageHtml(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPageHtml(String var, Object val) {
		PageHtml oPageHtml = (PageHtml)this;
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
					o = definirPageHtml(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPageHtml(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyPageHtml();
	}

	public void htmlBodyPageHtml() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtPageHtml();
	}

	public void htmlBodyCourtPageHtml() {
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
		if(!(o instanceof PageHtml))
			return false;
		PageHtml that = (PageHtml)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("PageHtml {");
		sb.append(" }");
		return sb.toString();
	}
}
