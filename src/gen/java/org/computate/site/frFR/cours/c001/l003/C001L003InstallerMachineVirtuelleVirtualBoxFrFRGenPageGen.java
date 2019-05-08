package org.computate.site.frFR.cours.c001.l003;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	/////////////////////////////////////////////////
	// c001L003InstallerMachineVirtuelleVirtualBox //
	/////////////////////////////////////////////////

	/**	L'entité « c001L003InstallerMachineVirtuelleVirtualBox »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L003InstallerMachineVirtuelleVirtualBox c001L003InstallerMachineVirtuelleVirtualBox;
	public Couverture<C001L003InstallerMachineVirtuelleVirtualBox> c001L003InstallerMachineVirtuelleVirtualBoxCouverture = new Couverture<C001L003InstallerMachineVirtuelleVirtualBox>().p(this).c(C001L003InstallerMachineVirtuelleVirtualBox.class).var("c001L003InstallerMachineVirtuelleVirtualBox").o(c001L003InstallerMachineVirtuelleVirtualBox);

	/**	<br/>L'entité « c001L003InstallerMachineVirtuelleVirtualBox »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L003InstallerMachineVirtuelleVirtualBox">Trouver l'entité c001L003InstallerMachineVirtuelleVirtualBox dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L003InstallerMachineVirtuelleVirtualBox(Couverture<C001L003InstallerMachineVirtuelleVirtualBox> c);

	public C001L003InstallerMachineVirtuelleVirtualBox getC001L003InstallerMachineVirtuelleVirtualBox() {
		return c001L003InstallerMachineVirtuelleVirtualBox;
	}

	public void setC001L003InstallerMachineVirtuelleVirtualBox(C001L003InstallerMachineVirtuelleVirtualBox c001L003InstallerMachineVirtuelleVirtualBox) {
		this.c001L003InstallerMachineVirtuelleVirtualBox = c001L003InstallerMachineVirtuelleVirtualBox;
		this.c001L003InstallerMachineVirtuelleVirtualBoxCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage c001L003InstallerMachineVirtuelleVirtualBoxInit() {
		if(!c001L003InstallerMachineVirtuelleVirtualBoxCouverture.dejaInitialise) {
			_c001L003InstallerMachineVirtuelleVirtualBox(c001L003InstallerMachineVirtuelleVirtualBoxCouverture);
			if(c001L003InstallerMachineVirtuelleVirtualBox == null)
				setC001L003InstallerMachineVirtuelleVirtualBox(c001L003InstallerMachineVirtuelleVirtualBoxCouverture.o);
		}
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.initLoinPourClasse(requeteSite_);
		c001L003InstallerMachineVirtuelleVirtualBoxCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage = false;

	public C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
		c001L003InstallerMachineVirtuelleVirtualBoxInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(String var) {
		C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage oC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage = (C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage)this;
		switch(var) {
			case "c001L003InstallerMachineVirtuelleVirtualBox":
				return oC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage.c001L003InstallerMachineVirtuelleVirtualBox;
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage oC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage = (C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage)this;
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
		if(c001L003InstallerMachineVirtuelleVirtualBox != null)
			c001L003InstallerMachineVirtuelleVirtualBox.htmlBodyCourt();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage();
		super.htmlScript();
	}

	public void htmlScriptC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage() {
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage that = (C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
