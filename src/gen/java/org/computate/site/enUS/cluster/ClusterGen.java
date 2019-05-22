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

	//////////////
	// _created //
	//////////////

	/**	L'entité « _created »
	 *	 is defined as null before being initialized. 
	 */
	protected ZonedDateTime _created;
	public Couverture<ZonedDateTime> _createdCouverture = new Couverture<ZonedDateTime>().p(this).c(ZonedDateTime.class).var("_created").o(_created);

	/**	<br/>L'entité « _created »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:_created">Trouver l'entité _created dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void __created(Couverture<ZonedDateTime> c);

	public ZonedDateTime get_created() {
		return _created;
	}

	public void set_created(ZonedDateTime _created) {
		this._created = _created;
		this._createdCouverture.dejaInitialise = true;
	}
	public Cluster set_created(Instant o) {
		this._created = ZonedDateTime.from(o);
		this._createdCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cluster set_created(String o) {
		this._created = ZonedDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this._createdCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	public Cluster set_created(Date o) {
		this._created = ZonedDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this._createdCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster _createdInit() {
		if(!_createdCouverture.dejaInitialise) {
			__created(_createdCouverture);
			if(_created == null)
				set_created(_createdCouverture.o);
		}
		_createdCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Date solr_created() {
		return _created == null ? null : Date.from(_created.toInstant());
	}

	public String str_created() {
		return _created == null ? "" : _created.toString();
	}

	public String nomAffichage_created() {
		return "created";
	}

	public String htmTooltip_created() {
		return null;
	}

	public String htm_created() {
		return _created == null ? "" : StringEscapeUtils.escapeHtml4(str_created());
	}

	public void htm_created(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "_created\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "_created() {");
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
				r.l("				data: {\"set_created\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichage_created()), "</span>");
				r.s("			<input");
							r.s(" name=\"_created\"");
							r.s(" value=\"", htm_created(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htm_created());
			}
			r.l("</div>");
		}
	}

	///////////////
	// _modified //
	///////////////

	/**	L'entité « _modified »
	 *	 is defined as null before being initialized. 
	 */
	protected ZonedDateTime _modified;
	public Couverture<ZonedDateTime> _modifiedCouverture = new Couverture<ZonedDateTime>().p(this).c(ZonedDateTime.class).var("_modified").o(_modified);

	/**	<br/>L'entité « _modified »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:_modified">Trouver l'entité _modified dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void __modified(Couverture<ZonedDateTime> c);

	public ZonedDateTime get_modified() {
		return _modified;
	}

	public void set_modified(ZonedDateTime _modified) {
		this._modified = _modified;
		this._modifiedCouverture.dejaInitialise = true;
	}
	public Cluster set_modified(Instant o) {
		this._modified = ZonedDateTime.from(o);
		this._modifiedCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	/** Example: 2011-12-03T10:15:30+01:00 **/
	public Cluster set_modified(String o) {
		this._modified = ZonedDateTime.parse(o, DateTimeFormatter.ISO_OFFSET_DATE_TIME);
		this._modifiedCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	public Cluster set_modified(Date o) {
		this._modified = ZonedDateTime.ofInstant(o.toInstant(), ZoneId.systemDefault());
		this._modifiedCouverture.dejaInitialise = true;
		return (Cluster)this;
	}
	protected Cluster _modifiedInit() {
		if(!_modifiedCouverture.dejaInitialise) {
			__modified(_modifiedCouverture);
			if(_modified == null)
				set_modified(_modifiedCouverture.o);
		}
		_modifiedCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public Date solr_modified() {
		return _modified == null ? null : Date.from(_modified.toInstant());
	}

	public String str_modified() {
		return _modified == null ? "" : _modified.toString();
	}

	public String nomAffichage_modified() {
		return "modified";
	}

	public String htmTooltip_modified() {
		return null;
	}

	public String htm_modified() {
		return _modified == null ? "" : StringEscapeUtils.escapeHtml4(str_modified());
	}

	public void htm_modified(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "_modified\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "_modified() {");
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
				r.l("				data: {\"set_modified\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichage_modified()), "</span>");
				r.s("			<input");
							r.s(" name=\"_modified\"");
							r.s(" value=\"", htm_modified(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htm_modified());
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

	/////////////////////////
	// _classCanonicalName //
	/////////////////////////

	/**	L'entité « _classCanonicalName »
	 *	 is defined as null before being initialized. 
	 */
	protected String _classCanonicalName;
	public Couverture<String> _classCanonicalNameCouverture = new Couverture<String>().p(this).c(String.class).var("_classCanonicalName").o(_classCanonicalName);

	/**	<br/>L'entité « _classCanonicalName »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:_classCanonicalName">Trouver l'entité _classCanonicalName dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void __classCanonicalName(Couverture<String> c);

	public String get_classCanonicalName() {
		return _classCanonicalName;
	}

	public void set_classCanonicalName(String _classCanonicalName) {
		this._classCanonicalName = _classCanonicalName;
		this._classCanonicalNameCouverture.dejaInitialise = true;
	}
	protected Cluster _classCanonicalNameInit() {
		if(!_classCanonicalNameCouverture.dejaInitialise) {
			__classCanonicalName(_classCanonicalNameCouverture);
			if(_classCanonicalName == null)
				set_classCanonicalName(_classCanonicalNameCouverture.o);
		}
		_classCanonicalNameCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solr_classCanonicalName() {
		return _classCanonicalName;
	}

	public String str_classCanonicalName() {
		return _classCanonicalName == null ? "" : _classCanonicalName;
	}

	public String nomAffichage_classCanonicalName() {
		return null;
	}

	public String htmTooltip_classCanonicalName() {
		return null;
	}

	public String htm_classCanonicalName() {
		return _classCanonicalName == null ? "" : StringEscapeUtils.escapeHtml4(str_classCanonicalName());
	}

	public void htm_classCanonicalName(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "_classCanonicalName\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "_classCanonicalName() {");
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
				r.l("				data: {\"set_classCanonicalName\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichage_classCanonicalName()), "</span>");
				r.s("			<input");
							r.s(" name=\"_classCanonicalName\"");
							r.s(" value=\"", htm_classCanonicalName(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htm_classCanonicalName());
			}
			r.l("</div>");
		}
	}

	//////////////////////
	// _classSimpleName //
	//////////////////////

	/**	L'entité « _classSimpleName »
	 *	 is defined as null before being initialized. 
	 */
	protected String _classSimpleName;
	public Couverture<String> _classSimpleNameCouverture = new Couverture<String>().p(this).c(String.class).var("_classSimpleName").o(_classSimpleName);

	/**	<br/>L'entité « _classSimpleName »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cluster.Cluster&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:_classSimpleName">Trouver l'entité _classSimpleName dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void __classSimpleName(Couverture<String> c);

	public String get_classSimpleName() {
		return _classSimpleName;
	}

	public void set_classSimpleName(String _classSimpleName) {
		this._classSimpleName = _classSimpleName;
		this._classSimpleNameCouverture.dejaInitialise = true;
	}
	protected Cluster _classSimpleNameInit() {
		if(!_classSimpleNameCouverture.dejaInitialise) {
			__classSimpleName(_classSimpleNameCouverture);
			if(_classSimpleName == null)
				set_classSimpleName(_classSimpleNameCouverture.o);
		}
		_classSimpleNameCouverture.dejaInitialise(true);
		return (Cluster)this;
	}

	public String solr_classSimpleName() {
		return _classSimpleName;
	}

	public String str_classSimpleName() {
		return _classSimpleName == null ? "" : _classSimpleName;
	}

	public String nomAffichage_classSimpleName() {
		return null;
	}

	public String htmTooltip_classSimpleName() {
		return null;
	}

	public String htm_classSimpleName() {
		return _classSimpleName == null ? "" : StringEscapeUtils.escapeHtml4(str_classSimpleName());
	}

	public void htm_classSimpleName(ToutEcrivain r, Boolean patchDroits) {
		if(pk!= null) {
			r.s("<div id=\"patchCluster", strPk(), "_classSimpleName\">");
			if(patchDroits) {
				r.l();
				r.l("	<script>//<![CDATA[");
				r.l("		function patchCluster", strPk(), "_classSimpleName() {");
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
				r.l("				data: {\"set_classSimpleName\": this.value },");
				r.l("				");
				r.l("			});");
				r.l("		}");
				r.l("	//]]></script>");
				r.l("	<div class=\"\">");
				r.l("		<label class=\"w3-tooltip \">");
				r.l("			<span>", StringEscapeUtils.escapeHtml4(nomAffichage_classSimpleName()), "</span>");
				r.s("			<input");
							r.s(" name=\"_classSimpleName\"");
							r.s(" value=\"", htm_classSimpleName(), "\");");
							r.s(" onchange=\"\"");
							r.l("/>");
				r.l("		</label>");
				r.l("	</div>");
			} else {
				r.s(htm_classSimpleName());
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
		pagePartsInit();
		pkInit();
		idInit();
		_createdInit();
		_modifiedInit();
		archiveInit();
		supprimeInit();
		_classCanonicalNameInit();
		_classSimpleNameInit();
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
			case "_created":
				return oCluster._created;
			case "_modified":
				return oCluster._modified;
			case "archive":
				return oCluster.archive;
			case "supprime":
				return oCluster.supprime;
			case "_classCanonicalName":
				return oCluster._classCanonicalName;
			case "_classSimpleName":
				return oCluster._classSimpleName;
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

			if(sauvegardesCluster.contains("_created")) {
				Date _created = (Date)solrDocument.get("_created_stored_date");
				if(_created != null)
					oCluster.set_created(_created);
			}

			if(sauvegardesCluster.contains("_modified")) {
				Date _modified = (Date)solrDocument.get("_modified_stored_date");
				if(_modified != null)
					oCluster.set_modified(_modified);
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

			if(sauvegardesCluster.contains("_classCanonicalName")) {
				String _classCanonicalName = (String)solrDocument.get("_classCanonicalName_stored_string");
				if(_classCanonicalName != null)
					oCluster.set_classCanonicalName(_classCanonicalName);
			}

			if(sauvegardesCluster.contains("_classSimpleName")) {
				String _classSimpleName = (String)solrDocument.get("_classSimpleName_stored_string");
				if(_classSimpleName != null)
					oCluster.set_classSimpleName(_classSimpleName);
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
		if(_created != null) {
			document.addField("_created_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(_created.toInstant(), ZoneId.of("UTC"))));
			document.addField("_created_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(_created.toInstant(), ZoneId.of("UTC"))));
		}
		if(_modified != null) {
			document.addField("_modified_indexed_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(_modified.toInstant(), ZoneId.of("UTC"))));
			document.addField("_modified_stored_date", DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss'Z'").format(ZonedDateTime.ofInstant(_modified.toInstant(), ZoneId.of("UTC"))));
		}
		if(archive != null) {
			document.addField("archive_indexed_boolean", archive);
			document.addField("archive_stored_boolean", archive);
		}
		if(supprime != null) {
			document.addField("supprime_indexed_boolean", supprime);
			document.addField("supprime_stored_boolean", supprime);
		}
		if(_classCanonicalName != null) {
			document.addField("_classCanonicalName_indexed_string", _classCanonicalName);
			document.addField("_classCanonicalName_stored_string", _classCanonicalName);
		}
		if(_classSimpleName != null) {
			document.addField("_classSimpleName_indexed_string", _classSimpleName);
			document.addField("_classSimpleName_stored_string", _classSimpleName);
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

		Date _created = (Date)solrDocument.get("_created_stored_date");
		if(_created != null)
			oCluster.set_created(_created);

		Date _modified = (Date)solrDocument.get("_modified_stored_date");
		if(_modified != null)
			oCluster.set_modified(_modified);

		Boolean archive = (Boolean)solrDocument.get("archive_stored_boolean");
		if(archive != null)
			oCluster.setArchive(archive);

		Boolean supprime = (Boolean)solrDocument.get("supprime_stored_boolean");
		if(supprime != null)
			oCluster.setSupprime(supprime);

		String _classCanonicalName = (String)solrDocument.get("_classCanonicalName_stored_string");
		if(_classCanonicalName != null)
			oCluster.set_classCanonicalName(_classCanonicalName);

		String _classSimpleName = (String)solrDocument.get("_classSimpleName_stored_string");
		if(_classSimpleName != null)
			oCluster.set_classSimpleName(_classSimpleName);

		List<String> classeNomsCanoniques = (List<String>)solrDocument.get("classeNomsCanoniques_stored_strings");
		if(classeNomsCanoniques != null)
			oCluster.classeNomsCanoniques.addAll(classeNomsCanoniques);
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(archive, supprime);
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
		return Objects.equals( archive, that.archive )
				&& Objects.equals( supprime, that.supprime );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Cluster {");
		sb.append( "archive: " ).append(archive);
		sb.append( ", supprime: " ).append(supprime);
		sb.append(" }");
		return sb.toString();
	}
}
