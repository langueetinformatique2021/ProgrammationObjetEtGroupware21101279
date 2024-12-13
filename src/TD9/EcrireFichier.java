package TD9;
import java.io.File; // a class
import java.io.FileNotFoundException;
import java.io.IOException; // class too
import java.io.PrintWriter; // a class
import java.io.BufferedReader;
import java.io.FileReader; // class too

public class EcrireFichier {
	public static void main(String[] args) {
		int num[]= {2,3,4,5,6,7,8,9,10,11,12,13};
		
		// ecriture d'un file 
		try {
			PrintWriter pr= new PrintWriter(new File("num.txt")); // une feuille blanche
			// PrintWriter peut ecrire plusieurs chose so preciser File
			for (int numero : num) { // pour les elt in num
				pr.write("\n"+numero); // ecrire un elt par ligne ds pr
			}
		
			pr.close(); // tjrs fermer
		}
		
		catch (IOException e) {e.printStackTrace();}
		
		//lire un file
		try {
		BufferedReader lire= new BufferedReader(new FileReader("num.txt"));
		String ligne; // var ligne
		while((ligne= lire.readLine()) != null) { // incrementer la lecture de chaque
			// line ds ligne et s'assurer que la ligne n'est pas vide
			// qd vide la boucle while stop.  lire.readLine() tout seule lit seulemt 1 ligne
			System.out.println(ligne);
		}
		
		lire.close();
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
