package org.computate.frFR.site.page.parti;   

import org.computate.frFR.site.chaine.Chaine;
import org.computate.frFR.site.couverture.Couverture;
import org.computate.frFR.site.page.MiseEnPage;

public class Icone extends IconeGen<PagePart> {  

	protected void _type(Chaine o) {
	}
	protected void _nom(Chaine o) {
	}

	protected void _page_(Couverture<MiseEnPage> c) {}

	public void htmlBody() {
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

		@Override
		public void htmlBodyCourt() {
			// TODO Auto-generated method stub
			
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
