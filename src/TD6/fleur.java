package TD6;

// sous classe de superVegetal
public class fleur extends superVegetal {
	// attribut privee specifique au fleurs
	private int nbr_petal;
	private int taille_tige;

	// constructeurs de fleurs (les variables que les sous classe de fleur devront avoir)
	public fleur (String espece, int petals, int size_tige) {
		super(espece); // ref de espece dans superVegetal, SUPER TJRS EN PREMIER
		nbr_petal= petals;
		taille_tige= size_tige;
	}
	
	// ajout d'un print pour presentation ça affichera la
	// methode presentation ci-dessous et presentation de superVegetal 
	public void presentation() {
		System.out.println("Bonjour j'ai" + nbr_petal + " et une tige de " + taille_tige + "et je suis" + getEspece());
		
	}

}
