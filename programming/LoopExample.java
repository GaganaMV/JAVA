package programming;

import java.util.Scanner;

public class LoopExample {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number = sc.nextInt();
		int n=0;
		for (int i = 1; i <=number; i++) {
			n+=i;
		}System.out.println("sum="+n);
		
		System.out.println("enter a number :");
		int n1 = sc.nextInt();
		int mul;
		for (int i = 1; i <= 10; i++) {
		mul=n1*i;
		System.out.println(n1+"×"+i+"="+mul);
		}
		
		//natural numbers from 1 to 50
		System.out.println("Natural numbers");
		for (int i = 1; i <=50; i++) {

		System.out.println(i);
		}


		//print alphabets
		for (char i = 'a'; i <='z'; i++) {
		System.out.println(i);

		}

		System.out.println(Integer.toBinaryString(10));
		System.out.println(Integer.parseInt("1010",2));
		
		
	}

}
