package collection;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetEx {

	

	public static void main(String[] args) {
		HashSet<String> name=new HashSet<String>();
		name.add("sahana");
		name.add("manya");
		name.add("vidya");
		name.add("ankita");
		name.add("sahana");
		
		System.out.println(name);
		System.out.println("retrieve data using iterator");
		Iterator<String> iterator=name.iterator();
		while (iterator.hasNext()) {
			iterator.next();
		}
		for (String string : name) {
			System.out.println(string);
		}

		HashSet h=new HashSet();
		h.add("tanuja");
		h.add(4);
		h.add(4.5);
		System.out.println(h);
	}

}
