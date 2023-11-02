package oops.inheritence;
abstract class Vehicle1{
	public Vehicle1() {
		// TODO Auto-generated constructor stub
		System.out.println("Vehicle Constructor");
	}
	abstract void show();
	void vehicleBrand() {    //This is my non Abstract method 
		System.out.println("Non abstract method");
	}
	public static void display() {
		System.out.println("Static display method");
	}
	
	
	
}
class A1 extends Vehicle1{
	

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("Bike");
	}
	
}
class C1 extends Vehicle1{

	@Override
	void show() {
		// TODO Auto-generated method stub
		System.out.println("car");
	}
	
}
public class AbstractClassEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       //Vehicle1 v=new Car();
       // v.show();
		Vehicle1 v=new A1();
		Vehicle1.display();
		
		}

}



