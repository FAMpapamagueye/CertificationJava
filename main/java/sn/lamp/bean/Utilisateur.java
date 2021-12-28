package sn.lamp.bean;

public class Utilisateur {
	private String prenom;
	private String nom;
	private String email;
	private String motDePass;
	private String Profil;
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	public Utilisateur(String prenom, String nom, String email, String motDePass, String profil) {
		super();
		this.prenom = prenom;
		this.nom = nom;
		this.email = email;
		this.motDePass = motDePass;
		Profil = profil;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMotDePass() {
		return motDePass;
	}
	public void setMotDePass(String motDePass) {
		this.motDePass = motDePass;
	}
	public String getProfil() {
		return Profil;
	}
	public void setProfil(String profil) {
		Profil = profil;
	}
	

}
