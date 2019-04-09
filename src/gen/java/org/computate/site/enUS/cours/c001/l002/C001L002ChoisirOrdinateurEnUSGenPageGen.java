package org.computate.site.enUS.cours.c001.l002;

import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateur;
import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.cours.c001.C001LeconEnUSPage;
import org.apache.commons.lang3.StringUtils;
import org.computate.site.enUS.cluster.Cluster;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateurEnUSGenPage&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L002ChoisirOrdinateurEnUSGenPageGen<DEV> extends C001LeconEnUSPage {

	///////////////////////////////
	// c001L002ChoisirOrdinateur //
	///////////////////////////////

	/**	L'entité « c001L002ChoisirOrdinateur »
	 *	 is defined as null before being initialized. 
	 */
	protected C001L002ChoisirOrdinateur c001L002ChoisirOrdinateur;
	public Couverture<C001L002ChoisirOrdinateur> c001L002ChoisirOrdinateurCouverture = new Couverture<C001L002ChoisirOrdinateur>().p(this).c(C001L002ChoisirOrdinateur.class).var("c001L002ChoisirOrdinateur").o(c001L002ChoisirOrdinateur);

	/**	<br/>L'entité « c001L002ChoisirOrdinateur »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l002.C001L002ChoisirOrdinateurEnUSGenPage&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:c001L002ChoisirOrdinateur">Trouver l'entité c001L002ChoisirOrdinateur dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _c001L002ChoisirOrdinateur(Couverture<C001L002ChoisirOrdinateur> c);

	public C001L002ChoisirOrdinateur getC001L002ChoisirOrdinateur() {
		return c001L002ChoisirOrdinateur;
	}

	public void setC001L002ChoisirOrdinateur(C001L002ChoisirOrdinateur c001L002ChoisirOrdinateur) {
		this.c001L002ChoisirOrdinateur = c001L002ChoisirOrdinateur;
		this.c001L002ChoisirOrdinateurCouverture.dejaInitialise = true;
	}
	protected C001L002ChoisirOrdinateurEnUSGenPage c001L002ChoisirOrdinateurInit() {
		if(!c001L002ChoisirOrdinateurCouverture.dejaInitialise) {
			_c001L002ChoisirOrdinateur(c001L002ChoisirOrdinateurCouverture);
			if(c001L002ChoisirOrdinateur == null)
				setC001L002ChoisirOrdinateur(c001L002ChoisirOrdinateurCouverture.o);
		}
		if(c001L002ChoisirOrdinateur != null)
			c001L002ChoisirOrdinateur.initLoinPourClasse(requeteSite_);
		c001L002ChoisirOrdinateurCouverture.dejaInitialise(true);
		return (C001L002ChoisirOrdinateurEnUSGenPage)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L002ChoisirOrdinateurEnUSGenPage = false;

	public C001L002ChoisirOrdinateurEnUSGenPage initLoinC001L002ChoisirOrdinateurEnUSGenPage(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L002ChoisirOrdinateurEnUSGenPage) {
			dejaInitialiseC001L002ChoisirOrdinateurEnUSGenPage = true;
			initLoinC001L002ChoisirOrdinateurEnUSGenPage();
		}
		return (C001L002ChoisirOrdinateurEnUSGenPage)this;
	}

	public void initLoinC001L002ChoisirOrdinateurEnUSGenPage() {
		super.initLoinC001LeconEnUSPage(requeteSite_);
		initC001L002ChoisirOrdinateurEnUSGenPage();
	}

	public void initC001L002ChoisirOrdinateurEnUSGenPage() {
		c001L002ChoisirOrdinateurInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L002ChoisirOrdinateurEnUSGenPage(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L002ChoisirOrdinateurEnUSGenPage(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001LeconEnUSPage(requeteSite_);
		c001L002ChoisirOrdinateur.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L002ChoisirOrdinateurEnUSGenPage(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L002ChoisirOrdinateurEnUSGenPage(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L002ChoisirOrdinateurEnUSGenPage(String var) throws Exception {
		C001L002ChoisirOrdinateurEnUSGenPage oC001L002ChoisirOrdinateurEnUSGenPage = (C001L002ChoisirOrdinateurEnUSGenPage)this;
		switch(var) {
			case "c001L002ChoisirOrdinateur":
				return oC001L002ChoisirOrdinateurEnUSGenPage.c001L002ChoisirOrdinateur;
			default:
				return super.obtenirC001LeconEnUSPage(var);
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
				o = attribuerC001L002ChoisirOrdinateurEnUSGenPage(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L002ChoisirOrdinateurEnUSGenPage(String var, Object val) {
		C001L002ChoisirOrdinateurEnUSGenPage oC001L002ChoisirOrdinateurEnUSGenPage = (C001L002ChoisirOrdinateurEnUSGenPage)this;
		switch(var) {
			default:
				return super.attribuerC001LeconEnUSPage(var, val);
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
					o = definirC001L002ChoisirOrdinateurEnUSGenPage(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L002ChoisirOrdinateurEnUSGenPage(String var, String val) {
		switch(var) {
			default:
				return super.definirC001LeconEnUSPage(var, val);
		}
	}

	/////////////////
	// htmlScripts //
	/////////////////

	public void htmlScripts() {
		htmlScriptsC001L002ChoisirOrdinateurEnUSGenPage();
	}

	public void htmlScriptsC001L002ChoisirOrdinateurEnUSGenPage() {
	}

	//////////////
	// htmlBody //
	//////////////

	public void htmlBody() {
		htmlBodyC001L002ChoisirOrdinateurEnUSGenPage();
	}

	public void htmlBodyC001L002ChoisirOrdinateurEnUSGenPage() {
		c001L002ChoisirOrdinateur.htmlBody();
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L002ChoisirOrdinateurEnUSGenPage();
	}

	public void htmlBodyCourtC001L002ChoisirOrdinateurEnUSGenPage() {
		c001L002ChoisirOrdinateur.htmlBodyCourt();
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
		if(!(o instanceof C001L002ChoisirOrdinateurEnUSGenPage))
			return false;
		C001L002ChoisirOrdinateurEnUSGenPage that = (C001L002ChoisirOrdinateurEnUSGenPage)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L002ChoisirOrdinateurEnUSGenPage {");
		sb.append(" }");
		return sb.toString();
	}
}
