package org.computate.frFR.site.page.parti; 

import org.computate.frFR.site.chaine.Chaine;

public class QuestionReponse extends QuestionReponseGen<PagePart> { 

	/**	Le texte de la question. 
	 * indexe: true
	 * stocke: true
	 **/
	protected void _question(Chaine o) {
	}
	protected void _questionCourt(Chaine o) {
	}
	public QuestionReponse questionIconeAvant(String type, String nom) {
		question.iconeAvant(page_, type, nom);
		questionCourt.iconeAvant(page_, type, nom);
		return this;
	}
	public QuestionReponse questionIconeApres(String type, String nom) {
		question.iconeApres(page_, type, nom);
		questionCourt.iconeApres(page_, type, nom);
		return this;
	}

	/**	Le texte de la réponse. 
	 * indexe: true
	 * stocke: true
	 **/
	protected void _reponse(Chaine o) {
	}
	protected void _reponseCourt(Chaine o) {
	}
	public QuestionReponse reponseIconeAvant(String type, String nom) {
		reponse.iconeAvant(page_, type, nom);
		reponseCourt.iconeAvant(page_, type, nom);
		return this;
	}
	public QuestionReponse reponseIconeApres(String type, String nom) {
		reponse.iconeApres(page_, type, nom);
		reponseCourt.iconeApres(page_, type, nom);
		return this;
	}
//
//	protected void _iconeQuestion(Chaine o) {
//	}
//
//	protected void _iconeReponse(Chaine o) {
//	}

	//////////
	// sh //
	//////////

	public void shAvant() {
	}
	public void shMilieu() {
	}
	public void shApres() {
	}
	public void sh() {
		shAvant();
		shMilieu();
		shApres();
	}

	//////////
	// shHtml //
	//////////

	public void shHtmlAvant() {
	}
	public void shHtmlMilieu() {
	}
	public void shHtmlApres() {
	}
	public void shHtml() {
		shHtmlAvant();
		shHtmlMilieu();
		shHtmlApres();
	}

	//////////
	// html //
	//////////

	public void htmlAvant() {
		page_.e("div").f();
			page_.e("div").f();
				page_.e("h3").a("class", "site-questionreponse-h3 ").f();
					for(Icone icone : question.getIconesAvant()) {
						icone.htmlBody();
					}
					page_.e("span").f().sx(question).g("span");
				page_.g("h3");
			page_.g("div");
			page_.e("h4").f();
				for(Icone icone : reponse.getIconesAvant()) {
					icone.htmlBody();
				}
				page_.e("span").f().sx(reponse).g("span");
			page_.g("h4");
		page_.g("div");
	}
	public void htmlMilieu() {
	}
	public void htmlApres() {
	}
	public void htmlBody() {
		htmlAvant();
		htmlMilieu();
		htmlApres();
	}

	///////////////
	// htmlBodyCourt //
	///////////////

	public void htmlBodyCourt() {
		page_.e("div").a("class", "w3-card ").f();
			page_.e("fieldset").a("class", "htmlBodyCourt-qa-fieldset ").f();
				page_.e("legend").a("class", "h3 htmlBodyCourt-qa-legend ").f();
					page_.e("div").a("class", "").f();
						for(Icone icone : question.getIconesAvant()) {
							icone.htmlBody();
						}
						page_.e("span").f().sx(questionCourt).g("span");
					page_.g("div");
				page_.g("legend");
				page_.e("h4").a("class", "htmlBodyCourt-qa-h4 ").f();
					for(Icone icone : reponse.getIconesAvant()) {
						icone.htmlBody();
					}
					page_.e("span").f().sx(reponseCourt).g("span");
				page_.g("h4");
			page_.g("fieldset");
		page_.g("div");
	}

	@Override public Chaine partiH3() {
		return question;
	}
	@Override public Chaine partiH3Court() {
		return questionCourt;
	}

	@Override public Chaine partiH4() {
		return reponse;
	}
	@Override public Chaine partiH4Court() {
		return reponseCourt;
	}

	//////////
	// code //
	//////////

	public void codeAvant() { 
	}
	public void codeMilieu() {
	}
	public void codeApres() {
	}
	public void code() {
		codeAvant();
		codeMilieu();
		codeApres();
	}
}
