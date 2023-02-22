package commandes;

/**
 * @author ouziri
 * @version 1.0 
 *
 */

public class CommandeFrancaise extends Commande {
	private double montantHT; 	
	private static double tva = 0.2;
	private double fraisLivraison;
	
	public CommandeFrancaise(int numero, double montantHT, double fraisLivraison) {
		super(numero);
		assert fraisLivraison >= 0;
		this.montantHT = montantHT;
		this.fraisLivraison = fraisLivraison;
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
		return fraisLivraison;
	}

}
