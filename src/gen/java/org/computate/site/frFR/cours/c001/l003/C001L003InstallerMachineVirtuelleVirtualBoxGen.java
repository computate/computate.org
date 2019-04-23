package org.computate.site.frFR.cours.c001.l003;

import org.computate.site.frFR.ecrivain.ToutEcrivain;
import org.computate.site.frFR.couverture.Couverture;
import org.computate.site.frFR.page.parti.PageHtml;
import org.computate.site.frFR.requete.RequeteSiteFrFR;
import org.apache.commons.exec.CommandLine;
import org.apache.commons.lang3.StringUtils;
import java.util.ArrayList;
import org.computate.site.frFR.cluster.Cluster;
import javax.imageio.ImageIO;
import org.computate.site.frFR.page.parti.PagePart;
import org.apache.commons.exec.DefaultExecutor;
import java.awt.image.BufferedImage;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.computate.site.frFR.cours.c001.C001Lecon;
import org.apache.commons.text.StringEscapeUtils;
import org.computate.site.frFR.contexte.SiteContexteFrFR;
import java.io.File;
import org.apache.solr.client.solrj.SolrClient;
import java.util.Objects;
import org.computate.site.frFR.page.parti.QuestionReponse;
import io.vertx.core.json.JsonArray;
import org.apache.solr.common.SolrDocument;
import java.util.List;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.util.ClientUtils;
import org.apache.solr.common.SolrInputDocument;
import org.apache.commons.lang3.exception.ExceptionUtils;

/**	
 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstClasse_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true">Trouver la classe commentInstaller dans Solr</a>
 * <br/>
 **/
public abstract class C001L003InstallerMachineVirtuelleVirtualBoxGen<DEV> extends C001Lecon {

	public static final String C001L003InstallerMachineVirtuelleVirtualBox_UnNom = "le leçon";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomSingulier = "leçon";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomPluriel = "leçons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_H1 = "Comment puis-je essayer CentOS 7 Linux sans remplacer mon système d'exploitation ? ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_H2 = "Essayez CentOS 7 sur une machine virtuelle VirtualBox. ";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_LesNoms = "les leçons";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_NomVar = "leçon";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_Couleur = "green";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_IconeGroupe = "regular";
	public static final String C001L003InstallerMachineVirtuelleVirtualBox_IconeNom = "question";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_Uri = "/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage_ImageUri = "/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_Uri = "/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box";
	public static final String C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage_ImageUri = "/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png";

	/////////
	// moi //
	/////////

	public static final String moiP1 = "Bonjour, je m'appelle Christophe Tate. Je suis un consultant pour Red Hat et j'adore les logiciels open source. ";
	public static final String moiP2 = "Je vous aiderai à créer votre propre site Web avec succès, sur votre propre ordinateur, avec des logiciels open-source. ";
	public static final String moiP = moiP1 + moiP2;

	/**	L'entité « moi »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml moi = new PageHtml();
	public Couverture<PageHtml> moiCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("moi").o(moi);

	/**	<br/>L'entité « moi »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:moi">Trouver l'entité moi dans Solr</a>
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
	protected C001L003InstallerMachineVirtuelleVirtualBox moiInit() {
		if(moi != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(moi, "moi");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(moi, "moi");
		}
		if(!moiCouverture.dejaInitialise) {
			_moi(moi);
		}
		moi.initLoinPourClasse(requeteSite_);
		moiCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyMoi(PageHtml o) {
		{ e("p").a("class", "").f();
				sx(moiP1);
				sx(moiP2);
		} g("p");
	}
	public void htmlBodyMoi() {
		moi.htmlAvant();
		htmlBodyMoi(moi);
		moi.htmlApres();
	}

	/////////////
	// ecraser //
	/////////////

	public static final String ecraserH3I1 = "fas fa-eraser";
	public static final String ecraserH3I = ecraserH3I1;
	public static final String ecraserH3Span1 = "Est-t-il possible d'essayer Linux sans écraser mon système d'exploitation ? ";
	public static final String ecraserH3Span = ecraserH3Span1;
	public static final String ecraserCourtH3Span1 = "Linux va-t-il détruire mon système d'exploitation ? ";
	public static final String ecraserCourtH3Span = ecraserCourtH3Span1;
	public static final String ecraserH4I1 = "fab fa-linux";
	public static final String ecraserH4I = ecraserH4I1;
	public static final String ecraserH4Span1 = "La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. ";
	public static final String ecraserH4Span = ecraserH4Span1;
	public static final String ecraserCourtH4Span1 = "La virtualisation peut exécuter Linux sous tous les systèmes d'exploitation. ";
	public static final String ecraserCourtH4Span = ecraserCourtH4Span1;
	public static final String ecraserPDiv1 = "Grâce à la virtualisation, c'est simple à essayer les systèmes d'exploitation sur votre propre ordinateur ! ";
	public static final String ecraserPDiv2 = "La virtualisation vous permet de démarrer des machines virtuelles. ";
	public static final String ecraserPDiv3 = "Les machines virtuelles sont des systèmes d'exploitation entiers s'exécutant sous votre propre système d'exploitation via un logiciel. ";
	public static final String ecraserPDiv4 = "La virtualisation est gratuite, grâce à des nombreux logiciels fantastiques ! ";
	public static final String ecraserPDiv5 = "Pour Linux, je recommande Libvirt pour plus de puissance, mais pour une solution multi-plateforme, nous allons utiliser VirtualBox dans cette leçon. ";
	public static final String ecraserPDiv6 = "Je vais vous apprendre comment faire fonctionner une machine virtuelle CentOS 7 sur votre système. ";
	public static final String ecraserPDiv = ecraserPDiv1 + ecraserPDiv2 + ecraserPDiv3 + ecraserPDiv4 + ecraserPDiv5 + ecraserPDiv6;

	/**	L'entité « ecraser »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 */
	protected PageHtml ecraser = new PageHtml();
	public Couverture<PageHtml> ecraserCouverture = new Couverture<PageHtml>().p(this).c(PageHtml.class).var("ecraser").o(ecraser);

	/**	<br/>L'entité « ecraser »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut PageHtml(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:ecraser">Trouver l'entité ecraser dans Solr</a>
	 * <br/>
	 * @param ecraser est l'entité déjà construit. 
	 **/
	protected abstract void _ecraser(PageHtml o);

	public PageHtml getEcraser() {
		return ecraser;
	}

	public void setEcraser(PageHtml ecraser) {
		this.ecraser = ecraser;
		this.ecraserCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox ecraserInit() {
		if(ecraser != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(ecraser, "ecraser");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(ecraser, "ecraser");
		}
		if(!ecraserCouverture.dejaInitialise) {
			_ecraser(ecraser);
		}
		ecraser.initLoinPourClasse(requeteSite_);
		ecraserCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyEcraser(PageHtml o) {
		{ e("h3").a("class", "").f();
			{ e("i").a("class", ecraserH3I1, " site-menu-icon ").f();
			} g("i");
			{ e("span").a("class", "").f();
					sx(ecraserH3Span1);
					sx(ecraserCourtH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", "").f();
			{ e("i").a("class", ecraserH4I1, " site-menu-icon ").f();
			} g("i");
			{ e("span").a("class", "").f();
					sx(ecraserH4Span1);
					sx(ecraserCourtH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", "").f();
			{ e("div").a("class", "").f();
					sx(ecraserPDiv1);
					sx(ecraserPDiv2);
					sx(ecraserPDiv3);
					sx(ecraserPDiv4);
					sx(ecraserPDiv5);
					sx(ecraserPDiv6);
			} g("div");
		} g("p");
	}
	public void htmlBodyEcraser() {
		ecraser.htmlAvant();
		htmlBodyEcraser(ecraser);
		ecraser.htmlApres();
	}

	//////////////////////
	// commentInstaller //
	//////////////////////

	public static final String commentInstallerH3I1 = "fas fa-person-carry";
	public static final String commentInstallerH3I = commentInstallerH3I1;
	public static final String commentInstallerH3Span1 = "Comment installer VirtualBox pour la virtualisation ? ";
	public static final String commentInstallerH3Span = commentInstallerH3Span1;
	public static final String commentInstallerCourtH3Span1 = "Comment installer VirtualBox ? ";
	public static final String commentInstallerCourtH3Span = commentInstallerCourtH3Span1;
	public static final String commentInstallerH4I1 = "fab fa-cloud-download-alt";
	public static final String commentInstallerH4I = commentInstallerH4I1;
	public static final String commentInstallerH4Span1 = "Téléchargez-le simplement depuis virtualbox.org. ";
	public static final String commentInstallerH4Span = commentInstallerH4Span1;
	public static final String commentInstallerCourtH4Span1 = "Téléchargez-le depuis virtualbox.org";
	public static final String commentInstallerCourtH4Span = commentInstallerCourtH4Span1;
	public static final String commentInstallerPUlLi1Span1 = "VirtualBox est facile à télécharger et à installer. ";
	public static final String commentInstallerPUlLi1Span = commentInstallerPUlLi1Span1;
	public static final String commentInstallerPUlLi2Span1 = "Visitez cette URL : ";
	public static final String commentInstallerPUlLi2Span = commentInstallerPUlLi2Span1;
	public static final String commentInstallerPUlLi2A1 = "https://www.virtualbox.org/wiki/Downloads";
	public static final String commentInstallerPUlLi2A = commentInstallerPUlLi2A1;
	public static final String commentInstallerPUlLi3Span1 = "Vous pouvez le télécharger sur un hôte Windows, un hôte OS X, un hôte Linux ou Solaris. ";
	public static final String commentInstallerPUlLi3Span = commentInstallerPUlLi3Span1;
	public static final String commentInstallerPUlLi4Span1 = "Parce que j'utilise CentOS 7, qui est similaire à RHEL, j'utiliserai les instructions RHEL tout en bas de la page. ";
	public static final String commentInstallerPUlLi4Span = commentInstallerPUlLi4Span1;

	/**	L'entité « commentInstaller »
	 *	Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 */
	protected QuestionReponse commentInstaller = new QuestionReponse();
	public Couverture<QuestionReponse> commentInstallerCouverture = new Couverture<QuestionReponse>().p(this).c(QuestionReponse.class).var("commentInstaller").o(commentInstaller);

	/**	<br/>L'entité « commentInstaller »
	 * Il est construit avant d'être initialisé avec le constructeur par défaut QuestionReponse(). 
	 * <br/><a href="http://localhost:10383/solr/computate/select?q=*:*&fq=partEstEntite_indexed_boolean:true&fq=classeNomCanonique_frFR_indexed_string:org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox&fq=classeEtendGen_indexed_boolean:true&fq=entiteVar_frFR_indexed_string:commentInstaller">Trouver l'entité commentInstaller dans Solr</a>
	 * <br/>
	 * @param commentInstaller est l'entité déjà construit. 
	 **/
	protected abstract void _commentInstaller(QuestionReponse o);

	public QuestionReponse getCommentInstaller() {
		return commentInstaller;
	}

	public void setCommentInstaller(QuestionReponse commentInstaller) {
		this.commentInstaller = commentInstaller;
		this.commentInstallerCouverture.dejaInitialise = true;
	}
	protected C001L003InstallerMachineVirtuelleVirtualBox commentInstallerInit() {
		if(commentInstaller != null) {
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(commentInstaller, "commentInstaller");
			((C001L003InstallerMachineVirtuelleVirtualBox)this).avantPagePart(commentInstaller, "commentInstaller");
		}
		if(!commentInstallerCouverture.dejaInitialise) {
			_commentInstaller(commentInstaller);
		}
		commentInstaller.initLoinPourClasse(requeteSite_);
		commentInstallerCouverture.dejaInitialise(true);
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}
	public void htmlBodyCommentInstaller(QuestionReponse o) {
		{ e("h3").a("class", "").f();
			{ e("i").a("class", commentInstallerH3I1, " site-menu-icon ").f();
			} g("i");
			{ e("span").a("class", "").f();
					sx(commentInstallerH3Span1);
					sx(commentInstallerCourtH3Span1);
			} g("span");
		} g("h3");
		{ e("h4").a("class", "").f();
			{ e("i").a("class", commentInstallerH4I1, " site-menu-icon ").f();
			} g("i");
			{ e("span").a("class", "").f();
					sx(commentInstallerH4Span1);
					sx(commentInstallerCourtH4Span1);
			} g("span");
		} g("h4");
		{ e("p").a("class", "").f();
			{ e("ul").a("class", "").f();
				{ e("li").a("class", "").f();
					{ e("span").a("class", "").f();
							sx(commentInstallerPUlLi1Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", "").f();
					{ e("span").a("class", "").f();
							sx(commentInstallerPUlLi2Span1);
					} g("span");
					{ e("a").a("class", "").f();
							sx(commentInstallerPUlLi2A1);
					} g("a");
				} g("li");
				{ e("li").a("class", "").f();
					{ e("span").a("class", "").f();
							sx(commentInstallerPUlLi3Span1);
					} g("span");
				} g("li");
				{ e("li").a("class", "").f();
					{ e("span").a("class", "").f();
							sx(commentInstallerPUlLi4Span1);
					} g("span");
				} g("li");
			} g("ul");
		} g("p");
	}
	public void htmlBodyCommentInstaller() {
		commentInstaller.htmlAvant();
		htmlBodyCommentInstaller(commentInstaller);
		commentInstaller.htmlApres();
	}

	//////////////
	// initLoin //
	//////////////

	protected boolean dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox = false;

	public C001L003InstallerMachineVirtuelleVirtualBox initLoinC001L003InstallerMachineVirtuelleVirtualBox(RequeteSiteFrFR requeteSite_) {
		setRequeteSite_(requeteSite_);
		if(!dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox) {
			dejaInitialiseC001L003InstallerMachineVirtuelleVirtualBox = true;
			initLoinC001L003InstallerMachineVirtuelleVirtualBox();
		}
		return (C001L003InstallerMachineVirtuelleVirtualBox)this;
	}

	public void initLoinC001L003InstallerMachineVirtuelleVirtualBox() {
		super.initLoinC001Lecon(requeteSite_);
		initC001L003InstallerMachineVirtuelleVirtualBox();
	}

	public void initC001L003InstallerMachineVirtuelleVirtualBox() {
		moiInit();
		ecraserInit();
		commentInstallerInit();
	}

	@Override public void initLoinPourClasse(RequeteSiteFrFR requeteSite_) {
		initLoinC001L003InstallerMachineVirtuelleVirtualBox(requeteSite_);
	}

	/////////////////
	// requeteSite //
	/////////////////

	public void requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(RequeteSiteFrFR requeteSite_) {
			super.requeteSiteC001Lecon(requeteSite_);
		if(moi != null)
			moi.setRequeteSite_(requeteSite_);
		if(ecraser != null)
			ecraser.setRequeteSite_(requeteSite_);
		if(commentInstaller != null)
			commentInstaller.setRequeteSite_(requeteSite_);
	}

	public void requeteSitePourClasse(RequeteSiteFrFR requeteSite_) {
		requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(requeteSite_);
	}

	/////////////
	// obtenir //
	/////////////

	@Override public Object obtenirPourClasse(String var) throws Exception {
		String[] vars = StringUtils.split(var, ".");
		Object o = null;
		for(String v : vars) {
			if(o == null)
				o = obtenirC001L003InstallerMachineVirtuelleVirtualBox(v);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.obtenirPourClasse(v);
			}
		}
		return o;
	}
	public Object obtenirC001L003InstallerMachineVirtuelleVirtualBox(String var) throws Exception {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;
		switch(var) {
			case "moi":
				return oC001L003InstallerMachineVirtuelleVirtualBox.moi;
			case "ecraser":
				return oC001L003InstallerMachineVirtuelleVirtualBox.ecraser;
			case "commentInstaller":
				return oC001L003InstallerMachineVirtuelleVirtualBox.commentInstaller;
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
				o = attribuerC001L003InstallerMachineVirtuelleVirtualBox(v, val);
			else if(o instanceof Cluster) {
				Cluster cluster = (Cluster)o;
				o = cluster.attribuerPourClasse(v, val);
			}
		}
		return o != null;
	}
	public Object attribuerC001L003InstallerMachineVirtuelleVirtualBox(String var, Object val) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;
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
					o = definirC001L003InstallerMachineVirtuelleVirtualBox(v, val);
				else if(o instanceof Cluster) {
					Cluster cluster = (Cluster)o;
					o = cluster.definirPourClasse(v, val);
				}
			}
		}
		return o != null;
	}
	public Object definirC001L003InstallerMachineVirtuelleVirtualBox(String var, String val) {
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
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/frFR/cours/001/003-essayer-linux-sur-une-machine-virtuelle-avec-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxFrFRPage");
				System.out.println(" * ImageLargeur.frFR: " + img.getWidth());
				System.out.println(" * ImageHauteur.frFR: " + img.getHeight());
			}
			{
				new File("/usr/local/src/computate.org-static/png/enUS/course/001").mkdirs();
				executeur.execute(CommandLine.parse("/usr/bin/CutyCapt --url=https://site.computate.org:10080/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box?pageRecapituler=true --out=/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
				BufferedImage img = ImageIO.read(new File("/usr/local/src/computate.org-static/png/enUS/course/001/003-try-linux-on-a-virtual-machine-on-virtual-box-999.png"));
				System.out.println("C001L003InstallerMachineVirtuelleVirtualBoxEnUSPage");
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
			RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
			requeteSite.initLoinRequeteSiteFrFR();
			SiteContexteFrFR siteContexte = new SiteContexteFrFR();
			siteContexte.getConfigSite().setConfigChemin("/usr/local/src/computate.org/config/computate.org.config");
			siteContexte.initLoinSiteContexteFrFR();
			siteContexte.setRequeteSite_(requeteSite);
			requeteSite.setSiteContexte_(siteContexte);
			SolrQuery rechercheSolr = new SolrQuery();
			rechercheSolr.setQuery("*:*");
			rechercheSolr.setRows(1);
			rechercheSolr.addFilterQuery("id:" + ClientUtils.escapeQueryChars("org.computate.site.frFR.cours.c001.l003.C001L003InstallerMachineVirtuelleVirtualBox"));
			QueryResponse reponseRecherche = requeteSite.getSiteContexte_().getClientSolr().query(rechercheSolr);
			if(reponseRecherche.getResults().size() > 0)
				requeteSite.setDocumentSolr(reponseRecherche.getResults().get(0));
			C001L003InstallerMachineVirtuelleVirtualBox o = new C001L003InstallerMachineVirtuelleVirtualBox();
			o.requeteSiteC001L003InstallerMachineVirtuelleVirtualBox(requeteSite);
			o.initLoinC001L003InstallerMachineVirtuelleVirtualBox(requeteSite);
			o.indexerC001L003InstallerMachineVirtuelleVirtualBox();
		} catch(Exception e) {
			ExceptionUtils.rethrow(e);
		}
	}


	@Override public void indexerPourClasse() throws Exception {
		indexerC001L003InstallerMachineVirtuelleVirtualBox();
	}

	@Override public void indexerPourClasse(SolrInputDocument document) throws Exception {
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox(SolrClient clientSolr) throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox() throws Exception {
		SolrInputDocument document = new SolrInputDocument();
		indexerC001L003InstallerMachineVirtuelleVirtualBox(document);
		SolrClient clientSolr = requeteSite_.getSiteContexte_().getClientSolr();
		clientSolr.add(document);
		clientSolr.commit();
	}

	public void indexerC001L003InstallerMachineVirtuelleVirtualBox(SolrInputDocument document) throws Exception {
		super.indexerC001Lecon(document);

	}

	public void desindexerC001L003InstallerMachineVirtuelleVirtualBox() throws Exception {
		RequeteSiteFrFR requeteSite = new RequeteSiteFrFR();
		requeteSite.initLoinRequeteSiteFrFR();
		SiteContexteFrFR siteContexte = new SiteContexteFrFR();
		siteContexte.initLoinSiteContexteFrFR();
		siteContexte.setRequeteSite_(requeteSite);
		requeteSite.setSiteContexte_(siteContexte);
		requeteSite.setConfigSite_(siteContexte.getConfigSite());
		initLoinC001L003InstallerMachineVirtuelleVirtualBox(siteContexte.getRequeteSite_());
		SolrClient clientSolr = siteContexte.getClientSolr();
		clientSolr.deleteById(id.toString());
		clientSolr.commit();
	}

	/////////////
	// stocker //
	/////////////

	@Override public void stockerPourClasse(SolrDocument solrDocument) {
		stockerC001L003InstallerMachineVirtuelleVirtualBox(solrDocument);
	}
	public void stockerC001L003InstallerMachineVirtuelleVirtualBox(SolrDocument solrDocument) {
		C001L003InstallerMachineVirtuelleVirtualBox oC001L003InstallerMachineVirtuelleVirtualBox = (C001L003InstallerMachineVirtuelleVirtualBox)this;

		super.stockerC001Lecon(solrDocument);
	}

	///////////////////
	// htmlBodyCourt //
	///////////////////

	public void htmlBodyCourt() {
		htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBox();
	}

	public void htmlBodyCourtC001L003InstallerMachineVirtuelleVirtualBox() {
		if(moi != null)
			moi.htmlBodyCourt();
		if(ecraser != null)
			ecraser.htmlBodyCourt();
		if(commentInstaller != null)
			commentInstaller.htmlBodyCourt();
	}

	//////////////
	// htmlBody //
	//////////////

	@Override public void htmlBody() {
		htmlBodyC001L003InstallerMachineVirtuelleVirtualBox();
		super.htmlBody();
	}

	public void htmlBodyC001L003InstallerMachineVirtuelleVirtualBox() {
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyMoi();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyEcraser();
		((C001L003InstallerMachineVirtuelleVirtualBox)this).htmlBodyCommentInstaller();
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
		if(!(o instanceof C001L003InstallerMachineVirtuelleVirtualBox))
			return false;
		C001L003InstallerMachineVirtuelleVirtualBox that = (C001L003InstallerMachineVirtuelleVirtualBox)o;
		return super.equals(o);
	}

	//////////////
	// toString //
	//////////////

	@Override public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(super.toString() + "\n");
		sb.append("C001L003InstallerMachineVirtuelleVirtualBox {");
		sb.append(" }");
		return sb.toString();
	}

	public static final String[] C001L003InstallerMachineVirtuelleVirtualBoxVals = new String[] { moiP1, moiP2, ecraserH3I1, ecraserH3Span1, ecraserCourtH3Span1, ecraserH4I1, ecraserH4Span1, ecraserCourtH4Span1, ecraserPDiv1, ecraserPDiv2, ecraserPDiv3, ecraserPDiv4, ecraserPDiv5, ecraserPDiv6, commentInstallerH3I1, commentInstallerH3Span1, commentInstallerCourtH3Span1, commentInstallerH4I1, commentInstallerH4Span1, commentInstallerCourtH4Span1, commentInstallerPUlLi1Span1, commentInstallerPUlLi2Span1, commentInstallerPUlLi2A1, commentInstallerPUlLi3Span1, commentInstallerPUlLi4Span1 };
}
