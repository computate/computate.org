package org.computate.frFR.site.cours.c001;

import org.computate.frFR.site.cluster.Cluster;
import org.computate.frFR.site.requete.RequeteSiteFrFR;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.client.solrj.SolrClient;
import java.util.ArrayList;
import org.computate.frFR.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.cours.Cours;
import org.computate.frFR.site.contexte.SiteContexteFrFR;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.frFR.site.cours.c001.C001&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001Gen<DEV> extends Cours {

	public static final String C001_UnNom = "un cours n ° 1";
	public static final String C001_Ce = "ce ";
	public static final String C001_CeNom = "ce cours n ° 1";
	public static final String C001_Un = "un ";
	public static final String C001_LeNom = "le cours n ° 1";
	public static final String C001_NomSingulier = "cours n ° 1";
	public static final String C001_NomPluriel = "courses";
	public static final String C001_NomActuel = "cours n ° 1 actuel";
	public static final String C001_TousNom = "tous les courses";
	public static final String C001_LesNoms = "les courses";
	public static final String C001_AucunNomTrouve = "aucun cours n ° 1 trouvé";
	public static final String C001_NomVar = "coursN°1";
	public static final String C001_DeNom = "de cours n ° 1";
	public static final String C001_Couleur = "green";
	public static final String C001_IconeGroupe = "regular";
	public static final String C001_IconeNom = "university";

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001 = false;

	public C001 initLoinC001(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001) {
			dejaInitialiseC001 = true;
			initLoinC001();
		}
		return (C001)this;
	}

	public void initLoinC001() {
		super.initLoinCours(requeteSite_);
		initC001();
	}

	public void initC001() {
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteCours(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001(requeteSite_);
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			C001 o = new C001();
			o.requeteSiteC001(requeteSite);
			o.initLoinC001(requeteSite);
			o.indexerC001();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001(document);
	}

	public void indexerC001(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001(SolrInputDocument document) throws Exception {
		super.indexerCours(document);

	}

	public void desindexerC001() throws Exception {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001(siteContexte.getRequeteSite_());
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
				o = obtenirC001(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001(String var) throws Exception {
		C001 oC001 = (C001)this;
		switch(var) {
			default:
				return super.obtenirCours(var);
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
				o = attribuerC001(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001(String var, Object val) {
		C001 oC001 = (C001)this;
		switch(var) {
			default:
				return super.attribuerCours(var, val);
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
					o = definirC001(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001(String var, String val) {
		switch(var) {
			default:
				return super.definirCours(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001();
		super.htmlBodyCours();
	}

	public void htmlBodyC001() {
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
		if(!(o instanceof C001))
			return false;
		C001 that = (C001)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001 {");
		sb.append(" }");
		return sb.toString();
	}
}
