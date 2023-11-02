package special;

public class Employee {
	private int eid;
	private String ename;
	Employee(){
		super();
	}
	
	public Employee(int eid,String ename) {
		this.eid=eid;
		this.ename=ename;
	}
	
	void display(int i) {
		System.out.println("int");
	}
	
	void display(byte b) {
		System.out.println("byte");
	}
	void display(float b) {
		System.out.println("float");
	}
	void display(double b) {
		System.out.println("double");
	}
	

	public static void main(String[] args) {
		Employee e=new Employee();
		Employee e1=new Employee(0, null);
		e.display(89);
		e.display((byte)5);
		e.display(5.8f);
		e.display(56.7);

	}

}
