package programming;

public class PatternExample {

	public static void main(String[] args) {
	    for (int i = 0; i < 5; i++) {
		    for (int j = 0; j < i; j++) {
				System.out.print(i);
			}
			System.out.println();
			
		}
		
		for (int i = 0; i <=5; i++) {
			for (int j = 1; j < i; j++) {
				System.out.print(j);
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 3; i++) {
			for (int j = 3; j >= i; j--) {
				
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for (int i = 1; i <=3; i++) {
			for (int j = 3; j >=i ; j--) {
				System.out.print(j);
			}
			System.out.println();
		}
		
		for (int i = 1; i <=3; i++) {
			for (int j =3; j >=i; j--) {
				System.out.print(i);
			}System.out.println();
		}
		
		
		
		
		
		
		
		
		int n=5;
		for (int i = 0; i < n; i++) {  
            for (int j = 2 * (n - i); j >= 0; j--) { //For Loop for Row
            	System.out.print(" "); // Print Spaces

			}

			for (int j = 0; j <= i; j++) { //For Loop for col

			System.out.print("* "); // Print Star

			}

			System.out.println();

			}
		
		
		int row=3;
		for (int i = 0; i <row; i++) {

			for (int j = row - i; j > 1; j--) { 

			System.out.print(" "); 
			}

			for (int j = 0; j <= i; j++) { 
			System.out.print("* "); 
			}
			System.out.println(); //Newline
			}
	}
	
	
	
	
		
		
		
	

}
