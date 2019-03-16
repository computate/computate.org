package org.computate.enUS.site.page.parti;

import org.computate.enUS.site.chaine.Chaine;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.page.MiseEnPage;

public class Icone extends IconeGen<PagePart> {

	protected void _type(Chaine o) {
	}

	protected void _nom(Chaine o) {
	}

	protected void _page_(Couverture<MiseEnPage> c) {}

	public void  htmlBody() {
	}

	@Override()
	public void  htmlBodyCourt() {
		// TODO Auto-generated method stub
		
	}

	public void  codeAvant() { 
	}

	public void  codeMilieu() {
	}

	public void  codeApres() {
	}

	public void  code() {
		codeAvant();
		codeMilieu();
		codeApres();
	}
}
