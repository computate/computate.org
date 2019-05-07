package org.computate.site.frFR.cours.c001.l005;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.frFR.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.frFR.page.parti.PagePart;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.frFR.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true">Trouver la classe recapituler3 dans Solr</a>
 * <br/>
 **/
public abstract class C001L005InstallerMavenGen<DEV> extends C001Lecon {

	public static final String C001L005InstallerMaven_UnNom = "le leçon";
	public static final String C001L005InstallerMaven_NomSingulier = "leçon";
	public static final String C001L005InstallerMaven_NomPluriel = "leçons";
	public static final String C001L005InstallerMaven_H1 = "Comment installer la dernière version de maven ?";
	public static final String C001L005InstallerMaven_H2 = "Installer maven à partir du code source. ";
	public static final String C001L005InstallerMaven_LesNoms = "les leçons";
	public static final String C001L005InstallerMaven_NomVar = "leçon";
	public static final String C001L005InstallerMaven_Couleur = "green";
	public static final String C001L005InstallerMaven_IconeGroupe = "regular";
	public static final String C001L005InstallerMaven_IconeNom = "question";
	public static final String C001L005InstallerMavenFrFRPage_Uri = "/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven";
	public static final String C001L005InstallerMavenFrFRPage_ImageUri = "/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png";
	public static final String C001L005InstallerMavenEnUSPage_Uri = "/enUS/course/001/004-how-to-install-the-latest-version-of-maven";
	public static final String C001L005InstallerMavenEnUSPage_ImageUri = "/png/enUS/course/001/004-how-to-install-the-latest-version-of-maven-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "La plupart des entreprises utilisent aujourd'hui Java pour créer leurs applications et microservices, y compris les gouvernements, les banques, la comptabilité et les entreprises. ";
	public static final String moiP3 = "La création d’applications Java commence par l’installation de Maven. ";
	public static final String moiP4 = "Je vous aiderai à installer la version la plus récente de Maven pour développer votre site Web de manière open source. ";
	public static final String moiP = moiP1 + moiP2 + moiP3 + moiP4;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
	 * <br/>
	 * @param moi est l'entité déjà construit. 
	 **/
	protected abstract void _moi(PageHtml o);

	public PageHtml getMoi() {
		return moi;
	}

	public void setMoi(PageHtml moi) {
		this.moi = moi;
		this.moiCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven moiInit() {
		if(moi != null) {
			((C001L005InstallerMaven)this).avantPagePart(moi, "moi");
			((C001L005InstallerMaven)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
			sx(moiP4);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	/////////////////////////
	// questionDependences //
	/////////////////////////

	public static final String questionDependencesH3I1 = "far fa-truck-container";
	public static final String questionDependencesH3I = questionDependencesH3I1;
	public static final String questionDependencesH3Span1 = "Comment installer les dépendences pour Maven ? ";
	public static final String questionDependencesH3Span = questionDependencesH3Span1;
	public static final String questionDependencesH4I1 = "far fa-tools";
	public static final String questionDependencesH4I = questionDependencesH4I1;
	public static final String questionDependencesH4Span1 = "Construisez les dépendances avec yum. ";
	public static final String questionDependencesH4Span = questionDependencesH4Span1;
	public static final String questionDependencesPreSpan11 = "sudo";
	public static final String questionDependencesPreSpan1 = questionDependencesPreSpan11;
	public static final String questionDependencesPreSpan21 = " yum-builddep";
	public static final String questionDependencesPreSpan2 = questionDependencesPreSpan21;
	public static final String questionDependencesPreSpan31 = " -y";
	public static final String questionDependencesPreSpan3 = questionDependencesPreSpan31;
	public static final String questionDependencesPreSpan41 = " maven";
	public static final String questionDependencesPreSpan4 = questionDependencesPreSpan41;
	public static final String questionDependencesOl2Li11 = "sudo: La commande pour installer des dépots yum commence par la commande sudo. ";
	public static final String questionDependencesOl2Li12 = "La commande \"sudo\" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. ";
	public static final String questionDependencesOl2Li13 = "L'installation des dépots yum nécessite toujours les privilèges root. ";
	public static final String questionDependencesOl2Li1 = questionDependencesOl2Li11 + questionDependencesOl2Li12 + questionDependencesOl2Li13;
	public static final String questionDependencesOl2Li21 = "yum Signifie \"Yellowdog Updater Modified\", mais personne ne le connait comme yellowdog, juste yum. ";
	public static final String questionDependencesOl2Li22 = "yum-builddep installe les dépendances manquantes pour la construction d'un paquet RPM. ";
	public static final String questionDependencesOl2Li2 = questionDependencesOl2Li21 + questionDependencesOl2Li22;
	public static final String questionDependencesOl2Li31 = "-y: Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. ";
	public static final String questionDependencesOl2Li3 = questionDependencesOl2Li31;
	public static final String questionDependencesOl2Li41 = "maven: Le nom du paquet pour lequel vous vous souhaitez installer les dépendences. ";
	public static final String questionDependencesOl2Li4 = questionDependencesOl2Li41;

	/**	L'entité « questionDependences »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDependences = new PageHtml();
	public Couverture<PageHtml> questionDependencesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDependences").o(questionDependences);

	/**	<br/>L'entité « questionDependences »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
	 * <br/>
	 * @param questionDependences est l'entité déjà construit. 
	 **/
	protected abstract void _questionDependences(PageHtml o);

	public PageHtml getQuestionDependences() {
		return questionDependences;
	}

	public void setQuestionDependences(PageHtml questionDependences) {
		this.questionDependences = questionDependences;
		this.questionDependencesCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionDependencesInit() {
		if(questionDependences != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionDependences, "questionDependences");
			((C001L005InstallerMaven)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionDependences(PageHtml o) {
		{ e("h3").a("class", " questionDependencesH3 ").f();
			{ e("i").a("class", questionDependencesH3I1, " site-menu-icon questionDependencesH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDependencesH3Span ").f();
				sx(questionDependencesH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDependencesH4 ").f();
			{ e("i").a("class", questionDependencesH4I1, " site-menu-icon questionDependencesH4I ").f();
			} g("i");
			{ e("span").a("class", " questionDependencesH4Span ").f();
				sx(questionDependencesH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionDependencesPre ").f();
			{ e("span").a("class", " questionDependencesPreSpan1 questionDependencesPreSpan odd ").f();
				sx(questionDependencesPreSpan11);
			} g("span");
			{ e("span").a("class", " questionDependencesPreSpan2 questionDependencesPreSpan even ").f();
				sx(questionDependencesPreSpan21);
			} g("span");
			{ e("span").a("class", " questionDependencesPreSpan3 questionDependencesPreSpan odd ").f();
				sx(questionDependencesPreSpan31);
			} g("span");
			{ e("span").a("class", " questionDependencesPreSpan4 questionDependencesPreSpan even ").f();
				sx(questionDependencesPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDependencesOl2 questionDependencesOl even ").f();
			{ e("li").a("class", " questionDependencesOl2Li1 questionDependencesOl2Li odd ").f();
				sx(questionDependencesOl2Li11);
				sx(questionDependencesOl2Li12);
				sx(questionDependencesOl2Li13);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li2 questionDependencesOl2Li even ").f();
				sx(questionDependencesOl2Li21);
				sx(questionDependencesOl2Li22);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li3 questionDependencesOl2Li odd ").f();
				sx(questionDependencesOl2Li31);
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li4 questionDependencesOl2Li even ").f();
				sx(questionDependencesOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionDependences() {
		questionDependences.htmlAvant();
		htmlBodyQuestionDependences(questionDependences);
		questionDependences.htmlApres();
	}

	/////////////////////////////
	// questionInstallerAncien //
	/////////////////////////////

	public static final String questionInstallerAncienH3I1 = "far fa-truck-container";
	public static final String questionInstallerAncienH3I = questionInstallerAncienH3I1;
	public static final String questionInstallerAncienH3Span1 = "Comment installer les dépendences pour Maven ? ";
	public static final String questionInstallerAncienH3Span = questionInstallerAncienH3Span1;
	public static final String questionInstallerAncienH4I1 = "far fa-tools";
	public static final String questionInstallerAncienH4I = questionInstallerAncienH4I1;
	public static final String questionInstallerAncienH4Span1 = "Construisez les dépendances avec yum. ";
	public static final String questionInstallerAncienH4Span = questionInstallerAncienH4Span1;
	public static final String questionInstallerAncienPreSpan11 = "sudo";
	public static final String questionInstallerAncienPreSpan1 = questionInstallerAncienPreSpan11;
	public static final String questionInstallerAncienPreSpan21 = " yum-builddep";
	public static final String questionInstallerAncienPreSpan2 = questionInstallerAncienPreSpan21;
	public static final String questionInstallerAncienPreSpan31 = " -y";
	public static final String questionInstallerAncienPreSpan3 = questionInstallerAncienPreSpan31;
	public static final String questionInstallerAncienPreSpan41 = " maven";
	public static final String questionInstallerAncienPreSpan4 = questionInstallerAncienPreSpan41;
	public static final String questionInstallerAncienOl2Li11 = "sudo";
	public static final String questionInstallerAncienOl2Li1 = questionInstallerAncienOl2Li11;
	public static final String questionInstallerAncienOl2Li21 = "yum";
	public static final String questionInstallerAncienOl2Li2 = questionInstallerAncienOl2Li21;
	public static final String questionInstallerAncienOl2Li31 = "install : Pour installer des nouveaux paquets yum. ";
	public static final String questionInstallerAncienOl2Li3 = questionInstallerAncienOl2Li31;
	public static final String questionInstallerAncienOl2Li41 = "-y";
	public static final String questionInstallerAncienOl2Li4 = questionInstallerAncienOl2Li41;
	public static final String questionInstallerAncienOl2Li51 = "pv: Le nom du paquet que vous souhaitez installer. ";
	public static final String questionInstallerAncienOl2Li5 = questionInstallerAncienOl2Li51;

	/**	L'entité « questionInstallerAncien »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionInstallerAncien = new PageHtml();
	public Couverture<PageHtml> questionInstallerAncienCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionInstallerAncien").o(questionInstallerAncien);

	/**	<br/>L'entité « questionInstallerAncien »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionInstallerAncien">Trouver l'entité questionInstallerAncien dans Solr</a>
	 * <br/>
	 * @param questionInstallerAncien est l'entité déjà construit. 
	 **/
	protected abstract void _questionInstallerAncien(PageHtml o);

	public PageHtml getQuestionInstallerAncien() {
		return questionInstallerAncien;
	}

	public void setQuestionInstallerAncien(PageHtml questionInstallerAncien) {
		this.questionInstallerAncien = questionInstallerAncien;
		this.questionInstallerAncienCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionInstallerAncienInit() {
		if(questionInstallerAncien != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionInstallerAncien, "questionInstallerAncien");
			((C001L005InstallerMaven)this).avantPagePart(questionInstallerAncien, "questionInstallerAncien");
		}
		if(!questionInstallerAncienCouverture.dejaInitialise) {
			_questionInstallerAncien(questionInstallerAncien);
		}
		questionInstallerAncien.initLoinPourClasse(requeteSite_);
		questionInstallerAncienCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionInstallerAncien(PageHtml o) {
		{ e("h3").a("class", " questionInstallerAncienH3 ").f();
			{ e("i").a("class", questionInstallerAncienH3I1, " site-menu-icon questionInstallerAncienH3I ").f();
			} g("i");
			{ e("span").a("class", " questionInstallerAncienH3Span ").f();
				sx(questionInstallerAncienH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionInstallerAncienH4 ").f();
			{ e("i").a("class", questionInstallerAncienH4I1, " site-menu-icon questionInstallerAncienH4I ").f();
			} g("i");
			{ e("span").a("class", " questionInstallerAncienH4Span ").f();
				sx(questionInstallerAncienH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionInstallerAncienPre ").f();
			{ e("span").a("class", " questionInstallerAncienPreSpan1 questionInstallerAncienPreSpan odd ").f();
				sx(questionInstallerAncienPreSpan11);
			} g("span");
			{ e("span").a("class", " questionInstallerAncienPreSpan2 questionInstallerAncienPreSpan even ").f();
				sx(questionInstallerAncienPreSpan21);
			} g("span");
			{ e("span").a("class", " questionInstallerAncienPreSpan3 questionInstallerAncienPreSpan odd ").f();
				sx(questionInstallerAncienPreSpan31);
			} g("span");
			{ e("span").a("class", " questionInstallerAncienPreSpan4 questionInstallerAncienPreSpan even ").f();
				sx(questionInstallerAncienPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionInstallerAncienOl2 questionInstallerAncienOl even ").f();
			{ e("li").a("class", " questionInstallerAncienOl2Li1 questionInstallerAncienOl2Li odd ").f();
				sx(questionInstallerAncienOl2Li11);
			} g("li");
			{ e("li").a("class", " questionInstallerAncienOl2Li2 questionInstallerAncienOl2Li even ").f();
				sx(questionInstallerAncienOl2Li21);
			} g("li");
			{ e("li").a("class", " questionInstallerAncienOl2Li3 questionInstallerAncienOl2Li odd ").f();
				sx(questionInstallerAncienOl2Li31);
			} g("li");
			{ e("li").a("class", " questionInstallerAncienOl2Li4 questionInstallerAncienOl2Li even ").f();
				sx(questionInstallerAncienOl2Li41);
			} g("li");
			{ e("li").a("class", " questionInstallerAncienOl2Li5 questionInstallerAncienOl2Li odd ").f();
				sx(questionInstallerAncienOl2Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionInstallerAncien() {
		questionInstallerAncien.htmlAvant();
		htmlBodyQuestionInstallerAncien(questionInstallerAncien);
		questionInstallerAncien.htmlApres();
	}

	//////////////////////
	// questionMkdirSrc //
	//////////////////////

	public static final String questionMkdirSrcH3I1 = "far fa-truck-container";
	public static final String questionMkdirSrcH3I = questionMkdirSrcH3I1;
	public static final String questionMkdirSrcH3Span1 = "Où est-ce que je place le code source Maven ? ";
	public static final String questionMkdirSrcH3Span = questionMkdirSrcH3Span1;
	public static final String questionMkdirSrcH4I1 = "far fa-tools";
	public static final String questionMkdirSrcH4I = questionMkdirSrcH4I1;
	public static final String questionMkdirSrcH4Span1 = "Créez un répertoire maven dans /usr/local/src. ";
	public static final String questionMkdirSrcH4Span = questionMkdirSrcH4Span1;
	public static final String questionMkdirSrcPreSpan11 = "sudo";
	public static final String questionMkdirSrcPreSpan1 = questionMkdirSrcPreSpan11;
	public static final String questionMkdirSrcPreSpan21 = " mkdir";
	public static final String questionMkdirSrcPreSpan2 = questionMkdirSrcPreSpan21;
	public static final String questionMkdirSrcPreSpan41 = " /usr/local/src/maven";
	public static final String questionMkdirSrcPreSpan4 = questionMkdirSrcPreSpan41;
	public static final String questionMkdirSrcOl2Li11 = "sudo";
	public static final String questionMkdirSrcOl2Li1 = questionMkdirSrcOl2Li11;
	public static final String questionMkdirSrcOl2Li21 = "mkdir";
	public static final String questionMkdirSrcOl2Li2 = questionMkdirSrcOl2Li21;
	public static final String questionMkdirSrcOl2Li31 = "/usr/local est un endroit pour des logiciels supplémentaires que vous installez sans le gestionnaire de paquets. ";
	public static final String questionMkdirSrcOl2Li32 = "/usr/local/src est un bon endroit pour cloner vos référentiels de logiciels open source. ";
	public static final String questionMkdirSrcOl2Li3 = questionMkdirSrcOl2Li31 + questionMkdirSrcOl2Li32;

	/**	L'entité « questionMkdirSrc »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirSrc = new PageHtml();
	public Couverture<PageHtml> questionMkdirSrcCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirSrc").o(questionMkdirSrc);

	/**	<br/>L'entité « questionMkdirSrc »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMkdirSrc">Trouver l'entité questionMkdirSrc dans Solr</a>
	 * <br/>
	 * @param questionMkdirSrc est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirSrc(PageHtml o);

	public PageHtml getQuestionMkdirSrc() {
		return questionMkdirSrc;
	}

	public void setQuestionMkdirSrc(PageHtml questionMkdirSrc) {
		this.questionMkdirSrc = questionMkdirSrc;
		this.questionMkdirSrcCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionMkdirSrcInit() {
		if(questionMkdirSrc != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
		}
		if(!questionMkdirSrcCouverture.dejaInitialise) {
			_questionMkdirSrc(questionMkdirSrc);
		}
		questionMkdirSrc.initLoinPourClasse(requeteSite_);
		questionMkdirSrcCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionMkdirSrc(PageHtml o) {
		{ e("h3").a("class", " questionMkdirSrcH3 ").f();
			{ e("i").a("class", questionMkdirSrcH3I1, " site-menu-icon questionMkdirSrcH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrcH3Span ").f();
				sx(questionMkdirSrcH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirSrcH4 ").f();
			{ e("i").a("class", questionMkdirSrcH4I1, " site-menu-icon questionMkdirSrcH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrcH4Span ").f();
				sx(questionMkdirSrcH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirSrcPre ").f();
			{ e("span").a("class", " questionMkdirSrcPreSpan1 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan2 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan4 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirSrcOl2 questionMkdirSrcOl even ").f();
			{ e("li").a("class", " questionMkdirSrcOl2Li1 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li2 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li3 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li31);
				sx(questionMkdirSrcOl2Li32);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirSrc() {
		questionMkdirSrc.htmlAvant();
		htmlBodyQuestionMkdirSrc(questionMkdirSrc);
		questionMkdirSrc.htmlApres();
	}

	////////////////////////
	// questionMkdirMaven //
	////////////////////////

	public static final String questionMkdirMavenH3I1 = "far fa-truck-container";
	public static final String questionMkdirMavenH3I = questionMkdirMavenH3I1;
	public static final String questionMkdirMavenH3Span1 = "Où puis-je installer Maven ? ";
	public static final String questionMkdirMavenH3Span = questionMkdirMavenH3Span1;
	public static final String questionMkdirMavenH4I1 = "far fa-tools";
	public static final String questionMkdirMavenH4I = questionMkdirMavenH4I1;
	public static final String questionMkdirMavenH4Span1 = "Construisez les dépendances avec yum. ";
	public static final String questionMkdirMavenH4Span = questionMkdirMavenH4Span1;
	public static final String questionMkdirMavenPreSpan11 = "sudo";
	public static final String questionMkdirMavenPreSpan1 = questionMkdirMavenPreSpan11;
	public static final String questionMkdirMavenPreSpan21 = " yum-builddep";
	public static final String questionMkdirMavenPreSpan2 = questionMkdirMavenPreSpan21;
	public static final String questionMkdirMavenPreSpan31 = " -y";
	public static final String questionMkdirMavenPreSpan3 = questionMkdirMavenPreSpan31;
	public static final String questionMkdirMavenPreSpan41 = " maven";
	public static final String questionMkdirMavenPreSpan4 = questionMkdirMavenPreSpan41;
	public static final String questionMkdirMavenOl2Li11 = "sudo: La commande pour installer des dépots yum commence par la commande sudo. ";
	public static final String questionMkdirMavenOl2Li12 = "La commande \"sudo\" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. ";
	public static final String questionMkdirMavenOl2Li13 = "L'installation des dépots yum nécessite toujours les privilèges root. ";
	public static final String questionMkdirMavenOl2Li14 = "sudo";
	public static final String questionMkdirMavenOl2Li1 = questionMkdirMavenOl2Li11 + questionMkdirMavenOl2Li12 + questionMkdirMavenOl2Li13 + questionMkdirMavenOl2Li14;
	public static final String questionMkdirMavenOl2Li21 = "yum";
	public static final String questionMkdirMavenOl2Li2 = questionMkdirMavenOl2Li21;
	public static final String questionMkdirMavenOl2Li31 = "install : Pour installer des nouveaux paquets yum. ";
	public static final String questionMkdirMavenOl2Li3 = questionMkdirMavenOl2Li31;
	public static final String questionMkdirMavenOl2Li41 = "-y";
	public static final String questionMkdirMavenOl2Li4 = questionMkdirMavenOl2Li41;
	public static final String questionMkdirMavenOl2Li51 = "pv: Le nom du paquet que vous souhaitez installer. ";
	public static final String questionMkdirMavenOl2Li5 = questionMkdirMavenOl2Li51;

	/**	L'entité « questionMkdirMaven »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirMaven = new PageHtml();
	public Couverture<PageHtml> questionMkdirMavenCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirMaven").o(questionMkdirMaven);

	/**	<br/>L'entité « questionMkdirMaven »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMkdirMaven">Trouver l'entité questionMkdirMaven dans Solr</a>
	 * <br/>
	 * @param questionMkdirMaven est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirMaven(PageHtml o);

	public PageHtml getQuestionMkdirMaven() {
		return questionMkdirMaven;
	}

	public void setQuestionMkdirMaven(PageHtml questionMkdirMaven) {
		this.questionMkdirMaven = questionMkdirMaven;
		this.questionMkdirMavenCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionMkdirMavenInit() {
		if(questionMkdirMaven != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirMaven, "questionMkdirMaven");
			((C001L005InstallerMaven)this).avantPagePart(questionMkdirMaven, "questionMkdirMaven");
		}
		if(!questionMkdirMavenCouverture.dejaInitialise) {
			_questionMkdirMaven(questionMkdirMaven);
		}
		questionMkdirMaven.initLoinPourClasse(requeteSite_);
		questionMkdirMavenCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionMkdirMaven(PageHtml o) {
		{ e("h3").a("class", " questionMkdirMavenH3 ").f();
			{ e("i").a("class", questionMkdirMavenH3I1, " site-menu-icon questionMkdirMavenH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirMavenH3Span ").f();
				sx(questionMkdirMavenH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirMavenH4 ").f();
			{ e("i").a("class", questionMkdirMavenH4I1, " site-menu-icon questionMkdirMavenH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirMavenH4Span ").f();
				sx(questionMkdirMavenH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirMavenPre ").f();
			{ e("span").a("class", " questionMkdirMavenPreSpan1 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan2 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan3 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan4 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirMavenOl2 questionMkdirMavenOl even ").f();
			{ e("li").a("class", " questionMkdirMavenOl2Li1 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li11);
				sx(questionMkdirMavenOl2Li12);
				sx(questionMkdirMavenOl2Li13);
				sx(questionMkdirMavenOl2Li14);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li2 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li3 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li4 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li5 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirMaven() {
		questionMkdirMaven.htmlAvant();
		htmlBodyQuestionMkdirMaven(questionMkdirMaven);
		questionMkdirMaven.htmlApres();
	}

	//////////////////
	// recapituler1 //
	//////////////////

	public static final String recapituler1H31 = "À récapituler : ";
	public static final String recapituler1H3 = recapituler1H31;

	/**	L'entité « recapituler1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler1 = new PageHtml();
	public Couverture<PageHtml> recapituler1Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler1").o(recapituler1);

	/**	<br/>L'entité « recapituler1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
	 * <br/>
	 * @param recapituler1 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler1(PageHtml o);

	public PageHtml getRecapituler1() {
		return recapituler1;
	}

	public void setRecapituler1(PageHtml recapituler1) {
		this.recapituler1 = recapituler1;
		this.recapituler1Couverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven recapituler1Init() {
		if(recapituler1 != null) {
			((C001L005InstallerMaven)this).avantPagePart(recapituler1, "recapituler1");
			((C001L005InstallerMaven)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyRecapituler1(PageHtml o) {
		{ e("h3").a("class", " recapituler1H3 ").f();
			sx(recapituler1H31);
		} g("h3");
	}
	public void htmlBodyRecapituler1() {
		recapituler1.htmlAvant();
		htmlBodyRecapituler1(recapituler1);
		recapituler1.htmlApres();
	}

	//////////////////
	// recapituler2 //
	//////////////////

	public static final String recapituler2TableTr1Td11 = "Mardi ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "fab fa-linux";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-network-wired";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "30 Avril 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "Comment installer le système d'exploitation pour développer mon site Web ? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Chaque étape pour installer le système d'exploitation CentOS 7. ";
	public static final String recapituler2TableTr2Td3 = recapituler2TableTr2Td31;
	public static final String recapituler2TableTr2Td41 = "Par Christophe Tate";
	public static final String recapituler2TableTr2Td4 = recapituler2TableTr2Td41;

	/**	L'entité « recapituler2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler2 = new PageHtml();
	public Couverture<PageHtml> recapituler2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler2").o(recapituler2);

	/**	<br/>L'entité « recapituler2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
	 * <br/>
	 * @param recapituler2 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler2(PageHtml o);

	public PageHtml getRecapituler2() {
		return recapituler2;
	}

	public void setRecapituler2(PageHtml recapituler2) {
		this.recapituler2 = recapituler2;
		this.recapituler2Couverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven recapituler2Init() {
		if(recapituler2 != null) {
			((C001L005InstallerMaven)this).avantPagePart(recapituler2, "recapituler2");
			((C001L005InstallerMaven)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyRecapituler2(PageHtml o) {
		{ e("table").a("class", " recapituler2Table ").f();
			{ e("tr").a("class", " recapituler2TableTr1 recapituler2TableTr odd ").f();
				{ e("td").a("class", " recapituler2TableTr1Td1 recapituler2TableTr1Td odd ").f();
					sx(recapituler2TableTr1Td11);
				} g("td");
				{ e("td").a("class", " recapituler2TableTr1Td2 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td2I1, " site-menu-icon recapituler2TableTr1Td2I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler2TableTr1Td3 recapituler2TableTr1Td odd ").f();
					{ e("i").a("class", recapituler2TableTr1Td3I1, " site-menu-icon recapituler2TableTr1Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler2TableTr1Td4 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td4I1, " site-menu-icon recapituler2TableTr1Td4I ").f();
					} g("i");
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler2TableTr2 recapituler2TableTr even ").f();
				{ e("td").a("class", " recapituler2TableTr2Td1 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td11);
				} g("td");
				{ e("td").a("class", " recapituler2TableTr2Td2 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td21);
				} g("td");
				{ e("td").a("class", " recapituler2TableTr2Td3 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td31);
				} g("td");
				{ e("td").a("class", " recapituler2TableTr2Td4 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler2() {
		recapituler2.htmlAvant();
		htmlBodyRecapituler2(recapituler2);
		recapituler2.htmlApres();
	}

	//////////////////
	// recapituler3 //
	//////////////////

	public static final String recapituler3TableTr01Td1I1 = "far fa-question";
	public static final String recapituler3TableTr01Td1I = recapituler3TableTr01Td1I1;
	public static final String recapituler3TableTr01Td21 = "Questions";
	public static final String recapituler3TableTr01Td2 = recapituler3TableTr01Td21;
	public static final String recapituler3TableTr01Td3I1 = "far fa-bullhorn";
	public static final String recapituler3TableTr01Td3I = recapituler3TableTr01Td3I1;
	public static final String recapituler3TableTr01Td41 = "Reponses";
	public static final String recapituler3TableTr01Td4 = recapituler3TableTr01Td41;
	public static final String recapituler3TableTr02Td1I1 = "far fa-person-carry";
	public static final String recapituler3TableTr02Td1I = recapituler3TableTr02Td1I1;
	public static final String recapituler3TableTr02Td21 = "Comment télecharger CentOS 7 ? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cloud-download-alt";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Télécharger un fichier ISO. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "fab fa-usb";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Comment puis-je créer une clé USB avec CentOS 7 ? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-compact-disc";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Utilizez la commande dd. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-play-circle";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Lorsque je redémarre avec la clé USB, quel mode de démarrage choisir? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "fab fa-windows";
	public static final String recapituler3TableTr04Td3Span1I2 = "fab fa-centos";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1 + recapituler3TableTr04Td3Span1I2;
	public static final String recapituler3TableTr04Td41 = "Évitez de démarrer en mode de démarrage UEFI. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "fas fa-flag-alt";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "Quelle langue j'utilise pendant le processus d'installation? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "far fa-language";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Choisissez la langue avec laquelle vous êtes à l'aise. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "fas fa-clock";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "Comment configurer la date et l'heure d'une installation de CentOS 7 ? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "fas fa-city";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Choisissez la grande ville près de chez vous. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "fas fa-network-wired";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "Comment configurer le réseau et le nom d'hôte ? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "fas fa-ethernet";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Choisissez un nom unique sur votre réseau et branchez votre câble Ethernet. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "fas fa-save";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "Que dois-je choisir pour la sélection de logiciel dans une installation CentOS 7 ? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "fas fa-browser";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Assurez-vous de choisir un environnement de bureau. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "fas fa-hdd";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "Comment configurer le disque pour la destination d'installation ? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "fas fa-pallet-alt";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Configurez votre propre partitionnement. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "fas fa-exclamation-triangle";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "Suis-je prêt à appuyer sur le bouton [ Begin Installation ] ? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "fab fa-centos";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Bienvenu au monde merveilleux de CentOS 7. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "fas fa-user-cog";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "Ai-je besoin d'un mot de passe root et d'un mot de passe utilisateur ? ";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "fas fa-lock-alt";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Choisisez un mot de passe root fort. ";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;
	public static final String recapituler3TableTr12Td1I1 = "fas fa-fast-forward";
	public static final String recapituler3TableTr12Td1I = recapituler3TableTr12Td1I1;
	public static final String recapituler3TableTr12Td21 = "Comment terminer l'installation de CentOS 7 ? ";
	public static final String recapituler3TableTr12Td2 = recapituler3TableTr12Td21;
	public static final String recapituler3TableTr12Td3I1 = "fab fa-linux";
	public static final String recapituler3TableTr12Td3I = recapituler3TableTr12Td3I1;
	public static final String recapituler3TableTr12Td41 = "Quelques étapes supplémentaires pour profiter de votre nouvel ordinateur. ";
	public static final String recapituler3TableTr12Td4 = recapituler3TableTr12Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
	 * <br/>
	 * @param recapituler3 est l'entité déjà construit. 
	 **/
	protected abstract void _recapituler3(PageHtml o);

	public PageHtml getRecapituler3() {
		return recapituler3;
	}

	public void setRecapituler3(PageHtml recapituler3) {
		this.recapituler3 = recapituler3;
		this.recapituler3Couverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven recapituler3Init() {
		if(recapituler3 != null) {
			((C001L005InstallerMaven)this).avantPagePart(recapituler3, "recapituler3");
			((C001L005InstallerMaven)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyRecapituler3(PageHtml o) {
		{ e("table").a("class", " recapituler3Table ").f();
			{ e("tr").a("class", " recapituler3TableTr01 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr01Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr01Td1I1, " site-menu-icon recapituler3TableTr01Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr01Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr01Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr01Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr01Td3I1, " site-menu-icon recapituler3TableTr01Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr01Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr01Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr02 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr02Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr02Td1I1, " site-menu-icon recapituler3TableTr02Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr02Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr02Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr02Td3 recapituler3TableTr odd ").f();
					{ e("span").a("class", " recapituler3TableTr02Td3Span1 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span1I1, " site-menu-icon recapituler3TableTr02Td3Span1I ").f();
						} g("i");
					} g("span");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr02Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr02Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr03 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr03Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr03Td1I1, " site-menu-icon recapituler3TableTr03Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr03Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr03Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr03Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr03Td3I1, " site-menu-icon recapituler3TableTr03Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr03Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr03Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr04 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr04Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr04Td1I1, " site-menu-icon recapituler3TableTr04Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr04Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr04Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr04Td3 recapituler3TableTr odd ").f();
					{ e("span").a("class", " recapituler3TableTr04Td3Span1 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr04Td3Span1I1, " site-menu-icon recapituler3TableTr04Td3Span1I ").f();
						} g("i");
					} g("span");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr04Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr04Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr05 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr05Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr05Td1I1, " site-menu-icon recapituler3TableTr05Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr05Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr05Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr05Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr05Td3I1, " site-menu-icon recapituler3TableTr05Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr05Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr05Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr06 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr06Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr06Td1I1, " site-menu-icon recapituler3TableTr06Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr06Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr06Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr06Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr06Td3I1, " site-menu-icon recapituler3TableTr06Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr06Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr06Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr07 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr07Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr07Td1I1, " site-menu-icon recapituler3TableTr07Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr07Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr07Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr07Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr07Td3I1, " site-menu-icon recapituler3TableTr07Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr07Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr07Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr08 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr08Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr08Td1I1, " site-menu-icon recapituler3TableTr08Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr08Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr08Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr08Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr08Td3I1, " site-menu-icon recapituler3TableTr08Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr08Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr08Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr09 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr09Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr09Td1I1, " site-menu-icon recapituler3TableTr09Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr09Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr09Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr09Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr09Td3I1, " site-menu-icon recapituler3TableTr09Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr09Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr09Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr10 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr10Td1 recapituler3TableTr1 odd ").f();
					{ e("i").a("class", recapituler3TableTr10Td1I1, " site-menu-icon recapituler3TableTr10Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr10Td2 recapituler3TableTr1 even ").f();
					sx(recapituler3TableTr10Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr10Td3 recapituler3TableTr1 odd ").f();
					{ e("i").a("class", recapituler3TableTr10Td3I1, " site-menu-icon recapituler3TableTr10Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr10Td4 recapituler3TableTr1 even ").f();
					sx(recapituler3TableTr10Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr11 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr11Td1 recapituler3TableTr11Td odd ").f();
					{ e("i").a("class", recapituler3TableTr11Td1I1, " site-menu-icon recapituler3TableTr11Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr11Td2 recapituler3TableTr11Td even ").f();
					sx(recapituler3TableTr11Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr11Td3 recapituler3TableTr11Td odd ").f();
					{ e("i").a("class", recapituler3TableTr11Td3I1, " site-menu-icon recapituler3TableTr11Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr11Td4 recapituler3TableTr11Td even ").f();
					sx(recapituler3TableTr11Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr12 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr12Td1 recapituler3TableTr12Td odd ").f();
					{ e("i").a("class", recapituler3TableTr12Td1I1, " site-menu-icon recapituler3TableTr12Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr12Td2 recapituler3TableTr12Td even ").f();
					sx(recapituler3TableTr12Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr12Td3 recapituler3TableTr12Td odd ").f();
					{ e("i").a("class", recapituler3TableTr12Td3I1, " site-menu-icon recapituler3TableTr12Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr12Td4 recapituler3TableTr12Td even ").f();
					sx(recapituler3TableTr12Td41);
				} g("td");
			} g("tr");
		} g("table");
	}
	public void htmlBodyRecapituler3() {
		recapituler3.htmlAvant();
		htmlBodyRecapituler3(recapituler3);
		recapituler3.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L005InstallerMaven = false;

	public C001L005InstallerMaven initLoinC001L005InstallerMaven(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L005InstallerMaven) {
			dejaInitialiseC001L005InstallerMaven = true;
			initLoinC001L005InstallerMaven();
		}
		return (C001L005InstallerMaven)this;
	}

	public void initLoinC001L005InstallerMaven() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L005InstallerMaven();
	}

	public void initC001L005InstallerMaven() {
		moiInit();
		questionDependencesInit();
		questionInstallerAncienInit();
		questionMkdirSrcInit();
		questionMkdirMavenInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L005InstallerMaven(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L005InstallerMaven(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionInstallerAncien != null)
			questionInstallerAncien.setRequeteSite_(requeteSite_);
		if(questionMkdirSrc != null)
			questionMkdirSrc.setRequeteSite_(requeteSite_);
		if(questionMkdirMaven != null)
			questionMkdirMaven.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L005InstallerMaven(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L005InstallerMaven(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L005InstallerMaven(String var) {
		C001L005InstallerMaven oC001L005InstallerMaven = (C001L005InstallerMaven)this;
		switch(var) {
			case "moi":
				return oC001L005InstallerMaven.moi;
			case "questionDependences":
				return oC001L005InstallerMaven.questionDependences;
			case "questionInstallerAncien":
				return oC001L005InstallerMaven.questionInstallerAncien;
			case "questionMkdirSrc":
				return oC001L005InstallerMaven.questionMkdirSrc;
			case "questionMkdirMaven":
				return oC001L005InstallerMaven.questionMkdirMaven;
			case "recapituler1":
				return oC001L005InstallerMaven.recapituler1;
			case "recapituler2":
				return oC001L005InstallerMaven.recapituler2;
			case "recapituler3":
				return oC001L005InstallerMaven.recapituler3;
			default:
				return super.obtenirC001Lecon(var);
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
				o = attribuerC001L005InstallerMaven(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L005InstallerMaven(String var, Object val) {
		C001L005InstallerMaven oC001L005InstallerMaven = (C001L005InstallerMaven)this;
		switch(var) {
			default:
				return super.attribuerC001Lecon(var, val);
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
					o = definirC001L005InstallerMaven(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L005InstallerMaven(String var, String val) {
		switch(var) {
			default:
				return super.definirC001Lecon(var, val);
		}
	}

	///////////
	// image //
	///////////

	public static void image() {
		try {
			DefaultExecutor executeur = new DefaultExecutor();
			{
				new File("/usr/local/src/computate.org-static/png/frFR/cours/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-la-derniere-version-de-maven-999.png"));
				System.out.println("C001L005InstallerMavenFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/004-how-to-install-the-latest-version-of-maven?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-the-latest-version-of-maven-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-the-latest-version-of-maven-999.png"));
				System.out.println("C001L005InstallerMavenEnUSPage");
				System.out.println(" * ImageLargeur.enUS: " + img.getWidth());
				System.out.println(" * ImageHauteur.enUS: " + img.getHeight());
			}
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	/////////////
	// indexer //
	/////////////

	public static void indexer() {
		try {
			RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L005InstallerMaven o = new C001L005InstallerMaven();
			o.requeteSiteC001L005InstallerMaven(requeteSite);
			o.initLoinC001L005InstallerMaven(requeteSite);
			o.indexerC001L005InstallerMaven();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L005InstallerMaven();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L005InstallerMaven(document);
	}

	public void indexerC001L005InstallerMaven(SolrClient clientSolr) {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L005InstallerMaven(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L005InstallerMaven() {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L005InstallerMaven(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L005InstallerMaven(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L005InstallerMaven() {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L005InstallerMaven(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L005InstallerMaven(solrDocument);
	}
	public void stockerC001L005InstallerMaven(SolrDocument solrDocument) {
		C001L005InstallerMaven oC001L005InstallerMaven = (C001L005InstallerMaven)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L005InstallerMaven();
	}

	public void htmlBodyCourtC001L005InstallerMaven() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionInstallerAncien != null)
			questionInstallerAncien.htmlBodyCourt();
		if(questionMkdirSrc != null)
			questionMkdirSrc.htmlBodyCourt();
		if(questionMkdirMaven != null)
			questionMkdirMaven.htmlBodyCourt();
		if(recapituler1 != null)
			recapituler1.htmlBodyCourt();
		if(recapituler2 != null)
			recapituler2.htmlBodyCourt();
		if(recapituler3 != null)
			recapituler3.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L005InstallerMaven();
		super.htmlBody();
	}

	public void htmlBodyC001L005InstallerMaven() {
		((C001L005InstallerMaven)this).htmlBodyMoi();
		((C001L005InstallerMaven)this).htmlBodyQuestionDependences();
		((C001L005InstallerMaven)this).htmlBodyQuestionInstallerAncien();
		((C001L005InstallerMaven)this).htmlBodyQuestionMkdirSrc();
		((C001L005InstallerMaven)this).htmlBodyQuestionMkdirMaven();
		((C001L005InstallerMaven)this).htmlBodyRecapituler1();
		((C001L005InstallerMaven)this).htmlBodyRecapituler2();
		((C001L005InstallerMaven)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L005InstallerMaven))
			return false;
		C001L005InstallerMaven that = (C001L005InstallerMaven)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L005InstallerMaven {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L005InstallerMavenVals = new String[] { moiP1, moiP2, moiP3, moiP4, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPreSpan11, questionDependencesPreSpan21, questionDependencesPreSpan31, questionDependencesPreSpan41, questionDependencesOl2Li11, questionDependencesOl2Li12, questionDependencesOl2Li13, questionDependencesOl2Li21, questionDependencesOl2Li22, questionDependencesOl2Li31, questionDependencesOl2Li41, questionInstallerAncienH3I1, questionInstallerAncienH3Span1, questionInstallerAncienH4I1, questionInstallerAncienH4Span1, questionInstallerAncienPreSpan11, questionInstallerAncienPreSpan21, questionInstallerAncienPreSpan31, questionInstallerAncienPreSpan41, questionInstallerAncienOl2Li11, questionInstallerAncienOl2Li21, questionInstallerAncienOl2Li31, questionInstallerAncienOl2Li41, questionInstallerAncienOl2Li51, questionMkdirSrcH3I1, questionMkdirSrcH3Span1, questionMkdirSrcH4I1, questionMkdirSrcH4Span1, questionMkdirSrcPreSpan11, questionMkdirSrcPreSpan21, questionMkdirSrcPreSpan41, questionMkdirSrcOl2Li11, questionMkdirSrcOl2Li21, questionMkdirSrcOl2Li31, questionMkdirSrcOl2Li32, questionMkdirMavenH3I1, questionMkdirMavenH3Span1, questionMkdirMavenH4I1, questionMkdirMavenH4Span1, questionMkdirMavenPreSpan11, questionMkdirMavenPreSpan21, questionMkdirMavenPreSpan31, questionMkdirMavenPreSpan41, questionMkdirMavenOl2Li11, questionMkdirMavenOl2Li12, questionMkdirMavenOl2Li13, questionMkdirMavenOl2Li14, questionMkdirMavenOl2Li21, questionMkdirMavenOl2Li31, questionMkdirMavenOl2Li41, questionMkdirMavenOl2Li51, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td3Span1I2, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41 };
}
