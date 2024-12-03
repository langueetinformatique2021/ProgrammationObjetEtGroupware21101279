package TD6;

public abstract class superVegetal { 
	// attribut privée qui seront accessible de diff manière
	 private String species; 
	 private int CO2=0;
	 
	// initialiser un obj pour superVegetal
	 public superVegetal(String espece) {
		 this.species= espece;
	 }
	
	 // une  maniere d'acceder a un attribut private 
	 public int getRespiration_cellulaire(){
		 return CO2;
	 }
	 
	 public String getEspece() {
		 return species;
	 }
	 
	 // une methode que les sous-classe pourront utiliser
	 public void presentation() {
			System.out.println("Bonjour je suis " + species);
			
	 }
}
