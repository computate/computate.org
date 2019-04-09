package org.computate.site.frFR.cours.c001.l002;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateurFrFRGenPage;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateurFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L002ChoisirOrdinateurFrFRPageGen<DEV> extends C001L002ChoisirOrdinateurFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L002ChoisirOrdinateurFrFRPage = false;

	public C001L002ChoisirOrdinateurFrFRPage initLoinC001L002ChoisirOrdinateurFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L002ChoisirOrdinateurFrFRPage) {
			dejaInitialiseC001L002ChoisirOrdinateurFrFRPage = true;
			initLoinC001L002ChoisirOrdinateurFrFRPage();
		}
		return (C001L002ChoisirOrdinateurFrFRPage)this;
	}

	public void initLoinC001L002ChoisirOrdinateurFrFRPage() {
		super.initLoinC001L002ChoisirOrdinateurFrFRGenPage(requeteSite_);
		initC001L002ChoisirOrdinateurFrFRPage();
	}

	public void initC001L002ChoisirOrdinateurFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L002ChoisirOrdinateurFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L002ChoisirOrdinateurFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L002ChoisirOrdinateurFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L002ChoisirOrdinateurFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L002ChoisirOrdinateurFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L002ChoisirOrdinateurFrFRPage(String var) throws Exception {
		C001L002ChoisirOrdinateurFrFRPage oC001L002ChoisirOrdinateurFrFRPage = (C001L002ChoisirOrdinateurFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L002ChoisirOrdinateurFrFRGenPage(var);
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
				o = attribuerC001L002ChoisirOrdinateurFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L002ChoisirOrdinateurFrFRPage(String var, Object val) {
		C001L002ChoisirOrdinateurFrFRPage oC001L002ChoisirOrdinateurFrFRPage = (C001L002ChoisirOrdinateurFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L002ChoisirOrdinateurFrFRGenPage(var, val);
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
					o = definirC001L002ChoisirOrdinateurFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L002ChoisirOrdinateurFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L002ChoisirOrdinateurFrFRGenPage(var, val);
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
		if(!(o instanceof C001L002ChoisirOrdinateurFrFRPage))
			return false;
		C001L002ChoisirOrdinateurFrFRPage that = (C001L002ChoisirOrdinateurFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L002ChoisirOrdinateurFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
