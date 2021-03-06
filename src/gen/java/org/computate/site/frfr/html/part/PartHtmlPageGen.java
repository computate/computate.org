package org.computate.site.frfr.html.part;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
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
import org.computate.site.frfr.html.part.PartHtmlGenPage;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.html.part.PartHtmlPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class PartHtmlPageGen<DEV> extends PartHtmlGenPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(PartHtmlPage.class);

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialisePartHtmlPage = false;

	public PartHtmlPage initLoinPartHtmlPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialisePartHtmlPage) {
			dejaInitialisePartHtmlPage = true;
			initLoinPartHtmlPage();
		}
		return (PartHtmlPage)this;
	}

	public void initLoinPartHtmlPage() {
		initPartHtmlPage();
		super.initLoinPartHtmlGenPage(requeteSite_);
	}

	public void initPartHtmlPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinPartHtmlPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSitePartHtmlPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSitePartHtmlGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSitePartHtmlPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirPartHtmlPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirPartHtmlPage(String var) {
		PartHtmlPage oPartHtmlPage = (PartHtmlPage)this;
		switch(var) {
			default:
				return super.obtenirPartHtmlGenPage(var);
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
				o = attribuerPartHtmlPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerPartHtmlPage(String var, Object val) {
		PartHtmlPage oPartHtmlPage = (PartHtmlPage)this;
		switch(var) {
			default:
				return super.attribuerPartHtmlGenPage(var, val);
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
					o = definirPartHtmlPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirPartHtmlPage(String var, String val) {
		switch(var) {
			default:
				return super.definirPartHtmlGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsPartHtmlPage();
		super.htmlScripts();
	}

	public void htmlScriptsPartHtmlPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptPartHtmlPage();
		super.htmlScript();
	}

	public void htmlScriptPartHtmlPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyPartHtmlPage();
		super.htmlBody();
	}

	public void htmlBodyPartHtmlPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlPartHtmlPage();
		super.html();
	}

	public void htmlPartHtmlPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaPartHtmlPage();
		super.htmlMeta();
	}

	public void htmlMetaPartHtmlPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesPartHtmlPage();
		super.htmlStyles();
	}

	public void htmlStylesPartHtmlPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStylePartHtmlPage();
		super.htmlStyle();
	}

	public void htmlStylePartHtmlPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtPartHtmlPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtPartHtmlPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiPartHtmlPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof PartHtmlPage) {
			PartHtmlPage original = (PartHtmlPage)o;
			super.requeteApiPartHtmlGenPage();
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
		if(!(o instanceof PartHtmlPage))
			return false;
		PartHtmlPage that = (PartHtmlPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("PartHtmlPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
