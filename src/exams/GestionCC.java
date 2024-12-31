package exams;

public class GestionCC {
	private String[] tabCC;
	
	public GestionCC(String[] tablo_nom) {
		this.tabCC=tablo_nom;	}
	public void show() {
		for(String name : tabCC) {
			System.out.println(name);
		}
	}
	public void search() {
		for (String c : tabCC) {
			if (c instanceof String){
				System.out.println("True");}
				else {
					System.out.println("False");}}
		}
		
		
		public static void main(String[] args) {
			String nom []= {"Chopin", "Mozart", "Debussy", "Bach", "Ravel", "Berlioz", "Wagner", "Verdi"};
			GestionCC ggg= new GestionCC (nom);
			ggg.show();
			ggg.search();
		
	}
				
			}
		
	
	
