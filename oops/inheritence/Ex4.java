package oops.inheritence;

public class Ex4 implements Ex3{

	public static void main(String[] args) {
		Ex4 e=new Ex4();
		e.ABC();
		e.xyz();
		e.test();

	}

	@Override
	public void test() {
		System.out.println("interface method");
		
	}

	@Override
	public void ABC() {
		System.out.println("ABC method");
		
	}

	@Override
	public void xyz() {
		System.out.println("xyz method");
		
	}

}
