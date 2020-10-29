package org.computate.site.frfr.cours;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cours.CoursEnUSGenPage;
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
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.cours.CoursEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class CoursEnUSPageGen<DEV> extends CoursEnUSGenPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(CoursEnUSPage.class);

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursEnUSPage = false;

	public CoursEnUSPage initLoinCoursEnUSPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursEnUSPage) {
			dejaInitialiseCoursEnUSPage = true;
			initLoinCoursEnUSPage();
		}
		return (CoursEnUSPage)this;
	}

	public void initLoinCoursEnUSPage() {
		initCoursEnUSPage();
		super.initLoinCoursEnUSGenPage(requeteSite_);
	}

	public void initCoursEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinCoursEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursEnUSPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteCoursEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteCoursEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursEnUSPage(String var) {
		CoursEnUSPage oCoursEnUSPage = (CoursEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirCoursEnUSGenPage(var);
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
				o = attribuerCoursEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursEnUSPage(String var, Object val) {
		CoursEnUSPage oCoursEnUSPage = (CoursEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerCoursEnUSGenPage(var, val);
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
					o = definirCoursEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirCoursEnUSGenPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsCoursEnUSPage();
		super.htmlScripts();
	}

	public void htmlScriptsCoursEnUSPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptCoursEnUSPage();
		super.htmlScript();
	}

	public void htmlScriptCoursEnUSPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCoursEnUSPage();
		super.htmlBody();
	}

	public void htmlBodyCoursEnUSPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlCoursEnUSPage();
		super.html();
	}

	public void htmlCoursEnUSPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaCoursEnUSPage();
		super.htmlMeta();
	}

	public void htmlMetaCoursEnUSPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesCoursEnUSPage();
		super.htmlStyles();
	}

	public void htmlStylesCoursEnUSPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleCoursEnUSPage();
		super.htmlStyle();
	}

	public void htmlStyleCoursEnUSPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtCoursEnUSPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtCoursEnUSPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiCoursEnUSPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof CoursEnUSPage) {
			CoursEnUSPage original = (CoursEnUSPage)o;
			super.requeteApiCoursEnUSGenPage();
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
		if(!(o instanceof CoursEnUSPage))
			return false;
		CoursEnUSPage that = (CoursEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursEnUSPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
