package oops.inheritence;

public class EncapsulationEx {
	private int age;
	
	
	public static void main(String[] args) {
		EncapsulationEx e=new EncapsulationEx();
		e.age=10;
		System.out.println("Age is : "+e.age);

	}
	public int getAge() {
		return age;
	}
	public void setAge(int a) {
		this.age =age;
	}

}
