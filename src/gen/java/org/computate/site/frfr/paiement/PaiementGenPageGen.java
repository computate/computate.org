package org.computate.site.frfr.paiement;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.paiement.PaiementSite;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.computate.site.frfr.recherche.ListeRecherche;
import org.apache.commons.collections.CollectionUtils;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.vertx.core.logging.Logger;
import java.math.RoundingMode;
import java.math.MathContext;
import org.apache.commons.text.StringEscapeUtils;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.computate.site.frfr.requete.api.RequeteApi;
import org.computate.site.frfr.cluster.ClusterPage;
import org.computate.site.frfr.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class PaiementGenPageGen<DEV> extends ClusterPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(PaiementGenPage.class);

	///////////////////////
	// listePaiementSite //
	///////////////////////

	/**	 L'entité listePaiementSite
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected ListeRecherche<PaiementSite> listePaiementSite;
	@JsonIgnore
	public Couverture<ListeRecherche<PaiementSite>> listePaiementSiteCouverture = new Couverture<ListeRecherche<PaiementSite>>().p(this).c(ListeRecherche.class).var("listePaiementSite").o(listePaiementSite);

	/**	<br/> L'entité listePaiementSite
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listePaiementSite">Trouver l'entité listePaiementSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listePaiementSite(Couverture<ListeRecherche<PaiementSite>> c);

	public ListeRecherche<PaiementSite> getListePaiementSite() {
		return listePaiementSite;
	}

	public void setListePaiementSite(ListeRecherche<PaiementSite> listePaiementSite) {
		this.listePaiementSite = listePaiementSite;
		this.listePaiementSiteCouverture.dejaInitialise = true;
	}
	protected PaiementGenPage listePaiementSiteInit() {
		if(!listePaiementSiteCouverture.dejaInitialise) {
			_listePaiementSite(listePaiementSiteCouverture);
			if(listePaiementSite == null)
				setListePaiementSite(listePaiementSiteCouverture.o);
		}
		if(listePaiementSite != null)
			listePaiementSite.initLoinPourClasse(requeteSite_);
		listePaiementSiteCouverture.dejaInitialise(true);
		return (PaiementGenPage)this;
	}

	///////////////////
	// paiementSite_ //
	///////////////////

	/**	 L'entité paiementSite_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected PaiementSite paiementSite_;
	@JsonIgnore
	public Couverture<PaiementSite> paiementSite_Couverture = new Couverture<PaiementSite>().p(this).c(PaiementSite.class).var("paiementSite_").o(paiementSite_);

	/**	<br/> L'entité paiementSite_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.paiement.PaiementGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:paiementSite_">Trouver l'entité paiementSite_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _paiementSite_(Couverture<PaiementSite> c);

	public PaiementSite getPaiementSite_() {
		return paiementSite_;
	}

	public void setPaiementSite_(PaiementSite paiementSite_) {
		this.paiementSite_ = paiementSite_;
		this.paiementSite_Couverture.dejaInitialise = true;
	}
	protected PaiementGenPage paiementSite_Init() {
		if(!paiementSite_Couverture.dejaInitialise) {
			_paiementSite_(paiementSite_Couverture);
			if(paiementSite_ == null)
				setPaiementSite_(paiementSite_Couverture.o);
		}
		paiementSite_Couverture.dejaInitialise(true);
		return (PaiementGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePaiementGenPage = false;

	public PaiementGenPage initLoinPaiementGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePaiementGenPage) {
			dejaInitialisePaiementGenPage = true;
			initLoinPaiementGenPage();
		}
		return (PaiementGenPage)this;
	}

	public void initLoinPaiementGenPage() {
		initPaiementGenPage();
		super.initLoinClusterPage(requeteSite_);
	}

	public void initPaiementGenPage() {
		listePaiementSiteInit();
		paiementSite_Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPaiementGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePaiementGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteClusterPage(requeteSite_);
		if(listePaiementSite != null)
			listePaiementSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePaiementGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPaiementGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPaiementGenPage(String var) {
		PaiementGenPage oPaiementGenPage = (PaiementGenPage)this;
		switch(var) {
			case "listePaiementSite":
				return oPaiementGenPage.listePaiementSite;
			case "paiementSite_":
				return oPaiementGenPage.paiementSite_;
			default:
				return super.obtenirClusterPage(var);
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
				o = attribuerPaiementGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPaiementGenPage(String var, Object val) {
		PaiementGenPage oPaiementGenPage = (PaiementGenPage)this;
		switch(var) {
			default:
				return super.attribuerClusterPage(var, val);
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
					o = definirPaiementGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPaiementGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirClusterPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPaiementGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsPaiementGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPaiementGenPage();
		super.htmlScript();
	}

	public void htmlScriptPaiementGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPaiementGenPage();
		super.htmlBody();
	}

	public void htmlBodyPaiementGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPaiementGenPage();
		super.html();
	}

	public void htmlPaiementGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPaiementGenPage();
		super.htmlMeta();
	}

	public void htmlMetaPaiementGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPaiementGenPage();
		super.htmlStyles();
	}

	public void htmlStylesPaiementGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePaiementGenPage();
		super.htmlStyle();
	}

	public void htmlStylePaiementGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPaiementGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPaiementGenPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiPaiementGenPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof PaiementGenPage) {
			PaiementGenPage original = (PaiementGenPage)o;
			super.requeteApiClusterPage();
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
		if(!(o instanceof PaiementGenPage))
			return false;
		PaiementGenPage that = (PaiementGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PaiementGenPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
