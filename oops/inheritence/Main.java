package oops.inheritence;

class Animal{
	final int a=1;
	
	Animal(){
		System.out.println("dog ");
	}
	public void animalSound() {
		System.out.println("animal Makes sound"); 
	}
	
}

class Dog extends Animal{
	

	Dog(){
		super();
	}
	
	@Override
	public void animalSound() {
		
		
		System.out.println("dog barks");
		super.animalSound();
		
	}
	
}

public class Main {
	//final keyword : 
	//if we create class using final keyword we cannot inherit that class 
	//if we create method using final keyword we cannot override that method
	//if we create variable using final keyword initialization is mandatory and we cannot change the value
	String name="tanuja";

	public static void main(String[] args) {
		Main m=new Main();
		m.name="sahana";
	    System.out.println(m.name);
		
		Dog d=new Dog();
		
		d.animalSound();
		
		

	}

}
