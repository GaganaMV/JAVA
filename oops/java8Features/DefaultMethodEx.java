package java8Features;

interface Default1{
	public void display1();
	
	default void display2() {
		System.out.println("default method");
	}
	
	static void display3() {
		System.out.println("Static method");
	}
}


interface Default2{
	public void display4();
	
	
}

public class DefaultMethodEx implements Default1,Default2 {

	public static void main(String[] args) {
		DefaultMethodEx d=new DefaultMethodEx();
		d.display1();
		d.display2();
		Default1.display3();
		d.display4();

	}

	@Override
	public void display1() {
		System.out.println("abstract Method");
		
	}

	@Override
	public void display4() {
		System.out.println("anbstract method in Default2");
		
	}

}
