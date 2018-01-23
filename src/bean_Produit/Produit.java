package bean_Produit;

public class Produit {
	
	
	private int codeProduit;
	private String nomProduit;
	private int prixProduit;
	private int codeCategorie;
	
	public Produit(int codeProduit, String nomProduit, int prixProduit, int codeCategorie) {
		super();
		this.codeProduit = codeProduit;
		this.nomProduit = nomProduit;
		this.prixProduit = prixProduit;
		this.codeCategorie = codeCategorie;
	}
	
	public int getCodeProduit() {
		return codeProduit;
	}
	public void setCodeProduit(int codeProduit) {
		this.codeProduit = codeProduit;
	}
	public String getNomProduit() {
		return nomProduit;
	}
	public void setNomProduit(String nomProduit) {
		this.nomProduit = nomProduit;
	}
	public int getPrixProduit() {
		return prixProduit;
	}
	public void setPrixProduit(int prixProduit) {
		this.prixProduit = prixProduit;
	}
	public int getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(int codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
}
