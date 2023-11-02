package corejava;

public class LocalVariable {
	public void studentAge() {
		int age=12;
		System.out.println("age :" + age);
		
	}
	public static void main(String[] args) {
		LocalVariable l= new LocalVariable();
		l.studentAge();
	}

}
