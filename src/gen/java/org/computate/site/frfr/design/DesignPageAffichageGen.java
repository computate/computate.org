package org.computate.site.frfr.design;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.computate.site.frfr.design.DesignGenPageAffichage;
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
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.design.DesignPageAffichage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class DesignPageAffichageGen<DEV> extends DesignGenPageAffichage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(DesignPageAffichage.class);

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseDesignPageAffichage = false;

	public DesignPageAffichage initLoinDesignPageAffichage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseDesignPageAffichage) {
			dejaInitialiseDesignPageAffichage = true;
			initLoinDesignPageAffichage();
		}
		return (DesignPageAffichage)this;
	}

	public void initLoinDesignPageAffichage() {
		initDesignPageAffichage();
		super.initLoinDesignGenPageAffichage(requeteSite_);
	}

	public void initDesignPageAffichage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinDesignPageAffichage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteDesignPageAffichage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteDesignGenPageAffichage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteDesignPageAffichage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirDesignPageAffichage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirDesignPageAffichage(String var) {
		DesignPageAffichage oDesignPageAffichage = (DesignPageAffichage)this;
		switch(var) {
			default:
				return super.obtenirDesignGenPageAffichage(var);
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
				o = attribuerDesignPageAffichage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerDesignPageAffichage(String var, Object val) {
		DesignPageAffichage oDesignPageAffichage = (DesignPageAffichage)this;
		switch(var) {
			default:
				return super.attribuerDesignGenPageAffichage(var, val);
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
					o = definirDesignPageAffichage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirDesignPageAffichage(String var, String val) {
		switch(var) {
			default:
				return super.definirDesignGenPageAffichage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsDesignPageAffichage();
		super.htmlScripts();
	}

	public void htmlScriptsDesignPageAffichage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptDesignPageAffichage();
		super.htmlScript();
	}

	public void htmlScriptDesignPageAffichage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyDesignPageAffichage();
		super.htmlBody();
	}

	public void htmlBodyDesignPageAffichage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlDesignPageAffichage();
		super.html();
	}

	public void htmlDesignPageAffichage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaDesignPageAffichage();
		super.htmlMeta();
	}

	public void htmlMetaDesignPageAffichage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesDesignPageAffichage();
		super.htmlStyles();
	}

	public void htmlStylesDesignPageAffichage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleDesignPageAffichage();
		super.htmlStyle();
	}

	public void htmlStyleDesignPageAffichage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtDesignPageAffichage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtDesignPageAffichage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiDesignPageAffichage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof DesignPageAffichage) {
			DesignPageAffichage original = (DesignPageAffichage)o;
			super.requeteApiDesignGenPageAffichage();
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
		if(!(o instanceof DesignPageAffichage))
			return false;
		DesignPageAffichage that = (DesignPageAffichage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("DesignPageAffichage { ");
		sb.append(" }");
		return sb.toString();
	}
}
