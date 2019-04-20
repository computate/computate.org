package org.computate.site.frFR.cours.c001.l003;

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.Cmd;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.page.parti.QuestionReponse;

/**  
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box
 * ApiUriRechercheEnUSPage: /enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box
 * PageRechercheFrFRPage: C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage
 * PageRechercheEnUSPage: C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? 
 * H1.enUS: How do I try CentOS 7 Linux without replacing my operating system? 
 * 
 * H2.frFR: Essayez CentOS 7 sur une machine virtuelle VirtualBox. 
 * H2.enUS: Try CentOS 7 on a VirtualBox virtual machine. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 616
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 616
 * VideoId.frFR: g61yXjXCUGU
 * VideoId.enUS: taA73wkea6Q
*/     
public class C001L003InstallerMachineVirtuelleVirtualBox extends C001L003InstallerMachineVirtuelleVirtualBoxGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(2);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox.C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H1);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBox_H2);
		addPageRecherche_frFR(C001L003InstallerMachineVirtuelleVirtualBoxVals);
	}

	public void htmlBodyCourt() {
		super.htmlBodyCourt();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 */ 
	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Est-t-il possible d'essayer Linux sans écraser mon système d'exploitation ? 
	 * Val.Question.enUS:Is it possible to try Linux without destroying my operating system? 
	 * Val.QuestionCourt.frFR:Linux va-t-il détruire mon système d'exploitation ? 
	 * Val.QuestionCourt.enUS:Will Linux destroy my operating system? 
	 * Val.Reponse.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.Reponse.enUS:Virtualization can run Linux on any operating system. 
	 * Val.ReponseCourt.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.ReponseCourt.enUS:Virtualization can run Linux on any operating system. 
	 * Val.P.frFR:Grâce à la virtualisation, c'est simple à essayer les systèmes d'exploitation sur votre propre ordinateur ! 
	 * Val.P.frFR:La virtualisation vous permet de démarrer des machines virtuelles. 
	 * Val.P.frFR:Les machines virtuelles sont des systèmes d'exploitation entiers s'exécutant sous votre propre système d'exploitation via un logiciel. 
	 * Val.P.frFR:La virtualisation est gratuite, grâce à des nombreux logiciels fantastiques ! 
	 * Val.P.frFR:Pour Linux, je recommande Libvirt pour plus de puissance, mais pour une solution multi-plateforme, nous allons utiliser VirtualBox dans cette leçon. 
	 * Val.P.frFR:Je vais vous apprendre comment faire fonctionner une machine virtuelle CentOS 7 sur votre système. 
	 * Val.P.enUS:Thanks to virtualization, trying out operating systems on your own computer is simple! 
	 * Val.P.enUS:Virtualization allows you to run virtual machines. 
	 * Val.P.enUS:Virtual machines are entire operating systems running under your own operating system through software. 
	 * Val.P.enUS:Virtualization is free, thanks to many good software packages! 
	 * Val.P.enUS:For Linux I recommend Libvirt for more power, but for a cross-platform solution, we will be using VirtualBox in this lesson. 
	 * Val.P.enUS:I'll teach you how to get a CentOS 7 virtual machine running on your system. 
	 */   
	protected void _ecraser(QuestionReponse o) {      

		o.questionIcone("fas", "eraser");
		o.setQuestion(ecraserQuestion);
		o.setQuestionCourt(ecraserQuestionCourt);

		o.reponseIcone("fab", "linux");
		o.setReponse(ecraserReponse);
		o.setReponseCourt(ecraserReponseCourt);
	}
	public void htmlBodyEcraser(QuestionReponse o) { 
		e("p").f();
			e("div").f();
				sx(ecraserP);
			g("div");
		g("p");
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Comment installer VirtualBox pour la virtualisation ? 
	 * Val.Question.enUS:How do I install VirtualBox for virtualization? 
	 * Val.QuestionCourt.frFR:Comment installer VirtualBox ? 
	 * Val.QuestionCourt.enUS:How do I install VirtualBox? 
	 * Val.Reponse.frFR:Téléchargez-le simplement depuis virtualbox.org. 
	 * Val.Reponse.enUS:Simply download it from virtualbox.org. 
	 * Val.ReponseCourt.frFR:Téléchargez-le depuis virtualbox.org
	 * Val.ReponseCourt.enUS:Download it from virtualbox.org
	 * Val.P.frFR:VirtualBox est facile à télécharger et à installer. 
	 * Val.P.frFR:Visitez cette URL : 
	 * Val.P.frFR:https://www.virtualbox.org/wiki/Downloads
	 * Val.P.frFR:Vous pouvez le télécharger sur un hôte Windows, un hôte OS X, un hôte Linux ou Solaris. 
	 * Val.P.frFR:Parce que j'utilise CentOS 7, qui est similaire à RHEL, j'utiliserai les instructions RHEL tout en bas de la page. 
	 * Val.P.enUS:VirtualBox is easy to download and install. 
	 * Val.P.enUS:Visit this url: 
	 * Val.P.enUS:https://www.virtualbox.org/wiki/Downloads
	 * Val.P.enUS:You can download it on a Windows host, an OS X host, a Linux or Solaris host. 
	 * Val.P.enUS:Because I am running CentOS 7, which is similar to RHEL, I will use the RHEL instructions at the very bottom of the page. 
	 */ 
	protected void _commentInstaller(QuestionReponse o) {

		o.questionIcone("fas", "person-carry");
		o.setQuestion(commentInstallerQuestion);
		o.setQuestionCourt(commentInstallerQuestionCourt);

		o.reponseIcone("fab", "cloud-download-alt");
		o.setReponse(commentInstallerReponse);
		o.setReponseCourt(commentInstallerReponseCourt);
	}
	public void htmlBodyCommentInstaller(QuestionReponse o) {
		{ e("p").f();
			{ e("ul").f();
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP1);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP2);
					} g("span");
					{ e("a").a("href", commentInstallerP3).f();
						sx(commentInstallerP3);
					} g("a");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP4);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(commentInstallerP5);
					} g("span");
				} g("li");
			} g("ul");
		} g("p");
	} 

	/**
	 * {@inheritDoc}
	 * 
	 * Val.Question.frFR:Comment puis-je préparer CentOS 7 pour installer VirtualBox ? 
	 * Val.Question.enUS:How can I prepare CentOS 7 to install VirtualBox? 
	 * Val.QuestionCourt.frFR:Préparer CentOS 7 pour installer VirtualBox
	 * Val.QuestionCourt.enUS:Prepare CentOS 7 to install VirtualBox
	 * Val.Reponse.frFR:Installer le dépot yum virtualbox
	 * Val.Reponse.enUS:Install the virtualbox yum repo
	 * Val.ReponseCourt.frFR:Installer le dépot yum virtualbox
	 * Val.ReponseCourt.enUS:Install the virtualbox yum repo
	 * Val.Param:wget
	 * Val.Param: https://download.virtualbox.org/virtualbox/rpm/el/virtualbox.repo
	 * Val.Param: -O
	 * Val.Param: /tmp/virtualbox.repo
	 * Val.Param1P.frFR:La commande pour télécharger des fichiers. 
	 * Val.Param1P.enUS:The command to download files. 
	 * Val.Param2P.frFR:L'URL vers le téléchargement dépôt yum VirtualBox. 
	 * Val.Param2P.enUS:The URL to the VirtualBox yum repository download file. 
	 * Val.Param3P.frFR:Pour spécifier le chemin de sortie pour le téléchargement. 
	 * Val.Param3P.enUS:For specifying the output path for the downloaded file. 
	 * Val.Param4P.frFR:Le chemin de sortie pour le téléchargement dépôt yum. 
	 * Val.Param4P.enUS:The output path for the downloaded yum repository file. 
	 */   
	protected void _telecharger(Cmd o) {

		o.questionIcone("fas", "play-circle");
		o.setQuestion(telechargerQuestion);
		o.setQuestionCourt(telechargerQuestionCourt);

		o.reponseIcone("fab", "download");
		o.setReponse(telechargerReponse);
		o.setReponseCourt(telechargerReponseCourt);
	}
	public void htmlBodyTelecharger(Cmd o) {
		{ e("p").f();
			{ e("ul").f();
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP1);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP2);
					} g("span");
					{ e("a").a("href", telechargerP3).f();
						sx(telechargerP3);
					} g("a");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP4);
					} g("span");
				} g("li");
				{ e("li").f();
					{ e("span").f();
						sx(telechargerP5);
					} g("span");
				} g("li");
			} g("ul");
		} g("p");
	}
}
