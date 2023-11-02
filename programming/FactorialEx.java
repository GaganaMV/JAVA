package programming;

public class FactorialEx {
	public static void main(String[] args) {
		int num=3;
		int fact=1;
		for (int i = 1; i <=num; i++) {
			fact*=i;
		}System.out.println("Factorial of a "+num+ "="+fact);
		
		int number=5;
		int j=1;
		int factorial=1; 
		while(j<=number) {
			factorial=factorial*j;
			j++;
		}System.out.println("factorial :" + factorial);
		
		
	}

}
