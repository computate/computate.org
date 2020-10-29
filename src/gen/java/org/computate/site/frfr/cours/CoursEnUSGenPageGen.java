package org.computate.site.frfr.cours;

import java.util.Arrays;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import org.computate.site.frfr.cluster.Cluster;
import java.util.HashMap;
import org.apache.commons.lang3.StringUtils;
import java.text.NumberFormat;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.computate.site.frfr.recherche.ListeRecherche;
import org.computate.site.frfr.page.MiseEnPage;
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
import org.computate.site.frfr.cours.Cours;
import org.computate.site.frfr.requete.RequeteSiteFrFR;
import org.apache.commons.lang3.math.NumberUtils;
import java.util.Optional;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import org.computate.site.frfr.couverture.Couverture;

/**	
 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr. </a>
 * <br/>
 **/
public abstract class CoursEnUSGenPageGen<DEV> extends MiseEnPage {
	protected static final Logger LOGGER = LoggerFactory.getLogger(CoursEnUSGenPage.class);

	////////////////
	// listeCours //
	////////////////

	/**	 L'entité listeCours
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected ListeRecherche<Cours> listeCours;
	@JsonIgnore
	public Couverture<ListeRecherche<Cours>> listeCoursCouverture = new Couverture<ListeRecherche<Cours>>().p(this).c(ListeRecherche.class).var("listeCours").o(listeCours);

	/**	<br/> L'entité listeCours
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:listeCours">Trouver l'entité listeCours dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _listeCours(Couverture<ListeRecherche<Cours>> c);

	public ListeRecherche<Cours> getListeCours() {
		return listeCours;
	}

	public void setListeCours(ListeRecherche<Cours> listeCours) {
		this.listeCours = listeCours;
		this.listeCoursCouverture.dejaInitialise = true;
	}
	protected CoursEnUSGenPage listeCoursInit() {
		if(!listeCoursCouverture.dejaInitialise) {
			_listeCours(listeCoursCouverture);
			if(listeCours == null)
				setListeCours(listeCoursCouverture.o);
		}
		if(listeCours != null)
			listeCours.initLoinPourClasse(requeteSite_);
		listeCoursCouverture.dejaInitialise(true);
		return (CoursEnUSGenPage)this;
	}

	////////////
	// cours_ //
	////////////

	/**	 L'entité cours_
	 *	 is defined as null before being initialized. 
	 */
	@JsonInclude(Include.NON_NULL)
	protected Cours cours_;
	@JsonIgnore
	public Couverture<Cours> cours_Couverture = new Couverture<Cours>().p(this).c(Cours.class).var("cours_").o(cours_);

	/**	<br/> L'entité cours_
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:8983/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frfr.cours.CoursEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cours_">Trouver l'entité cours_ dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cours_(Couverture<Cours> c);

	public Cours getCours_() {
		return cours_;
	}

	public void setCours_(Cours cours_) {
		this.cours_ = cours_;
		this.cours_Couverture.dejaInitialise = true;
	}
	protected CoursEnUSGenPage cours_Init() {
		if(!cours_Couverture.dejaInitialise) {
			_cours_(cours_Couverture);
			if(cours_ == null)
				setCours_(cours_Couverture.o);
		}
		cours_Couverture.dejaInitialise(true);
		return (CoursEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCoursEnUSGenPage = false;

	public CoursEnUSGenPage initLoinCoursEnUSGenPage(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCoursEnUSGenPage) {
			dejaInitialiseCoursEnUSGenPage = true;
			initLoinCoursEnUSGenPage();
		}
		return (CoursEnUSGenPage)this;
	}

	public void initLoinCoursEnUSGenPage() {
		initCoursEnUSGenPage();
		super.initLoinMiseEnPage(requeteSite_);
	}

	public void initCoursEnUSGenPage() {
		listeCoursInit();
		cours_Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinCoursEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCoursEnUSGenPage(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteMiseEnPage(requeteSite_);
		if(listeCours != null)
			listeCours.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteCoursEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCoursEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCoursEnUSGenPage(String var) {
		CoursEnUSGenPage oCoursEnUSGenPage = (CoursEnUSGenPage)this;
		switch(var) {
			case "listeCours":
				return oCoursEnUSGenPage.listeCours;
			case "cours_":
				return oCoursEnUSGenPage.cours_;
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
				o = attribuerCoursEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCoursEnUSGenPage(String var, Object val) {
		CoursEnUSGenPage oCoursEnUSGenPage = (CoursEnUSGenPage)this;
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
					o = definirCoursEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCoursEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirMiseEnPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsCoursEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsCoursEnUSGenPage() {
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptCoursEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptCoursEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCoursEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyCoursEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlCoursEnUSGenPage();
		super.html();
	}

	public void htmlCoursEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaCoursEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaCoursEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesCoursEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesCoursEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleCoursEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleCoursEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtCoursEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtCoursEnUSGenPage() {
	}

	//////////////////
	// requeteApi //
	//////////////////

	public void requeteApiCoursEnUSGenPage() {
		RequeteApi requeteApi = Optional.ofNullable(requeteSite_).map(RequeteSiteFrFR::getRequeteApi_).orElse(null);
		Object o = Optional.ofNullable(requeteApi).map(RequeteApi::getOriginal).orElse(null);
		if(o != null && o instanceof CoursEnUSGenPage) {
			CoursEnUSGenPage original = (CoursEnUSGenPage)o;
			super.requeteApiMiseEnPage();
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
		if(!(o instanceof CoursEnUSGenPage))
			return false;
		CoursEnUSGenPage that = (CoursEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("CoursEnUSGenPage { ");
		sb.append(" }");
		return sb.toString();
	}
}
