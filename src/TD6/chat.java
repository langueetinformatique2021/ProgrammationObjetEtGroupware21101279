package TD6;

public class chat extends felin implements domesticable{
	
	public chat (String type) {
		super(type);
	}
	
	/** Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal */
	
	public  void domestiquer(String nom) {};
	
	/** Rend le nom de l'animal
	* @return nom de l'animal */
	
	public abstract String nom() {
		return null;
	}

}
