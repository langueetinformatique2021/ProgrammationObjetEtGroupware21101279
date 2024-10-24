package TD2;

public class AB {
	public static void main(String[] args) {
		int i=1;
		int m=15;
		for (int j=0;j<m;j++) {// j<m mean tant que j est < à 5 ;j++ mean add 1 à j
			i= B.divise(i);
			System.out.println("resultat"+i);// affiche tout les resultats jusque j==5
			
		}
		//System.out.println("resultat"+i); affiche le dernier resultat
	}

}
