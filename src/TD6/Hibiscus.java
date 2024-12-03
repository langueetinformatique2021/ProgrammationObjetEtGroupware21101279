package TD6;

public class Hibiscus extends fleur {
	// constructeurs de hibiscus
	public Hibiscus(String espece,int petals,int size_tige) {
		super(espece,petals,size_tige); // ref des attribut de sur class fleur et class au-dessus superVegetal 
		
	}
	@Override 
	public int getRespiration_cellulaire() {
		return 10; // modification de respiration
	}
	public void presentation() {
		super.presentation(); // ref de cette methode ds fleur ET ds superVegetal 
		System.out.println("Mon taux de CO2 est de"+getRespiration_cellulaire()); //+ modofication
		
	}
	

}
