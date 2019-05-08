package org.computate.site.frFR.cours.c001.l001;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	///////////////////////////////
	// c001L001ChoisirNomDomaine //
	///////////////////////////////

	/**	L'entité « c001L001ChoisirNomDomaine »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L001ChoisirNomDomaine c001L001ChoisirNomDomaine;
	public Couverture<C001L001ChoisirNomDomaine> c001L001ChoisirNomDomaineCouverture = new Couverture<C001L001ChoisirNomDomaine>().p(this).c(C001L001ChoisirNomDomaine.class).var("c001L001ChoisirNomDomaine").o(c001L001ChoisirNomDomaine);

	/**	<br/>L'entité « c001L001ChoisirNomDomaine »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L001ChoisirNomDomaine">Trouver l'entité c001L001ChoisirNomDomaine dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L001ChoisirNomDomaine(Couverture<C001L001ChoisirNomDomaine> c);

	public C001L001ChoisirNomDomaine getC001L001ChoisirNomDomaine() {
		return c001L001ChoisirNomDomaine;
	}

	public void setC001L001ChoisirNomDomaine(C001L001ChoisirNomDomaine c001L001ChoisirNomDomaine) {
		this.c001L001ChoisirNomDomaine = c001L001ChoisirNomDomaine;
		this.c001L001ChoisirNomDomaineCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaineFrFRGenPage c001L001ChoisirNomDomaineInit() {
		if(!c001L001ChoisirNomDomaineCouverture.dejaInitialise) {
			_c001L001ChoisirNomDomaine(c001L001ChoisirNomDomaineCouverture);
			if(c001L001ChoisirNomDomaine == null)
				setC001L001ChoisirNomDomaine(c001L001ChoisirNomDomaineCouverture.o);
		}
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.initLoinPourClasse(requeteSite_);
		c001L001ChoisirNomDomaineCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaineFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaineFrFRGenPage = false;

	public C001L001ChoisirNomDomaineFrFRGenPage initLoinC001L001ChoisirNomDomaineFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaineFrFRGenPage) {
			dejaInitialiseC001L001ChoisirNomDomaineFrFRGenPage = true;
			initLoinC001L001ChoisirNomDomaineFrFRGenPage();
		}
		return (C001L001ChoisirNomDomaineFrFRGenPage)this;
	}

	public void initLoinC001L001ChoisirNomDomaineFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L001ChoisirNomDomaineFrFRGenPage();
	}

	public void initC001L001ChoisirNomDomaineFrFRGenPage() {
		c001L001ChoisirNomDomaineInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L001ChoisirNomDomaineFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaineFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaineFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaineFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaineFrFRGenPage(String var) {
		C001L001ChoisirNomDomaineFrFRGenPage oC001L001ChoisirNomDomaineFrFRGenPage = (C001L001ChoisirNomDomaineFrFRGenPage)this;
		switch(var) {
			case "c001L001ChoisirNomDomaine":
				return oC001L001ChoisirNomDomaineFrFRGenPage.c001L001ChoisirNomDomaine;
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
				o = attribuerC001L001ChoisirNomDomaineFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaineFrFRGenPage(String var, Object val) {
		C001L001ChoisirNomDomaineFrFRGenPage oC001L001ChoisirNomDomaineFrFRGenPage = (C001L001ChoisirNomDomaineFrFRGenPage)this;
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
					o = definirC001L001ChoisirNomDomaineFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaineFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L001ChoisirNomDomaineFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L001ChoisirNomDomaineFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L001ChoisirNomDomaineFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L001ChoisirNomDomaineFrFRGenPage() {
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L001ChoisirNomDomaineFrFRGenPage();
	}

	public void htmlBodyCourtC001L001ChoisirNomDomaineFrFRGenPage() {
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L001ChoisirNomDomaineFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L001ChoisirNomDomaineFrFRGenPage() {
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
		if(!(o instanceof C001L001ChoisirNomDomaineFrFRGenPage))
			return false;
		C001L001ChoisirNomDomaineFrFRGenPage that = (C001L001ChoisirNomDomaineFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaineFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
