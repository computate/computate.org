package org.computate.frFR.site.cours.c001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.frFR.site.recherche.ListeRecherche;
import io.vertx.core.json.JsonArray;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.frFR.site.cours.c001.C001;
import org.apache.commons.lang3.StringUtils;
import org.computate.frFR.site.page.MiseEnPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001GenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001GenPageGen<DEV> extends MiseEnPage {

	///////////////
	// listeC001 //
	///////////////

	/**	L'entité « listeC001 »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<C001> listeC001;
	public Couverture<ListeRecherche<C001>> listeC001Couverture = new Couverture<ListeRecherche<C001>>().p(this).c(ListeRecherche.class).var("listeC001").o(listeC001);

	/**	<br/>L'entité « listeC001 »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001GenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeC001">Trouver l'entité listeC001 dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeC001(Couverture<ListeRecherche<C001>> c);

	public ListeRecherche<C001> getListeC001() {
		return listeC001;
	}

	public void setListeC001(ListeRecherche<C001> listeC001) {
		this.listeC001 = listeC001;
		this.listeC001Couverture.dejaInitialise = true;
	}
	protected C001GenPage listeC001Init() {
		if(!listeC001Couverture.dejaInitialise) {
			_listeC001(listeC001Couverture);
			if(listeC001 == null)
				setListeC001(listeC001Couverture.o);
		}
		if(listeC001 != null)
			listeC001.initLoinPourClasse(requeteSite_);
		listeC001Couverture.dejaInitialise(true);
		return (C001GenPage)this;
	}

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001GenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001">Trouver l'entité c001 dans Solr</a>
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
	protected C001GenPage c001Init() {
		if(!c001Couverture.dejaInitialise) {
			_c001(c001Couverture);
			if(c001 == null)
				setC001(c001Couverture.o);
		}
		if(c001 != null)
			c001.initLoinPourClasse(requeteSite_);
		c001Couverture.dejaInitialise(true);
		return (C001GenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001GenPage = false;

	public C001GenPage initLoinC001GenPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001GenPage) {
			dejaInitialiseC001GenPage = true;
			initLoinC001GenPage();
		}
		return (C001GenPage)this;
	}

	public void initLoinC001GenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initC001GenPage();
	}

	public void initC001GenPage() {
		listeC001Init();
		c001Init();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001GenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001GenPage(RequeteSite requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		listeC001.setRequeteSite_(requeteSite_);
		c001.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001GenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001GenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001GenPage(String var) throws Exception {
		C001GenPage oC001GenPage = (C001GenPage)this;
		switch(var) {
			case "listeC001":
				return oC001GenPage.listeC001;
			case "c001":
				return oC001GenPage.c001;
			default:
				return super.obtenirMiseEnPage(var);
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
				o = attribuerC001GenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001GenPage(String var, Object val) {
		C001GenPage oC001GenPage = (C001GenPage)this;
		switch(var) {
			default:
				return super.attribuerMiseEnPage(var, val);
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
					o = definirC001GenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001GenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001GenPage();
		super.htmlScriptsMiseEnPage();
	}

	public void htmlScriptsC001GenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001GenPage();
		super.htmlScriptMiseEnPage();
	}

	public void htmlScriptC001GenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001GenPage();
		super.htmlBodyMiseEnPage();
	}

	public void htmlBodyC001GenPage() {
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
		if(!(o instanceof C001GenPage))
			return false;
		C001GenPage that = (C001GenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001GenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
