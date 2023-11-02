package interfaceEx;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {

	public static void main(String[] args) {
		ArrayList<Movie> list =new ArrayList<Movie>();
		list.add(new Movie("tanu", "anu", 2000));
		list.add(new Movie("trupti", "upti", 2001));
		list.add(new Movie("vidya", "vidy", 2012));
		list.add(new Movie("mani", "sh", 2011));
		list.add(new Movie("sahana", "sa", 2018));

		Collections.sort(list);
		
		System.out.println("list after sort by name :");
		for (Movie movie : list) {
			System.out.println(movie.getName()+" "+movie.getCity()+" "+movie.getYear());
			
		}
		
	}

}
