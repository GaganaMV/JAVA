package java8Features;

public class ClonableEx implements Cloneable{
	int id;
	String name;
	
	
	
	public ClonableEx(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}


	public static void main(String[] args) {
		ClonableEx c=new ClonableEx(21, "tanuja");
		System.out.println(c.id + " " + c.name);
		try {
		ClonableEx c1=(ClonableEx)c.clone();  
		System.out.println(c1.id + " " + c1.name);  
		}catch (Exception e) {  
		// TODO: handle exception  
		System.out.println(c.toString());  
		}  
		
		
	
		

	}

}
