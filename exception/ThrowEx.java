package exception;

import java.util.Scanner;

public class ThrowEx {
	//static void valiadateAge(int age) {
	void valiadateAge(int age)  {
		if (age>18) {
			System.out.println("welcome to movie");
		}
		else {
			throw new ArithmeticException("invalid age for movie");
		}
	}

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age : ");
		int age = sc.nextInt();
		ThrowEx t=new ThrowEx();
		t.valiadateAge(age);
		

	}

}
