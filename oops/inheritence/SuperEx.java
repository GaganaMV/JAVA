package oops.inheritence;

class Age{
	int age =40;
	int i=1;
	Age(int age){
		System.out.println(age);
	}
	
	int a() {
		return 24;
	}
}

class Bc extends Age{
	Bc(int age){
		super(4);
	}
	void age() {
		System.out.println(super.a());
		
		System.out.println(super.age);
	}
	int age =20;
}

public class SuperEx {

	public static void main(String[] args) {
		Bc b=new Bc(9);
		System.out.println(b.age);
		b.age();

	}
}

