package oops.inheritence;

import java.util.Scanner;

class A{
	String name;
	A(String Name){
		this.name=name;
		
	}
	
	
}

class B extends A{
	String role="java Developer";
	B(String role,String name){
		super(role); //we use super keyword to access the parent class object,method and constructors
		this.role=role;
		System.out.println("Role:"+role);
		System.out.println("name: "+name);
	}
	
}

public class Single2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a role");
		String role=sc.nextLine();
		System.out.println("enter a name");
		String name=sc.nextLine();
		B b1 =new B(role,name);
		

	}

}
