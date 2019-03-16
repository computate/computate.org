package org.computate.enUS.site.page.parti;

import org.computate.enUS.site.cluster.Cluster;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.page.parti.PagePart;
import org.computate.enUS.site.chaine.Chaine;
import org.computate.enUS.site.requete.RequeteSite;
import org.apache.commons.text.StringEscapeUtils;
import java.lang.String;
import org.apache.commons.lang3.StringUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class QuestionReponseGen<DEV> extends PagePart {

	//////////////
	// question //
	//////////////

	/**	L'entité « question »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine question = new Chaine();
	public Couverture<Chaine> questionCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("question").o(question);

	/**	<br/>L'entité « question »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:question">Trouver l'entité question dans Solr</a>
	 * <br/>
	 * @param question est l'entité déjà construit. 
	 **/
	protected abstract void _question(Chaine o);

	public Chaine getQuestion() {
		return question;
	}

	public void setQuestion(Chaine question) {
		this.question = question;
		this.questionCouverture.dejaInitialise = true;
	}
	public QuestionReponse setQuestion(String o) {
		question.s(o);
		this.questionCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse questionInit() {
		if(!questionCouverture.dejaInitialise) {
			_question(question);
		}
		question.initLoinPourClasse(requeteSite_);
		questionCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrQuestion() {
		return question == null ? null : question.toString();
	}

	public String strQuestion() {
		return question == null ? "" : question.toString();
	}

	public String nomAffichageQuestion() {
		return null;
	}

	public String htmTooltipQuestion() {
		return null;
	}

	public String htmQuestion() {
		return question == null ? "" : StringEscapeUtils.escapeHtml4(strQuestion());
	}

	///////////////////
	// questionCourt //
	///////////////////

	/**	L'entité « questionCourt »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine questionCourt = new Chaine();
	public Couverture<Chaine> questionCourtCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("questionCourt").o(questionCourt);

	/**	<br/>L'entité « questionCourt »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCourt">Trouver l'entité questionCourt dans Solr</a>
	 * <br/>
	 * @param questionCourt est l'entité déjà construit. 
	 **/
	protected abstract void _questionCourt(Chaine o);

	public Chaine getQuestionCourt() {
		return questionCourt;
	}

	public void setQuestionCourt(Chaine questionCourt) {
		this.questionCourt = questionCourt;
		this.questionCourtCouverture.dejaInitialise = true;
	}
	public QuestionReponse setQuestionCourt(String o) {
		questionCourt.s(o);
		this.questionCourtCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse questionCourtInit() {
		if(!questionCourtCouverture.dejaInitialise) {
			_questionCourt(questionCourt);
		}
		questionCourt.initLoinPourClasse(requeteSite_);
		questionCourtCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrQuestionCourt() {
		return questionCourt == null ? null : questionCourt.toString();
	}

	public String strQuestionCourt() {
		return questionCourt == null ? "" : questionCourt.toString();
	}

	public String nomAffichageQuestionCourt() {
		return null;
	}

	public String htmTooltipQuestionCourt() {
		return null;
	}

	public String htmQuestionCourt() {
		return questionCourt == null ? "" : StringEscapeUtils.escapeHtml4(strQuestionCourt());
	}

	/////////////
	// reponse //
	/////////////

	/**	L'entité « reponse »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine reponse = new Chaine();
	public Couverture<Chaine> reponseCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("reponse").o(reponse);

	/**	<br/>L'entité « reponse »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reponse">Trouver l'entité reponse dans Solr</a>
	 * <br/>
	 * @param reponse est l'entité déjà construit. 
	 **/
	protected abstract void _reponse(Chaine o);

	public Chaine getReponse() {
		return reponse;
	}

	public void setReponse(Chaine reponse) {
		this.reponse = reponse;
		this.reponseCouverture.dejaInitialise = true;
	}
	public QuestionReponse setReponse(String o) {
		reponse.s(o);
		this.reponseCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse reponseInit() {
		if(!reponseCouverture.dejaInitialise) {
			_reponse(reponse);
		}
		reponse.initLoinPourClasse(requeteSite_);
		reponseCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrReponse() {
		return reponse == null ? null : reponse.toString();
	}

	public String strReponse() {
		return reponse == null ? "" : reponse.toString();
	}

	public String nomAffichageReponse() {
		return null;
	}

	public String htmTooltipReponse() {
		return null;
	}

	public String htmReponse() {
		return reponse == null ? "" : StringEscapeUtils.escapeHtml4(strReponse());
	}

	//////////////////
	// reponseCourt //
	//////////////////

	/**	L'entité « reponseCourt »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 */
	protected Chaine reponseCourt = new Chaine();
	public Couverture<Chaine> reponseCourtCouverture = new Couverture<Chaine>().p(this).c(Chaine.class).var("reponseCourt").o(reponseCourt);

	/**	<br/>L'entité « reponseCourt »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut Chaine(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.enUS.site.page.parti.QuestionReponse&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:reponseCourt">Trouver l'entité reponseCourt dans Solr</a>
	 * <br/>
	 * @param reponseCourt est l'entité déjà construit. 
	 **/
	protected abstract void _reponseCourt(Chaine o);

	public Chaine getReponseCourt() {
		return reponseCourt;
	}

	public void setReponseCourt(Chaine reponseCourt) {
		this.reponseCourt = reponseCourt;
		this.reponseCourtCouverture.dejaInitialise = true;
	}
	public QuestionReponse setReponseCourt(String o) {
		reponseCourt.s(o);
		this.reponseCourtCouverture.dejaInitialise = true;
		return (QuestionReponse)this;
	}
	protected QuestionReponse reponseCourtInit() {
		if(!reponseCourtCouverture.dejaInitialise) {
			_reponseCourt(reponseCourt);
		}
		reponseCourt.initLoinPourClasse(requeteSite_);
		reponseCourtCouverture.dejaInitialise(true);
		return (QuestionReponse)this;
	}

	public String solrReponseCourt() {
		return reponseCourt == null ? null : reponseCourt.toString();
	}

	public String strReponseCourt() {
		return reponseCourt == null ? "" : reponseCourt.toString();
	}

	public String nomAffichageReponseCourt() {
		return null;
	}

	public String htmTooltipReponseCourt() {
		return null;
	}

	public String htmReponseCourt() {
		return reponseCourt == null ? "" : StringEscapeUtils.escapeHtml4(strReponseCourt());
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseQuestionReponse = false;

	public QuestionReponse initLoinQuestionReponse(RequeteSite requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseQuestionReponse) {
			dejaInitialiseQuestionReponse = true;
			initLoinQuestionReponse();
		}
		return (QuestionReponse)this;
	}

	public void initLoinQuestionReponse() {
		super.initLoinPagePart(requeteSite_);
		initQuestionReponse();
	}

	public void initQuestionReponse() {
		questionInit();
		questionCourtInit();
		reponseInit();
		reponseCourtInit();
	}

	@Override public void initLoinPourClasse(RequeteSite requeteSite_) {
		initLoinQuestionReponse(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteQuestionReponse(RequeteSite requeteSite_) {
			super.requeteSitePagePart(requeteSite_);
		question.setRequeteSite_(requeteSite_);
		questionCourt.setRequeteSite_(requeteSite_);
		reponse.setRequeteSite_(requeteSite_);
		reponseCourt.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSite requeteSite_) {
		requeteSiteQuestionReponse(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirQuestionReponse(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirQuestionReponse(String var) throws Exception {
		QuestionReponse oQuestionReponse = (QuestionReponse)this;
		switch(var) {
			case "question":
				return oQuestionReponse.question;
			case "questionCourt":
				return oQuestionReponse.questionCourt;
			case "reponse":
				return oQuestionReponse.reponse;
			case "reponseCourt":
				return oQuestionReponse.reponseCourt;
			default:
				return super.obtenirPagePart(var);
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
				o = attribuerQuestionReponse(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerQuestionReponse(String var, Object val) {
		QuestionReponse oQuestionReponse = (QuestionReponse)this;
		switch(var) {
			default:
				return super.attribuerPagePart(var, val);
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
					o = definirQuestionReponse(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirQuestionReponse(String var, String val) {
		switch(var) {
			default:
				return super.definirPagePart(var, val);
		}
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyQuestionReponse();
		super.htmlBodyPagePart();
	}

	public void htmlBodyQuestionReponse() {
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	@Override public void htmlBodyCourt() {
		htmlBodyCourtQuestionReponse();
		super.htmlBodyCourtPagePart();
	}

	public void htmlBodyCourtQuestionReponse() {
	}

	//////////////
	// hashCode //
	//////////////

	@Override public int hashCode() {
		return Objects.hash(super.hashCode(), question, questionCourt, reponse, reponseCourt);
	}

	////////////
	// equals //
	////////////

	@Override public boolean equals(Object o) {
		if(this == o)
			return true;
		if(!(o instanceof QuestionReponse))
			return false;
		QuestionReponse that = (QuestionReponse)o;
		return super.equals(o)
				&& Objects.equals( question, that.question )
				&& Objects.equals( questionCourt, that.questionCourt )
				&& Objects.equals( reponse, that.reponse )
				&& Objects.equals( reponseCourt, that.reponseCourt );
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("QuestionReponse {");
		sb.append( "question: " ).append(question);
		sb.append( ", questionCourt: " ).append(questionCourt);
		sb.append( ", reponse: " ).append(reponse);
		sb.append( ", reponseCourt: " ).append(reponseCourt);
		sb.append(" }");
		return sb.toString();
	}
}
