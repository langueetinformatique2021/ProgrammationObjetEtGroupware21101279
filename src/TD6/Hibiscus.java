package TD6;

public class Hibiscus extends fleur {
	public Hibiscus(String espece,int petals,int size_tige) {
		super(espece,petals,size_tige);
		
	}
	@Override 
	public int getRespiration_cellulaire() {
		return 10;
	}
	public void presentation() {
		super.presentation();
		System.out.println("Mon taux de CO2 est de"+getRespiration_cellulaire());
		
	}
	

}
