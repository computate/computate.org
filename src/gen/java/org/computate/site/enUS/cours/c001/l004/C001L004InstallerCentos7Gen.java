package org.computate.site.enUS.cours.c001.l004;

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
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true">Trouver la classe  dans Solr</a>
 * <br/>
 **/
public abstract class C001L004InstallerCentos7Gen<DEV> extends C001Lecon {

	public static final String C001L004InstallerCentos7_UnNom = "a lesson";
	public static final String C001L004InstallerCentos7_Ce = "this ";
	public static final String C001L004InstallerCentos7_CeNom = "this lesson";
	public static final String C001L004InstallerCentos7_Un = "an ";
	public static final String C001L004InstallerCentos7_LeNom = "the lesson";
	public static final String C001L004InstallerCentos7_NomSingulier = "lesson";
	public static final String C001L004InstallerCentos7_NomPluriel = "lessons";
	public static final String C001L004InstallerCentos7_NomActuel = "current lesson";
	public static final String C001L004InstallerCentos7_TousNom = "the lessons";
	public static final String C001L004InstallerCentos7_RechercherTousNomPar = "search lessons by ";
	public static final String C001L004InstallerCentos7_H1 = "How do I install the operating system to start developing my website? ";
	public static final String C001L004InstallerCentos7_H2 = "Every step to install the CentOS 7 operating system. ";
	public static final String C001L004InstallerCentos7_LesNoms = "the lessons";
	public static final String C001L004InstallerCentos7_AucunNomTrouve = "no lesson found";
	public static final String C001L004InstallerCentos7_NomVar = "lesson";
	public static final String C001L004InstallerCentos7_DeNom = "of lesson";
	public static final String C001L004InstallerCentos7_Couleur = "green";
	public static final String C001L004InstallerCentos7_IconeGroupe = "regular";
	public static final String C001L004InstallerCentos7_IconeNom = "question";
	public static final String C001L004InstallerCentos7FrFRPage_Uri = "/frFR/cours/001/004-comment-installer-centos7";
	public static final String C001L004InstallerCentos7FrFRPage_ImageUri = "/png/frFR/cours/001/004-comment-installer-centos7-999.png";
	public static final String C001L004InstallerCentos7EnUSPage_Uri = "/enUS/course/001/004-how-to-install-centos7";
	public static final String C001L004InstallerCentos7EnUSPage_ImageUri = "/png/enUS/course/001/004-how-to-install-centos7-999.png";

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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L004InstallerCentos7 moiInit() {
		if(moi != null) {
			((C001L004InstallerCentos7)this).avantPagePart(moi, "moi");
			((C001L004InstallerCentos7)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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

	////////////////////////////////
	// questionTelechargerCentos7 //
	////////////////////////////////

	public static final String questionTelechargerCentos7H3I1 = "far fa-person-carry";
	public static final String questionTelechargerCentos7H3I = questionTelechargerCentos7H3I1;
	public static final String questionTelechargerCentos7H3Span1 = "How do I download CentOS 7?";
	public static final String questionTelechargerCentos7H3Span = questionTelechargerCentos7H3Span1;
	public static final String questionTelechargerCentos7H4I1 = "far fa-cloud-download-alt";
	public static final String questionTelechargerCentos7H4I = questionTelechargerCentos7H4I1;
	public static final String questionTelechargerCentos7H4Span1 = "Download an ISO file. ";
	public static final String questionTelechargerCentos7H4Span = questionTelechargerCentos7H4Span1;
	public static final String questionTelechargerCentos7PreSpan11 = "wget";
	public static final String questionTelechargerCentos7PreSpan1 = questionTelechargerCentos7PreSpan11;
	public static final String questionTelechargerCentos7PreSpan21 = " http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso";
	public static final String questionTelechargerCentos7PreSpan2 = questionTelechargerCentos7PreSpan21;
	public static final String questionTelechargerCentos7PreSpan31 = " -O";
	public static final String questionTelechargerCentos7PreSpan3 = questionTelechargerCentos7PreSpan31;
	public static final String questionTelechargerCentos7PreSpan41 = " ~/Downloads/CentOS-7-x86_64-DVD-1810.iso";
	public static final String questionTelechargerCentos7PreSpan4 = questionTelechargerCentos7PreSpan41;
	public static final String questionTelechargerCentos7OlLi11 = "wget: The command to download files. ";
	public static final String questionTelechargerCentos7OlLi1 = questionTelechargerCentos7OlLi11;
	public static final String questionTelechargerCentos7OlLi21 = "The URL to the CentOS 7 ISO file to download. ";
	public static final String questionTelechargerCentos7OlLi2 = questionTelechargerCentos7OlLi21;
	public static final String questionTelechargerCentos7OlLi31 = "-O: For specifying the output path for the downloaded file. ";
	public static final String questionTelechargerCentos7OlLi3 = questionTelechargerCentos7OlLi31;
	public static final String questionTelechargerCentos7OlLi41 = "The output path for the downloaded CentOS 7 ISO file. ";
	public static final String questionTelechargerCentos7OlLi4 = questionTelechargerCentos7OlLi41;
	public static final String questionTelechargerCentos7PSpan11 = "You can download the latest CentOS 7 ISO file to install on your computer here ";
	public static final String questionTelechargerCentos7PSpan1 = questionTelechargerCentos7PSpan11;
	public static final String questionTelechargerCentos7PSpan2A1 = "https://www.centos.org/download/";
	public static final String questionTelechargerCentos7PSpan2A = questionTelechargerCentos7PSpan2A1;
	public static final String questionTelechargerCentos7PSpan31 = ". Click on the [ DVD ISO ] button. ";
	public static final String questionTelechargerCentos7PSpan32 = "You can choose from any of the mirrors, you might find one close to you. ";
	public static final String questionTelechargerCentos7PSpan33 = "You can also download the file using the wget command in the terminal like that. ";
	public static final String questionTelechargerCentos7PSpan3 = questionTelechargerCentos7PSpan31 + questionTelechargerCentos7PSpan32 + questionTelechargerCentos7PSpan33;

	/**	L'entité « questionTelechargerCentos7 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionTelechargerCentos7 = new PageHtml();
	public Couverture<PageHtml> questionTelechargerCentos7Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionTelechargerCentos7").o(questionTelechargerCentos7);

	/**	<br/>L'entité « questionTelechargerCentos7 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionTelechargerCentos7">Trouver l'entité questionTelechargerCentos7 dans Solr</a>
	 * <br/>
	 * @param questionTelechargerCentos7 est l'entité déjà construit. 
	 **/
	protected abstract void _questionTelechargerCentos7(PageHtml o);

	public PageHtml getQuestionTelechargerCentos7() {
		return questionTelechargerCentos7;
	}

	public void setQuestionTelechargerCentos7(PageHtml questionTelechargerCentos7) {
		this.questionTelechargerCentos7 = questionTelechargerCentos7;
		this.questionTelechargerCentos7Couverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionTelechargerCentos7Init() {
		if(questionTelechargerCentos7 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionTelechargerCentos7, "questionTelechargerCentos7");
			((C001L004InstallerCentos7)this).avantPagePart(questionTelechargerCentos7, "questionTelechargerCentos7");
		}
		if(!questionTelechargerCentos7Couverture.dejaInitialise) {
			_questionTelechargerCentos7(questionTelechargerCentos7);
		}
		questionTelechargerCentos7.initLoinPourClasse(requeteSite_);
		questionTelechargerCentos7Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionTelechargerCentos7(PageHtml o) {
		{ e("h3").a("class", " questionTelechargerCentos7H3 ").f();
			{ e("i").a("class", questionTelechargerCentos7H3I1, " site-menu-icon questionTelechargerCentos7H3I ").f();
			} g("i");
			{ e("span").a("class", " questionTelechargerCentos7H3Span ").f();
				sx(questionTelechargerCentos7H3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionTelechargerCentos7H4 ").f();
			{ e("i").a("class", questionTelechargerCentos7H4I1, " site-menu-icon questionTelechargerCentos7H4I ").f();
			} g("i");
			{ e("span").a("class", " questionTelechargerCentos7H4Span ").f();
				sx(questionTelechargerCentos7H4Span1);
			} g("span");
		} g("h4");
		{ e("pre").a("class", " questionTelechargerCentos7Pre ").f();
			{ e("span").a("class", " questionTelechargerCentos7PreSpan1 questionTelechargerCentos7PreSpan odd ").f();
				sx(questionTelechargerCentos7PreSpan11);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PreSpan2 questionTelechargerCentos7PreSpan even ").f();
				sx(questionTelechargerCentos7PreSpan21);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PreSpan3 questionTelechargerCentos7PreSpan odd ").f();
				sx(questionTelechargerCentos7PreSpan31);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PreSpan4 questionTelechargerCentos7PreSpan even ").f();
				sx(questionTelechargerCentos7PreSpan41);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionTelechargerCentos7Ol ").f();
			{ e("li").a("class", " questionTelechargerCentos7OlLi1 questionTelechargerCentos7OlLi odd ").f();
				sx(questionTelechargerCentos7OlLi11);
			} g("li");
			{ e("li").a("class", " questionTelechargerCentos7OlLi2 questionTelechargerCentos7OlLi even ").f();
				sx(questionTelechargerCentos7OlLi21);
			} g("li");
			{ e("li").a("class", " questionTelechargerCentos7OlLi3 questionTelechargerCentos7OlLi odd ").f();
				sx(questionTelechargerCentos7OlLi31);
			} g("li");
			{ e("li").a("class", " questionTelechargerCentos7OlLi4 questionTelechargerCentos7OlLi even ").f();
				sx(questionTelechargerCentos7OlLi41);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionTelechargerCentos7P ").f();
			{ e("span").a("class", " questionTelechargerCentos7PSpan1 questionTelechargerCentos7PSpan odd ").f();
				sx(questionTelechargerCentos7PSpan11);
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PSpan2 questionTelechargerCentos7PSpan even ").f();
				{ e("a").a("class", " questionTelechargerCentos7PSpan2A ").a("href", questionTelechargerCentos7PSpan2A1).f();
					sx(questionTelechargerCentos7PSpan2A1);
				} g("a");
			} g("span");
			{ e("span").a("class", " questionTelechargerCentos7PSpan3 questionTelechargerCentos7PSpan odd ").f();
				sx(questionTelechargerCentos7PSpan31);
				sx(questionTelechargerCentos7PSpan32);
				sx(questionTelechargerCentos7PSpan33);
			} g("span");
		} g("p");
	}
	public void htmlBodyQuestionTelechargerCentos7() {
		questionTelechargerCentos7.htmlAvant();
		htmlBodyQuestionTelechargerCentos7(questionTelechargerCentos7);
		questionTelechargerCentos7.htmlApres();
	}

	////////////////////////////
	// questionCreerUneCleUsb //
	////////////////////////////

	public static final String questionCreerUneCleUsbH3I1 = "fab fa-usb";
	public static final String questionCreerUneCleUsbH3I = questionCreerUneCleUsbH3I1;
	public static final String questionCreerUneCleUsbH3Span1 = "How can I create a USB key with CentOS 7? ";
	public static final String questionCreerUneCleUsbH3Span = questionCreerUneCleUsbH3Span1;
	public static final String questionCreerUneCleUsbH4I1 = "far fa-compact-disc";
	public static final String questionCreerUneCleUsbH4I = questionCreerUneCleUsbH4I1;
	public static final String questionCreerUneCleUsbH4Span1 = "Use the dd command. ";
	public static final String questionCreerUneCleUsbH4Span = questionCreerUneCleUsbH4Span1;
	public static final String questionCreerUneCleUsbOl1Li11 = "Once you have downloaded your ISO image, place your USB key into a USB port on your computer. ";
	public static final String questionCreerUneCleUsbOl1Li1 = questionCreerUneCleUsbOl1Li11;
	public static final String questionCreerUneCleUsbOl1Li2Span11 = "If you are currently using windows, you can download a program like Win32 Disk Imager to load the ISO image onto a USB key at the bottom of this page ";
	public static final String questionCreerUneCleUsbOl1Li2Span1 = questionCreerUneCleUsbOl1Li2Span11;
	public static final String questionCreerUneCleUsbOl1Li2A1 = "https://wiki.centos.org/HowTos/InstallFromUSBkey";
	public static final String questionCreerUneCleUsbOl1Li2A = questionCreerUneCleUsbOl1Li2A1;
	public static final String questionCreerUneCleUsbOl1Li2Span21 = ". ";
	public static final String questionCreerUneCleUsbOl1Li2Span2 = questionCreerUneCleUsbOl1Li2Span21;
	public static final String questionCreerUneCleUsbOl1Li31 = "If you are on Linux already, I'll teach you a way to load CentOS onto a USB key from the terminal that shows a progress bar. ";
	public static final String questionCreerUneCleUsbOl1Li32 = "First install the prerequisite \"pv\" application to monitor the progress of data through a pipe. ";
	public static final String questionCreerUneCleUsbOl1Li3 = questionCreerUneCleUsbOl1Li31 + questionCreerUneCleUsbOl1Li32;
	public static final String questionCreerUneCleUsbDiv2H51 = "Install the \"pv\" application. ";
	public static final String questionCreerUneCleUsbDiv2H5 = questionCreerUneCleUsbDiv2H51;
	public static final String questionCreerUneCleUsbPre2Span11 = "sudo";
	public static final String questionCreerUneCleUsbPre2Span1 = questionCreerUneCleUsbPre2Span11;
	public static final String questionCreerUneCleUsbPre2Span21 = " yum";
	public static final String questionCreerUneCleUsbPre2Span2 = questionCreerUneCleUsbPre2Span21;
	public static final String questionCreerUneCleUsbPre2Span31 = " install";
	public static final String questionCreerUneCleUsbPre2Span3 = questionCreerUneCleUsbPre2Span31;
	public static final String questionCreerUneCleUsbPre2Span41 = " -y";
	public static final String questionCreerUneCleUsbPre2Span42 = " pv";
	public static final String questionCreerUneCleUsbPre2Span4 = questionCreerUneCleUsbPre2Span41 + questionCreerUneCleUsbPre2Span42;
	public static final String questionCreerUneCleUsbOl2Li11 = "sudo: The command to install yum repositories begins with the command sudo. ";
	public static final String questionCreerUneCleUsbOl2Li12 = "The \"sudo\" command allows your current user to have root privileges for a few minutes after entering your password. ";
	public static final String questionCreerUneCleUsbOl2Li1 = questionCreerUneCleUsbOl2Li11 + questionCreerUneCleUsbOl2Li12;
	public static final String questionCreerUneCleUsbOl2Li21 = "yum : Stands for \"Yellowdog Updater Modified\", but nobody knows it as yellowdog, just yum. ";
	public static final String questionCreerUneCleUsbOl2Li22 = "CentOS manages software packages and RPM application files with yum. ";
	public static final String questionCreerUneCleUsbOl2Li2 = questionCreerUneCleUsbOl2Li21 + questionCreerUneCleUsbOl2Li22;
	public static final String questionCreerUneCleUsbOl2Li31 = "install: For installing new yum packages. ";
	public static final String questionCreerUneCleUsbOl2Li3 = questionCreerUneCleUsbOl2Li31;
	public static final String questionCreerUneCleUsbOl2Li41 = "-y: Suppress messages asking to confirm if you want to install the software. ";
	public static final String questionCreerUneCleUsbOl2Li4 = questionCreerUneCleUsbOl2Li41;
	public static final String questionCreerUneCleUsbOl2Li51 = "pv: The package name of VirtualBox you wish to install. ";
	public static final String questionCreerUneCleUsbOl2Li5 = questionCreerUneCleUsbOl2Li51;
	public static final String questionCreerUneCleUsbDiv3H51 = "Find the path to the USB storage device. ";
	public static final String questionCreerUneCleUsbDiv3H5 = questionCreerUneCleUsbDiv3H51;
	public static final String questionCreerUneCleUsbDiv3P1 = "Run the built in command in linux to view the disks on the computer: ";
	public static final String questionCreerUneCleUsbDiv3P = questionCreerUneCleUsbDiv3P1;
	public static final String questionCreerUneCleUsbPre31 = "lsblk";
	public static final String questionCreerUneCleUsbPre3 = questionCreerUneCleUsbPre31;
	public static final String questionCreerUneCleUsbOl3Li11 = "lsblk: The command to list all block storage devices on the computer. ";
	public static final String questionCreerUneCleUsbOl3Li1 = questionCreerUneCleUsbOl3Li11;
	public static final String questionCreerUneCleUsbP41 = "You will want to very carefully review the list of disks. ";
	public static final String questionCreerUneCleUsbP42 = "Find the disk name that matches the size and mount point of your USB key. ";
	public static final String questionCreerUneCleUsbP43 = "Here is what my USB device at /dev/sdb looks like: ";
	public static final String questionCreerUneCleUsbP4 = questionCreerUneCleUsbP41 + questionCreerUneCleUsbP42 + questionCreerUneCleUsbP43;
	public static final String questionCreerUneCleUsbPre51 = "NAME                                          MAJ:MIN RM   SIZE RO TYPE  MOUNTPOINT";
	public static final String questionCreerUneCleUsbPre5 = questionCreerUneCleUsbPre51;
	public static final String questionCreerUneCleUsbPre5Br1 = "sdb                                             8:16   1   7.2G  0 disk";
	public static final String questionCreerUneCleUsbPre5Br2 = "├─sdb1                                          8:17   1   4.3G  0 part  /run/media/ctate/CentOS 7 x86_64";
	public static final String questionCreerUneCleUsbPre5Br3 = "└─sdb2                                          8:18   1   8.5M  0 part";
	public static final String questionCreerUneCleUsbPre5Br = questionCreerUneCleUsbPre5Br1 + questionCreerUneCleUsbPre5Br2 + questionCreerUneCleUsbPre5Br3;
	public static final String questionCreerUneCleUsbDiv6H51 = "Write the ISO image to the USB key and watch the progress. ";
	public static final String questionCreerUneCleUsbDiv6H5 = questionCreerUneCleUsbDiv6H51;
	public static final String questionCreerUneCleUsbP61 = "If the lsblk command shows sdb, sdb1, sdb2, etc, the path to your USB device would be /dev/sdb. ";
	public static final String questionCreerUneCleUsbP62 = "With that information, you can run a command to write the ISO image to the USB device and see the progress. ";
	public static final String questionCreerUneCleUsbP6 = questionCreerUneCleUsbP61 + questionCreerUneCleUsbP62;
	public static final String questionCreerUneCleUsbPre61 = "pv ~/Downloads/CentOS-7-x86_64-DVD-1810.iso | sudo dd of=/dev/sdb";
	public static final String questionCreerUneCleUsbPre6 = questionCreerUneCleUsbPre61;
	public static final String questionCreerUneCleUsbOl6Li11 = "pv: To monitor the progress of data through a pipe. ";
	public static final String questionCreerUneCleUsbOl6Li1 = questionCreerUneCleUsbOl6Li11;
	public static final String questionCreerUneCleUsbOl6Li21 = "The path to the ISO file. ";
	public static final String questionCreerUneCleUsbOl6Li2 = questionCreerUneCleUsbOl6Li21;
	public static final String questionCreerUneCleUsbOl6Li31 = "|: Takes the output from the pv command and uses it as the input to the dd command. ";
	public static final String questionCreerUneCleUsbOl6Li3 = questionCreerUneCleUsbOl6Li31;
	public static final String questionCreerUneCleUsbOl6Li41 = "sudo ";
	public static final String questionCreerUneCleUsbOl6Li4 = questionCreerUneCleUsbOl6Li41;
	public static final String questionCreerUneCleUsbOl6Li51 = "dd: Copies a file to a device. ";
	public static final String questionCreerUneCleUsbOl6Li5 = questionCreerUneCleUsbOl6Li51;
	public static final String questionCreerUneCleUsbOl6Li61 = "of=... The path to the USB device. ";
	public static final String questionCreerUneCleUsbOl6Li6 = questionCreerUneCleUsbOl6Li61;
	public static final String questionCreerUneCleUsbP71 = "Enjoy the progress bar as your ISO is slowly and carefully loaded onto your USB key. ";
	public static final String questionCreerUneCleUsbP7 = questionCreerUneCleUsbP71;

	/**	L'entité « questionCreerUneCleUsb »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionCreerUneCleUsb = new PageHtml();
	public Couverture<PageHtml> questionCreerUneCleUsbCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionCreerUneCleUsb").o(questionCreerUneCleUsb);

	/**	<br/>L'entité « questionCreerUneCleUsb »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionCreerUneCleUsb">Trouver l'entité questionCreerUneCleUsb dans Solr</a>
	 * <br/>
	 * @param questionCreerUneCleUsb est l'entité déjà construit. 
	 **/
	protected abstract void _questionCreerUneCleUsb(PageHtml o);

	public PageHtml getQuestionCreerUneCleUsb() {
		return questionCreerUneCleUsb;
	}

	public void setQuestionCreerUneCleUsb(PageHtml questionCreerUneCleUsb) {
		this.questionCreerUneCleUsb = questionCreerUneCleUsb;
		this.questionCreerUneCleUsbCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionCreerUneCleUsbInit() {
		if(questionCreerUneCleUsb != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionCreerUneCleUsb, "questionCreerUneCleUsb");
			((C001L004InstallerCentos7)this).avantPagePart(questionCreerUneCleUsb, "questionCreerUneCleUsb");
		}
		if(!questionCreerUneCleUsbCouverture.dejaInitialise) {
			_questionCreerUneCleUsb(questionCreerUneCleUsb);
		}
		questionCreerUneCleUsb.initLoinPourClasse(requeteSite_);
		questionCreerUneCleUsbCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionCreerUneCleUsb(PageHtml o) {
		{ e("h3").a("class", " questionCreerUneCleUsbH3 ").f();
			{ e("i").a("class", questionCreerUneCleUsbH3I1, " site-menu-icon questionCreerUneCleUsbH3I ").f();
			} g("i");
			{ e("span").a("class", " questionCreerUneCleUsbH3Span ").f();
				sx(questionCreerUneCleUsbH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionCreerUneCleUsbH4 ").f();
			{ e("i").a("class", questionCreerUneCleUsbH4I1, " site-menu-icon questionCreerUneCleUsbH4I ").f();
			} g("i");
			{ e("span").a("class", " questionCreerUneCleUsbH4Span ").f();
				sx(questionCreerUneCleUsbH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionCreerUneCleUsbOl1 questionCreerUneCleUsbOl odd ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl1Li1 questionCreerUneCleUsbOl1Li odd ").f();
				sx(questionCreerUneCleUsbOl1Li11);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl1Li2 questionCreerUneCleUsbOl1Li even ").f();
				{ e("span").a("class", " questionCreerUneCleUsbOl1Li2Span1 questionCreerUneCleUsbOl1Li2Span odd ").f();
					sx(questionCreerUneCleUsbOl1Li2Span11);
				} g("span");
				{ e("a").a("class", " questionCreerUneCleUsbOl1Li2A ").f();
					sx(questionCreerUneCleUsbOl1Li2A1);
				} g("a");
				{ e("span").a("class", " questionCreerUneCleUsbOl1Li2Span2 questionCreerUneCleUsbOl1Li2Span even ").f();
					sx(questionCreerUneCleUsbOl1Li2Span21);
				} g("span");
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl1Li3 questionCreerUneCleUsbOl1Li odd ").f();
				sx(questionCreerUneCleUsbOl1Li31);
				sx(questionCreerUneCleUsbOl1Li32);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionCreerUneCleUsbDiv2 questionCreerUneCleUsbDiv even ").f();
			{ e("h5").a("class", " questionCreerUneCleUsbDiv2H5 ").f();
				sx(questionCreerUneCleUsbDiv2H51);
			} g("h5");
		} g("div");
		{ e("pre").a("class", " questionCreerUneCleUsbPre2 questionCreerUneCleUsbPre even ").f();
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span1 questionCreerUneCleUsbPre2Span odd ").f();
				sx(questionCreerUneCleUsbPre2Span11);
			} g("span");
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span2 questionCreerUneCleUsbPre2Span even ").f();
				sx(questionCreerUneCleUsbPre2Span21);
			} g("span");
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span3 questionCreerUneCleUsbPre2Span odd ").f();
				sx(questionCreerUneCleUsbPre2Span31);
			} g("span");
			{ e("span").a("class", " questionCreerUneCleUsbPre2Span4 questionCreerUneCleUsbPre2Span even ").f();
				sx(questionCreerUneCleUsbPre2Span41);
				sx(questionCreerUneCleUsbPre2Span42);
			} g("span");
		} g("pre");
		{ e("ol").a("class", " questionCreerUneCleUsbOl2 questionCreerUneCleUsbOl even ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li1 questionCreerUneCleUsbOl2Li odd ").f();
				sx(questionCreerUneCleUsbOl2Li11);
				sx(questionCreerUneCleUsbOl2Li12);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li2 questionCreerUneCleUsbOl2Li even ").f();
				sx(questionCreerUneCleUsbOl2Li21);
				sx(questionCreerUneCleUsbOl2Li22);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li3 questionCreerUneCleUsbOl2Li odd ").f();
				sx(questionCreerUneCleUsbOl2Li31);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li4 questionCreerUneCleUsbOl2Li even ").f();
				sx(questionCreerUneCleUsbOl2Li41);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl2Li5 questionCreerUneCleUsbOl2Li odd ").f();
				sx(questionCreerUneCleUsbOl2Li51);
			} g("li");
		} g("ol");
		{ e("div").a("class", " questionCreerUneCleUsbDiv3 questionCreerUneCleUsbDiv odd ").f();
			{ e("h5").a("class", " questionCreerUneCleUsbDiv3H5 ").f();
				sx(questionCreerUneCleUsbDiv3H51);
			} g("h5");
			{ e("p").a("class", " questionCreerUneCleUsbDiv3P ").f();
				sx(questionCreerUneCleUsbDiv3P1);
			} g("p");
		} g("div");
		{ e("pre").a("class", " questionCreerUneCleUsbPre3 questionCreerUneCleUsbPre odd ").f();
			sx(questionCreerUneCleUsbPre31);
		} g("pre");
		{ e("ol").a("class", " questionCreerUneCleUsbOl3 questionCreerUneCleUsbOl odd ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl3Li1 questionCreerUneCleUsbOl3Li odd ").f();
				sx(questionCreerUneCleUsbOl3Li11);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCreerUneCleUsbP4 questionCreerUneCleUsbP even ").f();
			sx(questionCreerUneCleUsbP41);
			sx(questionCreerUneCleUsbP42);
			sx(questionCreerUneCleUsbP43);
		} g("p");
		{ e("pre").a("class", " questionCreerUneCleUsbPre5 questionCreerUneCleUsbPre odd ").f();
			sx(questionCreerUneCleUsbPre51);
			e("br").fg();
			sx(questionCreerUneCleUsbPre5Br1);
			e("br").fg();
			sx(questionCreerUneCleUsbPre5Br2);
			e("br").fg();
			sx(questionCreerUneCleUsbPre5Br3);
		} g("pre");
		{ e("div").a("class", " questionCreerUneCleUsbDiv6 questionCreerUneCleUsbDiv even ").f();
			{ e("h5").a("class", " questionCreerUneCleUsbDiv6H5 ").f();
				sx(questionCreerUneCleUsbDiv6H51);
			} g("h5");
		} g("div");
		{ e("p").a("class", " questionCreerUneCleUsbP6 questionCreerUneCleUsbP even ").f();
			sx(questionCreerUneCleUsbP61);
			sx(questionCreerUneCleUsbP62);
		} g("p");
		{ e("pre").a("class", " questionCreerUneCleUsbPre6 questionCreerUneCleUsbPre even ").f();
			sx(questionCreerUneCleUsbPre61);
		} g("pre");
		{ e("ol").a("class", " questionCreerUneCleUsbOl6 questionCreerUneCleUsbOl even ").f();
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li1 questionCreerUneCleUsbOl6Li odd ").f();
				sx(questionCreerUneCleUsbOl6Li11);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li2 questionCreerUneCleUsbOl6Li even ").f();
				sx(questionCreerUneCleUsbOl6Li21);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li3 questionCreerUneCleUsbOl6Li odd ").f();
				sx(questionCreerUneCleUsbOl6Li31);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li4 questionCreerUneCleUsbOl6Li even ").f();
				sx(questionCreerUneCleUsbOl6Li41);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li5 questionCreerUneCleUsbOl6Li odd ").f();
				sx(questionCreerUneCleUsbOl6Li51);
			} g("li");
			{ e("li").a("class", " questionCreerUneCleUsbOl6Li6 questionCreerUneCleUsbOl6Li even ").f();
				sx(questionCreerUneCleUsbOl6Li61);
			} g("li");
		} g("ol");
		{ e("p").a("class", " questionCreerUneCleUsbP7 questionCreerUneCleUsbP odd ").f();
			sx(questionCreerUneCleUsbP71);
		} g("p");
	}
	public void htmlBodyQuestionCreerUneCleUsb() {
		questionCreerUneCleUsb.htmlAvant();
		htmlBodyQuestionCreerUneCleUsb(questionCreerUneCleUsb);
		questionCreerUneCleUsb.htmlApres();
	}

	/////////////////////////////////////
	// questionDemarrerSystemSurCleUsb //
	/////////////////////////////////////

	public static final String questionDemarrerSystemSurCleUsbH3I1 = "far fa-play-circle";
	public static final String questionDemarrerSystemSurCleUsbH3I = questionDemarrerSystemSurCleUsbH3I1;
	public static final String questionDemarrerSystemSurCleUsbH3Span1 = "When I reboot with the USB key, which boot mode do I choose? ";
	public static final String questionDemarrerSystemSurCleUsbH3Span = questionDemarrerSystemSurCleUsbH3Span1;
	public static final String questionDemarrerSystemSurCleUsbH4Span1I1 = "fab fa-windows";
	public static final String questionDemarrerSystemSurCleUsbH4Span1I = questionDemarrerSystemSurCleUsbH4Span1I1;
	public static final String questionDemarrerSystemSurCleUsbH4Span2I1 = "fab fa-centos";
	public static final String questionDemarrerSystemSurCleUsbH4Span2I = questionDemarrerSystemSurCleUsbH4Span2I1;
	public static final String questionDemarrerSystemSurCleUsbH4Span31 = "Avoid booting in UEFI boot mode. ";
	public static final String questionDemarrerSystemSurCleUsbH4Span3 = questionDemarrerSystemSurCleUsbH4Span31;
	public static final String questionDemarrerSystemSurCleUsbP11 = "When you reboot your computer, you will want to press the right key to enter the boot menu. ";
	public static final String questionDemarrerSystemSurCleUsbP12 = "If not, it's possible that you enter a boot mode on the USB that will cause problems after installing your operating system. ";
	public static final String questionDemarrerSystemSurCleUsbP13 = "For me, I will ignore the UEFI options, like \"UEFI: TOSHIBA TransMemory 1.00\", and choose \"TOSHIBA TransMemory 1.00\". ";
	public static final String questionDemarrerSystemSurCleUsbP14 = "I'm not an expert on UEFI, but I know I regretted installing it with UEFI once and it made my system unstable. ";
	public static final String questionDemarrerSystemSurCleUsbP15 = "One reason to use UEFI mode is if other systems (Windows Vista/7/8, GNU/Linux...) of your computer are installed in UEFI mode, and you wish to dual boot, then you must install in UEFI mode too. ";
	public static final String questionDemarrerSystemSurCleUsbP16 = "I never dual boot, since I chose a long time ago to keep Microsoft out of my personal life forever, so I never use UEFI mode. ";
	public static final String questionDemarrerSystemSurCleUsbP1 = questionDemarrerSystemSurCleUsbP11 + questionDemarrerSystemSurCleUsbP12 + questionDemarrerSystemSurCleUsbP13 + questionDemarrerSystemSurCleUsbP14 + questionDemarrerSystemSurCleUsbP15 + questionDemarrerSystemSurCleUsbP16;
	public static final String questionDemarrerSystemSurCleUsbP21 = "Now let it boot into your USB image, let it check the disk for errors and you're on your way! ";
	public static final String questionDemarrerSystemSurCleUsbP2 = questionDemarrerSystemSurCleUsbP21;

	/**	L'entité « questionDemarrerSystemSurCleUsb »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionDemarrerSystemSurCleUsb = new PageHtml();
	public Couverture<PageHtml> questionDemarrerSystemSurCleUsbCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionDemarrerSystemSurCleUsb").o(questionDemarrerSystemSurCleUsb);

	/**	<br/>L'entité « questionDemarrerSystemSurCleUsb »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionDemarrerSystemSurCleUsb">Trouver l'entité questionDemarrerSystemSurCleUsb dans Solr</a>
	 * <br/>
	 * @param questionDemarrerSystemSurCleUsb est l'entité déjà construit. 
	 **/
	protected abstract void _questionDemarrerSystemSurCleUsb(PageHtml o);

	public PageHtml getQuestionDemarrerSystemSurCleUsb() {
		return questionDemarrerSystemSurCleUsb;
	}

	public void setQuestionDemarrerSystemSurCleUsb(PageHtml questionDemarrerSystemSurCleUsb) {
		this.questionDemarrerSystemSurCleUsb = questionDemarrerSystemSurCleUsb;
		this.questionDemarrerSystemSurCleUsbCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionDemarrerSystemSurCleUsbInit() {
		if(questionDemarrerSystemSurCleUsb != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionDemarrerSystemSurCleUsb, "questionDemarrerSystemSurCleUsb");
			((C001L004InstallerCentos7)this).avantPagePart(questionDemarrerSystemSurCleUsb, "questionDemarrerSystemSurCleUsb");
		}
		if(!questionDemarrerSystemSurCleUsbCouverture.dejaInitialise) {
			_questionDemarrerSystemSurCleUsb(questionDemarrerSystemSurCleUsb);
		}
		questionDemarrerSystemSurCleUsb.initLoinPourClasse(requeteSite_);
		questionDemarrerSystemSurCleUsbCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionDemarrerSystemSurCleUsb(PageHtml o) {
		{ e("h3").a("class", " questionDemarrerSystemSurCleUsbH3 ").f();
			{ e("i").a("class", questionDemarrerSystemSurCleUsbH3I1, " site-menu-icon questionDemarrerSystemSurCleUsbH3I ").f();
			} g("i");
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH3Span ").f();
				sx(questionDemarrerSystemSurCleUsbH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionDemarrerSystemSurCleUsbH4 ").f();
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH4Span1 questionDemarrerSystemSurCleUsbH4Span odd ").f();
				{ e("i").a("class", questionDemarrerSystemSurCleUsbH4Span1I1, " site-menu-icon questionDemarrerSystemSurCleUsbH4Span1I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH4Span2 questionDemarrerSystemSurCleUsbH4Span even ").f();
				{ e("i").a("class", questionDemarrerSystemSurCleUsbH4Span2I1, " site-menu-icon questionDemarrerSystemSurCleUsbH4Span2I ").f();
				} g("i");
			} g("span");
			{ e("span").a("class", " questionDemarrerSystemSurCleUsbH4Span3 questionDemarrerSystemSurCleUsbH4Span odd ").f();
				sx(questionDemarrerSystemSurCleUsbH4Span31);
			} g("span");
		} g("h4");
		{ e("p").a("class", " questionDemarrerSystemSurCleUsbP1 questionDemarrerSystemSurCleUsbP odd ").f();
			sx(questionDemarrerSystemSurCleUsbP11);
			sx(questionDemarrerSystemSurCleUsbP12);
			sx(questionDemarrerSystemSurCleUsbP13);
			sx(questionDemarrerSystemSurCleUsbP14);
			sx(questionDemarrerSystemSurCleUsbP15);
			sx(questionDemarrerSystemSurCleUsbP16);
		} g("p");
		{ e("p").a("class", " questionDemarrerSystemSurCleUsbP2 questionDemarrerSystemSurCleUsbP even ").f();
			sx(questionDemarrerSystemSurCleUsbP21);
		} g("p");
	}
	public void htmlBodyQuestionDemarrerSystemSurCleUsb() {
		questionDemarrerSystemSurCleUsb.htmlAvant();
		htmlBodyQuestionDemarrerSystemSurCleUsb(questionDemarrerSystemSurCleUsb);
		questionDemarrerSystemSurCleUsb.htmlApres();
	}

	///////////////////////////
	// questionChoisirLangue //
	///////////////////////////

	public static final String questionChoisirLangueH3I1 = "fas fa-flag-alt";
	public static final String questionChoisirLangueH3I = questionChoisirLangueH3I1;
	public static final String questionChoisirLangueH3Span1 = "What language would I use during the install process? ";
	public static final String questionChoisirLangueH3Span = questionChoisirLangueH3Span1;
	public static final String questionChoisirLangueH4I1 = "far fa-language";
	public static final String questionChoisirLangueH4I = questionChoisirLangueH4I1;
	public static final String questionChoisirLangueH4Span1 = "Choose the language you are comfortable with. ";
	public static final String questionChoisirLangueH4Span = questionChoisirLangueH4Span1;
	public static final String questionChoisirLangueOlLi11 = "On the left hand side, you will find the choices of language for the operating system. ";
	public static final String questionChoisirLangueOlLi12 = "Select the language that you prefer. ";
	public static final String questionChoisirLangueOlLi1 = questionChoisirLangueOlLi11 + questionChoisirLangueOlLi12;
	public static final String questionChoisirLangueOlLi21 = "On the right hand side, you will find the choices of keyboard layout. ";
	public static final String questionChoisirLangueOlLi22 = "Select the keyboard layout for your keyboard. ";
	public static final String questionChoisirLangueOlLi2 = questionChoisirLangueOlLi21 + questionChoisirLangueOlLi22;
	public static final String questionChoisirLangueOlLi31 = "Press [ Continue ]. ";
	public static final String questionChoisirLangueOlLi3 = questionChoisirLangueOlLi31;

	/**	L'entité « questionChoisirLangue »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml questionChoisirLangue = new PageHtml();
	public Couverture<PageHtml> questionChoisirLangueCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("questionChoisirLangue").o(questionChoisirLangue);

	/**	<br/>L'entité « questionChoisirLangue »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:questionChoisirLangue">Trouver l'entité questionChoisirLangue dans Solr</a>
	 * <br/>
	 * @param questionChoisirLangue est l'entité déjà construit. 
	 **/
	protected abstract void _questionChoisirLangue(PageHtml o);

	public PageHtml getQuestionChoisirLangue() {
		return questionChoisirLangue;
	}

	public void setQuestionChoisirLangue(PageHtml questionChoisirLangue) {
		this.questionChoisirLangue = questionChoisirLangue;
		this.questionChoisirLangueCouverture.dejaInitialise = true;
	}
	protected C001L004InstallerCentos7 questionChoisirLangueInit() {
		if(questionChoisirLangue != null) {
			((C001L004InstallerCentos7)this).avantPagePart(questionChoisirLangue, "questionChoisirLangue");
			((C001L004InstallerCentos7)this).avantPagePart(questionChoisirLangue, "questionChoisirLangue");
		}
		if(!questionChoisirLangueCouverture.dejaInitialise) {
			_questionChoisirLangue(questionChoisirLangue);
		}
		questionChoisirLangue.initLoinPourClasse(requeteSite_);
		questionChoisirLangueCouverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
	}
	public void htmlBodyQuestionChoisirLangue(PageHtml o) {
		{ e("h3").a("class", " questionChoisirLangueH3 ").f();
			{ e("i").a("class", questionChoisirLangueH3I1, " site-menu-icon questionChoisirLangueH3I ").f();
			} g("i");
			{ e("span").a("class", " questionChoisirLangueH3Span ").f();
				sx(questionChoisirLangueH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", " questionChoisirLangueH4 ").f();
			{ e("i").a("class", questionChoisirLangueH4I1, " site-menu-icon questionChoisirLangueH4I ").f();
			} g("i");
			{ e("span").a("class", " questionChoisirLangueH4Span ").f();
				sx(questionChoisirLangueH4Span1);
			} g("span");
		} g("h4");
		{ e("ol").a("class", " questionChoisirLangueOl ").f();
			{ e("li").a("class", " questionChoisirLangueOlLi1 questionChoisirLangueOlLi odd ").f();
				sx(questionChoisirLangueOlLi11);
				sx(questionChoisirLangueOlLi12);
			} g("li");
			{ e("li").a("class", " questionChoisirLangueOlLi2 questionChoisirLangueOlLi even ").f();
				sx(questionChoisirLangueOlLi21);
				sx(questionChoisirLangueOlLi22);
			} g("li");
			{ e("li").a("class", " questionChoisirLangueOlLi3 questionChoisirLangueOlLi odd ").f();
				sx(questionChoisirLangueOlLi31);
			} g("li");
		} g("ol");
	}
	public void htmlBodyQuestionChoisirLangue() {
		questionChoisirLangue.htmlAvant();
		htmlBodyQuestionChoisirLangue(questionChoisirLangue);
		questionChoisirLangue.htmlApres();
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler1">Trouver l'entité recapituler1 dans Solr</a>
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
	protected C001L004InstallerCentos7 recapituler1Init() {
		if(recapituler1 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(recapituler1, "recapituler1");
			((C001L004InstallerCentos7)this).avantPagePart(recapituler1, "recapituler1");
		}
		if(!recapituler1Couverture.dejaInitialise) {
			_recapituler1(recapituler1);
		}
		recapituler1.initLoinPourClasse(requeteSite_);
		recapituler1Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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
	public static final String recapituler2TableTr1Td3I1 = "far fa-network-wired";
	public static final String recapituler2TableTr1Td3I = recapituler2TableTr1Td3I1;
	public static final String recapituler2TableTr1Td4I1 = "far fa-pen-nib";
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
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler2">Trouver l'entité recapituler2 dans Solr</a>
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
	protected C001L004InstallerCentos7 recapituler2Init() {
		if(recapituler2 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(recapituler2, "recapituler2");
			((C001L004InstallerCentos7)this).avantPagePart(recapituler2, "recapituler2");
		}
		if(!recapituler2Couverture.dejaInitialise) {
			_recapituler2(recapituler2);
		}
		recapituler2.initLoinPourClasse(requeteSite_);
		recapituler2Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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
	public static final String recapituler3TableTr01Td41 = "Answers";
	public static final String recapituler3TableTr01Td4 = recapituler3TableTr01Td41;
	public static final String recapituler3TableTr02Td1I1 = "far fa-eraser";
	public static final String recapituler3TableTr02Td1I = recapituler3TableTr02Td1I1;
	public static final String recapituler3TableTr02Td21 = "Will Linux destroy my operating system? ";
	public static final String recapituler3TableTr02Td2 = recapituler3TableTr02Td21;
	public static final String recapituler3TableTr02Td3Span1I1 = "fab fa-microsoft";
	public static final String recapituler3TableTr02Td3Span1I = recapituler3TableTr02Td3Span1I1;
	public static final String recapituler3TableTr02Td3Span2I1 = "fab fa-apple";
	public static final String recapituler3TableTr02Td3Span2I = recapituler3TableTr02Td3Span2I1;
	public static final String recapituler3TableTr02Td3Span3I1 = "fab fa-linux";
	public static final String recapituler3TableTr02Td3Span3I = recapituler3TableTr02Td3Span3I1;
	public static final String recapituler3TableTr02Td41 = "Virtualization can run Linux on any operating system. ";
	public static final String recapituler3TableTr02Td4 = recapituler3TableTr02Td41;
	public static final String recapituler3TableTr03Td1I1 = "far fa-person-carry";
	public static final String recapituler3TableTr03Td1I = recapituler3TableTr03Td1I1;
	public static final String recapituler3TableTr03Td21 = "How do I install VirtualBox? ";
	public static final String recapituler3TableTr03Td2 = recapituler3TableTr03Td21;
	public static final String recapituler3TableTr03Td3I1 = "far fa-cloud-download-alt";
	public static final String recapituler3TableTr03Td3I = recapituler3TableTr03Td3I1;
	public static final String recapituler3TableTr03Td41 = "Download it from virtualbox.org";
	public static final String recapituler3TableTr03Td4 = recapituler3TableTr03Td41;
	public static final String recapituler3TableTr04Td1I1 = "far fa-play-circle";
	public static final String recapituler3TableTr04Td1I = recapituler3TableTr04Td1I1;
	public static final String recapituler3TableTr04Td21 = "Prepare CentOS 7 to install VirtualBox";
	public static final String recapituler3TableTr04Td2 = recapituler3TableTr04Td21;
	public static final String recapituler3TableTr04Td3I1 = "far fa-download";
	public static final String recapituler3TableTr04Td3I = recapituler3TableTr04Td3I1;
	public static final String recapituler3TableTr04Td41 = "Install the virtualbox yum repo";
	public static final String recapituler3TableTr04Td4 = recapituler3TableTr04Td41;
	public static final String recapituler3TableTr05Td1I1 = "far fa-box-check";
	public static final String recapituler3TableTr05Td1I = recapituler3TableTr05Td1I1;
	public static final String recapituler3TableTr05Td21 = "Install the virtualbox yum repository";
	public static final String recapituler3TableTr05Td2 = recapituler3TableTr05Td21;
	public static final String recapituler3TableTr05Td3I1 = "far fa-person-dolly";
	public static final String recapituler3TableTr05Td3I = recapituler3TableTr05Td3I1;
	public static final String recapituler3TableTr05Td41 = "Put virtualbox.repo in /etc/yum.repos.d/";
	public static final String recapituler3TableTr05Td4 = recapituler3TableTr05Td41;
	public static final String recapituler3TableTr06Td1I1 = "far fa-question";
	public static final String recapituler3TableTr06Td1I = recapituler3TableTr06Td1I1;
	public static final String recapituler3TableTr06Td21 = "What is the VirtualBox package called? ";
	public static final String recapituler3TableTr06Td2 = recapituler3TableTr06Td21;
	public static final String recapituler3TableTr06Td3I1 = "far fa-search";
	public static final String recapituler3TableTr06Td3I = recapituler3TableTr06Td3I1;
	public static final String recapituler3TableTr06Td41 = "Search for \"virtualbox\" in yum";
	public static final String recapituler3TableTr06Td4 = recapituler3TableTr06Td41;
	public static final String recapituler3TableTr07Td1I1 = "far fa-box";
	public static final String recapituler3TableTr07Td1I = recapituler3TableTr07Td1I1;
	public static final String recapituler3TableTr07Td21 = "Installing VirtualBox";
	public static final String recapituler3TableTr07Td2 = recapituler3TableTr07Td21;
	public static final String recapituler3TableTr07Td3I1 = "far fa-box-full";
	public static final String recapituler3TableTr07Td3I = recapituler3TableTr07Td3I1;
	public static final String recapituler3TableTr07Td41 = "Install the package with yum";
	public static final String recapituler3TableTr07Td4 = recapituler3TableTr07Td41;
	public static final String recapituler3TableTr08Td1I1 = "far fa-clipboard-list";
	public static final String recapituler3TableTr08Td1I = recapituler3TableTr08Td1I1;
	public static final String recapituler3TableTr08Td21 = "How to put an operating system on a virtual machine";
	public static final String recapituler3TableTr08Td2 = recapituler3TableTr08Td21;
	public static final String recapituler3TableTr08Td3I1 = "far fa-arrow-alt-to-bottom";
	public static final String recapituler3TableTr08Td3I = recapituler3TableTr08Td3I1;
	public static final String recapituler3TableTr08Td41 = "Download an ISO file";
	public static final String recapituler3TableTr08Td4 = recapituler3TableTr08Td41;
	public static final String recapituler3TableTr09Td1I1 = "far fa-clipboard-check";
	public static final String recapituler3TableTr09Td1I = recapituler3TableTr09Td1I1;
	public static final String recapituler3TableTr09Td21 = "Verify ISO download";
	public static final String recapituler3TableTr09Td2 = recapituler3TableTr09Td21;
	public static final String recapituler3TableTr09Td3I1 = "far fa-box-check";
	public static final String recapituler3TableTr09Td3I = recapituler3TableTr09Td3I1;
	public static final String recapituler3TableTr09Td41 = "Check the sha256sum";
	public static final String recapituler3TableTr09Td4 = recapituler3TableTr09Td41;
	public static final String recapituler3TableTr10Td1I1 = "far fa-plus-square";
	public static final String recapituler3TableTr10Td1I = recapituler3TableTr10Td1I1;
	public static final String recapituler3TableTr10Td21 = "How do I create the virtual machine?";
	public static final String recapituler3TableTr10Td2 = recapituler3TableTr10Td21;
	public static final String recapituler3TableTr10Td3I1 = "far fa-window";
	public static final String recapituler3TableTr10Td3I = recapituler3TableTr10Td3I1;
	public static final String recapituler3TableTr10Td41 = "Open up VirtualBox and click New";
	public static final String recapituler3TableTr10Td4 = recapituler3TableTr10Td41;
	public static final String recapituler3TableTr11Td1I1 = "far fa-exclamation-circle";
	public static final String recapituler3TableTr11Td1I = recapituler3TableTr11Td1I1;
	public static final String recapituler3TableTr11Td21 = "Kernel driver not installed error";
	public static final String recapituler3TableTr11Td2 = recapituler3TableTr11Td21;
	public static final String recapituler3TableTr11Td3I1 = "far fa-clipboard-list";
	public static final String recapituler3TableTr11Td3I = recapituler3TableTr11Td3I1;
	public static final String recapituler3TableTr11Td41 = "Install kernel prerequisites";
	public static final String recapituler3TableTr11Td4 = recapituler3TableTr11Td41;

	/**	L'entité « recapituler3 »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml recapituler3 = new PageHtml();
	public Couverture<PageHtml> recapituler3Couverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("recapituler3").o(recapituler3);

	/**	<br/>L'entité « recapituler3 »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_enUS_indexed_string:org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_enUS_indexed_string:recapituler3">Trouver l'entité recapituler3 dans Solr</a>
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
	protected C001L004InstallerCentos7 recapituler3Init() {
		if(recapituler3 != null) {
			((C001L004InstallerCentos7)this).avantPagePart(recapituler3, "recapituler3");
			((C001L004InstallerCentos7)this).avantPagePart(recapituler3, "recapituler3");
		}
		if(!recapituler3Couverture.dejaInitialise) {
			_recapituler3(recapituler3);
		}
		recapituler3.initLoinPourClasse(requeteSite_);
		recapituler3Couverture.dejaInitialise(true);
		return (C001L004InstallerCentos7)this;
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
					{ e("span").a("class", " recapituler3TableTr02Td3Span2 recapituler3TableTr even ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span2I1, " site-menu-icon recapituler3TableTr02Td3Span2I ").f();
						} g("i");
					} g("span");
					{ e("span").a("class", " recapituler3TableTr02Td3Span3 recapituler3TableTr odd ").f();
						{ e("i").a("class", recapituler3TableTr02Td3Span3I1, " site-menu-icon recapituler3TableTr02Td3Span3I ").f();
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
					{ e("i").a("class", recapituler3TableTr04Td3I1, " site-menu-icon recapituler3TableTr04Td3I ").f();
					} g("i");
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

	protected boolean dejaInitialiseC001L004InstallerCentos7 = false;

	public C001L004InstallerCentos7 initLoinC001L004InstallerCentos7(RequeteSiteEnUS requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L004InstallerCentos7) {
			dejaInitialiseC001L004InstallerCentos7 = true;
			initLoinC001L004InstallerCentos7();
		}
		return (C001L004InstallerCentos7)this;
	}

	public void initLoinC001L004InstallerCentos7() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L004InstallerCentos7();
	}

	public void initC001L004InstallerCentos7() {
		moiInit();
		questionTelechargerCentos7Init();
		questionCreerUneCleUsbInit();
		questionDemarrerSystemSurCleUsbInit();
		questionChoisirLangueInit();
		recapituler1Init();
		recapituler2Init();
		recapituler3Init();
	}

	@Override public void initLoinPourClasse(RequeteSiteEnUS requeteSite_) {
		initLoinC001L004InstallerCentos7(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L004InstallerCentos7(RequeteSiteEnUS requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(questionTelechargerCentos7 != null)
			questionTelechargerCentos7.setRequeteSite_(requeteSite_);
		if(questionCreerUneCleUsb != null)
			questionCreerUneCleUsb.setRequeteSite_(requeteSite_);
		if(questionDemarrerSystemSurCleUsb != null)
			questionDemarrerSystemSurCleUsb.setRequeteSite_(requeteSite_);
		if(questionChoisirLangue != null)
			questionChoisirLangue.setRequeteSite_(requeteSite_);
		if(recapituler1 != null)
			recapituler1.setRequeteSite_(requeteSite_);
		if(recapituler2 != null)
			recapituler2.setRequeteSite_(requeteSite_);
		if(recapituler3 != null)
			recapituler3.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteEnUS requeteSite_) {
		requeteSiteC001L004InstallerCentos7(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L004InstallerCentos7(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L004InstallerCentos7(String var) throws Exception {
		C001L004InstallerCentos7 oC001L004InstallerCentos7 = (C001L004InstallerCentos7)this;
		switch(var) {
			case "moi":
				return oC001L004InstallerCentos7.moi;
			case "questionTelechargerCentos7":
				return oC001L004InstallerCentos7.questionTelechargerCentos7;
			case "questionCreerUneCleUsb":
				return oC001L004InstallerCentos7.questionCreerUneCleUsb;
			case "questionDemarrerSystemSurCleUsb":
				return oC001L004InstallerCentos7.questionDemarrerSystemSurCleUsb;
			case "questionChoisirLangue":
				return oC001L004InstallerCentos7.questionChoisirLangue;
			case "recapituler1":
				return oC001L004InstallerCentos7.recapituler1;
			case "recapituler2":
				return oC001L004InstallerCentos7.recapituler2;
			case "recapituler3":
				return oC001L004InstallerCentos7.recapituler3;
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
				o = attribuerC001L004InstallerCentos7(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L004InstallerCentos7(String var, Object val) {
		C001L004InstallerCentos7 oC001L004InstallerCentos7 = (C001L004InstallerCentos7)this;
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
					o = definirC001L004InstallerCentos7(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L004InstallerCentos7(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/frFR/cours/001/004-comment-installer-centos7?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-centos7-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/004-comment-installer-centos7-999.png"));
				System.out.println("C001L004InstallerCentos7FrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --min-height=200 --url=https://site.computate.org:10080/enUS/course/001/004-how-to-install-centos7?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-centos7-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/004-how-to-install-centos7-999.png"));
				System.out.println("C001L004InstallerCentos7EnUSPage");
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
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L004InstallerCentos7 o = new C001L004InstallerCentos7();
			o.requeteSiteC001L004InstallerCentos7(requeteSite);
			o.initLoinC001L004InstallerCentos7(requeteSite);
			o.indexerC001L004InstallerCentos7();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001L004InstallerCentos7();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001L004InstallerCentos7(document);
	}

	public void indexerC001L004InstallerCentos7(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L004InstallerCentos7(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L004InstallerCentos7() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L004InstallerCentos7(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L004InstallerCentos7(SolrInputDocument document) throws Exception {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L004InstallerCentos7() throws Exception {
		RequeteSiteEnUS requeteSite = new RequeteSiteEnUS();
		requeteSite.initLoinRequeteSiteEnUS();
		SiteContexteEnUS siteContexte = new SiteContexteEnUS();
		siteContexte.initLoinSiteContexteEnUS();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L004InstallerCentos7(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L004InstallerCentos7(solrDocument);
	}
	public void stockerC001L004InstallerCentos7(SolrDocument solrDocument) {
		C001L004InstallerCentos7 oC001L004InstallerCentos7 = (C001L004InstallerCentos7)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L004InstallerCentos7();
	}

	public void htmlBodyCourtC001L004InstallerCentos7() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(questionTelechargerCentos7 != null)
			questionTelechargerCentos7.htmlBodyCourt();
		if(questionCreerUneCleUsb != null)
			questionCreerUneCleUsb.htmlBodyCourt();
		if(questionDemarrerSystemSurCleUsb != null)
			questionDemarrerSystemSurCleUsb.htmlBodyCourt();
		if(questionChoisirLangue != null)
			questionChoisirLangue.htmlBodyCourt();
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
		htmlBodyC001L004InstallerCentos7();
		super.htmlBody();
	}

	public void htmlBodyC001L004InstallerCentos7() {
		((C001L004InstallerCentos7)this).htmlBodyMoi();
		((C001L004InstallerCentos7)this).htmlBodyQuestionTelechargerCentos7();
		((C001L004InstallerCentos7)this).htmlBodyQuestionCreerUneCleUsb();
		((C001L004InstallerCentos7)this).htmlBodyQuestionDemarrerSystemSurCleUsb();
		((C001L004InstallerCentos7)this).htmlBodyQuestionChoisirLangue();
		((C001L004InstallerCentos7)this).htmlBodyRecapituler1();
		((C001L004InstallerCentos7)this).htmlBodyRecapituler2();
		((C001L004InstallerCentos7)this).htmlBodyRecapituler3();
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
		if(!(o instanceof C001L004InstallerCentos7))
			return false;
		C001L004InstallerCentos7 that = (C001L004InstallerCentos7)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L004InstallerCentos7 {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L004InstallerCentos7Vals = new String[] { moiP1, moiP2, questionTelechargerCentos7H3I1, questionTelechargerCentos7H3Span1, questionTelechargerCentos7H4I1, questionTelechargerCentos7H4Span1, questionTelechargerCentos7PreSpan11, questionTelechargerCentos7PreSpan21, questionTelechargerCentos7PreSpan31, questionTelechargerCentos7PreSpan41, questionTelechargerCentos7OlLi11, questionTelechargerCentos7OlLi21, questionTelechargerCentos7OlLi31, questionTelechargerCentos7OlLi41, questionTelechargerCentos7PSpan11, questionTelechargerCentos7PSpan2A1, questionTelechargerCentos7PSpan31, questionTelechargerCentos7PSpan32, questionTelechargerCentos7PSpan33, questionCreerUneCleUsbH3I1, questionCreerUneCleUsbH3Span1, questionCreerUneCleUsbH4I1, questionCreerUneCleUsbH4Span1, questionCreerUneCleUsbOl1Li11, questionCreerUneCleUsbOl1Li2Span11, questionCreerUneCleUsbOl1Li2A1, questionCreerUneCleUsbOl1Li2Span21, questionCreerUneCleUsbOl1Li31, questionCreerUneCleUsbOl1Li32, questionCreerUneCleUsbDiv2H51, questionCreerUneCleUsbPre2Span11, questionCreerUneCleUsbPre2Span21, questionCreerUneCleUsbPre2Span31, questionCreerUneCleUsbPre2Span41, questionCreerUneCleUsbPre2Span42, questionCreerUneCleUsbOl2Li11, questionCreerUneCleUsbOl2Li12, questionCreerUneCleUsbOl2Li21, questionCreerUneCleUsbOl2Li22, questionCreerUneCleUsbOl2Li31, questionCreerUneCleUsbOl2Li41, questionCreerUneCleUsbOl2Li51, questionCreerUneCleUsbDiv3H51, questionCreerUneCleUsbDiv3P1, questionCreerUneCleUsbPre31, questionCreerUneCleUsbOl3Li11, questionCreerUneCleUsbP41, questionCreerUneCleUsbP42, questionCreerUneCleUsbP43, questionCreerUneCleUsbPre51, questionCreerUneCleUsbPre5Br1, questionCreerUneCleUsbPre5Br2, questionCreerUneCleUsbPre5Br3, questionCreerUneCleUsbDiv6H51, questionCreerUneCleUsbP61, questionCreerUneCleUsbP62, questionCreerUneCleUsbPre61, questionCreerUneCleUsbOl6Li11, questionCreerUneCleUsbOl6Li21, questionCreerUneCleUsbOl6Li31, questionCreerUneCleUsbOl6Li41, questionCreerUneCleUsbOl6Li51, questionCreerUneCleUsbOl6Li61, questionCreerUneCleUsbP71, questionDemarrerSystemSurCleUsbH3I1, questionDemarrerSystemSurCleUsbH3Span1, questionDemarrerSystemSurCleUsbH4Span1I1, questionDemarrerSystemSurCleUsbH4Span2I1, questionDemarrerSystemSurCleUsbH4Span31, questionDemarrerSystemSurCleUsbP11, questionDemarrerSystemSurCleUsbP12, questionDemarrerSystemSurCleUsbP13, questionDemarrerSystemSurCleUsbP14, questionDemarrerSystemSurCleUsbP15, questionDemarrerSystemSurCleUsbP16, questionDemarrerSystemSurCleUsbP21, questionChoisirLangueH3I1, questionChoisirLangueH3Span1, questionChoisirLangueH4I1, questionChoisirLangueH4Span1, questionChoisirLangueOlLi11, questionChoisirLangueOlLi12, questionChoisirLangueOlLi21, questionChoisirLangueOlLi22, questionChoisirLangueOlLi31, recapituler1H31, recapituler2TableTr1Td11, recapituler2TableTr1Td2I1, recapituler2TableTr1Td3I1, recapituler2TableTr1Td4I1, recapituler2TableTr2Td11, recapituler2TableTr2Td21, recapituler2TableTr2Td31, recapituler2TableTr2Td41, recapituler3TableTr01Td1I1, recapituler3TableTr01Td21, recapituler3TableTr01Td3I1, recapituler3TableTr01Td41, recapituler3TableTr02Td1I1, recapituler3TableTr02Td21, recapituler3TableTr02Td3Span1I1, recapituler3TableTr02Td3Span2I1, recapituler3TableTr02Td3Span3I1, recapituler3TableTr02Td41, recapituler3TableTr03Td1I1, recapituler3TableTr03Td21, recapituler3TableTr03Td3I1, recapituler3TableTr03Td41, recapituler3TableTr04Td1I1, recapituler3TableTr04Td21, recapituler3TableTr04Td3I1, recapituler3TableTr04Td41, recapituler3TableTr05Td1I1, recapituler3TableTr05Td21, recapituler3TableTr05Td3I1, recapituler3TableTr05Td41, recapituler3TableTr06Td1I1, recapituler3TableTr06Td21, recapituler3TableTr06Td3I1, recapituler3TableTr06Td41, recapituler3TableTr07Td1I1, recapituler3TableTr07Td21, recapituler3TableTr07Td3I1, recapituler3TableTr07Td41, recapituler3TableTr08Td1I1, recapituler3TableTr08Td21, recapituler3TableTr08Td3I1, recapituler3TableTr08Td41, recapituler3TableTr09Td1I1, recapituler3TableTr09Td21, recapituler3TableTr09Td3I1, recapituler3TableTr09Td41, recapituler3TableTr10Td1I1, recapituler3TableTr10Td21, recapituler3TableTr10Td3I1, recapituler3TableTr10Td41, recapituler3TableTr11Td1I1, recapituler3TableTr11Td21, recapituler3TableTr11Td3I1, recapituler3TableTr11Td41 };
}
