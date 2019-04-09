package org.computate.site.enUS.cours;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.solr.common.SolrDocument;
import org.computate.site.enUS.cluster.Cluster;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.MiseEnPage;
import org.computate.site.enUS.page.parti.PagePart;

public class Cours extends CoursGen<Cluster> {

	@Override()
	protected void  _classeNomsCanoniques(List<String> l) {
		l.add(Cours.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.Cours.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	}

	protected void _documentSolr(Couverture<SolrDocument> c) {  
		c.o(requeteSite_.getDocumentSolr());
	}

	protected void _nomDomaine(Couverture<String> c) {
		c.o("example.com");
	}

	protected void _nomSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	protected void _nomHoteSite(Couverture<String> c) {
		c.o(nomDomaine);
	}

	protected void _nomEnsembleSite(Couverture<String> c) { 
		String[] partis = StringUtils.split(nomHoteSite, ".");
		ArrayUtils.reverse(partis);
		String o = StringUtils.join(partis, ".");
		c.o(o);
	}

	protected void _nomHoteOrdinateur(Couverture<String> c) {
		c.o("tower1." + nomDomaine);
	}

	protected void _cheminServeur(Couverture<String> c) {
		String o = new StringBuilder("/srv/").append(nomHoteOrdinateur).toString();
		c.o(o);
	}

	protected void _cheminProjet(Couverture<String> c) {
		String o = new StringBuilder(cheminServeur).append("/").append(nomDomaine).toString();
		c.o(o);
	}

	protected void _utilisateurNom(Couverture<String> c) {
		String[] partis = requeteSite_.getUtilisateurNom() == null ? new String[0] : requeteSite_.getUtilisateurNom().split("\\W");
		if(partis.length > 0) {
			String o = partis[0];
			c.o(o);
		}
		else {
			c.o("monutilisateur");
		}
	}

	protected void _groupeNom(Couverture<String> c) {
		c.o(utilisateurNom);
	}

	protected void _estCours(Couverture<Boolean> c) {
		c.o(true);
	}

	protected void _estLecon(Couverture<Boolean> c) {
		c.o(false);
	}

	protected void _coursNumero(Couverture<Integer> c) {
		Matcher m = Pattern.compile("^C(\\d+)", Pattern.MULTILINE).matcher(getClass().getSimpleName());
		if(m.find()) {
			Integer o = Integer.parseInt(m.group(1));
			c.o(o);
		}
	}

	protected void _leconNumero(Couverture<Integer> c) {
	}

	protected void _coursIdentifiantMinuscule(Couverture<String> c) {
		String s = "c" + String.format("%03d", coursNumero);
		c.o(s);
	}

	protected void _coursIdentifiantMajuscule(Couverture<String> c) {
		String s = StringUtils.capitalize(coursIdentifiantMinuscule);
		c.o(s);
	}

	protected void _coursCree(Couverture<LocalDateTime> c) {
	}

	protected void _coursIdentifiantUri(Couverture<String> o) {}

	protected void _coursH1_enUS(Couverture<String> c) {
	}

	protected void _coursH1_frFR(Couverture<String> c) {
	}

	protected void _coursH2_enUS(Couverture<String> c) {
	}

	protected void _coursH2_frFR(Couverture<String> c) {
	}

	protected void _coursDescription(Couverture<String> c) {
		if(estCours)
			c.o(coursH1_enUS + "\n" + coursH2_enUS);
		else if(estLecon)
			c.o(coursH1_enUS + "\n" + coursH2_enUS);
	}

	protected void _leconDescription(Couverture<String> c) {
		if(estLecon)
			c.o(coursH1_enUS + "\n" + coursH2_enUS);
	}

	protected void _pageUri_enUS(Couverture<String> c) {
	}

	protected void _pageUri_frFR(Couverture<String> c) {
	}

	protected void _pageUri(Couverture<String> c) {
		c.o(pageUri_enUS);
	}

	protected void _pageCree(Couverture<LocalDateTime> c) {
		c.o(coursCree);
	}

	protected void _pageH1(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H1")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	protected void _pageH2(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_H2")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	protected void _pageH3(Couverture<String> c) { 
		if(pageCree != null)
			c.o("Created: " + pageCree.format(MiseEnPage.FORMATAffichage));
	}

	protected void _pageTitre(Couverture<String> c) {
		Class<?> clazz = getClass();
		try {
			c.o((String)Optional.ofNullable(clazz.getField(clazz.getSimpleName() + "_Title")).map(o -> {
					try {
						return o.get(this);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						return null;
					}
				}).orElse(null));
		} catch (NoSuchFieldException | SecurityException e) {
			// ignore
		}
	}

	protected void _pageRecherche_enUS(List<String> l) {
	}

	protected void _pageRecherche_frFR(List<String> l) {
	}

	public void  htmlBody() {
		super.htmlBody();
	}

	@Override()
	protected void  _id(Couverture<String> c) {
		c.o(getClass().getCanonicalName());
	}

	protected void _pageParts(List<PagePart> l) {
	}

	public void  avantPagePart(PagePart o, String var) {
	}
}
