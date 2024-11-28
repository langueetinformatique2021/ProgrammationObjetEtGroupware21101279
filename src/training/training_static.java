package training;

public class training_static {
	// les attributs
	private String etudiants;
	private int id_classe;
	
	static int nbr_etudiants=0;
	
	public training_static(String etudiants) {
		this.etudiants= etudiants;
		nbr_etudiants++;
	}
	

}
