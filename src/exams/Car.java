package exams;

public class Car extends Vehicule {
	private int nbr_porte;
	
	
	public Car(String marque, int year, int num_doors) {
		super(marque,year);
		this.nbr_porte= num_doors;
	} 
public void Info() {
	System.out.println("Je suis une voiture de la marque"+" "+getBrand()+" "+"j'ai été fabriqué en"+" "+getAnnee()+" "+"j'ai"+" "+nbr_porte+" "+"portes");
}
}
