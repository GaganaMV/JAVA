package corejava;

public class ControlStatements {
	public static void main(String[] args) {
		int num=-9;
		if(num>0) {
			System.out.println("number is Positive");
		}else if(num<0) {
			System.out.println("number is negative");
		}
		else {
			System.out.println("invalid input");
		}
		
		int number=40;
		if(number%2==0) {
			System.out.println("number is Even");
		}else {
			System.out.println("number is Odd");
		}
		
		
		int a=9;
		int b=4;
		int c=7;
		if(a>b) {
			System.out.println("Maximum number is :"+a);
		}else if(a>c) {
			System.out.println("Maximum number is :"+a);
		}else if(b>c) {
			System.out.println("Maximum number is :"+b);
		}else {
			System.out.println("maximum nuber is :"+c);
		}
		
				
	}
	

}
