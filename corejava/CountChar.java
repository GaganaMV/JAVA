package corejava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class CountChar {

	public static void main(String[] args) {
		List<Character> c=new ArrayList<Character>();
		c.add('a');
		c.add('b');
		c.add('c');
		c.add('a');
		c.add('b');
		
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		Iterator<Character> itr = c.iterator();
		while(itr.hasNext()) {
			Character next = itr.next();
			if(hm.containsKey(next)) {
				hm.put(next, hm.get(next)+1);
			}else {
				hm.put(next,1);
			}
		}
		System.out.println(hm);
	}

}
