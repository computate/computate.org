package org.computate.enUS.site.cours.c001.l001;

import org.computate.enUS.site.cluster.Cluster;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.enUS.site.recherche.ListeRecherche;
import io.vertx.core.json.JsonArray;
import org.computate.enUS.site.cours.c001.l001.C001L001ChoisirNomDomaine;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.enUS.site.page.MiseEnPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L001ChoisirNomDomaineFrFRGenPageGen<DEV> extends MiseEnPage {

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:listeC001L001ChoisirNomDomaine">Trouver l'entité listeC001L001ChoisirNomDomaine dans Solr</a>
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
	protected C001L001ChoisirNomDomaineFrFRGenPage listeC001L001ChoisirNomDomaineInit() {
		if(!listeC001L001ChoisirNomDomaineCouverture.dejaInitialise) {
			_listeC001L001ChoisirNomDomaine(listeC001L001ChoisirNomDomaineCouverture);
			if(listeC001L001ChoisirNomDomaine == null)
				setListeC001L001ChoisirNomDomaine(listeC001L001ChoisirNomDomaineCouverture.o);
		}
		if(listeC001L001ChoisirNomDomaine != null)
			listeC001L001ChoisirNomDomaine.initLoinPourClasse(requeteSite_);
		listeC001L001ChoisirNomDomaineCouverture.dejaInitialise(true);
		return (C001L001ChoisirNomDomaineFrFRGenPage)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.cours.c001.l001.C001L001ChoisirNomDomaineFrFRGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L001ChoisirNomDomaine">Trouver l'entité c001L001ChoisirNomDomaine dans Solr</a>
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

	public C001L001ChoisirNomDomaineFrFRGenPage initLoinC001L001ChoisirNomDomaineFrFRGenPage(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L001ChoisirNomDomaineFrFRGenPage) {
			dejaInitialiseC001L001ChoisirNomDomaineFrFRGenPage = true;
			initLoinC001L001ChoisirNomDomaineFrFRGenPage();
		}
		return (C001L001ChoisirNomDomaineFrFRGenPage)this;
	}

	public void initLoinC001L001ChoisirNomDomaineFrFRGenPage() {
		super.initLoinMiseEnPage(requeteSite_);
		initC001L001ChoisirNomDomaineFrFRGenPage();
	}

	public void initC001L001ChoisirNomDomaineFrFRGenPage() {
		listeC001L001ChoisirNomDomaineInit();
		c001L001ChoisirNomDomaineInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001L001ChoisirNomDomaineFrFRGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L001ChoisirNomDomaineFrFRGenPage(RequeteSite requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		listeC001L001ChoisirNomDomaine.setRequeteSite_(requeteSite_);
		c001L001ChoisirNomDomaine.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001L001ChoisirNomDomaineFrFRGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
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
	public Object obtenirC001L001ChoisirNomDomaineFrFRGenPage(String var) throws Exception {
		C001L001ChoisirNomDomaineFrFRGenPage oC001L001ChoisirNomDomaineFrFRGenPage = (C001L001ChoisirNomDomaineFrFRGenPage)this;
		switch(var) {
			case "listeC001L001ChoisirNomDomaine":
				return oC001L001ChoisirNomDomaineFrFRGenPage.listeC001L001ChoisirNomDomaine;
			case "c001L001ChoisirNomDomaine":
				return oC001L001ChoisirNomDomaineFrFRGenPage.c001L001ChoisirNomDomaine;
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
				return super.definirMiseEnPage(var, val);
		}
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
