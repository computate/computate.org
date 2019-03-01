package org.computate.frFR.site.page.parti; 

import org.computate.frFR.site.chaine.Chaine;

public class PageHtml extends PageHtmlGen<PagePart> { 

	public PageHtml() {
	}

	//////////
	// sh //
	//////////

	public void sh() {
		shAvant();
		shMilieu();
		shApres();
	}
	public void shAvant() {
	}
	public void shMilieu() {
	}
	public void shApres() {
	}

	//////////
	// shHtml //
	//////////

	public void shHtml() {
		shHtmlAvant();
		shHtmlMilieu();
		shHtmlApres();
	}
	public void shHtmlAvant() {
	}
	public void shHtmlMilieu() {
	}
	public void shHtmlApres() {
	}

	//////////
	// html //
	//////////

	public void htmlBody() {
	}

	///////////////
	// htmlBodyCourt //
	///////////////

	public void htmlBodyCourt() {
	}

		@Override public Chaine partiH3() {
			return null;
		}
		@Override public Chaine partiH3Court() {
			return null;
		}

		@Override public Chaine partiH4() {
			return null;
		}
		@Override public Chaine partiH4Court() {
			return null;
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
