package TD6;

public interface domesticable {
	/** gestion de l'état de domestication d'un animal */
	/** Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal */
	
	public abstract void domestiquer(String nom);
	
	/** return le nom de l'animal*/
	public abstract String nom();
	
	}


