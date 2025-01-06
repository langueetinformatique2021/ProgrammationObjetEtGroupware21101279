package exams;

public class test_voiture {
	public static void main(String[] args) {
		Car Lili= new Car("Bibi",2012,4);
		Car Shou= new Car("Bu",2007,6);
		Lili.Info();
		
		
		if(Shou.getAnnee()> Lili.getAnnee()) {
			System.out.println("La voiture de la marque Bu est plus récente");	
		}
		else if(Shou.getAnnee()< Lili.getAnnee()) {
			System.out.println("Bibi est plus récent");
		}
		else {
			System.out.println("Elles sont de la même année");
		}
	}

}
