package org.computate.site.frFR.cours.c001;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.frFR.cours.c001.C001;
import org.computate.site.frFR.cours.CoursFrFRPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.C001FrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001FrFRGenPageGen<DEV> extends CoursFrFRPage {

	//////////
	// c001 //
	//////////

	/**	L'entité « c001 »
	 *	 is defined as null before being initialized. 
	 */
	protected C001 c001;
	public Couverture<C001> c001Couverture = new Couverture<C001>().p(this).c(C001.class).var("c001").o(c001);

	/**	<br/>L'entité « c001 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.C001FrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001">Trouver l'entité c001 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001(Couverture<C001> c);

	public C001 getC001() {
		return c001;
	}

	public void setC001(C001 c001) {
		this.c001 = c001;
		this.c001Couverture.dejaInitialise = true;
	}
	protected C001FrFRGenPage c001Init() {
		if(!c001Couverture.dejaInitialise) {
			_c001(c001Couverture);
			if(c001 == null)
				setC001(c001Couverture.o);
		}
		if(c001 != null)
			c001.initLoinPourClasse(requeteSite_);
		c001Couverture.dejaInitialise(true);
		return (C001FrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001FrFRGenPage = false;

	public C001FrFRGenPage initLoinC001FrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001FrFRGenPage) {
			dejaInitialiseC001FrFRGenPage = true;
			initLoinC001FrFRGenPage();
		}
		return (C001FrFRGenPage)this;
	}

	public void initLoinC001FrFRGenPage() {
		super.initLoinCoursFrFRPage(requeteSite_);
		initC001FrFRGenPage();
	}

	public void initC001FrFRGenPage() {
		c001Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001FrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001FrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteCoursFrFRPage(requeteSite_);
		c001.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001FrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001FrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001FrFRGenPage(String var) throws Exception {
		C001FrFRGenPage oC001FrFRGenPage = (C001FrFRGenPage)this;
		switch(var) {
			case "c001":
				return oC001FrFRGenPage.c001;
			default:
				return super.obtenirCoursFrFRPage(var);
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
				o = attribuerC001FrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001FrFRGenPage(String var, Object val) {
		C001FrFRGenPage oC001FrFRGenPage = (C001FrFRGenPage)this;
		switch(var) {
			default:
				return super.attribuerCoursFrFRPage(var, val);
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
					o = definirC001FrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001FrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirCoursFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001FrFRGenPage();
	}

	public void htmlScriptsC001FrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001FrFRGenPage();
	}

	public void htmlBodyC001FrFRGenPage() {
		c001.htmlBody();
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
		if(!(o instanceof C001FrFRGenPage))
			return false;
		C001FrFRGenPage that = (C001FrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001FrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
