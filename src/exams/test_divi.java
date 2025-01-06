package exams;



public class test_divi{
	public static void main(String[] args) {
		int x= 8;
		int y=2;
		
		try{methode_divi( x, y);}
		catch(DiviExcep e) {
			System.out.println(e.getMessage());
		}
	}

		public static void methode_divi(int a, int b) throws DiviExcep {
			if (a==0 || b==0) {
				throw new DiviExcep("Pas de division par 0");}
			try {
				while (a>0){a--;int quotient= a/b; 
				System.out.println(quotient);}
			}
			catch (ArithmeticException e) {
				throw new DiviExcep("Encore un 0");
				
			}
			}
			
			
		



	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
