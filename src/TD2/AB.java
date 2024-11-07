package TD2;

public class AB {
	/** initialise i=1 et execute m fois la methode divise
	 * 
	 * @param args i=1, m nbr de fois qu'on fera la methode divise
	 */
	public static void main(String[] args) {
		int i=1;
		int m=15;
		for (int j=0;j<m;j++) {
			i= B.divise(i);
			System.out.println("resulat"+i);
		}
		
				
	}

}
