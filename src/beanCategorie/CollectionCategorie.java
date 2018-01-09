package beanCategorie;

import java.util.ArrayList;
import bean_Produit.*;

@SuppressWarnings("serial")
public class CollectionCategorie extends ArrayList<Categorie>{
	
	private int curseur = 0;

	
	public CollectionCategorie(int curseur) {
		this.curseur = curseur;
	}
	public Categorie getCatégorieCourante() {
		return this.get(curseur);
	}
	public void suivant() {
		// TODO Auto-generated method stub
		if (curseur == this.size()-1) {
			return;
		}
		curseur++;

	}
	public void precedent() {
		// TODO Auto-generated method stub
		if (curseur == 0) {
			return;
		}
		curseur--;

	}
	public void premier() {
		// TODO Auto-generated method stub
		curseur = 0;

	}
	public void dernier() {
		// TODO Auto-generated method stub
		curseur=this.size()-1;

	}
	public boolean estPremier() {
		// TODO Auto-generated method stub
		if (curseur == 0) {
			return true;
		}
		return false;
	}
	public boolean estDernier() {
	if (curseur == this.size()-1) {
		return true;
	}
	return false;
	}

}
