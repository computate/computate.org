package org.computate.site.frFR.cours.c001.l008;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificatFrFRGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificatFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L008CreerCertificatFrFRPageGen<DEV> extends C001L008CreerCertificatFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L008CreerCertificatFrFRPage = false;

	public C001L008CreerCertificatFrFRPage initLoinC001L008CreerCertificatFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L008CreerCertificatFrFRPage) {
			dejaInitialiseC001L008CreerCertificatFrFRPage = true;
			initLoinC001L008CreerCertificatFrFRPage();
		}
		return (C001L008CreerCertificatFrFRPage)this;
	}

	public void initLoinC001L008CreerCertificatFrFRPage() {
		super.initLoinC001L008CreerCertificatFrFRGenPage(requeteSite_);
		initC001L008CreerCertificatFrFRPage();
	}

	public void initC001L008CreerCertificatFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L008CreerCertificatFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L008CreerCertificatFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L008CreerCertificatFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L008CreerCertificatFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L008CreerCertificatFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L008CreerCertificatFrFRPage(String var) {
		C001L008CreerCertificatFrFRPage oC001L008CreerCertificatFrFRPage = (C001L008CreerCertificatFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L008CreerCertificatFrFRGenPage(var);
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
				o = attribuerC001L008CreerCertificatFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L008CreerCertificatFrFRPage(String var, Object val) {
		C001L008CreerCertificatFrFRPage oC001L008CreerCertificatFrFRPage = (C001L008CreerCertificatFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L008CreerCertificatFrFRGenPage(var, val);
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
					o = definirC001L008CreerCertificatFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L008CreerCertificatFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L008CreerCertificatFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L008CreerCertificatFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L008CreerCertificatFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L008CreerCertificatFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificatFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L008CreerCertificatFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L008CreerCertificatFrFRPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L008CreerCertificatFrFRPage();
		super.htmlScript();
	}

	public void htmlScriptC001L008CreerCertificatFrFRPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L008CreerCertificatFrFRPage();
		super.html();
	}

	public void htmlC001L008CreerCertificatFrFRPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L008CreerCertificatFrFRPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L008CreerCertificatFrFRPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L008CreerCertificatFrFRPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L008CreerCertificatFrFRPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L008CreerCertificatFrFRPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L008CreerCertificatFrFRPage() {
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
		if(!(o instanceof C001L008CreerCertificatFrFRPage))
			return false;
		C001L008CreerCertificatFrFRPage that = (C001L008CreerCertificatFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L008CreerCertificatFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
