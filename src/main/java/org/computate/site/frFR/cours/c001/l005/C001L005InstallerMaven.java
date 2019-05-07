package org.computate.site.frFR.cours.c001.l005;

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;

/**  
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/004-comment-installer-la-derniere-version-de-maven
 * ApiUriRechercheEnUSPage: /enUS/course/001/004-how-to-install-the-latest-version-of-maven
 * PageRechercheFrFRPage: C001L005InstallerMavenFrFRPage
 * PageRechercheEnUSPage: C001L005InstallerMavenEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Comment installer la dernière version de maven ?
 * H1.enUS: How do I install the latest version of maven. 
 * 
 * H2.frFR: Installer maven à partir du code source. 
 * H2.enUS: Install maven from the source code. 
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
public class C001L005InstallerMaven extends C001L005InstallerMavenGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L005InstallerMaven.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMaven_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMaven_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerMavenEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMavenFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L005InstallerMavenEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L005InstallerMavenFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMaven_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l005.C001L005InstallerMaven.C001L005InstallerMavenVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L005InstallerMaven_H1);
		addPageRecherche_frFR(C001L005InstallerMaven_H2);
		addPageRecherche_frFR(C001L005InstallerMavenVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:La plupart des entreprises utilisent aujourd'hui Java pour créer leurs applications et microservices, y compris les gouvernements, les banques, la comptabilité et les entreprises. 
	 * Val.P.frFR:La création d’applications Java commence par l’installation de Maven. 
	 * Val.P.frFR:Je vous aiderai à installer la version la plus récente de Maven pour développer votre site Web de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:Most enterprises use Java today to build their applications and microservices, including governments, banks, accounting and businesses. 
	 * Val.P.enUS:Building java applications begins with installing Maven. 
	 * Val.P.enUS:I will help you install the most recent version of Maven to develop your website the open source way. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment installer les dépendences pour Maven ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Maven? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum-builddep
	 * Val.PreSpan3: -y
	 * Val.PreSpan4: maven
	 * 
	 * Val.Ol2Li1.frFR:sudo: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1.enUS:sudo: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li2.frFR:yum Signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2.frFR:yum-builddep installe les dépendances manquantes pour la construction d'un paquet RPM. 
	 * Val.Ol2Li2.enUS:yum Stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2.enUS:yum-builddep installs missing dependencies for building an RPM package. 
	 * Val.Ol2Li3.frFR:-y: Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li3.enUS:-y: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li4.frFR:maven: Le nom du paquet pour lequel vous vous souhaitez installer les dépendences. 
	 * Val.Ol2Li4.enUS:maven: The package name you wish to install the dependencies for. 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment installer les dépendences pour Maven ? 
	 * Val.H3Span.enUS:How do I install the dependencies for Maven? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum-builddep
	 * Val.PreSpan3: -y
	 * Val.PreSpan4: maven
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:yum
	 * Val.Ol2Li3.frFR:install : Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3.enUS:install: For installing new yum packages. 
	 * Val.Ol2Li4:-y
	 * Val.Ol2Li5.frFR:pv: Le nom du paquet que vous souhaitez installer. 
	 * Val.Ol2Li5.enUS:pv: The package name you wish to install. 
	 */  
	protected void _questionInstallerAncien(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Où est-ce que je place le code source Maven ? 
	 * Val.H3Span.enUS:Where do I put the Maven source code? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Créez un répertoire maven dans /usr/local/src. 
	 * Val.H4Span.enUS:Create a maven directory in /usr/local/src. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: mkdir
	 * Val.PreSpan4: /usr/local/src/maven
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:mkdir
	 * Val.Ol2Li3.frFR:/usr/local est un endroit pour des logiciels supplémentaires que vous installez sans le gestionnaire de paquets. 
	 * Val.Ol2Li3.frFR:/usr/local/src est un bon endroit pour cloner vos référentiels de logiciels open source. 
	 * Val.Ol2Li3.enUS:/usr/local is a place for extra software that you install without the package manager. 
	 * Val.Ol2Li3.enUS:/usr/local/src is a good place to clone your open source software repositories. 
	 */  
	protected void _questionMkdirSrc(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Où puis-je installer Maven ? 
	 * Val.H3Span.enUS:Where do I install Maven? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:C
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: yum-builddep
	 * Val.PreSpan3: -y
	 * Val.PreSpan4: maven
	 * 
	 * Val.Ol2Li1.frFR:sudo: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:yum
	 * Val.Ol2Li3.frFR:install : Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3.enUS:install: For installing new yum packages. 
	 * Val.Ol2Li4:-y
	 * Val.Ol2Li5.frFR:pv: Le nom du paquet que vous souhaitez installer. 
	 * Val.Ol2Li5.enUS:pv: The package name you wish to install. 
	 */  
	protected void _questionMkdirMaven(PageHtml o) {
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
