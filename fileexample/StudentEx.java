package fileexample;

import java.io.Serializable;

public class StudentEx implements Serializable {

	int id;
	String name;
	String degree;
	
	

	public void display() {
		System.out.println("id:"+id);
		System.out.println("name:"+name);
		System.out.println("degree:"+degree);
	}
	
	
	
	

}
