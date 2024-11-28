package TD6;

public interface domesticable {
	/** gestion de l'état de domestication d'un animal */
	/** Domestiquer un animal et lui donner un nom
	* @param nom nom de l'animal */
	public abstract void domestiquer(String nom);
	/** Création et gestion d'animaux */
	public abstract class Animal{
	private String espèce;
	private int nb_pattes = 0;
	/** Rend le nom de l'animal
	* @return nom de l'animal */
	public abstract String nom();
	}

}
