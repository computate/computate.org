package org.computate.site.frfr.design;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.computate.site.frfr.design.DesignPage;
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
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.design.DesignMailGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class DesignMailGenPageGen<DEV> extends ClusterPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(DesignMailGenPage.class);

	/////////////////////
	// listeDesignPage //
	/////////////////////

	/**	 L'entité listeDesignPage
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected ListeRecherche<DesignPage> listeDesignPage;
	@JsonIgnore
	public Couverture<ListeRecherche<DesignPage>> listeDesignPageCouverture = new Couverture<ListeRecherche<DesignPage>>().p(this).c(ListeRecherche.class).var("listeDesignPage").o(listeDesignPage);

	/**	<br/> L'entité listeDesignPage
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.design.DesignMailGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeDesignPage">Trouver l'entité listeDesignPage dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeDesignPage(Couverture<ListeRecherche<DesignPage>> c);

	public ListeRecherche<DesignPage> getListeDesignPage() {
		return listeDesignPage;
	}

	public void setListeDesignPage(ListeRecherche<DesignPage> listeDesignPage) {
		this.listeDesignPage = listeDesignPage;
		this.listeDesignPageCouverture.dejaInitialise = true;
	}
	protected DesignMailGenPage listeDesignPageInit() {
		if(!listeDesignPageCouverture.dejaInitialise) {
			_listeDesignPage(listeDesignPageCouverture);
			if(listeDesignPage == null)
				setListeDesignPage(listeDesignPageCouverture.o);
		}
		if(listeDesignPage != null)
			listeDesignPage.initLoinPourClasse(requeteSite_);
		listeDesignPageCouverture.dejaInitialise(true);
		return (DesignMailGenPage)this;
	}

	/////////////////
	// designPage_ //
	/////////////////

	/**	 L'entité designPage_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected DesignPage designPage_;
	@JsonIgnore
	public Couverture<DesignPage> designPage_Couverture = new Couverture<DesignPage>().p(this).c(DesignPage.class).var("designPage_").o(designPage_);

	/**	<br/> L'entité designPage_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.design.DesignMailGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:designPage_">Trouver l'entité designPage_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _designPage_(Couverture<DesignPage> c);

	public DesignPage getDesignPage_() {
		return designPage_;
	}

	public void setDesignPage_(DesignPage designPage_) {
		this.designPage_ = designPage_;
		this.designPage_Couverture.dejaInitialise = true;
	}
	protected DesignMailGenPage designPage_Init() {
		if(!designPage_Couverture.dejaInitialise) {
			_designPage_(designPage_Couverture);
			if(designPage_ == null)
				setDesignPage_(designPage_Couverture.o);
		}
		designPage_Couverture.dejaInitialise(true);
		return (DesignMailGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseDesignMailGenPage = false;

	public DesignMailGenPage initLoinDesignMailGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseDesignMailGenPage) {
			dejaInitialiseDesignMailGenPage = true;
			initLoinDesignMailGenPage();
		}
		return (DesignMailGenPage)this;
	}

	public void initLoinDesignMailGenPage() {
		initDesignMailGenPage();
		super.initLoinClusterPage(requeteSite_);
	}

	public void initDesignMailGenPage() {
		listeDesignPageInit();
		designPage_Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinDesignMailGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteDesignMailGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteClusterPage(requeteSite_);
		if(listeDesignPage != null)
			listeDesignPage.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteDesignMailGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirDesignMailGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirDesignMailGenPage(String var) {
		DesignMailGenPage oDesignMailGenPage = (DesignMailGenPage)this;
		switch(var) {
			case "listeDesignPage":
				return oDesignMailGenPage.listeDesignPage;
			case "designPage_":
				return oDesignMailGenPage.designPage_;
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
				o = attribuerDesignMailGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerDesignMailGenPage(String var, Object val) {
		DesignMailGenPage oDesignMailGenPage = (DesignMailGenPage)this;
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
					o = definirDesignMailGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirDesignMailGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirClusterPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsDesignMailGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsDesignMailGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptDesignMailGenPage();
		super.htmlScript();
	}

	public void htmlScriptDesignMailGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyDesignMailGenPage();
		super.htmlBody();
	}

	public void htmlBodyDesignMailGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlDesignMailGenPage();
		super.html();
	}

	public void htmlDesignMailGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaDesignMailGenPage();
		super.htmlMeta();
	}

	public void htmlMetaDesignMailGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesDesignMailGenPage();
		super.htmlStyles();
	}

	public void htmlStylesDesignMailGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleDesignMailGenPage();
		super.htmlStyle();
	}

	public void htmlStyleDesignMailGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtDesignMailGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtDesignMailGenPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiDesignMailGenPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof DesignMailGenPage) {
			DesignMailGenPage original = (DesignMailGenPage)o;
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
		if(!(o instanceof DesignMailGenPage))
			return false;
		DesignMailGenPage that = (DesignMailGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("DesignMailGenPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
