package org.computate.enUS.site.ecrivain;

import org.computate.enUS.site.cluster.Cluster;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.enUS.site.requete.RequeteSiteEnUS;
import io.vertx.core.json.JsonArray;
import java.util.List;
import org.computate.enUS.site.couverture.Couverture;
import org.apache.commons.text.StringEscapeUtils;
import java.lang.Object;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.ecrivain.TousEcrivains&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class TousEcrivainsGen<DEV> extends Object {

	//////////////////
	// requeteSite_ //
	//////////////////

	/**	L'entité « requeteSite_ »
	 *	 is defined as null before being initialized. 
	 */
	protected RequeteSiteEnUS requeteSite_;
	public Couverture<RequeteSiteEnUS> requeteSite_Couverture = new Couverture<RequeteSiteEnUS>().p(this).c(RequeteSiteEnUS.class).var("requeteSite_").o(requeteSite_);

	/**	<br/>L'entité « requeteSite_ »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.ecrivain.TousEcrivains&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _requeteSite_(Couverture<RequeteSiteEnUS> c);

	public RequeteSiteEnUS getRequeteSite_() {
		return requeteSite_;
	}

	public void setRequeteSite_(RequeteSiteEnUS requeteSite_) {
		this.requeteSite_ = requeteSite_;
		this.requeteSite_Couverture.dejaInitialise = true;
	}

	///////////////
	// ecrivains //
	///////////////

	/**	L'entité « ecrivains »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<ToutEcrivain>(). 
	 */
	protected List<ToutEcrivain> ecrivains = new java.util.ArrayList<org.computate.enUS.site.ecrivain.ToutEcrivain>();
	public Couverture<List<ToutEcrivain>> ecrivainsCouverture = new Couverture<List<ToutEcrivain>>().p(this).c(List.class).var("ecrivains").o(ecrivains);

	/**	<br/>L'entité « ecrivains »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<ToutEcrivain>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.ecrivain.TousEcrivains&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:ecrivains">Trouver l'entité ecrivains dans Solr</a>
	 * <br/>
	 * @param ecrivains est l'entité déjà construit. 
	 **/
	protected abstract void _ecrivains(List<ToutEcrivain> c);

	public List<ToutEcrivain> getEcrivains() {
		return ecrivains;
	}

	public void setEcrivains(List<ToutEcrivain> ecrivains) {
		this.ecrivains = ecrivains;
		this.ecrivainsCouverture.dejaInitialise = true;
	}
	public TousEcrivains addEcrivains(ToutEcrivain...objets) {
		for(ToutEcrivain o : objets) {
			addEcrivains(o);
		}
		return (TousEcrivains)this;
	}
	public TousEcrivains addEcrivains(ToutEcrivain o) {
		if(o != null && !ecrivains.contains(o))
			this.ecrivains.add(o);
		return (TousEcrivains)this;
	}
	protected TousEcrivains ecrivainsInit() {
		if(!ecrivainsCouverture.dejaInitialise) {
			_ecrivains(ecrivains);
		}
		ecrivainsCouverture.dejaInitialise(true);
		return (TousEcrivains)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseTousEcrivains = false;

	public TousEcrivains initLoinTousEcrivains(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseTousEcrivains) {
			dejaInitialiseTousEcrivains = true;
			initLoinTousEcrivains();
		}
		return (TousEcrivains)this;
	}

	public void initLoinTousEcrivains() {
		initTousEcrivains();
	}

	public void initTousEcrivains() {
		ecrivainsInit();
	}

	public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinTousEcrivains(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteTousEcrivains(RequeteSiteEnUS requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteTousEcrivains(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirTousEcrivains(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirTousEcrivains(String var) throws Exception {
		TousEcrivains oTousEcrivains = (TousEcrivains)this;
		switch(var) {
			case "requeteSite_":
				return oTousEcrivains.requeteSite_;
			case "ecrivains":
				return oTousEcrivains.ecrivains;
			default:
				return null;
		}
	}

	///////////////
	// attribuer //
	///////////////

	public boolean attribuerPourClasse(String var, Object val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = attribuerTousEcrivains(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerTousEcrivains(String var, Object val) {
		TousEcrivains oTousEcrivains = (TousEcrivains)this;
		switch(var) {
			default:
				return null;
		}
	}

	/////////////
	// definir //
	/////////////

	public boolean definirPourClasse(String var, String val) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		if(val != null) {
			for(String v : vars) {
				if(o == null)
					o = definirTousEcrivains(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirTousEcrivains(String var, String val) {
		switch(var) {
			default:
				return null;
		}
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash();
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof TousEcrivains))
			return false;
		TousEcrivains that = (TousEcrivains)o;
		return true;
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("TousEcrivains {");
		sb.append(" }");
		return sb.toString();
	}
}
