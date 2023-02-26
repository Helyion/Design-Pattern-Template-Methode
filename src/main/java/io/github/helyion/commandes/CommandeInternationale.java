package io.github.helyion.commandes;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public class CommandeInternationale extends Commande {
	private double montantHT;
	private String paysLivraison;
	private static double tva = 0.1;
	private static Map<String, Double> fraisLivraison = new HashMap<String, Double> () {{
		put("Allemagne",10D);
		put("Angleterre", 8D);
		put("Espagne",6D);
	}};

	public CommandeInternationale(int numero, double montantHT, String paysLivraison) {
		super(numero);
		assert this.fraisLivraison.containsKey(paysLivraison);
		this.montantHT = montantHT;
		this.paysLivraison = paysLivraison;
	}

	@Override
	public double getTva() {
		return tva;
	}

	@Override
	public double getMontantHT() {
		return montantHT;
	}

	@Override
	public double getFraisLivraison() {
		return fraisLivraison.get(paysLivraison);
	}

}
