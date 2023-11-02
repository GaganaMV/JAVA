package corejava;

import java.util.Scanner;

public class ArithmaticEx {
	public static void main(String[] args) {
		//arithmetic operation
				int result,n1,n2;
				char operator;
				Scanner sc=new Scanner(System.in);
				
				System.out.println("enter a first number :");
				n1=sc.nextInt();
				System.out.println("enter a second number :");
				n2=sc.nextInt();
				
				
				while(true){
			          System.out.println("Select an Option...");
			          System.out.println("1. Add");
			          System.out.println("2. Subtract");
			          System.out.println("3. Multiply");
			          System.out.println("4. Divide");
			          System.out.println("5. Exit");
			          System.out.println("Type your selection here: ");
			          operator=sc.next().charAt(0);       
				
				switch(operator) {
				case '+':
					result = n1+n2;
					System.out.println(n1+"+"+n2+"="+result);
					break;
				case '-':
					result =n1-n2;
					System.out.println(n1+"-"+n2+"="+result);
					break;
				case '*':
					result =n1*n2;
					System.out.println(n1+"*"+n2+"="+result);
					break;
				case '/':
					result =n1/n2;
					System.out.println(n1+"/"+n2+"="+result);
					break;	
					default:
						System.out.println("invalid input");
					
					}
				
					
			
				
				
			}
	}

}
