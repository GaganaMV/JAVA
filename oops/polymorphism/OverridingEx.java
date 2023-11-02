package oops.polymorphism;

class Learner{
	void lname() {
		System.out.println("My name is tanuja");
	}
	
	void cName() { //in parent class declare any method as a private we cannot override
		System.out.println("java Full stck development");
	}
	
	
}

class Lcource extends Learner{
	
	@Override
	protected void cName() {
		System.out.println("java back end devlopment");
	}
	
}

public class OverridingEx {

	public static void main(String[] args) {
		Lcource l =new Lcource();
		l.cName();
		
	}

}
