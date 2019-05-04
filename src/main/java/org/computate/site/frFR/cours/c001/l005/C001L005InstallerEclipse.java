package org.computate.site.frFR.cours.c001.l005;

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**  
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/004-comment-installer-eclipse
 * ApiUriRechercheEnUSPage: /enUS/course/001/004-how-to-install-eclipse
 * PageRechercheFrFRPage: C001L005InstallerEclipseFrFRPage
 * PageRechercheEnUSPage: C001L005InstallerEclipseEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Comment installer des outils de développement pour développer mon site web ?
 * H1.enUS: How do I install development tools to develop my website? 
 * 
 * H2.frFR: Comment installer l'IDE Eclipse de manière open source. 
 * H2.enUS: How to install Eclipse IDE the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1749
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1479
*/    
public class C001L005InstallerEclipse extends C001L005InstallerEclipseGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L005InstallerEclipse.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipse_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipse_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerEclipseEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipseFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerEclipseEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerEclipseFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipse_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerEclipse.C001L005InstallerEclipseVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L005InstallerEclipse_H1);
		addPageRecherche_frFR(C001L005InstallerEclipse_H2);
		addPageRecherche_frFR(C001L005InstallerEclipseVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à commencer développer votre site web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you start developing your website the open source way. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-person-carry
	 * Val.H3Span.frFR:Comment télecharger CentOS 7 ? 
	 * Val.H3Span.enUS:How do I download CentOS 7?
	 * Val.H4I:far fa-cloud-download-alt
	 * Val.H4Span.frFR:Télécharger un fichier ISO. 
	 * Val.H4Span.enUS:Download an ISO file. 
	 * Val.PreSpan1:wget
	 * Val.PreSpan2: http://mirrors.xmission.com/centos/7.6.1810/isos/x86_64/CentOS-7-x86_64-DVD-1810.iso
	 * Val.PreSpan3: -O
	 * Val.PreSpan4: ~/Downloads/CentOS-7-x86_64-DVD-1810.iso
	 * 
	 * Val.OlLi1.frFR:wget : La commande pour télécharger des fichiers. 
	 * Val.OlLi1.enUS:wget: The command to download files. 
	 * Val.OlLi2.frFR:L'URL vers le téléchargement ISO de CentOS 7. 
	 * Val.OlLi2.enUS:The URL to the CentOS 7 ISO file to download. 
	 * Val.OlLi3.frFR:-O : Pour spécifier le chemin de sortie pour le téléchargement. 
	 * Val.OlLi3.enUS:-O: For specifying the output path for the downloaded file. 
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
	 * Val.H3.frFR:À récapituler : 
	 * Val.H3.enUS:To review: 
	 */
	protected void _recapituler1(PageHtml o) {      
	}

	/**
	 * Val.TableTr1Td1.frFR:Mardi 
	 * Val.TableTr1Td1.enUS:Tuesday 
	 * Val.TableTr1Td2I:fab fa-linux
	 * Val.TableTr1Td3I:far fa-network-wired
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:30 Avril 2019
	 * Val.TableTr2Td1.enUS:April 30 2019
	 * Val.TableTr2Td2.frFR:Comment installer le système d'exploitation pour développer mon site Web ? 
	 * Val.TableTr2Td2.enUS:How do I install the operating system to start developing my website? 
	 * Val.TableTr2Td3.frFR:Chaque étape pour installer le système d'exploitation CentOS 7. 
	 * Val.TableTr2Td3.enUS:Every step to install the CentOS 7 operating system. 
	 * Val.TableTr2Td4.frFR:Par Christophe Tate
	 * Val.TableTr2Td4.enUS:By Christopher Tate
	 */  
	protected void _recapituler2(PageHtml o) {    
	}

	/**
	 * 
	 * Val.TableTr01Td1I:far fa-question
	 * Val.TableTr01Td2.frFR:Questions
	 * Val.TableTr01Td2.enUS:Questions
	 * Val.TableTr01Td3I:far fa-bullhorn
	 * Val.TableTr01Td4.frFR:Reponses
	 * Val.TableTr01Td4.enUS:Answers
	 * 
	 * Val.TableTr02Td1I:far fa-person-carry
	 * Val.TableTr02Td2.frFR:Comment télecharger CentOS 7 ? 
	 * Val.TableTr02Td2.enUS:How do I download CentOS 7? 
	 * Val.TableTr02Td3Span1I:far fa-cloud-download-alt
	 * Val.TableTr02Td4.frFR:Télécharger un fichier ISO. 
	 * Val.TableTr02Td4.enUS:Download an ISO file. 
	 * 
	 * Val.TableTr03Td1I:fab fa-usb
	 * Val.TableTr03Td2.frFR:Comment puis-je créer une clé USB avec CentOS 7 ? 
	 * Val.TableTr03Td2.enUS:How can I create a USB key with CentOS 7? 
	 * Val.TableTr03Td3I:far fa-compact-disc
	 * Val.TableTr03Td4.frFR:Utilizez la commande dd. 
	 * Val.TableTr03Td4.enUS:Use the dd command. 
	 * 
	 * Val.TableTr04Td1I:far fa-play-circle
	 * Val.TableTr04Td2.frFR:Lorsque je redémarre avec la clé USB, quel mode de démarrage choisir? 
	 * Val.TableTr04Td2.enUS:When I reboot with the USB key, which boot mode do I choose? 
	 * Val.TableTr04Td3Span1I:fab fa-windows
	 * Val.TableTr04Td3Span1I:fab fa-centos
	 * Val.TableTr04Td4.frFR:Évitez de démarrer en mode de démarrage UEFI. 
	 * Val.TableTr04Td4.enUS:Avoid booting in UEFI boot mode. 
	 * 
	 * Val.TableTr05Td1I:fas fa-flag-alt
	 * Val.TableTr05Td2.frFR:Quelle langue j'utilise pendant le processus d'installation? 
	 * Val.TableTr05Td2.enUS:What language would I use during the install process? 
	 * Val.TableTr05Td3I:far fa-language
	 * Val.TableTr05Td4.frFR:Choisissez la langue avec laquelle vous êtes à l'aise. 
	 * Val.TableTr05Td4.enUS:Choose the language you are comfortable with. 
	 * 
	 * Val.TableTr06Td1I:fas fa-clock
	 * Val.TableTr06Td2.frFR:Comment configurer la date et l'heure d'une installation de CentOS 7 ? 
	 * Val.TableTr06Td2.enUS:How do I setup the date and time for a CentOS 7 installation? 
	 * Val.TableTr06Td3I:fas fa-city
	 * Val.TableTr06Td4.frFR:Choisissez la grande ville près de chez vous. 
	 * Val.TableTr06Td4.enUS:Choose the big city near you. 
	 * 
	 * Val.TableTr07Td1I:fas fa-network-wired
	 * Val.TableTr07Td2.frFR:Comment configurer le réseau et le nom d'hôte ? 
	 * Val.TableTr07Td2.enUS:How do I setup the network and host name? 
	 * Val.TableTr07Td3I:fas fa-ethernet
	 * Val.TableTr07Td4.frFR:Choisissez un nom unique sur votre réseau et branchez votre câble Ethernet. 
	 * Val.TableTr07Td4.enUS:Pick a unique name on your network and plug in your Ethernet cable. 
	 * 
	 * Val.TableTr08Td1I:fas fa-save
	 * Val.TableTr08Td2.frFR:Que dois-je choisir pour la sélection de logiciel dans une installation CentOS 7 ? 
	 * Val.TableTr08Td2.enUS:What should I choose for the software selection in a CentOS 7 installation? 
	 * Val.TableTr08Td3I:fas fa-browser
	 * Val.TableTr08Td4.frFR:Assurez-vous de choisir un environnement de bureau. 
	 * Val.TableTr08Td4.enUS:Make sure to pick a desktop environment. 
	 * 
	 * Val.TableTr09Td1I:fas fa-hdd
	 * Val.TableTr09Td2.frFR:Comment configurer le disque pour la destination d'installation ? 
	 * Val.TableTr09Td2.enUS:How do I setup the disk for the installation destination? 
	 * Val.TableTr09Td3I:fas fa-pallet-alt
	 * Val.TableTr09Td4.frFR:Configurez votre propre partitionnement. 
	 * Val.TableTr09Td4.enUS:Configure your own partitioning. 
	 * 
	 * Val.TableTr10Td1I:fas fa-exclamation-triangle
	 * Val.TableTr10Td2.frFR:Suis-je prêt à appuyer sur le bouton [ Begin Installation ] ? 
	 * Val.TableTr10Td2.enUS:Am I ready to push the [ Begin Installation ] button? 
	 * Val.TableTr10Td3I:fab fa-centos
	 * Val.TableTr10Td4.frFR:Bienvenu au monde merveilleux de CentOS 7. 
	 * Val.TableTr10Td4.enUS:Welcome the wonderful world of CentOS 7. 
	 * 
	 * Val.TableTr11Td1I:fas fa-user-cog
	 * Val.TableTr11Td2.frFR:Ai-je besoin d'un mot de passe root et d'un mot de passe utilisateur ? 
	 * Val.TableTr11Td2.enUS:Do I need a root password and a user password? 
	 * Val.TableTr11Td3I:fas fa-lock-alt
	 * Val.TableTr11Td4.frFR:Choisisez un mot de passe root fort. 
	 * Val.TableTr11Td4.enUS:Choose a string root password. 
	 * 
	 * Val.TableTr12Td1I:fas fa-fast-forward
	 * Val.TableTr12Td2.frFR:Comment terminer l'installation de CentOS 7 ? 
	 * Val.TableTr12Td2.enUS:How do I finish the install of CentOS 7? 
	 * Val.TableTr12Td3I:fab fa-linux
	 * Val.TableTr12Td4.frFR:Quelques étapes supplémentaires pour profiter de votre nouvel ordinateur. 
	 * Val.TableTr12Td4.enUS:A few more steps to enjoy your new computer. 
	 */   
	protected void _recapituler3(PageHtml o) {      
	}
}
