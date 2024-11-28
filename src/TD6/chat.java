package TD6;

public class chat extends felin implements domesticable{
	private String nom;
	
	public chat (String type) {
		super(type);
		domestiquer("Garfield");
	}
	
	/** Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal */
	
	public  void domestiquer(String nom) {domestique = true; this.nom=nom; }
	
	/** Rend le nom de l'animal
	* @return nom de l'animal */
	
	public String nom() {
		return nom;
	}

}
