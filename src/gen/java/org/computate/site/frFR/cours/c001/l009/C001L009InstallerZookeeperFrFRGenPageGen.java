package org.computate.site.frFR.cours.c001.l009;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeperFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerZookeeperFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	////////////////////////////////
	// c001L009InstallerZookeeper //
	////////////////////////////////

	/**	L'entité « c001L009InstallerZookeeper »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L009InstallerZookeeper c001L009InstallerZookeeper;
	public Couverture<C001L009InstallerZookeeper> c001L009InstallerZookeeperCouverture = new Couverture<C001L009InstallerZookeeper>().p(this).c(C001L009InstallerZookeeper.class).var("c001L009InstallerZookeeper").o(c001L009InstallerZookeeper);

	/**	<br/>L'entité « c001L009InstallerZookeeper »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeperFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L009InstallerZookeeper">Trouver l'entité c001L009InstallerZookeeper dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L009InstallerZookeeper(Couverture<C001L009InstallerZookeeper> c);

	public C001L009InstallerZookeeper getC001L009InstallerZookeeper() {
		return c001L009InstallerZookeeper;
	}

	public void setC001L009InstallerZookeeper(C001L009InstallerZookeeper c001L009InstallerZookeeper) {
		this.c001L009InstallerZookeeper = c001L009InstallerZookeeper;
		this.c001L009InstallerZookeeperCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeperFrFRGenPage c001L009InstallerZookeeperInit() {
		if(!c001L009InstallerZookeeperCouverture.dejaInitialise) {
			_c001L009InstallerZookeeper(c001L009InstallerZookeeperCouverture);
			if(c001L009InstallerZookeeper == null)
				setC001L009InstallerZookeeper(c001L009InstallerZookeeperCouverture.o);
		}
		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.initLoinPourClasse(requeteSite_);
		c001L009InstallerZookeeperCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeperFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L009InstallerZookeeperFrFRGenPage = false;

	public C001L009InstallerZookeeperFrFRGenPage initLoinC001L009InstallerZookeeperFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerZookeeperFrFRGenPage) {
			dejaInitialiseC001L009InstallerZookeeperFrFRGenPage = true;
			initLoinC001L009InstallerZookeeperFrFRGenPage();
		}
		return (C001L009InstallerZookeeperFrFRGenPage)this;
	}

	public void initLoinC001L009InstallerZookeeperFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L009InstallerZookeeperFrFRGenPage();
	}

	public void initC001L009InstallerZookeeperFrFRGenPage() {
		c001L009InstallerZookeeperInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L009InstallerZookeeperFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerZookeeperFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L009InstallerZookeeperFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerZookeeperFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerZookeeperFrFRGenPage(String var) {
		C001L009InstallerZookeeperFrFRGenPage oC001L009InstallerZookeeperFrFRGenPage = (C001L009InstallerZookeeperFrFRGenPage)this;
		switch(var) {
			case "c001L009InstallerZookeeper":
				return oC001L009InstallerZookeeperFrFRGenPage.c001L009InstallerZookeeper;
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
				o = attribuerC001L009InstallerZookeeperFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerZookeeperFrFRGenPage(String var, Object val) {
		C001L009InstallerZookeeperFrFRGenPage oC001L009InstallerZookeeperFrFRGenPage = (C001L009InstallerZookeeperFrFRGenPage)this;
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
					o = definirC001L009InstallerZookeeperFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerZookeeperFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L009InstallerZookeeperFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L009InstallerZookeeperFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L009InstallerZookeeperFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerZookeeperFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerZookeeperFrFRGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L009InstallerZookeeperFrFRGenPage() {
		if(c001L009InstallerZookeeper != null)
			c001L009InstallerZookeeper.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L009InstallerZookeeperFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L009InstallerZookeeperFrFRGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlC001L009InstallerZookeeperFrFRGenPage();
		super.html();
	}

	public void htmlC001L009InstallerZookeeperFrFRGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaC001L009InstallerZookeeperFrFRGenPage();
		super.htmlMeta();
	}

	public void htmlMetaC001L009InstallerZookeeperFrFRGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesC001L009InstallerZookeeperFrFRGenPage();
		super.htmlStyles();
	}

	public void htmlStylesC001L009InstallerZookeeperFrFRGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleC001L009InstallerZookeeperFrFRGenPage();
		super.htmlStyle();
	}

	public void htmlStyleC001L009InstallerZookeeperFrFRGenPage() {
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
		if(!(o instanceof C001L009InstallerZookeeperFrFRGenPage))
			return false;
		C001L009InstallerZookeeperFrFRGenPage that = (C001L009InstallerZookeeperFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerZookeeperFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
