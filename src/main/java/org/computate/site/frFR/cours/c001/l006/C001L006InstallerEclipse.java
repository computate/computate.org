package org.computate.site.frFR.cours.c001.l006;

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
 * PageRechercheFrFRPage: C001L006InstallerEclipseFrFRPage
 * PageRechercheEnUSPage: C001L006InstallerEclipseEnUSPage
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
public class C001L006InstallerEclipse extends C001L006InstallerEclipseGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(4);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L006InstallerEclipse.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipse_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipse_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L006InstallerEclipseEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipseFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L006InstallerEclipseEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L006InstallerEclipseFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipse_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l006.C001L006InstallerEclipse.C001L006InstallerEclipseVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L006InstallerEclipse_H1);
		addPageRecherche_frFR(C001L006InstallerEclipse_H2);
		addPageRecherche_frFR(C001L006InstallerEclipseVals);
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
	 * Val.TableTr02Td1I:far fa-conveyor-belt-alt
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour Maven ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for Maven? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-map-point
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source Maven ? 
	 * Val.TableTr03Td2.enUS:Where do I put the Maven source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire maven dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a maven directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-map-point
	 * Val.TableTr04Td2.frFR:Où puis-je installer Maven ? 
	 * Val.TableTr04Td2.enUS:Where do I install Maven? 
	 * Val.TableTr04Td3Span1I:far fa-folder-tree
	 * Val.TableTr04Td4.frFR:Créez un répertoire maven dans /opt. 
	 * Val.TableTr04Td4.enUS:Create a maven directory in /opt. 
	 * 
	 * Val.TableTr05Td1I:far fa-cloud-download
	 * Val.TableTr05Td2.frFR:Comment télécharger le code source de maven ? 
	 * Val.TableTr05Td2.enUS:How do I download the maven source code? 
	 * Val.TableTr05Td3I:fab fa-git
	 * Val.TableTr05Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr05Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr06Td1I:far fa-code-branch
	 * Val.TableTr06Td2.frFR:Comment choisir une version récente de Maven ? 
	 * Val.TableTr06Td2.enUS:How do I pick a recent version of Maven? 
	 * Val.TableTr06Td3I:far fa-tag
	 * Val.TableTr06Td4.frFR:Listez toutes les tags du référentiel git. 
	 * Val.TableTr06Td4.enUS:List all the tags in the git repository. 
	 * 
	 * Val.TableTr07Td1I:far fa-code-merge
	 * Val.TableTr07Td2.frFR:Comment changer de version du code source de maven ? 
	 * Val.TableTr07Td2.enUS:How do I switch versions of the maven source code? 
	 * Val.TableTr07Td3I:far fa-code-commit
	 * Val.TableTr07Td4.frFR:Checkout la tag git. 
	 * Val.TableTr07Td4.enUS:Checkout the git tag. 
	 * 
	 * Val.TableTr08Td1I:far fa-tools
	 * Val.TableTr08Td2.frFR:Comment contruire le code source de maven ? 
	 * Val.TableTr08Td2.enUS:How do I build the maven source code? 
	 * Val.TableTr08Td3I:far fa-terminal
	 * Val.TableTr08Td4.frFR:Construisez Maven avec la commande mvn. 
	 * Val.TableTr08Td4.enUS:Build Maven with the mvn command. 
	 * 
	 * Val.TableTr09Td1I:far fa-question
	 * Val.TableTr09Td2.frFR:Mais pourquoi installons-nous Maven pour installer la dernière version de Maven ? 
	 * Val.TableTr09Td2.enUS:But why are we installing Maven to install the latest Maven? 
	 * Val.TableTr09Td3I:far fa-flushed
	 * Val.TableTr09Td4.frFR:Un programme qui nécessite de se construire. 
	 * Val.TableTr09Td4.enUS:A program that requires itself to build itself. 
	 * 
	 * Val.TableTr10Td1I:far fa-mind-share
	 * Val.TableTr10Td2.frFR:Comment changer la commande mvn par défaut sur le système ? 
	 * Val.TableTr10Td2.enUS:How do I change the default mvn command on the system? 
	 * Val.TableTr10Td3I:far fa-link
	 * Val.TableTr10Td4.frFR:Sauvegardez l'original et faites un lien symbolique. 
	 * Val.TableTr10Td4.enUS:Backup the original and make a symbolic link. 
	 */   
	protected void _recapituler3(PageHtml o) {      
	}
}
