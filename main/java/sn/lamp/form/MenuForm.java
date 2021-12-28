package sn.lamp.form;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import sn.lamp.bean.Menu;

public class MenuForm {
	public static final String CHAMP_PRIX="prix";
	public static final String CHAMP_DATE="date";
	public static final String CHAMP_NOM="nom";
	Menu menu=new Menu();
	private Map<String,String> erreurs=new HashMap<String,String>();
	private String message;
	private String resultat;
	public Menu tets(HttpServletRequest req) {
		String prix=getValeurChamp(req, CHAMP_PRIX);
		String date=getValeurChamp(req, CHAMP_DATE);
		String nom=getValeurChamp(req, CHAMP_NOM);
		try {
			ValidateDate(date);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_DATE,e.getMessage());
		}
		menu.setJourDate(date);
		try {
			Validatenom(nom);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_NOM,e.getMessage());
		}
		menu.setNom(nom);
		try {
			ValidatePrix(prix);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			setErreurs(CHAMP_PRIX,e.getMessage());
		}
		menu.setPrix(Double.parseDouble(prix));
		return menu;
	}
	private void ValidatePrix(String prix) throws Exception {
		if(prix==null) {
			throw new Exception("Merci de saisir  votre prenom .");
		}
	}private void ValidateDate(String date) throws Exception {
		if(date==null) {
			throw new Exception("Merci de saisir  votre prenom .");
		}
	}private void Validatenom(String nom) throws Exception {
		if(nom==null) {
			throw new Exception("Merci de saisir  votre prenom .");
		}
	}
	
	public String getMessage() {
		return message;
	}
	public String getResultat() {
		return resultat;
	}
	private void setErreurs(String champ,String nom) {
		erreurs.put(champ, nom);
	}
	
	public Map<String, String> getErreurs() {
		return erreurs;
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
