package org.computate.site.enUS.cours.c001.l003;

import org.computate.site.enUS.ecrivain.ToutEcrivain;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.page.parti.PageHtml;
import org.computate.site.enUS.requete.RequeteSiteEnUS;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.enUS.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.enUS.page.parti.PagePart;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.enUS.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import org.computate.site.enUS.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxGen<DEV> extends C001Lecon {

	public static final String C001L003InstallerMachineVirtuelleVirtualBox_UnNom = "a lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Ce = "this ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_CeNom = "this lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Un = "an ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_LeNom = "the lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomSingulier = "lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomPluriel = "lessons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomActuel = "current lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_TousNom = "the lessons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_RechercherTousNomPar = "search lessons by ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_H1 = "How do I try CentOS 7 Linux without replacing my operating system? ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_H2 = "Try CentOS 7 on a VirtualBox virtual machine. ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_LesNoms = "the lessons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_AucunNomTrouve = "no lesson found";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomVar = "lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_DeNom = "of lesson";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Couleur = "green";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_IconeGroupe = "regular";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_IconeNom = "question";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri = "/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri = "/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri = "/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri = "/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. ";
	public static final String moiP2 = "I will help you create your own successful website, on your own computer, using open-source software. ";
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox moiInit() {
		if(moi != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(moi, "moi");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", " moiP ").f();
			sx(moiP1);
			sx(moiP2);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	/////////////
	// ecraser //
	/////////////

	public static final String ecraserH3I1 = "fas fa-eraser";
	public static final String ecraserH3I = ecraserH3I1;
	public static final String ecraserH3Span1 = "Is it possible to try Linux without destroying my operating system? ";
	public static final String ecraserH3Span = ecraserH3Span1;
	public static final String ecraserH4I1 = "fab fa-linux";
	public static final String ecraserH4I = ecraserH4I1;
	public static final String ecraserH4Span1 = "Virtualization can run Linux on any operating system. ";
	public static final String ecraserH4Span = ecraserH4Span1;
	public static final String ecraserPDiv1 = "Thanks to virtualization, trying out operating systems on your own computer is simple! ";
	public static final String ecraserPDiv2 = "Virtualization allows you to run virtual machines. ";
	public static final String ecraserPDiv3 = "Virtual machines are entire operating systems running under your own operating system through software. ";
	public static final String ecraserPDiv4 = "Virtualization is free, thanks to many good software packages! ";
	public static final String ecraserPDiv5 = "For Linux I recommend Libvirt for more power, but for a cross-platform solution, we will be using VirtualBox in this lesson. ";
	public static final String ecraserPDiv6 = "I'll teach you how to get a CentOS 7 virtual machine running on your system. ";
	public static final String ecraserPDiv = ecraserPDiv1 + ecraserPDiv2 + ecraserPDiv3 + ecraserPDiv4 + ecraserPDiv5 + ecraserPDiv6;

	/**	L'entité « ecraser »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml ecraser = new PageHtml();
	public Couverture<PageHtml> ecraserCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("ecraser").o(ecraser);

	/**	<br/>L'entité « ecraser »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:ecraser">Trouver l'entité ecraser dans Solr</a>
	 * <br/>
	 * @param ecraser est l'entité déjà construit. 
	 **/
	protected abstract void _ecraser(PageHtml o);

	public PageHtml getEcraser() {
		return ecraser;
	}

	public void setEcraser(PageHtml ecraser) {
		this.ecraser = ecraser;
		this.ecraserCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox ecraserInit() {
		if(ecraser != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(ecraser, "ecraser");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(ecraser, "ecraser");
		}
		if(!ecraserCouverture.dejaInitialise) {
			_ecraser(ecraser);
		}
		ecraser.initLoinPourClasse(requeteSite_);
		ecraserCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyEcraser(PageHtml o) {
		{ e("h3").a("class", " ecraserH3 ").f();
			{ e("i").a("class", ecraserH3I1, " site-menu-icon ecraserH3I ").f();
			} g("i");
			{ e("span").a("class", " ecraserH3Span ").f();
				sx(ecraserH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " ecraserH4 ").f();
			{ e("i").a("class", ecraserH4I1, " site-menu-icon ecraserH4I ").f();
			} g("i");
			{ e("span").a("class", " ecraserH4Span ").f();
				sx(ecraserH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " ecraserP ").f();
			{ e("div").a("class", " ecraserPDiv ").f();
				sx(ecraserPDiv1);
				sx(ecraserPDiv2);
				sx(ecraserPDiv3);
				sx(ecraserPDiv4);
				sx(ecraserPDiv5);
				sx(ecraserPDiv6);
			} g("div");
		} g("p");
	}
	public void htmlBodyEcraser() {
		ecraser.htmlAvant();
		htmlBodyEcraser(ecraser);
		ecraser.htmlApres();
	}

	//////////////////////
	// commentInstaller //
	//////////////////////

	public static final String commentInstallerH3Span1 = "How do I install VirtualBox for virtualization? ";
	public static final String commentInstallerH3Span = commentInstallerH3Span1;
	public static final String commentInstallerH4Span1 = "Simply download it from virtualbox.org. ";
	public static final String commentInstallerH4Span = commentInstallerH4Span1;
	public static final String commentInstallerPUlLi1Span1 = "VirtualBox is easy to download and install. ";
	public static final String commentInstallerPUlLi1Span = commentInstallerPUlLi1Span1;
	public static final String commentInstallerPUlLi2Span1 = "Visit this url: ";
	public static final String commentInstallerPUlLi2Span = commentInstallerPUlLi2Span1;
	public static final String commentInstallerPUlLi2A1 = "https://www.virtualbox.org/wiki/Downloads";
	public static final String commentInstallerPUlLi2A = commentInstallerPUlLi2A1;
	public static final String commentInstallerPUlLi3Span1 = "You can download it on a Windows host, an OS X host, a Linux or Solaris host. ";
	public static final String commentInstallerPUlLi3Span = commentInstallerPUlLi3Span1;
	public static final String commentInstallerPUlLi4Span1 = "Because I am running CentOS 7, which is similar to RHEL, I will use the RHEL instructions at the very bottom of the page. ";
	public static final String commentInstallerPUlLi4Span = commentInstallerPUlLi4Span1;

	/**	L'entité « commentInstaller »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse commentInstaller = new QuestionReponse();
	public Couverture<QuestionReponse> commentInstallerCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("commentInstaller").o(commentInstaller);

	/**	<br/>L'entité « commentInstaller »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:commentInstaller">Trouver l'entité commentInstaller dans Solr</a>
	 * <br/>
	 * @param commentInstaller est l'entité déjà construit. 
	 **/
	protected abstract void _commentInstaller(QuestionReponse o);

	public QuestionReponse getCommentInstaller() {
		return commentInstaller;
	}

	public void setCommentInstaller(QuestionReponse commentInstaller) {
		this.commentInstaller = commentInstaller;
		this.commentInstallerCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox commentInstallerInit() {
		if(commentInstaller != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(commentInstaller, "commentInstaller");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(commentInstaller, "commentInstaller");
		}
		if(!commentInstallerCouverture.dejaInitialise) {
			_commentInstaller(commentInstaller);
		}
		commentInstaller.initLoinPourClasse(requeteSite_);
		commentInstallerCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCommentInstaller(QuestionReponse o) {
		{ e("h3").a("class", " commentInstallerH3 ").f();
			{ e("span").a("class", " commentInstallerH3Span ").f();
				sx(commentInstallerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " commentInstallerH4 ").f();
			{ e("span").a("class", " commentInstallerH4Span ").f();
				sx(commentInstallerH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " commentInstallerP ").f();
			{ e("ul").a("class", " commentInstallerPUl ").f();
				{ e("li").a("class", " commentInstallerPUlLi1 commentInstallerPUlLi odd ").f();
					{ e("span").a("class", " commentInstallerPUlLi1Span ").f();
						sx(commentInstallerPUlLi1Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", " commentInstallerPUlLi2 commentInstallerPUlLi even ").f();
					{ e("span").a("class", " commentInstallerPUlLi2Span ").f();
						sx(commentInstallerPUlLi2Span1);
					} g("span");
					{ e("a").a("class", " commentInstallerPUlLi2A ").f();
						sx(commentInstallerPUlLi2A1);
					} g("a");
				} g("li");
				{ e("li").a("class", " commentInstallerPUlLi3 commentInstallerPUlLi odd ").f();
					{ e("span").a("class", " commentInstallerPUlLi3Span ").f();
						sx(commentInstallerPUlLi3Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", " commentInstallerPUlLi4 commentInstallerPUlLi even ").f();
					{ e("span").a("class", " commentInstallerPUlLi4Span ").f();
						sx(commentInstallerPUlLi4Span1);
					} g("span");
				} g("li");
			} g("ul");
		} g("p");
	}
	public void htmlBodyCommentInstaller() {
		commentInstaller.htmlAvant();
		htmlBodyCommentInstaller(commentInstaller);
		commentInstaller.htmlApres();
	}

	//////////////////
	// recapituler1 //
	//////////////////

	public static final String recapituler1H31 = "To review: ";
	public static final String recapituler1H3 = recapituler1H31;

	/**	L'entité « recapituler1 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler1 = new PageHtml();
	public Couverture<PageHtml> recapituler1Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler1").o(recapituler1);

	/**	<br/>L'entité « recapituler1 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox recapituler1Init() {
		if(recapituler1 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler1, "recapituler1");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
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

	public static final String recapituler2TableTr1Td11 = "Tuesday ";
	public static final String recapituler2TableTr1Td1 = recapituler2TableTr1Td11;
	public static final String recapituler2TableTr1Td2I1 = "fab fa-linux";
	public static final String recapituler2TableTr1Td2I = recapituler2TableTr1Td2I1;
	public static final String recapituler2TableTr1Td3I1 = "fas fa-network-wired";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "fas fa-pen-nib";
	public static final String recapituler2TableTr1Td4I = recapituler2TableTr1Td4I1;
	public static final String recapituler2TableTr2Td11 = "April 23 2019";
	public static final String recapituler2TableTr2Td1 = recapituler2TableTr2Td11;
	public static final String recapituler2TableTr2Td21 = "How to try CentOS 7";
	public static final String recapituler2TableTr2Td2 = recapituler2TableTr2Td21;
	public static final String recapituler2TableTr2Td31 = "On a virtual machine";
	public static final String recapituler2TableTr2Td3 = recapituler2TableTr2Td31;
	public static final String recapituler2TableTr2Td41 = "By Christopher Tate";
	public static final String recapituler2TableTr2Td4 = recapituler2TableTr2Td41;

	/**	L'entité « recapituler2 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler2 = new PageHtml();
	public Couverture<PageHtml> recapituler2Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler2").o(recapituler2);

	/**	<br/>L'entité « recapituler2 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox recapituler2Init() {
		if(recapituler2 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler2, "recapituler2");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
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

	public static final String recapituler3TableTr1Td1I1 = "fas fa-eraser";
	public static final String recapituler3TableTr1Td1I = recapituler3TableTr1Td1I1;
	public static final String recapituler3TableTr1Td21 = "Will Linux destroy my operating system? ";
	public static final String recapituler3TableTr1Td2 = recapituler3TableTr1Td21;
	public static final String recapituler3TableTr1Td3I1 = "fab fa-linux";
	public static final String recapituler3TableTr1Td3I = recapituler3TableTr1Td3I1;
	public static final String recapituler3TableTr1Td41 = "Virtualization can run Linux on any operating system. ";
	public static final String recapituler3TableTr1Td4 = recapituler3TableTr1Td41;
	public static final String recapituler3TableTr2Td1I1 = "fas fa-person-carry";
	public static final String recapituler3TableTr2Td1I = recapituler3TableTr2Td1I1;
	public static final String recapituler3TableTr2Td21 = "How do I install VirtualBox? ";
	public static final String recapituler3TableTr2Td2 = recapituler3TableTr2Td21;
	public static final String recapituler3TableTr2Td3I1 = "fas fa-cloud-download-alt";
	public static final String recapituler3TableTr2Td3I = recapituler3TableTr2Td3I1;
	public static final String recapituler3TableTr2Td41 = "Download it from virtualbox.org";
	public static final String recapituler3TableTr2Td4 = recapituler3TableTr2Td41;
	public static final String recapituler3TableTr3Td1I1 = "fas fa-play-circle";
	public static final String recapituler3TableTr3Td1I = recapituler3TableTr3Td1I1;
	public static final String recapituler3TableTr3Td21 = "Prepare CentOS 7 to install VirtualBox";
	public static final String recapituler3TableTr3Td2 = recapituler3TableTr3Td21;
	public static final String recapituler3TableTr3Td3I1 = "fas fa-download";
	public static final String recapituler3TableTr3Td3I = recapituler3TableTr3Td3I1;
	public static final String recapituler3TableTr3Td41 = "Install the virtualbox yum repo";
	public static final String recapituler3TableTr3Td4 = recapituler3TableTr3Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox recapituler3Init() {
		if(recapituler3 != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler3, "recapituler3");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyRecapituler3(PageHtml o) {
		{ e("table").a("class", " recapituler3Table ").f();
			{ e("tr").a("class", " recapituler3TableTr1 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr1Td1 recapituler3TableTr1Td odd ").f();
					{ e("i").a("class", recapituler3TableTr1Td1I1, " site-menu-icon recapituler3TableTr1Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr1Td2 recapituler3TableTr1Td even ").f();
					sx(recapituler3TableTr1Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr1Td3 recapituler3TableTr1Td odd ").f();
					{ e("i").a("class", recapituler3TableTr1Td3I1, " site-menu-icon recapituler3TableTr1Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr1Td4 recapituler3TableTr1Td even ").f();
					sx(recapituler3TableTr1Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr2 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr2Td1 recapituler3TableTr2Td odd ").f();
					{ e("i").a("class", recapituler3TableTr2Td1I1, " site-menu-icon recapituler3TableTr2Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr2Td2 recapituler3TableTr2Td even ").f();
					sx(recapituler3TableTr2Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr2Td3 recapituler3TableTr2Td odd ").f();
					{ e("i").a("class", recapituler3TableTr2Td3I1, " site-menu-icon recapituler3TableTr2Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr2Td4 recapituler3TableTr2Td even ").f();
					sx(recapituler3TableTr2Td41);
				} g("td");
			} g("tr");
			{ e("tr").a("class", " recapituler3TableTr3 recapituler3TableTr odd ").f();
				{ e("td").a("class", " recapituler3TableTr3Td1 recapituler3TableTr3Td odd ").f();
					{ e("i").a("class", recapituler3TableTr3Td1I1, " site-menu-icon recapituler3TableTr3Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr3Td2 recapituler3TableTr3Td even ").f();
					sx(recapituler3TableTr3Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr3Td3 recapituler3TableTr3Td odd ").f();
					{ e("i").a("class", recapituler3TableTr3Td3I1, " site-menu-icon recapituler3TableTr3Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr3Td4 recapituler3TableTr3Td even ").f();
					sx(recapituler3TableTr3Td41);
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

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox = false;

	public C001L003InstallerMachineVirtuelleVirtualBox initLoinC001L003InstallerMachineVirtuelleVirtualBox(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBox();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBox() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBox();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBox() {
		moiInit();
		ecraserInit();
		commentInstallerInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBox(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(ecraser != null)
			ecraser.setRequeteSite_(requeteSite_);
		if(commentInstaller != null)
			commentInstaller.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBox(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBox(String var) throws Exception {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;
		switch(var) {
			case "moi":
				return oC001L003InstallerMachineVirtuelleVirtualBox.moi;
			case "ecraser":
				return oC001L003InstallerMachineVirtuelleVirtualBox.ecraser;
			case "commentInstaller":
				return oC001L003InstallerMachineVirtuelleVirtualBox.commentInstaller;
			case "recapituler1":
				return oC001L003InstallerMachineVirtuelleVirtualBox.recapituler1;
			case "recapituler2":
				return oC001L003InstallerMachineVirtuelleVirtualBox.recapituler2;
			case "recapituler3":
				return oC001L003InstallerMachineVirtuelleVirtualBox.recapituler3;
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBox(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBox(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBox(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBox(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage");
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
			RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
			requeteSite.initLoinRequeteSiteEnUS();
			SiteContexteEnUS siteContexte = new SiteContexteEnUS();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteEnUS();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L003InstallerMachineVirtuelleVirtualBox o = new C001L003InstallerMachineVirtuelleVirtualBox();
			o.requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(requeteSite);
			o.initLoinC001L003InstallerMachineVirtuelleVirtualBox(requeteSite);
			o.indexerC001L003InstallerMachineVirtuelleVirtualBox();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001L003InstallerMachineVirtuelleVirtualBox();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox(SolrInputDocument document) throws Exception {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L003InstallerMachineVirtuelleVirtualBox() throws Exception {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L003InstallerMachineVirtuelleVirtualBox(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L003InstallerMachineVirtuelleVirtualBox(solrDocument);
	}
	public void stockerC001L003InstallerMachineVirtuelleVirtualBox(SolrDocument solrDocument) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBox();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBox() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(ecraser != null)
			ecraser.htmlBodyCourt();
		if(commentInstaller != null)
			commentInstaller.htmlBodyCourt();
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
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBox();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBox() {
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyMoi();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyEcraser();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCommentInstaller();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyRecapituler1();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyRecapituler2();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBox))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBox that = (C001L003InstallerMachineVirtuelleVirtualBox)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBox {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L003InstallerMachineVirtuelleVirtualBoxVals = new String[] { moiP1, moiP2, ecraserH3I1, ecraserH3Span1, ecraserH4I1, ecraserH4Span1, ecraserPDiv1, ecraserPDiv2, ecraserPDiv3, ecraserPDiv4, ecraserPDiv5, ecraserPDiv6, commentInstallerH3Span1, commentInstallerH4Span1, commentInstallerPUlLi1Span1, commentInstallerPUlLi2Span1, commentInstallerPUlLi2A1, commentInstallerPUlLi3Span1, commentInstallerPUlLi4Span1, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr1Td1I1, recapituler3TableTr1Td21, recapituler3TableTr1Td3I1, recapituler3TableTr1Td41, recapituler3TableTr2Td1I1, recapituler3TableTr2Td21, recapituler3TableTr2Td3I1, recapituler3TableTr2Td41, recapituler3TableTr3Td1I1, recapituler3TableTr3Td21, recapituler3TableTr3Td3I1, recapituler3TableTr3Td41 };
}
