package org.computate.site.frFR.cours.c001.l008;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true">Trouver la classe recapituler3 dans Solr</a>
 * <br/>
 **/
public abstract class C001L008CreerCertificatGen<DEV> extends C001Lecon {

	public static final String C001L008CreerCertificat_H1 = "Que puis-je faire une fois que j'ai acheté un nom de domaine ? ";
	public static final String C001L008CreerCertificat_H2 = "Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ";
	public static final String C001L008CreerCertificat_Titre = "Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ";
	public static final String C001L008CreerCertificat_Couleur = "green";
	public static final String C001L008CreerCertificat_IconeGroupe = "regular";
	public static final String C001L008CreerCertificat_IconeNom = "question";
	public static final String C001L008CreerCertificatFrFRPage_Uri = "/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement";
	public static final String C001L008CreerCertificatFrFRPage_ImageUri = "/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png";
	public static final String C001L008CreerCertificatEnUSPage_Uri = "/enUS/course/001/008-how-to-obtain-free-tls-certificates";
	public static final String C001L008CreerCertificatEnUSPage_ImageUri = "/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "Tout d'abord, félicitations pour avoir obtenu votre propre nom de domaine pour lancer votre site. ";
	public static final String moiP3 = "Avec un nom de domaine, vous voudrez également obtenir un certificat TLS. ";
	public static final String moiP4 = "La bonne nouvelle est qu’il est totalement gratuit, grâce à la technologie open source. ";
	public static final String moiP5 = "Avec un certificat vous pouvez sécuriser les communications vers votre site. ";
	public static final String moiP6 = "Vous pouvez signer votre code et vous assurer qu'il est valide lorsqu'il est déployé sur le cloud. ";
	public static final String moiP7 = "Vous pouvez également configurer une connexion sécurisée avec OAuth2/OpenID Connect Single Sign On à toutes vos applications. ";
	public static final String moiP8 = "Je vais vous montrer comment obtenir ces certificats et générer les magasins de clés à utiliser dans vos applications de manière open source. ";
	public static final String moiP = moiP1 + moiP2 + moiP3 + moiP4 + moiP5 + moiP6 + moiP7 + moiP8;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L008CreerCertificat moiInit() {
		if(moi != null) {
			((C001L008CreerCertificat)this).avantPagePart(moi, "moi");
			((C001L008CreerCertificat)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
			sx(moiP3);
			sx(moiP4);
			sx(moiP5);
			sx(moiP6);
			sx(moiP7);
			sx(moiP8);
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

	public static final String questionDependencesH3I1 = "far fa-conveyor-belt-alt";
	public static final String questionDependencesH3I = questionDependencesH3I1;
	public static final String questionDependencesH3Span1 = "Comment installer les dépendences pour certbot ? ";
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
	public static final String questionDependencesPre1Span51 = " epel-release";
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
	public static final String questionDependencesOl2Li5Dt1 = "epel-release";
	public static final String questionDependencesOl2Li5Dt = questionDependencesOl2Li5Dt1;
	public static final String questionDependencesOl2Li5Dd1 = " : Nom du paquet des packages supplémentaires pour le référentiel Enterprise Linux. ";
	public static final String questionDependencesOl2Li5Dd = questionDependencesOl2Li5Dd1;
	public static final String questionDependencesPre3Span11 = "sudo";
	public static final String questionDependencesPre3Span1 = questionDependencesPre3Span11;
	public static final String questionDependencesPre3Span21 = " yum";
	public static final String questionDependencesPre3Span2 = questionDependencesPre3Span21;
	public static final String questionDependencesPre3Span31 = " install";
	public static final String questionDependencesPre3Span3 = questionDependencesPre3Span31;
	public static final String questionDependencesPre3Span41 = " -y";
	public static final String questionDependencesPre3Span4 = questionDependencesPre3Span41;
	public static final String questionDependencesPre3Span51 = " certbot";
	public static final String questionDependencesPre3Span5 = questionDependencesPre3Span51;
	public static final String questionDependencesOl4Li1Dt1 = "sudo";
	public static final String questionDependencesOl4Li1Dt = questionDependencesOl4Li1Dt1;
	public static final String questionDependencesOl4Li2Dt1 = "yum";
	public static final String questionDependencesOl4Li2Dt = questionDependencesOl4Li2Dt1;
	public static final String questionDependencesOl4Li3Dt1 = "install";
	public static final String questionDependencesOl4Li3Dt = questionDependencesOl4Li3Dt1;
	public static final String questionDependencesOl4Li4Dt1 = "-y";
	public static final String questionDependencesOl4Li4Dt = questionDependencesOl4Li4Dt1;
	public static final String questionDependencesOl4Li5Dt1 = "certbot";
	public static final String questionDependencesOl4Li5Dt = questionDependencesOl4Li5Dt1;
	public static final String questionDependencesOl4Li5Dd1 = " : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. ";
	public static final String questionDependencesOl4Li5Dd = questionDependencesOl4Li5Dd1;

	/**	L'entité « questionDependences »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDependences = new PageHtml();
	public Couverture<PageHtml> questionDependencesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDependences").o(questionDependences);

	/**	<br/>L'entité « questionDependences »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionDependences">Trouver l'entité questionDependences dans Solr</a>
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
	protected C001L008CreerCertificat questionDependencesInit() {
		if(questionDependences != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionDependences, "questionDependences");
			((C001L008CreerCertificat)this).avantPagePart(questionDependences, "questionDependences");
		}
		if(!questionDependencesCouverture.dejaInitialise) {
			_questionDependences(questionDependences);
		}
		questionDependences.initLoinPourClasse(requeteSite_);
		questionDependencesCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
				{ e("dt").a("class", " questionDependencesOl4Li1Dt ").f();
					sx(questionDependencesOl4Li1Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li2 questionDependencesOl4Li even ").f();
				{ e("dt").a("class", " questionDependencesOl4Li2Dt ").f();
					sx(questionDependencesOl4Li2Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li3 questionDependencesOl4Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl4Li3Dt ").f();
					sx(questionDependencesOl4Li3Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li4 questionDependencesOl4Li even ").f();
				{ e("dt").a("class", " questionDependencesOl4Li4Dt ").f();
					sx(questionDependencesOl4Li4Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionDependencesOl4Li5 questionDependencesOl4Li odd ").f();
				{ e("dt").a("class", " questionDependencesOl4Li5Dt ").f();
					sx(questionDependencesOl4Li5Dt1);
				} g("dt");
				{ e("dd").a("class", " questionDependencesOl4Li5Dd ").f();
					sx(questionDependencesOl4Li5Dd1);
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
	// questionMkdirSrv //
	//////////////////////

	public static final String questionMkdirSrvH3I1 = "far fa-files-medical";
	public static final String questionMkdirSrvH3I = questionMkdirSrvH3I1;
	public static final String questionMkdirSrvH3Span1 = "Où dois-je placer les certificats, les clés et les magasins de clés pour mon site ? ";
	public static final String questionMkdirSrvH3Span = questionMkdirSrvH3Span1;
	public static final String questionMkdirSrvH4I1 = "far fa-folder-tree";
	public static final String questionMkdirSrvH4I = questionMkdirSrvH4I1;
	public static final String questionMkdirSrvH4Span1 = "Créez un répertoire certbot dans /srv. ";
	public static final String questionMkdirSrvH4Span = questionMkdirSrvH4Span1;
	public static final String questionMkdirSrvPreSpan011 = "sudo";
	public static final String questionMkdirSrvPreSpan01 = questionMkdirSrvPreSpan011;
	public static final String questionMkdirSrvPreSpan021 = " install";
	public static final String questionMkdirSrvPreSpan02 = questionMkdirSrvPreSpan021;
	public static final String questionMkdirSrvPreSpan031 = " -d";
	public static final String questionMkdirSrvPreSpan03 = questionMkdirSrvPreSpan031;
	public static final String questionMkdirSrvPreSpan041 = " -o";
	public static final String questionMkdirSrvPreSpan04 = questionMkdirSrvPreSpan041;
	public static final String questionMkdirSrvPreSpan051 = " $USER";
	public static final String questionMkdirSrvPreSpan05 = questionMkdirSrvPreSpan051;
	public static final String questionMkdirSrvPreSpan061 = " -g";
	public static final String questionMkdirSrvPreSpan06 = questionMkdirSrvPreSpan061;
	public static final String questionMkdirSrvPreSpan071 = " $USER";
	public static final String questionMkdirSrvPreSpan07 = questionMkdirSrvPreSpan071;
	public static final String questionMkdirSrvPreSpan081 = " -m";
	public static final String questionMkdirSrvPreSpan08 = questionMkdirSrvPreSpan081;
	public static final String questionMkdirSrvPreSpan091 = " 700";
	public static final String questionMkdirSrvPreSpan09 = questionMkdirSrvPreSpan091;
	public static final String questionMkdirSrvPreSpan101 = " /srv/certbot";
	public static final String questionMkdirSrvPreSpan10 = questionMkdirSrvPreSpan101;
	public static final String questionMkdirSrvOl2Li01Dt1 = "sudo";
	public static final String questionMkdirSrvOl2Li01Dt = questionMkdirSrvOl2Li01Dt1;
	public static final String questionMkdirSrvOl2Li02Dt1 = "install";
	public static final String questionMkdirSrvOl2Li02Dt = questionMkdirSrvOl2Li02Dt1;
	public static final String questionMkdirSrvOl2Li02Dd1 = " : Crée des répertoires et définit des attributs sur le nouveau répertoire. ";
	public static final String questionMkdirSrvOl2Li02Dd = questionMkdirSrvOl2Li02Dd1;
	public static final String questionMkdirSrvOl2Li03Dt1 = "-d";
	public static final String questionMkdirSrvOl2Li03Dt = questionMkdirSrvOl2Li03Dt1;
	public static final String questionMkdirSrvOl2Li03Dd1 = " : Créez tous les composants des répertoires spécifiés. ";
	public static final String questionMkdirSrvOl2Li03Dd = questionMkdirSrvOl2Li03Dd1;
	public static final String questionMkdirSrvOl2Li04Dt1 = "-o";
	public static final String questionMkdirSrvOl2Li04Dt = questionMkdirSrvOl2Li04Dt1;
	public static final String questionMkdirSrvOl2Li04Dd1 = " : Définir la propriété sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrvOl2Li04Dd = questionMkdirSrvOl2Li04Dd1;
	public static final String questionMkdirSrvOl2Li05Dt1 = "$USER";
	public static final String questionMkdirSrvOl2Li05Dt = questionMkdirSrvOl2Li05Dt1;
	public static final String questionMkdirSrvOl2Li05Dd1 = " : L'utilisateur actuel à rendre le propriétaire du répertoire. ";
	public static final String questionMkdirSrvOl2Li05Dd = questionMkdirSrvOl2Li05Dd1;
	public static final String questionMkdirSrvOl2Li06Dt1 = "-g";
	public static final String questionMkdirSrvOl2Li06Dt = questionMkdirSrvOl2Li06Dt1;
	public static final String questionMkdirSrvOl2Li06Dd1 = " : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrvOl2Li06Dd = questionMkdirSrvOl2Li06Dd1;
	public static final String questionMkdirSrvOl2Li07Dt1 = "$USER";
	public static final String questionMkdirSrvOl2Li07Dt = questionMkdirSrvOl2Li07Dt1;
	public static final String questionMkdirSrvOl2Li07Dd1 = " : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. ";
	public static final String questionMkdirSrvOl2Li07Dd = questionMkdirSrvOl2Li07Dd1;
	public static final String questionMkdirSrvOl2Li08Dt1 = "-m";
	public static final String questionMkdirSrvOl2Li08Dt = questionMkdirSrvOl2Li08Dt1;
	public static final String questionMkdirSrvOl2Li08Dd1 = "-m : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrvOl2Li08Dd = questionMkdirSrvOl2Li08Dd1;
	public static final String questionMkdirSrvOl2Li09Dt1 = "700";
	public static final String questionMkdirSrvOl2Li09Dt = questionMkdirSrvOl2Li09Dt1;
	public static final String questionMkdirSrvOl2Li09Dd1 = " : Accordez des autorisations de lecture, d'écriture et d'exécution à l'utilisateur du répertoire uniquement. ";
	public static final String questionMkdirSrvOl2Li09Dd = questionMkdirSrvOl2Li09Dd1;
	public static final String questionMkdirSrvOl2Li10Dt1 = "/srv/certbot";
	public static final String questionMkdirSrvOl2Li10Dt = questionMkdirSrvOl2Li10Dt1;
	public static final String questionMkdirSrvOl2Li10Dd1 = " : /srv est un bon endroit pour installer des serveurs logicielles open source et vos certificats, clés et magasins de clés. ";
	public static final String questionMkdirSrvOl2Li10Dd = questionMkdirSrvOl2Li10Dd1;

	/**	L'entité « questionMkdirSrv »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirSrv = new PageHtml();
	public Couverture<PageHtml> questionMkdirSrvCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirSrv").o(questionMkdirSrv);

	/**	<br/>L'entité « questionMkdirSrv »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMkdirSrv">Trouver l'entité questionMkdirSrv dans Solr</a>
	 * <br/>
	 * @param questionMkdirSrv est l'entité déjà construit. 
	 **/
	protected abstract void _questionMkdirSrv(PageHtml o);

	public PageHtml getQuestionMkdirSrv() {
		return questionMkdirSrv;
	}

	public void setQuestionMkdirSrv(PageHtml questionMkdirSrv) {
		this.questionMkdirSrv = questionMkdirSrv;
		this.questionMkdirSrvCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionMkdirSrvInit() {
		if(questionMkdirSrv != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirSrv, "questionMkdirSrv");
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirSrv, "questionMkdirSrv");
		}
		if(!questionMkdirSrvCouverture.dejaInitialise) {
			_questionMkdirSrv(questionMkdirSrv);
		}
		questionMkdirSrv.initLoinPourClasse(requeteSite_);
		questionMkdirSrvCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionMkdirSrv(PageHtml o) {
		{ e("h3").a("class", " questionMkdirSrvH3 ").f();
			{ e("i").a("class", questionMkdirSrvH3I1, " site-menu-icon questionMkdirSrvH3I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrvH3Span ").f();
				sx(questionMkdirSrvH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionMkdirSrvH4 ").f();
			{ e("i").a("class", questionMkdirSrvH4I1, " site-menu-icon questionMkdirSrvH4I ").f();
			} g("i");
			{ e("span").a("class", " questionMkdirSrvH4Span ").f();
				sx(questionMkdirSrvH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionMkdirSrvPre ").f();
			{ e("span").a("class", " questionMkdirSrvPreSpan01 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan011);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan02 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan021);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan03 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan031);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan04 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan041);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan05 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan051);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan06 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan061);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan07 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan071);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan08 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan081);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan09 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan091);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan10 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirSrvOl2 questionMkdirSrvOl even ").f();
			{ e("li").a("class", " questionMkdirSrvOl2Li01 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li01Dt ").f();
					sx(questionMkdirSrvOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li02 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li02Dt ").f();
					sx(questionMkdirSrvOl2Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li02Dd ").f();
					sx(questionMkdirSrvOl2Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li03 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li03Dt ").f();
					sx(questionMkdirSrvOl2Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li03Dd ").f();
					sx(questionMkdirSrvOl2Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li04 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li04Dt ").f();
					sx(questionMkdirSrvOl2Li04Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li04Dd ").f();
					sx(questionMkdirSrvOl2Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li05 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li05Dt ").f();
					sx(questionMkdirSrvOl2Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li05Dd ").f();
					sx(questionMkdirSrvOl2Li05Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li06 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li06Dt ").f();
					sx(questionMkdirSrvOl2Li06Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li06Dd ").f();
					sx(questionMkdirSrvOl2Li06Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li07 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li07Dt ").f();
					sx(questionMkdirSrvOl2Li07Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li07Dd ").f();
					sx(questionMkdirSrvOl2Li07Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li08 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li08Dt ").f();
					sx(questionMkdirSrvOl2Li08Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li08Dd ").f();
					sx(questionMkdirSrvOl2Li08Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li09 questionMkdirSrvOl2Li odd ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li09Dt ").f();
					sx(questionMkdirSrvOl2Li09Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li09Dd ").f();
					sx(questionMkdirSrvOl2Li09Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li10 questionMkdirSrvOl2Li even ").f();
				{ e("dt").a("class", " questionMkdirSrvOl2Li10Dt ").f();
					sx(questionMkdirSrvOl2Li10Dt1);
				} g("dt");
				{ e("dd").a("class", " questionMkdirSrvOl2Li10Dd ").f();
					sx(questionMkdirSrvOl2Li10Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionMkdirSrv() {
		questionMkdirSrv.htmlAvant();
		htmlBodyQuestionMkdirSrv(questionMkdirSrv);
		questionMkdirSrv.htmlApres();
	}

	/////////////////////
	// questionCertbot //
	/////////////////////

	public static final String questionCertbotH3I1 = "far fa-file-certificate";
	public static final String questionCertbotH3I = questionCertbotH3I1;
	public static final String questionCertbotH3Span1 = "Comment puis-je obtenir mon certificat ? ";
	public static final String questionCertbotH3Span = questionCertbotH3Span1;
	public static final String questionCertbotH4I1 = "far fa-stamp";
	public static final String questionCertbotH4I = questionCertbotH4I1;
	public static final String questionCertbotH4Span1 = "Utilisez la commande certbot. ";
	public static final String questionCertbotH4Span = questionCertbotH4Span1;
	public static final String questionCertbotPreSpan011 = "sudo";
	public static final String questionCertbotPreSpan01 = questionCertbotPreSpan011;
	public static final String questionCertbotPreSpan021 = " certbot";
	public static final String questionCertbotPreSpan02 = questionCertbotPreSpan021;
	public static final String questionCertbotPreSpan031 = " --manual";
	public static final String questionCertbotPreSpan03 = questionCertbotPreSpan031;
	public static final String questionCertbotPreSpan041 = " --preferred-challenges dns";
	public static final String questionCertbotPreSpan04 = questionCertbotPreSpan041;
	public static final String questionCertbotPreSpan051 = " --server https://acme-v02.api.letsencrypt.org/directory";
	public static final String questionCertbotPreSpan05 = questionCertbotPreSpan051;
	public static final String questionCertbotPreSpan061 = " certonly";
	public static final String questionCertbotPreSpan06 = questionCertbotPreSpan061;
	public static final String questionCertbotPreSpan07Span11 = " -d ";
	public static final String questionCertbotPreSpan07Span1 = questionCertbotPreSpan07Span11;
	public static final String questionCertbotPreSpan07Span21 = "example.com";
	public static final String questionCertbotPreSpan07Span2 = questionCertbotPreSpan07Span21;
	public static final String questionCertbotPreSpan08Span11 = " -d *.";
	public static final String questionCertbotPreSpan08Span1 = questionCertbotPreSpan08Span11;
	public static final String questionCertbotPreSpan08Span21 = "example.com";
	public static final String questionCertbotPreSpan08Span2 = questionCertbotPreSpan08Span21;
	public static final String questionCertbotPreSpan09Span11 = " -d *.applis.";
	public static final String questionCertbotPreSpan09Span1 = questionCertbotPreSpan09Span11;
	public static final String questionCertbotPreSpan09Span21 = "example.com";
	public static final String questionCertbotPreSpan09Span2 = questionCertbotPreSpan09Span21;
	public static final String questionCertbotOl2Li01Dt1 = "sudo";
	public static final String questionCertbotOl2Li01Dt = questionCertbotOl2Li01Dt1;
	public static final String questionCertbotOl2Li02Dt1 = "certbot";
	public static final String questionCertbotOl2Li02Dt = questionCertbotOl2Li02Dt1;
	public static final String questionCertbotOl2Li02Dd1 = " : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. ";
	public static final String questionCertbotOl2Li02Dd = questionCertbotOl2Li02Dd1;
	public static final String questionCertbotOl2Li03Dt1 = "--manual";
	public static final String questionCertbotOl2Li03Dt = questionCertbotOl2Li03Dt1;
	public static final String questionCertbotOl2Li03Dd1 = " : Obtenez des certificats de manière interactive ou à l'aide d'un script shell. ";
	public static final String questionCertbotOl2Li03Dd = questionCertbotOl2Li03Dd1;
	public static final String questionCertbotOl2Li04Dt1 = "--preferred-challenges dns";
	public static final String questionCertbotOl2Li04Dt = questionCertbotOl2Li04Dt1;
	public static final String questionCertbotOl2Li04Dd1 = " : Obtenir ou renouveler un certificat, mais ne l'installez pas. ";
	public static final String questionCertbotOl2Li04Dd = questionCertbotOl2Li04Dd1;
	public static final String questionCertbotOl2Li05Dt1 = "--server https://acme-v02.api.letsencrypt.org/directory";
	public static final String questionCertbotOl2Li05Dt = questionCertbotOl2Li05Dt1;
	public static final String questionCertbotOl2Li05Dd1 = " : Spécifiez une version plus récente d'un serveur letsencrypt qui autorise les domaines wildcard dans les certificats. ";
	public static final String questionCertbotOl2Li05Dd = questionCertbotOl2Li05Dd1;
	public static final String questionCertbotOl2Li06Dt1 = "certonly";
	public static final String questionCertbotOl2Li06Dt = questionCertbotOl2Li06Dt1;
	public static final String questionCertbotOl2Li06Dd1 = " : Obtenir ou renouveler un certificat, mais ne l'installez pas. ";
	public static final String questionCertbotOl2Li06Dd = questionCertbotOl2Li06Dd1;
	public static final String questionCertbotOl2Li07DtSpan11 = "-d ";
	public static final String questionCertbotOl2Li07DtSpan1 = questionCertbotOl2Li07DtSpan11;
	public static final String questionCertbotOl2Li07DtSpan21 = "example.com";
	public static final String questionCertbotOl2Li07DtSpan2 = questionCertbotOl2Li07DtSpan21;
	public static final String questionCertbotOl2Li07DdSpan31 = " : Spécifiez votre nom de domaine de racine pour l'inclure en tant que route sécurisée par le certificat. ";
	public static final String questionCertbotOl2Li07DdSpan3 = questionCertbotOl2Li07DdSpan31;
	public static final String questionCertbotOl2Li08DtSpan11 = "-d *.";
	public static final String questionCertbotOl2Li08DtSpan1 = questionCertbotOl2Li08DtSpan11;
	public static final String questionCertbotOl2Li08DtSpan21 = "example.com";
	public static final String questionCertbotOl2Li08DtSpan2 = questionCertbotOl2Li08DtSpan21;
	public static final String questionCertbotOl2Li08DdSpan31 = " : Incluez des domaines génériques dans votre domaine racine, y compris www par exemple. ";
	public static final String questionCertbotOl2Li08DdSpan3 = questionCertbotOl2Li08DdSpan31;
	public static final String questionCertbotOl2Li09DtSpan11 = "-d *.applis.";
	public static final String questionCertbotOl2Li09DtSpan1 = questionCertbotOl2Li09DtSpan11;
	public static final String questionCertbotOl2Li09DtSpan21 = "example.com";
	public static final String questionCertbotOl2Li09DtSpan2 = questionCertbotOl2Li09DtSpan21;
	public static final String questionCertbotOl2Li09DdSpan31 = " : Les domaines génériques n'incluent pas les sous-domaines d'un domaine générique; incluez donc également des sous-domaines supplémentaires. ";
	public static final String questionCertbotOl2Li09DdSpan32 = "Vous pouvez inclure plus d'un nom de domaine dans le même certificat si vous le souhaitez, jusqu'à un montant généreux par letsencrypt. ";
	public static final String questionCertbotOl2Li09DdSpan3 = questionCertbotOl2Li09DdSpan31 + questionCertbotOl2Li09DdSpan32;
	public static final String questionCertbotP21 = "certbot vous posera des questions, par exemple, si vous souhaitez que votre adresse IP soit consignée comme ayant demandé ce certificat.";
	public static final String questionCertbotP22 = "Vous pouvez répondre Yes car c'est votre certificat. ";
	public static final String questionCertbotP23 = "Il vous demandera probablement votre adresse e-mail, c'est bien, parce qu'ils vous enverront un mail lorsque votre certificat expirera quelques semaines avant. ";
	public static final String questionCertbotP24 = "Les certificats expirent tous les 3 mois, c'est bien souvent, mais ils sont gratuits, donc vous ne pouvez pas trop vous plaindre.";
	public static final String questionCertbotP25 = "Des certificats beaucoup plus chers peuvent durer 3 ans. ";
	public static final String questionCertbotP2 = questionCertbotP21 + questionCertbotP22 + questionCertbotP23 + questionCertbotP24 + questionCertbotP25;
	public static final String questionCertbotP3Span11 = "Aussi, certbot vous demandera de créer plusieurs enregistrements DNS TXT avec des valeurs aléatoires pour vos noms de domaine que vous avez spécifiés, afin de prouver que vous êtes le propriétaire du domaine. ";
	public static final String questionCertbotP3Span12 = "Cela prendra du temps tous les trois mois. Je vous recommande donc un service qui vous permettra de gérer le DNS de vos propres noms de domaine. ";
	public static final String questionCertbotP3Span13 = "Fastmail est le service que j'utilise pour la messagerie personnelle et le DNS ";
	public static final String questionCertbotP3Span1 = questionCertbotP3Span11 + questionCertbotP3Span12 + questionCertbotP3Span13;
	public static final String questionCertbotP3A11 = " https://www.fastmail.com/";
	public static final String questionCertbotP3A1 = questionCertbotP3A11;
	public static final String questionCertbotP3Span21 = ". Fastmail est basé en Australie et protège la confidentialité de votre messagerie, contrairement à certains autres fournisseurs de messagerie. ";
	public static final String questionCertbotP3Span22 = "Avec Fastmail, je peux me connecter, même à partir de mon appli Fastmail sur mon mobile, et gérer mon DNS. ";
	public static final String questionCertbotP3Span23 = "Je peux gérer autant de noms de domaine que je le souhaite avec Fastmail. ";
	public static final String questionCertbotP3Span24 = "Je dit à l'équipe de support du bureau d'enregistrement de domaine où j'ai acheté le domaine, les serveurs de noms de fastmail.com (ns1.messagingengine.com, ns2.messagingengine.com) et j'ajoute le domaine dans Fastmail. ";
	public static final String questionCertbotP3Span25 = "Ensuite, je peux gérer les enregistrements DNS une fois les modifications sont faites pour tous mes domaines. ";
	public static final String questionCertbotP3Span26 = "J'ajoute un enregistrement TXT et une valeur pour chaque défi certbot et enregistre les modifications. ";
	public static final String questionCertbotP3Span27 = "Autant que je sache, les enregistrements TXT sont enregistrés immédiatement. ";
	public static final String questionCertbotP3Span2 = questionCertbotP3Span21 + questionCertbotP3Span22 + questionCertbotP3Span23 + questionCertbotP3Span24 + questionCertbotP3Span25 + questionCertbotP3Span26 + questionCertbotP3Span27;

	/**	L'entité « questionCertbot »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCertbot = new PageHtml();
	public Couverture<PageHtml> questionCertbotCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCertbot").o(questionCertbot);

	/**	<br/>L'entité « questionCertbot »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionCertbot">Trouver l'entité questionCertbot dans Solr</a>
	 * <br/>
	 * @param questionCertbot est l'entité déjà construit. 
	 **/
	protected abstract void _questionCertbot(PageHtml o);

	public PageHtml getQuestionCertbot() {
		return questionCertbot;
	}

	public void setQuestionCertbot(PageHtml questionCertbot) {
		this.questionCertbot = questionCertbot;
		this.questionCertbotCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionCertbotInit() {
		if(questionCertbot != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCertbot, "questionCertbot");
			((C001L008CreerCertificat)this).avantPagePart(questionCertbot, "questionCertbot");
		}
		if(!questionCertbotCouverture.dejaInitialise) {
			_questionCertbot(questionCertbot);
		}
		questionCertbot.initLoinPourClasse(requeteSite_);
		questionCertbotCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionCertbot(PageHtml o) {
		{ e("h3").a("class", " questionCertbotH3 ").f();
			{ e("i").a("class", questionCertbotH3I1, " site-menu-icon questionCertbotH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCertbotH3Span ").f();
				sx(questionCertbotH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCertbotH4 ").f();
			{ e("i").a("class", questionCertbotH4I1, " site-menu-icon questionCertbotH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCertbotH4Span ").f();
				sx(questionCertbotH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCertbotPre ").f();
			{ e("span").a("class", " questionCertbotPreSpan01 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan011);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan02 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan021);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan03 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan031);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan04 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan041);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan05 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan051);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan06 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan061);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan07 questionCertbotPreSpan odd ").f();
				{ e("span").a("class", " questionCertbotPreSpan07Span1 questionCertbotPreSpan odd ").f();
					sx(questionCertbotPreSpan07Span11);
				} g("span");
				{ e("span").a("class", " questionCertbotPreSpan07Span2 questionCertbotPreSpan even ").f();
					sx(utilisateurId == null ? questionCertbotPreSpan07Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan08 questionCertbotPreSpan even ").f();
				{ e("span").a("class", " questionCertbotPreSpan08Span1 questionCertbotPreSpan odd ").f();
					sx(questionCertbotPreSpan08Span11);
				} g("span");
				{ e("span").a("class", " questionCertbotPreSpan08Span2 questionCertbotPreSpan even ").f();
					sx(utilisateurId == null ? questionCertbotPreSpan08Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan09 questionCertbotPreSpan odd ").f();
				{ e("span").a("class", " questionCertbotPreSpan09Span1 questionCertbotPreSpan odd ").f();
					sx(questionCertbotPreSpan09Span11);
				} g("span");
				{ e("span").a("class", " questionCertbotPreSpan09Span2 questionCertbotPreSpan even ").f();
					sx(utilisateurId == null ? questionCertbotPreSpan09Span21 : utilisateurSiteNomDomaine);
				} g("span");
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCertbotOl2 questionCertbotOl even ").f();
			{ e("li").a("class", " questionCertbotOl2Li01 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li01Dt ").f();
					sx(questionCertbotOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li02 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li02Dt ").f();
					sx(questionCertbotOl2Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li02Dd ").f();
					sx(questionCertbotOl2Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li03 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li03Dt ").f();
					sx(questionCertbotOl2Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li03Dd ").f();
					sx(questionCertbotOl2Li03Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li04 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li04Dt ").f();
					sx(questionCertbotOl2Li04Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li04Dd ").f();
					sx(questionCertbotOl2Li04Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li05 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li05Dt ").f();
					sx(questionCertbotOl2Li05Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li05Dd ").f();
					sx(questionCertbotOl2Li05Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li06 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li06Dt ").f();
					sx(questionCertbotOl2Li06Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li06Dd ").f();
					sx(questionCertbotOl2Li06Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li07 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li07Dt ").f();
					{ e("span").a("class", " questionCertbotOl2Li07DtSpan1 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li07DtSpan11);
					} g("span");
					{ e("span").a("class", " questionCertbotOl2Li07DtSpan2 questionCertbotOl2Li even ").f();
						sx(utilisateurId == null ? questionCertbotOl2Li07DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li07Dd ").f();
					{ e("span").a("class", " questionCertbotOl2Li07DdSpan3 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li07DdSpan31);
					} g("span");
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li08 questionCertbotOl2Li even ").f();
				{ e("dt").a("class", " questionCertbotOl2Li08Dt ").f();
					{ e("span").a("class", " questionCertbotOl2Li08DtSpan1 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li08DtSpan11);
					} g("span");
					{ e("span").a("class", " questionCertbotOl2Li08DtSpan2 questionCertbotOl2Li even ").f();
						sx(utilisateurId == null ? questionCertbotOl2Li08DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li08Dd ").f();
					{ e("span").a("class", " questionCertbotOl2Li08DdSpan3 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li08DdSpan31);
					} g("span");
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li09 questionCertbotOl2Li odd ").f();
				{ e("dt").a("class", " questionCertbotOl2Li09Dt ").f();
					{ e("span").a("class", " questionCertbotOl2Li09DtSpan1 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li09DtSpan11);
					} g("span");
					{ e("span").a("class", " questionCertbotOl2Li09DtSpan2 questionCertbotOl2Li even ").f();
						sx(utilisateurId == null ? questionCertbotOl2Li09DtSpan21 : utilisateurSiteNomDomaine);
					} g("span");
				} g("dt");
				{ e("dd").a("class", " questionCertbotOl2Li09Dd ").f();
					{ e("span").a("class", " questionCertbotOl2Li09DdSpan3 questionCertbotOl2Li odd ").f();
						sx(questionCertbotOl2Li09DdSpan31);
						sx(questionCertbotOl2Li09DdSpan32);
					} g("span");
				} g("dd");
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCertbotP2 questionCertbotP even ").f();
			sx(questionCertbotP21);
			sx(questionCertbotP22);
			sx(questionCertbotP23);
			sx(questionCertbotP24);
			sx(questionCertbotP25);
		} g("p");
		{ e("p").a("class", " questionCertbotP3 questionCertbotP odd ").f();
			{ e("span").a("class", " questionCertbotP3Span1 questionCertbotP3Span odd ").f();
				sx(questionCertbotP3Span11);
				sx(questionCertbotP3Span12);
				sx(questionCertbotP3Span13);
			} g("span");
			{ e("a").a("class", " questionCertbotP3A1 questionCertbotP3A odd ").a("href", questionCertbotP3A11).f();
				sx(questionCertbotP3A11);
			} g("a");
			{ e("span").a("class", " questionCertbotP3Span2 questionCertbotP3Span even ").f();
				sx(questionCertbotP3Span21);
				sx(questionCertbotP3Span22);
				sx(questionCertbotP3Span23);
				sx(questionCertbotP3Span24);
				sx(questionCertbotP3Span25);
				sx(questionCertbotP3Span26);
				sx(questionCertbotP3Span27);
			} g("span");
		} g("p");
	}
	public void htmlBodyQuestionCertbot() {
		questionCertbot.htmlAvant();
		htmlBodyQuestionCertbot(questionCertbot);
		questionCertbot.htmlApres();
	}

	////////////////////
	// questionCopier //
	////////////////////

	public static final String questionCopierH3I1 = "far fa-key";
	public static final String questionCopierH3I = questionCopierH3I1;
	public static final String questionCopierH3Span1 = "Comment utiliser le certificat et la clé générés par certbot ? ";
	public static final String questionCopierH3Span = questionCopierH3Span1;
	public static final String questionCopierH4I1 = "far fa-copy";
	public static final String questionCopierH4I = questionCopierH4I1;
	public static final String questionCopierH4Span1 = "Copiez les fichiers certbot avec la commande install. ";
	public static final String questionCopierH4Span = questionCopierH4Span1;
	public static final String questionCopierPre1Span011 = "sudo";
	public static final String questionCopierPre1Span01 = questionCopierPre1Span011;
	public static final String questionCopierPre1Span021 = " install";
	public static final String questionCopierPre1Span02 = questionCopierPre1Span021;
	public static final String questionCopierPre1Span031 = " -o";
	public static final String questionCopierPre1Span03 = questionCopierPre1Span031;
	public static final String questionCopierPre1Span041 = " $USER";
	public static final String questionCopierPre1Span04 = questionCopierPre1Span041;
	public static final String questionCopierPre1Span051 = " -g";
	public static final String questionCopierPre1Span05 = questionCopierPre1Span051;
	public static final String questionCopierPre1Span061 = " $USER";
	public static final String questionCopierPre1Span06 = questionCopierPre1Span061;
	public static final String questionCopierPre1Span071 = " -m";
	public static final String questionCopierPre1Span07 = questionCopierPre1Span071;
	public static final String questionCopierPre1Span081 = " 700";
	public static final String questionCopierPre1Span08 = questionCopierPre1Span081;
	public static final String questionCopierPre1Span09Span11 = " /etc/letsencrypt/live/";
	public static final String questionCopierPre1Span09Span1 = questionCopierPre1Span09Span11;
	public static final String questionCopierPreSpan09Span21 = "example.com";
	public static final String questionCopierPreSpan09Span2 = questionCopierPreSpan09Span21;
	public static final String questionCopierPre1Span09Span31 = "/privkey.pem";
	public static final String questionCopierPre1Span09Span3 = questionCopierPre1Span09Span31;
	public static final String questionCopierPre1Span101 = " /srv/certbot/server.key";
	public static final String questionCopierPre1Span10 = questionCopierPre1Span101;
	public static final String questionCopierOl1Li01Dt1 = "sudo";
	public static final String questionCopierOl1Li01Dt = questionCopierOl1Li01Dt1;
	public static final String questionCopierOl1Li02Dt1 = "install";
	public static final String questionCopierOl1Li02Dt = questionCopierOl1Li02Dt1;
	public static final String questionCopierOl1Li03Dt1 = "-o";
	public static final String questionCopierOl1Li03Dt = questionCopierOl1Li03Dt1;
	public static final String questionCopierOl1Li04Dt1 = "$USER";
	public static final String questionCopierOl1Li04Dt = questionCopierOl1Li04Dt1;
	public static final String questionCopierOl1Li05Dt1 = "-g";
	public static final String questionCopierOl1Li05Dt = questionCopierOl1Li05Dt1;
	public static final String questionCopierOl1Li06Dt1 = "$USER";
	public static final String questionCopierOl1Li06Dt = questionCopierOl1Li06Dt1;
	public static final String questionCopierOl1Li07Dt1 = "-m";
	public static final String questionCopierOl1Li07Dt = questionCopierOl1Li07Dt1;
	public static final String questionCopierOl1Li08Dt1 = "700";
	public static final String questionCopierOl1Li08Dt = questionCopierOl1Li08Dt1;
	public static final String questionCopierOl1Li09Dt1 = "/srv/certbot";
	public static final String questionCopierOl1Li09Dt2 = " /etc/letsencrypt/live/";
	public static final String questionCopierOl1Li09Dt3 = "example.com";
	public static final String questionCopierOl1Li09Dt4 = "/privkey.pem";
	public static final String questionCopierOl1Li09Dt = questionCopierOl1Li09Dt1 + questionCopierOl1Li09Dt2 + questionCopierOl1Li09Dt3 + questionCopierOl1Li09Dt4;
	public static final String questionCopierOl1Li09Dd1 = " : Une fois que la commande certbot est terminée, elle vous indiquera le chemin complet de la clé privée récemment générée, ce qui n'est peut-être pas exactement ce que j'ai écrit ici. ";
	public static final String questionCopierOl1Li09Dd = questionCopierOl1Li09Dd1;
	public static final String questionCopierOl1Li10Dt1 = "/srv/certbot/server.key";
	public static final String questionCopierOl1Li10Dt = questionCopierOl1Li10Dt1;
	public static final String questionCopierOl1Li10Dd1 = " : Le nouveau chemin où la clé privée sera copiée. ";
	public static final String questionCopierOl1Li10Dd = questionCopierOl1Li10Dd1;
	public static final String questionCopierPre2Span011 = "sudo";
	public static final String questionCopierPre2Span01 = questionCopierPre2Span011;
	public static final String questionCopierPre2Span021 = " install";
	public static final String questionCopierPre2Span02 = questionCopierPre2Span021;
	public static final String questionCopierPre2Span031 = " -o";
	public static final String questionCopierPre2Span03 = questionCopierPre2Span031;
	public static final String questionCopierPre2Span041 = " $USER";
	public static final String questionCopierPre2Span04 = questionCopierPre2Span041;
	public static final String questionCopierPre2Span051 = " -g";
	public static final String questionCopierPre2Span05 = questionCopierPre2Span051;
	public static final String questionCopierPre2Span061 = " $USER";
	public static final String questionCopierPre2Span06 = questionCopierPre2Span061;
	public static final String questionCopierPre2Span071 = " -m";
	public static final String questionCopierPre2Span07 = questionCopierPre2Span071;
	public static final String questionCopierPre2Span081 = " 700";
	public static final String questionCopierPre2Span08 = questionCopierPre2Span081;
	public static final String questionCopierPre2Span09Span11 = " /etc/letsencrypt/live/";
	public static final String questionCopierPre2Span09Span1 = questionCopierPre2Span09Span11;
	public static final String questionCopierPre2Span09Span21 = "example.com";
	public static final String questionCopierPre2Span09Span2 = questionCopierPre2Span09Span21;
	public static final String questionCopierPre2Span09Span31 = "/fullchain.pem";
	public static final String questionCopierPre2Span09Span3 = questionCopierPre2Span09Span31;
	public static final String questionCopierPre2Span101 = " /srv/certbot/server.crt";
	public static final String questionCopierPre2Span10 = questionCopierPre2Span101;
	public static final String questionCopierOl2Li01Dt1 = "sudo";
	public static final String questionCopierOl2Li01Dt = questionCopierOl2Li01Dt1;
	public static final String questionCopierOl2Li02Dt1 = "install";
	public static final String questionCopierOl2Li02Dt = questionCopierOl2Li02Dt1;
	public static final String questionCopierOl2Li03Dt1 = "-o";
	public static final String questionCopierOl2Li03Dt = questionCopierOl2Li03Dt1;
	public static final String questionCopierOl2Li04Dt1 = "$USER";
	public static final String questionCopierOl2Li04Dt = questionCopierOl2Li04Dt1;
	public static final String questionCopierOl2Li05Dt1 = "-g";
	public static final String questionCopierOl2Li05Dt = questionCopierOl2Li05Dt1;
	public static final String questionCopierOl2Li06Dt1 = "$USER";
	public static final String questionCopierOl2Li06Dt = questionCopierOl2Li06Dt1;
	public static final String questionCopierOl2Li07Dt1 = "-m";
	public static final String questionCopierOl2Li07Dt = questionCopierOl2Li07Dt1;
	public static final String questionCopierOl2Li08Dt1 = "700";
	public static final String questionCopierOl2Li08Dt = questionCopierOl2Li08Dt1;
	public static final String questionCopierOl2Li09Dt1 = "/srv/certbot";
	public static final String questionCopierOl2Li09Dt2 = " /etc/letsencrypt/live/";
	public static final String questionCopierOl2Li09Dt3 = "example.com";
	public static final String questionCopierOl2Li09Dt4 = "/fullchain.pem";
	public static final String questionCopierOl2Li09Dt = questionCopierOl2Li09Dt1 + questionCopierOl2Li09Dt2 + questionCopierOl2Li09Dt3 + questionCopierOl2Li09Dt4;
	public static final String questionCopierOl2Li09Dd1 = " : Une fois que la commande certbot est terminée, elle vous indiquera le chemin complet de le certificat récemment généré, ce qui n'est peut-être pas exactement ce que j'ai écrit ici. ";
	public static final String questionCopierOl2Li09Dd = questionCopierOl2Li09Dd1;
	public static final String questionCopierOl2Li10Dt1 = "/srv/certbot/server.crt";
	public static final String questionCopierOl2Li10Dt = questionCopierOl2Li10Dt1;
	public static final String questionCopierOl2Li10Dd1 = " : Le nouveau chemin où le certificat sera copié. ";
	public static final String questionCopierOl2Li10Dd = questionCopierOl2Li10Dd1;

	/**	L'entité « questionCopier »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCopier = new PageHtml();
	public Couverture<PageHtml> questionCopierCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCopier").o(questionCopier);

	/**	<br/>L'entité « questionCopier »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionCopier">Trouver l'entité questionCopier dans Solr</a>
	 * <br/>
	 * @param questionCopier est l'entité déjà construit. 
	 **/
	protected abstract void _questionCopier(PageHtml o);

	public PageHtml getQuestionCopier() {
		return questionCopier;
	}

	public void setQuestionCopier(PageHtml questionCopier) {
		this.questionCopier = questionCopier;
		this.questionCopierCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionCopierInit() {
		if(questionCopier != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCopier, "questionCopier");
			((C001L008CreerCertificat)this).avantPagePart(questionCopier, "questionCopier");
		}
		if(!questionCopierCouverture.dejaInitialise) {
			_questionCopier(questionCopier);
		}
		questionCopier.initLoinPourClasse(requeteSite_);
		questionCopierCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionCopier(PageHtml o) {
		{ e("h3").a("class", " questionCopierH3 ").f();
			{ e("i").a("class", questionCopierH3I1, " site-menu-icon questionCopierH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCopierH3Span ").f();
				sx(questionCopierH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCopierH4 ").f();
			{ e("i").a("class", questionCopierH4I1, " site-menu-icon questionCopierH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCopierH4Span ").f();
				sx(questionCopierH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionCopierPre1 questionCopierPre odd ").f();
			{ e("span").a("class", " questionCopierPre1Span01 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span011);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span02 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span021);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span03 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span031);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span04 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span041);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span05 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span051);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span06 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span061);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span07 questionCopierPre1Span odd ").f();
				sx(questionCopierPre1Span071);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span08 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span081);
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span09 questionCopierPre1Span odd ").f();
				{ e("span").a("class", " questionCopierPre1Span09Span1 questionCopierPre1Span odd ").f();
					sx(questionCopierPre1Span09Span11);
				} g("span");
				{ e("span").a("class", " questionCopierPreSpan09Span2 questionCopierPreSpan even ").f();
					sx(utilisateurId == null ? questionCopierPreSpan09Span21 : utilisateurSiteNomDomaine);
				} g("span");
				{ e("span").a("class", " questionCopierPre1Span09Span3 questionCopierPre1Span odd ").f();
					sx(questionCopierPre1Span09Span31);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCopierPre1Span10 questionCopierPre1Span even ").f();
				sx(questionCopierPre1Span101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCopierOl1 questionCopierOl odd ").f();
			{ e("li").a("class", " questionCopierOl1Li01 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li01Dt ").f();
					sx(questionCopierOl1Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li02 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li02Dt ").f();
					sx(questionCopierOl1Li02Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li03 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li03Dt ").f();
					sx(questionCopierOl1Li03Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li04 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li04Dt ").f();
					sx(questionCopierOl1Li04Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li05 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li05Dt ").f();
					sx(questionCopierOl1Li05Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li06 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li06Dt ").f();
					sx(questionCopierOl1Li06Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li07 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li07Dt ").f();
					sx(questionCopierOl1Li07Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li08 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li08Dt ").f();
					sx(questionCopierOl1Li08Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li09 questionCopierOl1Li odd ").f();
				{ e("dt").a("class", " questionCopierOl1Li09Dt ").f();
					sx(questionCopierOl1Li09Dt1);
					sx(questionCopierOl1Li09Dt2);
					sx(utilisateurId == null ? questionCopierOl1Li09Dt3 : utilisateurSiteNomDomaine);
					sx(questionCopierOl1Li09Dt4);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl1Li09Dd ").f();
					sx(questionCopierOl1Li09Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCopierOl1Li10 questionCopierOl1Li even ").f();
				{ e("dt").a("class", " questionCopierOl1Li10Dt ").f();
					sx(questionCopierOl1Li10Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl1Li10Dd ").f();
					sx(questionCopierOl1Li10Dd1);
				} g("dd");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionCopierPre2 questionCopierPre even ").f();
			{ e("span").a("class", " questionCopierPre2Span01 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span011);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span02 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span021);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span03 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span031);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span04 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span041);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span05 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span051);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span06 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span061);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span07 questionCopierPre2Span odd ").f();
				sx(questionCopierPre2Span071);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span08 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span081);
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span09 questionCopierPre2Span odd ").f();
				{ e("span").a("class", " questionCopierPre2Span09Span1 questionCopierPre2Span odd ").f();
					sx(questionCopierPre2Span09Span11);
				} g("span");
				{ e("span").a("class", " questionCopierPre2Span09Span2 questionCopierPre2Span even ").f();
					sx(utilisateurId == null ? questionCopierPre2Span09Span21 : utilisateurSiteNomDomaine);
				} g("span");
				{ e("span").a("class", " questionCopierPre2Span09Span3 questionCopierPre2Span odd ").f();
					sx(questionCopierPre2Span09Span31);
				} g("span");
			} g("span");
			{ e("span").a("class", " questionCopierPre2Span10 questionCopierPre2Span even ").f();
				sx(questionCopierPre2Span101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCopierOl2 questionCopierOl even ").f();
			{ e("li").a("class", " questionCopierOl2Li01 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li01Dt ").f();
					sx(questionCopierOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li02 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li02Dt ").f();
					sx(questionCopierOl2Li02Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li03 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li03Dt ").f();
					sx(questionCopierOl2Li03Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li04 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li04Dt ").f();
					sx(questionCopierOl2Li04Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li05 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li05Dt ").f();
					sx(questionCopierOl2Li05Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li06 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li06Dt ").f();
					sx(questionCopierOl2Li06Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li07 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li07Dt ").f();
					sx(questionCopierOl2Li07Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li08 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li08Dt ").f();
					sx(questionCopierOl2Li08Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li09 questionCopierOl2Li odd ").f();
				{ e("dt").a("class", " questionCopierOl2Li09Dt ").f();
					sx(questionCopierOl2Li09Dt1);
					sx(questionCopierOl2Li09Dt2);
					sx(utilisateurId == null ? questionCopierOl2Li09Dt3 : utilisateurSiteNomDomaine);
					sx(questionCopierOl2Li09Dt4);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl2Li09Dd ").f();
					sx(questionCopierOl2Li09Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionCopierOl2Li10 questionCopierOl2Li even ").f();
				{ e("dt").a("class", " questionCopierOl2Li10Dt ").f();
					sx(questionCopierOl2Li10Dt1);
				} g("dt");
				{ e("dd").a("class", " questionCopierOl2Li10Dd ").f();
					sx(questionCopierOl2Li10Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionCopier() {
		questionCopier.htmlAvant();
		htmlBodyQuestionCopier(questionCopier);
		questionCopier.htmlApres();
	}

	//////////////////////
	// questionRacineCa //
	//////////////////////

	public static final String questionRacineCaH3I1 = "far fa-users-crown";
	public static final String questionRacineCaH3I = questionRacineCaH3I1;
	public static final String questionRacineCaH3Span1 = "Comment puis-je obtenir les certificats letencrypt racine et CA ? ";
	public static final String questionRacineCaH3Span = questionRacineCaH3Span1;
	public static final String questionRacineCaH4I1 = "far fa-copy";
	public static final String questionRacineCaH4I = questionRacineCaH4I1;
	public static final String questionRacineCaH4Span1 = "Téléchargez les certificats racine et CA avec la commande curl. ";
	public static final String questionRacineCaH4Span = questionRacineCaH4Span1;
	public static final String questionRacineCaPre1Span011 = "curl";
	public static final String questionRacineCaPre1Span01 = questionRacineCaPre1Span011;
	public static final String questionRacineCaPre1Span021 = " https://letsencrypt.org/certs/isrgrootx1.pem.txt";
	public static final String questionRacineCaPre1Span02 = questionRacineCaPre1Span021;
	public static final String questionRacineCaPre1Span031 = " -o /srv/certbot/root.crt";
	public static final String questionRacineCaPre1Span03 = questionRacineCaPre1Span031;
	public static final String questionRacineCaOl1Li01Dt1 = "curl";
	public static final String questionRacineCaOl1Li01Dt = questionRacineCaOl1Li01Dt1;
	public static final String questionRacineCaOl1Li01Dd1 = " : Un outil pour transférer des données depuis ou vers un serveur, en utilisant les protocoles pris en charge. ";
	public static final String questionRacineCaOl1Li01Dd = questionRacineCaOl1Li01Dd1;
	public static final String questionRacineCaOl1Li02Dt1 = "https://letsencrypt.org/certs/isrgrootx1.pem.txt";
	public static final String questionRacineCaOl1Li02Dt = questionRacineCaOl1Li02Dt1;
	public static final String questionRacineCaOl1Li02Dd1 = " : L'URL du certificat racine de letsencrypt. ";
	public static final String questionRacineCaOl1Li02Dd = questionRacineCaOl1Li02Dd1;
	public static final String questionRacineCaOl1Li03Dt1 = "-o /srv/certbot/root.crt";
	public static final String questionRacineCaOl1Li03Dt = questionRacineCaOl1Li03Dt1;
	public static final String questionRacineCaOl1Li03Dd1 = " : Ecrit la sortie dans le fichier root.crt au lieu de stdout. ";
	public static final String questionRacineCaOl1Li03Dd = questionRacineCaOl1Li03Dd1;
	public static final String questionRacineCaPre2Span011 = "curl";
	public static final String questionRacineCaPre2Span01 = questionRacineCaPre2Span011;
	public static final String questionRacineCaPre2Span021 = " https://letsencrypt.org/certs/lets-encrypt-x3-cross-signed.pem.txt";
	public static final String questionRacineCaPre2Span02 = questionRacineCaPre2Span021;
	public static final String questionRacineCaPre2Span031 = " -o /srv/certbot/ca1.crt";
	public static final String questionRacineCaPre2Span03 = questionRacineCaPre2Span031;
	public static final String questionRacineCaOl2Li01Dt1 = "curl";
	public static final String questionRacineCaOl2Li01Dt = questionRacineCaOl2Li01Dt1;
	public static final String questionRacineCaOl2Li02Dt1 = "https://letsencrypt.org/certs/lets-encrypt-x3-cross-signed.pem.txt";
	public static final String questionRacineCaOl2Li02Dt = questionRacineCaOl2Li02Dt1;
	public static final String questionRacineCaOl2Li02Dd1 = " : L'URL du premier certificat d'autorité letsencrypt. ";
	public static final String questionRacineCaOl2Li02Dd = questionRacineCaOl2Li02Dd1;
	public static final String questionRacineCaOl2Li03Dt1 = "-o /srv/certbot/ca1.crt";
	public static final String questionRacineCaOl2Li03Dt = questionRacineCaOl2Li03Dt1;
	public static final String questionRacineCaOl2Li03Dd1 = " : Ecrit la sortie dans le fichier ca1.crt au lieu de stdout. ";
	public static final String questionRacineCaOl2Li03Dd = questionRacineCaOl2Li03Dd1;
	public static final String questionRacineCaPre3Span011 = "curl";
	public static final String questionRacineCaPre3Span01 = questionRacineCaPre3Span011;
	public static final String questionRacineCaPre3Span021 = " https://letsencrypt.org/certs/letsencryptauthorityx3.pem.txt";
	public static final String questionRacineCaPre3Span02 = questionRacineCaPre3Span021;
	public static final String questionRacineCaPre3Span031 = " -o /srv/certbot/ca2.crt";
	public static final String questionRacineCaPre3Span03 = questionRacineCaPre3Span031;
	public static final String questionRacineCaOl3Li01Dt1 = "curl";
	public static final String questionRacineCaOl3Li01Dt = questionRacineCaOl3Li01Dt1;
	public static final String questionRacineCaOl3Li02Dt1 = "https://letsencrypt.org/certs/letsencryptauthorityx3.pem.txt";
	public static final String questionRacineCaOl3Li02Dt = questionRacineCaOl3Li02Dt1;
	public static final String questionRacineCaOl3Li02Dd1 = " : L'URL du deuxième certificat d'autorité letsencrypt. ";
	public static final String questionRacineCaOl3Li02Dd = questionRacineCaOl3Li02Dd1;
	public static final String questionRacineCaOl3Li03Dt1 = "-o /srv/certbot/ca2.crt";
	public static final String questionRacineCaOl3Li03Dt = questionRacineCaOl3Li03Dt1;
	public static final String questionRacineCaOl3Li03Dd1 = " : Ecrit la sortie dans le fichier ca2.crt au lieu de stdout. ";
	public static final String questionRacineCaOl3Li03Dd = questionRacineCaOl3Li03Dd1;

	/**	L'entité « questionRacineCa »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionRacineCa = new PageHtml();
	public Couverture<PageHtml> questionRacineCaCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionRacineCa").o(questionRacineCa);

	/**	<br/>L'entité « questionRacineCa »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionRacineCa">Trouver l'entité questionRacineCa dans Solr</a>
	 * <br/>
	 * @param questionRacineCa est l'entité déjà construit. 
	 **/
	protected abstract void _questionRacineCa(PageHtml o);

	public PageHtml getQuestionRacineCa() {
		return questionRacineCa;
	}

	public void setQuestionRacineCa(PageHtml questionRacineCa) {
		this.questionRacineCa = questionRacineCa;
		this.questionRacineCaCouverture.dejaInitialise = true;
	}
	protected C001L008CreerCertificat questionRacineCaInit() {
		if(questionRacineCa != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionRacineCa, "questionRacineCa");
			((C001L008CreerCertificat)this).avantPagePart(questionRacineCa, "questionRacineCa");
		}
		if(!questionRacineCaCouverture.dejaInitialise) {
			_questionRacineCa(questionRacineCa);
		}
		questionRacineCa.initLoinPourClasse(requeteSite_);
		questionRacineCaCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
	}
	public void htmlBodyQuestionRacineCa(PageHtml o) {
		{ e("h3").a("class", " questionRacineCaH3 ").f();
			{ e("i").a("class", questionRacineCaH3I1, " site-menu-icon questionRacineCaH3I ").f();
			} g("i");
			{ e("span").a("class", " questionRacineCaH3Span ").f();
				sx(questionRacineCaH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionRacineCaH4 ").f();
			{ e("i").a("class", questionRacineCaH4I1, " site-menu-icon questionRacineCaH4I ").f();
			} g("i");
			{ e("span").a("class", " questionRacineCaH4Span ").f();
				sx(questionRacineCaH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionRacineCaPre1 questionRacineCaPre odd ").f();
			{ e("span").a("class", " questionRacineCaPre1Span01 questionRacineCaPre1Span odd ").f();
				sx(questionRacineCaPre1Span011);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre1Span02 questionRacineCaPre1Span even ").f();
				sx(questionRacineCaPre1Span021);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre1Span03 questionRacineCaPre1Span odd ").f();
				sx(questionRacineCaPre1Span031);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionRacineCaOl1 questionRacineCaOl odd ").f();
			{ e("li").a("class", " questionRacineCaOl1Li01 questionRacineCaOl1Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl1Li01Dt ").f();
					sx(questionRacineCaOl1Li01Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl1Li01Dd ").f();
					sx(questionRacineCaOl1Li01Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl1Li02 questionRacineCaOl1Li even ").f();
				{ e("dt").a("class", " questionRacineCaOl1Li02Dt ").f();
					sx(questionRacineCaOl1Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl1Li02Dd ").f();
					sx(questionRacineCaOl1Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl1Li03 questionRacineCaOl1Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl1Li03Dt ").f();
					sx(questionRacineCaOl1Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl1Li03Dd ").f();
					sx(questionRacineCaOl1Li03Dd1);
				} g("dd");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionRacineCaPre2 questionRacineCaPre even ").f();
			{ e("span").a("class", " questionRacineCaPre2Span01 questionRacineCaPre2Span odd ").f();
				sx(questionRacineCaPre2Span011);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre2Span02 questionRacineCaPre2Span even ").f();
				sx(questionRacineCaPre2Span021);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre2Span03 questionRacineCaPre2Span odd ").f();
				sx(questionRacineCaPre2Span031);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionRacineCaOl2 questionRacineCaOl even ").f();
			{ e("li").a("class", " questionRacineCaOl2Li01 questionRacineCaOl2Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl2Li01Dt ").f();
					sx(questionRacineCaOl2Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl2Li02 questionRacineCaOl2Li even ").f();
				{ e("dt").a("class", " questionRacineCaOl2Li02Dt ").f();
					sx(questionRacineCaOl2Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl2Li02Dd ").f();
					sx(questionRacineCaOl2Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl2Li03 questionRacineCaOl2Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl2Li03Dt ").f();
					sx(questionRacineCaOl2Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl2Li03Dd ").f();
					sx(questionRacineCaOl2Li03Dd1);
				} g("dd");
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionRacineCaPre3 questionRacineCaPre odd ").f();
			{ e("span").a("class", " questionRacineCaPre3Span01 questionRacineCaPre3Span odd ").f();
				sx(questionRacineCaPre3Span011);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre3Span02 questionRacineCaPre3Span even ").f();
				sx(questionRacineCaPre3Span021);
			} g("span");
			{ e("span").a("class", " questionRacineCaPre3Span03 questionRacineCaPre3Span odd ").f();
				sx(questionRacineCaPre3Span031);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionRacineCaOl3 questionRacineCaOl odd ").f();
			{ e("li").a("class", " questionRacineCaOl3Li01 questionRacineCaOl3Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl3Li01Dt ").f();
					sx(questionRacineCaOl3Li01Dt1);
				} g("dt");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl3Li02 questionRacineCaOl3Li even ").f();
				{ e("dt").a("class", " questionRacineCaOl3Li02Dt ").f();
					sx(questionRacineCaOl3Li02Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl3Li02Dd ").f();
					sx(questionRacineCaOl3Li02Dd1);
				} g("dd");
			} g("li");
			{ e("li").a("class", " questionRacineCaOl3Li03 questionRacineCaOl3Li odd ").f();
				{ e("dt").a("class", " questionRacineCaOl3Li03Dt ").f();
					sx(questionRacineCaOl3Li03Dt1);
				} g("dt");
				{ e("dd").a("class", " questionRacineCaOl3Li03Dd ").f();
					sx(questionRacineCaOl3Li03Dd1);
				} g("dd");
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionRacineCa() {
		questionRacineCa.htmlAvant();
		htmlBodyQuestionRacineCa(questionRacineCa);
		questionRacineCa.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L008CreerCertificat recapituler1Init() {
		if(recapituler1 != null) {
			((C001L008CreerCertificat)this).avantPagePart(recapituler1, "recapituler1");
			((C001L008CreerCertificat)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String recapituler2TableTr2Td21 = "Comment installer la dernière version de PostgreSQL ? ";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "Installer PostgreSQL à partir du code source. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L008CreerCertificat recapituler2Init() {
		if(recapituler2 != null) {
			((C001L008CreerCertificat)this).avantPagePart(recapituler2, "recapituler2");
			((C001L008CreerCertificat)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String recapituler3TableTr02Td21 = "Comment installer les dépendences pour PostgreSQL ? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "far fa-cookie";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td41 = "Construisez les dépendances avec yum. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-files-medical";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "Où est-ce que je place le code source PostgreSQL ? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Créez un répertoire PostgreSQL dans /usr/local/src. ";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Où puis-je installer PostgreSQL ? ";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3Span1I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr04Td3Span1I = recapituler3TableTr04Td3Span1I1;
	public static final String recapituler3TableTr04Td41 = "Créez un répertoire PostgreSQL dans /opt. ";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-cloud-download";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "Comment télécharger le code source de PostgreSQL ? ";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "fab fa-git";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Cloner le code source avec la commande git. ";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-code-branch";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "Comment choisir une version récente de PostgreSQL ? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-tag";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Listez toutes les tags du référentiel git. ";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-code-merge";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "Comment changer de version du code source de PostgreSQL ? ";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-code-commit";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Checkout la tag git. ";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-tools";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "Comment contruire le code source de PostgreSQL ? ";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-terminal";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Construisez PostgreSQL avec la commande configure. ";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-map-pin";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "Après avoir installé PostgreSQL, où se trouve mon répertoire de données ? ";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-folder-tree";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Créez un répertoire pgsql dans /srv. ";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-database";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "Comment créer une nouvelle base de données PostgreSQL ? ";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-table";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Comment initialiser un nouveau serveur PostgreSQL. ";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "far fa-alarm-clock";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "Comment puis-je exécuter PostgreSQL tout le temps au démarrage de mon ordinateur ? ";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "far fa-layer-plus";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Comment exécuter PostgreSQL en tant que service systemd. ";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;
	public static final String recapituler3TableTr12Td1I1 = "far fa-search";
	public static final String recapituler3TableTr12Td1I = recapituler3TableTr12Td1I1;
	public static final String recapituler3TableTr12Td21 = "Comment le système connaît-il le nouveau service ? ";
	public static final String recapituler3TableTr12Td2 = recapituler3TableTr12Td21;
	public static final String recapituler3TableTr12Td3I1 = "far fa-redo-alt";
	public static final String recapituler3TableTr12Td3I = recapituler3TableTr12Td3I1;
	public static final String recapituler3TableTr12Td41 = "Rechargez le daemon systemd. ";
	public static final String recapituler3TableTr12Td4 = recapituler3TableTr12Td41;
	public static final String recapituler3TableTr13Td1I1 = "far fa-toggle-off";
	public static final String recapituler3TableTr13Td1I = recapituler3TableTr13Td1I1;
	public static final String recapituler3TableTr13Td21 = "Comment activer le service PostgreSQL? ";
	public static final String recapituler3TableTr13Td2 = recapituler3TableTr13Td21;
	public static final String recapituler3TableTr13Td3I1 = "far fa-toggle-on";
	public static final String recapituler3TableTr13Td3I = recapituler3TableTr13Td3I1;
	public static final String recapituler3TableTr13Td41 = "Utilisez la commande systemctl enable. ";
	public static final String recapituler3TableTr13Td4 = recapituler3TableTr13Td41;
	public static final String recapituler3TableTr14Td1I1 = "far fa-pause-circle";
	public static final String recapituler3TableTr14Td1I = recapituler3TableTr14Td1I1;
	public static final String recapituler3TableTr14Td21 = "Comment démarrer le service PostgreSQL? ";
	public static final String recapituler3TableTr14Td2 = recapituler3TableTr14Td21;
	public static final String recapituler3TableTr14Td3I1 = "far fa-play-circle";
	public static final String recapituler3TableTr14Td3I = recapituler3TableTr14Td3I1;
	public static final String recapituler3TableTr14Td41 = "Utilisez la commande systemctl start. ";
	public static final String recapituler3TableTr14Td4 = recapituler3TableTr14Td41;
	public static final String recapituler3TableTr15Td1I1 = "far fa-clipboard";
	public static final String recapituler3TableTr15Td1I = recapituler3TableTr15Td1I1;
	public static final String recapituler3TableTr15Td21 = "Comment puis-je m'assurer que le service PostgreSQL a démarré avec succès ? ";
	public static final String recapituler3TableTr15Td2 = recapituler3TableTr15Td21;
	public static final String recapituler3TableTr15Td3I1 = "far fa-clipboard-check";
	public static final String recapituler3TableTr15Td3I = recapituler3TableTr15Td3I1;
	public static final String recapituler3TableTr15Td41 = "Utilisez la commande systemctl status. ";
	public static final String recapituler3TableTr15Td4 = recapituler3TableTr15Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L008CreerCertificat recapituler3Init() {
		if(recapituler3 != null) {
			((C001L008CreerCertificat)this).avantPagePart(recapituler3, "recapituler3");
			((C001L008CreerCertificat)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
			{ e("tr").a("class", " recapituler3TableTr11 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td1 recapituler3TableTr11Td odd ").f();
					{ e("i").a("class", recapituler3TableTr11Td1I1, " site-menu-icon recapituler3TableTr11Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td2 recapituler3TableTr11Td even ").f();
					sx(recapituler3TableTr11Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td3 recapituler3TableTr11Td odd ").f();
					{ e("i").a("class", recapituler3TableTr11Td3I1, " site-menu-icon recapituler3TableTr11Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr11Td4 recapituler3TableTr11Td even ").f();
					sx(recapituler3TableTr11Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr12 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td1 recapituler3TableTr12Td odd ").f();
					{ e("i").a("class", recapituler3TableTr12Td1I1, " site-menu-icon recapituler3TableTr12Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td2 recapituler3TableTr12Td even ").f();
					sx(recapituler3TableTr12Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td3 recapituler3TableTr12Td odd ").f();
					{ e("i").a("class", recapituler3TableTr12Td3I1, " site-menu-icon recapituler3TableTr12Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr12Td4 recapituler3TableTr12Td even ").f();
					sx(recapituler3TableTr12Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr13 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td1 recapituler3TableTr13Td odd ").f();
					{ e("i").a("class", recapituler3TableTr13Td1I1, " site-menu-icon recapituler3TableTr13Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td2 recapituler3TableTr13Td even ").f();
					sx(recapituler3TableTr13Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td3 recapituler3TableTr13Td odd ").f();
					{ e("i").a("class", recapituler3TableTr13Td3I1, " site-menu-icon recapituler3TableTr13Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr13Td4 recapituler3TableTr13Td even ").f();
					sx(recapituler3TableTr13Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr14 recapituler3TableTr even ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td1 recapituler3TableTr14Td odd ").f();
					{ e("i").a("class", recapituler3TableTr14Td1I1, " site-menu-icon recapituler3TableTr14Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td2 recapituler3TableTr14Td even ").f();
					sx(recapituler3TableTr14Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td3 recapituler3TableTr14Td odd ").f();
					{ e("i").a("class", recapituler3TableTr14Td3I1, " site-menu-icon recapituler3TableTr14Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr14Td4 recapituler3TableTr14Td even ").f();
					sx(recapituler3TableTr14Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr15 recapituler3TableTr odd ").f();
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td1 recapituler3TableTr15Td odd ").f();
					{ e("i").a("class", recapituler3TableTr15Td1I1, " site-menu-icon recapituler3TableTr15Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td2 recapituler3TableTr15Td even ").f();
					sx(recapituler3TableTr15Td21);
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td3 recapituler3TableTr15Td odd ").f();
					{ e("i").a("class", recapituler3TableTr15Td3I1, " site-menu-icon recapituler3TableTr15Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " w3-mobile recapituler3TableTr15Td4 recapituler3TableTr15Td even ").f();
					sx(recapituler3TableTr15Td41);
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

	protected boolean dejaInitialiseC001L008CreerCertificat = false;

	public C001L008CreerCertificat initLoinC001L008CreerCertificat(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L008CreerCertificat) {
			dejaInitialiseC001L008CreerCertificat = true;
			initLoinC001L008CreerCertificat();
		}
		return (C001L008CreerCertificat)this;
	}

	public void initLoinC001L008CreerCertificat() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L008CreerCertificat();
	}

	public void initC001L008CreerCertificat() {
		moiInit();
		questionDependencesInit();
		questionMkdirSrvInit();
		questionCertbotInit();
		questionCopierInit();
		questionRacineCaInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L008CreerCertificat(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L008CreerCertificat(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionDependences != null)
			questionDependences.setRequeteSite_(requeteSite_);
		if(questionMkdirSrv != null)
			questionMkdirSrv.setRequeteSite_(requeteSite_);
		if(questionCertbot != null)
			questionCertbot.setRequeteSite_(requeteSite_);
		if(questionCopier != null)
			questionCopier.setRequeteSite_(requeteSite_);
		if(questionRacineCa != null)
			questionRacineCa.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L008CreerCertificat(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L008CreerCertificat(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L008CreerCertificat(String var) {
		C001L008CreerCertificat oC001L008CreerCertificat = (C001L008CreerCertificat)this;
		switch(var) {
			case "moi":
				return oC001L008CreerCertificat.moi;
			case "questionDependences":
				return oC001L008CreerCertificat.questionDependences;
			case "questionMkdirSrv":
				return oC001L008CreerCertificat.questionMkdirSrv;
			case "questionCertbot":
				return oC001L008CreerCertificat.questionCertbot;
			case "questionCopier":
				return oC001L008CreerCertificat.questionCopier;
			case "questionRacineCa":
				return oC001L008CreerCertificat.questionRacineCa;
			case "recapituler1":
				return oC001L008CreerCertificat.recapituler1;
			case "recapituler2":
				return oC001L008CreerCertificat.recapituler2;
			case "recapituler3":
				return oC001L008CreerCertificat.recapituler3;
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
				o = attribuerC001L008CreerCertificat(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L008CreerCertificat(String var, Object val) {
		C001L008CreerCertificat oC001L008CreerCertificat = (C001L008CreerCertificat)this;
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
					o = definirC001L008CreerCertificat(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L008CreerCertificat(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement-999.png"));
				System.out.println("C001L008CreerCertificatFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/008-how-to-obtain-free-tls-certificates?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/008-how-to-obtain-free-tls-certificates-999.png"));
				System.out.println("C001L008CreerCertificatEnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L008CreerCertificat o = new C001L008CreerCertificat();
			o.requeteSiteC001L008CreerCertificat(requeteSite);
			o.initLoinC001L008CreerCertificat(requeteSite);
			o.indexerC001L008CreerCertificat();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() {
		indexerC001L008CreerCertificat();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) {
		indexerC001L008CreerCertificat(document);
	}

	public void indexerC001L008CreerCertificat(SolrClient clientSolr) {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L008CreerCertificat(document);
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L008CreerCertificat() {
		try {
			SolrInputDocument document = new SolrInputDocument();
			indexerC001L008CreerCertificat(document);
			SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
			clientSolr.add(document);
			clientSolr.commit();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}

	public void indexerC001L008CreerCertificat(SolrInputDocument document) {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L008CreerCertificat() {
		try {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
			initLoinC001L008CreerCertificat(siteContexte.getRequeteSite_());
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
		stockerC001L008CreerCertificat(solrDocument);
	}
	public void stockerC001L008CreerCertificat(SolrDocument solrDocument) {
		C001L008CreerCertificat oC001L008CreerCertificat = (C001L008CreerCertificat)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L008CreerCertificat();
	}

	public void htmlBodyCourtC001L008CreerCertificat() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionDependences != null)
			questionDependences.htmlBodyCourt();
		if(questionMkdirSrv != null)
			questionMkdirSrv.htmlBodyCourt();
		if(questionCertbot != null)
			questionCertbot.htmlBodyCourt();
		if(questionCopier != null)
			questionCopier.htmlBodyCourt();
		if(questionRacineCa != null)
			questionRacineCa.htmlBodyCourt();
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
		htmlBodyC001L008CreerCertificat();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificat() {
		((C001L008CreerCertificat)this).htmlBodyMoi();
		((C001L008CreerCertificat)this).htmlBodyQuestionDependences();
		((C001L008CreerCertificat)this).htmlBodyQuestionMkdirSrv();
		((C001L008CreerCertificat)this).htmlBodyQuestionCertbot();
		((C001L008CreerCertificat)this).htmlBodyQuestionCopier();
		((C001L008CreerCertificat)this).htmlBodyQuestionRacineCa();
		((C001L008CreerCertificat)this).htmlBodyRecapituler1();
		((C001L008CreerCertificat)this).htmlBodyRecapituler2();
		((C001L008CreerCertificat)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L008CreerCertificat))
			return false;
		C001L008CreerCertificat that = (C001L008CreerCertificat)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L008CreerCertificat {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L008CreerCertificatVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, moiP6, moiP7, moiP8, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesPre1Span51, questionDependencesOl2Li1Dt1, questionDependencesOl2Li1Dd1, questionDependencesOl2Li1Dd2, questionDependencesOl2Li1Dd3, questionDependencesOl2Li2Dt1, questionDependencesOl2Li2Dd1, questionDependencesOl2Li2Dd2, questionDependencesOl2Li3Dt1, questionDependencesOl2Li3Dd1, questionDependencesOl2Li4Dt1, questionDependencesOl2Li4Dd1, questionDependencesOl2Li5Dt1, questionDependencesOl2Li5Dd1, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li1Dt1, questionDependencesOl4Li2Dt1, questionDependencesOl4Li3Dt1, questionDependencesOl4Li4Dt1, questionDependencesOl4Li5Dt1, questionDependencesOl4Li5Dd1, questionMkdirSrvH3I1, questionMkdirSrvH3Span1, questionMkdirSrvH4I1, questionMkdirSrvH4Span1, questionMkdirSrvPreSpan011, questionMkdirSrvPreSpan021, questionMkdirSrvPreSpan031, questionMkdirSrvPreSpan041, questionMkdirSrvPreSpan051, questionMkdirSrvPreSpan061, questionMkdirSrvPreSpan071, questionMkdirSrvPreSpan081, questionMkdirSrvPreSpan091, questionMkdirSrvPreSpan101, questionMkdirSrvOl2Li01Dt1, questionMkdirSrvOl2Li02Dt1, questionMkdirSrvOl2Li02Dd1, questionMkdirSrvOl2Li03Dt1, questionMkdirSrvOl2Li03Dd1, questionMkdirSrvOl2Li04Dt1, questionMkdirSrvOl2Li04Dd1, questionMkdirSrvOl2Li05Dt1, questionMkdirSrvOl2Li05Dd1, questionMkdirSrvOl2Li06Dt1, questionMkdirSrvOl2Li06Dd1, questionMkdirSrvOl2Li07Dt1, questionMkdirSrvOl2Li07Dd1, questionMkdirSrvOl2Li08Dt1, questionMkdirSrvOl2Li08Dd1, questionMkdirSrvOl2Li09Dt1, questionMkdirSrvOl2Li09Dd1, questionMkdirSrvOl2Li10Dt1, questionMkdirSrvOl2Li10Dd1, questionCertbotH3I1, questionCertbotH3Span1, questionCertbotH4I1, questionCertbotH4Span1, questionCertbotPreSpan011, questionCertbotPreSpan021, questionCertbotPreSpan031, questionCertbotPreSpan041, questionCertbotPreSpan051, questionCertbotPreSpan061, questionCertbotPreSpan07Span11, questionCertbotPreSpan07Span21, questionCertbotPreSpan08Span11, questionCertbotPreSpan08Span21, questionCertbotPreSpan09Span11, questionCertbotPreSpan09Span21, questionCertbotOl2Li01Dt1, questionCertbotOl2Li02Dt1, questionCertbotOl2Li02Dd1, questionCertbotOl2Li03Dt1, questionCertbotOl2Li03Dd1, questionCertbotOl2Li04Dt1, questionCertbotOl2Li04Dd1, questionCertbotOl2Li05Dt1, questionCertbotOl2Li05Dd1, questionCertbotOl2Li06Dt1, questionCertbotOl2Li06Dd1, questionCertbotOl2Li07DtSpan11, questionCertbotOl2Li07DtSpan21, questionCertbotOl2Li07DdSpan31, questionCertbotOl2Li08DtSpan11, questionCertbotOl2Li08DtSpan21, questionCertbotOl2Li08DdSpan31, questionCertbotOl2Li09DtSpan11, questionCertbotOl2Li09DtSpan21, questionCertbotOl2Li09DdSpan31, questionCertbotOl2Li09DdSpan32, questionCertbotP21, questionCertbotP22, questionCertbotP23, questionCertbotP24, questionCertbotP25, questionCertbotP3Span11, questionCertbotP3Span12, questionCertbotP3Span13, questionCertbotP3A11, questionCertbotP3Span21, questionCertbotP3Span22, questionCertbotP3Span23, questionCertbotP3Span24, questionCertbotP3Span25, questionCertbotP3Span26, questionCertbotP3Span27, questionCopierH3I1, questionCopierH3Span1, questionCopierH4I1, questionCopierH4Span1, questionCopierPre1Span011, questionCopierPre1Span021, questionCopierPre1Span031, questionCopierPre1Span041, questionCopierPre1Span051, questionCopierPre1Span061, questionCopierPre1Span071, questionCopierPre1Span081, questionCopierPre1Span09Span11, questionCopierPreSpan09Span21, questionCopierPre1Span09Span31, questionCopierPre1Span101, questionCopierOl1Li01Dt1, questionCopierOl1Li02Dt1, questionCopierOl1Li03Dt1, questionCopierOl1Li04Dt1, questionCopierOl1Li05Dt1, questionCopierOl1Li06Dt1, questionCopierOl1Li07Dt1, questionCopierOl1Li08Dt1, questionCopierOl1Li09Dt1, questionCopierOl1Li09Dt2, questionCopierOl1Li09Dt3, questionCopierOl1Li09Dt4, questionCopierOl1Li09Dd1, questionCopierOl1Li10Dt1, questionCopierOl1Li10Dd1, questionCopierPre2Span011, questionCopierPre2Span021, questionCopierPre2Span031, questionCopierPre2Span041, questionCopierPre2Span051, questionCopierPre2Span061, questionCopierPre2Span071, questionCopierPre2Span081, questionCopierPre2Span09Span11, questionCopierPre2Span09Span21, questionCopierPre2Span09Span31, questionCopierPre2Span101, questionCopierOl2Li01Dt1, questionCopierOl2Li02Dt1, questionCopierOl2Li03Dt1, questionCopierOl2Li04Dt1, questionCopierOl2Li05Dt1, questionCopierOl2Li06Dt1, questionCopierOl2Li07Dt1, questionCopierOl2Li08Dt1, questionCopierOl2Li09Dt1, questionCopierOl2Li09Dt2, questionCopierOl2Li09Dt3, questionCopierOl2Li09Dt4, questionCopierOl2Li09Dd1, questionCopierOl2Li10Dt1, questionCopierOl2Li10Dd1, questionRacineCaH3I1, questionRacineCaH3Span1, questionRacineCaH4I1, questionRacineCaH4Span1, questionRacineCaPre1Span011, questionRacineCaPre1Span021, questionRacineCaPre1Span031, questionRacineCaOl1Li01Dt1, questionRacineCaOl1Li01Dd1, questionRacineCaOl1Li02Dt1, questionRacineCaOl1Li02Dd1, questionRacineCaOl1Li03Dt1, questionRacineCaOl1Li03Dd1, questionRacineCaPre2Span011, questionRacineCaPre2Span021, questionRacineCaPre2Span031, questionRacineCaOl2Li01Dt1, questionRacineCaOl2Li02Dt1, questionRacineCaOl2Li02Dd1, questionRacineCaOl2Li03Dt1, questionRacineCaOl2Li03Dd1, questionRacineCaPre3Span011, questionRacineCaPre3Span021, questionRacineCaPre3Span031, questionRacineCaOl3Li01Dt1, questionRacineCaOl3Li02Dt1, questionRacineCaOl3Li02Dd1, questionRacineCaOl3Li03Dt1, questionRacineCaOl3Li03Dd1, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41, recapituler3TableTr13Td1I1, recapituler3TableTr13Td21, recapituler3TableTr13Td3I1, recapituler3TableTr13Td41, recapituler3TableTr14Td1I1, recapituler3TableTr14Td21, recapituler3TableTr14Td3I1, recapituler3TableTr14Td41, recapituler3TableTr15Td1I1, recapituler3TableTr15Td21, recapituler3TableTr15Td3I1, recapituler3TableTr15Td41 };
}
