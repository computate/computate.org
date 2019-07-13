package org.computate.site.frFR.page.parti;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import java.util.Objects;
import org.computate.site.frFR.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.computate.site.frFR.cluster.Cluster;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.computate.site.frFR.chaine.Chaine;
import org.apache.commons.text.StringEscapeUtils;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.parti.Cmd&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class CmdGen<DEV> extends QuestionReponse {

	/////////
	// cmd //
	/////////

	/**	L'entité « cmd »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine cmd = new Chaine();
	public Couverture<Chaine> cmdCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("cmd").o(cmd);

	/**	<br/>L'entité « cmd »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.page.parti.Cmd&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:cmd">Trouver l'entité cmd dans Solr</a>
	 * <br/>
	 * @param cmd est l'entité déjà construit. 
	 **/
	protected abstract void _cmd(Chaine o);

	public Chaine getCmd() {
		return cmd;
	}

	public void setCmd(Chaine cmd) {
		this.cmd = cmd;
		this.cmdCouverture.dejaInitialise = true;
	}
	public Cmd setCmd(String o) {
		cmd.s(o);
		this.cmdCouverture.dejaInitialise = true;
		return (Cmd)this;
	}
	protected Cmd cmdInit() {
		if(!cmdCouverture.dejaInitialise) {
			_cmd(cmd);
		}
		cmd.initLoinPourClasse(requeteSite_);
		cmdCouverture.dejaInitialise(true);
		return (Cmd)this;
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseCmd = false;

	public Cmd initLoinCmd(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseCmd) {
			dejaInitialiseCmd = true;
			initLoinCmd();
		}
		return (Cmd)this;
	}

	public void initLoinCmd() {
		super.initLoinQuestionReponse(requeteSite_);
		initCmd();
	}

	public void initCmd() {
		cmdInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinCmd(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteCmd(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteQuestionReponse(requeteSite_);
		if(cmd != null)
			cmd.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteCmd(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirCmd(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirCmd(String var) {
		Cmd oCmd = (Cmd)this;
		switch(var) {
			case "cmd":
				return oCmd.cmd;
			default:
				return super.obtenirQuestionReponse(var);
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
				o = attribuerCmd(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerCmd(String var, Object val) {
		Cmd oCmd = (Cmd)this;
		switch(var) {
			default:
				return super.attribuerQuestionReponse(var, val);
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
					o = definirCmd(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirCmd(String var, String val) {
		switch(var) {
			default:
				return super.definirQuestionReponse(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyCmd();
		super.htmlBody();
	}

	public void htmlBodyCmd() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtCmd();
		super.htmlBodyCourt();
	}

	public void htmlBodyCourtCmd() {
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
		if(!(o instanceof Cmd))
			return false;
		Cmd that = (Cmd)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("Cmd {");
		sb.append(" }");
		return sb.toString();
	}
}
