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

	public static final String commentInstallerH3I1 = "fas fa-person-carry";
	public static final String commentInstallerH3I = commentInstallerH3I1;
	public static final String commentInstallerH3Span1 = "How do I install VirtualBox for virtualization? ";
	public static final String commentInstallerH3Span = commentInstallerH3Span1;
	public static final String commentInstallerH4I1 = "fas fa-cloud-download-alt";
	public static final String commentInstallerH4I = commentInstallerH4I1;
	public static final String commentInstallerH4Span1 = "Simply download it from virtualbox.org. ";
	public static final String commentInstallerH4Span = commentInstallerH4Span1;
	public static final String commentInstallerPOlLi1Span1 = "VirtualBox is easy to download and install. ";
	public static final String commentInstallerPOlLi1Span = commentInstallerPOlLi1Span1;
	public static final String commentInstallerPOlLi2Span1 = "Visit this url: ";
	public static final String commentInstallerPOlLi2Span = commentInstallerPOlLi2Span1;
	public static final String commentInstallerPOlLi2A1 = "https://www.virtualbox.org/wiki/Downloads";
	public static final String commentInstallerPOlLi2A = commentInstallerPOlLi2A1;
	public static final String commentInstallerPOlLi3Span1 = "You can download it on a Windows host, an OS X host, a Linux or Solaris host. ";
	public static final String commentInstallerPOlLi3Span = commentInstallerPOlLi3Span1;
	public static final String commentInstallerPOlLi4Span1 = "Because I am running CentOS 7, which is similar to RHEL, I will use the RHEL instructions at the very bottom of the page. ";
	public static final String commentInstallerPOlLi4Span = commentInstallerPOlLi4Span1;

	/**	L'entité « commentInstaller »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml commentInstaller = new PageHtml();
	public Couverture<PageHtml> commentInstallerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("commentInstaller").o(commentInstaller);

	/**	<br/>L'entité « commentInstaller »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:commentInstaller">Trouver l'entité commentInstaller dans Solr</a>
	 * <br/>
	 * @param commentInstaller est l'entité déjà construit. 
	 **/
	protected abstract void _commentInstaller(PageHtml o);

	public PageHtml getCommentInstaller() {
		return commentInstaller;
	}

	public void setCommentInstaller(PageHtml commentInstaller) {
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
	public void htmlBodyCommentInstaller(PageHtml o) {
		{ e("h3").a("class", " commentInstallerH3 ").f();
			{ e("i").a("class", commentInstallerH3I1, " site-menu-icon commentInstallerH3I ").f();
			} g("i");
			{ e("span").a("class", " commentInstallerH3Span ").f();
				sx(commentInstallerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " commentInstallerH4 ").f();
			{ e("i").a("class", commentInstallerH4I1, " site-menu-icon commentInstallerH4I ").f();
			} g("i");
			{ e("span").a("class", " commentInstallerH4Span ").f();
				sx(commentInstallerH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", " commentInstallerP ").f();
			{ e("ol").a("class", " commentInstallerPOl ").f();
				{ e("li").a("class", " commentInstallerPOlLi1 commentInstallerPOlLi odd ").f();
					{ e("span").a("class", " commentInstallerPOlLi1Span ").f();
						sx(commentInstallerPOlLi1Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", " commentInstallerPOlLi2 commentInstallerPOlLi even ").f();
					{ e("span").a("class", " commentInstallerPOlLi2Span ").f();
						sx(commentInstallerPOlLi2Span1);
					} g("span");
					{ e("a").a("class", " commentInstallerPOlLi2A ").f();
						sx(commentInstallerPOlLi2A1);
					} g("a");
				} g("li");
				{ e("li").a("class", " commentInstallerPOlLi3 commentInstallerPOlLi odd ").f();
					{ e("span").a("class", " commentInstallerPOlLi3Span ").f();
						sx(commentInstallerPOlLi3Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", " commentInstallerPOlLi4 commentInstallerPOlLi even ").f();
					{ e("span").a("class", " commentInstallerPOlLi4Span ").f();
						sx(commentInstallerPOlLi4Span1);
					} g("span");
				} g("li");
			} g("ol");
		} g("p");
	}
	public void htmlBodyCommentInstaller() {
		commentInstaller.htmlAvant();
		htmlBodyCommentInstaller(commentInstaller);
		commentInstaller.htmlApres();
	}

	/////////////////
	// telecharger //
	/////////////////

	public static final String telechargerH3I1 = "fas fa-play-circle";
	public static final String telechargerH3I = telechargerH3I1;
	public static final String telechargerH3Span1 = "How can I prepare CentOS 7 to install VirtualBox? ";
	public static final String telechargerH3Span = telechargerH3Span1;
	public static final String telechargerH4I1 = "fas fa-download";
	public static final String telechargerH4I = telechargerH4I1;
	public static final String telechargerH4Span1 = "Install the virtualbox yum repo";
	public static final String telechargerH4Span = telechargerH4Span1;
	public static final String telechargerPreSpan11 = "wget";
	public static final String telechargerPreSpan1 = telechargerPreSpan11;
	public static final String telechargerPreSpan21 = " https://download.virtualbox.org/virtualbox/rpm/el/virtualbox.repo";
	public static final String telechargerPreSpan2 = telechargerPreSpan21;
	public static final String telechargerPreSpan31 = " -O";
	public static final String telechargerPreSpan3 = telechargerPreSpan31;
	public static final String telechargerPreSpan41 = " /tmp/virtualbox.repo";
	public static final String telechargerPreSpan4 = telechargerPreSpan41;
	public static final String telechargerOlLi11 = "The command to download files. ";
	public static final String telechargerOlLi1 = telechargerOlLi11;
	public static final String telechargerOlLi21 = "The URL to the VirtualBox yum repository download file. ";
	public static final String telechargerOlLi2 = telechargerOlLi21;
	public static final String telechargerOlLi31 = "For specifying the output path for the downloaded file. ";
	public static final String telechargerOlLi3 = telechargerOlLi31;
	public static final String telechargerOlLi41 = "The output path for the downloaded yum repository file. ";
	public static final String telechargerOlLi4 = telechargerOlLi41;

	/**	L'entité « telecharger »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml telecharger = new PageHtml();
	public Couverture<PageHtml> telechargerCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("telecharger").o(telecharger);

	/**	<br/>L'entité « telecharger »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:telecharger">Trouver l'entité telecharger dans Solr</a>
	 * <br/>
	 * @param telecharger est l'entité déjà construit. 
	 **/
	protected abstract void _telecharger(PageHtml o);

	public PageHtml getTelecharger() {
		return telecharger;
	}

	public void setTelecharger(PageHtml telecharger) {
		this.telecharger = telecharger;
		this.telechargerCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox telechargerInit() {
		if(telecharger != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telecharger, "telecharger");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telecharger, "telecharger");
		}
		if(!telechargerCouverture.dejaInitialise) {
			_telecharger(telecharger);
		}
		telecharger.initLoinPourClasse(requeteSite_);
		telechargerCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyTelecharger(PageHtml o) {
		{ e("h3").a("class", " telechargerH3 ").f();
			{ e("i").a("class", telechargerH3I1, " site-menu-icon telechargerH3I ").f();
			} g("i");
			{ e("span").a("class", " telechargerH3Span ").f();
				sx(telechargerH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " telechargerH4 ").f();
			{ e("i").a("class", telechargerH4I1, " site-menu-icon telechargerH4I ").f();
			} g("i");
			{ e("span").a("class", " telechargerH4Span ").f();
				sx(telechargerH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " telechargerPre ").f();
			{ e("span").a("class", " telechargerPreSpan1 telechargerPreSpan odd ").f();
				sx(telechargerPreSpan11);
			} g("span");
			{ e("span").a("class", " telechargerPreSpan2 telechargerPreSpan even ").f();
				sx(telechargerPreSpan21);
			} g("span");
			{ e("span").a("class", " telechargerPreSpan3 telechargerPreSpan odd ").f();
				sx(telechargerPreSpan31);
			} g("span");
			{ e("span").a("class", " telechargerPreSpan4 telechargerPreSpan even ").f();
				sx(telechargerPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " telechargerOl ").f();
			{ e("li").a("class", " telechargerOlLi1 telechargerOlLi odd ").f();
				sx(telechargerOlLi11);
			} g("li");
			{ e("li").a("class", " telechargerOlLi2 telechargerOlLi even ").f();
				sx(telechargerOlLi21);
			} g("li");
			{ e("li").a("class", " telechargerOlLi3 telechargerOlLi odd ").f();
				sx(telechargerOlLi31);
			} g("li");
			{ e("li").a("class", " telechargerOlLi4 telechargerOlLi even ").f();
				sx(telechargerOlLi41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyTelecharger() {
		telecharger.htmlAvant();
		htmlBodyTelecharger(telecharger);
		telecharger.htmlApres();
	}

	///////////////////
	// deplacerDepot //
	///////////////////

	public static final String deplacerDepotH3I1 = "fas fa-box-check";
	public static final String deplacerDepotH3I = deplacerDepotH3I1;
	public static final String deplacerDepotH3Span1 = "How can I install the virtualbox yum repository? ";
	public static final String deplacerDepotH3Span = deplacerDepotH3Span1;
	public static final String deplacerDepotH4I1 = "fas fa-person-dolly";
	public static final String deplacerDepotH4I = deplacerDepotH4I1;
	public static final String deplacerDepotH4Span1 = "Put virtualbox.repo in /etc/yum.repos.d/. ";
	public static final String deplacerDepotH4Span = deplacerDepotH4Span1;
	public static final String deplacerDepotPreSpan11 = "sudo";
	public static final String deplacerDepotPreSpan1 = deplacerDepotPreSpan11;
	public static final String deplacerDepotPreSpan21 = " mv";
	public static final String deplacerDepotPreSpan2 = deplacerDepotPreSpan21;
	public static final String deplacerDepotPreSpan31 = " /tmp/virtualbox.repo";
	public static final String deplacerDepotPreSpan3 = deplacerDepotPreSpan31;
	public static final String deplacerDepotPreSpan41 = " /etc/yum.repos.d/";
	public static final String deplacerDepotPreSpan4 = deplacerDepotPreSpan41;
	public static final String deplacerDepotOlLi11 = "The command to install yum repositories begins with the command sudo. ";
	public static final String deplacerDepotOlLi12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String deplacerDepotOlLi13 = "Installing yum repositories always requires root privileges. ";
	public static final String deplacerDepotOlLi1 = deplacerDepotOlLi11 + deplacerDepotOlLi12 + deplacerDepotOlLi13;
	public static final String deplacerDepotOlLi21 = "For moving files to new locations in the filesystem. ";
	public static final String deplacerDepotOlLi2 = deplacerDepotOlLi21;
	public static final String deplacerDepotOlLi31 = "The path to the downloaded yum repository file. ";
	public static final String deplacerDepotOlLi3 = deplacerDepotOlLi31;
	public static final String deplacerDepotOlLi41 = "The directory for configured yum repositories. ";
	public static final String deplacerDepotOlLi4 = deplacerDepotOlLi41;

	/**	L'entité « deplacerDepot »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml deplacerDepot = new PageHtml();
	public Couverture<PageHtml> deplacerDepotCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("deplacerDepot").o(deplacerDepot);

	/**	<br/>L'entité « deplacerDepot »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:deplacerDepot">Trouver l'entité deplacerDepot dans Solr</a>
	 * <br/>
	 * @param deplacerDepot est l'entité déjà construit. 
	 **/
	protected abstract void _deplacerDepot(PageHtml o);

	public PageHtml getDeplacerDepot() {
		return deplacerDepot;
	}

	public void setDeplacerDepot(PageHtml deplacerDepot) {
		this.deplacerDepot = deplacerDepot;
		this.deplacerDepotCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox deplacerDepotInit() {
		if(deplacerDepot != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(deplacerDepot, "deplacerDepot");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(deplacerDepot, "deplacerDepot");
		}
		if(!deplacerDepotCouverture.dejaInitialise) {
			_deplacerDepot(deplacerDepot);
		}
		deplacerDepot.initLoinPourClasse(requeteSite_);
		deplacerDepotCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyDeplacerDepot(PageHtml o) {
		{ e("h3").a("class", " deplacerDepotH3 ").f();
			{ e("i").a("class", deplacerDepotH3I1, " site-menu-icon deplacerDepotH3I ").f();
			} g("i");
			{ e("span").a("class", " deplacerDepotH3Span ").f();
				sx(deplacerDepotH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " deplacerDepotH4 ").f();
			{ e("i").a("class", deplacerDepotH4I1, " site-menu-icon deplacerDepotH4I ").f();
			} g("i");
			{ e("span").a("class", " deplacerDepotH4Span ").f();
				sx(deplacerDepotH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " deplacerDepotPre ").f();
			{ e("span").a("class", " deplacerDepotPreSpan1 deplacerDepotPreSpan odd ").f();
				sx(deplacerDepotPreSpan11);
			} g("span");
			{ e("span").a("class", " deplacerDepotPreSpan2 deplacerDepotPreSpan even ").f();
				sx(deplacerDepotPreSpan21);
			} g("span");
			{ e("span").a("class", " deplacerDepotPreSpan3 deplacerDepotPreSpan odd ").f();
				sx(deplacerDepotPreSpan31);
			} g("span");
			{ e("span").a("class", " deplacerDepotPreSpan4 deplacerDepotPreSpan even ").f();
				sx(deplacerDepotPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " deplacerDepotOl ").f();
			{ e("li").a("class", " deplacerDepotOlLi1 deplacerDepotOlLi odd ").f();
				sx(deplacerDepotOlLi11);
				sx(deplacerDepotOlLi12);
				sx(deplacerDepotOlLi13);
			} g("li");
			{ e("li").a("class", " deplacerDepotOlLi2 deplacerDepotOlLi even ").f();
				sx(deplacerDepotOlLi21);
			} g("li");
			{ e("li").a("class", " deplacerDepotOlLi3 deplacerDepotOlLi odd ").f();
				sx(deplacerDepotOlLi31);
			} g("li");
			{ e("li").a("class", " deplacerDepotOlLi4 deplacerDepotOlLi even ").f();
				sx(deplacerDepotOlLi41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyDeplacerDepot() {
		deplacerDepot.htmlAvant();
		htmlBodyDeplacerDepot(deplacerDepot);
		deplacerDepot.htmlApres();
	}

	///////////////
	// yumSearch //
	///////////////

	public static final String yumSearchH3I1 = "fas fa-question";
	public static final String yumSearchH3I = yumSearchH3I1;
	public static final String yumSearchH3Span1 = "How can I install the virtualbox yum repository? ";
	public static final String yumSearchH3Span = yumSearchH3Span1;
	public static final String yumSearchH4I1 = "fas fa-search";
	public static final String yumSearchH4I = yumSearchH4I1;
	public static final String yumSearchH4Span1 = "Put virtualbox.repo in /etc/yum.repos.d/. ";
	public static final String yumSearchH4Span = yumSearchH4Span1;
	public static final String yumSearchPreSpan11 = "sudo";
	public static final String yumSearchPreSpan1 = yumSearchPreSpan11;
	public static final String yumSearchPreSpan21 = " yum";
	public static final String yumSearchPreSpan2 = yumSearchPreSpan21;
	public static final String yumSearchPreSpan31 = " search";
	public static final String yumSearchPreSpan3 = yumSearchPreSpan31;
	public static final String yumSearchPreSpan41 = " virtualbox";
	public static final String yumSearchPreSpan4 = yumSearchPreSpan41;
	public static final String yumSearchOlLi11 = "sudo";
	public static final String yumSearchOlLi1 = yumSearchOlLi11;
	public static final String yumSearchOlLi21 = "Which stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String yumSearchOlLi22 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String yumSearchOlLi2 = yumSearchOlLi21 + yumSearchOlLi22;
	public static final String yumSearchOlLi31 = "For searching for available yum packages. ";
	public static final String yumSearchOlLi3 = yumSearchOlLi31;
	public static final String yumSearchOlLi41 = "A phrase to search for in the yum repositories, like \"virtualbox\". ";
	public static final String yumSearchOlLi4 = yumSearchOlLi41;

	/**	L'entité « yumSearch »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml yumSearch = new PageHtml();
	public Couverture<PageHtml> yumSearchCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("yumSearch").o(yumSearch);

	/**	<br/>L'entité « yumSearch »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:yumSearch">Trouver l'entité yumSearch dans Solr</a>
	 * <br/>
	 * @param yumSearch est l'entité déjà construit. 
	 **/
	protected abstract void _yumSearch(PageHtml o);

	public PageHtml getYumSearch() {
		return yumSearch;
	}

	public void setYumSearch(PageHtml yumSearch) {
		this.yumSearch = yumSearch;
		this.yumSearchCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox yumSearchInit() {
		if(yumSearch != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumSearch, "yumSearch");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumSearch, "yumSearch");
		}
		if(!yumSearchCouverture.dejaInitialise) {
			_yumSearch(yumSearch);
		}
		yumSearch.initLoinPourClasse(requeteSite_);
		yumSearchCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyYumSearch(PageHtml o) {
		{ e("h3").a("class", " yumSearchH3 ").f();
			{ e("i").a("class", yumSearchH3I1, " site-menu-icon yumSearchH3I ").f();
			} g("i");
			{ e("span").a("class", " yumSearchH3Span ").f();
				sx(yumSearchH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " yumSearchH4 ").f();
			{ e("i").a("class", yumSearchH4I1, " site-menu-icon yumSearchH4I ").f();
			} g("i");
			{ e("span").a("class", " yumSearchH4Span ").f();
				sx(yumSearchH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " yumSearchPre ").f();
			{ e("span").a("class", " yumSearchPreSpan1 yumSearchPreSpan odd ").f();
				sx(yumSearchPreSpan11);
			} g("span");
			{ e("span").a("class", " yumSearchPreSpan2 yumSearchPreSpan even ").f();
				sx(yumSearchPreSpan21);
			} g("span");
			{ e("span").a("class", " yumSearchPreSpan3 yumSearchPreSpan odd ").f();
				sx(yumSearchPreSpan31);
			} g("span");
			{ e("span").a("class", " yumSearchPreSpan4 yumSearchPreSpan even ").f();
				sx(yumSearchPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " yumSearchOl ").f();
			{ e("li").a("class", " yumSearchOlLi1 yumSearchOlLi odd ").f();
				sx(yumSearchOlLi11);
			} g("li");
			{ e("li").a("class", " yumSearchOlLi2 yumSearchOlLi even ").f();
				sx(yumSearchOlLi21);
				sx(yumSearchOlLi22);
			} g("li");
			{ e("li").a("class", " yumSearchOlLi3 yumSearchOlLi odd ").f();
				sx(yumSearchOlLi31);
			} g("li");
			{ e("li").a("class", " yumSearchOlLi4 yumSearchOlLi even ").f();
				sx(yumSearchOlLi41);
			} g("li");
		} g("ol");
	}
	public void htmlBodyYumSearch() {
		yumSearch.htmlAvant();
		htmlBodyYumSearch(yumSearch);
		yumSearch.htmlApres();
	}

	///////////////////////
	// yumInstallPaquets //
	///////////////////////

	public static final String yumInstallPaquetsH3I1 = "fas fa-box";
	public static final String yumInstallPaquetsH3I = yumInstallPaquetsH3I1;
	public static final String yumInstallPaquetsH3Span1 = "How do I now install the VirtualBox application? ";
	public static final String yumInstallPaquetsH3Span = yumInstallPaquetsH3Span1;
	public static final String yumInstallPaquetsH4I1 = "fas fa-box-full";
	public static final String yumInstallPaquetsH4I = yumInstallPaquetsH4I1;
	public static final String yumInstallPaquetsH4Span1 = "Install the package with yum. ";
	public static final String yumInstallPaquetsH4Span = yumInstallPaquetsH4Span1;
	public static final String yumInstallPaquetsPreSpan11 = "sudo";
	public static final String yumInstallPaquetsPreSpan1 = yumInstallPaquetsPreSpan11;
	public static final String yumInstallPaquetsPreSpan21 = " yum";
	public static final String yumInstallPaquetsPreSpan2 = yumInstallPaquetsPreSpan21;
	public static final String yumInstallPaquetsPreSpan31 = " install";
	public static final String yumInstallPaquetsPreSpan3 = yumInstallPaquetsPreSpan31;
	public static final String yumInstallPaquetsPreSpan41 = " -y";
	public static final String yumInstallPaquetsPreSpan4 = yumInstallPaquetsPreSpan41;
	public static final String yumInstallPaquetsPreSpan51 = " VirtualBox-5.2";
	public static final String yumInstallPaquetsPreSpan5 = yumInstallPaquetsPreSpan51;
	public static final String yumInstallPaquetsOlLi11 = "sudo";
	public static final String yumInstallPaquetsOlLi1 = yumInstallPaquetsOlLi11;
	public static final String yumInstallPaquetsOlLi21 = "yum";
	public static final String yumInstallPaquetsOlLi2 = yumInstallPaquetsOlLi21;
	public static final String yumInstallPaquetsOlLi31 = "For installing new yum packages. ";
	public static final String yumInstallPaquetsOlLi3 = yumInstallPaquetsOlLi31;
	public static final String yumInstallPaquetsOlLi41 = "Suppress messages asking to confirm if you want to install the software. ";
	public static final String yumInstallPaquetsOlLi4 = yumInstallPaquetsOlLi41;
	public static final String yumInstallPaquetsOlLi51 = "The package name of VirtualBox you wish to install. ";
	public static final String yumInstallPaquetsOlLi52 = "You can use the package name before the \".x86_64\" from the yum search you did earlier. ";
	public static final String yumInstallPaquetsOlLi53 = "For me it is \"VirtualBox-5.2\". ";
	public static final String yumInstallPaquetsOlLi5 = yumInstallPaquetsOlLi51 + yumInstallPaquetsOlLi52 + yumInstallPaquetsOlLi53;

	/**	L'entité « yumInstallPaquets »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml yumInstallPaquets = new PageHtml();
	public Couverture<PageHtml> yumInstallPaquetsCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("yumInstallPaquets").o(yumInstallPaquets);

	/**	<br/>L'entité « yumInstallPaquets »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:yumInstallPaquets">Trouver l'entité yumInstallPaquets dans Solr</a>
	 * <br/>
	 * @param yumInstallPaquets est l'entité déjà construit. 
	 **/
	protected abstract void _yumInstallPaquets(PageHtml o);

	public PageHtml getYumInstallPaquets() {
		return yumInstallPaquets;
	}

	public void setYumInstallPaquets(PageHtml yumInstallPaquets) {
		this.yumInstallPaquets = yumInstallPaquets;
		this.yumInstallPaquetsCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox yumInstallPaquetsInit() {
		if(yumInstallPaquets != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumInstallPaquets, "yumInstallPaquets");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(yumInstallPaquets, "yumInstallPaquets");
		}
		if(!yumInstallPaquetsCouverture.dejaInitialise) {
			_yumInstallPaquets(yumInstallPaquets);
		}
		yumInstallPaquets.initLoinPourClasse(requeteSite_);
		yumInstallPaquetsCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyYumInstallPaquets(PageHtml o) {
		{ e("h3").a("class", " yumInstallPaquetsH3 ").f();
			{ e("i").a("class", yumInstallPaquetsH3I1, " site-menu-icon yumInstallPaquetsH3I ").f();
			} g("i");
			{ e("span").a("class", " yumInstallPaquetsH3Span ").f();
				sx(yumInstallPaquetsH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " yumInstallPaquetsH4 ").f();
			{ e("i").a("class", yumInstallPaquetsH4I1, " site-menu-icon yumInstallPaquetsH4I ").f();
			} g("i");
			{ e("span").a("class", " yumInstallPaquetsH4Span ").f();
				sx(yumInstallPaquetsH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " yumInstallPaquetsPre ").f();
			{ e("span").a("class", " yumInstallPaquetsPreSpan1 yumInstallPaquetsPreSpan odd ").f();
				sx(yumInstallPaquetsPreSpan11);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan2 yumInstallPaquetsPreSpan even ").f();
				sx(yumInstallPaquetsPreSpan21);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan3 yumInstallPaquetsPreSpan odd ").f();
				sx(yumInstallPaquetsPreSpan31);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan4 yumInstallPaquetsPreSpan even ").f();
				sx(yumInstallPaquetsPreSpan41);
			} g("span");
			{ e("span").a("class", " yumInstallPaquetsPreSpan5 yumInstallPaquetsPreSpan odd ").f();
				sx(yumInstallPaquetsPreSpan51);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " yumInstallPaquetsOl ").f();
			{ e("li").a("class", " yumInstallPaquetsOlLi1 yumInstallPaquetsOlLi odd ").f();
				sx(yumInstallPaquetsOlLi11);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi2 yumInstallPaquetsOlLi even ").f();
				sx(yumInstallPaquetsOlLi21);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi3 yumInstallPaquetsOlLi odd ").f();
				sx(yumInstallPaquetsOlLi31);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi4 yumInstallPaquetsOlLi even ").f();
				sx(yumInstallPaquetsOlLi41);
			} g("li");
			{ e("li").a("class", " yumInstallPaquetsOlLi5 yumInstallPaquetsOlLi odd ").f();
				sx(yumInstallPaquetsOlLi51);
				sx(yumInstallPaquetsOlLi52);
				sx(yumInstallPaquetsOlLi53);
			} g("li");
		} g("ol");
	}
	public void htmlBodyYumInstallPaquets() {
		yumInstallPaquets.htmlAvant();
		htmlBodyYumInstallPaquets(yumInstallPaquets);
		yumInstallPaquets.htmlApres();
	}

	////////////////////
	// telechargerIso //
	////////////////////

	public static final String telechargerIsoH3I1 = "fas fa-clipboard-list";
	public static final String telechargerIsoH3I = telechargerIsoH3I1;
	public static final String telechargerIsoH3Span1 = "How do I put an operating system on a VirtualBox virtual machine? ";
	public static final String telechargerIsoH3Span = telechargerIsoH3Span1;
	public static final String telechargerIsoH4I1 = "fas fa-arrow-alt-to-bottom";
	public static final String telechargerIsoH4I = telechargerIsoH4I1;
	public static final String telechargerIsoH4Span1 = "Download an ISO file. ";
	public static final String telechargerIsoH4Span = telechargerIsoH4Span1;
	public static final String telechargerIsoPreSpan11 = "wget";
	public static final String telechargerIsoPreSpan1 = telechargerIsoPreSpan11;
	public static final String telechargerIsoPreSpan21 = " http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso";
	public static final String telechargerIsoPreSpan2 = telechargerIsoPreSpan21;
	public static final String telechargerIsoPreSpan31 = " -O";
	public static final String telechargerIsoPreSpan3 = telechargerIsoPreSpan31;
	public static final String telechargerIsoPreSpan41 = " ~/Downloads/CentOS-7-x86_64-DVD-1810.iso";
	public static final String telechargerIsoPreSpan4 = telechargerIsoPreSpan41;
	public static final String telechargerIsoOlLi11 = "wget";
	public static final String telechargerIsoOlLi1 = telechargerIsoOlLi11;
	public static final String telechargerIsoOlLi21 = "The URL to the CentOS 7 ISO file to download. ";
	public static final String telechargerIsoOlLi2 = telechargerIsoOlLi21;
	public static final String telechargerIsoOlLi31 = "-O";
	public static final String telechargerIsoOlLi3 = telechargerIsoOlLi31;
	public static final String telechargerIsoOlLi41 = "The output path for the downloaded CentOS 7 ISO file. ";
	public static final String telechargerIsoOlLi4 = telechargerIsoOlLi41;
	public static final String telechargerIsoPSpan11 = "You can download the latest CentOS 7 ISO file to install on a new virtual machine here ";
	public static final String telechargerIsoPSpan1 = telechargerIsoPSpan11;
	public static final String telechargerIsoPSpan2A1 = "https://www.centos.org/download/";
	public static final String telechargerIsoPSpan2A = telechargerIsoPSpan2A1;
	public static final String telechargerIsoPSpan31 = ". Click on the [ DVD ISO ] button. ";
	public static final String telechargerIsoPSpan32 = "You can choose from any of the mirrors, you might find one close to you. ";
	public static final String telechargerIsoPSpan33 = "You can also download the file using the wget command in the terminal like that. ";
	public static final String telechargerIsoPSpan3 = telechargerIsoPSpan31 + telechargerIsoPSpan32 + telechargerIsoPSpan33;

	/**	L'entité « telechargerIso »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml telechargerIso = new PageHtml();
	public Couverture<PageHtml> telechargerIsoCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("telechargerIso").o(telechargerIso);

	/**	<br/>L'entité « telechargerIso »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:telechargerIso">Trouver l'entité telechargerIso dans Solr</a>
	 * <br/>
	 * @param telechargerIso est l'entité déjà construit. 
	 **/
	protected abstract void _telechargerIso(PageHtml o);

	public PageHtml getTelechargerIso() {
		return telechargerIso;
	}

	public void setTelechargerIso(PageHtml telechargerIso) {
		this.telechargerIso = telechargerIso;
		this.telechargerIsoCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox telechargerIsoInit() {
		if(telechargerIso != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telechargerIso, "telechargerIso");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(telechargerIso, "telechargerIso");
		}
		if(!telechargerIsoCouverture.dejaInitialise) {
			_telechargerIso(telechargerIso);
		}
		telechargerIso.initLoinPourClasse(requeteSite_);
		telechargerIsoCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyTelechargerIso(PageHtml o) {
		{ e("h3").a("class", " telechargerIsoH3 ").f();
			{ e("i").a("class", telechargerIsoH3I1, " site-menu-icon telechargerIsoH3I ").f();
			} g("i");
			{ e("span").a("class", " telechargerIsoH3Span ").f();
				sx(telechargerIsoH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " telechargerIsoH4 ").f();
			{ e("i").a("class", telechargerIsoH4I1, " site-menu-icon telechargerIsoH4I ").f();
			} g("i");
			{ e("span").a("class", " telechargerIsoH4Span ").f();
				sx(telechargerIsoH4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " telechargerIsoPre ").f();
			{ e("span").a("class", " telechargerIsoPreSpan1 telechargerIsoPreSpan odd ").f();
				sx(telechargerIsoPreSpan11);
			} g("span");
			{ e("span").a("class", " telechargerIsoPreSpan2 telechargerIsoPreSpan even ").f();
				sx(telechargerIsoPreSpan21);
			} g("span");
			{ e("span").a("class", " telechargerIsoPreSpan3 telechargerIsoPreSpan odd ").f();
				sx(telechargerIsoPreSpan31);
			} g("span");
			{ e("span").a("class", " telechargerIsoPreSpan4 telechargerIsoPreSpan even ").f();
				sx(telechargerIsoPreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " telechargerIsoOl ").f();
			{ e("li").a("class", " telechargerIsoOlLi1 telechargerIsoOlLi odd ").f();
				sx(telechargerIsoOlLi11);
			} g("li");
			{ e("li").a("class", " telechargerIsoOlLi2 telechargerIsoOlLi even ").f();
				sx(telechargerIsoOlLi21);
			} g("li");
			{ e("li").a("class", " telechargerIsoOlLi3 telechargerIsoOlLi odd ").f();
				sx(telechargerIsoOlLi31);
			} g("li");
			{ e("li").a("class", " telechargerIsoOlLi4 telechargerIsoOlLi even ").f();
				sx(telechargerIsoOlLi41);
			} g("li");
		} g("ol");
		{ e("p").a("class", " telechargerIsoP ").f();
			{ e("span").a("class", " telechargerIsoPSpan1 telechargerIsoPSpan odd ").f();
				sx(telechargerIsoPSpan11);
			} g("span");
			{ e("span").a("class", " telechargerIsoPSpan2 telechargerIsoPSpan even ").f();
				{ e("a").a("class", " telechargerIsoPSpan2A ").a("href", telechargerIsoPSpan2A1).f();
					sx(telechargerIsoPSpan2A1);
				} g("a");
			} g("span");
			{ e("span").a("class", " telechargerIsoPSpan3 telechargerIsoPSpan odd ").f();
				sx(telechargerIsoPSpan31);
				sx(telechargerIsoPSpan32);
				sx(telechargerIsoPSpan33);
			} g("span");
		} g("p");
	}
	public void htmlBodyTelechargerIso() {
		telechargerIso.htmlAvant();
		htmlBodyTelechargerIso(telechargerIso);
		telechargerIso.htmlApres();
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

	public static final String recapituler3TableTr1Td1I1 = "fas fa-question";
	public static final String recapituler3TableTr1Td1I = recapituler3TableTr1Td1I1;
	public static final String recapituler3TableTr1Td21 = "Questions";
	public static final String recapituler3TableTr1Td2 = recapituler3TableTr1Td21;
	public static final String recapituler3TableTr1Td3I1 = "fas fa-bullhorn";
	public static final String recapituler3TableTr1Td3I = recapituler3TableTr1Td3I1;
	public static final String recapituler3TableTr1Td41 = "Answers";
	public static final String recapituler3TableTr1Td4 = recapituler3TableTr1Td41;
	public static final String recapituler3TableTr2Td1I1 = "fas fa-eraser";
	public static final String recapituler3TableTr2Td1I = recapituler3TableTr2Td1I1;
	public static final String recapituler3TableTr2Td21 = "Will Linux destroy my operating system? ";
	public static final String recapituler3TableTr2Td2 = recapituler3TableTr2Td21;
	public static final String recapituler3TableTr2Td3I1 = "fab fa-linux";
	public static final String recapituler3TableTr2Td3I = recapituler3TableTr2Td3I1;
	public static final String recapituler3TableTr2Td41 = "Virtualization can run Linux on any operating system. ";
	public static final String recapituler3TableTr2Td4 = recapituler3TableTr2Td41;
	public static final String recapituler3TableTr3Td1I1 = "fas fa-person-carry";
	public static final String recapituler3TableTr3Td1I = recapituler3TableTr3Td1I1;
	public static final String recapituler3TableTr3Td21 = "How do I install VirtualBox? ";
	public static final String recapituler3TableTr3Td2 = recapituler3TableTr3Td21;
	public static final String recapituler3TableTr3Td3I1 = "fas fa-cloud-download-alt";
	public static final String recapituler3TableTr3Td3I = recapituler3TableTr3Td3I1;
	public static final String recapituler3TableTr3Td41 = "Download it from virtualbox.org";
	public static final String recapituler3TableTr3Td4 = recapituler3TableTr3Td41;
	public static final String recapituler3TableTr4Td1I1 = "fas fa-play-circle";
	public static final String recapituler3TableTr4Td1I = recapituler3TableTr4Td1I1;
	public static final String recapituler3TableTr4Td21 = "Prepare CentOS 7 to install VirtualBox";
	public static final String recapituler3TableTr4Td2 = recapituler3TableTr4Td21;
	public static final String recapituler3TableTr4Td3I1 = "fas fa-download";
	public static final String recapituler3TableTr4Td3I = recapituler3TableTr4Td3I1;
	public static final String recapituler3TableTr4Td41 = "Install the virtualbox yum repo";
	public static final String recapituler3TableTr4Td4 = recapituler3TableTr4Td41;

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
			{ e("tr").a("class", " recapituler3TableTr4 recapituler3TableTr even ").f();
				{ e("td").a("class", " recapituler3TableTr4Td1 recapituler3TableTr4Td odd ").f();
					{ e("i").a("class", recapituler3TableTr4Td1I1, " site-menu-icon recapituler3TableTr4Td1I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr4Td2 recapituler3TableTr4Td even ").f();
					sx(recapituler3TableTr4Td21);
				} g("td");
				{ e("td").a("class", " recapituler3TableTr4Td3 recapituler3TableTr4Td odd ").f();
					{ e("i").a("class", recapituler3TableTr4Td3I1, " site-menu-icon recapituler3TableTr4Td3I ").f();
					} g("i");
				} g("td");
				{ e("td").a("class", " recapituler3TableTr4Td4 recapituler3TableTr4Td even ").f();
					sx(recapituler3TableTr4Td41);
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
		telechargerInit();
		deplacerDepotInit();
		yumSearchInit();
		yumInstallPaquetsInit();
		telechargerIsoInit();
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
		if(telecharger != null)
			telecharger.setRequeteSite_(requeteSite_);
		if(deplacerDepot != null)
			deplacerDepot.setRequeteSite_(requeteSite_);
		if(yumSearch != null)
			yumSearch.setRequeteSite_(requeteSite_);
		if(yumInstallPaquets != null)
			yumInstallPaquets.setRequeteSite_(requeteSite_);
		if(telechargerIso != null)
			telechargerIso.setRequeteSite_(requeteSite_);
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
			case "telecharger":
				return oC001L003InstallerMachineVirtuelleVirtualBox.telecharger;
			case "deplacerDepot":
				return oC001L003InstallerMachineVirtuelleVirtualBox.deplacerDepot;
			case "yumSearch":
				return oC001L003InstallerMachineVirtuelleVirtualBox.yumSearch;
			case "yumInstallPaquets":
				return oC001L003InstallerMachineVirtuelleVirtualBox.yumInstallPaquets;
			case "telechargerIso":
				return oC001L003InstallerMachineVirtuelleVirtualBox.telechargerIso;
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
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
			requeteSite.setConfigSite_(siteContexte.getConfigSite());
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
		if(telecharger != null)
			telecharger.htmlBodyCourt();
		if(deplacerDepot != null)
			deplacerDepot.htmlBodyCourt();
		if(yumSearch != null)
			yumSearch.htmlBodyCourt();
		if(yumInstallPaquets != null)
			yumInstallPaquets.htmlBodyCourt();
		if(telechargerIso != null)
			telechargerIso.htmlBodyCourt();
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
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyTelecharger();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyDeplacerDepot();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyYumSearch();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyYumInstallPaquets();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyTelechargerIso();
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

	public static final String[] C001L003InstallerMachineVirtuelleVirtualBoxVals = new String[] { moiP1, moiP2, ecraserH3I1, ecraserH3Span1, ecraserH4I1, ecraserH4Span1, ecraserPDiv1, ecraserPDiv2, ecraserPDiv3, ecraserPDiv4, ecraserPDiv5, ecraserPDiv6, commentInstallerH3I1, commentInstallerH3Span1, commentInstallerH4I1, commentInstallerH4Span1, commentInstallerPOlLi1Span1, commentInstallerPOlLi2Span1, commentInstallerPOlLi2A1, commentInstallerPOlLi3Span1, commentInstallerPOlLi4Span1, telechargerH3I1, telechargerH3Span1, telechargerH4I1, telechargerH4Span1, telechargerPreSpan11, telechargerPreSpan21, telechargerPreSpan31, telechargerPreSpan41, telechargerOlLi11, telechargerOlLi21, telechargerOlLi31, telechargerOlLi41, deplacerDepotH3I1, deplacerDepotH3Span1, deplacerDepotH4I1, deplacerDepotH4Span1, deplacerDepotPreSpan11, deplacerDepotPreSpan21, deplacerDepotPreSpan31, deplacerDepotPreSpan41, deplacerDepotOlLi11, deplacerDepotOlLi12, deplacerDepotOlLi13, deplacerDepotOlLi21, deplacerDepotOlLi31, deplacerDepotOlLi41, yumSearchH3I1, yumSearchH3Span1, yumSearchH4I1, yumSearchH4Span1, yumSearchPreSpan11, yumSearchPreSpan21, yumSearchPreSpan31, yumSearchPreSpan41, yumSearchOlLi11, yumSearchOlLi21, yumSearchOlLi22, yumSearchOlLi31, yumSearchOlLi41, yumInstallPaquetsH3I1, yumInstallPaquetsH3Span1, yumInstallPaquetsH4I1, yumInstallPaquetsH4Span1, yumInstallPaquetsPreSpan11, yumInstallPaquetsPreSpan21, yumInstallPaquetsPreSpan31, yumInstallPaquetsPreSpan41, yumInstallPaquetsPreSpan51, yumInstallPaquetsOlLi11, yumInstallPaquetsOlLi21, yumInstallPaquetsOlLi31, yumInstallPaquetsOlLi41, yumInstallPaquetsOlLi51, yumInstallPaquetsOlLi52, yumInstallPaquetsOlLi53, telechargerIsoH3I1, telechargerIsoH3Span1, telechargerIsoH4I1, telechargerIsoH4Span1, telechargerIsoPreSpan11, telechargerIsoPreSpan21, telechargerIsoPreSpan31, telechargerIsoPreSpan41, telechargerIsoOlLi11, telechargerIsoOlLi21, telechargerIsoOlLi31, telechargerIsoOlLi41, telechargerIsoPSpan11, telechargerIsoPSpan2A1, telechargerIsoPSpan31, telechargerIsoPSpan32, telechargerIsoPSpan33, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr1Td1I1, recapituler3TableTr1Td21, recapituler3TableTr1Td3I1, recapituler3TableTr1Td41, recapituler3TableTr2Td1I1, recapituler3TableTr2Td21, recapituler3TableTr2Td3I1, recapituler3TableTr2Td41, recapituler3TableTr3Td1I1, recapituler3TableTr3Td21, recapituler3TableTr3Td3I1, recapituler3TableTr3Td41, recapituler3TableTr4Td1I1, recapituler3TableTr4Td21, recapituler3TableTr4Td3I1, recapituler3TableTr4Td41 };
}
