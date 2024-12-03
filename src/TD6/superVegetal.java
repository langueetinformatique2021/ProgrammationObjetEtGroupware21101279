package TD6;

public abstract class superVegetal { 
	// attribut privée qui seront accessible de diff manière
	 private String species; 
	 private int CO2=0;
	 
	 // une maniere d'acceder a un attribut private
	 public superVegetal(String espece) {
		 species= espece;
	 }
	
	 // une autre maniere d'acceder a un attribut private 
	 public int getRespiration_cellulaire(){
		 return CO2;
	 }
	 
	 // une methode que les sous-classe pourront utiliser
	 public void presentation() {
			System.out.println("Bonjour je suis " + species);
			
	 }
}
