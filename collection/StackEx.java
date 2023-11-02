package collection;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		Stack<Integer> number=new Stack<Integer>();
		number.push(2);
		number.push(5);
		number.push(6);
		number.push(9);
		System.out.println(number);
		number.pop();
		System.out.println(number);
		Integer peek = number.peek();
		System.out.println(peek);
		System.out.println("stack is empty ?:"+number.isEmpty());
		int search = number.search(5);
		System.out.println("search"+search);
		System.out.println(number.indexOf(2));
		System.out.println(number.lastIndexOf(5));
		System.out.println(number.lastElement());
		
		

	}

}
