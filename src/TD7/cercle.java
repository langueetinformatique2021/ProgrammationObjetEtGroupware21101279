package TD7;

import java.lang.Comparable;


public class cercle extends geometrieSuperClass implements Comparable <cercle> {
		
		double rayon;
		
		/** Création d'une nouvelle instance de Cercle */
		public cercle(double x) {
			super("noir");
			rayon = x;
		}
		
		/** calcul du périmètre d'un cercle rouge
		* @return périmètre  */
		public float perimetre() { return (float)(2.0*Math.PI*rayon); }
		// (float) == convertit le resultat double en float pr - de place ds memoire
		/** calcul de la surface d'un cercle
		 * @return surface */
		public float surface() { return (float)(Math.PI*rayon*rayon); }
		
		/** implémentation de la méthode compareTo de l'interface Comparable */
		public int compareTo( cercle c) {
			//cercle c = (cercle)o;
			if (this.rayon == c.rayon) return 0;
			if (this.rayon < c.rayon) return -1;
			else return 1;
		}
		

}
