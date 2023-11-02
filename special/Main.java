package special;

import java.util.Scanner;

class Main {

	   public static void main(String[] args) {
	       Scanner read = new Scanner(System.in);
	       System.out.println("enter name");
	       String name = read.nextLine();
	       System.out.println("enter age");
	       int age = read.nextInt();
	       Student student = new Student();
	       student.name = name;
	       student.setAge(age);
	       
	       //set the age via Setter
	       
	       
	       System.out.println("Name: " + student.name);
	       System.out.println("Age: " + student.getAge());
	   }
	}

	class Student {

	   public String name;
	   private int age;
	   
	   public int getAge() {
	       return age;
	       //complete Getter
	       
	   }
	   public void setAge(int age) {
	       
	       this.age=age;
	       //complete Setter
	       
	   }
	

}
