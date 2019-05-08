package org.computate.site.frFR.cours.c001.l003;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxFrFRPageGen<DEV> extends C001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage = false;

	public C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage() {
		super.initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(String var) {
		C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage oC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage = (C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage)this;
		switch(var) {
			default:
				return super.obtenirC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(var);
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage oC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage = (C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage)this;
		switch(var) {
			default:
				return super.attribuerC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(var, val);
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L003InstallerMachineVirtuelleVirtualBoxFrFRGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage();
		super.htmlScripts();
	}

	public void htmlScriptsC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBoxFrFRPage() {
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage that = (C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage {");
		sb.append(" }");
		return sb.toString();
	}
}
