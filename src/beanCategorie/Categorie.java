package beanCategorie;

import java.util.ArrayList;
import bean_Produit.*;

public class Categorie extends ArrayList<Produit> {
	
	private int codeCategorie;
	private String nomCategorie;
	
	
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
			

}
