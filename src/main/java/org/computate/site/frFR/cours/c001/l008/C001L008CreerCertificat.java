package org.computate.site.frFR.cours.c001.l008;

import java.util.List;

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.utilisateur.UtilisateurSite;

/**
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/008-comment-obtenir-certificats-tls-gratuitement
 * ApiUriRechercheEnUSPage: /enUS/course/001/008-how-to-obtain-free-tls-certificates
 * PageRechercheFrFRPage: C001L008CreerCertificatFrFRPage
 * PageRechercheEnUSPage: C001L008CreerCertificatEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Que puis-je faire une fois que j'ai acheté un nom de domaine ? 
 * H1.enUS: What can I do once I have purchased a domain name? 
 * 
 * H2.frFR: Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. 
 * H2.enUS: Obtain a valid TLS certificate for free, for security and credibility. 
 * 
 * Titre.frFR: Obtenez gratuitement un certificat TLS valide pour des raisons de sécurité et de crédibilité. 
 * Titre.enUS: Obtain a valid TLS certificate for free, for security and credibility. 
 * 
 * Description.frFR: Tout d'abord, félicitations pour avoir obtenu votre propre nom de domaine pour lancer votre site. Avec un nom de domaine, vous voudrez également obtenir un certificat TLS. La bonne nouvelle est qu’il est totalement gratuit, grâce à la technologie open source. Avec un certificat vous pouvez sécuriser les communications vers votre site. Vous pouvez signer votre code et vous assurer qu'il est valide lorsqu'il est déployé sur le cloud. Vous pouvez également configurer une connexion sécurisée avec OAuth2/OpenID Connect Single Sign On à toutes vos applications. Je vais vous montrer comment obtenir ces certificats et générer les magasins de clés à utiliser dans vos applications de manière open source. 
 * Description.enUS: First, congratulations on obtaining your own domain name to launch your site. Along with a domain name, you will also want to obtain a TLS certificate. The good news is that it is completely free, thanks to open source technology. With a certificate you can secure communications to your site. You can sign your code and ensure that it is valid when deployed on the cloud. You can also setup secure OAuth2/OpenID Connect Single Sign On to all of your applications. I will show you how to obtain these certificates and generate the keystores to use in your applications the open source way. 
 * 
 * PageSimple: true
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: question
 * Indexe: true
 * Image: true
 * ImageLargeur.frFR: 800
 * ImageHauteur.frFR: 1927
 * ImageLargeur.enUS: 800
 * ImageHauteur.enUS: 1702
*/   
public class C001L008CreerCertificat extends C001L008CreerCertificatGen<C001Lecon> {

	public static void main(String[] args) {  
		indexer(); 
		image();
	} 

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(8);
	}

	@Override protected void _classeNomsCanoniques(List<String> l) {
		l.add(C001L008CreerCertificat.class.getCanonicalName());
		l.add(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.class.getCanonicalName());
		super._classeNomsCanoniques(l);
	} 

	@Override protected void _articleH1_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H1);
	}

	@Override protected void _articleH1_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
	}

	@Override protected void _articleH2_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificat_H2);
	}

	@Override protected void _articleH2_enUS(Couverture<String> c) {
		c.o(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
	}

	@Override protected void _pageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_Uri);
	}

	@Override protected void _pageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_Uri);
	}

	@Override protected void _pageImageUri_enUS(Couverture<String> c) {
		c.o(C001L008CreerCertificatEnUSPage_ImageUri);
	}

	@Override protected void _pageImageUri_frFR(Couverture<String> c) {
		c.o(C001L008CreerCertificatFrFRPage_ImageUri);
	}

	@Override protected void _pageRecherche_enUS(List<String> l) {
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H1);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificat_H2);
		addPageRecherche_enUS(org.computate.site.enUS.cours.c001.l008.C001L008CreerCertificat.C001L008CreerCertificatVals);
	}

	@Override protected void _pageRecherche_frFR(List<String> l) {
		addPageRecherche_frFR(C001L008CreerCertificat_H1);
		addPageRecherche_frFR(C001L008CreerCertificat_H2);
		addPageRecherche_frFR(C001L008CreerCertificatVals);
	}

	public void htmlBodyCourt() {
		htmlBodyRecapituler2();
		htmlBodyRecapituler3();
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Tout d'abord, félicitations pour avoir obtenu votre propre nom de domaine pour lancer votre site. 
	 * Val.P.frFR:Avec un nom de domaine, vous voudrez également obtenir un certificat TLS. 
	 * Val.P.frFR:La bonne nouvelle est qu’il est totalement gratuit, grâce à la technologie open source. 
	 * Val.P.frFR:Avec un certificat vous pouvez sécuriser les communications vers votre site. 
	 * Val.P.frFR:Vous pouvez signer votre code et vous assurer qu'il est valide lorsqu'il est déployé sur le cloud. 
	 * Val.P.frFR:Vous pouvez également configurer une connexion sécurisée avec OAuth2/OpenID Connect Single Sign On à toutes vos applications. 
	 * Val.P.frFR:Je vais vous montrer comment obtenir ces certificats et générer les magasins de clés à utiliser dans vos applications de manière open source. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:First, congratulations on obtaining your own domain name to launch your site. 
	 * Val.P.enUS:Along with a domain name, you will also want to obtain a TLS certificate. 
	 * Val.P.enUS:The good news is that it is completely free, thanks to open source technology. 
	 * Val.P.enUS:With a certificate you can secure communications to your site. 
	 * Val.P.enUS:You can sign your code and ensure that it is valid when deployed on the cloud. 
	 * Val.P.enUS:You can also setup secure OAuth2/OpenID Connect Single Sign On to all of your applications. 
	 * Val.P.enUS:I will show you how to obtain these certificates and generate the keystores to use in your applications the open source way. 
	 */    
	protected void _moi(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-conveyor-belt-alt
	 * Val.H3Span.frFR:Comment installer les dépendences pour certbot ? 
	 * Val.H3Span.enUS:How do I install the dependencies for certbot? 
	 * Val.H4I:far fa-cookie
	 * Val.H4Span.frFR:Construisez les dépendances avec yum. 
	 * Val.H4Span.enUS:Build the dependencies with yum. 
	 * Val.Pre1Span1:sudo
	 * Val.Pre1Span2: yum
	 * Val.Pre1Span3: install
	 * Val.Pre1Span4: -y
	 * Val.Pre1Span5: epel-release
	 * 
	 * Val.Ol2Li1Dt:sudo
	 * Val.Ol2Li1Dd.frFR:: La commande pour installer des dépots yum commence par la commande sudo. 
	 * Val.Ol2Li1Dd.frFR:La commande "sudo" permet à votre utilisateur actuel d'avoir les privilèges root pendant quelques minutes après avoir saisi votre mot de passe. 
	 * Val.Ol2Li1Dd.frFR:L'installation des dépots yum nécessite toujours les privilèges root. 
	 * Val.Ol2Li1Dd.enUS:: The command to install yum repositories begins with the command sudo. 
	 * Val.Ol2Li1Dd.enUS:The "sudo" command allows your current user to have root privileges for a few minutes after entering your password. 
	 * Val.Ol2Li1Dd.enUS:Installing yum repositories always requires root privileges. 
	 * Val.Ol2Li2Dt:yum
	 * Val.Ol2Li2Dd.frFR:yum Signifie "Yellowdog Updater Modified", mais personne ne le connait comme yellowdog, juste yum. 
	 * Val.Ol2Li2Dd.frFR:CentOS gère les paquets de logiciel et les fichiers d'application RPM avec yum. 
	 * Val.Ol2Li2Dd.enUS:yum Stands for "Yellowdog Updater Modified", but nobody knows it as yellowdog, just yum. 
	 * Val.Ol2Li2Dd.enUS:CentOS manages software packages and RPM application files with yum. 
	 * Val.Ol2Li3Dt:install
	 * Val.Ol2Li3Dd.frFR: : Pour installer des nouveaux paquets yum. 
	 * Val.Ol2Li3Dd.enUS:: For installing new yum packages. 
	 * Val.Ol2Li4Dt:-y
	 * Val.Ol2Li4Dd.frFR: : Réprimer les messages demandant de confirmer si vous souhaitez installer le logiciel. 
	 * Val.Ol2Li4Dd.enUS:: Suppress messages asking to confirm if you want to install the software. 
	 * Val.Ol2Li5Dt:epel-release
	 * Val.Ol2Li5Dd.frFR: : Nom du paquet des packages supplémentaires pour le référentiel Enterprise Linux. 
	 * Val.Ol2Li5Dd.enUS:: The package name of the Extra Packages for Enterprise Linux repository. 
	 * 
	 * 
	 * Val.Pre3Span1:sudo
	 * Val.Pre3Span2: yum
	 * Val.Pre3Span3: install
	 * Val.Pre3Span4: -y
	 * Val.Pre3Span5: certbot
	 * 
	 * Val.Ol4Li1Dt:sudo
	 * Val.Ol4Li2Dt:yum
	 * Val.Ol4Li3Dt:install
	 * Val.Ol4Li4Dt:-y
	 * Val.Ol4Li5Dt:certbot
	 * Val.Ol4Li5Dd.frFR: : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. 
	 * Val.Ol4Li5Dd.enUS:: A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. 
	 * 
	 */  
	protected void _questionDependences(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-files-medical
	 * Val.H3Span.frFR:Où dois-je placer les certificats, les clés et les magasins de clés pour mon site ? 
	 * Val.H3Span.enUS:Where do I put the certificates, keys and keystores for my site? 
	 * Val.H4I:far fa-folder-tree
	 * Val.H4Span.frFR:Créez un répertoire certbot dans /srv. 
	 * Val.H4Span.enUS:Create a pgsql directory in /srv. 
	 * Val.PreSpan01:sudo
	 * Val.PreSpan02: install
	 * Val.PreSpan03: -d
	 * Val.PreSpan04: -o
	 * Val.PreSpan05: $USER
	 * Val.PreSpan06: -g
	 * Val.PreSpan07: $USER
	 * Val.PreSpan08: -m
	 * Val.PreSpan09: 700
	 * Val.PreSpan10: /srv/certbot
	 * 
	 * Val.Ol2Li01Dt:sudo
	 * Val.Ol2Li02Dt:install
	 * Val.Ol2Li02Dd.frFR: : Crée des répertoires et définit des attributs sur le nouveau répertoire. 
	 * Val.Ol2Li02Dd.enUS:: Creates directories and sets attributes on the new directory. 
	 * Val.Ol2Li03Dt:-d
	 * Val.Ol2Li03Dd.frFR: : Créez tous les composants des répertoires spécifiés. 
	 * Val.Ol2Li03Dd.enUS:: Create  directories. 
	 * Val.Ol2Li04Dt:-o
	 * Val.Ol2Li04Dd.frFR: : Définir la propriété sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li04Dd.enUS:: Set ownership on the directory (super-user only). 
	 * Val.Ol2Li05Dt:$USER
	 * Val.Ol2Li05Dd.frFR: : L'utilisateur actuel à rendre le propriétaire du répertoire. 
	 * Val.Ol2Li05Dd.enUS:: The current user to make the owner of the directory. 
	 * Val.Ol2Li06Dt:-g
	 * Val.Ol2Li06Dd.frFR: : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li06Dd.enUS:: Set group ownership on the directory (super-user only). 
	 * Val.Ol2Li07Dt:$USER
	 * Val.Ol2Li07Dd.frFR: : L'utilisateur actuel à rendre le propriétaire du groupe du répertoire. 
	 * Val.Ol2Li07Dd.enUS:: The current user to make the group owner of the directory. 
	 * Val.Ol2Li08Dt:-m
	 * Val.Ol2Li08Dd.frFR:-m : Définir la propriété du groupe sur le répertoire (super-utilisateur uniquement). 
	 * Val.Ol2Li08Dd.enUS:-m: Set group ownership on the directory (super-user only). 
	 * Val.Ol2Li09Dt:700
	 * Val.Ol2Li09Dd.frFR: : Accordez des autorisations de lecture, d'écriture et d'exécution à l'utilisateur du répertoire uniquement. 
	 * Val.Ol2Li09Dd.enUS:: Give read, write and execute permissions to only the user of the directory. 
	 * Val.Ol2Li10Dt:/srv/certbot
	 * Val.Ol2Li10Dd.frFR: : /srv est un bon endroit pour installer des serveurs logicielles open source et vos certificats, clés et magasins de clés. 
	 * Val.Ol2Li10Dd.enUS:: /srv is a good place to install open source software serveurs and your certificates, keys and keystores. 
	 */  
	protected void _questionMkdirSrv(PageHtml o) {
	}

	/** 
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-file-certificate
	 * Val.H3Span.frFR:Comment puis-je obtenir mon certificat ? 
	 * Val.H3Span.enUS:How do I obtain my certificate? 
	 * Val.H4I:far fa-stamp
	 * Val.H4Span.frFR:Utilisez la commande certbot. 
	 * Val.H4Span.enUS:Use the certbot command. 
	 * 
	 * Val.PreSpan01:sudo
	 * Val.PreSpan02: certbot
	 * Val.PreSpan03: --manual
	 * Val.PreSpan04: --preferred-challenges dns
	 * Val.PreSpan05: --server https://acme-v02.api.letsencrypt.org/directory
	 * Val.PreSpan06: certonly
	 * Val.PreSpan07Span1: -d 
	 * Val:utilisateurSiteNomDomaine:.PreSpan07Span2:example.com
	 * Val.PreSpan08Span1: -d *.
	 * Val:utilisateurSiteNomDomaine:.PreSpan08Span2:example.com
	 * Val.PreSpan09Span1.frFR: -d *.applis.
	 * Val.PreSpan09Span1.enUS: -d *.apps.
	 * Val:utilisateurSiteNomDomaine:.PreSpan09Span2:example.com
	 * 
	 * Val.Ol2Li01Dt:sudo
	 * Val.Ol2Li02Dt:certbot
	 * Val.Ol2Li02Dd.frFR: : Une autorité de certification gratuite et automatisée qui vise à réduire les barrières à l'entrée pour le chiffrement de tout le trafic HTTP sur l'Internet. 
	 * Val.Ol2Li02Dd.enUS:: A free, automated certificate authority that aims to lower the barriers to entry for encrypting all HTTP traffic on the Internet. 
	 * Val.Ol2Li03Dt:--manual
	 * Val.Ol2Li03Dd.frFR: : Obtenez des certificats de manière interactive ou à l'aide d'un script shell. 
	 * Val.Ol2Li03Dd.enUS:: Obtain certificates interactively, or using shell script. 
	 * Val.Ol2Li04Dt:--preferred-challenges dns
	 * Val.Ol2Li04Dd.frFR: : Obtenir ou renouveler un certificat, mais ne l'installez pas. 
	 * Val.Ol2Li04Dd.enUS:: Obtain or renew a certificate, but do not install it. 
	 * Val.Ol2Li05Dt:--server https://acme-v02.api.letsencrypt.org/directory
	 * Val.Ol2Li05Dd.frFR: : Spécifiez une version plus récente d'un serveur letsencrypt qui autorise les domaines wildcard dans les certificats. 
	 * Val.Ol2Li05Dd.enUS:: Specify a more recent version of a letsencrypt server that allows wildcard domains in certificates. 
	 * Val.Ol2Li06Dt:certonly
	 * Val.Ol2Li06Dd.frFR: : Obtenir ou renouveler un certificat, mais ne l'installez pas. 
	 * Val.Ol2Li06Dd.enUS:: Obtain or renew a certificate, but do not install it. 
	 * Val.Ol2Li07DtSpan1:-d 
	 * Val:utilisateurSiteNomDomaine:.Ol2Li07DtSpan2:example.com
	 * Val.Ol2Li07DdSpan3.frFR: : Spécifiez votre nom de domaine de racine pour l'inclure en tant que route sécurisée par le certificat. 
	 * Val.Ol2Li07DdSpan3.enUS:: Specify your root domain name to include it as a route secured by the certificate. 
	 * Val.Ol2Li08DtSpan1:-d *.
	 * Val:utilisateurSiteNomDomaine:.Ol2Li08DtSpan2:example.com
	 * Val.Ol2Li08DdSpan3.frFR: : Incluez des domaines génériques dans votre domaine racine, y compris www par exemple. 
	 * Val.Ol2Li08DdSpan3.enUS:: Include wildcard domains under your root domain, which would include www for example. 
	 * Val.Ol2Li09DtSpan1.enUS:-d *.apps.
	 * Val.Ol2Li09DtSpan1.frFR:-d *.applis.
	 * Val:utilisateurSiteNomDomaine:.Ol2Li09DtSpan2:example.com
	 * Val.Ol2Li09DdSpan3.frFR: : Les domaines génériques n'incluent pas les sous-domaines d'un domaine générique; incluez donc également des sous-domaines supplémentaires. 
	 * Val.Ol2Li09DdSpan3.frFR:Vous pouvez inclure plus d'un nom de domaine dans le même certificat si vous le souhaitez, jusqu'à un montant généreux par letsencrypt. 
	 * Val.Ol2Li09DdSpan3.enUS:: Wildcard domains do not include subdomains of a wildcard domain, so include additional subdomains as well. 
	 * Val.Ol2Li09DdSpan3.enUS:You can optionally include more than one domain name in the same certificate if you want to, up to a generous amount by letsencrypt. 
	 * 
	 * Val.P2.frFR:certbot vous posera des questions, par exemple, si vous souhaitez que votre adresse IP soit consignée comme ayant demandé ce certificat.
	 * Val.P2.frFR:Vous pouvez répondre Yes car c'est votre certificat. 
	 * Val.P2.frFR:Il vous demandera probablement votre adresse e-mail, c'est bien, parce qu'ils vous enverront un mail lorsque votre certificat expirera quelques semaines avant. 
	 * Val.P2.frFR:Les certificats expirent tous les 3 mois, c'est bien souvent, mais ils sont gratuits, donc vous ne pouvez pas trop vous plaindre.
	 * Val.P2.frFR:Des certificats beaucoup plus chers peuvent durer 3 ans. 
	 * Val.P2.enUS:certbot will ask you questions, like if you're okay having your IP address logged as having requested this certificate. 
	 * Val.P2.enUS:You can answer Yes, because it is your certificate. 
	 * Val.P2.enUS:It will probably ask you for your email, which is nice, because they will send you an email when your certificate is a few weeks from expiring. 
	 * Val.P2.enUS:The certificates expire every 3 months, which is often, but they are free, so you can't complain too much. 
	 * Val.P2.enUS:Much more expensive certificates might last for 3 years. 
	 * 
	 * Val.P3Span1.frFR:Aussi, certbot vous demandera de créer plusieurs enregistrements DNS TXT avec des valeurs aléatoires pour vos noms de domaine que vous avez spécifiés, afin de prouver que vous êtes le propriétaire du domaine. 
	 * Val.P3Span1.frFR:Cela prendra du temps tous les trois mois. Je vous recommande donc un service qui vous permettra de gérer le DNS de vos propres noms de domaine. 
	 * Val.P3Span1.frFR:Fastmail est le service que j'utilise pour la messagerie personnelle et le DNS 
	 * Val.P3Span1.enUS:Also, certbot will ask you to create several TXT DNS records with random values for your domain names you specified to prove that you own the domain. 
	 * Val.P3Span1.enUS:This will take some time to do every 3 months, so I recommend a service that will let you manage the DNS of your own domain names. 
	 * Val.P3Span1.enUS:Fastmail is the service that I use for both personal email and DNS 
	 * 
	 * Val.P3A1: https://www.fastmail.com/
	 * 
	 * Val.P3Span2.frFR:. Fastmail est basé en Australie et protège la confidentialité de votre messagerie, contrairement à certains autres fournisseurs de messagerie. 
	 * Val.P3Span2.frFR:Avec Fastmail, je peux me connecter, même à partir de mon appli Fastmail sur mon mobile, et gérer mon DNS. 
	 * Val.P3Span2.frFR:Je peux gérer autant de noms de domaine que je le souhaite avec Fastmail. 
	 * Val.P3Span2.frFR:Je dit à l'équipe de support du bureau d'enregistrement de domaine où j'ai acheté le domaine, les serveurs de noms de fastmail.com (ns1.messagingengine.com, ns2.messagingengine.com) et j'ajoute le domaine dans Fastmail. 
	 * Val.P3Span2.frFR:Ensuite, je peux gérer les enregistrements DNS une fois les modifications sont faites pour tous mes domaines. 
	 * Val.P3Span2.frFR:J'ajoute un enregistrement TXT et une valeur pour chaque défi certbot et enregistre les modifications. 
	 * Val.P3Span2.frFR:Autant que je sache, les enregistrements TXT sont enregistrés immédiatement. 
	 * Val.P3Span2.enUS:. Fastmail is Australia based, and they protect your email privacy, unlike some other email providers. 
	 * Val.P3Span2.enUS:With Fastmail, I can login, even from my Fastmail phone app, and manage my DNS. 
	 * Val.P3Span2.enUS:I can manage as many domain names as I want with Fastmail. 
	 * Val.P3Span2.enUS:I just tell the support team of the domain registrar where I purchased the domain, the name servers of fastmail.com (ns1.messagingengine.com, ns2.messagingengine.com) and add the domain in Fastmail. 
	 * Val.P3Span2.enUS:Then I can manage the DNS records, after the changes are made for all my domains. 
	 * Val.P3Span2.enUS:So I add a TXT record and value for each certbot challenge and save the changes. 
	 * Val.P3Span2.enUS:As far as I can tell, the TXT records are recorded immediately. 
	 */    
	protected void _questionCertbot(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-key
	 * Val.H3Span.frFR:Comment utiliser le certificat et la clé générés par certbot ? 
	 * Val.H3Span.enUS:How do I use the certificate and key that certbot generated? 
	 * Val.H4I:far fa-copy
	 * Val.H4Span.frFR:Copiez les fichiers certbot avec la commande install. 
	 * Val.H4Span.enUS:Copy the certbot files with the install command. 
	 * 
	 * Val.Pre1Span01:sudo
	 * Val.Pre1Span02: install
	 * Val.Pre1Span03: -o
	 * Val.Pre1Span04: $USER
	 * Val.Pre1Span05: -g
	 * Val.Pre1Span06: $USER
	 * Val.Pre1Span07: -m
	 * Val.Pre1Span08: 700
	 * Val.Pre1Span09Span1: /etc/letsencrypt/live/
	 * Val:utilisateurSiteNomDomaine:.PreSpan09Span2:example.com
	 * Val.Pre1Span09Span3:/privkey.pem
	 * Val.Pre1Span10: /srv/certbot/server.key
	 * 
	 * Val.Ol1Li01Dt:sudo
	 * Val.Ol1Li02Dt:install
	 * Val.Ol1Li03Dt:-o
	 * Val.Ol1Li04Dt:$USER
	 * Val.Ol1Li05Dt:-g
	 * Val.Ol1Li06Dt:$USER
	 * Val.Ol1Li07Dt:-m
	 * Val.Ol1Li08Dt:700
	 * Val.Ol1Li09Dt:/srv/certbot
	 * Val.Ol1Li09Dt: /etc/letsencrypt/live/
	 * Val:utilisateurSiteNomDomaine:.Ol1Li09Dt:example.com
	 * Val.Ol1Li09Dt:/privkey.pem
	 * Val.Ol1Li09Dd.frFR: : Une fois que la commande certbot est terminée, elle vous indiquera le chemin complet de la clé privée récemment générée, ce qui n'est peut-être pas exactement ce que j'ai écrit ici. 
	 * Val.Ol1Li09Dd.enUS:: After the certbot command completes, it will tell you the complete path to the newly generated private key, which may not be exactly what I wrote here. 
	 * Val.Ol1Li10Dt:/srv/certbot/server.key
	 * Val.Ol1Li10Dd.frFR: : Le nouveau chemin où la clé privée sera copiée. 
	 * Val.Ol1Li10Dd.enUS:: The new path to where the private key will be copied. 
	 * 
	 * Val.Pre2Span01:sudo
	 * Val.Pre2Span02: install
	 * Val.Pre2Span03: -o
	 * Val.Pre2Span04: $USER
	 * Val.Pre2Span05: -g
	 * Val.Pre2Span06: $USER
	 * Val.Pre2Span07: -m
	 * Val.Pre2Span08: 700
	 * Val.Pre2Span09Span1: /etc/letsencrypt/live/
	 * Val:utilisateurSiteNomDomaine:.Pre2Span09Span2:example.com
	 * Val.Pre2Span09Span3:/fullchain.pem
	 * Val.Pre2Span10: /srv/certbot/server.crt
	 * 
	 * Val.Ol2Li01Dt:sudo
	 * Val.Ol2Li02Dt:install
	 * Val.Ol2Li03Dt:-o
	 * Val.Ol2Li04Dt:$USER
	 * Val.Ol2Li05Dt:-g
	 * Val.Ol2Li06Dt:$USER
	 * Val.Ol2Li07Dt:-m
	 * Val.Ol2Li08Dt:700
	 * Val.Ol2Li09Dt:/srv/certbot
	 * Val.Ol2Li09Dt: /etc/letsencrypt/live/
	 * Val:utilisateurSiteNomDomaine:.Ol2Li09Dt:example.com
	 * Val.Ol2Li09Dt:/fullchain.pem
	 * Val.Ol2Li09Dd.frFR: : Une fois que la commande certbot est terminée, elle vous indiquera le chemin complet de le certificat récemment généré, ce qui n'est peut-être pas exactement ce que j'ai écrit ici. 
	 * Val.Ol2Li09Dd.enUS:: After the certbot command completes, it will tell you the complete path to the newly generated certificate, which may not be exactly what I wrote here. 
	 * Val.Ol2Li10Dt:/srv/certbot/server.crt
	 * Val.Ol2Li10Dd.frFR: : Le nouveau chemin où le certificat sera copié. 
	 * Val.Ol2Li10Dd.enUS:: The new path to where the certificate will be copied. 
	 */  
	protected void _questionCopier(PageHtml o) {
	}

	/**
	 * {@inheritDoc}
	 * 
	 * Val.H3I:far fa-users-crown
	 * Val.H3Span.frFR:Comment puis-je obtenir les certificats letencrypt racine et CA ? 
	 * Val.H3Span.enUS:How do I obtain the letsencrypt root and CA certificates? 
	 * Val.H4I:far fa-copy
	 * Val.H4Span.frFR:Téléchargez les certificats racine et CA avec la commande curl. 
	 * Val.H4Span.enUS:Download the root and CA certificates with the curl command. 
	 * 
	 * Val.Pre1Span01:curl
	 * Val.Pre1Span02: https://letsencrypt.org/certs/isrgrootx1.pem.txt
	 * Val.Pre1Span03: -o /srv/certbot/root.crt
	 * 
	 * Val.Ol1Li01Dt:curl
	 * Val.Ol1Li01Dd.frFR: : Un outil pour transférer des données depuis ou vers un serveur, en utilisant les protocoles pris en charge. 
	 * Val.Ol1Li01Dd.enUS:: A tool to transfer data from or to a server, using supported protocols. 
	 * Val.Ol1Li02Dt:https://letsencrypt.org/certs/isrgrootx1.pem.txt
	 * Val.Ol1Li02Dd.frFR: : L'URL du certificat racine de letsencrypt. 
	 * Val.Ol1Li02Dd.enUS:: The URL to the letsencrypt root certificate. 
	 * Val.Ol1Li03Dt:-o /srv/certbot/root.crt
	 * Val.Ol1Li03Dd.frFR: : Ecrit la sortie dans le fichier root.crt au lieu de stdout. 
	 * Val.Ol1Li03Dd.enUS:: Write output to the root.crt file instead of stdout. 
	 * 
	 * Val.Pre2Span01:curl
	 * Val.Pre2Span02: https://letsencrypt.org/certs/lets-encrypt-x3-cross-signed.pem.txt
	 * Val.Pre2Span03: -o /srv/certbot/ca1.crt
	 * 
	 * Val.Ol2Li01Dt:curl
	 * Val.Ol2Li02Dt:https://letsencrypt.org/certs/lets-encrypt-x3-cross-signed.pem.txt
	 * Val.Ol2Li02Dd.frFR: : L'URL du premier certificat d'autorité letsencrypt. 
	 * Val.Ol2Li02Dd.enUS:: The URL to the first letsencrypt certificate authority. 
	 * Val.Ol2Li03Dt:-o /srv/certbot/ca1.crt
	 * Val.Ol2Li03Dd.frFR: : Ecrit la sortie dans le fichier ca1.crt au lieu de stdout. 
	 * Val.Ol2Li03Dd.enUS:: Write output to the ca1.crt file instead of stdout. 
	 * 
	 * Val.Pre3Span01:curl
	 * Val.Pre3Span02: https://letsencrypt.org/certs/letsencryptauthorityx3.pem.txt
	 * Val.Pre3Span03: -o /srv/certbot/ca2.crt
	 * 
	 * Val.Ol3Li01Dt:curl
	 * Val.Ol3Li02Dt:https://letsencrypt.org/certs/letsencryptauthorityx3.pem.txt
	 * Val.Ol3Li02Dd.frFR: : L'URL du deuxième certificat d'autorité letsencrypt. 
	 * Val.Ol3Li02Dd.enUS:: The URL to the first letsencrypt certificate authority. 
	 * Val.Ol3Li03Dt:-o /srv/certbot/ca2.crt
	 * Val.Ol3Li03Dd.frFR: : Ecrit la sortie dans le fichier ca2.crt au lieu de stdout. 
	 * Val.Ol3Li03Dd.enUS:: Write output to the ca2.crt file instead of stdout. 
	 */  
	protected void _questionRacineCa(PageHtml o) {
	}

	/**
	 * Val.H3.frFR:À récapituler : 
	 * Val.H3.enUS:To review: 
	 */
	protected void _recapituler1(PageHtml o) {      
	}

	/**
	 * Val.TableTr1Td1.frFR:Jeudi 
	 * Val.TableTr1Td1.enUS:Thursday 
	 * Val.TableTr1Td2I:far fa-fast-forward
	 * Val.TableTr1Td3I:far fa-file-code
	 * Val.TableTr1Td4I:far fa-pen-nib
	 * Val.TableTr2Td1.frFR:16 Mai 2019
	 * Val.TableTr2Td1.enUS:May 16 2019
	 * Val.TableTr2Td2.frFR:Comment installer la dernière version de PostgreSQL ? 
	 * Val.TableTr2Td2.enUS:How do I install the latest version of PostgreSQL. 
	 * Val.TableTr2Td3.frFR:Installer PostgreSQL à partir du code source. 
	 * Val.TableTr2Td3.enUS:Install PostgreSQL from the source code. 
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
	 * Val.TableTr02Td2.frFR:Comment installer les dépendences pour PostgreSQL ? 
	 * Val.TableTr02Td2.enUS:How do I install the dependencies for PostgreSQL? 
	 * Val.TableTr02Td3Span1I:far fa-cookie
	 * Val.TableTr02Td4.frFR:Construisez les dépendances avec yum. 
	 * Val.TableTr02Td4.enUS:Build the dependencies with yum. 
	 * 
	 * Val.TableTr03Td1I:far fa-files-medical
	 * Val.TableTr03Td2.frFR:Où est-ce que je place le code source PostgreSQL ? 
	 * Val.TableTr03Td2.enUS:Where do I put the PostgreSQL source code? 
	 * Val.TableTr03Td3I:far fa-folder-tree
	 * Val.TableTr03Td4.frFR:Créez un répertoire PostgreSQL dans /usr/local/src. 
	 * Val.TableTr03Td4.enUS:Create a PostgreSQL directory in /usr/local/src. 
	 * 
	 * Val.TableTr04Td1I:far fa-map-pin
	 * Val.TableTr04Td2.frFR:Où puis-je installer PostgreSQL ? 
	 * Val.TableTr04Td2.enUS:Where do I install PostgreSQL? 
	 * Val.TableTr04Td3Span1I:far fa-folder-tree
	 * Val.TableTr04Td4.frFR:Créez un répertoire PostgreSQL dans /opt. 
	 * Val.TableTr04Td4.enUS:Create a PostgreSQL directory in /opt. 
	 * 
	 * Val.TableTr05Td1I:far fa-cloud-download
	 * Val.TableTr05Td2.frFR:Comment télécharger le code source de PostgreSQL ? 
	 * Val.TableTr05Td2.enUS:How do I download the PostgreSQL source code? 
	 * Val.TableTr05Td3I:fab fa-git
	 * Val.TableTr05Td4.frFR:Cloner le code source avec la commande git. 
	 * Val.TableTr05Td4.enUS:Clone the source code with the git command. 
	 * 
	 * Val.TableTr06Td1I:far fa-code-branch
	 * Val.TableTr06Td2.frFR:Comment choisir une version récente de PostgreSQL ? 
	 * Val.TableTr06Td2.enUS:How do I pick a recent version of PostgreSQL? 
	 * Val.TableTr06Td3I:far fa-tag
	 * Val.TableTr06Td4.frFR:Listez toutes les tags du référentiel git. 
	 * Val.TableTr06Td4.enUS:List all the tags in the git repository. 
	 * 
	 * Val.TableTr07Td1I:far fa-code-merge
	 * Val.TableTr07Td2.frFR:Comment changer de version du code source de PostgreSQL ? 
	 * Val.TableTr07Td2.enUS:How do I switch versions of the PostgreSQL source code? 
	 * Val.TableTr07Td3I:far fa-code-commit
	 * Val.TableTr07Td4.frFR:Checkout la tag git. 
	 * Val.TableTr07Td4.enUS:Checkout the git tag. 
	 * 
	 * Val.TableTr08Td1I:far fa-tools
	 * Val.TableTr08Td2.frFR:Comment contruire le code source de PostgreSQL ? 
	 * Val.TableTr08Td2.enUS:How do I build the PostgreSQL source code? 
	 * Val.TableTr08Td3I:far fa-terminal
	 * Val.TableTr08Td4.frFR:Construisez PostgreSQL avec la commande configure. 
	 * Val.TableTr08Td4.enUS:Build PostgreSQL with the configure command. 
	 * 
	 * Val.TableTr09Td1I:far fa-map-pin
	 * Val.TableTr09Td2.frFR:Après avoir installé PostgreSQL, où se trouve mon répertoire de données ? 
	 * Val.TableTr09Td2.enUS:After installing PostgreSQL, where is my data directory? 
	 * Val.TableTr09Td3I:far fa-folder-tree
	 * Val.TableTr09Td4.frFR:Créez un répertoire pgsql dans /srv. 
	 * Val.TableTr09Td4.enUS:Create a pgsql directory in /srv. 
	 * 
	 * Val.TableTr10Td1I:far fa-database
	 * Val.TableTr10Td2.frFR:Comment créer une nouvelle base de données PostgreSQL ? 
	 * Val.TableTr10Td2.enUS:How do I create a new PostgreSQL database? 
	 * Val.TableTr10Td3I:far fa-table
	 * Val.TableTr10Td4.frFR:Comment initialiser un nouveau serveur PostgreSQL. 
	 * Val.TableTr10Td4.enUS:How to initialize a new PostgreSQL server. 
	 * 
	 * Val.TableTr11Td1I:far fa-alarm-clock
	 * Val.TableTr11Td2.frFR:Comment puis-je exécuter PostgreSQL tout le temps au démarrage de mon ordinateur ? 
	 * Val.TableTr11Td2.enUS:How do I run PostgreSQL all the time, when my computer starts up? 
	 * Val.TableTr11Td3I:far fa-layer-plus
	 * Val.TableTr11Td4.frFR:Comment exécuter PostgreSQL en tant que service systemd. 
	 * Val.TableTr11Td4.enUS:How to run PostgreSQL as a systemd service. 
	 * 
	 * Val.TableTr12Td1I:far fa-search
	 * Val.TableTr12Td2.frFR:Comment le système connaît-il le nouveau service ? 
	 * Val.TableTr12Td2.enUS:How does the system know about the new service? 
	 * Val.TableTr12Td3I:far fa-redo-alt
	 * Val.TableTr12Td4.frFR:Rechargez le daemon systemd. 
	 * Val.TableTr12Td4.enUS:Reload the systemd daemon. 
	 * 
	 * Val.TableTr13Td1I:far fa-toggle-off
	 * Val.TableTr13Td2.frFR:Comment activer le service PostgreSQL? 
	 * Val.TableTr13Td2.enUS:How do I enable the PostgreSQL service? 
	 * Val.TableTr13Td3I:far fa-toggle-on
	 * Val.TableTr13Td4.frFR:Utilisez la commande systemctl enable. 
	 * Val.TableTr13Td4.enUS:Use the systemctl enable command. 
	 * 
	 * Val.TableTr14Td1I:far fa-pause-circle
	 * Val.TableTr14Td2.frFR:Comment démarrer le service PostgreSQL? 
	 * Val.TableTr14Td2.enUS:How do I start the PostgreSQL service? 
	 * Val.TableTr14Td3I:far fa-play-circle
	 * Val.TableTr14Td4.frFR:Utilisez la commande systemctl start. 
	 * Val.TableTr14Td4.enUS:Use the systemctl start command. 
	 * 
	 * Val.TableTr15Td1I:far fa-clipboard
	 * Val.TableTr15Td2.frFR:Comment puis-je m'assurer que le service PostgreSQL a démarré avec succès ? 
	 * Val.TableTr15Td2.enUS:How do I make sure the PostgreSQL service started successfully? 
	 * Val.TableTr15Td3I:far fa-clipboard-check
	 * Val.TableTr15Td4.frFR:Utilisez la commande systemctl status. 
	 * Val.TableTr15Td4.enUS:Use the systemctl status command. 
	 */ 
	protected void _recapituler3(PageHtml o) {      
	}
}
