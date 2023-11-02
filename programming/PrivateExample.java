package programming;

class P{
	private int a=10;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;        
	}
	
	
	
	
}

public class PrivateExample {
	public static void main(String[] args) {
		P p =new P();
		System.out.println(p.getA());

	}

}
