package org.computate.site.enUS.cours.c001.l005;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l004.C001L005InstallerEclipse;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipseEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerEclipseEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	//////////////////////////////
	// c001L005InstallerEclipse //
	//////////////////////////////

	/**	L'entité « c001L005InstallerEclipse »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L005InstallerEclipse c001L005InstallerEclipse;
	public Couverture<C001L005InstallerEclipse> c001L005InstallerEclipseCouverture = new Couverture<C001L005InstallerEclipse>().p(this).c(C001L005InstallerEclipse.class).var("c001L005InstallerEclipse").o(c001L005InstallerEclipse);

	/**	<br/>L'entité « c001L005InstallerEclipse »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipseEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L005InstallerEclipse">Trouver l'entité c001L005InstallerEclipse dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L005InstallerEclipse(Couverture<C001L005InstallerEclipse> c);

	public C001L005InstallerEclipse getC001L005InstallerEclipse() {
		return c001L005InstallerEclipse;
	}

	public void setC001L005InstallerEclipse(C001L005InstallerEclipse c001L005InstallerEclipse) {
		this.c001L005InstallerEclipse = c001L005InstallerEclipse;
		this.c001L005InstallerEclipseCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerEclipseEnUSGenPage c001L005InstallerEclipseInit() {
		if(!c001L005InstallerEclipseCouverture.dejaInitialise) {
			_c001L005InstallerEclipse(c001L005InstallerEclipseCouverture);
			if(c001L005InstallerEclipse == null)
				setC001L005InstallerEclipse(c001L005InstallerEclipseCouverture.o);
		}
		c001L005InstallerEclipseCouverture.dejaInitialise(true);
		return (C001L005InstallerEclipseEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerEclipseEnUSGenPage = false;

	public C001L005InstallerEclipseEnUSGenPage initLoinC001L005InstallerEclipseEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerEclipseEnUSGenPage) {
			dejaInitialiseC001L005InstallerEclipseEnUSGenPage = true;
			initLoinC001L005InstallerEclipseEnUSGenPage();
		}
		return (C001L005InstallerEclipseEnUSGenPage)this;
	}

	public void initLoinC001L005InstallerEclipseEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L005InstallerEclipseEnUSGenPage();
	}

	public void initC001L005InstallerEclipseEnUSGenPage() {
		c001L005InstallerEclipseInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L005InstallerEclipseEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerEclipseEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L005InstallerEclipseEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerEclipseEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerEclipseEnUSGenPage(String var) throws Exception {
		C001L005InstallerEclipseEnUSGenPage oC001L005InstallerEclipseEnUSGenPage = (C001L005InstallerEclipseEnUSGenPage)this;
		switch(var) {
			case "c001L005InstallerEclipse":
				return oC001L005InstallerEclipseEnUSGenPage.c001L005InstallerEclipse;
			default:
				return super.obtenirC001LeconEnUSPage(var);
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
				o = attribuerC001L005InstallerEclipseEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerEclipseEnUSGenPage(String var, Object val) {
		C001L005InstallerEclipseEnUSGenPage oC001L005InstallerEclipseEnUSGenPage = (C001L005InstallerEclipseEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconEnUSPage(var, val);
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
					o = definirC001L005InstallerEclipseEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerEclipseEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001L005InstallerEclipseEnUSGenPage();
	}

	public void htmlScriptsC001L005InstallerEclipseEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001L005InstallerEclipseEnUSGenPage();
	}

	public void htmlBodyC001L005InstallerEclipseEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerEclipseEnUSGenPage();
	}

	public void htmlBodyCourtC001L005InstallerEclipseEnUSGenPage() {
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
		if(!(o instanceof C001L005InstallerEclipseEnUSGenPage))
			return false;
		C001L005InstallerEclipseEnUSGenPage that = (C001L005InstallerEclipseEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerEclipseEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
