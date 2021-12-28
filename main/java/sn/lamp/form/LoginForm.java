package sn.lamp.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import sn.lamp.bean.Utilisateur;


public class LoginForm {
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_PASS = "password";
	Utilisateur test=new Utilisateur();
	private String resultat;
	Map<String,String > erreurs=new HashMap<String,String>();
	public Utilisateur loginTest(HttpServletRequest request) {
		String email = getValeurChamp(request, CHAMP_EMAIL);
		String motDePasse = getValeurChamp(request, CHAMP_PASS);
		
		
		try {
			validateEmail(email);
		} catch (Exception e) {
			setErreurs(CHAMP_EMAIL, e.getMessage());
		}
		test.setEmail(email);
		try {
			validatePWD(motDePasse);
		} catch (Exception e) {
			setErreurs(CHAMP_PASS, e.getMessage());
		}
		test.setMotDePass(motDePasse);
		
		return test;
		
	}
	
	public void  validateEmail(String email) throws Exception {
		if(email==null) {
			throw new Exception("email est obligatoire ! :) ");
		}
	}
	public void  validatePWD(String password) throws Exception {
		if(password==null) {
			throw new Exception("mots de pass  est obligatoire ! :) ");
		}
	}
	public void setErreurs(String champ, String message) {
		erreurs.put(champ, message);
	}

	public Map<String, String> getErreurs() {
		return erreurs;
	}

	public String getResultat() {
		return resultat;
	}

	private static String getValeurChamp(HttpServletRequest request, String nomChamp) {
		String valeur = request.getParameter(nomChamp);
		if (valeur == null || valeur.trim().length() == 0) {
			return null;
		} else {
			return valeur.trim();
		}
	
}
}
