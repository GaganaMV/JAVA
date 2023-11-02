package exception;

public class ClassNotFoundEx {

	public static void main(String[] args) {
		
			try {
				Class.forName("corejav.A");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				System.out.println(e);
			}System.out.println("class found");
			
			
			
		

	}

}
