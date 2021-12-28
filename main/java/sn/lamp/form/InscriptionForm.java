package sn.lamp.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import sn.lamp.bean.Utilisateur;

public class InscriptionForm {
	public static final String CHAMP_NOM="nom";
	public static final String CHAMP_PRENOM="prenom";
	public static final String CHAMP_EMAIL="email";
	public static final String CHAMP_PASS="password";
	public static final String CHAMP_PROFIL="profil";
	public static final String CHAMP_CONFIRMATION="conf";
	public static final String VUE="/register";
	public static final String SUCCES="login";
	private String resultat;
	
	Map<String,String> erreurs=new HashMap<String,String>();
	Utilisateur utilisateur=new Utilisateur();
;	public Utilisateur  ValidateUtilisateur(HttpServletRequest req) {
		
		String email=getValeurChamp(req, CHAMP_EMAIL); 
		String pwd =getValeurChamp(req, CHAMP_PASS);
		String conf=getValeurChamp(req, CHAMP_CONFIRMATION);
		String nom=getValeurChamp(req, CHAMP_NOM);
		String prenom=getValeurChamp(req, CHAMP_PRENOM);
		String profil=getValeurChamp(req, CHAMP_PROFIL);
		try {
			ValidateEmail(email);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_EMAIL, e.getMessage());
			
		}
		utilisateur.setEmail(email);
		try {
			ValidateNom(nom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_NOM, e.getMessage());
			
		}
		utilisateur.setNom(prenom);
		try {
			ValidatePassword(conf, pwd);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_PASS, e.getMessage());
		
		}
		utilisateur.setMotDePass(pwd);
		try {
			ValidatePrenom(prenom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
		setErreurs(CHAMP_PRENOM, e.getMessage());
	
		}
		utilisateur.setPrenom(prenom);
		try {
			ValidateProfil(profil);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_PROFIL, e.getMessage());
			
		}
		utilisateur.setProfil(profil);
		if (erreurs.isEmpty()) {

			resultat = SUCCES;

		} else {
			resultat = VUE;
		}
		return utilisateur;
	}
public String getResultat() {
	return resultat;
}

	public Map<String, String> getErreurs() {
	return erreurs;
}
	private void ValidateEmail(String email) throws Exception {
		if(email==null) {
			throw new Exception("Merci de saisir  une adresse mail.");
		}
	}
	private void ValidateNom(String nom) throws Exception {
		if(nom==null) {
			throw new Exception("Merci de saisir  votre nom .");
		}
	}
	private void ValidateProfil(String profil) throws Exception {
		if(profil==null) {
			throw new Exception("Merci de saisir  votre nom .");
		}
	}
	private void ValidatePrenom(String prenom) throws Exception {
		if(prenom==null) {
			throw new Exception("Merci de saisir  votre prenom .");
		}
	}
	
	private void ValidatePassword(String conf,String pwd) throws Exception {
		if(!(conf==null)) {
			if(pwd!=null) {
				if(!conf.equals(pwd)) {
					throw new Exception("mot de passe et mot de pass confirmation sont different .");
				}
			}
		}else{
			throw new Exception("mot de passe et mot de pass confirmation sont different .");
		}
	}
	
	private void setErreurs(String champ,String nom) {
		erreurs.put(champ, nom);
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
