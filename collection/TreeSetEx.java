package collection;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetEx {

	public static void main(String[] args) {
		TreeSet<String> tree=new TreeSet<String>();
		tree.add("tanuja");
		tree.add("sahana");
		tree.add("manish");
		tree.add("amma");
		System.out.println(tree);
		try {
			tree.add(null);
			
		} catch (NullPointerException e) {
			System.out.println("null value is not allowed in tree set");
		}
		
		
		
		
		Iterator<String> itr=tree.iterator();
		while(itr.hasNext()) {
			String value = itr.next();
			System.out.println(value);
		}
		
	    
	     
	     
	}

}
