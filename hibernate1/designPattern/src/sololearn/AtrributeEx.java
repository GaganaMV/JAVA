package sololearn;

import java.util.Scanner;

public class AtrributeEx {
	
		   public static void main(String[] args) {
		       Scanner read = new Scanner(System.in);
		       String firstName = read.nextLine();
		       String secondName = read.nextLine();
		       int age = read.nextInt();
		       int roomNumber = read.nextInt();
		       Customer customer = new Customer(firstName,secondName,age,roomNumber);
		       //set customer's data to object here
		      
		      
		       customer.saveCustomerInfo();
		   }
		}

		class Customer {
		private String firstName;
		private String secondName;
		private int age;
		private int roomNumber;

		//add all necessary attributes here
		   Customer(String firstName,String secondName,int age,int roomNumber){
		       super();
		       this.firstName=firstName;
		       this.secondName=secondName;
		       this.age=age;
		       this.roomNumber=roomNumber;
		   }
		  
		   public void saveCustomerInfo() {
		       System.out.println("First name: " + firstName);
		       System.out.println("Second name: " + secondName);
		       System.out.println("Age: " + age);
		       System.out.println("Room number: " + roomNumber);
		   }
		

}
