package oops.inheritence;

class University{
	int usn=123;
	String uName="VTU";
	void displayUsn() {
		System.out.println("University name is: "+uName);
	}
	
}

class College extends University{
	String cName="GECK";
	void displayCName() {
		super.displayUsn();
		System.out.println("College Name:"+cName);
		
	}
	
}

class Department extends College{
	String dName="Computer science and engineering";
	void displayDName() {
		super.displayCName();
		System.out.println("Department Name: "+dName);
		
	}
	
	
	
}




public class Multilevel {

	public static void main(String[] args) {
		Department d=new Department();
		d.displayDName();
		
		

	}

}
