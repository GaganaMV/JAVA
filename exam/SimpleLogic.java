package exam;

import java.util.Scanner;

public class SimpleLogic {
	
	public void printPattern(int n) {
		int rcount=1;
		for (int i =n; i >0; i--) {
			for (int j = 1; j <i ; j++) {
				System.out.print(" ");
				
			}
			for (int j = 1; j <=rcount; j++) {
				System.out.print(rcount+" ");
			}
			System.out.println();
			rcount++;
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a");
		int a=sc.nextInt();
		System.out.println("enter b");
		int b=sc.nextInt();
		System.out.println("enter c");
		int c=sc.nextInt();
		SimpleLogic s=new SimpleLogic();
		s.printPattern(a);
		s.printPattern(b);
		s.printPattern(c);
		

	}

}
