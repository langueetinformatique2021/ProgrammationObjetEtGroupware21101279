package TD6;

public abstract class superVegetal {
	 private String species;
	 private int CO2=0;
	 
	 public superVegetal(String espece) {
		 species= espece;
	 }
	 
	 public int getRespiration_cellulaire(){
		 return CO2;
	 }
	 
	 public void presentation() {
			System.out.println("Bonjour je suis " + species);
			
	 }
}
