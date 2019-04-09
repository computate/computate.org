package org.computate.site.enUS.cours.c001.l002;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateurEnUSGenPage;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateurEnUSPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L002ChoisirOrdinateurEnUSPageGen<DEV> extends C001L002ChoisirOrdinateurEnUSGenPage {

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L002ChoisirOrdinateurEnUSPage = false;

	public C001L002ChoisirOrdinateurEnUSPage initLoinC001L002ChoisirOrdinateurEnUSPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L002ChoisirOrdinateurEnUSPage) {
			dejaInitialiseC001L002ChoisirOrdinateurEnUSPage = true;
			initLoinC001L002ChoisirOrdinateurEnUSPage();
		}
		return (C001L002ChoisirOrdinateurEnUSPage)this;
	}

	public void initLoinC001L002ChoisirOrdinateurEnUSPage() {
		super.initLoinC001L002ChoisirOrdinateurEnUSGenPage(requeteSite_);
		initC001L002ChoisirOrdinateurEnUSPage();
	}

	public void initC001L002ChoisirOrdinateurEnUSPage() {
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L002ChoisirOrdinateurEnUSPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L002ChoisirOrdinateurEnUSPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001L002ChoisirOrdinateurEnUSGenPage(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L002ChoisirOrdinateurEnUSPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L002ChoisirOrdinateurEnUSPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L002ChoisirOrdinateurEnUSPage(String var) throws Exception {
		C001L002ChoisirOrdinateurEnUSPage oC001L002ChoisirOrdinateurEnUSPage = (C001L002ChoisirOrdinateurEnUSPage)this;
		switch(var) {
			default:
				return super.obtenirC001L002ChoisirOrdinateurEnUSGenPage(var);
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
				o = attribuerC001L002ChoisirOrdinateurEnUSPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L002ChoisirOrdinateurEnUSPage(String var, Object val) {
		C001L002ChoisirOrdinateurEnUSPage oC001L002ChoisirOrdinateurEnUSPage = (C001L002ChoisirOrdinateurEnUSPage)this;
		switch(var) {
			default:
				return super.attribuerC001L002ChoisirOrdinateurEnUSGenPage(var, val);
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
					o = definirC001L002ChoisirOrdinateurEnUSPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L002ChoisirOrdinateurEnUSPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001L002ChoisirOrdinateurEnUSGenPage(var, val);
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
		if(!(o instanceof C001L002ChoisirOrdinateurEnUSPage))
			return false;
		C001L002ChoisirOrdinateurEnUSPage that = (C001L002ChoisirOrdinateurEnUSPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L002ChoisirOrdinateurEnUSPage {");
		sb.append(" }");
		return sb.toString();
	}
}
