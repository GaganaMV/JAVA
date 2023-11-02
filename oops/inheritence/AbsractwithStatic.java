package oops.inheritence;

abstract class Ab {

	
	abstract void func();
}
class C extends Ab {

	void func()
	{
		System.out.println("Static abstract method implemented.");
	}
}


public class AbsractwithStatic {
	public static void main(String args[])
	{
		C c=new C();
		
		c.func();
	}
}


