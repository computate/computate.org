package org.computate.frFR.site.cours.c001;

import java.util.Date;
import org.computate.frFR.site.contexte.SiteContexte;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.apache.commons.lang3.StringUtils;
import java.lang.Integer;
import java.util.ArrayList;
import java.lang.Boolean;
import java.time.ZoneOffset;
import org.computate.frFR.site.cours.c001.C001;
import org.computate.frFR.site.cluster.Cluster;
import org.apache.commons.text.StringEscapeUtils;
import java.time.Instant;
import java.time.ZoneId;
import org.apache.solr.client.solrj.SolrClient;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.frFR.site.couverture.Couverture;
import java.time.format.DateTimeFormatter;
import org.computate.frFR.site.requete.RequeteSite;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001LeconGen<DEV> extends C001 {

	public static final String C001Lecon_UnNom = "un leçon";
	public static final String C001Lecon_Ce = "ce ";
	public static final String C001Lecon_CeNom = "ce leçon";
	public static final String C001Lecon_Un = "un ";
	public static final String C001Lecon_LeNom = "le leçon";
	public static final String C001Lecon_NomSingulier = "leçon";
	public static final String C001Lecon_NomPluriel = "lessons";
	public static final String C001Lecon_NomActuel = "leçon actuel";
	public static final String C001Lecon_TousNom = "tous les lessons";
	public static final String C001Lecon_LesNoms = "les lessons";
	public static final String C001Lecon_AucunNomTrouve = "aucun leçon trouvé";
	public static final String C001Lecon_NomVar = "leçon";
	public static final String C001Lecon_DeNom = "de leçon";
	public static final String C001Lecon_Couleur = "green";
	public static final String C001Lecon_IconeGroupe = "regular";
	public static final String C001Lecon_IconeNom = "book";

	//////////////
	// estLecon //
	//////////////

	/**	L'entité « estLecon »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean estLecon;
	public Couverture<Boolean> estLeconCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("estLecon").o(estLecon);

	/**	<br/>L'entité « estLecon »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:estLecon">Trouver l'entité estLecon dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _estLecon(Couverture<Boolean> c);

	public Boolean getEstLecon() {
		return estLecon;
	}

	public void setEstLecon(Boolean estLecon) {
		this.estLecon = estLecon;
		this.estLeconCouverture.dejaInitialise = true;
	}
	public C001Lecon setEstLecon(String o) {
		this.estLecon = Boolean.parseBoolean(o);
		this.estLeconCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	protected C001Lecon estLeconInit() {
		if(!estLeconCouverture.dejaInitialise) {
			_estLecon(estLeconCouverture);
			if(estLecon == null)
				setEstLecon(estLeconCouverture.o);
		}
		estLeconCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	public Boolean solrEstLecon() {
		return estLecon;
	}

	public String strEstLecon() {
		return estLecon == null ? "" : estLecon.toString();
	}

	public String nomAffichageEstLecon() {
		return "est leçon";
	}

	public String htmTooltipEstLecon() {
		return null;
	}

	public String htmEstLecon() {
		return estLecon == null ? "" : StringEscapeUtils.escapeHtml4(strEstLecon());
	}

	///////////////
	// leconCree //
	///////////////

	/**	L'entité « leconCree »
	 *	 is defined as null before being initialized. 
	 */
	protected LocalDateTime leconCree;
	public Couverture<LocalDateTime> leconCreeCouverture = new Couverture<LocalDateTime>().p(this).c(LocalDateTime.class).var("leconCree").o(leconCree);

	/**	<br/>L'entité « leconCree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconCree">Trouver l'entité leconCree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _leconCree(Couverture<LocalDateTime> c);

	public LocalDateTime getLeconCree() {
		return leconCree;
	}

	public void setLeconCree(LocalDateTime leconCree) {
		this.leconCree = leconCree;
		this.leconCreeCouverture.dejaInitialise = true;
	}
	public C001Lecon setLeconCree(Instant o) {
		this.leconCree = LocalDateTime.from(o);
		this.leconCreeCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public C001Lecon setLeconCree(String o) {
		this.leconCree = LocalDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.leconCreeCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	public C001Lecon setLeconCree(Date o) {
		this.leconCree = LocalDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.leconCreeCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	protected C001Lecon leconCreeInit() {
		if(!leconCreeCouverture.dejaInitialise) {
			_leconCree(leconCreeCouverture);
			if(leconCree == null)
				setLeconCree(leconCreeCouverture.o);
		}
		leconCreeCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	public Date solrLeconCree() {
		return leconCree == null ? null : Date.from(leconCree.atZone(ZoneId.systemDefault()).toInstant());
	}

	public String strLeconCree() {
		return leconCree == null ? "" : leconCree.toString();
	}

	public String nomAffichageLeconCree() {
		return null;
	}

	public String htmTooltipLeconCree() {
		return null;
	}

	public String htmLeconCree() {
		return leconCree == null ? "" : StringEscapeUtils.escapeHtml4(strLeconCree());
	}

	/////////////////
	// leconNumero //
	/////////////////

	/**	L'entité « leconNumero »
	 *	 is defined as null before being initialized. 
	 */
	protected Integer leconNumero;
	public Couverture<Integer> leconNumeroCouverture = new Couverture<Integer>().p(this).c(Integer.class).var("leconNumero").o(leconNumero);

	/**	<br/>L'entité « leconNumero »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconNumero">Trouver l'entité leconNumero dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _leconNumero(Couverture<Integer> c);

	public Integer getLeconNumero() {
		return leconNumero;
	}

	public void setLeconNumero(Integer leconNumero) {
		this.leconNumero = leconNumero;
		this.leconNumeroCouverture.dejaInitialise = true;
	}
	public C001Lecon setLeconNumero(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.leconNumero = Integer.parseInt(o);
		this.leconNumeroCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	protected C001Lecon leconNumeroInit() {
		if(!leconNumeroCouverture.dejaInitialise) {
			_leconNumero(leconNumeroCouverture);
			if(leconNumero == null)
				setLeconNumero(leconNumeroCouverture.o);
		}
		leconNumeroCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	public Integer solrLeconNumero() {
		return leconNumero;
	}

	public String strLeconNumero() {
		return leconNumero == null ? "" : leconNumero.toString();
	}

	public String nomAffichageLeconNumero() {
		return "leçon numéro";
	}

	public String htmTooltipLeconNumero() {
		return null;
	}

	public String htmLeconNumero() {
		return leconNumero == null ? "" : StringEscapeUtils.escapeHtml4(strLeconNumero());
	}

	////////////////
	// estArticle //
	////////////////

	/**	L'entité « estArticle »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean estArticle;
	public Couverture<Boolean> estArticleCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("estArticle").o(estArticle);

	/**	<br/>L'entité « estArticle »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:estArticle">Trouver l'entité estArticle dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _estArticle(Couverture<Boolean> c);

	public Boolean getEstArticle() {
		return estArticle;
	}

	public void setEstArticle(Boolean estArticle) {
		this.estArticle = estArticle;
		this.estArticleCouverture.dejaInitialise = true;
	}
	public C001Lecon setEstArticle(String o) {
		this.estArticle = Boolean.parseBoolean(o);
		this.estArticleCouverture.dejaInitialise = true;
		return (C001Lecon)this;
	}
	protected C001Lecon estArticleInit() {
		if(!estArticleCouverture.dejaInitialise) {
			_estArticle(estArticleCouverture);
			if(estArticle == null)
				setEstArticle(estArticleCouverture.o);
		}
		estArticleCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	public Boolean solrEstArticle() {
		return estArticle;
	}

	public String strEstArticle() {
		return estArticle == null ? "" : estArticle.toString();
	}

	public String nomAffichageEstArticle() {
		return null;
	}

	public String htmTooltipEstArticle() {
		return null;
	}

	public String htmEstArticle() {
		return estArticle == null ? "" : StringEscapeUtils.escapeHtml4(strEstArticle());
	}

	//////////////////////////
	// leconsACoteDocuments //
	//////////////////////////

	/**	L'entité « leconsACoteDocuments »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut ArrayList<SolrDocument>(). 
	 */
	protected ArrayList<SolrDocument> leconsACoteDocuments = new ArrayList<SolrDocument>();
	public Couverture<ArrayList<SolrDocument>> leconsACoteDocumentsCouverture = new Couverture<ArrayList<SolrDocument>>().p(this).c(ArrayList.class).var("leconsACoteDocuments").o(leconsACoteDocuments);

	/**	<br/>L'entité « leconsACoteDocuments »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut ArrayList<SolrDocument>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001Lecon&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:leconsACoteDocuments">Trouver l'entité leconsACoteDocuments dans Solr</a>
	 * <br/>
	 * @param leconsACoteDocuments est l'entité déjà construit. 
	 **/
	protected abstract void _leconsACoteDocuments(ArrayList<SolrDocument> l);

	public ArrayList<SolrDocument> getLeconsACoteDocuments() {
		return leconsACoteDocuments;
	}

	public void setLeconsACoteDocuments(ArrayList<SolrDocument> leconsACoteDocuments) {
		this.leconsACoteDocuments = leconsACoteDocuments;
		this.leconsACoteDocumentsCouverture.dejaInitialise = true;
	}
	public C001Lecon addLeconsACoteDocuments(SolrDocument...objets) {
		for(SolrDocument o : objets) {
			addLeconsACoteDocuments(o);
		}
		return (C001Lecon)this;
	}
	public C001Lecon addLeconsACoteDocuments(SolrDocument o) {
		if(o != null && !leconsACoteDocuments.contains(o))
			this.leconsACoteDocuments.add(o);
		return (C001Lecon)this;
	}
	protected C001Lecon leconsACoteDocumentsInit() {
		if(!leconsACoteDocumentsCouverture.dejaInitialise) {
			_leconsACoteDocuments(leconsACoteDocuments);
		}
		leconsACoteDocumentsCouverture.dejaInitialise(true);
		return (C001Lecon)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001Lecon = false;

	public C001Lecon initLoinC001Lecon(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001Lecon) {
			dejaInitialiseC001Lecon = true;
			initLoinC001Lecon();
		}
		return (C001Lecon)this;
	}

	public void initLoinC001Lecon() {
		super.initLoinC001(requeteSite_);
		initC001Lecon();
	}

	public void initC001Lecon() {
		estLeconInit();
		leconCreeInit();
		leconNumeroInit();
		estArticleInit();
		leconsACoteDocumentsInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinC001Lecon(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001Lecon(RequeteSite requeteSite_) {
			super.requeteSiteC001(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteC001Lecon(requeteSite_);
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSite requeteSite = new RequeteSite();
			requeteSite.initLoinRequeteSite();
			SiteContexte siteContexte = new SiteContexte();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexte();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			C001Lecon o = new C001Lecon();
			o.requeteSiteC001Lecon(requeteSite);
			o.initLoinC001Lecon(requeteSite);
			o.indexerC001Lecon();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001Lecon();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001Lecon(document);
	}

	public void indexerC001Lecon(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001Lecon(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001Lecon() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001Lecon(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001Lecon(SolrInputDocument document) throws Exception {
		if(estLecon != null) {
			document.addField("estLecon_indexed_boolean", estLecon);
			document.addField("estLecon_stored_boolean", estLecon);
		}
		if(leconCree != null) {
			document.addField("leconCree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(leconCree.atOffset(ZoneOffset.UTC)));
			document.addField("leconCree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(leconCree.atOffset(ZoneOffset.UTC)));
		}
		if(leconNumero != null) {
			document.addField("leconNumero_indexed_int", leconNumero);
			document.addField("leconNumero_stored_int", leconNumero);
		}
		if(estArticle != null) {
			document.addField("estArticle_indexed_boolean", estArticle);
		}
		super.indexerC001(document);

	}

	public void desindexerC001Lecon() throws Exception {
		RequeteSite requeteSite = new RequeteSite();
		requeteSite.initLoinRequeteSite();
		SiteContexte siteContexte = new SiteContexte();
		siteContexte.initLoinSiteContexte();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001Lecon(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001Lecon(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001Lecon(String var) throws Exception {
		C001Lecon oC001Lecon = (C001Lecon)this;
		switch(var) {
			case "estLecon":
				return oC001Lecon.estLecon;
			case "leconCree":
				return oC001Lecon.leconCree;
			case "leconNumero":
				return oC001Lecon.leconNumero;
			case "estArticle":
				return oC001Lecon.estArticle;
			case "leconsACoteDocuments":
				return oC001Lecon.leconsACoteDocuments;
			default:
				return super.obtenirC001(var);
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
				o = attribuerC001Lecon(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001Lecon(String var, Object val) {
		C001Lecon oC001Lecon = (C001Lecon)this;
		switch(var) {
			default:
				return super.attribuerC001(var, val);
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
					o = definirC001Lecon(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001Lecon(String var, String val) {
		switch(var) {
			default:
				return super.definirC001(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001Lecon();
		super.htmlBodyC001();
	}

	public void htmlBodyC001Lecon() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), estLecon, leconCree, leconNumero, estArticle);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof C001Lecon))
			return false;
		C001Lecon that = (C001Lecon)o;
		return super.equals(o)
				&& Objects.equals( estLecon, that.estLecon )
				&& Objects.equals( leconCree, that.leconCree )
				&& Objects.equals( leconNumero, that.leconNumero )
				&& Objects.equals( estArticle, that.estArticle );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001Lecon {");
		sb.append( "estLecon: " ).append(estLecon);
		sb.append( ", leconCree: " ).append(leconCree);
		sb.append( ", leconNumero: " ).append(leconNumero);
		sb.append( ", estArticle: " ).append(estArticle);
		sb.append(" }");
		return sb.toString();
	}
}
