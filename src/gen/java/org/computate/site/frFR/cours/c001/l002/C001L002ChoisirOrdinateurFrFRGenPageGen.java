package org.computate.site.frFR.cours.c001.l002;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateur;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.cours.c001.C001LeconFrFRPage;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateurFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L002ChoisirOrdinateurFrFRGenPageGen<DEV> extends C001LeconFrFRPage {

	///////////////////////////////
	// c001L002ChoisirOrdinateur //
	///////////////////////////////

	/**	L'entité « c001L002ChoisirOrdinateur »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L002ChoisirOrdinateur c001L002ChoisirOrdinateur;
	public Couverture<C001L002ChoisirOrdinateur> c001L002ChoisirOrdinateurCouverture = new Couverture<C001L002ChoisirOrdinateur>().p(this).c(C001L002ChoisirOrdinateur.class).var("c001L002ChoisirOrdinateur").o(c001L002ChoisirOrdinateur);

	/**	<br/>L'entité « c001L002ChoisirOrdinateur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l002.C001L002ChoisirOrdinateurFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L002ChoisirOrdinateur">Trouver l'entité c001L002ChoisirOrdinateur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L002ChoisirOrdinateur(Couverture<C001L002ChoisirOrdinateur> c);

	public C001L002ChoisirOrdinateur getC001L002ChoisirOrdinateur() {
		return c001L002ChoisirOrdinateur;
	}

	public void setC001L002ChoisirOrdinateur(C001L002ChoisirOrdinateur c001L002ChoisirOrdinateur) {
		this.c001L002ChoisirOrdinateur = c001L002ChoisirOrdinateur;
		this.c001L002ChoisirOrdinateurCouverture.dejaInitialise = true;
	}
	protected C001L002ChoisirOrdinateurFrFRGenPage c001L002ChoisirOrdinateurInit() {
		if(!c001L002ChoisirOrdinateurCouverture.dejaInitialise) {
			_c001L002ChoisirOrdinateur(c001L002ChoisirOrdinateurCouverture);
			if(c001L002ChoisirOrdinateur == null)
				setC001L002ChoisirOrdinateur(c001L002ChoisirOrdinateurCouverture.o);
		}
		if(c001L002ChoisirOrdinateur != null)
			c001L002ChoisirOrdinateur.initLoinPourClasse(requeteSite_);
		c001L002ChoisirOrdinateurCouverture.dejaInitialise(true);
		return (C001L002ChoisirOrdinateurFrFRGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L002ChoisirOrdinateurFrFRGenPage = false;

	public C001L002ChoisirOrdinateurFrFRGenPage initLoinC001L002ChoisirOrdinateurFrFRGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L002ChoisirOrdinateurFrFRGenPage) {
			dejaInitialiseC001L002ChoisirOrdinateurFrFRGenPage = true;
			initLoinC001L002ChoisirOrdinateurFrFRGenPage();
		}
		return (C001L002ChoisirOrdinateurFrFRGenPage)this;
	}

	public void initLoinC001L002ChoisirOrdinateurFrFRGenPage() {
		super.initLoinC001LeconFrFRPage(requeteSite_);
		initC001L002ChoisirOrdinateurFrFRGenPage();
	}

	public void initC001L002ChoisirOrdinateurFrFRGenPage() {
		c001L002ChoisirOrdinateurInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L002ChoisirOrdinateurFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L002ChoisirOrdinateurFrFRGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001LeconFrFRPage(requeteSite_);
		c001L002ChoisirOrdinateur.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L002ChoisirOrdinateurFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L002ChoisirOrdinateurFrFRGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L002ChoisirOrdinateurFrFRGenPage(String var) throws Exception {
		C001L002ChoisirOrdinateurFrFRGenPage oC001L002ChoisirOrdinateurFrFRGenPage = (C001L002ChoisirOrdinateurFrFRGenPage)this;
		switch(var) {
			case "c001L002ChoisirOrdinateur":
				return oC001L002ChoisirOrdinateurFrFRGenPage.c001L002ChoisirOrdinateur;
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
				o = attribuerC001L002ChoisirOrdinateurFrFRGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L002ChoisirOrdinateurFrFRGenPage(String var, Object val) {
		C001L002ChoisirOrdinateurFrFRGenPage oC001L002ChoisirOrdinateurFrFRGenPage = (C001L002ChoisirOrdinateurFrFRGenPage)this;
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
					o = definirC001L002ChoisirOrdinateurFrFRGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L002ChoisirOrdinateurFrFRGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconFrFRPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001L002ChoisirOrdinateurFrFRGenPage();
	}

	public void htmlScriptsC001L002ChoisirOrdinateurFrFRGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001L002ChoisirOrdinateurFrFRGenPage();
	}

	public void htmlBodyC001L002ChoisirOrdinateurFrFRGenPage() {
		c001L002ChoisirOrdinateur.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L002ChoisirOrdinateurFrFRGenPage();
	}

	public void htmlBodyCourtC001L002ChoisirOrdinateurFrFRGenPage() {
		c001L002ChoisirOrdinateur.htmlBodyCourt();
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
		if(!(o instanceof C001L002ChoisirOrdinateurFrFRGenPage))
			return false;
		C001L002ChoisirOrdinateurFrFRGenPage that = (C001L002ChoisirOrdinateurFrFRGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L002ChoisirOrdinateurFrFRGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
