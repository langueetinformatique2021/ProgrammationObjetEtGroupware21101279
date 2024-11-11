package TD5;

public class etudiant {
	/** attribut d'etudiant*/
	int numero_etudiant;
	String nom_prenom;
	int age;
	String formation;
	
	/** constructeur*/
	public etudiant(int numero_etudiant, String nom_prenom,int age,String formation) {
		this.numero_etudiant= numero_etudiant;
		this.nom_prenom= nom_prenom;
		this.age= age;
		this.formation= formation;			
	}
	public void afficherEtudiant() {
		System.out.println("n° étudiant: "+ numero_etudiant);
		System.out.println("nom et prénom: "+ nom_prenom);
		System.out.println("âge: "+ age);
		System.out.println("Votre formation: "+ formation);
	}
	

}
