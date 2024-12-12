package TD8;

public class division2 {
	public static void main(String[] args) {
	// utilisation de la méthode division
	try { division(); 
	}
	catch (DivisionException e) {
		System.out.println("exception trouver"+ e.getMessage());
	}
	}
	
	// methode division on l'on integre la subclass ExceptionDivison pour gerer le prbl
	public static void division() throws DivisionException {
	int i = 1000 , j;
	if(i<=0) // si i est <= 0 dès le debut la division peut pas être fait donc ...
	{throw new DivisionException("NON, i doit être superieur à 0");} // usage de notre exception 
	
	
	try { // essaye cette boucle tant que i > 0 qd on commence
		do {i--; j = 1 / i;
		System.out.println("resultat"+j);} while (true);
	
	}
	catch (ArithmeticException e) { // une fois que i == 0 ...
		throw new DivisionException("Division par zero pas possible");// on utilise notre exception
}
}	 
}


