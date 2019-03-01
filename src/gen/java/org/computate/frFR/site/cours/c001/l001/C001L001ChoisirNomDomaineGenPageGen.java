package org.computate.frFR.site.cours.c001.l001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.frFR.site.recherche.ListeRecherche;
import org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.frFR.site.page.MiseEnPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaineGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineGenPageGen<DEV> extends MiseEnPage {

	////////////////////////////////////
	// listeC001L001ChoisirNomDomaine //
	////////////////////////////////////

	/**	L'entité « listeC001L001ChoisirNomDomaine »
	 *	 is defined as null before being initialized. 
	 */
	protected ListeRecherche<C001L001ChoisirNomDomaine> listeC001L001ChoisirNomDomaine;
	public Couverture<ListeRecherche<C001L001ChoisirNomDomaine>> listeC001L001ChoisirNomDomaineCouverture = new Couverture<ListeRecherche<C001L001ChoisirNomDomaine>>().p(this).c(ListeRecherche.class).var("listeC001L001ChoisirNomDomaine").o(listeC001L001ChoisirNomDomaine);

	/**	<br/>L'entité « listeC001L001ChoisirNomDomaine »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaineGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeC001L001ChoisirNomDomaine">Trouver l'entité listeC001L001ChoisirNomDomaine dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeC001L001ChoisirNomDomaine(Couverture<ListeRecherche<C001L001ChoisirNomDomaine>> c);

	public ListeRecherche<C001L001ChoisirNomDomaine> getListeC001L001ChoisirNomDomaine() {
		return listeC001L001ChoisirNomDomaine;
	}

	public void setListeC001L001ChoisirNomDomaine(ListeRecherche<C001L001ChoisirNomDomaine> listeC001L001ChoisirNomDomaine) {
		this.listeC001L001ChoisirNomDomaine = listeC001L001ChoisirNomDomaine;
		this.listeC001L001ChoisirNomDomaineCouverture.dejaInitialise = true;
	}
	protected C001L001ChoisirNomDomaineGenPage listeC001L001ChoisirNomDomaineInit() {
		if(!listeC001L001ChoisirNomDomaineCouverture.dejaInitialise) {
			_listeC001L001ChoisirNomDomaine(listeC001L001ChoisirNomDomaineCouverture);
			if(listeC001L001ChoisirNomDomaine == null)
				setListeC001L001ChoisirNomDomaine(listeC001L001ChoisirNomDomaineCouverture.o);
		}
		if(listeC001L001ChoisirNomDomaine != null)
			listeC001L001ChoisirNomDomaine.initLoinPourClasse(requeteSite_);
		listeC001L001ChoisirNomDomaineCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaineGenPage)this;
	}

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.l001.C001L001ChoisirNomDomaineGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:c001L001ChoisirNomDomaine">Trouver l'entité c001L001ChoisirNomDomaine dans Solr</a>
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
	protected C001L001ChoisirNomDomaineGenPage c001L001ChoisirNomDomaineInit() {
		if(!c001L001ChoisirNomDomaineCouverture.dejaInitialise) {
			_c001L001ChoisirNomDomaine(c001L001ChoisirNomDomaineCouverture);
			if(c001L001ChoisirNomDomaine == null)
				setC001L001ChoisirNomDomaine(c001L001ChoisirNomDomaineCouverture.o);
		}
		if(c001L001ChoisirNomDomaine != null)
			c001L001ChoisirNomDomaine.initLoinPourClasse(requeteSite_);
		c001L001ChoisirNomDomaineCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaineGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L001ChoisirNomDomaineGenPage = false;

	public C001L001ChoisirNomDomaineGenPage initLoinC001L001ChoisirNomDomaineGenPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaineGenPage) {
			dejaInitialiseC001L001ChoisirNomDomaineGenPage = true;
			initLoinC001L001ChoisirNomDomaineGenPage();
		}
		return (C001L001ChoisirNomDomaineGenPage)this;
	}

	public void initLoinC001L001ChoisirNomDomaineGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initC001L001ChoisirNomDomaineGenPage();
	}

	public void initC001L001ChoisirNomDomaineGenPage() {
		listeC001L001ChoisirNomDomaineInit();
		c001L001ChoisirNomDomaineInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001L001ChoisirNomDomaineGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaineGenPage(RequeteSite requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		listeC001L001ChoisirNomDomaine.setRequeteSite_(requeteSite_);
		c001L001ChoisirNomDomaine.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaineGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L001ChoisirNomDomaineGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L001ChoisirNomDomaineGenPage(String var) throws Exception {
		C001L001ChoisirNomDomaineGenPage oC001L001ChoisirNomDomaineGenPage = (C001L001ChoisirNomDomaineGenPage)this;
		switch(var) {
			case "listeC001L001ChoisirNomDomaine":
				return oC001L001ChoisirNomDomaineGenPage.listeC001L001ChoisirNomDomaine;
			case "c001L001ChoisirNomDomaine":
				return oC001L001ChoisirNomDomaineGenPage.c001L001ChoisirNomDomaine;
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
				o = attribuerC001L001ChoisirNomDomaineGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L001ChoisirNomDomaineGenPage(String var, Object val) {
		C001L001ChoisirNomDomaineGenPage oC001L001ChoisirNomDomaineGenPage = (C001L001ChoisirNomDomaineGenPage)this;
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
					o = definirC001L001ChoisirNomDomaineGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L001ChoisirNomDomaineGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsC001L001ChoisirNomDomaineGenPage();
		super.htmlScriptsMiseEnPage();
	}

	public void htmlScriptsC001L001ChoisirNomDomaineGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptC001L001ChoisirNomDomaineGenPage();
		super.htmlScriptMiseEnPage();
	}

	public void htmlScriptC001L001ChoisirNomDomaineGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L001ChoisirNomDomaineGenPage();
		super.htmlBodyMiseEnPage();
	}

	public void htmlBodyC001L001ChoisirNomDomaineGenPage() {
		c001L001ChoisirNomDomaine.htmlBody();
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
		if(!(o instanceof C001L001ChoisirNomDomaineGenPage))
			return false;
		C001L001ChoisirNomDomaineGenPage that = (C001L001ChoisirNomDomaineGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L001ChoisirNomDomaineGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
