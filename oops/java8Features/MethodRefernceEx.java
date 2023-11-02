package java8Features;

import java.util.Arrays;
import java.util.List;

public class MethodRefernceEx {

	public static void main(String[] args) {
		
		List<String> name= Arrays.asList("tanuja","vaidya","trupti");
		name.forEach(MethodRefernceEx::printList);
		MethodRefernceEx m=new MethodRefernceEx();
		name.forEach(m::printname);
		
	}
	
	public static void printList(String name) {
		System.out.println("method reference : "+name);
		
	}
	
	public void printname(String name) {
		System.out.println(name);
		
	}

}
