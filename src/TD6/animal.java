package TD6;

public abstract class animal {
	private String espèce;
	private int nb_pattes=0;
	
	/**@return nom de l'animal*/
	
	public abstract String nom();
	
	/**creation d'une nouvelle instance de la classe animal
	 * @param type: nom de l'espèce
	 * @rparam pattes: nbr pattes*/
	
	public animal(String type, int pattes) {
		espèce = type;
		nb_pattes = pattes;
	}
	/**presentation des caracteristique de l'animal*/
	public void présente() {
		System.out.println("je suis un représentant de lespéces des"+ espèce+"et j'ai"+ nb_pattes);
	
	}
	/**crie de l'animal*/
	public abstract void crier();

}
