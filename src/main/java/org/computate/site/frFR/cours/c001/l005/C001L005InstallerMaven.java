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
 * Description.frFR: Comment installer la dernière version de maven ? Installer maven à partir du code source. 
 * Description.enUS: How do I install the latest version of maven. Install maven from the source code. 
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
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum-builddep
	 * Val.Pre1Span3: -y
	 * Val.Pre1Span4: maven
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
	 * Val.Ol2Li4.frFR:maven : Le nom du paquet pour lequel vous vous souhaitez installer les dépendences. 
	 * Val.Ol2Li4.enUS:maven: The package name you wish to install the dependencies for. 
	 * 
	 * Val.Pre3Span1:sudo
	 * Val.Pre3Span2: yum
	 * Val.Pre3Span3: install
	 * Val.Pre3Span4: -y
	 * Val.Pre3Span5: git
	 * 
	 * Val.Ol4Li1:sudo
	 * Val.Ol4Li2:yum
	 * Val.Ol4Li3.frFR:install : Pour installer des nouveaux paquets yum. 
	 * Val.Ol4Li3.enUS:install: For installing new yum packages. 
	 * Val.Ol4Li4:-y
	 * Val.Ol4Li5.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol4Li5.enUS:git: The distributed revision control system for most open source software. 
	 * 
	 */  
	protected void _questionDependences(PageHtml o) {
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
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /usr/local/src/maven
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2.frFR:install : Crée des répertoires et définit des attributs sur le nouveau répertoire. 
	 * Val.Ol2Li2.enUS:install: Creates directories and sets attributes on the new directory. 
	 * Val.Ol2Li3.frFR:-d : Créez tous les composants des répertoires spécifiés. 
	 * Val.Ol2Li3.enUS:-d: Create  directories. 
	 * Val.Ol2Li4.frFR:-o : Définir la propriété sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li4.enUS:-o: Set ownership on the directory (super-user only). 
	 * Val.Ol2Li5.frFR:$USER : L'utilisateur actuel à rendre le propriétaire du répertoire. 
	 * Val.Ol2Li5.enUS:$USER: The current user to make the owner of the directory. 
	 * Val.Ol2Li6.frFR:-g : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li6.enUS:-g: Set group ownership on the directory (super-user only). 
	 * Val.Ol2Li7.frFR:$USER : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. 
	 * Val.Ol2Li7.enUS:$USER: The current user to make the group owner of the directory. 
	 * Val.Ol2Li8.frFR:/usr/local est un endroit pour des logiciels supplémentaires que vous installez sans le gestionnaire de paquets. 
	 * Val.Ol2Li8.frFR:/usr/local/src est un bon endroit pour cloner vos référentiels de logiciels open source. 
	 * Val.Ol2Li8.enUS:/usr/local is a place for extra software that you install without the package manager. 
	 * Val.Ol2Li8.enUS:/usr/local/src is a good place to clone your open source software repositories. 
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
	 * Val.H4Span.frFR:Créez un répertoire maven dans /opt. 
	 * Val.H4Span.enUS:Create a maven directory in /opt. 
	 * Val.PreSpan1:sudo
	 * Val.PreSpan2: install
	 * Val.PreSpan3: -d
	 * Val.PreSpan4: -o
	 * Val.PreSpan5: $USER
	 * Val.PreSpan6: -g
	 * Val.PreSpan7: $USER
	 * Val.PreSpan8: /opt/maven
	 * 
	 * Val.Ol2Li1:sudo
	 * Val.Ol2Li2:install
	 * Val.Ol2Li3:-d
	 * Val.Ol2Li4:-o
	 * Val.Ol2Li5:$USER
	 * Val.Ol2Li6:-g
	 * Val.Ol2Li7:$USER
	 * Val.Ol2Li8.frFR:/opt est un bon endroit pour installer des applications logicielles open source telles que maven. 
	 * Val.Ol2Li8.enUS:/opt is a good place to install open source software applications like maven. 
	 */  
	protected void _questionMkdirMaven(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment télécharger le code source de maven ? 
	 * Val.H3Span.enUS:How do I download the maven source code? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:git
	 * Val.PreSpan2: clone
	 * Val.PreSpan3: https://git-wip-us.apache.org/repos/asf/maven.git
	 * Val.PreSpan4: /usr/local/src/maven
	 * 
	 * Val.Ol2Li1.frFR:git : Le système de contrôle de révision distribué pour la plupart des logiciels open source. 
	 * Val.Ol2Li1.enUS:git: The distributed revision control system for most open source software. 
	 * Val.Ol2Li2.frFR:clone : Cloner un référentiel dans un répertoire. 
	 * Val.Ol2Li2.enUS:clone: Clone a repository into a directory. 
	 * Val.Ol2Li3.frFR:https://git-wip-us.apache.org/repos/asf/maven.git : URL git vers le référentiel de code source maven. 
	 * Val.Ol2Li3.enUS:https://git-wip-us.apache.org/repos/asf/maven.git: The git URL to the maven source code repository. 
	 * Val.Ol2Li4.frFR:/usr/local/src/maven : Répertoire dans lequel le code source maven sera cloné. 
	 * Val.Ol2Li4.enUS:/usr/local/src/maven: The directory where the maven source code will be cloned. 
	 */  
	protected void _questionClonerSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment choisir une version récente de Maven ? 
	 * Val.H3Span.enUS:How do I pick a recent version of Maven? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Listez toutes les tags du référentiel git. 
	 * Val.H4Span.enUS:List all the tags in the git repository. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/maven
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: tag)
	 * 
	 * Val.Ol2Li1.frFR:(cd : Changer de répertoire temporairement avec la parenthèse ouverte. 
	 * Val.Ol2Li1.enUS:(cd: Change directory temporarily, because of the open parenthesis. 
	 * Val.Ol2Li2.frFR:/usr/local/src/maven : Répertoire dans lequel le code source maven a été cloné. 
	 * Val.Ol2Li2.enUS:/usr/local/src/maven: The directory where the maven source code was cloned. 
	 * Val.Ol2Li3.frFR:&& : Exécutez la commande cd et git ensemble. 
	 * Val.Ol2Li3.enUS:&&: Run the cd and git command together. 
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:tag) : Répertorie les tags actuelles ou les versions assignées du code et ferme la parenthèse. 
	 * Val.Ol2Li5.enUS:tag): Lists the current tags or assigned versions of the code and close the parenthesis. 
	 */  
	protected void _questionListerTags(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment changer de version du code source de maven ? 
	 * Val.H3Span.enUS:How do I switch versions of the maven source code? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Checkout la tag git. 
	 * Val.H4Span.enUS:Checkout the git tag. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/maven
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: git
	 * Val.PreSpan5: checkout
	 * Val.PreSpan6: maven-3.6.1)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/maven
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4:git
	 * Val.Ol2Li5.frFR:checkout : Checkout une branche dans l’arbre de travail. 
	 * Val.Ol2Li5.enUS:checkout: Checkout a branch to the working tree. 
	 * Val.Ol2Li6.frFR:maven-3.6.1) : La dernière tag pour baser la branche. 
	 * Val.Ol2Li6.enUS:maven-3.6.1): The latest tag to base the branch from. 
	 */  
	protected void _questionCheckoutTag(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment contruire le code source de maven ? 
	 * Val.H3Span.enUS:How do I build the maven source code? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Construisez Maven avec la commande mvn. 
	 * Val.H4Span.enUS:Build Maven with the mvn command. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/maven
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: mvn
	 * Val.PreSpan5: -DdistributionTargetDir="/tmp/maven"
	 * Val.PreSpan6: clean
	 * Val.PreSpan7: package)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/maven
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4.frFR:mvn: L'outil de gestion de projet logiciel Java. 
	 * Val.Ol2Li4.enUS:mvn: The java software project management tool. 
	 * Val.Ol2Li5.frFR:-DdistributionTargetDir="/tmp/maven" : Pointez le distributionTargetDir vers un répertoire temporaire dans /tmp. 
	 * Val.Ol2Li5.enUS:-DdistributionTargetDir="/tmp/maven": Point the distributionTargetDir to a temporary directory in /tmp. 
	 * Val.Ol2Li6.frFR:clean : Nettoyez toutes les versions précédentes. 
	 * Val.Ol2Li6.enUS:clean: Clean up any previous builds. 
	 * Val.Ol2Li7.frFR:package) : Construire l'application Maven complète et fermez la parenthèse. 
	 * Val.Ol2Li7.enUS:package): Build the complete maven application and close the parenthesis. 
	 */  
	protected void _questionConstruireSource(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Mais pourquoi installons-nous Maven pour installer la dernière version de Maven ? 
	 * Val.H3Span.enUS:But why are we installing Maven to install the latest Maven? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Un programme qui nécessite de se construire. 
	 * Val.H4Span.enUS:A program that requires itself to build itself. 
	 * 
	 * Val.H5Span.frFR:
	 * Val.P5Span.frFR:Je ne le croisais pas non plus, un programme qui nécessite de se construire ? 
	 * Val.P5Span.frFR:Le mieux que je puisse faire pour expliquer ce phénomène est de citer la documentation de Maven : 
	 * Val.P5Span.frFR:« Jusqu'au Maven 3.3, la construction de base de Maven pourrait être optimisée avec une construction Ant.  
	 * Val.P5Span.frFR:Ce bootstrap a été supprimé dans Maven 3.5: vous avez besoin d'un Maven pré-construit pour créer Maven à partir du source. » 
	 * Val.H5Span.enUS:
	 * Val.P5Span.enUS:I couldn't believe it myself at first, a program that requires itself to build itself? 
	 * Val.P5Span.enUS:The best I can do to explain this phenomenon is to quote the maven documentation: 
	 * Val.P5Span.enUS:"Until Maven 3.3, Maven core build could be boostrapped with an Ant build. 
	 * Val.P5Span.enUS:This bootstrap has been removed in Maven 3.5: you need a pre-built Maven to build Maven from source." 
	 */  
	protected void _questionMavenInstalleMaven(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-truck-container
	 * Val.H3Span.frFR:Comment contruire le code source de maven ? 
	 * Val.H3Span.enUS:How do I build the maven source code? 
	 * Val.H4I:far fa-tools
	 * Val.H4Span.frFR:Cloner le code source avec la commande git. 
	 * Val.H4Span.enUS:Clone the source code with the git command. 
	 * Val.PreSpan1:(cd
	 * Val.PreSpan2: /usr/local/src/maven
	 * Val.PreSpan3: &&
	 * Val.PreSpan4: mvn
	 * Val.PreSpan5: -DdistributionTargetDir="/opt/maven"
	 * Val.PreSpan6: clean
	 * Val.PreSpan7: package)
	 * 
	 * Val.Ol2Li1:(cd
	 * Val.Ol2Li2:/usr/local/src/maven
	 * Val.Ol2Li3:&&
	 * Val.Ol2Li4.frFR:mvn: L'outil de gestion de projet logiciel Java. 
	 * Val.Ol2Li4.enUS:mvn: The java software project management tool. 
	 * Val.Ol2Li5.frFR:-DdistributionTargetDir="/opt/maven" : Pointez le distributionTargetDir vers le répertoire où maven sera installé. 
	 * Val.Ol2Li5.enUS:-DdistributionTargetDir="/opt/maven": Point the distributionTargetDir to the directory where maven will be installed. 
	 * Val.Ol2Li6.frFR:clean : Nettoyez toutes les versions précédentes. 
	 * Val.Ol2Li6.enUS:clean: Clean up any previous builds. 
	 * Val.Ol2Li7.frFR:package) : Construire l'application Maven complète et fermez la parenthèse. 
	 * Val.Ol2Li7.enUS:package): Build the complete maven application and close the parenthesis. 
	 */  
	protected void _questionBin(PageHtml o) {
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
