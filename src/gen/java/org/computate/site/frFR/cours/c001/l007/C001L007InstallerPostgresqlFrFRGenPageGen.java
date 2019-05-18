package org.computate.site.frFR.cours.c001.l007;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresql;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresqlFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L007InstallerPostgresqlFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	/////////////////////////////////
	// c001L007InstallerPostgresql //
	/////////////////////////////////

	/**	L'entité « c001L007InstallerPostgresql »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L007InstallerPostgresql c001L007InstallerPostgresql;
	public Couverture<C001L007InstallerPostgresql> c001L007InstallerPostgresqlCouverture = new Couverture<C001L007InstallerPostgresql>().p(this).c(C001L007InstallerPostgresql.class).var("c001L007InstallerPostgresql").o(c001L007InstallerPostgresql);

	/**	<br/>L'entité « c001L007InstallerPostgresql »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l007.C001L007InstallerPostgresqlFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L007InstallerPostgresql">Trouver l'entité c001L007InstallerPostgresql dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L007InstallerPostgresql(Couverture<C001L007InstallerPostgresql> c);

	public C001L007InstallerPostgresql getC001L007InstallerPostgresql() {
		return c001L007InstallerPostgresql;
	}

	public void setC001L007InstallerPostgresql(C001L007InstallerPostgresql c001L007InstallerPostgresql) {
		this.c001L007InstallerPostgresql = c001L007InstallerPostgresql;
		this.c001L007InstallerPostgresqlCouverture.dejaInitialise = true;
	}
	protected C001L007InstallerPostgresqlFrFRGenPage c001L007InstallerPostgresqlInit() {
		if(!c001L007InstallerPostgresqlCouverture.dejaInitialise) {
			_c001L007InstallerPostgresql(c001L007InstallerPostgresqlCouverture);
			if(c001L007InstallerPostgresql == null)
				setC001L007InstallerPostgresql(c001L007InstallerPostgresqlCouverture.o);
		}
		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.initLoinPourClasse(requeteSite_);
		c001L007InstallerPostgresqlCouverture.dejaInitialise(true);
		return (C001L007InstallerPostgresqlFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L007InstallerPostgresqlFrFRGenPage = false;

	public C001L007InstallerPostgresqlFrFRGenPage initLoinC001L007InstallerPostgresqlFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L007InstallerPostgresqlFrFRGenPage) {
			dejaInitialiseC001L007InstallerPostgresqlFrFRGenPage = true;
			initLoinC001L007InstallerPostgresqlFrFRGenPage();
		}
		return (C001L007InstallerPostgresqlFrFRGenPage)this;
	}

	public void initLoinC001L007InstallerPostgresqlFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L007InstallerPostgresqlFrFRGenPage();
	}

	public void initC001L007InstallerPostgresqlFrFRGenPage() {
		c001L007InstallerPostgresqlInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L007InstallerPostgresqlFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L007InstallerPostgresqlFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L007InstallerPostgresqlFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L007InstallerPostgresqlFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L007InstallerPostgresqlFrFRGenPage(String var) {
		C001L007InstallerPostgresqlFrFRGenPage oC001L007InstallerPostgresqlFrFRGenPage = (C001L007InstallerPostgresqlFrFRGenPage)this;
		switch(var) {
			case "c001L007InstallerPostgresql":
				return oC001L007InstallerPostgresqlFrFRGenPage.c001L007InstallerPostgresql;
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
				o = attribuerC001L007InstallerPostgresqlFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L007InstallerPostgresqlFrFRGenPage(String var, Object val) {
		C001L007InstallerPostgresqlFrFRGenPage oC001L007InstallerPostgresqlFrFRGenPage = (C001L007InstallerPostgresqlFrFRGenPage)this;
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
					o = definirC001L007InstallerPostgresqlFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L007InstallerPostgresqlFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L007InstallerPostgresqlFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L007InstallerPostgresqlFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L007InstallerPostgresqlFrFRGenPage() {
		if(c001L007InstallerPostgresql != null)
			c001L007InstallerPostgresql.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L007InstallerPostgresqlFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L007InstallerPostgresqlFrFRGenPage();
		super.html();
	}

	public void htmlC001L007InstallerPostgresqlFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L007InstallerPostgresqlFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L007InstallerPostgresqlFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L007InstallerPostgresqlFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L007InstallerPostgresqlFrFRGenPage() {
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
		if(!(o instanceof C001L007InstallerPostgresqlFrFRGenPage))
			return false;
		C001L007InstallerPostgresqlFrFRGenPage that = (C001L007InstallerPostgresqlFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L007InstallerPostgresqlFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
