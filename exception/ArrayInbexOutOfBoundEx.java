package exception;

public class ArrayInbexOutOfBoundEx {

	public static void main(String[] args) {
		
		try {
			int[] a= {1,2,33};
			System.out.println(a[50]);
			
			
			
		}catch (ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		
		
		}

	}

}
