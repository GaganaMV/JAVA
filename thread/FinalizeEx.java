package thread;

public class FinalizeEx {
	@Override
	protected void finalize() throws Throwable {
		System.out.println("Object previously referenced by " + this.s + " is successfully garbage collected.");
	}
	String s;
	public FinalizeEx(String s) {
		this.s = s;
	}

	public static void main(String[] args) {
		FinalizeEx f1=new FinalizeEx("f1");
		FinalizeEx f2=new FinalizeEx("f2");
		f1=f2;
		
		System.gc();

	}
	
	
	

}
