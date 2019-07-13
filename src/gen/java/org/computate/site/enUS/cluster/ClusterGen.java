package org.computate.site.enUS.cluster;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import java.util.Date;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import java.time.ZonedDateTime;
import java.time.LocalDateTime;
import org.apache.commons.lang3.StringUtils;
import io.vertx.core.logging.LoggerFactory;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import java.lang.Long;
import java.util.Locale;
import java.lang.Boolean;
import io.vertx.core.json.JsonObject;
import org.computate.site.enUS.page.parti.PagePart;
import java.lang.String;
import java.time.ZoneOffset;
import io.vertx.core.logging.Logger;
import org.apache.solr.client.solrj.response.QueryResponse;
import java.util.Set;
import org.apache.commons.text.StringEscapeUtils;
import java.time.Instant;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.time.ZoneId;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import java.time.format.DateTimeFormatter;
import org.apache.solr.client.solrj.SolrQuery;
import io.vertx.ext.sql.SQLConnection;
import java.lang.Object;
import io.vertx.ext.sql.SQLClient;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class ClusterGen<DEV> extends Object {
	private static final Logger LOGGER = LoggerFactory.getLogger(Cluster.class);

	public static final String ClusterFrFRPage_Uri = "/frFR/cluster";
	public static final String ClusterFrFRPage_ImageUri = "/png/frFR/cluster-999.png";
	public static final String ClusterEnUSPage_Uri = "/enUS/cluster";
	public static final String ClusterEnUSPage_ImageUri = "/png/enUS/cluster-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:requeteSite_">Trouver l'entité requeteSite_ dans Solr</a>
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
	protected Cluster requeteSite_Init() {
		if(!requeteSite_Couverture.dejaInitialise) {
			_requeteSite_(requeteSite_Couverture);
			if(requeteSite_ == null)
				setRequeteSite_(requeteSite_Couverture.o);
		}
		requeteSite_Couverture.dejaInitialise(true);
		return (Cluster)this;
	}

	///////////////
	// pageParts //
	///////////////

	/**	L'entité « pageParts »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<PagePart>(). 
	 */
	protected List<PagePart> pageParts = new java.util.ArrayList<org.computate.site.enUS.page.parti.PagePart>();
	public Couverture<List<PagePart>> pagePartsCouverture = new Couverture<List<PagePart>>().p(this).c(List.class).var("pageParts").o(pageParts);

	/**	<br/>L'entité « pageParts »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<PagePart>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pageParts">Trouver l'entité pageParts dans Solr</a>
	 * <br/>
	 * @param pageParts est l'entité déjà construit. 
	 **/
	protected abstract void _pageParts(List<PagePart> l);

	public List<PagePart> getPageParts() {
		return pageParts;
	}

	public void setPageParts(List<PagePart> pageParts) {
		this.pageParts = pageParts;
		this.pagePartsCouverture.dejaInitialise = true;
	}
	public Cluster addPageParts(PagePart...objets) {
		for(PagePart o : objets) {
			addPageParts(o);
		}
		return (Cluster)this;
	}
	public Cluster addPageParts(PagePart o) {
		if(o != null && !pageParts.contains(o))
			this.pageParts.add(o);
		return (Cluster)this;
	}
	protected Cluster pagePartsInit() {
		if(!pagePartsCouverture.dejaInitialise) {
			_pageParts(pageParts);
		}
		pagePartsCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	////////
	// pk //
	////////

	/**	L'entité « pk »
	 *	 is defined as null before being initialized. 
	 */
	protected Long pk;
	public Couverture<Long> pkCouverture = new Couverture<Long>().p(this).c(Long.class).var("pk").o(pk);

	/**	<br/>L'entité « pk »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:pk">Trouver l'entité pk dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _pk(Couverture<Long> c);

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
		this.pkCouverture.dejaInitialise = true;
	}
	public Cluster setPk(String o) {
		if(org.apache.commons.lang3.math.NumberUtils.isCreatable(o))
			this.pk = Long.parseLong(o);
		this.pkCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster pkInit() {
		if(!pkCouverture.dejaInitialise) {
			_pk(pkCouverture);
			if(pk == null)
				setPk(pkCouverture.o);
		}
		pkCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Long solrPk() {
		return pk;
	}

	public String strPk() {
		return pk == null ? "" : pk.toString();
	}

	public String nomAffichagePk() {
		return "primary key";
	}

	public String htmTooltipPk() {
		return null;
	}

	public String htmPk() {
		return pk == null ? "" : StringEscapeUtils.escapeHtml4(strPk());
	}

	public void htmPk(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Pk\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Pk() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setPk\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichagePk()), "</span>");
				r.s("			<input");
							r.s(" name=\"pk\"");
							r.s(" value=\"", htmPk(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmPk());
			}
			r.l("</div>");
		}
	}

	////////
	// id //
	////////

	/**	L'entité « id »
	 *	 is defined as null before being initialized. 
	 */
	protected String id;
	public Couverture<String> idCouverture = new Couverture<String>().p(this).c(String.class).var("id").o(id);

	/**	<br/>L'entité « id »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:id">Trouver l'entité id dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _id(Couverture<String> c);

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
		this.idCouverture.dejaInitialise = true;
	}
	protected Cluster idInit() {
		if(!idCouverture.dejaInitialise) {
			_id(idCouverture);
			if(id == null)
				setId(idCouverture.o);
		}
		idCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrId() {
		return id;
	}

	public String strId() {
		return id == null ? "" : id;
	}

	public String nomAffichageId() {
		return null;
	}

	public String htmTooltipId() {
		return null;
	}

	public String htmId() {
		return id == null ? "" : StringEscapeUtils.escapeHtml4(strId());
	}

	public void htmId(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Id\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Id() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setId\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageId()), "</span>");
				r.s("			<input");
							r.s(" name=\"id\"");
							r.s(" value=\"", htmId(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmId());
			}
			r.l("</div>");
		}
	}

	//////////
	// cree //
	//////////

	/**	L'entité « cree »
	 *	 is defined as null before being initialized. 
	 */
	protected ZonedDateTime cree;
	public Couverture<ZonedDateTime> creeCouverture = new Couverture<ZonedDateTime>().p(this).c(ZonedDateTime.class).var("cree").o(cree);

	/**	<br/>L'entité « cree »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:cree">Trouver l'entité cree dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _cree(Couverture<ZonedDateTime> c);

	public ZonedDateTime getCree() {
		return cree;
	}

	public void setCree(ZonedDateTime cree) {
		this.cree = cree;
		this.creeCouverture.dejaInitialise = true;
	}
	public Cluster setCree(Instant o) {
		this.cree = ZonedDateTime.from(o);
		this.creeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cluster setCree(String o) {
		this.cree = ZonedDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.creeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	public Cluster setCree(Date o) {
		this.cree = ZonedDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.creeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster creeInit() {
		if(!creeCouverture.dejaInitialise) {
			_cree(creeCouverture);
			if(cree == null)
				setCree(creeCouverture.o);
		}
		creeCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Date solrCree() {
		return cree == null ? null : Date.from(cree.toInstant());
	}

	public String strCree() {
		return cree == null ? "" : cree.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy h:mm:ssa zz", Locale.US));
	}

	public String nomAffichageCree() {
		return "created";
	}

	public String htmTooltipCree() {
		return null;
	}

	public String htmCree() {
		return cree == null ? "" : StringEscapeUtils.escapeHtml4(strCree());
	}

	public void htmCree(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Cree\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Cree() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setCree\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageCree()), "</span>");
				r.s("			<input");
							r.s(" name=\"cree\"");
							r.s(" value=\"", htmCree(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmCree());
			}
			r.l("</div>");
		}
	}

	/////////////
	// modifie //
	/////////////

	/**	L'entité « modifie »
	 *	 is defined as null before being initialized. 
	 */
	protected ZonedDateTime modifie;
	public Couverture<ZonedDateTime> modifieCouverture = new Couverture<ZonedDateTime>().p(this).c(ZonedDateTime.class).var("modifie").o(modifie);

	/**	<br/>L'entité « modifie »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:modifie">Trouver l'entité modifie dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _modifie(Couverture<ZonedDateTime> c);

	public ZonedDateTime getModifie() {
		return modifie;
	}

	public void setModifie(ZonedDateTime modifie) {
		this.modifie = modifie;
		this.modifieCouverture.dejaInitialise = true;
	}
	public Cluster setModifie(Instant o) {
		this.modifie = ZonedDateTime.from(o);
		this.modifieCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cluster setModifie(String o) {
		this.modifie = ZonedDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this.modifieCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	public Cluster setModifie(Date o) {
		this.modifie = ZonedDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this.modifieCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster modifieInit() {
		if(!modifieCouverture.dejaInitialise) {
			_modifie(modifieCouverture);
			if(modifie == null)
				setModifie(modifieCouverture.o);
		}
		modifieCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Date solrModifie() {
		return modifie == null ? null : Date.from(modifie.toInstant());
	}

	public String strModifie() {
		return modifie == null ? "" : modifie.format(DateTimeFormatter.ofPattern("EEE MMM d yyyy h:mm:ssa zz", Locale.US));
	}

	public String nomAffichageModifie() {
		return "modified";
	}

	public String htmTooltipModifie() {
		return null;
	}

	public String htmModifie() {
		return modifie == null ? "" : StringEscapeUtils.escapeHtml4(strModifie());
	}

	public void htmModifie(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Modifie\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Modifie() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setModifie\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageModifie()), "</span>");
				r.s("			<input");
							r.s(" name=\"modifie\"");
							r.s(" value=\"", htmModifie(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmModifie());
			}
			r.l("</div>");
		}
	}

	/////////////
	// archive //
	/////////////

	/**	L'entité « archive »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean archive;
	public Couverture<Boolean> archiveCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("archive").o(archive);

	/**	<br/>L'entité « archive »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:archive">Trouver l'entité archive dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _archive(Couverture<Boolean> c);

	public Boolean getArchive() {
		return archive;
	}

	public void setArchive(Boolean archive) {
		this.archive = archive;
		this.archiveCouverture.dejaInitialise = true;
	}
	public Cluster setArchive(String o) {
		this.archive = Boolean.parseBoolean(o);
		this.archiveCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster archiveInit() {
		if(!archiveCouverture.dejaInitialise) {
			_archive(archiveCouverture);
			if(archive == null)
				setArchive(archiveCouverture.o);
		}
		archiveCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Boolean solrArchive() {
		return archive;
	}

	public String strArchive() {
		return archive == null ? "" : archive.toString();
	}

	public String nomAffichageArchive() {
		return "archived";
	}

	public String htmTooltipArchive() {
		return null;
	}

	public String htmArchive() {
		return archive == null ? "" : StringEscapeUtils.escapeHtml4(strArchive());
	}

	public void htmArchive(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Archive\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Archive() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setArchive\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageArchive()), "</span>");
				r.s("			<input");
							r.s(" name=\"archive\"");
							r.s(" value=\"", htmArchive(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmArchive());
			}
			r.l("</div>");
		}
	}

	//////////////
	// supprime //
	//////////////

	/**	L'entité « supprime »
	 *	 is defined as null before being initialized. 
	 */
	protected Boolean supprime;
	public Couverture<Boolean> supprimeCouverture = new Couverture<Boolean>().p(this).c(Boolean.class).var("supprime").o(supprime);

	/**	<br/>L'entité « supprime »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:supprime">Trouver l'entité supprime dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _supprime(Couverture<Boolean> c);

	public Boolean getSupprime() {
		return supprime;
	}

	public void setSupprime(Boolean supprime) {
		this.supprime = supprime;
		this.supprimeCouverture.dejaInitialise = true;
	}
	public Cluster setSupprime(String o) {
		this.supprime = Boolean.parseBoolean(o);
		this.supprimeCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster supprimeInit() {
		if(!supprimeCouverture.dejaInitialise) {
			_supprime(supprimeCouverture);
			if(supprime == null)
				setSupprime(supprimeCouverture.o);
		}
		supprimeCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Boolean solrSupprime() {
		return supprime;
	}

	public String strSupprime() {
		return supprime == null ? "" : supprime.toString();
	}

	public String nomAffichageSupprime() {
		return "deleted";
	}

	public String htmTooltipSupprime() {
		return null;
	}

	public String htmSupprime() {
		return supprime == null ? "" : StringEscapeUtils.escapeHtml4(strSupprime());
	}

	public void htmSupprime(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "Supprime\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "Supprime() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setSupprime\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageSupprime()), "</span>");
				r.s("			<input");
							r.s(" name=\"supprime\"");
							r.s(" value=\"", htmSupprime(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmSupprime());
			}
			r.l("</div>");
		}
	}

	////////////////////////
	// classeNomCanonique //
	////////////////////////

	/**	L'entité « classeNomCanonique »
	 *	 is defined as null before being initialized. 
	 */
	protected String classeNomCanonique;
	public Couverture<String> classeNomCanoniqueCouverture = new Couverture<String>().p(this).c(String.class).var("classeNomCanonique").o(classeNomCanonique);

	/**	<br/>L'entité « classeNomCanonique »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:classeNomCanonique">Trouver l'entité classeNomCanonique dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _classeNomCanonique(Couverture<String> c);

	public String getClasseNomCanonique() {
		return classeNomCanonique;
	}

	public void setClasseNomCanonique(String classeNomCanonique) {
		this.classeNomCanonique = classeNomCanonique;
		this.classeNomCanoniqueCouverture.dejaInitialise = true;
	}
	protected Cluster classeNomCanoniqueInit() {
		if(!classeNomCanoniqueCouverture.dejaInitialise) {
			_classeNomCanonique(classeNomCanoniqueCouverture);
			if(classeNomCanonique == null)
				setClasseNomCanonique(classeNomCanoniqueCouverture.o);
		}
		classeNomCanoniqueCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrClasseNomCanonique() {
		return classeNomCanonique;
	}

	public String strClasseNomCanonique() {
		return classeNomCanonique == null ? "" : classeNomCanonique;
	}

	public String nomAffichageClasseNomCanonique() {
		return null;
	}

	public String htmTooltipClasseNomCanonique() {
		return null;
	}

	public String htmClasseNomCanonique() {
		return classeNomCanonique == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomCanonique());
	}

	public void htmClasseNomCanonique(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "ClasseNomCanonique\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "ClasseNomCanonique() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setClasseNomCanonique\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageClasseNomCanonique()), "</span>");
				r.s("			<input");
							r.s(" name=\"classeNomCanonique\"");
							r.s(" value=\"", htmClasseNomCanonique(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmClasseNomCanonique());
			}
			r.l("</div>");
		}
	}

	/////////////////////
	// classeNomSimple //
	/////////////////////

	/**	L'entité « classeNomSimple »
	 *	 is defined as null before being initialized. 
	 */
	protected String classeNomSimple;
	public Couverture<String> classeNomSimpleCouverture = new Couverture<String>().p(this).c(String.class).var("classeNomSimple").o(classeNomSimple);

	/**	<br/>L'entité « classeNomSimple »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:classeNomSimple">Trouver l'entité classeNomSimple dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _classeNomSimple(Couverture<String> c);

	public String getClasseNomSimple() {
		return classeNomSimple;
	}

	public void setClasseNomSimple(String classeNomSimple) {
		this.classeNomSimple = classeNomSimple;
		this.classeNomSimpleCouverture.dejaInitialise = true;
	}
	protected Cluster classeNomSimpleInit() {
		if(!classeNomSimpleCouverture.dejaInitialise) {
			_classeNomSimple(classeNomSimpleCouverture);
			if(classeNomSimple == null)
				setClasseNomSimple(classeNomSimpleCouverture.o);
		}
		classeNomSimpleCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solrClasseNomSimple() {
		return classeNomSimple;
	}

	public String strClasseNomSimple() {
		return classeNomSimple == null ? "" : classeNomSimple;
	}

	public String nomAffichageClasseNomSimple() {
		return null;
	}

	public String htmTooltipClasseNomSimple() {
		return null;
	}

	public String htmClasseNomSimple() {
		return classeNomSimple == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomSimple());
	}

	public void htmClasseNomSimple(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "ClasseNomSimple\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "ClasseNomSimple() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setClasseNomSimple\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageClasseNomSimple()), "</span>");
				r.s("			<input");
							r.s(" name=\"classeNomSimple\"");
							r.s(" value=\"", htmClasseNomSimple(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmClasseNomSimple());
			}
			r.l("</div>");
		}
	}

	//////////////////////////
	// classeNomsCanoniques //
	//////////////////////////

	/**	L'entité « classeNomsCanoniques »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 */
	protected List<String> classeNomsCanoniques = new java.util.ArrayList<java.lang.String>();
	public Couverture<List<String>> classeNomsCanoniquesCouverture = new Couverture<List<String>>().p(this).c(List.class).var("classeNomsCanoniques").o(classeNomsCanoniques);

	/**	<br/>L'entité « classeNomsCanoniques »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut List<String>(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:classeNomsCanoniques">Trouver l'entité classeNomsCanoniques dans Solr</a>
	 * <br/>
	 * @param classeNomsCanoniques est l'entité déjà construit. 
	 **/
	protected abstract void _classeNomsCanoniques(List<String> l);

	public List<String> getClasseNomsCanoniques() {
		return classeNomsCanoniques;
	}

	public void setClasseNomsCanoniques(List<String> classeNomsCanoniques) {
		this.classeNomsCanoniques = classeNomsCanoniques;
		this.classeNomsCanoniquesCouverture.dejaInitialise = true;
	}
	public Cluster addClasseNomsCanoniques(String...objets) {
		for(String o : objets) {
			addClasseNomsCanoniques(o);
		}
		return (Cluster)this;
	}
	public Cluster addClasseNomsCanoniques(String o) {
		if(o != null && !classeNomsCanoniques.contains(o))
			this.classeNomsCanoniques.add(o);
		return (Cluster)this;
	}
	public Cluster setClasseNomsCanoniques(JsonArray objets) {
		classeNomsCanoniques.clear();
		for(int i = 0; i < objets.size(); i++) {
			String o = objets.getString(i);
			addClasseNomsCanoniques(o);
		}
		return (Cluster)this;
	}
	protected Cluster classeNomsCanoniquesInit() {
		if(!classeNomsCanoniquesCouverture.dejaInitialise) {
			_classeNomsCanoniques(classeNomsCanoniques);
		}
		classeNomsCanoniquesCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public List<String> solrClasseNomsCanoniques() {
		return classeNomsCanoniques;
	}

	public String strClasseNomsCanoniques() {
		return classeNomsCanoniques == null ? "" : classeNomsCanoniques.toString();
	}

	public String nomAffichageClasseNomsCanoniques() {
		return null;
	}

	public String htmTooltipClasseNomsCanoniques() {
		return null;
	}

	public String htmClasseNomsCanoniques() {
		return classeNomsCanoniques == null ? "" : StringEscapeUtils.escapeHtml4(strClasseNomsCanoniques());
	}

	public void htmClasseNomsCanoniques(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "ClasseNomsCanoniques\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "ClasseNomsCanoniques() {");
				r.l("			$.ajax({");
				r.l("				url: '/api/cluster?fq=pk:", strPk(), "',");
				r.l("				dataType: 'json',");
				r.l("				type: 'patch',");
				r.l("				contentType: 'application/json',");
				r.l("				processData: false,");
				r.l("				success: function( data, textStatus, jQxhr ) {");
				r.l("					");
				r.l("				},");
				r.l("				error: function( jqXhr, textStatus, errorThrown ) {");
				r.l("					");
				r.l("				},");
				r.l("				data: {\"setClasseNomsCanoniques\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichageClasseNomsCanoniques()), "</span>");
				r.s("			<input");
							r.s(" name=\"classeNomsCanoniques\"");
							r.s(" value=\"", htmClasseNomsCanoniques(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htmClasseNomsCanoniques());
			}
			r.l("</div>");
		}
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCluster = false;

	public Cluster initLoinCluster(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCluster) {
			dejaInitialiseCluster = true;
			initLoinCluster();
		}
		return (Cluster)this;
	}

	public void initLoinCluster() {
		initCluster();
	}

	public void initCluster() {
		requeteSite_Init();
		pagePartsInit();
		pkInit();
		idInit();
		creeInit();
		modifieInit();
		archiveInit();
		supprimeInit();
		classeNomCanoniqueInit();
		classeNomSimpleInit();
		classeNomsCanoniquesInit();
	}

	public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinCluster(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCluster(RequeteSiteEnUS requeteSite_) {
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteCluster(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCluster(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCluster(String var) {
		Cluster oCluster = (Cluster)this;
		switch(var) {
			case "requeteSite_":
				return oCluster.requeteSite_;
			case "pageParts":
				return oCluster.pageParts;
			case "pk":
				return oCluster.pk;
			case "id":
				return oCluster.id;
			case "cree":
				return oCluster.cree;
			case "modifie":
				return oCluster.modifie;
			case "archive":
				return oCluster.archive;
			case "supprime":
				return oCluster.supprime;
			case "classeNomCanonique":
				return oCluster.classeNomCanonique;
			case "classeNomSimple":
				return oCluster.classeNomSimple;
			case "classeNomsCanoniques":
				return oCluster.classeNomsCanoniques;
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
				o = attribuerCluster(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCluster(String var, Object val) {
		Cluster oCluster = (Cluster)this;
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
					o = definirCluster(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCluster(String var, String val) {
		switch(var) {
			case "cree":
				setCree(val);
				sauvegardesCluster.add(var);
				return val;
			case "modifie":
				setModifie(val);
				sauvegardesCluster.add(var);
				return val;
			case "archive":
				setArchive(val);
				sauvegardesCluster.add(var);
				return val;
			case "supprime":
				setSupprime(val);
				sauvegardesCluster.add(var);
				return val;
			default:
				return null;
		}
	}

	/////////////////
	// sauvegardes //
	/////////////////

	protected List<String> sauvegardesCluster = new ArrayList<String>();

	/////////////
	// peupler //
	/////////////

	public void peuplerPourClasse(SolrDocument solrDocument) {
		peuplerCluster(solrDocument);
	}
	public void peuplerCluster(SolrDocument solrDocument) {
		Cluster oCluster = (Cluster)this;
		sauvegardesCluster = (List<String>)solrDocument.get("sauvegardesCluster_stored_strings");
		if(sauvegardesCluster != null) {

			Long pk = (Long)solrDocument.get("pk_stored_long");
			oCluster.setPk(pk);

			String id = (String)solrDocument.get("id");
			oCluster.setId(id);

			if(sauvegardesCluster.contains("cree")) {
				Date cree = (Date)solrDocument.get("cree_stored_date");
				if(cree != null)
					oCluster.setCree(cree);
			}

			if(sauvegardesCluster.contains("modifie")) {
				Date modifie = (Date)solrDocument.get("modifie_stored_date");
				if(modifie != null)
					oCluster.setModifie(modifie);
			}

			if(sauvegardesCluster.contains("archive")) {
				Boolean archive = (Boolean)solrDocument.get("archive_stored_boolean");
				if(archive != null)
					oCluster.setArchive(archive);
			}

			if(sauvegardesCluster.contains("supprime")) {
				Boolean supprime = (Boolean)solrDocument.get("supprime_stored_boolean");
				if(supprime != null)
					oCluster.setSupprime(supprime);
			}

			if(sauvegardesCluster.contains("classeNomCanonique")) {
				String classeNomCanonique = (String)solrDocument.get("classeNomCanonique_stored_string");
				if(classeNomCanonique != null)
					oCluster.setClasseNomCanonique(classeNomCanonique);
			}

			if(sauvegardesCluster.contains("classeNomSimple")) {
				String classeNomSimple = (String)solrDocument.get("classeNomSimple_stored_string");
				if(classeNomSimple != null)
					oCluster.setClasseNomSimple(classeNomSimple);
			}

			if(sauvegardesCluster.contains("classeNomsCanoniques")) {
				List<String> classeNomsCanoniques = (List<String>)solrDocument.get("classeNomsCanoniques_stored_strings");
				if(classeNomsCanoniques != null)
					oCluster.classeNomsCanoniques.addAll(classeNomsCanoniques);
			}
		}
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cluster.Cluster"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			Cluster o = new Cluster();
			o.requeteSiteCluster(requeteSite);
			o.initLoinCluster(requeteSite);
			o.indexerCluster();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	public void indexerPourClasse() {
		indexerCluster();
	}

	public void indexerPourClasse(SolrInputDocument document) {
		indexerCluster(document);
	}

	public void indexerCluster(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerCluster(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerCluster() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerCluster(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerCluster(SolrInputDocument document) {
		if(sauvegardesCluster != null)
			document.addField("sauvegardesCluster_stored_strings", sauvegardesCluster);

		if(pk != null) {
			document.addField("pk_indexed_long", pk);
			document.addField("pk_stored_long", pk);
		}
		if(id != null) {
			document.addField("id", id);
			document.addField("id_indexed_string", id);
		}
		if(cree != null) {
			document.addField("cree_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(cree.toInstant(), ZoneId.of("UTC"))));
			document.addField("cree_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(cree.toInstant(), ZoneId.of("UTC"))));
		}
		if(modifie != null) {
			document.addField("modifie_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(modifie.toInstant(), ZoneId.of("UTC"))));
			document.addField("modifie_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(modifie.toInstant(), ZoneId.of("UTC"))));
		}
		if(archive != null) {
			document.addField("archive_indexed_boolean", archive);
			document.addField("archive_stored_boolean", archive);
		}
		if(supprime != null) {
			document.addField("supprime_indexed_boolean", supprime);
			document.addField("supprime_stored_boolean", supprime);
		}
		if(classeNomCanonique != null) {
			document.addField("classeNomCanonique_indexed_string", classeNomCanonique);
			document.addField("classeNomCanonique_stored_string", classeNomCanonique);
		}
		if(classeNomSimple != null) {
			document.addField("classeNomSimple_indexed_string", classeNomSimple);
			document.addField("classeNomSimple_stored_string", classeNomSimple);
		}
		if(classeNomsCanoniques != null) {
			for(java.lang.String o : classeNomsCanoniques) {
				document.addField("classeNomsCanoniques_indexed_strings", o);
			}
			for(java.lang.String o : classeNomsCanoniques) {
				document.addField("classeNomsCanoniques_stored_strings", o);
			}
		}
	}

	public void desindexerCluster() {
		try {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinCluster(siteContexte.getRequeteSite_());
			SolrClient clientSolr = siteContexte.getClientSolr();
			clientSolr.deleteById(id.toString());
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// stocker //
	/////////////

	public void stockerPourClasse(SolrDocument solrDocument) {
		stockerCluster(solrDocument);
	}
	public void stockerCluster(SolrDocument solrDocument) {
		Cluster oCluster = (Cluster)this;

		Long pk = (Long)solrDocument.get("pk_stored_long");
		if(pk != null)
			oCluster.setPk(pk);

		String id = (String)solrDocument.get("id");
		oCluster.setId(id);

		Date cree = (Date)solrDocument.get("cree_stored_date");
		if(cree != null)
			oCluster.setCree(cree);

		Date modifie = (Date)solrDocument.get("modifie_stored_date");
		if(modifie != null)
			oCluster.setModifie(modifie);

		Boolean archive = (Boolean)solrDocument.get("archive_stored_boolean");
		if(archive != null)
			oCluster.setArchive(archive);

		Boolean supprime = (Boolean)solrDocument.get("supprime_stored_boolean");
		if(supprime != null)
			oCluster.setSupprime(supprime);

		String classeNomCanonique = (String)solrDocument.get("classeNomCanonique_stored_string");
		if(classeNomCanonique != null)
			oCluster.setClasseNomCanonique(classeNomCanonique);

		String classeNomSimple = (String)solrDocument.get("classeNomSimple_stored_string");
		if(classeNomSimple != null)
			oCluster.setClasseNomSimple(classeNomSimple);

		List<String> classeNomsCanoniques = (List<String>)solrDocument.get("classeNomsCanoniques_stored_strings");
		if(classeNomsCanoniques != null)
			oCluster.classeNomsCanoniques.addAll(classeNomsCanoniques);
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(cree, modifie, archive, supprime);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof Cluster))
			return false;
		Cluster that = (Cluster)o;
		return Objects.equals( cree, that.cree )
				&& Objects.equals( modifie, that.modifie )
				&& Objects.equals( archive, that.archive )
				&& Objects.equals( supprime, that.supprime );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cluster {");
		sb.append( "cree: " ).append(cree);
		sb.append( ", modifie: " ).append(modifie);
		sb.append( ", archive: " ).append(archive);
		sb.append( ", supprime: " ).append(supprime);
		sb.append(" }");
		return sb.toString();
	}
}
