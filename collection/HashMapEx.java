package collection;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> h=new HashMap<Integer, String>();
		h.put(1, "java");
		h.put(2, "python");
		h.put(3, "java");
		h.put(4,"java");
		h.putIfAbsent(1, "array");
		h.putIfAbsent(5, "c");
		
		System.out.println(h);

	}

}
