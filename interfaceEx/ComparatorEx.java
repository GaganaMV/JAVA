package interfaceEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorEx {

	public static void main(String[] args) {
		ArrayList<Student> lists=new ArrayList<Student>();
		lists.add(new Student("manya", "bhatkal", 15));
		lists.add(new Student("sahana", "honnavara", 23));
		lists.add(new Student("kusuma", "honna", 24));
		lists.add(new Student("janaki", "shri", 12));
		lists.add(new Student("vinuta", "karwar", 76));
		
		System.out.println(" after sort By name :");
		Collections.sort(lists,new NameCompare());
		for (Student student : lists) {
			System.out.println(student.getName()+":"+student.getCity()+":"+student.getAge());
			
		}
		
		System.out.println("After sort by age");
		Collections.sort(lists,new AgeCompare());
		for (Student student : lists) {
			System.out.println(student.getName()+":"+student.getCity()+":"+student.getAge());
		}
		

	}

}
