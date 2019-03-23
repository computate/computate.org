package org.computate.site.frFR.cours.c001.l001;          

import org.computate.site.frFR.cours.c001.C001Lecon;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageParagraphe;
import org.computate.site.frFR.page.parti.QuestionReponse;


/** 
 * Api: true
 * ApiMethode: RechercheFrFRPage
 * ApiMethode: RechercheEnUSPage
 * ApiUriRechercheFrFRPage: /frFR/cours/001/001-choisir-nom-domaine
 * ApiUriRechercheEnUSPage: /enUS/course/001/001-choose-domain-name
 * PageRechercheFrFRPage: C001L001ChoisirNomDomaineFrFRPage
 * PageRechercheEnUSPage: C001L001ChoisirNomDomaineEnUSPage
 * PageSuperRechercheFrFRPage: C001LeconFrFRPage
 * PageSuperRechercheEnUSPage: C001LeconEnUSPage
 * UnNomMinuscule.frFR: le leçon
 * UnNomMinuscule.enUS: a lesson
 * 
 * H1.frFR: Quel est l'étape première pour créer mon propre site Web ? 
 * H1.enUS: What is the first step to creating my own website? 
 * 
 * H2.frFR: Choisir un nom de domaine. 
 * H2.enUS: Choose a domain name. 
 * 
 * PageSimple: true
 * NomPluriel.frFR: lessons
 * Couleur: green
 * IconeGroupe: regular
 * IconeNom: book
 * Indexe: true
 * 
*/       
public class C001L001ChoisirNomDomaine extends C001L001ChoisirNomDomaineGen<C001Lecon> {      

	public static void main(String[] args) {  
		indexer(); 
	}

	@Override protected void _leconNumero(Couverture<Integer> c) { 
		c.o(1);
	}

	protected void _pageVideoId(Couverture<String> c) {
		c.o("ZJTDpIpan8M");
	} 

	/**
	 * 
	 * Val.P.frFR:Envisagez-vous de créer votre propre site Web ? 
	 * Val.P.frFR:Peut-être vous demandez-vous quelle est la première étape de la création de votre propre site Web ? 
	 * Val.P.enUS:Are you thinking about launching your own website? 
	 * Val.P.enUS:Are you wondering what the very first step is to creating your own website? 
	 */
	protected void _intro(PageParagraphe o) {
		o.getTexte().s(introP);
	}

	public void htmlBody() {
		super.htmlBody();
	}

	/**
	 * 
	 * Val.P.frFR:Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. 
	 * Val.P.frFR:Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. 
	 * Val.P.frFR:La première chose à faire est de choisir votre nom de domaine, afin que vous puissiez commencer dans la bonne direction. 
	 * Val.P.enUS:Hello, my name is Christopher Tate. I am a Red Hat consultant and I love open source software. 
	 * Val.P.enUS:I will help you create your own successful website, on your own computer, using open-source software. 
	 * Val.P.enUS:The first thing you should do is choose your domain name so you can get started in the right direction. 
	 */
	protected void _moi(PageParagraphe o) {
		o.getTexte().s(moiP);
	}

	/**
	 * 
	 * Val.Question.frFR:Est-t-il important d'acheter un nom de domaine à l'avance ? 
	 * Val.Question.enUS:Is it important to purchase a domain name ahead of time? 
	 * Val.QuestionCourt.frFR:Devrais je l'acheter à l'avance ? 
	 * Val.QuestionCourt.enUS:Should I buy it ahead of time? 
	 * Val.Reponse.frFR:Vous devez savoir maintenant comment vous appelez votre site, afin que vous ne seriez pas perdu. 
	 * Val.Reponse.enUS:You need to know now what your site will be called so you don't get lost. 
	 * Val.ReponseCourt.frFR:Savoir maintenant comment vous appelez votre site
	 * Val.ReponseCourt.enUS:Know what your site will be called
	 * Val.P.frFR:Vous pouvez commencer aujourd'hui avec votre propre ordinateur à construire votre propre site Web, mais vous devez comprendre ce que le site s'appele. 
	 * Val.P.frFR:Le destin du nom de votre ordinateur en dépend. 
	 * Val.P.frFR:Les répertoires où vous mettez votre site Web l'attendent. 
	 * Val.P.frFR:Toutes les applications qui font partie du site Web devront le connaître. 
	 * Val.P.frFR:Alors, passez du temps et pensez au .com, .fr ou .nimporte qui représentera votre vision, puis revenez ici et je vais vous aider à partir de là. 
	 * Val.P.enUS:You can start today with your very own computer building your own website, but you must figure out what it will be called. 
	 * Val.P.enUS:The fate of the name of your computer depends on it. 
	 * Val.P.enUS:The directories where you will be putting your website are waiting for it. 
	 * Val.P.enUS:All the applications that are part of the website will need to know it. 
	 * Val.P.enUS:So go take some time and think of the perfect .com, .org or .whatever that will represent your vision, and then come back here and I'll help you from there. 
	 */
	protected void _aLAvance(QuestionReponse o) {      

		o.questionIcone("fas", "history");
		o.setQuestion(aLAvanceQuestion);
		o.setQuestionCourt(aLAvanceQuestionCourt);

		o.reponseIcone("fas", "map-pin");
		o.setReponse(aLAvanceReponse);
		o.setReponseCourt(aLAvanceReponseCourt);
	}
	public void htmlBodyALAvance() {
		aLAvance.htmlAvant();
		e("p").f();
			sx(aLAvanceP);
		g("p");
		aLAvance.htmlApres();
	}

	/**  
	 * 
	 * Val.Question.frFR:Où puis-je acheter un nom de domaine ? 
	 * Val.Question.enUS:Where can I purchase a domain name? 
	 * Val.QuestionCourt.frFR:Où puis-je acheter un nom de domaine ? 
	 * Val.QuestionCourt.enUS:Where can I purchase a domain name? 
	 * Val.Reponse.frFR:Il y a tellement d'enregistreurs de noms de domaine à choisir, mais vous pouvez essayer brinkster.com ou gandi.net. 
	 * Val.Reponse.enUS:There are so many domain name registrars to choose from, but you might try brinkster.com or gandi.net. 
	 * Val.ReponseCourt.frFR:Essayez brinkster.com ou gandi.net
	 * Val.ReponseCourt.enUS:Try brinkster.com or gandi.net
	 * Val.P.frFR:Je ne peux pas vous dire où l'endroit le moins cher ou le lieu le plus digne de confiance est d'acheter le nom de domaine de votre site. 
	 * Val.P.frFR:Mais je peux vous dire où j'ai acheté le mien il y a 12 ans, c'est 
	 * Val.P.frFR:. Mais brinkster.com n'est pas le moins chèr ($ 19.83 cette année). 
	 * Val.P.frFR:Peut-être vous voulez essayer 
	 * Val.P.frFR:. Leurs prix varient, mais ils ont des noms de domaine publicitaire à un bon prix, et beaucoup d'autres options à choisir. 
	 * Val.P.enUS:I can't tell you where the cheapest place or most trustworthy place is to purchase your site's domain name. 
	 * Val.P.enUS:But I can tell you where I purchased mine 12 years ago, which is 
	 * Val.P.enUS:. But brinkster.com is not the cheapest ($19.83 this year). 
	 * Val.P.enUS:You may also want to try 
	 * Val.P.enUS:. Their prices vary, but they have very cheap promotional domain names, and many more options to choose from. 
	 */     
	protected void _acheter(QuestionReponse o) {      

		o.setQuestion(acheterQuestion);
		o.setQuestionCourt(acheterQuestionCourt);

		o.setReponse(acheterReponse);
		o.setReponseCourt(acheterReponseCourt);
	}
	public void htmlBodyAcheter() { 
		acheter.htmlAvant();
		e("p").f();
			e("span").f();
				sx(acheterP1, acheterP2);
			g("span");
			e("a").a("href", "https://secure.brinkster.com/Domains/").f();
				sx("brinkster.com");
			g("a");
			e("span").f();
				sx(acheterP3, acheterP4);
			g("span");
			e("a").a("href", "https://secure.brinkster.com/Domains/").f();
				sx("gandi.net");
			g("a");
			e("span").f();
				sx(acheterP5);
			g("span");
		g("p");
		acheter.htmlApres();
	}
/**
 * Val.AcheterQuestion.frFR:Où puis-je acheter un nom de domaine ? 
 * Val.AcheterQuestion.enUS:Where can I purchase a domain name? 
 * Val.AcheterQuestionCourt.frFR:Où puis-je acheter un nom de domaine ? 
 * Val.AcheterQuestionCourt.enUS:Where can I purchase a domain name? 
 * Val.AcheterReponse.frFR:Il y a tellement d'enregistreurs de noms de domaine à choisir, mais vous pouvez essayer brinkster.com ou gandi.net. 
 * Val.AcheterReponse.enUS:There are so many domain name registrars to choose from, but you might try brinkster.com or gandi.net. 
 * Val.AcheterReponseCourt.frFR:Essayez brinkster.com ou gandi.net
 * Val.AcheterReponseCourt.enUS:Try brinkster.com or gandi.net
 * Val.AcheterParagraphe.frFR:Je ne peux pas vous dire où l'endroit le moins cher ou le lieu le plus digne de confiance est d'acheter le nom de domaine de votre site. 
 * Val.AcheterParagraphe.frFR:Mais je peux vous dire où j'ai acheté le mien il y a 12 ans, c'est 
 * Val.AcheterParagraphe.frFR:. Mais brinkster.com n'est pas le moins chèr ($ 19.83 cette année). 
 * Val.AcheterParagraphe.frFR:Peut-être vous voulez essayer 
 * Val.AcheterParagraphe.frFR:. Leurs prix varient, mais ils ont des noms de domaine publicitaire à un bon prix, et beaucoup d'autres options à choisir. 
 * Val.AcheterParagraphe.enUS:I can't tell you where the cheapest place or most trustworthy place is to purchase your site's domain name. 
 * Val.AcheterParagraphe.enUS:But I can tell you where I purchased mine 12 years ago, which is 
 * Val.AcheterParagraphe.enUS:. But brinkster.com is not the cheapest ($19.83 this year). 
 * Val.AcheterParagraphe.enUS:You may also want to try 
 * Val.AcheterParagraphe.enUS:. Their prices vary, but they have very cheap promotional domain names, and many more options to choose from. 
 */   
//	@Override protected void _ouPuisJeAcheterUnNomDomaine2Html() { 
//		e("p").f();
//			e("div").f();
//				e("span").f();
//					enUSXml("");
//					enUSXml("");
//
//					frFRXml("");
//					frFRXml("");
//				g("span");
//				e("a").a("href", "https://secure.brinkster.com/Domains/").f();
//					enUSXml("brinkster.com");
//					frFRXml("brinkster.com");
//				g("a");
//				e("span").f();
//					enUSXml("");
//					enUSXml("");
//
//					frFRXml("");
//					frFRXml("");
//				g("span");
//				e("a").a("href", "https://shop.gandi.net/en/domain/suggest").f();
//					enUSXml("gandi.net");
//					frFRXml("gandi.net");
//				g("a");
//				e("span").f();
//					enUSXml("");
//
//					frFRXml("");
//				g("span");
//			g("div");
//		g("p");
//	}
//
//	protected void _commentAppelerLeNomDeDomaine(QuestionReponse o) {      
//
//		o.questionIconeAvant("brands", "wpforms");
//		o.question.enUS("What do I choose for a domain name? ").frFR("Qu'est-ce que je choisis comme un nom de domaine ? ");
//		o.questionCourt.enUS("What do I choose for a domain name? ").frFR("Qu'est-ce que je choisis comme un nom de domaine ? ");
//
//		o.reponseIconeAvant("solid", "bullhorn");
//		o.reponse.enUS("Find a domain name that will reach your audience. ").frFR("Trouver un nom de domaine qui atteindra votre public. ");
//		o.reponseCourt.enUS("Reach your audience").frFR("Atteindra votre public");
//	}
//	@Override protected void _commentAppelerLeNomDeDomaineHtml() { 
//		e("p").f();
//			e("div").f();
//				e("span").f();
//					enUSXml("I don't know your passion, but find a domain name that will reach your audience. ");
//					enUSXml("It's good if it is short and sweet. ");
//					enUSXml("Whether it is a .com, or .org, or .net or whatever is up to you too. ");
//					enUSXml("Just make it a place you will be proud of someday! ");
//
//					frFRXml("Je ne connais pas votre passion, mais trouvez un nom de domaine qui atteindra votre public. ");
//					frFRXml("C'est bon si c'est court. ");
//					frFRXml("Que ce soit un .com, ou .org, ou .fr, tout dépend de vous aussi. ");
//					frFRXml("Créez un endroit dont vous serez fier un jour ! ");
//				g("span");
//			g("div");
//		g("p");
//	}
//
//	protected void _quoiFaireApres(QuestionReponse o) {     
//
//		o.questionIconeAvant("solid", "cart-plus");
//		o.question.enUS("What do I do after I bought a domain name? ").frFR("Qu'est-ce que je après j'ai acheté un nom de domaine ? ");
//		o.questionCourt.enUS("What do I do after I bought a domain name? ").frFR("Qu'est-ce que je après j'ai acheté un nom de domaine ? ");
//
//		o.reponseIconeAvant("solid", "clipboard-check");
//		o.reponse.enUS("Manage your domain. ").frFR("Gérer votre domaine. ");
//		o.reponseCourt.enUS("Manage your domain").frFR("Gérer votre domaine");
//	}
//	@Override protected void _quoiFaireApresHtml() { 
//		e("p").f();
//			e("div").f();
//				e("span").f();
//					enUSXml("Let me show you what it's like to manage a domain name. ");
//					enUSXml("I will log into my own registrar's site, ");
//
//					frFRXml("Laissez-moi vous montrer comment gérer un nom de domaine. ");
//					frFRXml("Je vais me connecter au site de mon propre enregistreur, ");
//				g("span");
//				e("a").a("href", "https://www.brinkster.com").f();
//					toutXml("brinkster.com");
//				g("a");
//				e("span").f();
//					enUSXml(". ");
//					frFRXml(". ");
//				g("span");
//			g("div");
//		g("p");
//	}
//
//	protected void _quoiFaireApres2(PageHtml o) {
//	}
//	@Override protected void _quoiFaireApres2Html() { 
//		e("ul").f();
//			e("li").f();
//				e("span").f();
//					enUSXml("I click on \"Login\". ");
//					frFRXml("Je clique sur « Login ». ");
//				g("span");
//			g("li");
//			if(pageAdmin) {
//				e("li").f();
//					e("span").f();
//						enUSXml("Now my username for the past 13 years at brinster.com is \"riskypants\" which is a little strange. ");
//						enUSXml("But it's a nickname I had a long time ago, and has nothing to do with my pants, just to be clear. ");
//
//						frFRXml("Mon nom d'utilisateur pour les 13 dernières années à brinster.com est « riskypants », ce qui est un peu étrange. ");
//						frFRXml("Mais c'est un surnom que j'avais depuis longtemps, et qui n'a rien à faire avec mes pantalon, vous comprennez. ");
//					g("span");  
//				g("li");
//			}
//			e("li").f(); 
//				e("span").f();
//					enUSXml("I click again on \"Login\". ");
//					frFRXml("Je clique encore sur « Login ». ");
//				g("span");
//			g("li");
//			e("li").f();
//				e("span").f();
//					enUSXml("I click on \"DOMAIN NAMES\". ");
//					enUSXml("And there you can see my domain names that are still alive, and those that are dead. ");
//					enUSXml("So domains expire yearly, and they can be renewed each year. ");
//
//					frFRXml("Je clique sur « DOMAIN NAMES ». ");
//					frFRXml("Et là vous pouvez voir mes noms de domaine qui sont encore vivants, et ceux qui sont morts. ");
//					frFRXml("Ainsi, les domaines expirent chaque année et peuvent être renouvelés chaque année. ");
//				g("span");
//			g("li");
//			e("li").f();
//				e("span").f();
//					enUSXml("I can also manage my site, so I will click on \"Manage\". ");
//					frFRXml("Je peux également gérer mon site, je clique sur « Manage ». ");
//				g("span");
//			g("li");
//		g("ul");
//	}
//
//	protected void _quoiFaireApres3(PageHtml o) {
//	}
//	@Override protected void _quoiFaireApres3Html() { 
//		e("ul").f();
//			e("li").f();
//				e("span").f();
//					enUSXml("If I click on \"Update Domain Registrant Information\" I can update my name and address information to make sure I receive spam from everyone on the Web who noticed I created a new domain. ");
//					enUSXml("I would recommend a P.O. Box for your business, rather than your home address, for more privacy. ");
//
//					frFRXml("Si je clique sur « Update Domain Registrant Information », je peux mettre à jour mon nom et mon adresse pour m'assurer que je reçois du spam de tous les internautes qui ont remarqué que j'ai créé un nouveau domaine. ");
//					frFRXml("Je recommanderais un Boîte à la poste pour votre entreprise, plutôt que votre adresse personnelle, pour plus d'intimité. ");
//				g("span");
//			g("li");
//		g("ul");
//	}
//
//	protected void _quoiFaireApres4(PageHtml o) {
//	}
//	@Override protected void _quoiFaireApres4Html() { 
//		e("ul").f();
//			e("li").f();
//				e("span").f();
//					enUSXml("If I go back and click on \"Update Name Servers\" I can point my website to a different DNS company than my registrar, brinkster.com. ");
//					enUSXml("This is handy for me, because I actually use my email SMTP provider fastmail.com as my DNS provider, so I put in the name servers of my DNS provider there. ");
//					enUSXml("You don't need a different DNS provider, you can usually use your registrar for email as well, but I choose fastmail for their privacy and excellent email interface. ");
//
//					frFRXml("Si je reviens et clique sur « Update Name Servers », je peux rediriger mon site vers une autre société DNS que mon registraire, brinkster.com. ");
//					frFRXml("C'est pratique pour moi, car j'utilise en fait mon fournisseur de messagerie SMTP fastmail.com comme fournisseur DNS, donc j'ai mis les serveurs de noms de mon fournisseur DNS là-bas. ");
//					frFRXml("Vous n'avez pas besoin d'un fournisseur de DNS différent, vous pouvez également utiliser votre bureau d'enregistrement pour le courrier électronique, mais j'ai choisi Fastmail pour leur confidentialité et leur excellente interface de messagerie. ");
//				g("span");
//			g("li");
//		g("ul");
//	}
//
//	protected void _quoiFaireApres5(PageHtml o) {
//	}
//	@Override protected void _quoiFaireApres5Html() { 
//		e("ul").f();
//			e("li").f();
//				e("span").f();
//					enUSXml("In a future lesson, we'll talk about creating a static IP address so that users can find your web server, on your computer, at your domain. ");
//					enUSXml("When you have this, you can ask the support team at your registrar, to create for you some \"A records\" at your static IP. ");
//					enUSXml("For example, I would ask for two A records to be created for \"computate.org\" and \"*.computate.org\" to my static IP address \"209.63.89.254\". ");
//					enUSXml("But since I use fastmail for my DNS, I can actually create my own A records for any of my domains in my account, which is nice. ");
//
//					frFRXml("Dans un futur leçon, nous parlerons de la création d'une adresse IP statique afin que les utilisateurs puissent trouver votre serveur Web, sur votre ordinateur, sur votre domaine. ");
//					frFRXml("Lorsque vous avez cela, vous pouvez demander à l'équipe de support de votre enregistreur, de créer pour vous des « enregistrements A » sur votre adresse IP statique. ");
//					frFRXml("Par exemple, je demanderais que deux enregistrements A soient créés pour « computate.org » et « *.computate.org » sur mon adresse IP statique « 209.63.89.254 ». ");
//					frFRXml("Mais comme j'utilise fastmail pour mon DNS, je peux créer mes propres enregistrements A pour chacun de mes domaines dans mon compte, ce qui est utile. ");
//				g("span");
//			g("li");
//		g("ul");
//	}
//
//	protected void _choisirDomainePlusTard(QuestionReponse o) {      
//
//		o.questionIconeAvant("solid", "fast-forward");
//		o.question.enUS("Can I start developing my website locally before deciding on my domain name? ").frFR("Puis-je commencer à développer mon site localement avant de choisir mon nom de domaine ? ");
//		o.questionCourt.enUS("Can I pick a domain name later? ").frFR("Puis-je choisir un nom de domaine plus tard ? ");
//
//		o.reponseIconeAvant("solid", "list-ol");
//		o.reponse.enUS("The hostname of your computer will depend on your domain name. ").frFR("Le nom d'hôte de votre ordinateur dépendra de votre nom de domaine. ");
//		o.reponseCourt.enUS("Your computer hostname depends on it").frFR("Le nom d'hôte de votre ordinateur le dépendra");
//	}
//	protected void _choisirDomainePlusTard2(PageParagraphe o) {      
//	}
//	@Override protected void _choisirDomainePlusTard2Html() { 
//		e("p").f();
//			e("div").f();
//				e("span").f();
//					enUSXml("If you don't know your domain name, it's going to bite you later. ");
//					enUSXml("Having a hostname that is a subdomain of your domain name makes it easier to develop and bring your site live. ");
//					enUSXml("You can give your computers hostnames that are subdomains of your own domain name to make it easy to develop and view your site locally and publicly from the same URL. ");
//					enUSXml("I like creating a directory for your domain name for storing SSL certs and other domain specific files together in the same place to be synced to all your computers. ");
//					enUSXml("So instead of making it harder on yourself, take this exciting opportunity to buy your domain name, it's less than $20 per year! ");
//					enUSXml("Now you can continue to launch your own successful website on your own computer. ");
//
//					frFRXml("Si vous ne connaissez pas votre nom de domaine, cela vous gâchera plus tard. ");
//					frFRXml("Avoir un nom d'hôte qui est un sous-domaine de votre nom de domaine facilite le développement et la mise en ligne de votre site. ");
//					frFRXml("Vous pouvez attribuer à vos ordinateurs des noms d'hôtes qui sont des sous-domaines de votre propre nom de domaine afin de faciliter le développement et l'affichage local et public de votre site à partir de la même URL. ");
//					frFRXml("J'aime créer un répertoire pour votre nom de domaine pour stocker des certificats SSL et d'autres fichiers spécifiques au domaine au même endroit pour être synchronisé avec tous vos ordinateurs. ");
//					frFRXml("Alors, au lieu de vous compliquer la vie, profitez de cette opportunité pour acheter votre nom de domaine, c'est moins de 20 euros par an! ");
//					frFRXml("Vous pouvez maintenant continuer à lancer votre propre site Web avec succès sur votre propre ordinateur. ");
//				g("span");
//			g("div");
//		g("p");
//	} 
}
