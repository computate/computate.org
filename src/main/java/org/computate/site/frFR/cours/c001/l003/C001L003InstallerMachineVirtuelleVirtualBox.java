package org.computate.site.frFR.cours.c001.l003;

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.Cmd;
import org.computate.site.frFR.page.parti.PageHtml;
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
 * ImageHauteur.frFR: 542
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 457
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
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-eraser
	 * Val.H3Span.frFR:Est-t-il possible d'essayer Linux sans écraser mon système d'exploitation ? 
	 * Val.H3Span.enUS:Is it possible to try Linux without destroying my operating system? 
	 * Val.H4I:fab fa-linux
	 * Val.H4Span.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.H4Span.enUS:Virtualization can run Linux on any operating system. 
	 * Val.PDiv.frFR:Grâce à la virtualisation, c'est simple à essayer les systèmes d'exploitation sur votre propre ordinateur ! 
	 * Val.PDiv.frFR:La virtualisation vous permet de démarrer des machines virtuelles. 
	 * Val.PDiv.frFR:Les machines virtuelles sont des systèmes d'exploitation entiers s'exécutant sous votre propre système d'exploitation via un logiciel. 
	 * Val.PDiv.frFR:La virtualisation est gratuite, grâce à des nombreux logiciels fantastiques ! 
	 * Val.PDiv.frFR:Pour Linux, je recommande Libvirt pour plus de puissance, mais pour une solution multi-plateforme, nous allons utiliser VirtualBox dans cette leçon. 
	 * Val.PDiv.frFR:Je vais vous apprendre comment faire fonctionner une machine virtuelle CentOS 7 sur votre système. 
	 * Val.PDiv.enUS:Thanks to virtualization, trying out operating systems on your own computer is simple! 
	 * Val.PDiv.enUS:Virtualization allows you to run virtual machines. 
	 * Val.PDiv.enUS:Virtual machines are entire operating systems running under your own operating system through software. 
	 * Val.PDiv.enUS:Virtualization is free, thanks to many good software packages! 
	 * Val.PDiv.enUS:For Linux I recommend Libvirt for more power, but for a cross-platform solution, we will be using VirtualBox in this lesson. 
	 * Val.PDiv.enUS:I'll teach you how to get a CentOS 7 virtual machine running on your system. 
	 */  
	protected void _ecraser(PageHtml o) {      
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-person-carry
	 * Val.H3Span.frFR:Comment installer VirtualBox pour la virtualisation ? 
	 * Val.H3Span.enUS:How do I install VirtualBox for virtualization? 
	 * Val.H4I:fas fa-cloud-download-alt
	 * Val.H4Span.frFR:Téléchargez-le simplement depuis virtualbox.org. 
	 * Val.H4Span.enUS:Simply download it from virtualbox.org. 
	 * Val.POlLi1Span.frFR:VirtualBox est facile à télécharger et à installer. 
	 * Val.POlLi1Span.enUS:VirtualBox is easy to download and install. 
	 * Val.POlLi2Span.frFR:Visitez cette URL : 
	 * Val.POlLi2Span.enUS:Visit this url: 
	 * Val.POlLi2A.frFR:https://www.virtualbox.org/wiki/Downloads
	 * Val.POlLi2A.enUS:https://www.virtualbox.org/wiki/Downloads
	 * Val.POlLi3Span.frFR:Vous pouvez le télécharger sur un hôte Windows, un hôte OS X, un hôte Linux ou Solaris. 
	 * Val.POlLi3Span.enUS:You can download it on a Windows host, an OS X host, a Linux or Solaris host. 
	 * Val.POlLi4Span.frFR:Parce que j'utilise CentOS 7, qui est similaire à RHEL, j'utiliserai les instructions RHEL tout en bas de la page. 
	 * Val.POlLi4Span.enUS:Because I am running CentOS 7, which is similar to RHEL, I will use the RHEL instructions at the very bottom of the page. 
	 */  
	protected void _commentInstaller(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-play-circle
	 * Val.H3Span.frFR:Comment puis-je préparer CentOS 7 pour installer VirtualBox ? 
	 * Val.H3Span.enUS:How can I prepare CentOS 7 to install VirtualBox? 
	 * Val.H4I:fas fa-download
	 * Val.H4Span.frFR:Installer le dépot yum virtualbox
	 * Val.H4Span.enUS:Install the virtualbox yum repo
	 * Val.PreSpan1:wget
	 * Val.PreSpan2: https://download.virtualbox.org/virtualbox/rpm/el/virtualbox.repo
	 * Val.PreSpan3: -O
	 * Val.PreSpan4: /tmp/virtualbox.repo
	 * Val.OlLi1.frFR:La commande pour télécharger des fichiers. 
	 * Val.OlLi1.enUS:The command to download files. 
	 * Val.OlLi2.frFR:L'URL vers le téléchargement dépôt yum VirtualBox. 
	 * Val.OlLi2.enUS:The URL to the VirtualBox yum repository download file. 
	 * Val.OlLi3.frFR:Pour spécifier le chemin de sortie pour le téléchargement. 
	 * Val.OlLi3.enUS:For specifying the output path for the downloaded file. 
	 * Val.OlLi4.frFR:Le chemin de sortie pour le téléchargement dépôt yum. 
	 * Val.OlLi4.enUS:The output path for the downloaded yum repository file. 
	 */ 
	protected void _telecharger(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-box-check
	 * Val.H3Span.frFR:Comment puis-je installer le dépôt yum virtualbox ? 
	 * Val.H3Span.enUS:How can I install the virtualbox yum repository? 
	 * Val.H4I:fas fa-person-dolly
	 * Val.H4Span.frFR:Mettre virtualbox.repo dans /etc/yum.repos.d/. 
	 * Val.H4Span.enUS:Put virtualbox.repo in /etc/yum.repos.d/. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: mv
	 * Val.PreSpan3: /tmp/virtualbox.repo
	 * Val.PreSpan4: /etc/yum.repos.d/
	 * Val.OlLi1.frFR:La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.OlLi1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.OlLi1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.OlLi1.enUS:The command to install yum repositories begins with the command sudo. 
	 * Val.OlLi1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.OlLi1.enUS:Installing yum repositories always requires root privileges. 
	 * Val.OlLi2.frFR:Pour déplacer des fichiers vers de nouveaux emplacements dans le système de fichiers. 
	 * Val.OlLi2.enUS:For moving files to new locations in the filesystem. 
	 * Val.OlLi3.frFR:Le chemin vers le téléchargement dépôt yum. 
	 * Val.OlLi3.enUS:The path to the downloaded yum repository file. 
	 * Val.OlLi4.frFR:Le répertoire pour les dépôts yum configurés. 
	 * Val.OlLi4.enUS:The directory for configured yum repositories. 
	 */ 
	protected void _deplacerDepot(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-question
	 * Val.H3Span.frFR:Comment puis-je installer le dépôt yum virtualbox ? 
	 * Val.H3Span.enUS:How can I install the virtualbox yum repository? 
	 * Val.H4I:fas fa-search
	 * Val.H4Span.frFR:Mettre virtualbox.repo dans /etc/yum.repos.d/. 
	 * Val.H4Span.enUS:Put virtualbox.repo in /etc/yum.repos.d/. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum
	 * Val.PreSpan3: search
	 * Val.PreSpan4: virtualbox
	 * Val.OlLi1.frFR:sudo
	 * Val.OlLi1.enUS:sudo
	 * Val.OlLi2.frFR:Ce qui signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.OlLi2.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.OlLi2.enUS:Which stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.OlLi2.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.OlLi3.frFR:Pour rechercher les paquets yum disponibles. 
	 * Val.OlLi3.enUS:For searching for available yum packages. 
	 * Val.OlLi4.frFR:Une phrase à rechercher dans les dépôts yum, comme « virtualbox ». 
	 * Val.OlLi4.enUS:A phrase to search for in the yum repositories, like "virtualbox". 
	 */ 
	protected void _yumSearch(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-box
	 * Val.H3Span.frFR:Comment puis-je maintenant installer l'application VirtualBox ? 
	 * Val.H3Span.enUS:How do I now install the VirtualBox application? 
	 * Val.H4I:fas fa-box-full
	 * Val.H4Span.frFR:Installer le paquet avec yum. 
	 * Val.H4Span.enUS:Install the package with yum. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum
	 * Val.PreSpan3: install
	 * Val.PreSpan4: -y
	 * Val.PreSpan5: VirtualBox-5.2
	 * Val.OlLi1.frFR:sudo
	 * Val.OlLi1.enUS:sudo
	 * Val.OlLi2.frFR:yum
	 * Val.OlLi2.enUS:yum
	 * Val.OlLi3.frFR:Pour installer des nouveaux paquets yum. 
	 * Val.OlLi3.enUS:For installing new yum packages. 
	 * Val.OlLi4.frFR:Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.OlLi4.enUS:Suppress messages asking to confirm if you want to install the software. 
	 * Val.OlLi5.frFR:Le nom du paquet de VirtualBox que vous souhaitez installer. 
	 * Val.OlLi5.frFR:Vous pouvez utiliser le nom du paquet avant le « .x86_64 » de la recherche yum que vous avez effectuée précédemment. 
	 * Val.OlLi5.frFR:Pour moi c'est « VirtualBox-5.2 ». 
	 * Val.OlLi5.enUS:The package name of VirtualBox you wish to install. 
	 * Val.OlLi5.enUS:You can use the package name before the ".x86_64" from the yum search you did earlier. 
	 * Val.OlLi5.enUS:For me it is "VirtualBox-5.2". 
	 */ 
	protected void _yumInstallPaquets(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-clipboard-list
	 * Val.H3Span.frFR:Comment mettre un système d'exploitation sur une machine virtuelle VirtualBox ? 
	 * Val.H3Span.enUS:How do I put an operating system on a VirtualBox virtual machine? 
	 * Val.H4I:fas fa-arrow-alt-to-bottom
	 * Val.H4Span.frFR:Télécharger un fichier ISO. 
	 * Val.H4Span.enUS:Download an ISO file. 
	 * Val.PreSpan1:wget
	 * Val.PreSpan2: http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso
	 * Val.PreSpan3: -O
	 * Val.PreSpan4: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * Val.OlLi1:wget
	 * Val.OlLi2.frFR:L'URL vers le téléchargement ISO de CentOS 7. 
	 * Val.OlLi2.enUS:The URL to the CentOS 7 ISO file to download. 
	 * Val.OlLi3:-O
	 * Val.OlLi4.frFR:Le chemin de sortie pour le téléchargement ISO CentOS 7. 
	 * Val.OlLi4.enUS:The output path for the downloaded CentOS 7 ISO file. 
	 * Val.PSpan1.frFR:Vous pouvez télécharger le fichier ISO CentOS 7 le plus récent pour installer sur une nouvelle machine virtuelle ici 
	 * Val.PSpan1.enUS:You can download the latest CentOS 7 ISO file to install on a new virtual machine here 
	 * Val.PSpan2A:https://www.centos.org/download/
	 * Val.PSpan3.frFR:. Cliquez sur le bouton [ DVD ISO ]. 
	 * Val.PSpan3.frFR:Vous pouvez choisir parmi  l'un des miroirs, vous pourriez en trouver un près de chez vous. 
	 * Val.PSpan3.frFR:Vous pouvez également télécharger le fichier en utilisant la commande wget dans le terminal comme ça. 
	 * Val.PSpan3.enUS:. Click on the [ DVD ISO ] button. 
	 * Val.PSpan3.enUS:You can choose from any of the mirrors, you might find one close to you. 
	 * Val.PSpan3.enUS:You can also download the file using the wget command in the terminal like that. 
	 */ 
	protected void _telechargerIso(PageHtml o) {
	}

	/**
	 * Val.H3.frFR:À récapituler : 
	 * Val.H3.enUS:To review: 
	 */
	protected void _recapituler1(PageHtml o) {      
	}

	/**
	 * Val.TableTr1Td1.frFR:Mardi 
	 * Val.TableTr1Td1.enUS:Tuesday 
	 * Val.TableTr1Td2I:fab fa-linux
	 * Val.TableTr1Td3I:fas fa-network-wired
	 * Val.TableTr1Td4I:fas fa-pen-nib
	 * Val.TableTr2Td1.frFR:23 Avril 2019
	 * Val.TableTr2Td1.enUS:April 23 2019
	 * Val.TableTr2Td2.frFR:Comment essayer CentOS 7
	 * Val.TableTr2Td2.enUS:How to try CentOS 7
	 * Val.TableTr2Td3.frFR:Sur une machine virtuelle
	 * Val.TableTr2Td3.enUS:On a virtual machine
	 * Val.TableTr2Td4.frFR:Par Christophe Tate
	 * Val.TableTr2Td4.enUS:By Christopher Tate
	 */  
	protected void _recapituler2(PageHtml o) {      
	}

	/**
	 * 
	 * Val.TableTr1Td1I:fas fa-question
	 * Val.TableTr1Td2.frFR:Questions
	 * Val.TableTr1Td2.enUS:Questions
	 * Val.TableTr1Td3I:fas fa-bullhorn
	 * Val.TableTr1Td4.frFR:Reponses
	 * Val.TableTr1Td4.enUS:Answers
	 * 
	 * Val.TableTr2Td1I:fas fa-eraser
	 * Val.TableTr2Td2.frFR:Linux va-t-il détruire mon système d'exploitation ? 
	 * Val.TableTr2Td2.enUS:Will Linux destroy my operating system? 
	 * Val.TableTr2Td3I:fab fa-linux
	 * Val.TableTr2Td4.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.TableTr2Td4.enUS:Virtualization can run Linux on any operating system. 
	 * 
	 * Val.TableTr3Td1I:fas fa-person-carry
	 * Val.TableTr3Td2.frFR:Comment installer VirtualBox ? 
	 * Val.TableTr3Td2.enUS:How do I install VirtualBox? 
	 * Val.TableTr3Td3I:fas fa-cloud-download-alt
	 * Val.TableTr3Td4.frFR:Téléchargez-le depuis virtualbox.org
	 * Val.TableTr3Td4.enUS:Download it from virtualbox.org
	 * 
	 * Val.TableTr4Td1I:fas fa-play-circle
	 * Val.TableTr4Td2.frFR:Préparer CentOS 7 pour installer VirtualBox
	 * Val.TableTr4Td2.enUS:Prepare CentOS 7 to install VirtualBox
	 * Val.TableTr4Td3I:fas fa-download
	 * Val.TableTr4Td4.frFR:Installer le dépot yum virtualbox
	 * Val.TableTr4Td4.enUS:Install the virtualbox yum repo
	 */  
	protected void _recapituler3(PageHtml o) {      
	}
}
