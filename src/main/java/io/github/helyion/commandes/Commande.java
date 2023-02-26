package io.github.helyion.commandes;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public abstract class Commande {
	
	private int numero;

	public Commande(int numero) {
		this.numero = numero;
	}

	public abstract double getTva();

	public abstract double getMontantHT();

	public abstract double getFraisLivraison();

	public double getMontantTTC(){
		return this.getMontantHT() * (1 + this.getTva()) + this.getFraisLivraison();
	}
}
