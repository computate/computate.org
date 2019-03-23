package org.computate.site.enUS.couverture;

import java.io.Serializable;
import java.util.ArrayList;

public class Couverture<DEV> implements Serializable {

	private static final long serialVersionUID = 4171725370071929571L;

	public String var;

	public Couverture<DEV> var(String o) {
		var = o;
		return this;
	}

	public DEV o;

	public Couverture<DEV> o(DEV o) {
		this.o = o;
		return this;
	}

	public Class<?> c;

	public Couverture<DEV> c(Class<?> o) {
		c = o;
		return this;
	}

	public Object p;

	public Couverture<DEV> p(Object o) {
		p = o;
		return this;
	}

	public Class<?> cEnfant;

	public Couverture<DEV> cEnfant(Class<?> o) {
		cEnfant = o;
		return this;
	}

	public Boolean dejaInitialise = false;

	public Couverture<DEV> dejaInitialise(Boolean o) {
		dejaInitialise = o;
		return this;
	}

	public Object requeteSiteObjet;

	public Couverture<DEV> requeteSiteObjet(Object o) {
		requeteSiteObjet = o;
		return this;
	}

	public ArrayList<String> pageVars = new ArrayList<String>();

	public void  pageVarsAjouter(String...pageVars) {
		for(String pageVar : pageVars)
			this.pageVars.add(pageVar);
	}
}
