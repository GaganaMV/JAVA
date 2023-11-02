package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListEx {

	public static void main(String[] args) {
		ArrayList<String> names=new ArrayList<String>();
		names.add("tanuja");
		names.add("sahaana");
		names.add("trupti");
		names.add("manish");
		System.out.println(names);
		names.add(1,"manya");
		System.out.println(names);
		System.out.println();
		System.out.println(names.contains("tanuja"));
		int i = names.indexOf("tanuja");
		System.out.println("index of tanuja is :"+i);
		
		
		
		System.out.println("size of arraylist is:"+names.size());
		
		ArrayList<String> s=new ArrayList<String>();
		
		System.out.println(s);
		
		
		
		ArrayList<Integer> num=new ArrayList<Integer>();
		num.add(2);
		num.add(4);
		num.add(6);
		num.add(9);
		
		num.add(0,1);
		System.out.println(num);
		
		System.out.println(num.get(4));
		
		System.out.println(num.remove(3));
		System.out.println(num);
		
		List<Integer> even = num.stream().filter(x->x%2==0).collect(Collectors.toList());
		System.out.println("Even numbers in list : "+even);
		
		
		ArrayList<String> place=new ArrayList<String>(Arrays.asList("honavara","kumata","bhatkal"));
		System.out.println(place);
		
		List<Integer> number=Arrays.asList(1,2,3,5,4,7,6);
		Collections.sort(number);
		System.out.println("sorting list : "+number);
		
		

	}

}
