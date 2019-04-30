
import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**  
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/004-comment-installer-centos7
 * ApiUriRechercheEnUSPage: /enUS/course/001/004-how-to-install-centos7
 * PageRechercheFrFRPage: C001L004InstallerCentos7FrFRPage
 * PageRechercheEnUSPage: C001L004InstallerCentos7EnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Comment installer le système d'exploitation pour développer mon site Web ? 
 * H1.enUS: How do I install the operating system to start developing my website? 
 * 
 * H2.frFR: Chaque étape pour installer le système d'exploitation CentOS 7. 
 * H2.enUS: Every step to install the CentOS 7 operating system. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1258
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1173
*/     
public class C001L004InstallerCentos7 extends C001L004InstallerCentos7Gen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L004InstallerCentos7.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L004InstallerCentos7EnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7FrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L004InstallerCentos7EnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L004InstallerCentos7FrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l004.C001L004InstallerCentos7.C001L004InstallerCentos7Vals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L004InstallerCentos7_H1);
		addPageRecherche_frFR(C001L004InstallerCentos7_H2);
		addPageRecherche_frFR(C001L004InstallerCentos7Vals);
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
	 * Val.H3I:fas fa-person-carry
	 * Val.H3Span.frFR:Comment télecharger CentOS 7 ? 
	 * Val.H3Span.enUS:How do I download CentOS 7?
	 * Val.H4I:fas fa-cloud-download-alt
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
	 * Val.PSpan1.frFR:Vous pouvez télécharger le fichier ISO CentOS 7 le plus récent pour installer sur votre ordinateur ici 
	 * Val.PSpan1.enUS:You can download the latest CentOS 7 ISO file to install on your computer here 
	 * Val.PSpan2A:https://www.centos.org/download/
	 * Val.PSpan3.frFR:. Cliquez sur le bouton [ DVD ISO ]. 
	 * Val.PSpan3.frFR:Vous pouvez choisir parmi  l'un des miroirs, vous pourriez en trouver un près de chez vous. 
	 * Val.PSpan3.frFR:Vous pouvez également télécharger le fichier en utilisant la commande wget dans le terminal comme ça. 
	 * Val.PSpan3.enUS:. Click on the [ DVD ISO ] button. 
	 * Val.PSpan3.enUS:You can choose from any of the mirrors, you might find one close to you. 
	 * Val.PSpan3.enUS:You can also download the file using the wget command in the terminal like that. 
	 */  
	protected void _questionTelechargerCentos7(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:fas fa-play-circle
	 * Val.H3Span.frFR:Comment puis-je créer une clé USB avec CentOS 7 ? 
	 * Val.H3Span.enUS:How can I create a USB key with CentOS 7? 
	 * Val.H4I:fas fa-download
	 * Val.H4Span.frFR:Utilizez la commande dd. 
	 * Val.H4Span.enUS:Use the dd command. 
	 * Val.Ol1Li1.frFR:Des que vous avez téléchargé votre image ISO, placez votre clé USB dans un port USB de votre ordinateur. 
	 * Val.Ol1Li1.enUS:Once you have downloaded your ISO image, place your USB key into a USB port on your computer. 
	 * Val.Ol1Li2Span1.frFR:Si vous utilisez actuellement Windows, vous pouvez télécharger un programme « Win32 Disk Imager » pour charger l’image ISO sur une clé USB au bas de cette page 
	 * Val.Ol1Li2Span1.enUS:If you are currently using windows, you can download a program like Win32 Disk Imager to load the ISO image onto a USB key at the bottom of this page 
	 * Val.Ol1Li2A:https://wiki.centos.org/HowTos/InstallFromUSBkey
	 * Val.Ol1Li2Span2.frFR:. 
	 * Val.Ol1Li2Span2.enUS:. 
	 * Val.Ol1Li3.frFR:Si vous êtes déjà sous Linux, je vais vous apprendre à charger CentOS sur une clé USB depuis le terminal qui affiche une barre de progression.
	 * Val.Ol1Li3.frFR:Installez d’abord l’application « pv » requise pour surveiller la progression des données dans un tube. 
	 * Val.Ol1Li3.enUS:If you are on Linux already, I'll teach you a way to load CentOS onto a USB key from the terminal that shows a progress bar. 
	 * Val.Ol1Li3.enUS:First install the prerequisite "pv" application to monitor the progress of data through a pipe. 
	 * Val.Div1H1.frFR:
	 * Val.Div1H1.enUS:Install the pv application. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum
	 * Val.Pre1Span3: install
	 * Val.Pre1Span4: -y
	 * Val.Pre1Span4: pv
	 * Val.Ol2Li1.frFR:La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1.enUS:The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li2.frFR:Ce qui signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.Ol2Li2.enUS:Which stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.Ol2Li3.frFR:Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3.enUS:For installing new yum packages. 
	 * Val.Ol2Li4.frFR:Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li4.enUS:Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li5.frFR:Le nom du paquet de VirtualBox que vous souhaitez installer. 
	 * Val.Ol2Li5.enUS:The package name of VirtualBox you wish to install. 
	 * Val.Div2H1.frFR:
	 * Val.Div2H1.enUS:Find the path to the USB storage device. 
	 * Val.Pre2Span1:lsblk
	 * Val.Ol3Li1.frFR:La commande pour montrer tous les périphériques de stockage en mode bloc sur l'ordinateur. 
	 * Val.Ol3Li1.enUS:The command to list all block storage devices on the computer. 
	 * Val.Div3H1.frFR:
	 * Val.Div3H1.enUS:Write the ISO image to the USB key and watch the progress. 
	 */ 
	protected void _questionCreerUneCleUsb(PageHtml o) {
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
	 * Val.TableTr01Td1I:fas fa-question
	 * Val.TableTr01Td2.frFR:Questions
	 * Val.TableTr01Td2.enUS:Questions
	 * Val.TableTr01Td3I:fas fa-bullhorn
	 * Val.TableTr01Td4.frFR:Reponses
	 * Val.TableTr01Td4.enUS:Answers
	 * 
	 * Val.TableTr02Td1I:fas fa-eraser
	 * Val.TableTr02Td2.frFR:Linux va-t-il détruire mon système d'exploitation ? 
	 * Val.TableTr02Td2.enUS:Will Linux destroy my operating system? 
	 * Val.TableTr02Td3Span1I:fab fa-microsoft
	 * Val.TableTr02Td3Span2I:fab fa-apple
	 * Val.TableTr02Td3Span3I:fab fa-linux
	 * Val.TableTr02Td4.frFR:La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. 
	 * Val.TableTr02Td4.enUS:Virtualization can run Linux on any operating system. 
	 * 
	 * Val.TableTr03Td1I:fas fa-person-carry
	 * Val.TableTr03Td2.frFR:Comment installer VirtualBox ? 
	 * Val.TableTr03Td2.enUS:How do I install VirtualBox? 
	 * Val.TableTr03Td3I:fas fa-cloud-download-alt
	 * Val.TableTr03Td4.frFR:Téléchargez-le depuis virtualbox.org
	 * Val.TableTr03Td4.enUS:Download it from virtualbox.org
	 * 
	 * Val.TableTr04Td1I:fas fa-play-circle
	 * Val.TableTr04Td2.frFR:Préparer CentOS 7 pour installer VirtualBox
	 * Val.TableTr04Td2.enUS:Prepare CentOS 7 to install VirtualBox
	 * Val.TableTr04Td3I:fas fa-download
	 * Val.TableTr04Td4.frFR:Installer le dépot yum virtualbox
	 * Val.TableTr04Td4.enUS:Install the virtualbox yum repo
	 * 
	 * Val.TableTr05Td1I:fas fa-box-check
	 * Val.TableTr05Td2.frFR:Installer le dépôt yum virtualbox
	 * Val.TableTr05Td2.enUS:Install the virtualbox yum repository
	 * Val.TableTr05Td3I:fas fa-person-dolly
	 * Val.TableTr05Td4.frFR:Mettre virtualbox.repo dans /etc/yum.repos.d/
	 * Val.TableTr05Td4.enUS:Put virtualbox.repo in /etc/yum.repos.d/
	 * 
	 * Val.TableTr06Td1I:fas fa-question
	 * Val.TableTr06Td2.frFR:Quel est le nom du paquet VirtualBox ? 
	 * Val.TableTr06Td2.enUS:What is the VirtualBox package called? 
	 * Val.TableTr06Td3I:fas fa-search
	 * Val.TableTr06Td4.frFR:Rechercher « virtualbox » dans yum
	 * Val.TableTr06Td4.enUS:Search for "virtualbox" in yum
	 * 
	 * Val.TableTr07Td1I:fas fa-box
	 * Val.TableTr07Td2.frFR:Installer VirtualBox
	 * Val.TableTr07Td2.enUS:Installing VirtualBox
	 * Val.TableTr07Td3I:fas fa-box-full
	 * Val.TableTr07Td4.frFR:Installer le paquet avec yum
	 * Val.TableTr07Td4.enUS:Install the package with yum
	 * 
	 * Val.TableTr08Td1I:fas fa-clipboard-list
	 * Val.TableTr08Td2.frFR:Comment mettre un système d'exploitation sur une machine virtuelle
	 * Val.TableTr08Td2.enUS:How to put an operating system on a virtual machine
	 * Val.TableTr08Td3I:fas fa-arrow-alt-to-bottom
	 * Val.TableTr08Td4.frFR:Télécharger un fichier ISO
	 * Val.TableTr08Td4.enUS:Download an ISO file
	 * 
	 * Val.TableTr09Td1I:fas fa-clipboard-check
	 * Val.TableTr09Td2.frFR:Vérifier un téléchargement ISO
	 * Val.TableTr09Td2.enUS:Verify ISO download
	 * Val.TableTr09Td3I:fas fa-box-check
	 * Val.TableTr09Td4.frFR:Vérifier le sha256sum
	 * Val.TableTr09Td4.enUS:Check the sha256sum
	 * 
	 * Val.TableTr10Td1I:fas fa-plus-square
	 * Val.TableTr10Td2.frFR:Comment créer la machine virtuelle ?
	 * Val.TableTr10Td2.enUS:How do I create the virtual machine?
	 * Val.TableTr10Td3I:fas fa-window
	 * Val.TableTr10Td4.frFR:Ouvrir VirtualBox et cliquer New
	 * Val.TableTr10Td4.enUS:Open up VirtualBox and click New
	 * 
	 * Val.TableTr11Td1I:fas fa-exclamation-circle
	 * Val.TableTr11Td2.frFR:Erreur Kernel driver not installed
	 * Val.TableTr11Td2.enUS:Kernel driver not installed error
	 * Val.TableTr11Td3I:fas fa-clipboard-list
	 * Val.TableTr11Td4.frFR:Installez les prérequis du kernel
	 * Val.TableTr11Td4.enUS:Install kernel prerequisites
	 */   
	protected void _recapituler3(PageHtml o) {      
	}
}
