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
	public static final String C001L005InstallerMaven_H1 = "Comment installer la dernière version de maven ? ";
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
	public static final String questionDependencesPre1Span11 = "sudo";
	public static final String questionDependencesPre1Span1 = questionDependencesPre1Span11;
	public static final String questionDependencesPre1Span21 = " yum-builddep";
	public static final String questionDependencesPre1Span2 = questionDependencesPre1Span21;
	public static final String questionDependencesPre1Span31 = " -y";
	public static final String questionDependencesPre1Span3 = questionDependencesPre1Span31;
	public static final String questionDependencesPre1Span41 = " maven";
	public static final String questionDependencesPre1Span4 = questionDependencesPre1Span41;
	public static final String questionDependencesOl2Li11 = "sudo: La commande pour installer des dépots yum commence par la commande sudo. ";
	public static final String questionDependencesOl2Li12 = "La commande \"sudo\" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. ";
	public static final String questionDependencesOl2Li13 = "L'installation des dépots yum nécessite toujours les privilèges root. ";
	public static final String questionDependencesOl2Li1 = questionDependencesOl2Li11 + questionDependencesOl2Li12 + questionDependencesOl2Li13;
	public static final String questionDependencesOl2Li21 = "yum Signifie \"Yellowdog Updater Modified\", mais personne ne le connait comme yellowdog, juste yum. ";
	public static final String questionDependencesOl2Li22 = "yum-builddep installe les dépendances manquantes pour la construction d'un paquet RPM. ";
	public static final String questionDependencesOl2Li2 = questionDependencesOl2Li21 + questionDependencesOl2Li22;
	public static final String questionDependencesOl2Li31 = "-y: Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. ";
	public static final String questionDependencesOl2Li3 = questionDependencesOl2Li31;
	public static final String questionDependencesOl2Li41 = "maven : Le nom du paquet pour lequel vous vous souhaitez installer les dépendences. ";
	public static final String questionDependencesOl2Li4 = questionDependencesOl2Li41;
	public static final String questionDependencesPre3Span11 = "sudo";
	public static final String questionDependencesPre3Span1 = questionDependencesPre3Span11;
	public static final String questionDependencesPre3Span21 = " yum";
	public static final String questionDependencesPre3Span2 = questionDependencesPre3Span21;
	public static final String questionDependencesPre3Span31 = " install";
	public static final String questionDependencesPre3Span3 = questionDependencesPre3Span31;
	public static final String questionDependencesPre3Span41 = " -y";
	public static final String questionDependencesPre3Span4 = questionDependencesPre3Span41;
	public static final String questionDependencesPre3Span51 = " git";
	public static final String questionDependencesPre3Span5 = questionDependencesPre3Span51;
	public static final String questionDependencesOl4Li11 = "sudo";
	public static final String questionDependencesOl4Li1 = questionDependencesOl4Li11;
	public static final String questionDependencesOl4Li21 = "yum";
	public static final String questionDependencesOl4Li2 = questionDependencesOl4Li21;
	public static final String questionDependencesOl4Li31 = "install : Pour installer des nouveaux paquets yum. ";
	public static final String questionDependencesOl4Li3 = questionDependencesOl4Li31;
	public static final String questionDependencesOl4Li41 = "-y";
	public static final String questionDependencesOl4Li4 = questionDependencesOl4Li41;
	public static final String questionDependencesOl4Li51 = "git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. ";
	public static final String questionDependencesOl4Li5 = questionDependencesOl4Li51;

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
		{ e("pre").a("class", " questionDependencesPre1 questionDependencesPre odd ").f();
			{ e("span").a("class", " questionDependencesPre1Span1 questionDependencesPre1Span odd ").f();
				sx(questionDependencesPre1Span11);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span2 questionDependencesPre1Span even ").f();
				sx(questionDependencesPre1Span21);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span3 questionDependencesPre1Span odd ").f();
				sx(questionDependencesPre1Span31);
			} g("span");
			{ e("span").a("class", " questionDependencesPre1Span4 questionDependencesPre1Span even ").f();
				sx(questionDependencesPre1Span41);
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
		{ e("pre").a("class", " questionDependencesPre3 questionDependencesPre odd ").f();
			{ e("span").a("class", " questionDependencesPre3Span1 questionDependencesPre3Span odd ").f();
				sx(questionDependencesPre3Span11);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span2 questionDependencesPre3Span even ").f();
				sx(questionDependencesPre3Span21);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span3 questionDependencesPre3Span odd ").f();
				sx(questionDependencesPre3Span31);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span4 questionDependencesPre3Span even ").f();
				sx(questionDependencesPre3Span41);
			} g("span");
			{ e("span").a("class", " questionDependencesPre3Span5 questionDependencesPre3Span odd ").f();
				sx(questionDependencesPre3Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDependencesOl4 questionDependencesOl even ").f();
			{ e("li").a("class", " questionDependencesOl4Li1 questionDependencesOl4Li odd ").f();
				sx(questionDependencesOl4Li11);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li2 questionDependencesOl4Li even ").f();
				sx(questionDependencesOl4Li21);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li3 questionDependencesOl4Li odd ").f();
				sx(questionDependencesOl4Li31);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li4 questionDependencesOl4Li even ").f();
				sx(questionDependencesOl4Li41);
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li5 questionDependencesOl4Li odd ").f();
				sx(questionDependencesOl4Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionDependences() {
		questionDependences.htmlAvant();
		htmlBodyQuestionDependences(questionDependences);
		questionDependences.htmlApres();
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
	public static final String questionMkdirSrcPreSpan21 = " install";
	public static final String questionMkdirSrcPreSpan2 = questionMkdirSrcPreSpan21;
	public static final String questionMkdirSrcPreSpan31 = " -d";
	public static final String questionMkdirSrcPreSpan3 = questionMkdirSrcPreSpan31;
	public static final String questionMkdirSrcPreSpan41 = " -o";
	public static final String questionMkdirSrcPreSpan4 = questionMkdirSrcPreSpan41;
	public static final String questionMkdirSrcPreSpan51 = " $USER";
	public static final String questionMkdirSrcPreSpan5 = questionMkdirSrcPreSpan51;
	public static final String questionMkdirSrcPreSpan61 = " -g";
	public static final String questionMkdirSrcPreSpan6 = questionMkdirSrcPreSpan61;
	public static final String questionMkdirSrcPreSpan71 = " $USER";
	public static final String questionMkdirSrcPreSpan7 = questionMkdirSrcPreSpan71;
	public static final String questionMkdirSrcPreSpan81 = " /usr/local/src/maven";
	public static final String questionMkdirSrcPreSpan8 = questionMkdirSrcPreSpan81;
	public static final String questionMkdirSrcOl2Li11 = "sudo";
	public static final String questionMkdirSrcOl2Li1 = questionMkdirSrcOl2Li11;
	public static final String questionMkdirSrcOl2Li21 = "install : Crée des répertoires et définit des attributs sur le nouveau répertoire. ";
	public static final String questionMkdirSrcOl2Li2 = questionMkdirSrcOl2Li21;
	public static final String questionMkdirSrcOl2Li31 = "-d : Créez tous les composants des répertoires spécifiés. ";
	public static final String questionMkdirSrcOl2Li3 = questionMkdirSrcOl2Li31;
	public static final String questionMkdirSrcOl2Li41 = "-o : Définir la propriété sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrcOl2Li4 = questionMkdirSrcOl2Li41;
	public static final String questionMkdirSrcOl2Li51 = "$USER : L'utilisateur actuel à rendre le propriétaire du répertoire. ";
	public static final String questionMkdirSrcOl2Li5 = questionMkdirSrcOl2Li51;
	public static final String questionMkdirSrcOl2Li61 = "-g : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrcOl2Li6 = questionMkdirSrcOl2Li61;
	public static final String questionMkdirSrcOl2Li71 = "$USER : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. ";
	public static final String questionMkdirSrcOl2Li7 = questionMkdirSrcOl2Li71;
	public static final String questionMkdirSrcOl2Li81 = "/usr/local est un endroit pour des logiciels supplémentaires que vous installez sans le gestionnaire de paquets. ";
	public static final String questionMkdirSrcOl2Li82 = "/usr/local/src est un bon endroit pour cloner vos référentiels de logiciels open source. ";
	public static final String questionMkdirSrcOl2Li8 = questionMkdirSrcOl2Li81 + questionMkdirSrcOl2Li82;

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
			{ e("span").a("class", " questionMkdirSrcPreSpan3 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan4 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan5 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan6 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan7 questionMkdirSrcPreSpan odd ").f();
				sx(questionMkdirSrcPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirSrcPreSpan8 questionMkdirSrcPreSpan even ").f();
				sx(questionMkdirSrcPreSpan81);
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
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li4 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li5 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li6 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li7 questionMkdirSrcOl2Li odd ").f();
				sx(questionMkdirSrcOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirSrcOl2Li8 questionMkdirSrcOl2Li even ").f();
				sx(questionMkdirSrcOl2Li81);
				sx(questionMkdirSrcOl2Li82);
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
	public static final String questionMkdirMavenH4Span1 = "Créez un répertoire maven dans /opt. ";
	public static final String questionMkdirMavenH4Span = questionMkdirMavenH4Span1;
	public static final String questionMkdirMavenPreSpan11 = "sudo";
	public static final String questionMkdirMavenPreSpan1 = questionMkdirMavenPreSpan11;
	public static final String questionMkdirMavenPreSpan21 = " install";
	public static final String questionMkdirMavenPreSpan2 = questionMkdirMavenPreSpan21;
	public static final String questionMkdirMavenPreSpan31 = " -d";
	public static final String questionMkdirMavenPreSpan3 = questionMkdirMavenPreSpan31;
	public static final String questionMkdirMavenPreSpan41 = " -o";
	public static final String questionMkdirMavenPreSpan4 = questionMkdirMavenPreSpan41;
	public static final String questionMkdirMavenPreSpan51 = " $USER";
	public static final String questionMkdirMavenPreSpan5 = questionMkdirMavenPreSpan51;
	public static final String questionMkdirMavenPreSpan61 = " -g";
	public static final String questionMkdirMavenPreSpan6 = questionMkdirMavenPreSpan61;
	public static final String questionMkdirMavenPreSpan71 = " $USER";
	public static final String questionMkdirMavenPreSpan7 = questionMkdirMavenPreSpan71;
	public static final String questionMkdirMavenPreSpan81 = " /opt/maven";
	public static final String questionMkdirMavenPreSpan8 = questionMkdirMavenPreSpan81;
	public static final String questionMkdirMavenOl2Li11 = "sudo";
	public static final String questionMkdirMavenOl2Li1 = questionMkdirMavenOl2Li11;
	public static final String questionMkdirMavenOl2Li21 = "install";
	public static final String questionMkdirMavenOl2Li2 = questionMkdirMavenOl2Li21;
	public static final String questionMkdirMavenOl2Li31 = "-d";
	public static final String questionMkdirMavenOl2Li3 = questionMkdirMavenOl2Li31;
	public static final String questionMkdirMavenOl2Li41 = "-o";
	public static final String questionMkdirMavenOl2Li4 = questionMkdirMavenOl2Li41;
	public static final String questionMkdirMavenOl2Li51 = "$USER";
	public static final String questionMkdirMavenOl2Li5 = questionMkdirMavenOl2Li51;
	public static final String questionMkdirMavenOl2Li61 = "-g";
	public static final String questionMkdirMavenOl2Li6 = questionMkdirMavenOl2Li61;
	public static final String questionMkdirMavenOl2Li71 = "$USER";
	public static final String questionMkdirMavenOl2Li7 = questionMkdirMavenOl2Li71;
	public static final String questionMkdirMavenOl2Li81 = "/opt est un bon endroit pour installer des applications logicielles open source telles que maven. ";
	public static final String questionMkdirMavenOl2Li8 = questionMkdirMavenOl2Li81;

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
			{ e("span").a("class", " questionMkdirMavenPreSpan5 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan6 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan7 questionMkdirMavenPreSpan odd ").f();
				sx(questionMkdirMavenPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirMavenPreSpan8 questionMkdirMavenPreSpan even ").f();
				sx(questionMkdirMavenPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirMavenOl2 questionMkdirMavenOl even ").f();
			{ e("li").a("class", " questionMkdirMavenOl2Li1 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li11);
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
			{ e("li").a("class", " questionMkdirMavenOl2Li6 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li7 questionMkdirMavenOl2Li odd ").f();
				sx(questionMkdirMavenOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirMavenOl2Li8 questionMkdirMavenOl2Li even ").f();
				sx(questionMkdirMavenOl2Li81);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirMaven() {
		questionMkdirMaven.htmlAvant();
		htmlBodyQuestionMkdirMaven(questionMkdirMaven);
		questionMkdirMaven.htmlApres();
	}

	//////////////////////////
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-truck-container";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "Comment télécharger le code source de maven ? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "far fa-tools";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Cloner le code source avec la commande git. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " https://git-wip-us.apache.org/repos/asf/maven.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/maven";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone : Cloner un référentiel dans un répertoire. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "https://git-wip-us.apache.org/repos/asf/maven.git : URL git vers le référentiel de code source maven. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/maven : Répertoire dans lequel le code source maven sera cloné. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
	 * <br/>
	 * @param questionClonerSource est l'entité déjà construit. 
	 **/
	protected abstract void _questionClonerSource(PageHtml o);

	public PageHtml getQuestionClonerSource() {
		return questionClonerSource;
	}

	public void setQuestionClonerSource(PageHtml questionClonerSource) {
		this.questionClonerSource = questionClonerSource;
		this.questionClonerSourceCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L005InstallerMaven)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionClonerSource(PageHtml o) {
		{ e("h3").a("class", " questionClonerSourceH3 ").f();
			{ e("i").a("class", questionClonerSourceH3I1, " site-menu-icon questionClonerSourceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionClonerSourceH3Span ").f();
				sx(questionClonerSourceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionClonerSourceH4 ").f();
			{ e("i").a("class", questionClonerSourceH4I1, " site-menu-icon questionClonerSourceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionClonerSourceH4Span ").f();
				sx(questionClonerSourceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionClonerSourcePre ").f();
			{ e("span").a("class", " questionClonerSourcePreSpan1 questionClonerSourcePreSpan odd ").f();
				sx(questionClonerSourcePreSpan11);
			} g("span");
			{ e("span").a("class", " questionClonerSourcePreSpan2 questionClonerSourcePreSpan even ").f();
				sx(questionClonerSourcePreSpan21);
			} g("span");
			{ e("span").a("class", " questionClonerSourcePreSpan3 questionClonerSourcePreSpan odd ").f();
				sx(questionClonerSourcePreSpan31);
			} g("span");
			{ e("span").a("class", " questionClonerSourcePreSpan4 questionClonerSourcePreSpan even ").f();
				sx(questionClonerSourcePreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionClonerSourceOl2 questionClonerSourceOl even ").f();
			{ e("li").a("class", " questionClonerSourceOl2Li1 questionClonerSourceOl2Li odd ").f();
				sx(questionClonerSourceOl2Li11);
			} g("li");
			{ e("li").a("class", " questionClonerSourceOl2Li2 questionClonerSourceOl2Li even ").f();
				sx(questionClonerSourceOl2Li21);
			} g("li");
			{ e("li").a("class", " questionClonerSourceOl2Li3 questionClonerSourceOl2Li odd ").f();
				sx(questionClonerSourceOl2Li31);
			} g("li");
			{ e("li").a("class", " questionClonerSourceOl2Li4 questionClonerSourceOl2Li even ").f();
				sx(questionClonerSourceOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionClonerSource() {
		questionClonerSource.htmlAvant();
		htmlBodyQuestionClonerSource(questionClonerSource);
		questionClonerSource.htmlApres();
	}

	////////////////////////
	// questionListerTags //
	////////////////////////

	public static final String questionListerTagsH3I1 = "far fa-truck-container";
	public static final String questionListerTagsH3I = questionListerTagsH3I1;
	public static final String questionListerTagsH3Span1 = "Comment choisir une version récente de Maven ? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tools";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "Listez toutes les tags du référentiel git. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/maven";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl2Li11 = "(cd : Changer de répertoire temporairement avec la parenthèse ouverte. ";
	public static final String questionListerTagsOl2Li1 = questionListerTagsOl2Li11;
	public static final String questionListerTagsOl2Li21 = "/usr/local/src/maven : Répertoire dans lequel le code source maven a été cloné. ";
	public static final String questionListerTagsOl2Li2 = questionListerTagsOl2Li21;
	public static final String questionListerTagsOl2Li31 = "&& : Exécutez la commande cd et git ensemble. ";
	public static final String questionListerTagsOl2Li3 = questionListerTagsOl2Li31;
	public static final String questionListerTagsOl2Li41 = "git";
	public static final String questionListerTagsOl2Li4 = questionListerTagsOl2Li41;
	public static final String questionListerTagsOl2Li51 = "tag) : Répertorie les tags actuelles ou les versions assignées du code et ferme la parenthèse. ";
	public static final String questionListerTagsOl2Li5 = questionListerTagsOl2Li51;

	/**	L'entité « questionListerTags »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionListerTags = new PageHtml();
	public Couverture<PageHtml> questionListerTagsCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionListerTags").o(questionListerTags);

	/**	<br/>L'entité « questionListerTags »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
	 * <br/>
	 * @param questionListerTags est l'entité déjà construit. 
	 **/
	protected abstract void _questionListerTags(PageHtml o);

	public PageHtml getQuestionListerTags() {
		return questionListerTags;
	}

	public void setQuestionListerTags(PageHtml questionListerTags) {
		this.questionListerTags = questionListerTags;
		this.questionListerTagsCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L005InstallerMaven)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionListerTags(PageHtml o) {
		{ e("h3").a("class", " questionListerTagsH3 ").f();
			{ e("i").a("class", questionListerTagsH3I1, " site-menu-icon questionListerTagsH3I ").f();
			} g("i");
			{ e("span").a("class", " questionListerTagsH3Span ").f();
				sx(questionListerTagsH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionListerTagsH4 ").f();
			{ e("i").a("class", questionListerTagsH4I1, " site-menu-icon questionListerTagsH4I ").f();
			} g("i");
			{ e("span").a("class", " questionListerTagsH4Span ").f();
				sx(questionListerTagsH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionListerTagsPre ").f();
			{ e("span").a("class", " questionListerTagsPreSpan1 questionListerTagsPreSpan odd ").f();
				sx(questionListerTagsPreSpan11);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan2 questionListerTagsPreSpan even ").f();
				sx(questionListerTagsPreSpan21);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan3 questionListerTagsPreSpan odd ").f();
				sx(questionListerTagsPreSpan31);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan4 questionListerTagsPreSpan even ").f();
				sx(questionListerTagsPreSpan41);
			} g("span");
			{ e("span").a("class", " questionListerTagsPreSpan5 questionListerTagsPreSpan odd ").f();
				sx(questionListerTagsPreSpan51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionListerTagsOl2 questionListerTagsOl even ").f();
			{ e("li").a("class", " questionListerTagsOl2Li1 questionListerTagsOl2Li odd ").f();
				sx(questionListerTagsOl2Li11);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li2 questionListerTagsOl2Li even ").f();
				sx(questionListerTagsOl2Li21);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li3 questionListerTagsOl2Li odd ").f();
				sx(questionListerTagsOl2Li31);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li4 questionListerTagsOl2Li even ").f();
				sx(questionListerTagsOl2Li41);
			} g("li");
			{ e("li").a("class", " questionListerTagsOl2Li5 questionListerTagsOl2Li odd ").f();
				sx(questionListerTagsOl2Li51);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionListerTags() {
		questionListerTags.htmlAvant();
		htmlBodyQuestionListerTags(questionListerTags);
		questionListerTags.htmlApres();
	}

	/////////////////////////
	// questionCheckoutTag //
	/////////////////////////

	public static final String questionCheckoutTagH3I1 = "far fa-truck-container";
	public static final String questionCheckoutTagH3I = questionCheckoutTagH3I1;
	public static final String questionCheckoutTagH3Span1 = "Comment changer de version du code source de maven ? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-tools";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout la tag git. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/maven";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan61 = " maven-3.6.1)";
	public static final String questionCheckoutTagPreSpan6 = questionCheckoutTagPreSpan61;
	public static final String questionCheckoutTagOl2Li11 = "(cd";
	public static final String questionCheckoutTagOl2Li1 = questionCheckoutTagOl2Li11;
	public static final String questionCheckoutTagOl2Li21 = "/usr/local/src/maven";
	public static final String questionCheckoutTagOl2Li2 = questionCheckoutTagOl2Li21;
	public static final String questionCheckoutTagOl2Li31 = "&&";
	public static final String questionCheckoutTagOl2Li3 = questionCheckoutTagOl2Li31;
	public static final String questionCheckoutTagOl2Li41 = "git";
	public static final String questionCheckoutTagOl2Li4 = questionCheckoutTagOl2Li41;
	public static final String questionCheckoutTagOl2Li51 = "checkout : Checkout une branche dans l’arbre de travail. ";
	public static final String questionCheckoutTagOl2Li5 = questionCheckoutTagOl2Li51;
	public static final String questionCheckoutTagOl2Li61 = "maven-3.6.1) : La dernière tag pour baser la branche. ";
	public static final String questionCheckoutTagOl2Li6 = questionCheckoutTagOl2Li61;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
	 * <br/>
	 * @param questionCheckoutTag est l'entité déjà construit. 
	 **/
	protected abstract void _questionCheckoutTag(PageHtml o);

	public PageHtml getQuestionCheckoutTag() {
		return questionCheckoutTag;
	}

	public void setQuestionCheckoutTag(PageHtml questionCheckoutTag) {
		this.questionCheckoutTag = questionCheckoutTag;
		this.questionCheckoutTagCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L005InstallerMaven)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionCheckoutTag(PageHtml o) {
		{ e("h3").a("class", " questionCheckoutTagH3 ").f();
			{ e("i").a("class", questionCheckoutTagH3I1, " site-menu-icon questionCheckoutTagH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCheckoutTagH3Span ").f();
				sx(questionCheckoutTagH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCheckoutTagH4 ").f();
			{ e("i").a("class", questionCheckoutTagH4I1, " site-menu-icon questionCheckoutTagH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCheckoutTagH4Span ").f();
				sx(questionCheckoutTagH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCheckoutTagPre ").f();
			{ e("span").a("class", " questionCheckoutTagPreSpan1 questionCheckoutTagPreSpan odd ").f();
				sx(questionCheckoutTagPreSpan11);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan2 questionCheckoutTagPreSpan even ").f();
				sx(questionCheckoutTagPreSpan21);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan3 questionCheckoutTagPreSpan odd ").f();
				sx(questionCheckoutTagPreSpan31);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan4 questionCheckoutTagPreSpan even ").f();
				sx(questionCheckoutTagPreSpan41);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan5 questionCheckoutTagPreSpan odd ").f();
				sx(questionCheckoutTagPreSpan51);
			} g("span");
			{ e("span").a("class", " questionCheckoutTagPreSpan6 questionCheckoutTagPreSpan even ").f();
				sx(questionCheckoutTagPreSpan61);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCheckoutTagOl2 questionCheckoutTagOl even ").f();
			{ e("li").a("class", " questionCheckoutTagOl2Li1 questionCheckoutTagOl2Li odd ").f();
				sx(questionCheckoutTagOl2Li11);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li2 questionCheckoutTagOl2Li even ").f();
				sx(questionCheckoutTagOl2Li21);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li3 questionCheckoutTagOl2Li odd ").f();
				sx(questionCheckoutTagOl2Li31);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li4 questionCheckoutTagOl2Li even ").f();
				sx(questionCheckoutTagOl2Li41);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li5 questionCheckoutTagOl2Li odd ").f();
				sx(questionCheckoutTagOl2Li51);
			} g("li");
			{ e("li").a("class", " questionCheckoutTagOl2Li6 questionCheckoutTagOl2Li even ").f();
				sx(questionCheckoutTagOl2Li61);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCheckoutTag() {
		questionCheckoutTag.htmlAvant();
		htmlBodyQuestionCheckoutTag(questionCheckoutTag);
		questionCheckoutTag.htmlApres();
	}

	//////////////////////////////
	// questionConstruireSource //
	//////////////////////////////

	public static final String questionConstruireSourceH3I1 = "far fa-truck-container";
	public static final String questionConstruireSourceH3I = questionConstruireSourceH3I1;
	public static final String questionConstruireSourceH3Span1 = "Comment contruire le code source de maven ? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-tools";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Construisez Maven avec la commande mvn. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePreSpan11 = "(cd";
	public static final String questionConstruireSourcePreSpan1 = questionConstruireSourcePreSpan11;
	public static final String questionConstruireSourcePreSpan21 = " /usr/local/src/maven";
	public static final String questionConstruireSourcePreSpan2 = questionConstruireSourcePreSpan21;
	public static final String questionConstruireSourcePreSpan31 = " &&";
	public static final String questionConstruireSourcePreSpan3 = questionConstruireSourcePreSpan31;
	public static final String questionConstruireSourcePreSpan41 = " mvn";
	public static final String questionConstruireSourcePreSpan4 = questionConstruireSourcePreSpan41;
	public static final String questionConstruireSourcePreSpan51 = " -DdistributionTargetDir=\"/tmp/maven\"";
	public static final String questionConstruireSourcePreSpan5 = questionConstruireSourcePreSpan51;
	public static final String questionConstruireSourcePreSpan61 = " clean";
	public static final String questionConstruireSourcePreSpan6 = questionConstruireSourcePreSpan61;
	public static final String questionConstruireSourcePreSpan71 = " package)";
	public static final String questionConstruireSourcePreSpan7 = questionConstruireSourcePreSpan71;
	public static final String questionConstruireSourceOl2Li11 = "(cd";
	public static final String questionConstruireSourceOl2Li1 = questionConstruireSourceOl2Li11;
	public static final String questionConstruireSourceOl2Li21 = "/usr/local/src/maven";
	public static final String questionConstruireSourceOl2Li2 = questionConstruireSourceOl2Li21;
	public static final String questionConstruireSourceOl2Li31 = "&&";
	public static final String questionConstruireSourceOl2Li3 = questionConstruireSourceOl2Li31;
	public static final String questionConstruireSourceOl2Li41 = "mvn: L'outil de gestion de projet logiciel Java. ";
	public static final String questionConstruireSourceOl2Li4 = questionConstruireSourceOl2Li41;
	public static final String questionConstruireSourceOl2Li51 = "-DdistributionTargetDir=\"/tmp/maven\" : Pointez le distributionTargetDir vers un répertoire temporaire dans /tmp. ";
	public static final String questionConstruireSourceOl2Li5 = questionConstruireSourceOl2Li51;
	public static final String questionConstruireSourceOl2Li61 = "clean : Nettoyez toutes les versions précédentes. ";
	public static final String questionConstruireSourceOl2Li6 = questionConstruireSourceOl2Li61;
	public static final String questionConstruireSourceOl2Li71 = "package) : Construire l'application Maven complète et fermez la parenthèse. ";
	public static final String questionConstruireSourceOl2Li7 = questionConstruireSourceOl2Li71;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
	 * <br/>
	 * @param questionConstruireSource est l'entité déjà construit. 
	 **/
	protected abstract void _questionConstruireSource(PageHtml o);

	public PageHtml getQuestionConstruireSource() {
		return questionConstruireSource;
	}

	public void setQuestionConstruireSource(PageHtml questionConstruireSource) {
		this.questionConstruireSource = questionConstruireSource;
		this.questionConstruireSourceCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L005InstallerMaven)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionConstruireSource(PageHtml o) {
		{ e("h3").a("class", " questionConstruireSourceH3 ").f();
			{ e("i").a("class", questionConstruireSourceH3I1, " site-menu-icon questionConstruireSourceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionConstruireSourceH3Span ").f();
				sx(questionConstruireSourceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionConstruireSourceH4 ").f();
			{ e("i").a("class", questionConstruireSourceH4I1, " site-menu-icon questionConstruireSourceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionConstruireSourceH4Span ").f();
				sx(questionConstruireSourceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionConstruireSourcePre ").f();
			{ e("span").a("class", " questionConstruireSourcePreSpan1 questionConstruireSourcePreSpan odd ").f();
				sx(questionConstruireSourcePreSpan11);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePreSpan2 questionConstruireSourcePreSpan even ").f();
				sx(questionConstruireSourcePreSpan21);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePreSpan3 questionConstruireSourcePreSpan odd ").f();
				sx(questionConstruireSourcePreSpan31);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePreSpan4 questionConstruireSourcePreSpan even ").f();
				sx(questionConstruireSourcePreSpan41);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePreSpan5 questionConstruireSourcePreSpan odd ").f();
				sx(questionConstruireSourcePreSpan51);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePreSpan6 questionConstruireSourcePreSpan even ").f();
				sx(questionConstruireSourcePreSpan61);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePreSpan7 questionConstruireSourcePreSpan odd ").f();
				sx(questionConstruireSourcePreSpan71);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl2 questionConstruireSourceOl even ").f();
			{ e("li").a("class", " questionConstruireSourceOl2Li1 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li11);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li2 questionConstruireSourceOl2Li even ").f();
				sx(questionConstruireSourceOl2Li21);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li3 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li31);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li4 questionConstruireSourceOl2Li even ").f();
				sx(questionConstruireSourceOl2Li41);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li5 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li51);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li6 questionConstruireSourceOl2Li even ").f();
				sx(questionConstruireSourceOl2Li61);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl2Li7 questionConstruireSourceOl2Li odd ").f();
				sx(questionConstruireSourceOl2Li71);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConstruireSource() {
		questionConstruireSource.htmlAvant();
		htmlBodyQuestionConstruireSource(questionConstruireSource);
		questionConstruireSource.htmlApres();
	}

	////////////////////////////////
	// questionMavenInstalleMaven //
	////////////////////////////////

	public static final String questionMavenInstalleMavenH3I1 = "far fa-truck-container";
	public static final String questionMavenInstalleMavenH3I = questionMavenInstalleMavenH3I1;
	public static final String questionMavenInstalleMavenH3Span1 = "Mais pourquoi installons-nous Maven pour installer la dernière version de Maven ? ";
	public static final String questionMavenInstalleMavenH3Span = questionMavenInstalleMavenH3Span1;
	public static final String questionMavenInstalleMavenH4I1 = "far fa-tools";
	public static final String questionMavenInstalleMavenH4I = questionMavenInstalleMavenH4I1;
	public static final String questionMavenInstalleMavenH4Span1 = "Un programme qui nécessite de se construire. ";
	public static final String questionMavenInstalleMavenH4Span = questionMavenInstalleMavenH4Span1;
	public static final String questionMavenInstalleMavenH5Span1 = "";
	public static final String questionMavenInstalleMavenH5Span = questionMavenInstalleMavenH5Span1;
	public static final String questionMavenInstalleMavenP5Span1 = "Je ne le croisais pas non plus, un programme qui nécessite de se construire ? ";
	public static final String questionMavenInstalleMavenP5Span2 = "Le mieux que je puisse faire pour expliquer ce phénomène est de citer la documentation de Maven : ";
	public static final String questionMavenInstalleMavenP5Span3 = "« Jusqu'au Maven 3.3, la construction de base de Maven pourrait être optimisée avec une construction Ant.  ";
	public static final String questionMavenInstalleMavenP5Span4 = "Ce bootstrap a été supprimé dans Maven 3.5: vous avez besoin d'un Maven pré-construit pour créer Maven à partir du source. » ";
	public static final String questionMavenInstalleMavenP5Span = questionMavenInstalleMavenP5Span1 + questionMavenInstalleMavenP5Span2 + questionMavenInstalleMavenP5Span3 + questionMavenInstalleMavenP5Span4;

	/**	L'entité « questionMavenInstalleMaven »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMavenInstalleMaven = new PageHtml();
	public Couverture<PageHtml> questionMavenInstalleMavenCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMavenInstalleMaven").o(questionMavenInstalleMaven);

	/**	<br/>L'entité « questionMavenInstalleMaven »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMavenInstalleMaven">Trouver l'entité questionMavenInstalleMaven dans Solr</a>
	 * <br/>
	 * @param questionMavenInstalleMaven est l'entité déjà construit. 
	 **/
	protected abstract void _questionMavenInstalleMaven(PageHtml o);

	public PageHtml getQuestionMavenInstalleMaven() {
		return questionMavenInstalleMaven;
	}

	public void setQuestionMavenInstalleMaven(PageHtml questionMavenInstalleMaven) {
		this.questionMavenInstalleMaven = questionMavenInstalleMaven;
		this.questionMavenInstalleMavenCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionMavenInstalleMavenInit() {
		if(questionMavenInstalleMaven != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionMavenInstalleMaven, "questionMavenInstalleMaven");
			((C001L005InstallerMaven)this).avantPagePart(questionMavenInstalleMaven, "questionMavenInstalleMaven");
		}
		if(!questionMavenInstalleMavenCouverture.dejaInitialise) {
			_questionMavenInstalleMaven(questionMavenInstalleMaven);
		}
		questionMavenInstalleMaven.initLoinPourClasse(requeteSite_);
		questionMavenInstalleMavenCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionMavenInstalleMaven(PageHtml o) {
		{ e("h3").a("class", " questionMavenInstalleMavenH3 ").f();
			{ e("i").a("class", questionMavenInstalleMavenH3I1, " site-menu-icon questionMavenInstalleMavenH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMavenInstalleMavenH3Span ").f();
				sx(questionMavenInstalleMavenH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMavenInstalleMavenH4 ").f();
			{ e("i").a("class", questionMavenInstalleMavenH4I1, " site-menu-icon questionMavenInstalleMavenH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMavenInstalleMavenH4Span ").f();
				sx(questionMavenInstalleMavenH4Span1);
			} g("span");
		} g("h4");
		{ e("h5").a("class", " questionMavenInstalleMavenH5 ").f();
			{ e("span").a("class", " questionMavenInstalleMavenH5Span ").f();
				sx(questionMavenInstalleMavenH5Span1);
			} g("span");
		} g("h5");
		{ e("p").a("class", " questionMavenInstalleMavenP5 questionMavenInstalleMavenP odd ").f();
			{ e("span").a("class", " questionMavenInstalleMavenP5Span ").f();
				sx(questionMavenInstalleMavenP5Span1);
				sx(questionMavenInstalleMavenP5Span2);
				sx(questionMavenInstalleMavenP5Span3);
				sx(questionMavenInstalleMavenP5Span4);
			} g("span");
		} g("p");
	}
	public void htmlBodyQuestionMavenInstalleMaven() {
		questionMavenInstalleMaven.htmlAvant();
		htmlBodyQuestionMavenInstalleMaven(questionMavenInstalleMaven);
		questionMavenInstalleMaven.htmlApres();
	}

	/////////////////
	// questionBin //
	/////////////////

	public static final String questionBinH3I1 = "far fa-truck-container";
	public static final String questionBinH3I = questionBinH3I1;
	public static final String questionBinH3Span1 = "Comment contruire le code source de maven ? ";
	public static final String questionBinH3Span = questionBinH3Span1;
	public static final String questionBinH4I1 = "far fa-tools";
	public static final String questionBinH4I = questionBinH4I1;
	public static final String questionBinH4Span1 = "Cloner le code source avec la commande git. ";
	public static final String questionBinH4Span = questionBinH4Span1;
	public static final String questionBinPreSpan11 = "(cd";
	public static final String questionBinPreSpan1 = questionBinPreSpan11;
	public static final String questionBinPreSpan21 = " /usr/local/src/maven";
	public static final String questionBinPreSpan2 = questionBinPreSpan21;
	public static final String questionBinPreSpan31 = " &&";
	public static final String questionBinPreSpan3 = questionBinPreSpan31;
	public static final String questionBinPreSpan41 = " mvn";
	public static final String questionBinPreSpan4 = questionBinPreSpan41;
	public static final String questionBinPreSpan51 = " -DdistributionTargetDir=\"/opt/maven\"";
	public static final String questionBinPreSpan5 = questionBinPreSpan51;
	public static final String questionBinPreSpan61 = " clean";
	public static final String questionBinPreSpan6 = questionBinPreSpan61;
	public static final String questionBinPreSpan71 = " package)";
	public static final String questionBinPreSpan7 = questionBinPreSpan71;
	public static final String questionBinOl2Li11 = "(cd";
	public static final String questionBinOl2Li1 = questionBinOl2Li11;
	public static final String questionBinOl2Li21 = "/usr/local/src/maven";
	public static final String questionBinOl2Li2 = questionBinOl2Li21;
	public static final String questionBinOl2Li31 = "&&";
	public static final String questionBinOl2Li3 = questionBinOl2Li31;
	public static final String questionBinOl2Li41 = "mvn: L'outil de gestion de projet logiciel Java. ";
	public static final String questionBinOl2Li4 = questionBinOl2Li41;
	public static final String questionBinOl2Li51 = "-DdistributionTargetDir=\"/opt/maven\" : Pointez le distributionTargetDir vers le répertoire où maven sera installé. ";
	public static final String questionBinOl2Li5 = questionBinOl2Li51;
	public static final String questionBinOl2Li61 = "clean : Nettoyez toutes les versions précédentes. ";
	public static final String questionBinOl2Li6 = questionBinOl2Li61;
	public static final String questionBinOl2Li71 = "package) : Construire l'application Maven complète et fermez la parenthèse. ";
	public static final String questionBinOl2Li7 = questionBinOl2Li71;

	/**	L'entité « questionBin »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionBin = new PageHtml();
	public Couverture<PageHtml> questionBinCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionBin").o(questionBin);

	/**	<br/>L'entité « questionBin »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l005.C001L005InstallerMaven&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionBin">Trouver l'entité questionBin dans Solr</a>
	 * <br/>
	 * @param questionBin est l'entité déjà construit. 
	 **/
	protected abstract void _questionBin(PageHtml o);

	public PageHtml getQuestionBin() {
		return questionBin;
	}

	public void setQuestionBin(PageHtml questionBin) {
		this.questionBin = questionBin;
		this.questionBinCouverture.dejaInitialise = true;
	}
	protected C001L005InstallerMaven questionBinInit() {
		if(questionBin != null) {
			((C001L005InstallerMaven)this).avantPagePart(questionBin, "questionBin");
			((C001L005InstallerMaven)this).avantPagePart(questionBin, "questionBin");
		}
		if(!questionBinCouverture.dejaInitialise) {
			_questionBin(questionBin);
		}
		questionBin.initLoinPourClasse(requeteSite_);
		questionBinCouverture.dejaInitialise(true);
		return (C001L005InstallerMaven)this;
	}
	public void htmlBodyQuestionBin(PageHtml o) {
		{ e("h3").a("class", " questionBinH3 ").f();
			{ e("i").a("class", questionBinH3I1, " site-menu-icon questionBinH3I ").f();
			} g("i");
			{ e("span").a("class", " questionBinH3Span ").f();
				sx(questionBinH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionBinH4 ").f();
			{ e("i").a("class", questionBinH4I1, " site-menu-icon questionBinH4I ").f();
			} g("i");
			{ e("span").a("class", " questionBinH4Span ").f();
				sx(questionBinH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionBinPre ").f();
			{ e("span").a("class", " questionBinPreSpan1 questionBinPreSpan odd ").f();
				sx(questionBinPreSpan11);
			} g("span");
			{ e("span").a("class", " questionBinPreSpan2 questionBinPreSpan even ").f();
				sx(questionBinPreSpan21);
			} g("span");
			{ e("span").a("class", " questionBinPreSpan3 questionBinPreSpan odd ").f();
				sx(questionBinPreSpan31);
			} g("span");
			{ e("span").a("class", " questionBinPreSpan4 questionBinPreSpan even ").f();
				sx(questionBinPreSpan41);
			} g("span");
			{ e("span").a("class", " questionBinPreSpan5 questionBinPreSpan odd ").f();
				sx(questionBinPreSpan51);
			} g("span");
			{ e("span").a("class", " questionBinPreSpan6 questionBinPreSpan even ").f();
				sx(questionBinPreSpan61);
			} g("span");
			{ e("span").a("class", " questionBinPreSpan7 questionBinPreSpan odd ").f();
				sx(questionBinPreSpan71);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionBinOl2 questionBinOl even ").f();
			{ e("li").a("class", " questionBinOl2Li1 questionBinOl2Li odd ").f();
				sx(questionBinOl2Li11);
			} g("li");
			{ e("li").a("class", " questionBinOl2Li2 questionBinOl2Li even ").f();
				sx(questionBinOl2Li21);
			} g("li");
			{ e("li").a("class", " questionBinOl2Li3 questionBinOl2Li odd ").f();
				sx(questionBinOl2Li31);
			} g("li");
			{ e("li").a("class", " questionBinOl2Li4 questionBinOl2Li even ").f();
				sx(questionBinOl2Li41);
			} g("li");
			{ e("li").a("class", " questionBinOl2Li5 questionBinOl2Li odd ").f();
				sx(questionBinOl2Li51);
			} g("li");
			{ e("li").a("class", " questionBinOl2Li6 questionBinOl2Li even ").f();
				sx(questionBinOl2Li61);
			} g("li");
			{ e("li").a("class", " questionBinOl2Li7 questionBinOl2Li odd ").f();
				sx(questionBinOl2Li71);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionBin() {
		questionBin.htmlAvant();
		htmlBodyQuestionBin(questionBin);
		questionBin.htmlApres();
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
		questionMkdirSrcInit();
		questionMkdirMavenInit();
		questionClonerSourceInit();
		questionListerTagsInit();
		questionCheckoutTagInit();
		questionConstruireSourceInit();
		questionMavenInstalleMavenInit();
		questionBinInit();
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
		if(questionMkdirSrc != null)
			questionMkdirSrc.setRequeteSite_(requeteSite_);
		if(questionMkdirMaven != null)
			questionMkdirMaven.setRequeteSite_(requeteSite_);
		if(questionClonerSource != null)
			questionClonerSource.setRequeteSite_(requeteSite_);
		if(questionListerTags != null)
			questionListerTags.setRequeteSite_(requeteSite_);
		if(questionCheckoutTag != null)
			questionCheckoutTag.setRequeteSite_(requeteSite_);
		if(questionConstruireSource != null)
			questionConstruireSource.setRequeteSite_(requeteSite_);
		if(questionMavenInstalleMaven != null)
			questionMavenInstalleMaven.setRequeteSite_(requeteSite_);
		if(questionBin != null)
			questionBin.setRequeteSite_(requeteSite_);
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
			case "questionMkdirSrc":
				return oC001L005InstallerMaven.questionMkdirSrc;
			case "questionMkdirMaven":
				return oC001L005InstallerMaven.questionMkdirMaven;
			case "questionClonerSource":
				return oC001L005InstallerMaven.questionClonerSource;
			case "questionListerTags":
				return oC001L005InstallerMaven.questionListerTags;
			case "questionCheckoutTag":
				return oC001L005InstallerMaven.questionCheckoutTag;
			case "questionConstruireSource":
				return oC001L005InstallerMaven.questionConstruireSource;
			case "questionMavenInstalleMaven":
				return oC001L005InstallerMaven.questionMavenInstalleMaven;
			case "questionBin":
				return oC001L005InstallerMaven.questionBin;
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
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L005InstallerMaven(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L005InstallerMaven() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L005InstallerMaven(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L005InstallerMaven(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L005InstallerMaven() {
		try {
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
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
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
		if(questionMkdirSrc != null)
			questionMkdirSrc.htmlBodyCourt();
		if(questionMkdirMaven != null)
			questionMkdirMaven.htmlBodyCourt();
		if(questionClonerSource != null)
			questionClonerSource.htmlBodyCourt();
		if(questionListerTags != null)
			questionListerTags.htmlBodyCourt();
		if(questionCheckoutTag != null)
			questionCheckoutTag.htmlBodyCourt();
		if(questionConstruireSource != null)
			questionConstruireSource.htmlBodyCourt();
		if(questionMavenInstalleMaven != null)
			questionMavenInstalleMaven.htmlBodyCourt();
		if(questionBin != null)
			questionBin.htmlBodyCourt();
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
		((C001L005InstallerMaven)this).htmlBodyQuestionMkdirSrc();
		((C001L005InstallerMaven)this).htmlBodyQuestionMkdirMaven();
		((C001L005InstallerMaven)this).htmlBodyQuestionClonerSource();
		((C001L005InstallerMaven)this).htmlBodyQuestionListerTags();
		((C001L005InstallerMaven)this).htmlBodyQuestionCheckoutTag();
		((C001L005InstallerMaven)this).htmlBodyQuestionConstruireSource();
		((C001L005InstallerMaven)this).htmlBodyQuestionMavenInstalleMaven();
		((C001L005InstallerMaven)this).htmlBodyQuestionBin();
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

	public static final String[] C001L005InstallerMavenVals = new String[] { moiP1, moiP2, moiP3, moiP4, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesOl2Li11, questionDependencesOl2Li12, questionDependencesOl2Li13, questionDependencesOl2Li21, questionDependencesOl2Li22, questionDependencesOl2Li31, questionDependencesOl2Li41, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li11, questionDependencesOl4Li21, questionDependencesOl4Li31, questionDependencesOl4Li41, questionDependencesOl4Li51, questionMkdirSrcH3I1, questionMkdirSrcH3Span1, questionMkdirSrcH4I1, questionMkdirSrcH4Span1, questionMkdirSrcPreSpan11, questionMkdirSrcPreSpan21, questionMkdirSrcPreSpan31, questionMkdirSrcPreSpan41, questionMkdirSrcPreSpan51, questionMkdirSrcPreSpan61, questionMkdirSrcPreSpan71, questionMkdirSrcPreSpan81, questionMkdirSrcOl2Li11, questionMkdirSrcOl2Li21, questionMkdirSrcOl2Li31, questionMkdirSrcOl2Li41, questionMkdirSrcOl2Li51, questionMkdirSrcOl2Li61, questionMkdirSrcOl2Li71, questionMkdirSrcOl2Li81, questionMkdirSrcOl2Li82, questionMkdirMavenH3I1, questionMkdirMavenH3Span1, questionMkdirMavenH4I1, questionMkdirMavenH4Span1, questionMkdirMavenPreSpan11, questionMkdirMavenPreSpan21, questionMkdirMavenPreSpan31, questionMkdirMavenPreSpan41, questionMkdirMavenPreSpan51, questionMkdirMavenPreSpan61, questionMkdirMavenPreSpan71, questionMkdirMavenPreSpan81, questionMkdirMavenOl2Li11, questionMkdirMavenOl2Li21, questionMkdirMavenOl2Li31, questionMkdirMavenOl2Li41, questionMkdirMavenOl2Li51, questionMkdirMavenOl2Li61, questionMkdirMavenOl2Li71, questionMkdirMavenOl2Li81, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl2Li11, questionListerTagsOl2Li21, questionListerTagsOl2Li31, questionListerTagsOl2Li41, questionListerTagsOl2Li51, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan61, questionCheckoutTagOl2Li11, questionCheckoutTagOl2Li21, questionCheckoutTagOl2Li31, questionCheckoutTagOl2Li41, questionCheckoutTagOl2Li51, questionCheckoutTagOl2Li61, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePreSpan11, questionConstruireSourcePreSpan21, questionConstruireSourcePreSpan31, questionConstruireSourcePreSpan41, questionConstruireSourcePreSpan51, questionConstruireSourcePreSpan61, questionConstruireSourcePreSpan71, questionConstruireSourceOl2Li11, questionConstruireSourceOl2Li21, questionConstruireSourceOl2Li31, questionConstruireSourceOl2Li41, questionConstruireSourceOl2Li51, questionConstruireSourceOl2Li61, questionConstruireSourceOl2Li71, questionMavenInstalleMavenH3I1, questionMavenInstalleMavenH3Span1, questionMavenInstalleMavenH4I1, questionMavenInstalleMavenH4Span1, questionMavenInstalleMavenH5Span1, questionMavenInstalleMavenP5Span1, questionMavenInstalleMavenP5Span2, questionMavenInstalleMavenP5Span3, questionMavenInstalleMavenP5Span4, questionBinH3I1, questionBinH3Span1, questionBinH4I1, questionBinH4Span1, questionBinPreSpan11, questionBinPreSpan21, questionBinPreSpan31, questionBinPreSpan41, questionBinPreSpan51, questionBinPreSpan61, questionBinPreSpan71, questionBinOl2Li11, questionBinOl2Li21, questionBinOl2Li31, questionBinOl2Li41, questionBinOl2Li51, questionBinOl2Li61, questionBinOl2Li71, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td3Span1I2, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41 };
}
