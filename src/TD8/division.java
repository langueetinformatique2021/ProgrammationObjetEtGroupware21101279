package TD8;

public class division {
	public static void main(String[] args) {
		int i = 1000, j;
		try {do {i--; j = 1 / i;} while (true);}
		
		catch (ArithmeticException e) {
			System.out.println("Attention! Interdit de faire des divisions par 0");		}
		 } 

}
