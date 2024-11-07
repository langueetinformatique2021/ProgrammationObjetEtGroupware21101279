package TD2;

public class B {
	/** test si un nbr est divisible par 13 si true nbr/2 si false nbr+2
	 * 
	 * @param n entier
	 * @return n/2 ou n+2
	 */
	public static int divise(int n) {
		if(A.treize(n)==true) return n/2;
		else return n+2;
	}

}
