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

	public static final String C001L008CreerCertificat_UnNom = "le leçon";
	public static final String C001L008CreerCertificat_NomSingulier = "leçon";
	public static final String C001L008CreerCertificat_NomPluriel = "leçons";
	public static final String C001L008CreerCertificat_H1 = "Que puis-je faire une fois que j'ai acheté un nom de domaine ? ";
	public static final String C001L008CreerCertificat_H2 = "Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ";
	public static final String C001L008CreerCertificat_Titre = "Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. ";
	public static final String C001L008CreerCertificat_LesNoms = "les leçons";
	public static final String C001L008CreerCertificat_NomVar = "leçon";
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
	public static final String questionDependencesH3Span1 = "Comment installer les dépendences pour PostgreSQL ? ";
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
	public static final String questionDependencesPre1Span51 = " postgresql";
	public static final String questionDependencesPre1Span5 = questionDependencesPre1Span51;
	public static final String questionDependencesOl2Li11 = "sudo: La commande pour installer des dépots yum commence par la commande sudo. ";
	public static final String questionDependencesOl2Li12 = "La commande \"sudo\" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. ";
	public static final String questionDependencesOl2Li13 = "L'installation des dépots yum nécessite toujours les privilèges root. ";
	public static final String questionDependencesOl2Li1 = questionDependencesOl2Li11 + questionDependencesOl2Li12 + questionDependencesOl2Li13;
	public static final String questionDependencesOl2Li21 = "yum Signifie \"Yellowdog Updater Modified\", mais personne ne le connait comme yellowdog, juste yum. ";
	public static final String questionDependencesOl2Li22 = "CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. ";
	public static final String questionDependencesOl2Li2 = questionDependencesOl2Li21 + questionDependencesOl2Li22;
	public static final String questionDependencesOl2Li31 = "install : Pour installer des nouveaux paquets yum. ";
	public static final String questionDependencesOl2Li3 = questionDependencesOl2Li31;
	public static final String questionDependencesOl2Li41 = "-y : Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. ";
	public static final String questionDependencesOl2Li4 = questionDependencesOl2Li41;
	public static final String questionDependencesOl2Li51 = "certbot : Nom du paquet des packages supplémentaires pour le référentiel Enterprise Linux. ";
	public static final String questionDependencesOl2Li5 = questionDependencesOl2Li51;
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
	public static final String questionDependencesOl4Li11 = "sudo";
	public static final String questionDependencesOl4Li1 = questionDependencesOl4Li11;
	public static final String questionDependencesOl4Li21 = "yum";
	public static final String questionDependencesOl4Li2 = questionDependencesOl4Li21;
	public static final String questionDependencesOl4Li31 = "install";
	public static final String questionDependencesOl4Li3 = questionDependencesOl4Li31;
	public static final String questionDependencesOl4Li41 = "-y";
	public static final String questionDependencesOl4Li4 = questionDependencesOl4Li41;
	public static final String questionDependencesOl4Li51 = "certbot : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. ";
	public static final String questionDependencesOl4Li5 = questionDependencesOl4Li51;

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
			{ e("li").a("class", " questionDependencesOl2Li5 questionDependencesOl2Li odd ").f();
				sx(questionDependencesOl2Li51);
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
	public static final String questionMkdirSrvPreSpan11 = "sudo";
	public static final String questionMkdirSrvPreSpan1 = questionMkdirSrvPreSpan11;
	public static final String questionMkdirSrvPreSpan21 = " install";
	public static final String questionMkdirSrvPreSpan2 = questionMkdirSrvPreSpan21;
	public static final String questionMkdirSrvPreSpan31 = " -d";
	public static final String questionMkdirSrvPreSpan3 = questionMkdirSrvPreSpan31;
	public static final String questionMkdirSrvPreSpan41 = " -o";
	public static final String questionMkdirSrvPreSpan4 = questionMkdirSrvPreSpan41;
	public static final String questionMkdirSrvPreSpan51 = " $USER";
	public static final String questionMkdirSrvPreSpan5 = questionMkdirSrvPreSpan51;
	public static final String questionMkdirSrvPreSpan61 = " -g";
	public static final String questionMkdirSrvPreSpan6 = questionMkdirSrvPreSpan61;
	public static final String questionMkdirSrvPreSpan71 = " $USER";
	public static final String questionMkdirSrvPreSpan7 = questionMkdirSrvPreSpan71;
	public static final String questionMkdirSrvPreSpan61 = " -m";
	public static final String questionMkdirSrvPreSpan6 = questionMkdirSrvPreSpan61;
	public static final String questionMkdirSrvPreSpan71 = " rwxr-xr-x";
	public static final String questionMkdirSrvPreSpan7 = questionMkdirSrvPreSpan71;
	public static final String questionMkdirSrvPreSpan81 = " /srv/certbot";
	public static final String questionMkdirSrvPreSpan8 = questionMkdirSrvPreSpan81;
	public static final String questionMkdirSrvOl2Li11 = "sudo";
	public static final String questionMkdirSrvOl2Li1 = questionMkdirSrvOl2Li11;
	public static final String questionMkdirSrvOl2Li21 = "install : Crée des répertoires et définit des attributs sur le nouveau répertoire. ";
	public static final String questionMkdirSrvOl2Li2 = questionMkdirSrvOl2Li21;
	public static final String questionMkdirSrvOl2Li31 = "-d : Créez tous les composants des répertoires spécifiés. ";
	public static final String questionMkdirSrvOl2Li3 = questionMkdirSrvOl2Li31;
	public static final String questionMkdirSrvOl2Li41 = "-o : Définir la propriété sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrvOl2Li4 = questionMkdirSrvOl2Li41;
	public static final String questionMkdirSrvOl2Li51 = "$USER : L'utilisateur actuel à rendre le propriétaire du répertoire. ";
	public static final String questionMkdirSrvOl2Li5 = questionMkdirSrvOl2Li51;
	public static final String questionMkdirSrvOl2Li61 = "-g : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrvOl2Li6 = questionMkdirSrvOl2Li61;
	public static final String questionMkdirSrvOl2Li71 = "$USER : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. ";
	public static final String questionMkdirSrvOl2Li7 = questionMkdirSrvOl2Li71;
	public static final String questionMkdirSrvOl2Li61 = "-m : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). ";
	public static final String questionMkdirSrvOl2Li6 = questionMkdirSrvOl2Li61;
	public static final String questionMkdirSrvOl2Li71 = "700 : Accordez des autorisations de lecture, d'écriture et d'exécution à l'utilisateur du répertoire uniquement. ";
	public static final String questionMkdirSrvOl2Li7 = questionMkdirSrvOl2Li71;
	public static final String questionMkdirSrvOl2Li81 = "/srv est un bon endroit pour installer des serveurs logicielles open source et vos certificats, clés et magasins de clés. ";
	public static final String questionMkdirSrvOl2Li8 = questionMkdirSrvOl2Li81;

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
			{ e("span").a("class", " questionMkdirSrvPreSpan1 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan11);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan2 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan21);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan3 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan31);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan4 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan41);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan5 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan51);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan6 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan7 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan6 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan61);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan7 questionMkdirSrvPreSpan odd ").f();
				sx(questionMkdirSrvPreSpan71);
			} g("span");
			{ e("span").a("class", " questionMkdirSrvPreSpan8 questionMkdirSrvPreSpan even ").f();
				sx(questionMkdirSrvPreSpan81);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionMkdirSrvOl2 questionMkdirSrvOl even ").f();
			{ e("li").a("class", " questionMkdirSrvOl2Li1 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li2 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li3 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li4 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li5 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li6 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li7 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li6 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li7 questionMkdirSrvOl2Li odd ").f();
				sx(questionMkdirSrvOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirSrvOl2Li8 questionMkdirSrvOl2Li even ").f();
				sx(questionMkdirSrvOl2Li81);
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
	public static final String questionCertbotPreSpan071 = " -d example.com";
	public static final String questionCertbotPreSpan07 = questionCertbotPreSpan071;
	public static final String questionCertbotPreSpan081 = " -d *.example.com";
	public static final String questionCertbotPreSpan08 = questionCertbotPreSpan081;
	public static final String questionCertbotPreSpan091 = " -d *.apps.example.com";
	public static final String questionCertbotPreSpan09 = questionCertbotPreSpan091;
	public static final String questionCertbotPreSpan101 = " -d example.org -d *.example.org -d *.apps.example.org";
	public static final String questionCertbotPreSpan10 = questionCertbotPreSpan101;
	public static final String questionCertbotOl2Li011 = "sudo";
	public static final String questionCertbotOl2Li01 = questionCertbotOl2Li011;
	public static final String questionCertbotOl2Li021 = "certbot : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. ";
	public static final String questionCertbotOl2Li02 = questionCertbotOl2Li021;
	public static final String questionCertbotOl2Li031 = "--manual : Obtenez des certificats de manière interactive ou à l'aide d'un script shell. ";
	public static final String questionCertbotOl2Li03 = questionCertbotOl2Li031;
	public static final String questionCertbotOl2Li041 = "--preferred-challenges dns : Obtenir ou renouveler un certificat, mais ne l'installez pas. ";
	public static final String questionCertbotOl2Li04 = questionCertbotOl2Li041;
	public static final String questionCertbotOl2Li051 = "--server https://acme-v02.api.letsencrypt.org/directory : Spécifiez une version plus récente d'un serveur letsencrypt qui autorise les domaines wildcard dans les certificats. ";
	public static final String questionCertbotOl2Li05 = questionCertbotOl2Li051;
	public static final String questionCertbotOl2Li061 = "certonly : Obtenir ou renouveler un certificat, mais ne l'installez pas. ";
	public static final String questionCertbotOl2Li06 = questionCertbotOl2Li061;
	public static final String questionCertbotOl2Li071 = "-d example.com : Spécifiez votre nom de domaine de racine pour l'inclure en tant que route sécurisée par le certificat. ";
	public static final String questionCertbotOl2Li07 = questionCertbotOl2Li071;
	public static final String questionCertbotOl2Li081 = "-d example.com : Incluez des domaines génériques dans votre domaine racine, y compris www par exemple. ";
	public static final String questionCertbotOl2Li08 = questionCertbotOl2Li081;
	public static final String questionCertbotOl2Li091 = "-d example.com : Les domaines génériques n'incluent pas les sous-domaines d'un domaine générique; incluez donc également des sous-domaines supplémentaires. ";
	public static final String questionCertbotOl2Li09 = questionCertbotOl2Li091;
	public static final String questionCertbotOl2Li101 = "-d example.com : Vous pouvez inclure plus d'un nom de domaine dans le même certificat si vous le souhaitez, jusqu'à un montant généreux par letsencrypt. ";
	public static final String questionCertbotOl2Li10 = questionCertbotOl2Li101;
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
	public static final String questionCertbotP3A11 = " fastmail.com";
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
				sx(questionCertbotPreSpan071);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan08 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan081);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan09 questionCertbotPreSpan odd ").f();
				sx(questionCertbotPreSpan091);
			} g("span");
			{ e("span").a("class", " questionCertbotPreSpan10 questionCertbotPreSpan even ").f();
				sx(questionCertbotPreSpan101);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCertbotOl2 questionCertbotOl even ").f();
			{ e("li").a("class", " questionCertbotOl2Li01 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li011);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li02 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li021);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li03 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li031);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li04 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li041);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li05 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li051);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li06 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li061);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li07 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li071);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li08 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li081);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li09 questionCertbotOl2Li odd ").f();
				sx(questionCertbotOl2Li091);
			} g("li");
			{ e("li").a("class", " questionCertbotOl2Li10 questionCertbotOl2Li even ").f();
				sx(questionCertbotOl2Li101);
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

	//////////////////////////
	// questionClonerSource //
	//////////////////////////

	public static final String questionClonerSourceH3I1 = "far fa-cloud-download";
	public static final String questionClonerSourceH3I = questionClonerSourceH3I1;
	public static final String questionClonerSourceH3Span1 = "Comment télécharger le code source de PostgreSQL ? ";
	public static final String questionClonerSourceH3Span = questionClonerSourceH3Span1;
	public static final String questionClonerSourceH4I1 = "fab fa-git";
	public static final String questionClonerSourceH4I = questionClonerSourceH4I1;
	public static final String questionClonerSourceH4Span1 = "Cloner le code source avec la commande git. ";
	public static final String questionClonerSourceH4Span = questionClonerSourceH4Span1;
	public static final String questionClonerSourcePreSpan11 = "git";
	public static final String questionClonerSourcePreSpan1 = questionClonerSourcePreSpan11;
	public static final String questionClonerSourcePreSpan21 = " clone";
	public static final String questionClonerSourcePreSpan2 = questionClonerSourcePreSpan21;
	public static final String questionClonerSourcePreSpan31 = " git://git.postgresql.org/git/postgresql.git";
	public static final String questionClonerSourcePreSpan3 = questionClonerSourcePreSpan31;
	public static final String questionClonerSourcePreSpan41 = " /usr/local/src/pgsql";
	public static final String questionClonerSourcePreSpan4 = questionClonerSourcePreSpan41;
	public static final String questionClonerSourceOl2Li11 = "git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. ";
	public static final String questionClonerSourceOl2Li1 = questionClonerSourceOl2Li11;
	public static final String questionClonerSourceOl2Li21 = "clone : Cloner un référentiel dans un répertoire. ";
	public static final String questionClonerSourceOl2Li2 = questionClonerSourceOl2Li21;
	public static final String questionClonerSourceOl2Li31 = "git://git.postgresql.org/git/postgresql.git : URL git vers le référentiel de code source PostgreSQL. ";
	public static final String questionClonerSourceOl2Li3 = questionClonerSourceOl2Li31;
	public static final String questionClonerSourceOl2Li41 = "/usr/local/src/pgsql : Répertoire dans lequel le code source PostgreSQL sera cloné. ";
	public static final String questionClonerSourceOl2Li4 = questionClonerSourceOl2Li41;

	/**	L'entité « questionClonerSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionClonerSource = new PageHtml();
	public Couverture<PageHtml> questionClonerSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionClonerSource").o(questionClonerSource);

	/**	<br/>L'entité « questionClonerSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionClonerSource">Trouver l'entité questionClonerSource dans Solr</a>
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
	protected C001L008CreerCertificat questionClonerSourceInit() {
		if(questionClonerSource != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionClonerSource, "questionClonerSource");
			((C001L008CreerCertificat)this).avantPagePart(questionClonerSource, "questionClonerSource");
		}
		if(!questionClonerSourceCouverture.dejaInitialise) {
			_questionClonerSource(questionClonerSource);
		}
		questionClonerSource.initLoinPourClasse(requeteSite_);
		questionClonerSourceCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String questionListerTagsH3Span1 = "Comment choisir une version récente de PostgreSQL ? ";
	public static final String questionListerTagsH3Span = questionListerTagsH3Span1;
	public static final String questionListerTagsH4I1 = "far fa-tag";
	public static final String questionListerTagsH4I = questionListerTagsH4I1;
	public static final String questionListerTagsH4Span1 = "Listez toutes les tags du référentiel git. ";
	public static final String questionListerTagsH4Span = questionListerTagsH4Span1;
	public static final String questionListerTagsPreSpan11 = "(cd";
	public static final String questionListerTagsPreSpan1 = questionListerTagsPreSpan11;
	public static final String questionListerTagsPreSpan21 = " /usr/local/src/pgsql";
	public static final String questionListerTagsPreSpan2 = questionListerTagsPreSpan21;
	public static final String questionListerTagsPreSpan31 = " &&";
	public static final String questionListerTagsPreSpan3 = questionListerTagsPreSpan31;
	public static final String questionListerTagsPreSpan41 = " git";
	public static final String questionListerTagsPreSpan4 = questionListerTagsPreSpan41;
	public static final String questionListerTagsPreSpan51 = " tag)";
	public static final String questionListerTagsPreSpan5 = questionListerTagsPreSpan51;
	public static final String questionListerTagsOl2Li11 = "(cd : Changer de répertoire temporairement avec la parenthèse ouverte. ";
	public static final String questionListerTagsOl2Li1 = questionListerTagsOl2Li11;
	public static final String questionListerTagsOl2Li21 = "/usr/local/src/pgsql : Répertoire dans lequel le code source PostgreSQL a été cloné. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionListerTags">Trouver l'entité questionListerTags dans Solr</a>
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
	protected C001L008CreerCertificat questionListerTagsInit() {
		if(questionListerTags != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionListerTags, "questionListerTags");
			((C001L008CreerCertificat)this).avantPagePart(questionListerTags, "questionListerTags");
		}
		if(!questionListerTagsCouverture.dejaInitialise) {
			_questionListerTags(questionListerTags);
		}
		questionListerTags.initLoinPourClasse(requeteSite_);
		questionListerTagsCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String questionCheckoutTagH3Span1 = "Comment changer de version du code source de PostgreSQL ? ";
	public static final String questionCheckoutTagH3Span = questionCheckoutTagH3Span1;
	public static final String questionCheckoutTagH4I1 = "far fa-code-commit";
	public static final String questionCheckoutTagH4I = questionCheckoutTagH4I1;
	public static final String questionCheckoutTagH4Span1 = "Checkout la tag git. ";
	public static final String questionCheckoutTagH4Span = questionCheckoutTagH4Span1;
	public static final String questionCheckoutTagPreSpan11 = "(cd";
	public static final String questionCheckoutTagPreSpan1 = questionCheckoutTagPreSpan11;
	public static final String questionCheckoutTagPreSpan21 = " /usr/local/src/pgsql";
	public static final String questionCheckoutTagPreSpan2 = questionCheckoutTagPreSpan21;
	public static final String questionCheckoutTagPreSpan31 = " &&";
	public static final String questionCheckoutTagPreSpan3 = questionCheckoutTagPreSpan31;
	public static final String questionCheckoutTagPreSpan41 = " git";
	public static final String questionCheckoutTagPreSpan4 = questionCheckoutTagPreSpan41;
	public static final String questionCheckoutTagPreSpan51 = " checkout";
	public static final String questionCheckoutTagPreSpan5 = questionCheckoutTagPreSpan51;
	public static final String questionCheckoutTagPreSpan61 = " REL_11_3)";
	public static final String questionCheckoutTagPreSpan6 = questionCheckoutTagPreSpan61;
	public static final String questionCheckoutTagOl2Li11 = "(cd";
	public static final String questionCheckoutTagOl2Li1 = questionCheckoutTagOl2Li11;
	public static final String questionCheckoutTagOl2Li21 = "/usr/local/src/pgsql";
	public static final String questionCheckoutTagOl2Li2 = questionCheckoutTagOl2Li21;
	public static final String questionCheckoutTagOl2Li31 = "&&";
	public static final String questionCheckoutTagOl2Li3 = questionCheckoutTagOl2Li31;
	public static final String questionCheckoutTagOl2Li41 = "git";
	public static final String questionCheckoutTagOl2Li4 = questionCheckoutTagOl2Li41;
	public static final String questionCheckoutTagOl2Li51 = "checkout : Checkout une branche dans l’arbre de travail. ";
	public static final String questionCheckoutTagOl2Li5 = questionCheckoutTagOl2Li51;
	public static final String questionCheckoutTagOl2Li61 = "REL_11_3) : La dernière tag pour baser la branche. ";
	public static final String questionCheckoutTagOl2Li6 = questionCheckoutTagOl2Li61;

	/**	L'entité « questionCheckoutTag »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCheckoutTag = new PageHtml();
	public Couverture<PageHtml> questionCheckoutTagCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCheckoutTag").o(questionCheckoutTag);

	/**	<br/>L'entité « questionCheckoutTag »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionCheckoutTag">Trouver l'entité questionCheckoutTag dans Solr</a>
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
	protected C001L008CreerCertificat questionCheckoutTagInit() {
		if(questionCheckoutTag != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
			((C001L008CreerCertificat)this).avantPagePart(questionCheckoutTag, "questionCheckoutTag");
		}
		if(!questionCheckoutTagCouverture.dejaInitialise) {
			_questionCheckoutTag(questionCheckoutTag);
		}
		questionCheckoutTag.initLoinPourClasse(requeteSite_);
		questionCheckoutTagCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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

	public static final String questionConstruireSourceH3I1 = "far fa-tools";
	public static final String questionConstruireSourceH3I = questionConstruireSourceH3I1;
	public static final String questionConstruireSourceH3Span1 = "Comment contruire le code source de PostgreSQL ? ";
	public static final String questionConstruireSourceH3Span = questionConstruireSourceH3Span1;
	public static final String questionConstruireSourceH4I1 = "far fa-terminal";
	public static final String questionConstruireSourceH4I = questionConstruireSourceH4I1;
	public static final String questionConstruireSourceH4Span1 = "Construisez PostgreSQL avec la commande configure. ";
	public static final String questionConstruireSourceH4Span = questionConstruireSourceH4Span1;
	public static final String questionConstruireSourcePre1Span011 = "(cd";
	public static final String questionConstruireSourcePre1Span01 = questionConstruireSourcePre1Span011;
	public static final String questionConstruireSourcePre1Span021 = " /usr/local/src/pgsql";
	public static final String questionConstruireSourcePre1Span02 = questionConstruireSourcePre1Span021;
	public static final String questionConstruireSourcePre1Span031 = " &&";
	public static final String questionConstruireSourcePre1Span03 = questionConstruireSourcePre1Span031;
	public static final String questionConstruireSourcePre1Span041 = " ./configure";
	public static final String questionConstruireSourcePre1Span04 = questionConstruireSourcePre1Span041;
	public static final String questionConstruireSourcePre1Span051 = " --with-openssl";
	public static final String questionConstruireSourcePre1Span05 = questionConstruireSourcePre1Span051;
	public static final String questionConstruireSourcePre1Span061 = " --with-libxml";
	public static final String questionConstruireSourcePre1Span06 = questionConstruireSourcePre1Span061;
	public static final String questionConstruireSourcePre1Span071 = " --with-libxslt";
	public static final String questionConstruireSourcePre1Span07 = questionConstruireSourcePre1Span071;
	public static final String questionConstruireSourcePre1Span081 = " --with-systemd";
	public static final String questionConstruireSourcePre1Span08 = questionConstruireSourcePre1Span081;
	public static final String questionConstruireSourcePre1Span091 = " --with-selinux";
	public static final String questionConstruireSourcePre1Span09 = questionConstruireSourcePre1Span091;
	public static final String questionConstruireSourcePre1Span101 = " --prefix=/opt/pgsql)";
	public static final String questionConstruireSourcePre1Span10 = questionConstruireSourcePre1Span101;
	public static final String questionConstruireSourceOl1Li011 = "(cd";
	public static final String questionConstruireSourceOl1Li01 = questionConstruireSourceOl1Li011;
	public static final String questionConstruireSourceOl1Li021 = "/usr/local/src/pgsql";
	public static final String questionConstruireSourceOl1Li02 = questionConstruireSourceOl1Li021;
	public static final String questionConstruireSourceOl1Li031 = "&&";
	public static final String questionConstruireSourceOl1Li03 = questionConstruireSourceOl1Li031;
	public static final String questionConstruireSourceOl1Li041 = "./configure : Un script de configuration C++ pour compiler PostgreSQL. ";
	public static final String questionConstruireSourceOl1Li04 = questionConstruireSourceOl1Li041;
	public static final String questionConstruireSourceOl1Li051 = "--with-openssl : Construisez PostgreSQL avec le support OpenSSL pour des connexions TLS sécurisées à la base de données. ";
	public static final String questionConstruireSourceOl1Li05 = questionConstruireSourceOl1Li051;
	public static final String questionConstruireSourceOl1Li061 = "--with-libxml : Construisez PostgreSQL avec le support XML. ";
	public static final String questionConstruireSourceOl1Li06 = questionConstruireSourceOl1Li061;
	public static final String questionConstruireSourceOl1Li071 = "--with-libxslt : Utilisez le support XSLT lors de la construction de contrib/xml2. ";
	public static final String questionConstruireSourceOl1Li07 = questionConstruireSourceOl1Li071;
	public static final String questionConstruireSourceOl1Li081 = "--with-systemd : Construisez PostgreSQL avec le support pour le gestionnaire de services systemd pour Linux. ";
	public static final String questionConstruireSourceOl1Li08 = questionConstruireSourceOl1Li081;
	public static final String questionConstruireSourceOl1Li091 = "--with-selinux : Construisez PostgreSQL avec des fonctionnalités Linux supplémentaires améliorant la sécurité pour fournir une couche de sécurité supplémentaire. ";
	public static final String questionConstruireSourceOl1Li092 = "Chaque accès à une table ou à une fonction initiée par une requête DML sera vérifié par rapport à la stratégie de sécurité du système. ";
	public static final String questionConstruireSourceOl1Li09 = questionConstruireSourceOl1Li091 + questionConstruireSourceOl1Li092;
	public static final String questionConstruireSourceOl1Li101 = "--prefix=/opt/pgsql) : Construire l'application PostgreSQL complète et fermez la parenthèse. ";
	public static final String questionConstruireSourceOl1Li10 = questionConstruireSourceOl1Li101;
	public static final String questionConstruireSourcePre2Span11 = "(cd";
	public static final String questionConstruireSourcePre2Span1 = questionConstruireSourcePre2Span11;
	public static final String questionConstruireSourcePre2Span21 = " /usr/local/src/pgsql";
	public static final String questionConstruireSourcePre2Span2 = questionConstruireSourcePre2Span21;
	public static final String questionConstruireSourcePre2Span31 = " &&";
	public static final String questionConstruireSourcePre2Span3 = questionConstruireSourcePre2Span31;
	public static final String questionConstruireSourcePre2Span41 = " make";
	public static final String questionConstruireSourcePre2Span4 = questionConstruireSourcePre2Span41;
	public static final String questionConstruireSourcePre2Span51 = " world)";
	public static final String questionConstruireSourcePre2Span5 = questionConstruireSourcePre2Span51;
	public static final String questionConstruireSourceOl2Li11 = "(cd";
	public static final String questionConstruireSourceOl2Li1 = questionConstruireSourceOl2Li11;
	public static final String questionConstruireSourceOl2Li21 = "/usr/local/src/pgsql";
	public static final String questionConstruireSourceOl2Li2 = questionConstruireSourceOl2Li21;
	public static final String questionConstruireSourceOl2Li31 = "&&";
	public static final String questionConstruireSourceOl2Li3 = questionConstruireSourceOl2Li31;
	public static final String questionConstruireSourceOl2Li41 = "make: Compilez le code source de PostgreSQL. ";
	public static final String questionConstruireSourceOl2Li4 = questionConstruireSourceOl2Li41;
	public static final String questionConstruireSourceOl2Li51 = "world): Pour construire tout ce qui peut être construit, y compris la documentation (HTML et pages de manuel), ainsi que les modules supplémentaires (contrib). ";
	public static final String questionConstruireSourceOl2Li5 = questionConstruireSourceOl2Li51;
	public static final String questionConstruireSourcePre3Span11 = "(cd";
	public static final String questionConstruireSourcePre3Span1 = questionConstruireSourcePre3Span11;
	public static final String questionConstruireSourcePre3Span21 = " /usr/local/src/pgsql";
	public static final String questionConstruireSourcePre3Span2 = questionConstruireSourcePre3Span21;
	public static final String questionConstruireSourcePre3Span31 = " &&";
	public static final String questionConstruireSourcePre3Span3 = questionConstruireSourcePre3Span31;
	public static final String questionConstruireSourcePre3Span41 = " make";
	public static final String questionConstruireSourcePre3Span4 = questionConstruireSourcePre3Span41;
	public static final String questionConstruireSourcePre3Span51 = " install-world)";
	public static final String questionConstruireSourcePre3Span5 = questionConstruireSourcePre3Span51;
	public static final String questionConstruireSourceOl3Li11 = "(cd";
	public static final String questionConstruireSourceOl3Li1 = questionConstruireSourceOl3Li11;
	public static final String questionConstruireSourceOl3Li21 = "/usr/local/src/pgsql";
	public static final String questionConstruireSourceOl3Li2 = questionConstruireSourceOl3Li21;
	public static final String questionConstruireSourceOl3Li31 = "&&";
	public static final String questionConstruireSourceOl3Li3 = questionConstruireSourceOl3Li31;
	public static final String questionConstruireSourceOl3Li41 = "make";
	public static final String questionConstruireSourceOl3Li4 = questionConstruireSourceOl3Li41;
	public static final String questionConstruireSourceOl3Li51 = "install-world): En construisant le monde ci-dessus, cela installe tout, y compris la documentation. ";
	public static final String questionConstruireSourceOl3Li5 = questionConstruireSourceOl3Li51;

	/**	L'entité « questionConstruireSource »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionConstruireSource = new PageHtml();
	public Couverture<PageHtml> questionConstruireSourceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionConstruireSource").o(questionConstruireSource);

	/**	<br/>L'entité « questionConstruireSource »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionConstruireSource">Trouver l'entité questionConstruireSource dans Solr</a>
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
	protected C001L008CreerCertificat questionConstruireSourceInit() {
		if(questionConstruireSource != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
			((C001L008CreerCertificat)this).avantPagePart(questionConstruireSource, "questionConstruireSource");
		}
		if(!questionConstruireSourceCouverture.dejaInitialise) {
			_questionConstruireSource(questionConstruireSource);
		}
		questionConstruireSource.initLoinPourClasse(requeteSite_);
		questionConstruireSourceCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
			{ e("span").a("class", " questionConstruireSourcePre1Span06 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span061);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span07 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span071);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span08 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span081);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span09 questionConstruireSourcePre1Span odd ").f();
				sx(questionConstruireSourcePre1Span091);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre1Span10 questionConstruireSourcePre1Span even ").f();
				sx(questionConstruireSourcePre1Span101);
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
			{ e("li").a("class", " questionConstruireSourceOl1Li06 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li061);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li07 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li071);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li08 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li081);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li09 questionConstruireSourceOl1Li odd ").f();
				sx(questionConstruireSourceOl1Li091);
				sx(questionConstruireSourceOl1Li092);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl1Li10 questionConstruireSourceOl1Li even ").f();
				sx(questionConstruireSourceOl1Li101);
			} g("li");
		} g("ol");
		{ e("pre").a("class", " questionConstruireSourcePre2 questionConstruireSourcePre even ").f();
			{ e("span").a("class", " questionConstruireSourcePre2Span1 questionConstruireSourcePre2Span odd ").f();
				sx(questionConstruireSourcePre2Span11);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span2 questionConstruireSourcePre2Span even ").f();
				sx(questionConstruireSourcePre2Span21);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span3 questionConstruireSourcePre2Span odd ").f();
				sx(questionConstruireSourcePre2Span31);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span4 questionConstruireSourcePre2Span even ").f();
				sx(questionConstruireSourcePre2Span41);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre2Span5 questionConstruireSourcePre2Span odd ").f();
				sx(questionConstruireSourcePre2Span51);
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
		} g("ol");
		{ e("pre").a("class", " questionConstruireSourcePre3 questionConstruireSourcePre odd ").f();
			{ e("span").a("class", " questionConstruireSourcePre3Span1 questionConstruireSourcePre3Span odd ").f();
				sx(questionConstruireSourcePre3Span11);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span2 questionConstruireSourcePre3Span even ").f();
				sx(questionConstruireSourcePre3Span21);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span3 questionConstruireSourcePre3Span odd ").f();
				sx(questionConstruireSourcePre3Span31);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span4 questionConstruireSourcePre3Span even ").f();
				sx(questionConstruireSourcePre3Span41);
			} g("span");
			{ e("span").a("class", " questionConstruireSourcePre3Span5 questionConstruireSourcePre3Span odd ").f();
				sx(questionConstruireSourcePre3Span51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionConstruireSourceOl3 questionConstruireSourceOl odd ").f();
			{ e("li").a("class", " questionConstruireSourceOl3Li1 questionConstruireSourceOl3Li odd ").f();
				sx(questionConstruireSourceOl3Li11);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li2 questionConstruireSourceOl3Li even ").f();
				sx(questionConstruireSourceOl3Li21);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li3 questionConstruireSourceOl3Li odd ").f();
				sx(questionConstruireSourceOl3Li31);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li4 questionConstruireSourceOl3Li even ").f();
				sx(questionConstruireSourceOl3Li41);
			} g("li");
			{ e("li").a("class", " questionConstruireSourceOl3Li5 questionConstruireSourceOl3Li odd ").f();
				sx(questionConstruireSourceOl3Li51);
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
	public static final String questionMkdirServeurH3Span1 = "Après avoir installé PostgreSQL, où se trouve mon répertoire de données ? ";
	public static final String questionMkdirServeurH3Span = questionMkdirServeurH3Span1;
	public static final String questionMkdirServeurH4I1 = "far fa-folder-tree";
	public static final String questionMkdirServeurH4I = questionMkdirServeurH4I1;
	public static final String questionMkdirServeurH4Span1 = "Créez un répertoire pgsql dans /srv. ";
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
	public static final String questionMkdirServeurPreSpan81 = " /srv/pgsql";
	public static final String questionMkdirServeurPreSpan8 = questionMkdirServeurPreSpan81;
	public static final String questionMkdirServeurOl2Li11 = "sudo";
	public static final String questionMkdirServeurOl2Li1 = questionMkdirServeurOl2Li11;
	public static final String questionMkdirServeurOl2Li21 = "install";
	public static final String questionMkdirServeurOl2Li2 = questionMkdirServeurOl2Li21;
	public static final String questionMkdirServeurOl2Li31 = "-d";
	public static final String questionMkdirServeurOl2Li3 = questionMkdirServeurOl2Li31;
	public static final String questionMkdirServeurOl2Li41 = "-o";
	public static final String questionMkdirServeurOl2Li4 = questionMkdirServeurOl2Li41;
	public static final String questionMkdirServeurOl2Li51 = "$USER";
	public static final String questionMkdirServeurOl2Li5 = questionMkdirServeurOl2Li51;
	public static final String questionMkdirServeurOl2Li61 = "-g";
	public static final String questionMkdirServeurOl2Li6 = questionMkdirServeurOl2Li61;
	public static final String questionMkdirServeurOl2Li71 = "$USER";
	public static final String questionMkdirServeurOl2Li7 = questionMkdirServeurOl2Li71;
	public static final String questionMkdirServeurOl2Li81 = "/srv est un bon endroit pour installer des serveurs logicielles open source telles que PostgreSQL qui fonctionnent comme un service. ";
	public static final String questionMkdirServeurOl2Li8 = questionMkdirServeurOl2Li81;

	/**	L'entité « questionMkdirServeur »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionMkdirServeur = new PageHtml();
	public Couverture<PageHtml> questionMkdirServeurCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionMkdirServeur").o(questionMkdirServeur);

	/**	<br/>L'entité « questionMkdirServeur »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionMkdirServeur">Trouver l'entité questionMkdirServeur dans Solr</a>
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
	protected C001L008CreerCertificat questionMkdirServeurInit() {
		if(questionMkdirServeur != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
			((C001L008CreerCertificat)this).avantPagePart(questionMkdirServeur, "questionMkdirServeur");
		}
		if(!questionMkdirServeurCouverture.dejaInitialise) {
			_questionMkdirServeur(questionMkdirServeur);
		}
		questionMkdirServeur.initLoinPourClasse(requeteSite_);
		questionMkdirServeurCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
		{ e("ol").a("class", " questionMkdirServeurOl2 questionMkdirServeurOl even ").f();
			{ e("li").a("class", " questionMkdirServeurOl2Li1 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li11);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li2 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li21);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li3 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li31);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li4 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li41);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li5 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li51);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li6 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li61);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li7 questionMkdirServeurOl2Li odd ").f();
				sx(questionMkdirServeurOl2Li71);
			} g("li");
			{ e("li").a("class", " questionMkdirServeurOl2Li8 questionMkdirServeurOl2Li even ").f();
				sx(questionMkdirServeurOl2Li81);
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
	public static final String questionDonneesH3Span1 = "Comment créer une nouvelle base de données PostgreSQL ? ";
	public static final String questionDonneesH3Span = questionDonneesH3Span1;
	public static final String questionDonneesH4I1 = "far fa-table";
	public static final String questionDonneesH4I = questionDonneesH4I1;
	public static final String questionDonneesH4Span1 = "Comment initialiser un nouveau serveur PostgreSQL. ";
	public static final String questionDonneesH4Span = questionDonneesH4Span1;
	public static final String questionDonneesP11 = "Même après avoir compilé le code source de PostgreSQL, vous ne possédez pas encore de base de données PostgreSQL. ";
	public static final String questionDonneesP12 = "Vous n'avez que des binaires et des outils PostgreSQL. ";
	public static final String questionDonneesP13 = "Vous devez configurer un serveur de base de données PostgreSQL pour exécuter et stocker les données. ";
	public static final String questionDonneesP1 = questionDonneesP11 + questionDonneesP12 + questionDonneesP13;
	public static final String questionDonneesPreSpan11 = "/opt/pgsql/bin/initdb";
	public static final String questionDonneesPreSpan1 = questionDonneesPreSpan11;
	public static final String questionDonneesPreSpan21 = " -D";
	public static final String questionDonneesPreSpan2 = questionDonneesPreSpan21;
	public static final String questionDonneesPreSpan31 = " /srv/pgsql";
	public static final String questionDonneesPreSpan3 = questionDonneesPreSpan31;
	public static final String questionDonneesPreSpan41 = " -W";
	public static final String questionDonneesPreSpan4 = questionDonneesPreSpan41;
	public static final String questionDonneesOl2Li11 = "/opt/pgsql/bin/initdb : Initialise un cluster de base de données PostgreSQL. ";
	public static final String questionDonneesOl2Li1 = questionDonneesOl2Li11;
	public static final String questionDonneesOl2Li21 = "checkout : Choisissez un répertoire pour le nouveau serveur de base de données PostgreSQL. ";
	public static final String questionDonneesOl2Li2 = questionDonneesOl2Li21;
	public static final String questionDonneesOl2Li31 = "/srv/pgsql : Le répertoire du nouveau serveur de base de données PostgreSQL. ";
	public static final String questionDonneesOl2Li3 = questionDonneesOl2Li31;
	public static final String questionDonneesOl2Li41 = "-W : Demander un mot de passe pour le nouveau super utilisateur. ";
	public static final String questionDonneesOl2Li4 = questionDonneesOl2Li41;

	/**	L'entité « questionDonnees »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDonnees = new PageHtml();
	public Couverture<PageHtml> questionDonneesCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDonnees").o(questionDonnees);

	/**	<br/>L'entité « questionDonnees »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionDonnees">Trouver l'entité questionDonnees dans Solr</a>
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
	protected C001L008CreerCertificat questionDonneesInit() {
		if(questionDonnees != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionDonnees, "questionDonnees");
			((C001L008CreerCertificat)this).avantPagePart(questionDonnees, "questionDonnees");
		}
		if(!questionDonneesCouverture.dejaInitialise) {
			_questionDonnees(questionDonnees);
		}
		questionDonnees.initLoinPourClasse(requeteSite_);
		questionDonneesCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
		{ e("p").a("class", " questionDonneesP1 questionDonneesP odd ").f();
			sx(questionDonneesP11);
			sx(questionDonneesP12);
			sx(questionDonneesP13);
		} g("p");
		{ e("pre").a("class", " questionDonneesPre ").f();
			{ e("span").a("class", " questionDonneesPreSpan1 questionDonneesPreSpan odd ").f();
				sx(questionDonneesPreSpan11);
			} g("span");
			{ e("span").a("class", " questionDonneesPreSpan2 questionDonneesPreSpan even ").f();
				sx(questionDonneesPreSpan21);
			} g("span");
			{ e("span").a("class", " questionDonneesPreSpan3 questionDonneesPreSpan odd ").f();
				sx(questionDonneesPreSpan31);
			} g("span");
			{ e("span").a("class", " questionDonneesPreSpan4 questionDonneesPreSpan even ").f();
				sx(questionDonneesPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionDonneesOl2 questionDonneesOl even ").f();
			{ e("li").a("class", " questionDonneesOl2Li1 questionDonneesOl2Li odd ").f();
				sx(questionDonneesOl2Li11);
			} g("li");
			{ e("li").a("class", " questionDonneesOl2Li2 questionDonneesOl2Li even ").f();
				sx(questionDonneesOl2Li21);
			} g("li");
			{ e("li").a("class", " questionDonneesOl2Li3 questionDonneesOl2Li odd ").f();
				sx(questionDonneesOl2Li31);
			} g("li");
			{ e("li").a("class", " questionDonneesOl2Li4 questionDonneesOl2Li even ").f();
				sx(questionDonneesOl2Li41);
			} g("li");
		} g("ol");
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
	public static final String questionServiceH3Span1 = "Comment puis-je exécuter PostgreSQL tout le temps au démarrage de mon ordinateur ? ";
	public static final String questionServiceH3Span = questionServiceH3Span1;
	public static final String questionServiceH4I1 = "far fa-layer-plus";
	public static final String questionServiceH4I = questionServiceH4I1;
	public static final String questionServiceH4Span1 = "Comment exécuter PostgreSQL en tant que service systemd. ";
	public static final String questionServiceH4Span = questionServiceH4Span1;
	public static final String questionServicePreSpan11 = "echo '";
	public static final String questionServicePreSpan1 = questionServicePreSpan11;
	public static final String questionServicePreSpan1Br1 = "[Unit]";
	public static final String questionServicePreSpan1Br = questionServicePreSpan1Br1;
	public static final String questionServicePreSpan2Br1 = "Description=Serveur de base de données PostgreSQL. ";
	public static final String questionServicePreSpan2Br = questionServicePreSpan2Br1;
	public static final String questionServicePreSpan3Br1 = "After=syslog.target network.target";
	public static final String questionServicePreSpan3Br2 = "";
	public static final String questionServicePreSpan3Br3 = "[Service]";
	public static final String questionServicePreSpan3Br4 = "Type=forking";
	public static final String questionServicePreSpan3Br5 = "Environment=PGDATA=/srv/pgsql PGPORT=5432";
	public static final String questionServicePreSpan3Br6 = "User='\"$USER\"'";
	public static final String questionServicePreSpan3Br7 = "Group='\"$USER\"'";
	public static final String questionServicePreSpan3Br8 = "ExecStart=/opt/pgsql/bin/pg_ctl start -D ${PGDATA} -s -o \"-p ${PGPORT}\" -w -t 300";
	public static final String questionServicePreSpan3Br9 = "ExecStop=/opt/pgsql/bin/pg_ctl stop -D ${PGDATA} -s -m fast";
	public static final String questionServicePreSpan3Br10 = "ExecReload=/opt/pgsql/bin/pg_ctl reload -D ${PGDATA} -s";
	public static final String questionServicePreSpan3Br11 = "TimeoutSec=300";
	public static final String questionServicePreSpan3Br12 = "";
	public static final String questionServicePreSpan3Br13 = "[Install]";
	public static final String questionServicePreSpan3Br14 = "WantedBy=multi-user.target";
	public static final String questionServicePreSpan3Br15 = "' | sudo tee /usr/lib/systemd/system/pgsql.service";
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
	public static final String questionServiceOl2Li071 = "Environment=PGDATA=/srv/pgsql PGPORT=5432 : Définir le répertoire de données PostgreSQL et le port comme variables d’environnement du système à utiliser plus tard dans des commandes. ";
	public static final String questionServiceOl2Li07 = questionServiceOl2Li071;
	public static final String questionServiceOl2Li081 = "User=... : L'utilisateur en tant que l'utilisateur actuel qui exécutera le service. ";
	public static final String questionServiceOl2Li08 = questionServiceOl2Li081;
	public static final String questionServiceOl2Li091 = "Group=... : L'utilisateur de groupe en tant que l'utilisateur actuel qui exécutera le service. ";
	public static final String questionServiceOl2Li09 = questionServiceOl2Li091;
	public static final String questionServiceOl2Li101 = "ExecStart=... : La commande PostgreSQL qui lancera le service. ";
	public static final String questionServiceOl2Li10 = questionServiceOl2Li101;
	public static final String questionServiceOl2Li111 = "ExecStart=... : La commande PostgreSQL qui arrêtera le service. ";
	public static final String questionServiceOl2Li11 = questionServiceOl2Li111;
	public static final String questionServiceOl2Li121 = "ExecReload=... : La commande PostgreSQL qui redémarrera le service. ";
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
	public static final String questionServiceOl2Li191 = "/usr/lib/systemd/system/pgsql.service : Un nouveau fichier de service systemd dans lequel écrire pour PostgreSQL. ";
	public static final String questionServiceOl2Li19 = questionServiceOl2Li191;

	/**	L'entité « questionService »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionService = new PageHtml();
	public Couverture<PageHtml> questionServiceCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionService").o(questionService);

	/**	<br/>L'entité « questionService »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionService">Trouver l'entité questionService dans Solr</a>
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
	protected C001L008CreerCertificat questionServiceInit() {
		if(questionService != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionService, "questionService");
			((C001L008CreerCertificat)this).avantPagePart(questionService, "questionService");
		}
		if(!questionServiceCouverture.dejaInitialise) {
			_questionService(questionService);
		}
		questionService.initLoinPourClasse(requeteSite_);
		questionServiceCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlDaemonReload">Trouver l'entité questionSystemctlDaemonReload dans Solr</a>
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
	protected C001L008CreerCertificat questionSystemctlDaemonReloadInit() {
		if(questionSystemctlDaemonReload != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlDaemonReload, "questionSystemctlDaemonReload");
		}
		if(!questionSystemctlDaemonReloadCouverture.dejaInitialise) {
			_questionSystemctlDaemonReload(questionSystemctlDaemonReload);
		}
		questionSystemctlDaemonReload.initLoinPourClasse(requeteSite_);
		questionSystemctlDaemonReloadCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String questionSystemctlEnableH3Span1 = "Comment activer le service PostgreSQL? ";
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
	public static final String questionSystemctlEnablePreSpan41 = " pgsql";
	public static final String questionSystemctlEnablePreSpan4 = questionSystemctlEnablePreSpan41;
	public static final String questionSystemctlEnableOl2Li11 = "sudo";
	public static final String questionSystemctlEnableOl2Li1 = questionSystemctlEnableOl2Li11;
	public static final String questionSystemctlEnableOl2Li21 = "systemctl";
	public static final String questionSystemctlEnableOl2Li2 = questionSystemctlEnableOl2Li21;
	public static final String questionSystemctlEnableOl2Li31 = "enable : Activer un ou plusieurs fichiers d'unités ou instances de fichiers d'unités. ";
	public static final String questionSystemctlEnableOl2Li3 = questionSystemctlEnableOl2Li31;
	public static final String questionSystemctlEnableOl2Li41 = "pgsql : Activez le service PostgreSQL pour démarrer au démarrage de l'ordinateur. ";
	public static final String questionSystemctlEnableOl2Li4 = questionSystemctlEnableOl2Li41;

	/**	L'entité « questionSystemctlEnable »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlEnable = new PageHtml();
	public Couverture<PageHtml> questionSystemctlEnableCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlEnable").o(questionSystemctlEnable);

	/**	<br/>L'entité « questionSystemctlEnable »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlEnable">Trouver l'entité questionSystemctlEnable dans Solr</a>
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
	protected C001L008CreerCertificat questionSystemctlEnableInit() {
		if(questionSystemctlEnable != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlEnable, "questionSystemctlEnable");
		}
		if(!questionSystemctlEnableCouverture.dejaInitialise) {
			_questionSystemctlEnable(questionSystemctlEnable);
		}
		questionSystemctlEnable.initLoinPourClasse(requeteSite_);
		questionSystemctlEnableCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String questionSystemctlStartH3Span1 = "Comment démarrer le service PostgreSQL? ";
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
	public static final String questionSystemctlStartPreSpan41 = " pgsql";
	public static final String questionSystemctlStartPreSpan4 = questionSystemctlStartPreSpan41;
	public static final String questionSystemctlStartOl2Li11 = "sudo";
	public static final String questionSystemctlStartOl2Li1 = questionSystemctlStartOl2Li11;
	public static final String questionSystemctlStartOl2Li21 = "systemctl";
	public static final String questionSystemctlStartOl2Li2 = questionSystemctlStartOl2Li21;
	public static final String questionSystemctlStartOl2Li31 = "start : Activer un ou plusieurs services. ";
	public static final String questionSystemctlStartOl2Li3 = questionSystemctlStartOl2Li31;
	public static final String questionSystemctlStartOl2Li41 = "pgsql : Démarrez le service PostgreSQL. ";
	public static final String questionSystemctlStartOl2Li4 = questionSystemctlStartOl2Li41;

	/**	L'entité « questionSystemctlStart »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionSystemctlStart = new PageHtml();
	public Couverture<PageHtml> questionSystemctlStartCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionSystemctlStart").o(questionSystemctlStart);

	/**	<br/>L'entité « questionSystemctlStart »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlStart">Trouver l'entité questionSystemctlStart dans Solr</a>
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
	protected C001L008CreerCertificat questionSystemctlStartInit() {
		if(questionSystemctlStart != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStart, "questionSystemctlStart");
		}
		if(!questionSystemctlStartCouverture.dejaInitialise) {
			_questionSystemctlStart(questionSystemctlStart);
		}
		questionSystemctlStart.initLoinPourClasse(requeteSite_);
		questionSystemctlStartCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
	public static final String questionSystemctlStatusH3Span1 = "Comment puis-je m'assurer que le service PostgreSQL a démarré avec succès ? ";
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
	public static final String questionSystemctlStatusPreSpan41 = " pgsql";
	public static final String questionSystemctlStatusPreSpan4 = questionSystemctlStatusPreSpan41;
	public static final String questionSystemctlStatusOl2Li11 = "sudo";
	public static final String questionSystemctlStatusOl2Li1 = questionSystemctlStatusOl2Li11;
	public static final String questionSystemctlStatusOl2Li21 = "systemctl";
	public static final String questionSystemctlStatusOl2Li2 = questionSystemctlStatusOl2Li21;
	public static final String questionSystemctlStatusOl2Li31 = "status : Vérifiez le statut d'un ou plusieurs services. ";
	public static final String questionSystemctlStatusOl2Li3 = questionSystemctlStatusOl2Li31;
	public static final String questionSystemctlStatusOl2Li41 = "pgsql : Vérifiez le statut du service PostgreSQL. ";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l008.C001L008CreerCertificat&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:questionSystemctlStatus">Trouver l'entité questionSystemctlStatus dans Solr</a>
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
	protected C001L008CreerCertificat questionSystemctlStatusInit() {
		if(questionSystemctlStatus != null) {
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
			((C001L008CreerCertificat)this).avantPagePart(questionSystemctlStatus, "questionSystemctlStatus");
		}
		if(!questionSystemctlStatusCouverture.dejaInitialise) {
			_questionSystemctlStatus(questionSystemctlStatus);
		}
		questionSystemctlStatus.initLoinPourClasse(requeteSite_);
		questionSystemctlStatusCouverture.dejaInitialise(true);
		return (C001L008CreerCertificat)this;
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
			case "questionClonerSource":
				return oC001L008CreerCertificat.questionClonerSource;
			case "questionListerTags":
				return oC001L008CreerCertificat.questionListerTags;
			case "questionCheckoutTag":
				return oC001L008CreerCertificat.questionCheckoutTag;
			case "questionConstruireSource":
				return oC001L008CreerCertificat.questionConstruireSource;
			case "questionMkdirServeur":
				return oC001L008CreerCertificat.questionMkdirServeur;
			case "questionDonnees":
				return oC001L008CreerCertificat.questionDonnees;
			case "questionService":
				return oC001L008CreerCertificat.questionService;
			case "questionSystemctlDaemonReload":
				return oC001L008CreerCertificat.questionSystemctlDaemonReload;
			case "questionSystemctlEnable":
				return oC001L008CreerCertificat.questionSystemctlEnable;
			case "questionSystemctlStart":
				return oC001L008CreerCertificat.questionSystemctlStart;
			case "questionSystemctlStatus":
				return oC001L008CreerCertificat.questionSystemctlStatus;
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
		htmlBodyC001L008CreerCertificat();
		super.htmlBody();
	}

	public void htmlBodyC001L008CreerCertificat() {
		((C001L008CreerCertificat)this).htmlBodyMoi();
		((C001L008CreerCertificat)this).htmlBodyQuestionDependences();
		((C001L008CreerCertificat)this).htmlBodyQuestionMkdirSrv();
		((C001L008CreerCertificat)this).htmlBodyQuestionCertbot();
		((C001L008CreerCertificat)this).htmlBodyQuestionClonerSource();
		((C001L008CreerCertificat)this).htmlBodyQuestionListerTags();
		((C001L008CreerCertificat)this).htmlBodyQuestionCheckoutTag();
		((C001L008CreerCertificat)this).htmlBodyQuestionConstruireSource();
		((C001L008CreerCertificat)this).htmlBodyQuestionMkdirServeur();
		((C001L008CreerCertificat)this).htmlBodyQuestionDonnees();
		((C001L008CreerCertificat)this).htmlBodyQuestionService();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlDaemonReload();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlEnable();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlStart();
		((C001L008CreerCertificat)this).htmlBodyQuestionSystemctlStatus();
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

	public static final String[] C001L008CreerCertificatVals = new String[] { moiP1, moiP2, moiP3, moiP4, moiP5, moiP6, moiP7, moiP8, questionDependencesH3I1, questionDependencesH3Span1, questionDependencesH4I1, questionDependencesH4Span1, questionDependencesPre1Span11, questionDependencesPre1Span21, questionDependencesPre1Span31, questionDependencesPre1Span41, questionDependencesPre1Span51, questionDependencesOl2Li11, questionDependencesOl2Li12, questionDependencesOl2Li13, questionDependencesOl2Li21, questionDependencesOl2Li22, questionDependencesOl2Li31, questionDependencesOl2Li41, questionDependencesOl2Li51, questionDependencesPre3Span11, questionDependencesPre3Span21, questionDependencesPre3Span31, questionDependencesPre3Span41, questionDependencesPre3Span51, questionDependencesOl4Li11, questionDependencesOl4Li21, questionDependencesOl4Li31, questionDependencesOl4Li41, questionDependencesOl4Li51, questionMkdirSrvH3I1, questionMkdirSrvH3Span1, questionMkdirSrvH4I1, questionMkdirSrvH4Span1, questionMkdirSrvPreSpan11, questionMkdirSrvPreSpan21, questionMkdirSrvPreSpan31, questionMkdirSrvPreSpan41, questionMkdirSrvPreSpan51, questionMkdirSrvPreSpan61, questionMkdirSrvPreSpan71, questionMkdirSrvPreSpan61, questionMkdirSrvPreSpan71, questionMkdirSrvPreSpan81, questionMkdirSrvOl2Li11, questionMkdirSrvOl2Li21, questionMkdirSrvOl2Li31, questionMkdirSrvOl2Li41, questionMkdirSrvOl2Li51, questionMkdirSrvOl2Li61, questionMkdirSrvOl2Li71, questionMkdirSrvOl2Li61, questionMkdirSrvOl2Li71, questionMkdirSrvOl2Li81, questionCertbotH3I1, questionCertbotH3Span1, questionCertbotH4I1, questionCertbotH4Span1, questionCertbotPreSpan011, questionCertbotPreSpan021, questionCertbotPreSpan031, questionCertbotPreSpan041, questionCertbotPreSpan051, questionCertbotPreSpan061, questionCertbotPreSpan071, questionCertbotPreSpan081, questionCertbotPreSpan091, questionCertbotPreSpan101, questionCertbotOl2Li011, questionCertbotOl2Li021, questionCertbotOl2Li031, questionCertbotOl2Li041, questionCertbotOl2Li051, questionCertbotOl2Li061, questionCertbotOl2Li071, questionCertbotOl2Li081, questionCertbotOl2Li091, questionCertbotOl2Li101, questionCertbotP21, questionCertbotP22, questionCertbotP23, questionCertbotP24, questionCertbotP25, questionCertbotP3Span11, questionCertbotP3Span12, questionCertbotP3Span13, questionCertbotP3A11, questionCertbotP3Span21, questionCertbotP3Span22, questionCertbotP3Span23, questionCertbotP3Span24, questionCertbotP3Span25, questionCertbotP3Span26, questionCertbotP3Span27, questionClonerSourceH3I1, questionClonerSourceH3Span1, questionClonerSourceH4I1, questionClonerSourceH4Span1, questionClonerSourcePreSpan11, questionClonerSourcePreSpan21, questionClonerSourcePreSpan31, questionClonerSourcePreSpan41, questionClonerSourceOl2Li11, questionClonerSourceOl2Li21, questionClonerSourceOl2Li31, questionClonerSourceOl2Li41, questionListerTagsH3I1, questionListerTagsH3Span1, questionListerTagsH4I1, questionListerTagsH4Span1, questionListerTagsPreSpan11, questionListerTagsPreSpan21, questionListerTagsPreSpan31, questionListerTagsPreSpan41, questionListerTagsPreSpan51, questionListerTagsOl2Li11, questionListerTagsOl2Li21, questionListerTagsOl2Li31, questionListerTagsOl2Li41, questionListerTagsOl2Li51, questionCheckoutTagH3I1, questionCheckoutTagH3Span1, questionCheckoutTagH4I1, questionCheckoutTagH4Span1, questionCheckoutTagPreSpan11, questionCheckoutTagPreSpan21, questionCheckoutTagPreSpan31, questionCheckoutTagPreSpan41, questionCheckoutTagPreSpan51, questionCheckoutTagPreSpan61, questionCheckoutTagOl2Li11, questionCheckoutTagOl2Li21, questionCheckoutTagOl2Li31, questionCheckoutTagOl2Li41, questionCheckoutTagOl2Li51, questionCheckoutTagOl2Li61, questionConstruireSourceH3I1, questionConstruireSourceH3Span1, questionConstruireSourceH4I1, questionConstruireSourceH4Span1, questionConstruireSourcePre1Span011, questionConstruireSourcePre1Span021, questionConstruireSourcePre1Span031, questionConstruireSourcePre1Span041, questionConstruireSourcePre1Span051, questionConstruireSourcePre1Span061, questionConstruireSourcePre1Span071, questionConstruireSourcePre1Span081, questionConstruireSourcePre1Span091, questionConstruireSourcePre1Span101, questionConstruireSourceOl1Li011, questionConstruireSourceOl1Li021, questionConstruireSourceOl1Li031, questionConstruireSourceOl1Li041, questionConstruireSourceOl1Li051, questionConstruireSourceOl1Li061, questionConstruireSourceOl1Li071, questionConstruireSourceOl1Li081, questionConstruireSourceOl1Li091, questionConstruireSourceOl1Li092, questionConstruireSourceOl1Li101, questionConstruireSourcePre2Span11, questionConstruireSourcePre2Span21, questionConstruireSourcePre2Span31, questionConstruireSourcePre2Span41, questionConstruireSourcePre2Span51, questionConstruireSourceOl2Li11, questionConstruireSourceOl2Li21, questionConstruireSourceOl2Li31, questionConstruireSourceOl2Li41, questionConstruireSourceOl2Li51, questionConstruireSourcePre3Span11, questionConstruireSourcePre3Span21, questionConstruireSourcePre3Span31, questionConstruireSourcePre3Span41, questionConstruireSourcePre3Span51, questionConstruireSourceOl3Li11, questionConstruireSourceOl3Li21, questionConstruireSourceOl3Li31, questionConstruireSourceOl3Li41, questionConstruireSourceOl3Li51, questionMkdirServeurH3I1, questionMkdirServeurH3Span1, questionMkdirServeurH4I1, questionMkdirServeurH4Span1, questionMkdirServeurPreSpan11, questionMkdirServeurPreSpan21, questionMkdirServeurPreSpan31, questionMkdirServeurPreSpan41, questionMkdirServeurPreSpan51, questionMkdirServeurPreSpan61, questionMkdirServeurPreSpan71, questionMkdirServeurPreSpan81, questionMkdirServeurOl2Li11, questionMkdirServeurOl2Li21, questionMkdirServeurOl2Li31, questionMkdirServeurOl2Li41, questionMkdirServeurOl2Li51, questionMkdirServeurOl2Li61, questionMkdirServeurOl2Li71, questionMkdirServeurOl2Li81, questionDonneesH3I1, questionDonneesH3Span1, questionDonneesH4I1, questionDonneesH4Span1, questionDonneesP11, questionDonneesP12, questionDonneesP13, questionDonneesPreSpan11, questionDonneesPreSpan21, questionDonneesPreSpan31, questionDonneesPreSpan41, questionDonneesOl2Li11, questionDonneesOl2Li21, questionDonneesOl2Li31, questionDonneesOl2Li41, questionServiceH3I1, questionServiceH3Span1, questionServiceH4I1, questionServiceH4Span1, questionServicePreSpan11, questionServicePreSpan1Br1, questionServicePreSpan2Br1, questionServicePreSpan3Br1, questionServicePreSpan3Br2, questionServicePreSpan3Br3, questionServicePreSpan3Br4, questionServicePreSpan3Br5, questionServicePreSpan3Br6, questionServicePreSpan3Br7, questionServicePreSpan3Br8, questionServicePreSpan3Br9, questionServicePreSpan3Br10, questionServicePreSpan3Br11, questionServicePreSpan3Br12, questionServicePreSpan3Br13, questionServicePreSpan3Br14, questionServicePreSpan3Br15, questionServiceOl2Li011, questionServiceOl2Li021, questionServiceOl2Li031, questionServiceOl2Li041, questionServiceOl2Li051, questionServiceOl2Li061, questionServiceOl2Li071, questionServiceOl2Li081, questionServiceOl2Li091, questionServiceOl2Li101, questionServiceOl2Li111, questionServiceOl2Li121, questionServiceOl2Li131, questionServiceOl2Li141, questionServiceOl2Li151, questionServiceOl2Li161, questionServiceOl2Li171, questionServiceOl2Li181, questionServiceOl2Li191, questionSystemctlDaemonReloadH3I1, questionSystemctlDaemonReloadH3Span1, questionSystemctlDaemonReloadH4I1, questionSystemctlDaemonReloadH4Span1, questionSystemctlDaemonReloadPreSpan11, questionSystemctlDaemonReloadPreSpan21, questionSystemctlDaemonReloadPreSpan31, questionSystemctlDaemonReloadOl2Li11, questionSystemctlDaemonReloadOl2Li21, questionSystemctlDaemonReloadOl2Li31, questionSystemctlEnableH3I1, questionSystemctlEnableH3Span1, questionSystemctlEnableH4I1, questionSystemctlEnableH4Span1, questionSystemctlEnablePreSpan11, questionSystemctlEnablePreSpan21, questionSystemctlEnablePreSpan31, questionSystemctlEnablePreSpan41, questionSystemctlEnableOl2Li11, questionSystemctlEnableOl2Li21, questionSystemctlEnableOl2Li31, questionSystemctlEnableOl2Li41, questionSystemctlStartH3I1, questionSystemctlStartH3Span1, questionSystemctlStartH4I1, questionSystemctlStartH4Span1, questionSystemctlStartPreSpan11, questionSystemctlStartPreSpan21, questionSystemctlStartPreSpan31, questionSystemctlStartPreSpan41, questionSystemctlStartOl2Li11, questionSystemctlStartOl2Li21, questionSystemctlStartOl2Li31, questionSystemctlStartOl2Li41, questionSystemctlStatusH3I1, questionSystemctlStatusH3Span1, questionSystemctlStatusH4I1, questionSystemctlStatusH4Span1, questionSystemctlStatusPreSpan11, questionSystemctlStatusPreSpan21, questionSystemctlStatusPreSpan31, questionSystemctlStatusPreSpan41, questionSystemctlStatusOl2Li11, questionSystemctlStatusOl2Li21, questionSystemctlStatusOl2Li31, questionSystemctlStatusOl2Li41, questionSystemctlStatusP21, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3Span1I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41, recapituler3TableTr12Td1I1, recapituler3TableTr12Td21, recapituler3TableTr12Td3I1, recapituler3TableTr12Td41, recapituler3TableTr13Td1I1, recapituler3TableTr13Td21, recapituler3TableTr13Td3I1, recapituler3TableTr13Td41, recapituler3TableTr14Td1I1, recapituler3TableTr14Td21, recapituler3TableTr14Td3I1, recapituler3TableTr14Td41, recapituler3TableTr15Td1I1, recapituler3TableTr15Td21, recapituler3TableTr15Td3I1, recapituler3TableTr15Td41 };
}
