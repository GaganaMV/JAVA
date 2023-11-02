package corejava;

public class LoopExample {
	public static void main(String[] args) {
		int i=0;
		while( i<3) {
			System.out.println(i);
			i=i+1;
		}
		
		for (int j = 0; j < 5; j++) {
			
			System.out.println("Hello");
		}
		
		int a=2;
		do {
			System.out.println(a);
		}while(a<=1);
		
		while(a<=1) {
			System.out.println(a);
		}
	
		int m=0;	
		while(m<=50) {
			if(m%2==0) {
				System.out.println("Even"+m);
				
			}
			m=m+1;
		}
		
		while(m<=50) {
			if(m%2!=0) {
				System.out.println("Odd"+m);
			}
			m=m+1;
		}
		
		
		
		
	}
	

}
