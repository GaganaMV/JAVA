package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeueEx {

	public static void main(String[] args) {
		Deque<String> d=new ArrayDeque<String>();
		System.out.println(d.offerFirst("sahana"));
		d.add("sahana");
		d.addFirst("manish");
		d.add("vaidya");
		d.addLast("trupti");
		System.out.println(d.getFirst());
		System.out.println(d.getLast());
		
		System.out.println(d);

	}

}
