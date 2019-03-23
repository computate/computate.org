package org.computate.site.enUS.config;

import java.io.File;
import java.io.Serializable;
import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.builder.fluent.Configurations;
import org.apache.commons.configuration2.ex.ConfigurationException;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.computate.site.enUS.contexte.SiteContexteEnUS;
import org.computate.site.enUS.couverture.Couverture;
import org.computate.site.enUS.requete.RequeteSiteEnUS;

/**	
 *	Loads the properties in the application config file into specific fields. 
 **/
public class ConfigSite extends ConfigSiteGen<Object> implements Serializable {

	protected void _requeteSite_(RequeteSiteEnUS o) {
	}

	protected void _siteContexte_(Couverture<SiteContexteEnUS> c) {
	}

	protected void _configChemin(Couverture<String> c) {   
		String o = System.getenv("configChemin");
		c.o(o);
	}

	/**	
	 *	The INI Configuration Object for the config file. 
	 **/
	protected void _config(Couverture<INIConfiguration> c) {
		Configurations configurations = new Configurations();
		File fichierConfig = new File(configChemin);
		if(configChemin != null && fichierConfig.exists()) {
			try {
				INIConfiguration o = configurations.ini(fichierConfig);
				c.o(o);
			} catch (ConfigurationException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	protected void _identifiantSite(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv("appliNom");
		else
			o = config.getString("appliNom");

		c.o(o);
	}

	protected void _prefixeEchappe(Couverture<String> c) {
		String o = StringUtils.replace(identifiantSite, ".", "..") + ".";
		c.o(o);
	}

	protected void _appliChemin(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, StringUtils.substringBefore(configChemin, "/config/"));

		c.o(o);
	}

	protected void _racineDocument(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _nomEntreprise(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _nomDomaine(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _siteNomHote(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _sitePort(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var));
		else
			o = config.getInt(prefixeEchappe + c.var, 8080);
		c.o(o);
	}

	protected void _authRoyaume(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _authRessource(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _authSecret(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _authSslRequis(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), "all");
		c.o(o);
	}

	protected void _sslJksChemin(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _sslJksMotDePasse(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _authUrl(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _selCryptage(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _motDePasseCryptage(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _siteUrlBase(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), "https://" + siteNomHote);
		c.o(o);
	}

	protected void _siteNomAffichage(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = StringUtils.defaultIfBlank(config.getString(prefixeEchappe + c.var), identifiantSite);
		c.o(o);
	}

	protected void _jdbcClassePilote(Couverture<String> c) {
		String o;
		if(config == null)
			o = StringUtils.defaultIfEmpty(System.getenv(c.var), "org.postgresql.Driver");
		else
			o = config.getString(prefixeEchappe + c.var, "org.postgresql.Driver");
		c.o(o);
	}

	protected void _jdbcUtilisateur(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _jdbcMotDePasse(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _jdbcTailleMaxPiscine(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var), 15);
		else
			o = config.getInt(prefixeEchappe + c.var, 15);
		c.o(o);
	}

	protected void _jdbcTailleInitialePiscine(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var), 3);
		else
			o = config.getInt(prefixeEchappe + c.var, 3);
		c.o(o);
	}

	protected void _jdbcTailleMinPiscine(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var), 0);
		else
			o = config.getInt(prefixeEchappe + c.var, 0);
		c.o(o);
	}

	protected void _jdbcMaxDeclarations(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var), 0);
		else
			o = config.getInt(prefixeEchappe + c.var, 0);
		c.o(o);
	}

	protected void _jdbcMaxDeclarationsParConnexion(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var), 0);
		else
			o = config.getInt(prefixeEchappe + c.var, 0);
		c.o(o);
	}

	protected void _jdbcTempsInactiviteMax(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = NumberUtils.toInt(System.getenv(c.var), 0);
		else
			o = config.getInt(prefixeEchappe + c.var, 0);
		c.o(o);
	}

	protected void _jdbcUrl(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _solrUrl(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _solrUrlComputate(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _jetonIdentitePaypal(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteFacebook(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteTwitter(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteGooglePlus(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteInstagram(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteYoutube(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _identifiantCanalYoutube(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _comptePinterest(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteOpenclipart(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _compteMail(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _roleAdmin(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _mailAdmin(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _nombreExecuteurs(Couverture<Integer> c) {
		Integer o;
		if(config == null)
			o = Integer.parseInt(System.getenv(c.var), 1);
		else
			o = config.getInt(prefixeEchappe + c.var, 1);
		c.o(o);
	}

	protected void _openApiVersion(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "3.0.0");
		c.o(o);
	}

	protected void _apiDescription(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "2.0");
		c.o(o);
	}

	protected void _apiTitre(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, siteNomAffichage);
		c.o(o);
	}

	protected void _apiTermsService(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "http://swagger.io/terms/");
		c.o(o);
	}

	protected void _apiVersion(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "1");
		c.o(o);
	}

	protected void _apiContactMail(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var);
		c.o(o);
	}

	protected void _apiLicenceNom(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "Apache 2.0");
		c.o(o);
	}

	protected void _apiLicenceUrl(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "http://www.apache.org/licenses/LICENSE-2.0.html");
		c.o(o);
	}

	protected void _apiNomHote(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, siteNomHote);
		c.o(o);
	}

	protected void _apiCheminBase(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "/api/v" + apiVersion);
		c.o(o);
	}

	protected void _vertxServiceAddresse(Couverture<String> c) {
		String o;
		if(config == null)
			o = System.getenv(c.var);
		else
			o = config.getString(prefixeEchappe + c.var, "addresse");
		c.o(o);
	}
}
