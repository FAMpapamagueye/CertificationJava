package sn.lamp.bean;



public class Menu {
private Double prix;
private String jourDate;
private  String nom;

public Menu() {
	// TODO Auto-generated constructor stub
}

public Menu(Double prix, String jourDate, String nom) {
	super();
	this.prix = prix;
	this.jourDate = jourDate;
	this.nom = nom;
}

public Double getPrix() {
	return prix;
}

public void setPrix(Double prix) {
	this.prix = prix;
}

public String getJourDate() {
	return jourDate;
}

public void setJourDate(String jourDate) {
	this.jourDate = jourDate;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

}
