package beanCategorie;

import java.util.ArrayList;
import bean_Produit.*;

@SuppressWarnings("serial")
public class Categorie {
	
	private int codeCategorie;
	private String nomCategorie;
	private ArrayList<Produit> listeProduits;


	public Categorie(int codeCategorie, String nomCategorie) {
		this.codeCategorie = codeCategorie;
		this.nomCategorie = nomCategorie;
		this.listeProduits = new ArrayList<Produit>();
	}
	
	public void ajouteProduit(Produit p) {
		listeProduits.add(p);
	}

	public int getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(int codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public String getNomCategorie() {
		return nomCategorie;
	}
	public void setNomCategorie(String nomCategorie) {
		this.nomCategorie = nomCategorie;
	}

	public void ajouterProduit(Produit p) {
		listeProduits.add(p);
	}

	@Override
	public String toString() {
		return "Categorie{" +
				"codeCategorie=" + codeCategorie +
				", nomCategorie='" + nomCategorie + '\'' +
				", listeProduits=" + listeProduits +
				'}';
	}
			

}
