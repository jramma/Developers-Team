package org.example.floristeria.stock;

public abstract class Producte {
	protected String nom;
	protected Float preuPerUnitat;
    protected int stock;

    public Producte(String nom, Float preu, int stock) {
        this.nom = nom;
    	this.preuPerUnitat = preu;
        this.stock = stock;
    }

    public Float getPreuPerUnitat() {
        return preuPerUnitat;
    }

    public void setPreuPerUnitat(Float preuPerUnitat) {
        this.preuPerUnitat = preuPerUnitat;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    public String getNom() {
  		return nom;
  	}

  	public void setNom(String nom) {
  		this.nom = nom;
  	}
  	
    public abstract void eliminado();

    public abstract String toString();

}
