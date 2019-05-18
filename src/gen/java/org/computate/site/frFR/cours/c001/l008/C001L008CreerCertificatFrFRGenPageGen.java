package org.computate.site.frFR.cours.c001.l008;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificatFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L008CreerCertificatFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	/////////////////////////////
	// c001L008CreerCertificat //
	/////////////////////////////

	/**	L'entité « c001L008CreerCertificat »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L008CreerCertificat c001L008CreerCertificat;
	public Couverture<C001L008CreerCertificat> c001L008CreerCertificatCouverture = new Couverture<C001L008CreerCertificat>().p(this).c(C001L008CreerCertificat.class).var("c001L008CreerCertificat").o(c001L008CreerCertificat);

	/**	<br/>L'entité « c001L008CreerCertificat »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificatFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L008CreerCertificat">Trouver l'entité c001L008CreerCertificat dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L008CreerCertificat(Couverture<C001L008CreerCertificat> c);

	public C001L008CreerCertificat getC001L008CreerCertificat() {
		return c001L008CreerCertificat;
	}

	public void setC001L008CreerCertificat(C001L008CreerCertificat c001L008CreerCertificat) {
		this.c001L008CreerCertificat = c001L008CreerCertificat;
		this.c001L008CreerCertificatCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificatFrFRGenPage c001L008CreerCertificatInit() {
		if(!c001L008CreerCertificatCouverture.dejaInitialise) {
			_c001L008CreerCertificat(c001L008CreerCertificatCouverture);
			if(c001L008CreerCertificat == null)
				setC001L008CreerCertificat(c001L008CreerCertificatCouverture.o);
		}
		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.initLoinPourClasse(requeteSite_);
		c001L008CreerCertificatCouverture.dejaInitialise(true);
		return (C001L008CreerCertificatFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L008CreerCertificatFrFRGenPage = false;

	public C001L008CreerCertificatFrFRGenPage initLoinC001L008CreerCertificatFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L008CreerCertificatFrFRGenPage) {
			dejaInitialiseC001L008CreerCertificatFrFRGenPage = true;
			initLoinC001L008CreerCertificatFrFRGenPage();
		}
		return (C001L008CreerCertificatFrFRGenPage)this;
	}

	public void initLoinC001L008CreerCertificatFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L008CreerCertificatFrFRGenPage();
	}

	public void initC001L008CreerCertificatFrFRGenPage() {
		c001L008CreerCertificatInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L008CreerCertificatFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L008CreerCertificatFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L008CreerCertificatFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L008CreerCertificatFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L008CreerCertificatFrFRGenPage(String var) {
		C001L008CreerCertificatFrFRGenPage oC001L008CreerCertificatFrFRGenPage = (C001L008CreerCertificatFrFRGenPage)this;
		switch(var) {
			case "c001L008CreerCertificat":
				return oC001L008CreerCertificatFrFRGenPage.c001L008CreerCertificat;
			default:
				return super.obtenirC001LeconFrFRPage(var);
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
				o = attribuerC001L008CreerCertificatFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L008CreerCertificatFrFRGenPage(String var, Object val) {
		C001L008CreerCertificatFrFRGenPage oC001L008CreerCertificatFrFRGenPage = (C001L008CreerCertificatFrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconFrFRPage(var, val);
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
					o = definirC001L008CreerCertificatFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L008CreerCertificatFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L008CreerCertificatFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L008CreerCertificatFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L008CreerCertificatFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificatFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L008CreerCertificatFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L008CreerCertificatFrFRGenPage() {
		if(c001L008CreerCertificat != null)
			c001L008CreerCertificat.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L008CreerCertificatFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L008CreerCertificatFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L008CreerCertificatFrFRGenPage();
		super.html();
	}

	public void htmlC001L008CreerCertificatFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L008CreerCertificatFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L008CreerCertificatFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L008CreerCertificatFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L008CreerCertificatFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L008CreerCertificatFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L008CreerCertificatFrFRGenPage() {
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
		if(!(o instanceof C001L008CreerCertificatFrFRGenPage))
			return false;
		C001L008CreerCertificatFrFRGenPage that = (C001L008CreerCertificatFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L008CreerCertificatFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
