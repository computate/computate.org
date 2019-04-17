package org.computate.site.enUS.utilisateur;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.article.ArticleEnUSPage;
import org.computate.site.enUS.utilisateur.UtilisateurSite;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class UtilisateurSiteEnUSGenPageGen<DEV> extends ArticleEnUSPage {

	/////////////////////
	// utilisateurSite //
	/////////////////////

	/**	L'entité « utilisateurSite »
	 *	 is defined as null before being initialized. 
	 */
	protected UtilisateurSite utilisateurSite;
	public Couverture<UtilisateurSite> utilisateurSiteCouverture = new Couverture<UtilisateurSite>().p(this).c(UtilisateurSite.class).var("utilisateurSite").o(utilisateurSite);

	/**	<br/>L'entité « utilisateurSite »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.utilisateur.UtilisateurSiteEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:utilisateurSite">Trouver l'entité utilisateurSite dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _utilisateurSite(Couverture<UtilisateurSite> c);

	public UtilisateurSite getUtilisateurSite() {
		return utilisateurSite;
	}

	public void setUtilisateurSite(UtilisateurSite utilisateurSite) {
		this.utilisateurSite = utilisateurSite;
		this.utilisateurSiteCouverture.dejaInitialise = true;
	}
	protected UtilisateurSiteEnUSGenPage utilisateurSiteInit() {
		if(!utilisateurSiteCouverture.dejaInitialise) {
			_utilisateurSite(utilisateurSiteCouverture);
			if(utilisateurSite == null)
				setUtilisateurSite(utilisateurSiteCouverture.o);
		}
		if(utilisateurSite != null)
			utilisateurSite.initLoinPourClasse(requeteSite_);
		utilisateurSiteCouverture.dejaInitialise(true);
		return (UtilisateurSiteEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseUtilisateurSiteEnUSGenPage = false;

	public UtilisateurSiteEnUSGenPage initLoinUtilisateurSiteEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseUtilisateurSiteEnUSGenPage) {
			dejaInitialiseUtilisateurSiteEnUSGenPage = true;
			initLoinUtilisateurSiteEnUSGenPage();
		}
		return (UtilisateurSiteEnUSGenPage)this;
	}

	public void initLoinUtilisateurSiteEnUSGenPage() {
		super.initLoinArticleEnUSPage(requeteSite_);
		initUtilisateurSiteEnUSGenPage();
	}

	public void initUtilisateurSiteEnUSGenPage() {
		utilisateurSiteInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinUtilisateurSiteEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteUtilisateurSiteEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteArticleEnUSPage(requeteSite_);
		if(utilisateurSite != null)
			utilisateurSite.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteUtilisateurSiteEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirUtilisateurSiteEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirUtilisateurSiteEnUSGenPage(String var) throws Exception {
		UtilisateurSiteEnUSGenPage oUtilisateurSiteEnUSGenPage = (UtilisateurSiteEnUSGenPage)this;
		switch(var) {
			case "utilisateurSite":
				return oUtilisateurSiteEnUSGenPage.utilisateurSite;
			default:
				return super.obtenirArticleEnUSPage(var);
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
				o = attribuerUtilisateurSiteEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerUtilisateurSiteEnUSGenPage(String var, Object val) {
		UtilisateurSiteEnUSGenPage oUtilisateurSiteEnUSGenPage = (UtilisateurSiteEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerArticleEnUSPage(var, val);
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
					o = definirUtilisateurSiteEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirUtilisateurSiteEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirArticleEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	@Override public void htmlScripts() {
		htmlScriptsUtilisateurSiteEnUSGenPage();
		super.htmlScripts();
	}

	public void htmlScriptsUtilisateurSiteEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyUtilisateurSiteEnUSGenPage();
		super.htmlBody();
	}

	public void htmlBodyUtilisateurSiteEnUSGenPage() {
		if(utilisateurSite != null)
			utilisateurSite.htmlBody();
	}

	////////////////
	// htmlScript //
	////////////////

	@Override public void htmlScript() {
		htmlScriptUtilisateurSiteEnUSGenPage();
		super.htmlScript();
	}

	public void htmlScriptUtilisateurSiteEnUSGenPage() {
	}

	//////////
	// html //
	//////////

	@Override public void html() {
		htmlUtilisateurSiteEnUSGenPage();
		super.html();
	}

	public void htmlUtilisateurSiteEnUSGenPage() {
	}

	//////////////
	// htmlMeta //
	//////////////

	@Override public void htmlMeta() {
		htmlMetaUtilisateurSiteEnUSGenPage();
		super.htmlMeta();
	}

	public void htmlMetaUtilisateurSiteEnUSGenPage() {
	}

	////////////////
	// htmlStyles //
	////////////////

	@Override public void htmlStyles() {
		htmlStylesUtilisateurSiteEnUSGenPage();
		super.htmlStyles();
	}

	public void htmlStylesUtilisateurSiteEnUSGenPage() {
	}

	///////////////
	// htmlStyle //
	///////////////

	@Override public void htmlStyle() {
		htmlStyleUtilisateurSiteEnUSGenPage();
		super.htmlStyle();
	}

	public void htmlStyleUtilisateurSiteEnUSGenPage() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtUtilisateurSiteEnUSGenPage();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtUtilisateurSiteEnUSGenPage() {
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
		if(!(o instanceof UtilisateurSiteEnUSGenPage))
			return false;
		UtilisateurSiteEnUSGenPage that = (UtilisateurSiteEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("UtilisateurSiteEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
