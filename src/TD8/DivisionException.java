package TD8;
// creation d'une expcetion specifique pour la divison par 0 
public class DivisionException extends Exception {
	public DivisionException(String message) {
		super(message); // attribut de la classe Exception pour personnaliser 
		// les message qu'affiche notre exception
	}
	
}
