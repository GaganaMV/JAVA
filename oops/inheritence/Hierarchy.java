package oops.inheritence;

class Vehicle{
	String vName;
	int modelNo;
	void displayVehicle() {
		
		System.out.println("print name: "+ vName);
	}
	
}

class Car extends Vehicle{
	String cName;
	void displayCar() {
		
		System.out.println("car name:" +cName);
	}
}


class Bike extends Vehicle{
	String bName;
	void displayBike() {
		super.displayVehicle();
		System.out.println("Bike name:"+bName);
	}
	
}

public class Hierarchy {

	public static void main(String[] args) {
		Car c=new Car();
		
		c.vName="car";
		c.cName="Ford Probe";
		c.displayVehicle();
		Bike b=new Bike();
		b.vName="Ford Probe";
		c.displayCar();

	}

}
