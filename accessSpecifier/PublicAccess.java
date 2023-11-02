package accessSpecifier;

public class PublicAccess {
	public PublicAccess() {
		int a=10;
		System.out.println(a);
	}
	
	public void test() {
		System.out.println();
	}

	public static void main(String[] args) {
		PublicAccess p=new PublicAccess();
        p.test();
	}

}
