package TD6;


public class fleur extends superVegetal {
	private int nbr_petal;
	private int taille_tige;

	
	public fleur (String espece, int petals, int size_tige) {
		super(espece);
		nbr_petal= petals;
		taille_tige= size_tige;
	}
	
	public void presentation() {
		System.out.println("Bonjour j'ai" + nbr_petal + " et une tige de " + taille_tige);
		
	}

}
