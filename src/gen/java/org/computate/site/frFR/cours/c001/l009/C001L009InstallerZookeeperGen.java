package org.computate.site.frFR.cours.c001.l009;

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
import java.lang.String;
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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true">Trouver la classe recapituler3 dans Solr</a>
 * <br/>
 **/
public abstract class C001L009InstallerZookeeperGen<DEV> extends C001Lecon {

	public static final String C001L009InstallerZookeeper_UnNom = "le leçon";
	public static final String C001L009InstallerZookeeper_NomSingulier = "leçon";
	public static final String C001L009InstallerZookeeper_NomPluriel = "leçons";
	public static final String C001L009InstallerZookeeper_H1 = "Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? ";
	public static final String C001L009InstallerZookeeper_H2 = "Installer Zookeeper à partir du code source. ";
	public static final String C001L009InstallerZookeeper_Titre = "Comment puis-je tester en développment la configuration en cluster, les demandes, les événements et les sources de données partagées ? Installer Zookeeper à partir du code source. ";
	public static final String C001L009InstallerZookeeper_LesNoms = "les leçons";
	public static final String C001L009InstallerZookeeper_NomVar = "leçon";
	public static final String C001L009InstallerZookeeper_Couleur = "green";
	public static final String C001L009InstallerZookeeper_IconeGroupe = "regular";
	public static final String C001L009InstallerZookeeper_IconeNom = "question";
	public static final String C001L009InstallerZookeeperFrFRPage_Uri = "/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper";
	public static final String C001L009InstallerZookeeperFrFRPage_ImageUri = "/png/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper-999.png";
	public static final String C001L009InstallerZookeeperEnUSPage_Uri = "/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper";
	public static final String C001L009InstallerZookeeperEnUSPage_ImageUri = "/png/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper-999.png";

	//////////////////////
	// zookeeperVersion //
	//////////////////////

	/**	L'entité « zookeeperVersion »
	 *	 is defined as null before being initialized. 
	 */
	protected String zookeeperVersion;
	public Couverture<String> zookeeperVersionCouverture = new Couverture<String>().p(this).c(String.class).var("zookeeperVersion").o(zookeeperVersion);

	/**	<br/>L'entité « zookeeperVersion »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:zookeeperVersion">Trouver l'entité zookeeperVersion dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _zookeeperVersion(Couverture<String> c);

	public String getZookeeperVersion() {
		return zookeeperVersion;
	}

	public void setZookeeperVersion(String zookeeperVersion) {
		this.zookeeperVersion = zookeeperVersion;
		this.zookeeperVersionCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper zookeeperVersionInit() {
		if(!zookeeperVersionCouverture.dejaInitialise) {
			_zookeeperVersion(zookeeperVersionCouverture);
			if(zookeeperVersion == null)
				setZookeeperVersion(zookeeperVersionCouverture.o);
		}
		zookeeperVersionCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}

	public String solrZookeeperVersion() {
		return zookeeperVersion;
	}

	public String strZookeeperVersion() {
		return zookeeperVersion == null ? "" : zookeeperVersion;
	}

	public String nomAffichageZookeeperVersion() {
		return null;
	}

	public String htmTooltipZookeeperVersion() {
		return null;
	}

	public String htmZookeeperVersion() {
		return zookeeperVersion == null ? "" : StringEscapeUtils.escapeHtml4(strZookeeperVersion());
	}

	//////////////////
	// zookeeperTag //
	//////////////////

	/**	L'entité « zookeeperTag »
	 *	 is defined as null before being initialized. 
	 */
	protected String zookeeperTag;
	public Couverture<String> zookeeperTagCouverture = new Couverture<String>().p(this).c(String.class).var("zookeeperTag").o(zookeeperTag);

	/**	<br/>L'entité « zookeeperTag »
	 *  est défini comme null avant d'être initialisé. 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:zookeeperTag">Trouver l'entité zookeeperTag dans Solr</a>
	 * <br/>
	 * @param c est pour envelopper une valeur à assigner à cette entité lors de l'initialisation. 
	 **/
	protected abstract void _zookeeperTag(Couverture<String> c);

	public String getZookeeperTag() {
		return zookeeperTag;
	}

	public void setZookeeperTag(String zookeeperTag) {
		this.zookeeperTag = zookeeperTag;
		this.zookeeperTagCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper zookeeperTagInit() {
		if(!zookeeperTagCouverture.dejaInitialise) {
			_zookeeperTag(zookeeperTagCouverture);
			if(zookeeperTag == null)
				setZookeeperTag(zookeeperTagCouverture.o);
		}
		zookeeperTagCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}

	public String solrZookeeperTag() {
		return zookeeperTag;
	}

	public String strZookeeperTag() {
		return zookeeperTag == null ? "" : zookeeperTag;
	}

	public String nomAffichageZookeeperTag() {
		return null;
	}

	public String htmTooltipZookeeperTag() {
		return null;
	}

	public String htmZookeeperTag() {
		return zookeeperTag == null ? "" : StringEscapeUtils.escapeHtml4(strZookeeperTag());
	}

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "Une application Web conçue pour grandir doit être créée à l'aide d'un gestionnaire de cluster centralisé tel que Zookeper. ";
	public static final String moiP3 = "Zookeeper a beaucoup de travail pour résoudre les bugs et les conditions de concurrence inévitables dans les applications distribuées. ";
	public static final String moiP4 = "Vous bénéficierez d'une configuration en cluster, d'un pool de sources de données partagées, de threads de travail en arrière-plan partagés et d'un bus d'événements en cluster pour les demandes misent à l'échelle et d'équilibrage de la charge. ";
	public static final String moiP5 = "Je vous aiderai à installer la version la plus récente de Zookeeper pour mettre à l'échelle votre site Web de manière open source. ";
	public static final String moiP = moiP1 + moiP2 + moiP3 + moiP4 + moiP5;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L009InstallerZookeeper moiInit() {
		if(moi != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(moi, "moi");
			((C001L009InstallerZookeeper)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
			sx(moiP4);
			sx(moiP5);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	///////////////////
	// personnaliser //
	///////////////////

	/**	L'entité « personnaliser »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml personnaliser = new PageHtml();
	public Couverture<PageHtml> personnaliserCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("personnaliser").o(personnaliser);

	/**	<br/>L'entité « personnaliser »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:personnaliser">Trouver l'entité personnaliser dans Solr</a>
	 * <br/>
	 * @param personnaliser est l'entité déjà construit. 
	 **/
	protected abstract void _personnaliser(PageHtml o);

	public PageHtml getPersonnaliser() {
		return personnaliser;
	}

	public void setPersonnaliser(PageHtml personnaliser) {
		this.personnaliser = personnaliser;
		this.personnaliserCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper personnaliserInit() {
		if(personnaliser != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(personnaliser, "personnaliser");
			((C001L009InstallerZookeeper)this).avantPagePart(personnaliser, "personnaliser");
		}
		if(!personnaliserCouverture.dejaInitialise) {
			_personnaliser(personnaliser);
		}
		personnaliser.initLoinPourClasse(requeteSite_);
		personnaliserCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyPersonnaliser(PageHtml o) {
	}
	public void htmlBodyPersonnaliser() {
		personnaliser.htmlAvant();
		htmlBodyPersonnaliser(personnaliser);
		personnaliser.htmlApres();
	}

	/////////////////////////
	// questionDependences //
	/////////////////////////

	public static final String questionDependencesH3I1 = "far fa-conveyor-belt-alt";
	public static final String questionDependencesH3I = questionDependencesH3I1;
	public static final String questionDependencesH3Span1 = "Comment installer les dépendences pour Zookeeper ? ";
	public static final String questionDependencesH3Span = questionDependencesH3Span1;
	public static final String questionDependencesH4I1 = "far fa-cookie";
	public static final String questionDependencesH4I = questionDependencesH4I1;
	public static final String questionDependencesH4Span1 = "Construisez les dépendances avec yum. ";
	public static final String questionDependencesH4Span = questionDependencesH4Span1;
	public static final String questionDependencesPre1Span11 = "sudo";
	public static final String questionDependencesPre1Span1 = questionDependencesPre1Span11;
	public static final String questionDependencesPre1Span21 = " yum";
	public static final String questionDependencesPre1Span2 = questionDependencesPre1Span21;
	public static final String questionDependencesPre1Span31 = " install";
	public static final String questionDependencesPre1Span3 = questionDependencesPre1Span31;
	public static final String questionDependencesPre1Span41 = " -y";
	public static final String questionDependencesPre1Span4 = questionDependencesPre1Span41;
	public static final String questionDependencesPre1Span51 = " ivy lsof maven ant libtool automake cppunit cppunit-devel python-setuptools";
	public static final String questionDependencesPre1Span5 = questionDependencesPre1Span51;
	public static final String questionDependencesOl2Li1Dt1 = "sudo";
	public static final String questionDependencesOl2Li1Dt = questionDependencesOl2Li1Dt1;
	public static final String questionDependencesOl2Li1Dd1 = ": La commande pour installer des dépots yum commence par la commande sudo. ";
	public static final String questionDependencesOl2Li1Dd2 = "La commande \"sudo\" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. ";
	public static final String questionDependencesOl2Li1Dd3 = "L'installation des dépots yum nécessite toujours les privilèges root. ";
	public static final String questionDependencesOl2Li1Dd = questionDependencesOl2Li1Dd1 + questionDependencesOl2Li1Dd2 + questionDependencesOl2Li1Dd3;
	public static final String questionDependencesOl2Li2Dt1 = "yum";
	public static final String questionDependencesOl2Li2Dt = questionDependencesOl2Li2Dt1;
	public static final String questionDependencesOl2Li2Dd1 = "yum Signifie \"Yellowdog Updater Modified\", mais personne ne le connait comme yellowdog, juste yum. ";
	public static final String questionDependencesOl2Li2Dd2 = "CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. ";
	public static final String questionDependencesOl2Li2Dd = questionDependencesOl2Li2Dd1 + questionDependencesOl2Li2Dd2;
	public static final String questionDependencesOl2Li3Dt1 = "install";
	public static final String questionDependencesOl2Li3Dt = questionDependencesOl2Li3Dt1;
	public static final String questionDependencesOl2Li3Dd1 = " : Pour installer des nouveaux paquets yum. ";
	public static final String questionDependencesOl2Li3Dd = questionDependencesOl2Li3Dd1;
	public static final String questionDependencesOl2Li4Dt1 = "-y";
	public static final String questionDependencesOl2Li4Dt = questionDependencesOl2Li4Dt1;
	public static final String questionDependencesOl2Li4Dd1 = " : Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. ";
	public static final String questionDependencesOl2Li4Dd = questionDependencesOl2Li4Dd1;
	public static final String questionDependencesOl2Li5Dt1 = "ivy lsof maven ant libtool automake cppunit cppunit-devel python-setuptools";
	public static final String questionDependencesOl2Li5Dt = questionDependencesOl2Li5Dt1;
	public static final String questionDependencesOl2Li5Dd1 = " : Les noms de paquets des dépendances pour la construction de Zookeeper à partir du code source. ";
	public static final String questionDependencesOl2Li5Dd = questionDependencesOl2Li5Dd1;

	/**	L'entité « questionDependences »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDependences = new PageHtml();
	public Couverture<PageHtml> questionDependencesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDependences").o(questionDependences);

	/**	<br/>L'entité « questionDependences »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
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
	protected C001L009InstallerZookeeper questionDependencesInit() {
		if(questionDependences != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionDependences, "questionDependences");
			((C001L009InstallerZookeeper)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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
			{ e("span").a("class", " questionDependencesPre1Span5 questionDependencesPre1Span odd ").f();
				sx(questionDependencesPre1Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDependencesOl2 questionDependencesOl even ").f();
			{ e("li").a("class", " questionDependencesOl2Li1 questionDependencesOl2Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl2Li1Dt ").f();
					sx(questionDependencesOl2Li1Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li1Dd ").f();
					sx(questionDependencesOl2Li1Dd1);
					sx(questionDependencesOl2Li1Dd2);
					sx(questionDependencesOl2Li1Dd3);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li2 questionDependencesOl2Li even ").f();
				{ e("dt").a("class", " questionDependencesOl2Li2Dt ").f();
					sx(questionDependencesOl2Li2Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li2Dd ").f();
					sx(questionDependencesOl2Li2Dd1);
					sx(questionDependencesOl2Li2Dd2);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li3 questionDependencesOl2Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl2Li3Dt ").f();
					sx(questionDependencesOl2Li3Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li3Dd ").f();
					sx(questionDependencesOl2Li3Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li4 questionDependencesOl2Li even ").f();
				{ e("dt").a("class", " questionDependencesOl2Li4Dt ").f();
					sx(questionDependencesOl2Li4Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li4Dd ").f();
					sx(questionDependencesOl2Li4Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionDependencesOl2Li5 questionDependencesOl2Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl2Li5Dt ").f();
					sx(questionDependencesOl2Li5Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl2Li5Dd ").f();
					sx(questionDependencesOl2Li5Dd1);
				} g("dd");
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

	public static final String questionMkdirSrcH3I1 = "far fa-files-medical";
	public static final String questionMkdirSrcH3I = questionMkdirSrcH3I1;
	public static final String questionMkdirSrcH3Span1 = "Où est-ce que je place le code source Zookeeper ? ";
	public static final String questionMkdirSrcH3Span = questionMkdirSrcH3Span1;
	public static final String questionMkdirSrcH4I1 = "far fa-folder-tree";
	public static final String questionMkdirSrcH4I = questionMkdirSrcH4I1;
	public static final String questionMkdirSrcH4Span1 = "Créez un répertoire zookeeper dans /usr/local/src. ";
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
	public static final String questionMkdirSrcPreSpan81 = " /usr/local/src/zookeeper";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMkdirSrc">Trouver l'entité questionMkdirSrc dans Solr</a>
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
	protected C001L009InstallerZookeeper questionMkdirSrcInit() {
		if(questionMkdirSrc != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
			((C001L009InstallerZookeeper)this).avantPagePart(questionMkdirSrc, "questionMkdirSrc");
		}
		if(!questionMkdirSrcCouverture.dejaInitialise) {
			_questionMkdirSrc(questionMkdirSrc);
		}
		questionMkdirSrc.initLoinPourClasse(requeteSite_);
		questionMkdirSrcCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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

	//////////////////////////
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-cloud-download";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "Comment télécharger le code source de Zookeeper ? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "fab fa-git";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Cloner le code source avec la commande git. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " https://github.com/apache/zookeeper.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/zookeeper";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone : Cloner un référentiel dans un répertoire. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "git://git.zookeeper.org/git/zookeeper.git : URL git vers le référentiel de code source Zookeeper. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/zookeeper : Répertoire dans lequel le code source Zookeeper sera cloné. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
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
	protected C001L009InstallerZookeeper questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L009InstallerZookeeper)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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

	public static final String questionListerTagsH3I1 = "far fa-code-branch";
	public static final String questionListerTagsH3I = questionListerTagsH3I1;
	public static final String questionListerTagsH3Span1 = "Comment choisir une version récente de Zookeeper ? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tag";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "Listez toutes les tags du référentiel git. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/zookeeper";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl2Li11 = "(cd : Changer de répertoire temporairement avec la parenthèse ouverte. ";
	public static final String questionListerTagsOl2Li1 = questionListerTagsOl2Li11;
	public static final String questionListerTagsOl2Li21 = "/usr/local/src/zookeeper : Répertoire dans lequel le code source Zookeeper a été cloné. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
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
	protected C001L009InstallerZookeeper questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L009InstallerZookeeper)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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

	public static final String questionCheckoutTagH3I1 = "far fa-code-merge";
	public static final String questionCheckoutTagH3I = questionCheckoutTagH3I1;
	public static final String questionCheckoutTagH3Span1 = "Comment changer de version du code source de Zookeeper ? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-code-commit";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout la tag git. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/zookeeper";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan6Span11 = " ";
	public static final String questionCheckoutTagPreSpan6Span1 = questionCheckoutTagPreSpan6Span11;
	public static final String questionCheckoutTagPreSpan6Span21 = "release-3.5.5";
	public static final String questionCheckoutTagPreSpan6Span2 = questionCheckoutTagPreSpan6Span21;
	public static final String questionCheckoutTagPreSpan6Span31 = ")";
	public static final String questionCheckoutTagPreSpan6Span3 = questionCheckoutTagPreSpan6Span31;
	public static final String questionCheckoutTagOl2Li11 = "(cd";
	public static final String questionCheckoutTagOl2Li1 = questionCheckoutTagOl2Li11;
	public static final String questionCheckoutTagOl2Li21 = "/usr/local/src/zookeeper";
	public static final String questionCheckoutTagOl2Li2 = questionCheckoutTagOl2Li21;
	public static final String questionCheckoutTagOl2Li31 = "&&";
	public static final String questionCheckoutTagOl2Li3 = questionCheckoutTagOl2Li31;
	public static final String questionCheckoutTagOl2Li41 = "git";
	public static final String questionCheckoutTagOl2Li4 = questionCheckoutTagOl2Li41;
	public static final String questionCheckoutTagOl2Li51 = "checkout : Checkout une branche dans l’arbre de travail. ";
	public static final String questionCheckoutTagOl2Li5 = questionCheckoutTagOl2Li51;
	public static final String questionCheckoutTagOl2Li6Span11 = "release-3.5.5";
	public static final String questionCheckoutTagOl2Li6Span1 = questionCheckoutTagOl2Li6Span11;
	public static final String questionCheckoutTagOl2Li6Span21 = ") : La dernière tag pour baser la branche. ";
	public static final String questionCheckoutTagOl2Li6Span2 = questionCheckoutTagOl2Li6Span21;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
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
	protected C001L009InstallerZookeeper questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L009InstallerZookeeper)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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
				{ e("span").a("class", " questionCheckoutTagPreSpan6Span1 questionCheckoutTagPreSpan6Span odd ").f();
					sx(questionCheckoutTagPreSpan6Span11);
				} g("span");
				{ e("span").a("class", " questionCheckoutTagPreSpan6Span2 questionCheckoutTagPreSpan6Span even ").f();
					sx(utilisateurId == null ? questionCheckoutTagPreSpan6Span21 : zookeeperTag);
				} g("span");
				{ e("span").a("class", " questionCheckoutTagPreSpan6Span3 questionCheckoutTagPreSpan6Span odd ").f();
					sx(questionCheckoutTagPreSpan6Span31);
				} g("span");
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
				{ e("span").a("class", " questionCheckoutTagOl2Li6Span1 questionCheckoutTagOl2Li6Span odd ").f();
					sx(utilisateurId == null ? questionCheckoutTagOl2Li6Span11 : zookeeperTag);
				} g("span");
				{ e("span").a("class", " questionCheckoutTagOl2Li6Span2 questionCheckoutTagOl2Li6Span even ").f();
					sx(questionCheckoutTagOl2Li6Span21);
				} g("span");
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

	public static final String questionConstruireSourceH3I1 = "far fa-tools";
	public static final String questionConstruireSourceH3I = questionConstruireSourceH3I1;
	public static final String questionConstruireSourceH3Span1 = "Comment contruire le code source de Zookeeper ? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-terminal";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Construisez Zookeeper avec la commande configure. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePre1Span011 = "(cd";
	public static final String questionConstruireSourcePre1Span01 = questionConstruireSourcePre1Span011;
	public static final String questionConstruireSourcePre1Span021 = " /usr/local/src/zookeeper";
	public static final String questionConstruireSourcePre1Span02 = questionConstruireSourcePre1Span021;
	public static final String questionConstruireSourcePre1Span031 = " &&";
	public static final String questionConstruireSourcePre1Span03 = questionConstruireSourcePre1Span031;
	public static final String questionConstruireSourcePre1Span041 = " ant";
	public static final String questionConstruireSourcePre1Span04 = questionConstruireSourcePre1Span041;
	public static final String questionConstruireSourcePre1Span051 = " package)";
	public static final String questionConstruireSourcePre1Span05 = questionConstruireSourcePre1Span051;
	public static final String questionConstruireSourceOl1Li011 = "(cd";
	public static final String questionConstruireSourceOl1Li01 = questionConstruireSourceOl1Li011;
	public static final String questionConstruireSourceOl1Li021 = "/usr/local/src/zookeeper";
	public static final String questionConstruireSourceOl1Li02 = questionConstruireSourceOl1Li021;
	public static final String questionConstruireSourceOl1Li031 = "&&";
	public static final String questionConstruireSourceOl1Li03 = questionConstruireSourceOl1Li031;
	public static final String questionConstruireSourceOl1Li041 = "ant : Un script de configuration C++ pour compiler Zookeeper. ";
	public static final String questionConstruireSourceOl1Li04 = questionConstruireSourceOl1Li041;
	public static final String questionConstruireSourceOl1Li051 = "package) : Construisez Zookeeper avec le support OpenSSL pour des connexions TLS sécurisées à la base de données. ";
	public static final String questionConstruireSourceOl1Li05 = questionConstruireSourceOl1Li051;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
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
	protected C001L009InstallerZookeeper questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L009InstallerZookeeper)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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
		{ e("pre").a("class", " questionConstruireSourcePre1 questionConstruireSourcePre odd ").f();
			{ e("span").a("class", " questionConstruireSourcePre1Span01 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span011);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span02 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span021);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span03 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span031);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span04 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span041);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span05 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span051);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl1 questionConstruireSourceOl odd ").f();
			{ e("li").a("class", " questionConstruireSourceOl1Li01 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li011);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li02 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li021);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li03 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li031);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li04 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li041);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li05 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li051);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionConstruireSource() {
		questionConstruireSource.htmlAvant();
		htmlBodyQuestionConstruireSource(questionConstruireSource);
		questionConstruireSource.htmlApres();
	}

	//////////////////////////
	// questionMkdirServeur //
	//////////////////////////

	public static final String questionMkdirServeurH3I1 = "far fa-map-pin";
	public static final String questionMkdirServeurH3I = questionMkdirServeurH3I1;
	public static final String questionMkdirServeurH3Span1 = "Après avoir compilé Zookeeper, où puis-je l'installer en tant que serveur? ";
	public static final String questionMkdirServeurH3Span = questionMkdirServeurH3Span1;
	public static final String questionMkdirServeurH4I1 = "far fa-folder-tree";
	public static final String questionMkdirServeurH4I = questionMkdirServeurH4I1;
	public static final String questionMkdirServeurH4Span1 = "Créez un répertoire zookeeper dans /srv. ";
	public static final String questionMkdirServeurH4Span = questionMkdirServeurH4Span1;
	public static final String questionMkdirServeurPreSpan11 = "sudo";
	public static final String questionMkdirServeurPreSpan1 = questionMkdirServeurPreSpan11;
	public static final String questionMkdirServeurPreSpan21 = " install";
	public static final String questionMkdirServeurPreSpan2 = questionMkdirServeurPreSpan21;
	public static final String questionMkdirServeurPreSpan31 = " -d";
	public static final String questionMkdirServeurPreSpan3 = questionMkdirServeurPreSpan31;
	public static final String questionMkdirServeurPreSpan41 = " -o";
	public static final String questionMkdirServeurPreSpan4 = questionMkdirServeurPreSpan41;
	public static final String questionMkdirServeurPreSpan51 = " $USER";
	public static final String questionMkdirServeurPreSpan5 = questionMkdirServeurPreSpan51;
	public static final String questionMkdirServeurPreSpan61 = " -g";
	public static final String questionMkdirServeurPreSpan6 = questionMkdirServeurPreSpan61;
	public static final String questionMkdirServeurPreSpan71 = " $USER";
	public static final String questionMkdirServeurPreSpan7 = questionMkdirServeurPreSpan71;
	public static final String questionMkdirServeurPreSpan81 = " /srv/zookeeper";
	public static final String questionMkdirServeurPreSpan8 = questionMkdirServeurPreSpan81;
	public static final String questionMkdirServeurOl1Li11 = "sudo";
	public static final String questionMkdirServeurOl1Li1 = questionMkdirServeurOl1Li11;
	public static final String questionMkdirServeurOl1Li21 = "install";
	public static final String questionMkdirServeurOl1Li2 = questionMkdirServeurOl1Li21;
	public static final String questionMkdirServeurOl1Li31 = "-d";
	public static final String questionMkdirServeurOl1Li3 = questionMkdirServeurOl1Li31;
	public static final String questionMkdirServeurOl1Li41 = "-o";
	public static final String questionMkdirServeurOl1Li4 = questionMkdirServeurOl1Li41;
	public static final String questionMkdirServeurOl1Li51 = "$USER";
	public static final String questionMkdirServeurOl1Li5 = questionMkdirServeurOl1Li51;
	public static final String questionMkdirServeurOl1Li61 = "-g";
	public static final String questionMkdirServeurOl1Li6 = questionMkdirServeurOl1Li61;
	public static final String questionMkdirServeurOl1Li71 = "$USER";
	public static final String questionMkdirServeurOl1Li7 = questionMkdirServeurOl1Li71;
	public static final String questionMkdirServeurOl1Li81 = "/srv est un bon endroit pour installer des serveurs logicielles open source telles que Zookeeper qui fonctionnent comme un service. ";
	public static final String questionMkdirServeurOl1Li8 = questionMkdirServeurOl1Li81;
	public static final String questionMkdirServeurPre2Span11 = "rsync";
	public static final String questionMkdirServeurPre2Span1 = questionMkdirServeurPre2Span11;
	public static final String questionMkdirServeurPre2Span21 = " -r";
	public static final String questionMkdirServeurPre2Span2 = questionMkdirServeurPre2Span21;
	public static final String questionMkdirServeurPre2Span31 = " /usr/local/src/zookeeper/build/zookeeper-3.5.5-beta/";
	public static final String questionMkdirServeurPre2Span3 = questionMkdirServeurPre2Span31;
	public static final String questionMkdirServeurPre2Span41 = " /srv/maven/";
	public static final String questionMkdirServeurPre2Span4 = questionMkdirServeurPre2Span41;
	public static final String questionMkdirServeurOl2Li11 = "rsync: Un outil de copie de fichiers rapide et polyvalent, distant (et local). ";
	public static final String questionMkdirServeurOl2Li1 = questionMkdirServeurOl2Li11;
	public static final String questionMkdirServeurOl2Li21 = "-r: Recurse dans des répertoires. ";
	public static final String questionMkdirServeurOl2Li2 = questionMkdirServeurOl2Li21;
	public static final String questionMkdirServeurOl2Li31 = "/tmp/maven/ : Le répertoire où l'application maven a été construite. ";
	public static final String questionMkdirServeurOl2Li32 = "/tmp/maven/ : N'oubliez pas le slash à la fin ou rsync suppose qu'il s'agit d'un fichier dans la destination. ";
	public static final String questionMkdirServeurOl2Li3 = questionMkdirServeurOl2Li31 + questionMkdirServeurOl2Li32;
	public static final String questionMkdirServeurOl2Li41 = "/opt/maven/ : Le répertoire où le maven sera installé.";
	public static final String questionMkdirServeurOl2Li42 = "/opt/maven/ : C'est préférable de toujours écrire des répertoires avec un slash dans rsync pour éviter les surprises. ";
	public static final String questionMkdirServeurOl2Li4 = questionMkdirServeurOl2Li41 + questionMkdirServeurOl2Li42;

	/**	L'entité « questionMkdirServeur »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirServeur = new PageHtml();
	public Couverture<PageHtml> questionMkdirServeurCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirServeur").o(questionMkdirServeur);

	/**	<br/>L'entité « questionMkdirServeur »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMkdirServeur">Trouver l'entité questionMkdirServeur dans Solr</a>
	 * <br/>
	 * @param questionMkdirServeur est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirServeur(PageHtml o);

	public PageHtml getQuestionMkdirServeur() {
		return questionMkdirServeur;
	}

	public void setQuestionMkdirServeur(PageHtml questionMkdirServeur) {
		this.questionMkdirServeur = questionMkdirServeur;
		this.questionMkdirServeurCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionMkdirServeurInit() {
		if(questionMkdirServeur != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
			((C001L009InstallerZookeeper)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
		}
		if(!questionMkdirServeurCouverture.dejaInitialise) {
			_questionMkdirServeur(questionMkdirServeur);
		}
		questionMkdirServeur.initLoinPourClasse(requeteSite_);
		questionMkdirServeurCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionMkdirServeur(PageHtml o) {
		{ e("h3").a("class", " questionMkdirServeurH3 ").f();
			{ e("i").a("class", questionMkdirServeurH3I1, " site-menu-icon questionMkdirServeurH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirServeurH3Span ").f();
				sx(questionMkdirServeurH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirServeurH4 ").f();
			{ e("i").a("class", questionMkdirServeurH4I1, " site-menu-icon questionMkdirServeurH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirServeurH4Span ").f();
				sx(questionMkdirServeurH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirServeurPre ").f();
			{ e("span").a("class", " questionMkdirServeurPreSpan1 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan2 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan3 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan4 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan5 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan6 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan7 questionMkdirServeurPreSpan odd ").f();
				sx(questionMkdirServeurPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPreSpan8 questionMkdirServeurPreSpan even ").f();
				sx(questionMkdirServeurPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirServeurOl1 questionMkdirServeurOl odd ").f();
			{ e("li").a("class", " questionMkdirServeurOl1Li1 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li2 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li3 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li4 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li5 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li6 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li7 questionMkdirServeurOl1Li odd ").f();
				sx(questionMkdirServeurOl1Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl1Li8 questionMkdirServeurOl1Li even ").f();
				sx(questionMkdirServeurOl1Li81);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionMkdirServeurPre2 questionMkdirServeurPre even ").f();
			{ e("span").a("class", " questionMkdirServeurPre2Span1 questionMkdirServeurPre2Span odd ").f();
				sx(questionMkdirServeurPre2Span11);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre2Span2 questionMkdirServeurPre2Span even ").f();
				sx(questionMkdirServeurPre2Span21);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre2Span3 questionMkdirServeurPre2Span odd ").f();
				sx(questionMkdirServeurPre2Span31);
			} g("span");
			{ e("span").a("class", " questionMkdirServeurPre2Span4 questionMkdirServeurPre2Span even ").f();
				sx(questionMkdirServeurPre2Span41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirServeurOl2 questionMkdirServeurOl even ").f();
			{ e("li").a("class", " questionMkdirServeurOl2Li1 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li2 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li3 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li31);
				sx(questionMkdirServeurOl2Li32);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li4 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li41);
				sx(questionMkdirServeurOl2Li42);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirServeur() {
		questionMkdirServeur.htmlAvant();
		htmlBodyQuestionMkdirServeur(questionMkdirServeur);
		questionMkdirServeur.htmlApres();
	}

	/////////////////////
	// questionDonnees //
	/////////////////////

	public static final String questionDonneesH3I1 = "far fa-database";
	public static final String questionDonneesH3I = questionDonneesH3I1;
	public static final String questionDonneesH3Span1 = "Comment créer une nouvelle base de données Zookeeper ? ";
	public static final String questionDonneesH3Span = questionDonneesH3Span1;
	public static final String questionDonneesH4I1 = "far fa-table";
	public static final String questionDonneesH4I = questionDonneesH4I1;
	public static final String questionDonneesH4Span1 = "Comment initialiser un nouveau serveur Zookeeper. ";
	public static final String questionDonneesH4Span = questionDonneesH4Span1;

	/**	L'entité « questionDonnees »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDonnees = new PageHtml();
	public Couverture<PageHtml> questionDonneesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDonnees").o(questionDonnees);

	/**	<br/>L'entité « questionDonnees »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionDonnees">Trouver l'entité questionDonnees dans Solr</a>
	 * <br/>
	 * @param questionDonnees est l'entité déjà construit. 
	 **/
	protected abstract void _questionDonnees(PageHtml o);

	public PageHtml getQuestionDonnees() {
		return questionDonnees;
	}

	public void setQuestionDonnees(PageHtml questionDonnees) {
		this.questionDonnees = questionDonnees;
		this.questionDonneesCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionDonneesInit() {
		if(questionDonnees != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionDonnees, "questionDonnees");
			((C001L009InstallerZookeeper)this).avantPagePart(questionDonnees, "questionDonnees");
		}
		if(!questionDonneesCouverture.dejaInitialise) {
			_questionDonnees(questionDonnees);
		}
		questionDonnees.initLoinPourClasse(requeteSite_);
		questionDonneesCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionDonnees(PageHtml o) {
		{ e("h3").a("class", " questionDonneesH3 ").f();
			{ e("i").a("class", questionDonneesH3I1, " site-menu-icon questionDonneesH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDonneesH3Span ").f();
				sx(questionDonneesH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDonneesH4 ").f();
			{ e("i").a("class", questionDonneesH4I1, " site-menu-icon questionDonneesH4I ").f();
			} g("i");
			{ e("span").a("class", " questionDonneesH4Span ").f();
				sx(questionDonneesH4Span1);
			} g("span");
		} g("h4");
	}
	public void htmlBodyQuestionDonnees() {
		questionDonnees.htmlAvant();
		htmlBodyQuestionDonnees(questionDonnees);
		questionDonnees.htmlApres();
	}

	/////////////////////
	// questionService //
	/////////////////////

	public static final String questionServiceH3I1 = "far fa-alarm-clock";
	public static final String questionServiceH3I = questionServiceH3I1;
	public static final String questionServiceH3Span1 = "Comment puis-je exécuter Zookeeper tout le temps au démarrage de mon ordinateur ? ";
	public static final String questionServiceH3Span = questionServiceH3Span1;
	public static final String questionServiceH4I1 = "far fa-layer-plus";
	public static final String questionServiceH4I = questionServiceH4I1;
	public static final String questionServiceH4Span1 = "Comment exécuter Zookeeper en tant que service systemd. ";
	public static final String questionServiceH4Span = questionServiceH4Span1;
	public static final String questionServicePreSpan11 = "echo '";
	public static final String questionServicePreSpan1 = questionServicePreSpan11;
	public static final String questionServicePreSpan1Br1 = "[Unit]";
	public static final String questionServicePreSpan1Br = questionServicePreSpan1Br1;
	public static final String questionServicePreSpan2Br1 = "Description=Serveur de base de données Zookeeper. ";
	public static final String questionServicePreSpan2Br = questionServicePreSpan2Br1;
	public static final String questionServicePreSpan3Br1 = "After=syslog.target network.target";
	public static final String questionServicePreSpan3Br2 = "";
	public static final String questionServicePreSpan3Br3 = "[Service]";
	public static final String questionServicePreSpan3Br4 = "Type=forking";
	public static final String questionServicePreSpan3Br5 = "Environment=PGDATA=/srv/zookeeper PGPORT=5432";
	public static final String questionServicePreSpan3Br6 = "User='\"$USER\"'";
	public static final String questionServicePreSpan3Br7 = "Group='\"$USER\"'";
	public static final String questionServicePreSpan3Br8 = "ExecStart=/opt/zookeeper/bin/pg_ctl start -D ${PGDATA} -s -o \"-p ${PGPORT}\" -w -t 300";
	public static final String questionServicePreSpan3Br9 = "ExecStop=/opt/zookeeper/bin/pg_ctl stop -D ${PGDATA} -s -m fast";
	public static final String questionServicePreSpan3Br10 = "ExecReload=/opt/zookeeper/bin/pg_ctl reload -D ${PGDATA} -s";
	public static final String questionServicePreSpan3Br11 = "TimeoutSec=300";
	public static final String questionServicePreSpan3Br12 = "";
	public static final String questionServicePreSpan3Br13 = "[Install]";
	public static final String questionServicePreSpan3Br14 = "WantedBy=multi-user.target";
	public static final String questionServicePreSpan3Br15 = "' | sudo tee /usr/lib/systemd/system/zookeeper.service";
	public static final String questionServicePreSpan3Br = questionServicePreSpan3Br1 + questionServicePreSpan3Br2 + questionServicePreSpan3Br3 + questionServicePreSpan3Br4 + questionServicePreSpan3Br5 + questionServicePreSpan3Br6 + questionServicePreSpan3Br7 + questionServicePreSpan3Br8 + questionServicePreSpan3Br9 + questionServicePreSpan3Br10 + questionServicePreSpan3Br11 + questionServicePreSpan3Br12 + questionServicePreSpan3Br13 + questionServicePreSpan3Br14 + questionServicePreSpan3Br15;
	public static final String questionServiceOl2Li011 = "echo '...' : Écrivez une chaîne dans la console. ";
	public static final String questionServiceOl2Li01 = questionServiceOl2Li011;
	public static final String questionServiceOl2Li021 = "[Unit] : Un fichier de configuration « Unit » dont le nom se termine par \".service\" code les informations relatives à un processus contrôlé et supervisé par systemd. ";
	public static final String questionServiceOl2Li02 = questionServiceOl2Li021;
	public static final String questionServiceOl2Li031 = "Description=... : La description du service. ";
	public static final String questionServiceOl2Li03 = questionServiceOl2Li031;
	public static final String questionServiceOl2Li041 = "After=... : Demander un mot de passe pour le nouveau super utilisateur. ";
	public static final String questionServiceOl2Li04 = questionServiceOl2Li041;
	public static final String questionServiceOl2Li051 = "[Service] : Les informations relatives à un service contrôlé et supervisé par systemd. ";
	public static final String questionServiceOl2Li05 = questionServiceOl2Li051;
	public static final String questionServiceOl2Li061 = "Type=forking : Parce qu'il est prévu que le processus configuré avec ExecStart= appelle fork() pendant son démarrage. ";
	public static final String questionServiceOl2Li06 = questionServiceOl2Li061;
	public static final String questionServiceOl2Li071 = "Environment=PGDATA=/srv/zookeeper PGPORT=5432 : Définir le répertoire de données Zookeeper et le port comme variables d’environnement du système à utiliser plus tard dans des commandes. ";
	public static final String questionServiceOl2Li07 = questionServiceOl2Li071;
	public static final String questionServiceOl2Li081 = "User=... : L'utilisateur en tant que l'utilisateur actuel qui exécutera le service. ";
	public static final String questionServiceOl2Li08 = questionServiceOl2Li081;
	public static final String questionServiceOl2Li091 = "Group=... : L'utilisateur de groupe en tant que l'utilisateur actuel qui exécutera le service. ";
	public static final String questionServiceOl2Li09 = questionServiceOl2Li091;
	public static final String questionServiceOl2Li101 = "ExecStart=... : La commande Zookeeper qui lancera le service. ";
	public static final String questionServiceOl2Li10 = questionServiceOl2Li101;
	public static final String questionServiceOl2Li111 = "ExecStart=... : La commande Zookeeper qui arrêtera le service. ";
	public static final String questionServiceOl2Li11 = questionServiceOl2Li111;
	public static final String questionServiceOl2Li121 = "ExecReload=... : La commande Zookeeper qui redémarrera le service. ";
	public static final String questionServiceOl2Li12 = questionServiceOl2Li121;
	public static final String questionServiceOl2Li131 = "TimeoutSec=300 : Le nombre de secondes avant d'abandonner le démarrage du service. ";
	public static final String questionServiceOl2Li13 = questionServiceOl2Li131;
	public static final String questionServiceOl2Li141 = "[Install] : Cette section est facultative et permet de définir le comportement ou une unité s’il est activé ou désactivé. ";
	public static final String questionServiceOl2Li14 = questionServiceOl2Li141;
	public static final String questionServiceOl2Li151 = "WantedBy=multi-user.target : Lorsque le service est activé, un répertoire appelé multi-user.target.wants sera créé dans /etc/systemd/system (s'il n'est pas déjà disponible) et un lien symbolique vers l'unité actuelle sera placé dans celui-ci. ";
	public static final String questionServiceOl2Li15 = questionServiceOl2Li151;
	public static final String questionServiceOl2Li161 = "| : Lisez la chaîne dans la commande suivante. ";
	public static final String questionServiceOl2Li16 = questionServiceOl2Li161;
	public static final String questionServiceOl2Li171 = "sudo";
	public static final String questionServiceOl2Li17 = questionServiceOl2Li171;
	public static final String questionServiceOl2Li181 = "tee : Ecrire une chaîne dans un fichier. ";
	public static final String questionServiceOl2Li18 = questionServiceOl2Li181;
	public static final String questionServiceOl2Li191 = "/usr/lib/systemd/system/zookeeper.service : Un nouveau fichier de service systemd dans lequel écrire pour Zookeeper. ";
	public static final String questionServiceOl2Li19 = questionServiceOl2Li191;

	/**	L'entité « questionService »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionService = new PageHtml();
	public Couverture<PageHtml> questionServiceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionService").o(questionService);

	/**	<br/>L'entité « questionService »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionService">Trouver l'entité questionService dans Solr</a>
	 * <br/>
	 * @param questionService est l'entité déjà construit. 
	 **/
	protected abstract void _questionService(PageHtml o);

	public PageHtml getQuestionService() {
		return questionService;
	}

	public void setQuestionService(PageHtml questionService) {
		this.questionService = questionService;
		this.questionServiceCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionServiceInit() {
		if(questionService != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionService, "questionService");
			((C001L009InstallerZookeeper)this).avantPagePart(questionService, "questionService");
		}
		if(!questionServiceCouverture.dejaInitialise) {
			_questionService(questionService);
		}
		questionService.initLoinPourClasse(requeteSite_);
		questionServiceCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionService(PageHtml o) {
		{ e("h3").a("class", " questionServiceH3 ").f();
			{ e("i").a("class", questionServiceH3I1, " site-menu-icon questionServiceH3I ").f();
			} g("i");
			{ e("span").a("class", " questionServiceH3Span ").f();
				sx(questionServiceH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionServiceH4 ").f();
			{ e("i").a("class", questionServiceH4I1, " site-menu-icon questionServiceH4I ").f();
			} g("i");
			{ e("span").a("class", " questionServiceH4Span ").f();
				sx(questionServiceH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionServicePre ").f();
			{ e("span").a("class", " questionServicePreSpan1 questionServicePreSpan odd ").f();
				sx(questionServicePreSpan11);
				e("br").fg();
				sx(questionServicePreSpan1Br1);
			} g("span");
			{ e("span").a("class", " questionServicePreSpan2 questionServicePreSpan even ").f();
				e("br").fg();
				sx(questionServicePreSpan2Br1);
			} g("span");
			{ e("span").a("class", " questionServicePreSpan3 questionServicePreSpan odd ").f();
				e("br").fg();
				sx(questionServicePreSpan3Br1);
				e("br").fg();
				sx(questionServicePreSpan3Br2);
				e("br").fg();
				sx(questionServicePreSpan3Br3);
				e("br").fg();
				sx(questionServicePreSpan3Br4);
				e("br").fg();
				sx(questionServicePreSpan3Br5);
				e("br").fg();
				sx(questionServicePreSpan3Br6);
				e("br").fg();
				sx(questionServicePreSpan3Br7);
				e("br").fg();
				sx(questionServicePreSpan3Br8);
				e("br").fg();
				sx(questionServicePreSpan3Br9);
				e("br").fg();
				sx(questionServicePreSpan3Br10);
				e("br").fg();
				sx(questionServicePreSpan3Br11);
				e("br").fg();
				sx(questionServicePreSpan3Br12);
				e("br").fg();
				sx(questionServicePreSpan3Br13);
				e("br").fg();
				sx(questionServicePreSpan3Br14);
				e("br").fg();
				sx(questionServicePreSpan3Br15);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionServiceOl2 questionServiceOl even ").f();
			{ e("li").a("class", " questionServiceOl2Li01 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li011);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li02 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li021);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li03 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li031);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li04 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li041);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li05 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li051);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li06 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li061);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li07 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li071);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li08 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li081);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li09 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li091);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li10 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li101);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li11 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li111);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li12 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li121);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li13 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li131);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li14 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li141);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li15 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li151);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li16 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li161);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li17 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li171);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li18 questionServiceOl2Li even ").f();
				sx(questionServiceOl2Li181);
			} g("li");
			{ e("li").a("class", " questionServiceOl2Li19 questionServiceOl2Li odd ").f();
				sx(questionServiceOl2Li191);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionService() {
		questionService.htmlAvant();
		htmlBodyQuestionService(questionService);
		questionService.htmlApres();
	}

	///////////////////////////////////
	// questionSystemctlDaemonReload //
	///////////////////////////////////

	public static final String questionSystemctlDaemonReloadH3I1 = "far fa-search";
	public static final String questionSystemctlDaemonReloadH3I = questionSystemctlDaemonReloadH3I1;
	public static final String questionSystemctlDaemonReloadH3Span1 = "Comment le système connaît-il le nouveau service ? ";
	public static final String questionSystemctlDaemonReloadH3Span = questionSystemctlDaemonReloadH3Span1;
	public static final String questionSystemctlDaemonReloadH4I1 = "far fa-redo-alt";
	public static final String questionSystemctlDaemonReloadH4I = questionSystemctlDaemonReloadH4I1;
	public static final String questionSystemctlDaemonReloadH4Span1 = "Rechargez le daemon systemd. ";
	public static final String questionSystemctlDaemonReloadH4Span = questionSystemctlDaemonReloadH4Span1;
	public static final String questionSystemctlDaemonReloadPreSpan11 = "sudo";
	public static final String questionSystemctlDaemonReloadPreSpan1 = questionSystemctlDaemonReloadPreSpan11;
	public static final String questionSystemctlDaemonReloadPreSpan21 = " systemctl";
	public static final String questionSystemctlDaemonReloadPreSpan2 = questionSystemctlDaemonReloadPreSpan21;
	public static final String questionSystemctlDaemonReloadPreSpan31 = " daemon-reload";
	public static final String questionSystemctlDaemonReloadPreSpan3 = questionSystemctlDaemonReloadPreSpan31;
	public static final String questionSystemctlDaemonReloadOl2Li11 = "sudo";
	public static final String questionSystemctlDaemonReloadOl2Li1 = questionSystemctlDaemonReloadOl2Li11;
	public static final String questionSystemctlDaemonReloadOl2Li21 = "systemctl : Contrôle le système systemd et le gestionnaire de services. ";
	public static final String questionSystemctlDaemonReloadOl2Li2 = questionSystemctlDaemonReloadOl2Li21;
	public static final String questionSystemctlDaemonReloadOl2Li31 = "daemon-reload : Rechargez le fichier de configuration d'une unité systemd. ";
	public static final String questionSystemctlDaemonReloadOl2Li3 = questionSystemctlDaemonReloadOl2Li31;

	/**	L'entité « questionSystemctlDaemonReload »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlDaemonReload = new PageHtml();
	public Couverture<PageHtml> questionSystemctlDaemonReloadCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlDaemonReload").o(questionSystemctlDaemonReload);

	/**	<br/>L'entité « questionSystemctlDaemonReload »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlDaemonReload">Trouver l'entité questionSystemctlDaemonReload dans Solr</a>
	 * <br/>
	 * @param questionSystemctlDaemonReload est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlDaemonReload(PageHtml o);

	public PageHtml getQuestionSystemctlDaemonReload() {
		return questionSystemctlDaemonReload;
	}

	public void setQuestionSystemctlDaemonReload(PageHtml questionSystemctlDaemonReload) {
		this.questionSystemctlDaemonReload = questionSystemctlDaemonReload;
		this.questionSystemctlDaemonReloadCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionSystemctlDaemonReloadInit() {
		if(questionSystemctlDaemonReload != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
		}
		if(!questionSystemctlDaemonReloadCouverture.dejaInitialise) {
			_questionSystemctlDaemonReload(questionSystemctlDaemonReload);
		}
		questionSystemctlDaemonReload.initLoinPourClasse(requeteSite_);
		questionSystemctlDaemonReloadCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionSystemctlDaemonReload(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlDaemonReloadH3 ").f();
			{ e("i").a("class", questionSystemctlDaemonReloadH3I1, " site-menu-icon questionSystemctlDaemonReloadH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlDaemonReloadH3Span ").f();
				sx(questionSystemctlDaemonReloadH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlDaemonReloadH4 ").f();
			{ e("i").a("class", questionSystemctlDaemonReloadH4I1, " site-menu-icon questionSystemctlDaemonReloadH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlDaemonReloadH4Span ").f();
				sx(questionSystemctlDaemonReloadH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlDaemonReloadPre ").f();
			{ e("span").a("class", " questionSystemctlDaemonReloadPreSpan1 questionSystemctlDaemonReloadPreSpan odd ").f();
				sx(questionSystemctlDaemonReloadPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlDaemonReloadPreSpan2 questionSystemctlDaemonReloadPreSpan even ").f();
				sx(questionSystemctlDaemonReloadPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlDaemonReloadPreSpan3 questionSystemctlDaemonReloadPreSpan odd ").f();
				sx(questionSystemctlDaemonReloadPreSpan31);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlDaemonReloadOl2 questionSystemctlDaemonReloadOl even ").f();
			{ e("li").a("class", " questionSystemctlDaemonReloadOl2Li1 questionSystemctlDaemonReloadOl2Li odd ").f();
				sx(questionSystemctlDaemonReloadOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlDaemonReloadOl2Li2 questionSystemctlDaemonReloadOl2Li even ").f();
				sx(questionSystemctlDaemonReloadOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlDaemonReloadOl2Li3 questionSystemctlDaemonReloadOl2Li odd ").f();
				sx(questionSystemctlDaemonReloadOl2Li31);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSystemctlDaemonReload() {
		questionSystemctlDaemonReload.htmlAvant();
		htmlBodyQuestionSystemctlDaemonReload(questionSystemctlDaemonReload);
		questionSystemctlDaemonReload.htmlApres();
	}

	/////////////////////////////
	// questionSystemctlEnable //
	/////////////////////////////

	public static final String questionSystemctlEnableH3I1 = "far fa-toggle-off";
	public static final String questionSystemctlEnableH3I = questionSystemctlEnableH3I1;
	public static final String questionSystemctlEnableH3Span1 = "Comment activer le service Zookeeper? ";
	public static final String questionSystemctlEnableH3Span = questionSystemctlEnableH3Span1;
	public static final String questionSystemctlEnableH4I1 = "far fa-toggle-on";
	public static final String questionSystemctlEnableH4I = questionSystemctlEnableH4I1;
	public static final String questionSystemctlEnableH4Span1 = "Utilisez la commande systemctl enable. ";
	public static final String questionSystemctlEnableH4Span = questionSystemctlEnableH4Span1;
	public static final String questionSystemctlEnablePreSpan11 = "sudo";
	public static final String questionSystemctlEnablePreSpan1 = questionSystemctlEnablePreSpan11;
	public static final String questionSystemctlEnablePreSpan21 = " systemctl";
	public static final String questionSystemctlEnablePreSpan2 = questionSystemctlEnablePreSpan21;
	public static final String questionSystemctlEnablePreSpan31 = " enable";
	public static final String questionSystemctlEnablePreSpan3 = questionSystemctlEnablePreSpan31;
	public static final String questionSystemctlEnablePreSpan41 = " zookeeper";
	public static final String questionSystemctlEnablePreSpan4 = questionSystemctlEnablePreSpan41;
	public static final String questionSystemctlEnableOl2Li11 = "sudo";
	public static final String questionSystemctlEnableOl2Li1 = questionSystemctlEnableOl2Li11;
	public static final String questionSystemctlEnableOl2Li21 = "systemctl";
	public static final String questionSystemctlEnableOl2Li2 = questionSystemctlEnableOl2Li21;
	public static final String questionSystemctlEnableOl2Li31 = "enable : Activer un ou plusieurs fichiers d'unités ou instances de fichiers d'unités. ";
	public static final String questionSystemctlEnableOl2Li3 = questionSystemctlEnableOl2Li31;
	public static final String questionSystemctlEnableOl2Li41 = "zookeeper : Activez le service Zookeeper pour démarrer au démarrage de l'ordinateur. ";
	public static final String questionSystemctlEnableOl2Li4 = questionSystemctlEnableOl2Li41;

	/**	L'entité « questionSystemctlEnable »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlEnable = new PageHtml();
	public Couverture<PageHtml> questionSystemctlEnableCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlEnable").o(questionSystemctlEnable);

	/**	<br/>L'entité « questionSystemctlEnable »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlEnable">Trouver l'entité questionSystemctlEnable dans Solr</a>
	 * <br/>
	 * @param questionSystemctlEnable est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlEnable(PageHtml o);

	public PageHtml getQuestionSystemctlEnable() {
		return questionSystemctlEnable;
	}

	public void setQuestionSystemctlEnable(PageHtml questionSystemctlEnable) {
		this.questionSystemctlEnable = questionSystemctlEnable;
		this.questionSystemctlEnableCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionSystemctlEnableInit() {
		if(questionSystemctlEnable != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
		}
		if(!questionSystemctlEnableCouverture.dejaInitialise) {
			_questionSystemctlEnable(questionSystemctlEnable);
		}
		questionSystemctlEnable.initLoinPourClasse(requeteSite_);
		questionSystemctlEnableCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionSystemctlEnable(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlEnableH3 ").f();
			{ e("i").a("class", questionSystemctlEnableH3I1, " site-menu-icon questionSystemctlEnableH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlEnableH3Span ").f();
				sx(questionSystemctlEnableH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlEnableH4 ").f();
			{ e("i").a("class", questionSystemctlEnableH4I1, " site-menu-icon questionSystemctlEnableH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlEnableH4Span ").f();
				sx(questionSystemctlEnableH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlEnablePre ").f();
			{ e("span").a("class", " questionSystemctlEnablePreSpan1 questionSystemctlEnablePreSpan odd ").f();
				sx(questionSystemctlEnablePreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlEnablePreSpan2 questionSystemctlEnablePreSpan even ").f();
				sx(questionSystemctlEnablePreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlEnablePreSpan3 questionSystemctlEnablePreSpan odd ").f();
				sx(questionSystemctlEnablePreSpan31);
			} g("span");
			{ e("span").a("class", " questionSystemctlEnablePreSpan4 questionSystemctlEnablePreSpan even ").f();
				sx(questionSystemctlEnablePreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlEnableOl2 questionSystemctlEnableOl even ").f();
			{ e("li").a("class", " questionSystemctlEnableOl2Li1 questionSystemctlEnableOl2Li odd ").f();
				sx(questionSystemctlEnableOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlEnableOl2Li2 questionSystemctlEnableOl2Li even ").f();
				sx(questionSystemctlEnableOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlEnableOl2Li3 questionSystemctlEnableOl2Li odd ").f();
				sx(questionSystemctlEnableOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSystemctlEnableOl2Li4 questionSystemctlEnableOl2Li even ").f();
				sx(questionSystemctlEnableOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSystemctlEnable() {
		questionSystemctlEnable.htmlAvant();
		htmlBodyQuestionSystemctlEnable(questionSystemctlEnable);
		questionSystemctlEnable.htmlApres();
	}

	////////////////////////////
	// questionSystemctlStart //
	////////////////////////////

	public static final String questionSystemctlStartH3I1 = "far fa-pause-circle";
	public static final String questionSystemctlStartH3I = questionSystemctlStartH3I1;
	public static final String questionSystemctlStartH3Span1 = "Comment démarrer le service Zookeeper? ";
	public static final String questionSystemctlStartH3Span = questionSystemctlStartH3Span1;
	public static final String questionSystemctlStartH4I1 = "far fa-play-circle";
	public static final String questionSystemctlStartH4I = questionSystemctlStartH4I1;
	public static final String questionSystemctlStartH4Span1 = "Utilisez la commande systemctl start. ";
	public static final String questionSystemctlStartH4Span = questionSystemctlStartH4Span1;
	public static final String questionSystemctlStartPreSpan11 = "sudo";
	public static final String questionSystemctlStartPreSpan1 = questionSystemctlStartPreSpan11;
	public static final String questionSystemctlStartPreSpan21 = " systemctl";
	public static final String questionSystemctlStartPreSpan2 = questionSystemctlStartPreSpan21;
	public static final String questionSystemctlStartPreSpan31 = " start";
	public static final String questionSystemctlStartPreSpan3 = questionSystemctlStartPreSpan31;
	public static final String questionSystemctlStartPreSpan41 = " zookeeper";
	public static final String questionSystemctlStartPreSpan4 = questionSystemctlStartPreSpan41;
	public static final String questionSystemctlStartOl2Li11 = "sudo";
	public static final String questionSystemctlStartOl2Li1 = questionSystemctlStartOl2Li11;
	public static final String questionSystemctlStartOl2Li21 = "systemctl";
	public static final String questionSystemctlStartOl2Li2 = questionSystemctlStartOl2Li21;
	public static final String questionSystemctlStartOl2Li31 = "start : Activer un ou plusieurs services. ";
	public static final String questionSystemctlStartOl2Li3 = questionSystemctlStartOl2Li31;
	public static final String questionSystemctlStartOl2Li41 = "zookeeper : Démarrez le service Zookeeper. ";
	public static final String questionSystemctlStartOl2Li4 = questionSystemctlStartOl2Li41;

	/**	L'entité « questionSystemctlStart »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStart = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStartCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStart").o(questionSystemctlStart);

	/**	<br/>L'entité « questionSystemctlStart »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlStart">Trouver l'entité questionSystemctlStart dans Solr</a>
	 * <br/>
	 * @param questionSystemctlStart est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlStart(PageHtml o);

	public PageHtml getQuestionSystemctlStart() {
		return questionSystemctlStart;
	}

	public void setQuestionSystemctlStart(PageHtml questionSystemctlStart) {
		this.questionSystemctlStart = questionSystemctlStart;
		this.questionSystemctlStartCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionSystemctlStartInit() {
		if(questionSystemctlStart != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
		}
		if(!questionSystemctlStartCouverture.dejaInitialise) {
			_questionSystemctlStart(questionSystemctlStart);
		}
		questionSystemctlStart.initLoinPourClasse(requeteSite_);
		questionSystemctlStartCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionSystemctlStart(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlStartH3 ").f();
			{ e("i").a("class", questionSystemctlStartH3I1, " site-menu-icon questionSystemctlStartH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStartH3Span ").f();
				sx(questionSystemctlStartH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlStartH4 ").f();
			{ e("i").a("class", questionSystemctlStartH4I1, " site-menu-icon questionSystemctlStartH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStartH4Span ").f();
				sx(questionSystemctlStartH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlStartPre ").f();
			{ e("span").a("class", " questionSystemctlStartPreSpan1 questionSystemctlStartPreSpan odd ").f();
				sx(questionSystemctlStartPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlStartPreSpan2 questionSystemctlStartPreSpan even ").f();
				sx(questionSystemctlStartPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlStartPreSpan3 questionSystemctlStartPreSpan odd ").f();
				sx(questionSystemctlStartPreSpan31);
			} g("span");
			{ e("span").a("class", " questionSystemctlStartPreSpan4 questionSystemctlStartPreSpan even ").f();
				sx(questionSystemctlStartPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlStartOl2 questionSystemctlStartOl even ").f();
			{ e("li").a("class", " questionSystemctlStartOl2Li1 questionSystemctlStartOl2Li odd ").f();
				sx(questionSystemctlStartOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlStartOl2Li2 questionSystemctlStartOl2Li even ").f();
				sx(questionSystemctlStartOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlStartOl2Li3 questionSystemctlStartOl2Li odd ").f();
				sx(questionSystemctlStartOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSystemctlStartOl2Li4 questionSystemctlStartOl2Li even ").f();
				sx(questionSystemctlStartOl2Li41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionSystemctlStart() {
		questionSystemctlStart.htmlAvant();
		htmlBodyQuestionSystemctlStart(questionSystemctlStart);
		questionSystemctlStart.htmlApres();
	}

	/////////////////////////////
	// questionSystemctlStatus //
	/////////////////////////////

	public static final String questionSystemctlStatusH3I1 = "far fa-clipboard";
	public static final String questionSystemctlStatusH3I = questionSystemctlStatusH3I1;
	public static final String questionSystemctlStatusH3Span1 = "Comment puis-je m'assurer que le service Zookeeper a démarré avec succès ? ";
	public static final String questionSystemctlStatusH3Span = questionSystemctlStatusH3Span1;
	public static final String questionSystemctlStatusH4I1 = "far fa-clipboard-check";
	public static final String questionSystemctlStatusH4I = questionSystemctlStatusH4I1;
	public static final String questionSystemctlStatusH4Span1 = "Utilisez la commande systemctl status. ";
	public static final String questionSystemctlStatusH4Span = questionSystemctlStatusH4Span1;
	public static final String questionSystemctlStatusPreSpan11 = "sudo";
	public static final String questionSystemctlStatusPreSpan1 = questionSystemctlStatusPreSpan11;
	public static final String questionSystemctlStatusPreSpan21 = " systemctl";
	public static final String questionSystemctlStatusPreSpan2 = questionSystemctlStatusPreSpan21;
	public static final String questionSystemctlStatusPreSpan31 = " status";
	public static final String questionSystemctlStatusPreSpan3 = questionSystemctlStatusPreSpan31;
	public static final String questionSystemctlStatusPreSpan41 = " zookeeper";
	public static final String questionSystemctlStatusPreSpan4 = questionSystemctlStatusPreSpan41;
	public static final String questionSystemctlStatusOl2Li11 = "sudo";
	public static final String questionSystemctlStatusOl2Li1 = questionSystemctlStatusOl2Li11;
	public static final String questionSystemctlStatusOl2Li21 = "systemctl";
	public static final String questionSystemctlStatusOl2Li2 = questionSystemctlStatusOl2Li21;
	public static final String questionSystemctlStatusOl2Li31 = "status : Vérifiez le statut d'un ou plusieurs services. ";
	public static final String questionSystemctlStatusOl2Li3 = questionSystemctlStatusOl2Li31;
	public static final String questionSystemctlStatusOl2Li41 = "zookeeper : Vérifiez le statut du service Zookeeper. ";
	public static final String questionSystemctlStatusOl2Li4 = questionSystemctlStatusOl2Li41;
	public static final String questionSystemctlStatusP21 = "Et voilà, profitez de votre tout nouvel et puissant serveur de base de données open source. ";
	public static final String questionSystemctlStatusP2 = questionSystemctlStatusP21;

	/**	L'entité « questionSystemctlStatus »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStatus = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStatusCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStatus").o(questionSystemctlStatus);

	/**	<br/>L'entité « questionSystemctlStatus »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlStatus">Trouver l'entité questionSystemctlStatus dans Solr</a>
	 * <br/>
	 * @param questionSystemctlStatus est l'entité déjà construit. 
	 **/
	protected abstract void _questionSystemctlStatus(PageHtml o);

	public PageHtml getQuestionSystemctlStatus() {
		return questionSystemctlStatus;
	}

	public void setQuestionSystemctlStatus(PageHtml questionSystemctlStatus) {
		this.questionSystemctlStatus = questionSystemctlStatus;
		this.questionSystemctlStatusCouverture.dejaInitialise = true;
	}
	protected C001L009InstallerZookeeper questionSystemctlStatusInit() {
		if(questionSystemctlStatus != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
			((C001L009InstallerZookeeper)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
		}
		if(!questionSystemctlStatusCouverture.dejaInitialise) {
			_questionSystemctlStatus(questionSystemctlStatus);
		}
		questionSystemctlStatus.initLoinPourClasse(requeteSite_);
		questionSystemctlStatusCouverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyQuestionSystemctlStatus(PageHtml o) {
		{ e("h3").a("class", " questionSystemctlStatusH3 ").f();
			{ e("i").a("class", questionSystemctlStatusH3I1, " site-menu-icon questionSystemctlStatusH3I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStatusH3Span ").f();
				sx(questionSystemctlStatusH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionSystemctlStatusH4 ").f();
			{ e("i").a("class", questionSystemctlStatusH4I1, " site-menu-icon questionSystemctlStatusH4I ").f();
			} g("i");
			{ e("span").a("class", " questionSystemctlStatusH4Span ").f();
				sx(questionSystemctlStatusH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionSystemctlStatusPre ").f();
			{ e("span").a("class", " questionSystemctlStatusPreSpan1 questionSystemctlStatusPreSpan odd ").f();
				sx(questionSystemctlStatusPreSpan11);
			} g("span");
			{ e("span").a("class", " questionSystemctlStatusPreSpan2 questionSystemctlStatusPreSpan even ").f();
				sx(questionSystemctlStatusPreSpan21);
			} g("span");
			{ e("span").a("class", " questionSystemctlStatusPreSpan3 questionSystemctlStatusPreSpan odd ").f();
				sx(questionSystemctlStatusPreSpan31);
			} g("span");
			{ e("span").a("class", " questionSystemctlStatusPreSpan4 questionSystemctlStatusPreSpan even ").f();
				sx(questionSystemctlStatusPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionSystemctlStatusOl2 questionSystemctlStatusOl even ").f();
			{ e("li").a("class", " questionSystemctlStatusOl2Li1 questionSystemctlStatusOl2Li odd ").f();
				sx(questionSystemctlStatusOl2Li11);
			} g("li");
			{ e("li").a("class", " questionSystemctlStatusOl2Li2 questionSystemctlStatusOl2Li even ").f();
				sx(questionSystemctlStatusOl2Li21);
			} g("li");
			{ e("li").a("class", " questionSystemctlStatusOl2Li3 questionSystemctlStatusOl2Li odd ").f();
				sx(questionSystemctlStatusOl2Li31);
			} g("li");
			{ e("li").a("class", " questionSystemctlStatusOl2Li4 questionSystemctlStatusOl2Li even ").f();
				sx(questionSystemctlStatusOl2Li41);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionSystemctlStatusP2 questionSystemctlStatusP even ").f();
			sx(questionSystemctlStatusP21);
		} g("p");
	}
	public void htmlBodyQuestionSystemctlStatus() {
		questionSystemctlStatus.htmlAvant();
		htmlBodyQuestionSystemctlStatus(questionSystemctlStatus);
		questionSystemctlStatus.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L009InstallerZookeeper recapituler1Init() {
		if(recapituler1 != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(recapituler1, "recapituler1");
			((C001L009InstallerZookeeper)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
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

	public static final String recapituler2TableTr1Td11 = "Jeudi ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "far fa-fast-forward";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "far fa-file-code";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "16 Mai 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "Comment installer la dernière version de Zookeeper ? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Installer Zookeeper à partir du code source. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L009InstallerZookeeper recapituler2Init() {
		if(recapituler2 != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(recapituler2, "recapituler2");
			((C001L009InstallerZookeeper)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyRecapituler2(PageHtml o) {
		{ e("table").a("class", " recapituler2Table ").f();
			{ e("tr").a("class", " recapituler2TableTr1 recapituler2TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td1 recapituler2TableTr1Td odd ").f();
					sx(recapituler2TableTr1Td11);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td2 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td2I1, " site-menu-icon recapituler2TableTr1Td2I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td3 recapituler2TableTr1Td odd ").f();
					{ e("i").a("class", recapituler2TableTr1Td3I1, " site-menu-icon recapituler2TableTr1Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr1Td4 recapituler2TableTr1Td even ").f();
					{ e("i").a("class", recapituler2TableTr1Td4I1, " site-menu-icon recapituler2TableTr1Td4I ").f();
					} g("i");
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler2TableTr2 recapituler2TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td1 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td11);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td2 recapituler2TableTr2Td even ").f();
					sx(recapituler2TableTr2Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td3 recapituler2TableTr2Td odd ").f();
					sx(recapituler2TableTr2Td31);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler2TableTr2Td4 recapituler2TableTr2Td even ").f();
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
	public static final String recapituler3TableTr02Td1I1 = "far fa-conveyor-belt-alt";
	public static final String recapituler3TableTr02Td1I = recapituler3TableTr02Td1I1;
	public static final String recapituler3TableTr02Td21 = "Comment installer les dépendences pour certbot ? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Construisez les dépendances avec yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Où dois-je placer les certificats, les clés et les magasins de clés pour mon site ? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Créez un répertoire certbot dans /srv. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-file-certificate";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Comment puis-je obtenir mon certificat ? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "far fa-stamp";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Utilisez la commande certbot. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-key";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "Comment utiliser le certificat et la clé générés par certbot ? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "far fa-copy";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Copiez les fichiers certbot avec la commande install. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-users-crown";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "Comment puis-je obtenir les certificats letencrypt racine et CA ? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-copy";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Téléchargez les certificats racine et CA avec la commande curl. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-object-group";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "Comment créer une version fusionnée de certificats de site, de certificats d'autorité et de certificat racine ? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-cat";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Créez un certificat fusionné avec la commande cat. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-file-certificate";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "Comment créer une chaîne de confiance de certificat pkcs12 ? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-shield-alt";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Utilisez la commande openssl pour créer un fichier .p12. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-store";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "Comment créer un magasin de clés Java pour les chaînes de certificats dans les applications Java? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Utilisez la commande keytool pour créer un fichier .jks. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-key";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "Comment créer un magasin de clés Java pour mon clé secret dans les applications Java? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Utilisez la commande keytool pour créer un fichier .jceks. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L009InstallerZookeeper recapituler3Init() {
		if(recapituler3 != null) {
			((C001L009InstallerZookeeper)this).avantPagePart(recapituler3, "recapituler3");
			((C001L009InstallerZookeeper)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L009InstallerZookeeper)this;
	}
	public void htmlBodyRecapituler3(PageHtml o) {
		{ e("table").a("class", " recapituler3Table ").f();
			{ e("tr").a("class", " recapituler3TableTr01 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr01Td1I1, " site-menu-icon recapituler3TableTr01Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr01Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr01Td3I1, " site-menu-icon recapituler3TableTr01Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr01Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr01Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr02 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr02Td1I1, " site-menu-icon recapituler3TableTr02Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr02Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td3 recapituler3TableTr odd ").f();
					{ e("span").a("class", " recapituler3TableTr02Td3Span1 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span1I1, " site-menu-icon recapituler3TableTr02Td3Span1I ").f();
						} g("i");
					} g("span");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr02Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr02Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr03 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr03Td1I1, " site-menu-icon recapituler3TableTr03Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr03Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr03Td3I1, " site-menu-icon recapituler3TableTr03Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr03Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr03Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr04 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr04Td1I1, " site-menu-icon recapituler3TableTr04Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr04Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td3 recapituler3TableTr odd ").f();
					{ e("span").a("class", " recapituler3TableTr04Td3Span1 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr04Td3Span1I1, " site-menu-icon recapituler3TableTr04Td3Span1I ").f();
						} g("i");
					} g("span");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr04Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr04Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr05 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr05Td1I1, " site-menu-icon recapituler3TableTr05Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr05Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr05Td3I1, " site-menu-icon recapituler3TableTr05Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr05Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr05Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr06 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr06Td1I1, " site-menu-icon recapituler3TableTr06Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr06Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr06Td3I1, " site-menu-icon recapituler3TableTr06Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr06Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr06Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr07 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr07Td1I1, " site-menu-icon recapituler3TableTr07Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr07Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr07Td3I1, " site-menu-icon recapituler3TableTr07Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr07Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr07Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr08 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr08Td1I1, " site-menu-icon recapituler3TableTr08Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr08Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr08Td3I1, " site-menu-icon recapituler3TableTr08Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr08Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr08Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr09 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td1 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr09Td1I1, " site-menu-icon recapituler3TableTr09Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td2 recapituler3TableTr even ").f();
					sx(recapituler3TableTr09Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td3 recapituler3TableTr odd ").f();
					{ e("i").a("class", recapituler3TableTr09Td3I1, " site-menu-icon recapituler3TableTr09Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr09Td4 recapituler3TableTr even ").f();
					sx(recapituler3TableTr09Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr10 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td1 recapituler3TableTr1 odd ").f();
					{ e("i").a("class", recapituler3TableTr10Td1I1, " site-menu-icon recapituler3TableTr10Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td2 recapituler3TableTr1 even ").f();
					sx(recapituler3TableTr10Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td3 recapituler3TableTr1 odd ").f();
					{ e("i").a("class", recapituler3TableTr10Td3I1, " site-menu-icon recapituler3TableTr10Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr10Td4 recapituler3TableTr1 even ").f();
					sx(recapituler3TableTr10Td41);
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

	protected boolean dejaInitialiseC001L009InstallerZookeeper = false;

	public C001L009InstallerZookeeper initLoinC001L009InstallerZookeeper(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L009InstallerZookeeper) {
			dejaInitialiseC001L009InstallerZookeeper = true;
			initLoinC001L009InstallerZookeeper();
		}
		return (C001L009InstallerZookeeper)this;
	}

	public void initLoinC001L009InstallerZookeeper() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L009InstallerZookeeper();
	}

	public void initC001L009InstallerZookeeper() {
		zookeeperVersionInit();
		zookeeperTagInit();
		moiInit();
		personnaliserInit();
		questionDependencesInit();
		questionMkdirSrcInit();
		questionClonerSourceInit();
		questionListerTagsInit();
		questionCheckoutTagInit();
		questionConstruireSourceInit();
		questionMkdirServeurInit();
		questionDonneesInit();
		questionServiceInit();
		questionSystemctlDaemonReloadInit();
		questionSystemctlEnableInit();
		questionSystemctlStartInit();
		questionSystemctlStatusInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L009InstallerZookeeper(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L009InstallerZookeeper(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(personnaliser != null)
			personnaliser.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrc != null)
			questionMkdirSrc.setRequeteSite_(requeteSite_);
		if(questionClonerSource != null)
			questionClonerSource.setRequeteSite_(requeteSite_);
		if(questionListerTags != null)
			questionListerTags.setRequeteSite_(requeteSite_);
		if(questionCheckoutTag != null)
			questionCheckoutTag.setRequeteSite_(requeteSite_);
		if(questionConstruireSource != null)
			questionConstruireSource.setRequeteSite_(requeteSite_);
		if(questionMkdirServeur != null)
			questionMkdirServeur.setRequeteSite_(requeteSite_);
		if(questionDonnees != null)
			questionDonnees.setRequeteSite_(requeteSite_);
		if(questionService != null)
			questionService.setRequeteSite_(requeteSite_);
		if(questionSystemctlDaemonReload != null)
			questionSystemctlDaemonReload.setRequeteSite_(requeteSite_);
		if(questionSystemctlEnable != null)
			questionSystemctlEnable.setRequeteSite_(requeteSite_);
		if(questionSystemctlStart != null)
			questionSystemctlStart.setRequeteSite_(requeteSite_);
		if(questionSystemctlStatus != null)
			questionSystemctlStatus.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L009InstallerZookeeper(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L009InstallerZookeeper(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L009InstallerZookeeper(String var) {
		C001L009InstallerZookeeper oC001L009InstallerZookeeper = (C001L009InstallerZookeeper)this;
		switch(var) {
			case "zookeeperVersion":
				return oC001L009InstallerZookeeper.zookeeperVersion;
			case "zookeeperTag":
				return oC001L009InstallerZookeeper.zookeeperTag;
			case "moi":
				return oC001L009InstallerZookeeper.moi;
			case "personnaliser":
				return oC001L009InstallerZookeeper.personnaliser;
			case "questionDependences":
				return oC001L009InstallerZookeeper.questionDependences;
			case "questionMkdirSrc":
				return oC001L009InstallerZookeeper.questionMkdirSrc;
			case "questionClonerSource":
				return oC001L009InstallerZookeeper.questionClonerSource;
			case "questionListerTags":
				return oC001L009InstallerZookeeper.questionListerTags;
			case "questionCheckoutTag":
				return oC001L009InstallerZookeeper.questionCheckoutTag;
			case "questionConstruireSource":
				return oC001L009InstallerZookeeper.questionConstruireSource;
			case "questionMkdirServeur":
				return oC001L009InstallerZookeeper.questionMkdirServeur;
			case "questionDonnees":
				return oC001L009InstallerZookeeper.questionDonnees;
			case "questionService":
				return oC001L009InstallerZookeeper.questionService;
			case "questionSystemctlDaemonReload":
				return oC001L009InstallerZookeeper.questionSystemctlDaemonReload;
			case "questionSystemctlEnable":
				return oC001L009InstallerZookeeper.questionSystemctlEnable;
			case "questionSystemctlStart":
				return oC001L009InstallerZookeeper.questionSystemctlStart;
			case "questionSystemctlStatus":
				return oC001L009InstallerZookeeper.questionSystemctlStatus;
			case "recapituler1":
				return oC001L009InstallerZookeeper.recapituler1;
			case "recapituler2":
				return oC001L009InstallerZookeeper.recapituler2;
			case "recapituler3":
				return oC001L009InstallerZookeeper.recapituler3;
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
				o = attribuerC001L009InstallerZookeeper(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L009InstallerZookeeper(String var, Object val) {
		C001L009InstallerZookeeper oC001L009InstallerZookeeper = (C001L009InstallerZookeeper)this;
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
					o = definirC001L009InstallerZookeeper(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L009InstallerZookeeper(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/009-comment-installer-la-derniere-version-de-zookeeper-999.png"));
				System.out.println("C001L009InstallerZookeeperFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/009-how-to-install-the-latest-version-of-zookeeper-999.png"));
				System.out.println("C001L009InstallerZookeeperEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.c001.l009.C001L009InstallerZookeeper"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L009InstallerZookeeper o = new C001L009InstallerZookeeper();
			o.requeteSiteC001L009InstallerZookeeper(requeteSite);
			o.initLoinC001L009InstallerZookeeper(requeteSite);
			o.indexerC001L009InstallerZookeeper();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L009InstallerZookeeper();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L009InstallerZookeeper(document);
	}

	public void indexerC001L009InstallerZookeeper(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L009InstallerZookeeper(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L009InstallerZookeeper() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L009InstallerZookeeper(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L009InstallerZookeeper(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L009InstallerZookeeper() {
		try {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L009InstallerZookeeper(siteContexte.getRequeteSite_());
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
		stockerC001L009InstallerZookeeper(solrDocument);
	}
	public void stockerC001L009InstallerZookeeper(SolrDocument solrDocument) {
		C001L009InstallerZookeeper oC001L009InstallerZookeeper = (C001L009InstallerZookeeper)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L009InstallerZookeeper();
	}

	public void htmlBodyCourtC001L009InstallerZookeeper() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(personnaliser != null)
			personnaliser.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrc != null)
			questionMkdirSrc.htmlBodyCourt();
		if(questionClonerSource != null)
			questionClonerSource.htmlBodyCourt();
		if(questionListerTags != null)
			questionListerTags.htmlBodyCourt();
		if(questionCheckoutTag != null)
			questionCheckoutTag.htmlBodyCourt();
		if(questionConstruireSource != null)
			questionConstruireSource.htmlBodyCourt();
		if(questionMkdirServeur != null)
			questionMkdirServeur.htmlBodyCourt();
		if(questionDonnees != null)
			questionDonnees.htmlBodyCourt();
		if(questionService != null)
			questionService.htmlBodyCourt();
		if(questionSystemctlDaemonReload != null)
			questionSystemctlDaemonReload.htmlBodyCourt();
		if(questionSystemctlEnable != null)
			questionSystemctlEnable.htmlBodyCourt();
		if(questionSystemctlStart != null)
			questionSystemctlStart.htmlBodyCourt();
		if(questionSystemctlStatus != null)
			questionSystemctlStatus.htmlBodyCourt();
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
		htmlBodyC001L009InstallerZookeeper();
		super.htmlBody();
	}

	public void htmlBodyC001L009InstallerZookeeper() {
		((C001L009InstallerZookeeper)this).htmlBodyMoi();
		((C001L009InstallerZookeeper)this).htmlBodyPersonnaliser();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionDependences();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionMkdirSrc();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionClonerSource();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionListerTags();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionCheckoutTag();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionConstruireSource();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionMkdirServeur();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionDonnees();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionService();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionSystemctlDaemonReload();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionSystemctlEnable();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionSystemctlStart();
		((C001L009InstallerZookeeper)this).htmlBodyQuestionSystemctlStatus();
		((C001L009InstallerZookeeper)this).htmlBodyRecapituler1();
		((C001L009InstallerZookeeper)this).htmlBodyRecapituler2();
		((C001L009InstallerZookeeper)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L009InstallerZookeeper))
			return false;
		C001L009InstallerZookeeper that = (C001L009InstallerZookeeper)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L009InstallerZookeeper {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L009InstallerZookeeperVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesPre1Span51, questionDependencesOl2Li1Dt1, questionDependencesOl2Li1Dd1, questionDependencesOl2Li1Dd2, questionDependencesOl2Li1Dd3, questionDependencesOl2Li2Dt1, questionDependencesOl2Li2Dd1, questionDependencesOl2Li2Dd2, questionDependencesOl2Li3Dt1, questionDependencesOl2Li3Dd1, questionDependencesOl2Li4Dt1, questionDependencesOl2Li4Dd1, questionDependencesOl2Li5Dt1, questionDependencesOl2Li5Dd1, questionMkdirSrcH3I1, questionMkdirSrcH3Span1, questionMkdirSrcH4I1, questionMkdirSrcH4Span1, questionMkdirSrcPreSpan11, questionMkdirSrcPreSpan21, questionMkdirSrcPreSpan31, questionMkdirSrcPreSpan41, questionMkdirSrcPreSpan51, questionMkdirSrcPreSpan61, questionMkdirSrcPreSpan71, questionMkdirSrcPreSpan81, questionMkdirSrcOl2Li11, questionMkdirSrcOl2Li21, questionMkdirSrcOl2Li31, questionMkdirSrcOl2Li41, questionMkdirSrcOl2Li51, questionMkdirSrcOl2Li61, questionMkdirSrcOl2Li71, questionMkdirSrcOl2Li81, questionMkdirSrcOl2Li82, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl2Li11, questionListerTagsOl2Li21, questionListerTagsOl2Li31, questionListerTagsOl2Li41, questionListerTagsOl2Li51, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan6Span11, questionCheckoutTagPreSpan6Span21, questionCheckoutTagPreSpan6Span31, questionCheckoutTagOl2Li11, questionCheckoutTagOl2Li21, questionCheckoutTagOl2Li31, questionCheckoutTagOl2Li41, questionCheckoutTagOl2Li51, questionCheckoutTagOl2Li6Span11, questionCheckoutTagOl2Li6Span21, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePre1Span011, questionConstruireSourcePre1Span021, questionConstruireSourcePre1Span031, questionConstruireSourcePre1Span041, questionConstruireSourcePre1Span051, questionConstruireSourceOl1Li011, questionConstruireSourceOl1Li021, questionConstruireSourceOl1Li031, questionConstruireSourceOl1Li041, questionConstruireSourceOl1Li051, questionMkdirServeurH3I1, questionMkdirServeurH3Span1, questionMkdirServeurH4I1, questionMkdirServeurH4Span1, questionMkdirServeurPreSpan11, questionMkdirServeurPreSpan21, questionMkdirServeurPreSpan31, questionMkdirServeurPreSpan41, questionMkdirServeurPreSpan51, questionMkdirServeurPreSpan61, questionMkdirServeurPreSpan71, questionMkdirServeurPreSpan81, questionMkdirServeurOl1Li11, questionMkdirServeurOl1Li21, questionMkdirServeurOl1Li31, questionMkdirServeurOl1Li41, questionMkdirServeurOl1Li51, questionMkdirServeurOl1Li61, questionMkdirServeurOl1Li71, questionMkdirServeurOl1Li81, questionMkdirServeurPre2Span11, questionMkdirServeurPre2Span21, questionMkdirServeurPre2Span31, questionMkdirServeurPre2Span41, questionMkdirServeurOl2Li11, questionMkdirServeurOl2Li21, questionMkdirServeurOl2Li31, questionMkdirServeurOl2Li32, questionMkdirServeurOl2Li41, questionMkdirServeurOl2Li42, questionDonneesH3I1, questionDonneesH3Span1, questionDonneesH4I1, questionDonneesH4Span1, questionServiceH3I1, questionServiceH3Span1, questionServiceH4I1, questionServiceH4Span1, questionServicePreSpan11, questionServicePreSpan1Br1, questionServicePreSpan2Br1, questionServicePreSpan3Br1, questionServicePreSpan3Br2, questionServicePreSpan3Br3, questionServicePreSpan3Br4, questionServicePreSpan3Br5, questionServicePreSpan3Br6, questionServicePreSpan3Br7, questionServicePreSpan3Br8, questionServicePreSpan3Br9, questionServicePreSpan3Br10, questionServicePreSpan3Br11, questionServicePreSpan3Br12, questionServicePreSpan3Br13, questionServicePreSpan3Br14, questionServicePreSpan3Br15, questionServiceOl2Li011, questionServiceOl2Li021, questionServiceOl2Li031, questionServiceOl2Li041, questionServiceOl2Li051, questionServiceOl2Li061, questionServiceOl2Li071, questionServiceOl2Li081, questionServiceOl2Li091, questionServiceOl2Li101, questionServiceOl2Li111, questionServiceOl2Li121, questionServiceOl2Li131, questionServiceOl2Li141, questionServiceOl2Li151, questionServiceOl2Li161, questionServiceOl2Li171, questionServiceOl2Li181, questionServiceOl2Li191, questionSystemctlDaemonReloadH3I1, questionSystemctlDaemonReloadH3Span1, questionSystemctlDaemonReloadH4I1, questionSystemctlDaemonReloadH4Span1, questionSystemctlDaemonReloadPreSpan11, questionSystemctlDaemonReloadPreSpan21, questionSystemctlDaemonReloadPreSpan31, questionSystemctlDaemonReloadOl2Li11, questionSystemctlDaemonReloadOl2Li21, questionSystemctlDaemonReloadOl2Li31, questionSystemctlEnableH3I1, questionSystemctlEnableH3Span1, questionSystemctlEnableH4I1, questionSystemctlEnableH4Span1, questionSystemctlEnablePreSpan11, questionSystemctlEnablePreSpan21, questionSystemctlEnablePreSpan31, questionSystemctlEnablePreSpan41, questionSystemctlEnableOl2Li11, questionSystemctlEnableOl2Li21, questionSystemctlEnableOl2Li31, questionSystemctlEnableOl2Li41, questionSystemctlStartH3I1, questionSystemctlStartH3Span1, questionSystemctlStartH4I1, questionSystemctlStartH4Span1, questionSystemctlStartPreSpan11, questionSystemctlStartPreSpan21, questionSystemctlStartPreSpan31, questionSystemctlStartPreSpan41, questionSystemctlStartOl2Li11, questionSystemctlStartOl2Li21, questionSystemctlStartOl2Li31, questionSystemctlStartOl2Li41, questionSystemctlStatusH3I1, questionSystemctlStatusH3Span1, questionSystemctlStatusH4I1, questionSystemctlStatusH4Span1, questionSystemctlStatusPreSpan11, questionSystemctlStatusPreSpan21, questionSystemctlStatusPreSpan31, questionSystemctlStatusPreSpan41, questionSystemctlStatusOl2Li11, questionSystemctlStatusOl2Li21, questionSystemctlStatusOl2Li31, questionSystemctlStatusOl2Li41, questionSystemctlStatusP21, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41 };
}
