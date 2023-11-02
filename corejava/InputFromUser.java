package corejava;

import java.io.BufferedReader;
import java.util.Scanner;

public class InputFromUser {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter your name :");
		String name = sc.nextLine();
		System.out.println("Name: "+ name);
		System.out.println("enter your age :");
		int age = sc.nextInt();
		System.out.println("age: "+ age);
		System.out.println("enter your percentage :");
		float percent = sc.nextFloat();
		System.out.println("Name: "+ percent);
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter name, age and percentage");
		String n = s.next();
		int a = s.nextInt();
	    float p = s.nextFloat();
	    System.out.println("Name: "+n + "  age: "+ a + "  Percentage: "+ p);
		
		 
	    BufferedReader br= new BufferedReader(null);
	}

}
