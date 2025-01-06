package exams;

public abstract class Vehicule {
 private String brand;
 private int annee;

 public Vehicule(String marque, int year) {
	 this.brand= marque;
	 this.annee= year;
 }
 
 public void start() {
	 System.out.println("La voiture démarre");	
 }
 
 public void stop() {
	 System.out.println("La voiture s'arrête");
 }
 
 public String getBrand() {
	 return brand;	 
 }
public int getAnnee() {
	return annee;
}
}
