package org.computate.enUS.site.requete;

import java.io.IOException;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Base64;
import java.util.Stack;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.SolrServerException;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.computate.enUS.site.config.ConfigSite;
import org.computate.enUS.site.contexte.SiteContexte;
import org.computate.enUS.site.couverture.Couverture;
import org.computate.enUS.site.ecrivain.ToutEcrivain;
import org.computate.enUS.site.utilisateur.UtilisateurSite;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.auth.oauth2.KeycloakHelper;
import io.vertx.ext.sql.SQLConnection;
import io.vertx.ext.web.api.OperationRequest;

public class RequeteSite extends RequeteSiteGen<Object> implements Serializable {

	private static final long serialVersionUID = -6737494107881513257L;

	protected void _siteContexte_(Couverture<SiteContexte> c) {
		c.o(new SiteContexte());
	}

	protected void _configSite_(Couverture<ConfigSite> c) {
		ConfigSite o = siteContexte_.getConfigSite();
		c.o(o);
	}

	protected void _requeteSite_(Couverture<RequeteSite> c) { 
		c.o(this);
	}

	protected void _vertx(Couverture<Vertx> c) {
		if(siteContexte_ != null)
			c.o(siteContexte_.getVertx());
	}

	protected void _objetJson(Couverture<JsonObject> c) {
	}

	protected void _rechercheSolr(Couverture<SolrQuery> c) {
	}

	protected void _operationRequete(Couverture<OperationRequest> c) {
	}

	protected void _reponseRecherche(Couverture<QueryResponse> c) {
		if(rechercheSolr != null) {
			try {
				QueryResponse o = siteContexte_.getClientSolr().query(rechercheSolr);
				c.o(o);
			} catch (SolrServerException | IOException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	protected void _resultatsRecherche(Couverture<SolrDocumentList> c) {
		if(reponseRecherche != null) {
			SolrDocumentList o = reponseRecherche.getResults();
			c.o(o);
		}
	}

	protected void _w(Couverture<ToutEcrivain> c) {
	}

	protected void _utilisateurVertx(Couverture<JsonObject> c) {
		if(operationRequete != null) {
			JsonObject o = operationRequete.getUser();
			c.o(o);
		}

	}

	protected void _principalJson(Couverture<JsonObject> c) {
//		if(jetonAcces != null) {
//			JsonObject o = jetonAcces.principal();
//			c.o(o);
//		}
		if(utilisateurVertx != null) {
			JsonObject o = KeycloakHelper.parseToken(utilisateurVertx.getString("access_token"));
			c.o(o);
		}
	}

	protected void _utilisateurNomDomaine(Couverture<String> c) {
		String o = principalJson == null ? "example.com" : "example.com";
		c.o(o);
	}

	protected void _utilisateurNomEnsemble(Couverture<String> c) {
		String[] partis = StringUtils.split(utilisateurNomDomaine, ".");
		ArrayUtils.reverse(partis);
		String o = StringUtils.join(partis, ".");
		c.o(o);
	}

	protected void _utilisateurId(Couverture<String> c) {
		if(principalJson != null) {
			String o = KeycloakHelper.rawIdToken(principalJson);
//			String o = jetonAcces.getSubject();
			c.o(o);
		}
	}

	protected void _utilisateurNom(Couverture<String> c) {
		if(principalJson != null) {
//			String o = KeycloakHelper.preferredUsername(principalJson);
			String o = principalJson.getString("preferred_username");
//			String o = jetonAcces.getPreferredUsername();
			c.o(o);
		}
	}

	protected void _utilisateurNomFamille(Couverture<String> c) {
		if(principalJson != null) {
//			String o = KeycloakHelper.name(principalJson);
			String o = principalJson.getString("family_name");
//			String o = jetonAcces.getFamilyName();
			c.o(o);
		}
	}

	protected void _utilisateurPrenom(Couverture<String> c) { 
		if(principalJson != null) {
			String o = principalJson.getString("given_name");
//			String o = KeycloakHelper.name(principalJson);
			c.o(o);
		}
	}

	protected void _utilisateurNomComplet(Couverture<String> c) {
		if(principalJson != null) {
			String o = principalJson.getString("name");
//			String o = KeycloakHelper.name(principalJson);
			c.o(o);
		}
	}

	protected void _utilisateurSite(Couverture<UtilisateurSite> c) { 
	}

	protected void _xmlPile(Stack<String> o) {}

	protected void _documentSolr(Couverture<SolrDocument> c) {  
	}

	protected void _pageAchete(Couverture<Boolean> c) { 
		c.o(false);
	}

	protected void _pageAdmin(Couverture<Boolean> c) { 
		c.o(false);
	}

	protected void _h(Couverture<String> c) {}

	protected void _chiffrementCrypter(Couverture<Cipher> c) {
		if(!StringUtils.isEmpty(h)) {
			try {
				c.o(Cipher.getInstance("AES"));
			} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	protected void _chiffrementDecrypter(Couverture<Cipher> c) {
		if(!StringUtils.isEmpty(h)) {
			try {
				c.o(Cipher.getInstance("AES"));
			} catch (NoSuchAlgorithmException | NoSuchPaddingException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	protected void _digestMessage(Couverture<MessageDigest> c) {    
		if(!StringUtils.isEmpty(h)) {
			try {
				c.o(MessageDigest.getInstance("SHA-1"));
			} catch (NoSuchAlgorithmException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	protected void _crypterSel(Couverture<String> c) {
	}

	protected void _requetePk(Couverture<Long> c) {
		if(operationRequete != null)
			c.o(operationRequete.getParams().getLong("pk"));
	}

	protected void _connexionSql(Couverture<SQLConnection> c) {
	}

	protected void _crypterCle(Couverture<byte[]> c) {
		if(!StringUtils.isEmpty(h)) {
			try {
				c.o(Arrays.copyOf(digestMessage.digest((crypterSel + h).getBytes("UTF-8")), 16));
			} catch (UnsupportedEncodingException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	protected void _aleatoireSecurise(SecureRandom o) {}

	protected void _specCleSecrete(Couverture<SecretKeySpec> c) {
		if(!StringUtils.isEmpty(h)) {
			try {
				SecretKeySpec specCleSecrete = new SecretKeySpec(crypterCle, "AES");
				chiffrementCrypter.init(Cipher.ENCRYPT_MODE, specCleSecrete);
				chiffrementDecrypter.init(Cipher.DECRYPT_MODE, specCleSecrete);
				c.o(specCleSecrete);
			} catch (InvalidKeyException e) {
				ExceptionUtils.rethrow(e);
			}
		}
	}

	public byte[] crypterOctets(String o) {
		byte[] octetsNonCrypte = o.getBytes();
		byte[] encryptedByte = null;
		try {
			encryptedByte = chiffrementCrypter.doFinal(octetsNonCrypte);
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			ExceptionUtils.rethrow(e);
		}
		return encryptedByte;
	}

	public String decrypterOctets(byte[] octetsCrypte) {
		String texteNonCrypte = null;
		try {
			byte[] decryptedByte = chiffrementDecrypter.doFinal(octetsCrypte);
			texteNonCrypte = new String(decryptedByte);
		} catch (IllegalBlockSizeException | BadPaddingException e) {
			ExceptionUtils.rethrow(e);
		}
		return texteNonCrypte;
	}

	public String crypterStr(String o) {
		String texteCrypte = null;     
		if(chiffrementCrypter != null) {
			byte[] octetsNonCrypte = o.getBytes();
			try {
				byte[] encryptedByte = chiffrementCrypter.doFinal(octetsNonCrypte);
				Base64.Encoder codeur = Base64.getEncoder();
				texteCrypte = codeur.encodeToString(encryptedByte);
			} catch (IllegalBlockSizeException | BadPaddingException e) {
				ExceptionUtils.rethrow(e);
			}
		}
		return texteCrypte;
	}

	public String decrypterStr(String o) {
		String texteNonCrypte = null;
		if(o != null && chiffrementDecrypter != null) {
			Base64.Decoder decodeur = Base64.getDecoder();
			try {
				byte[] octetsCrypte = decodeur.decode(o);
				byte[] decryptedByte = chiffrementDecrypter.doFinal(octetsCrypte);
				texteNonCrypte = new String(decryptedByte);
			} catch (IllegalBlockSizeException | BadPaddingException e) {
				ExceptionUtils.rethrow(e);
			}
		}
		return texteNonCrypte;
	}
}
