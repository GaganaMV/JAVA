package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CountUniqueVowels {

	public static void main(String[] args) {
		String uniqueStr="";
		String s="welcome to java";
		char c = 0;
		Set<Character> h=new HashSet<Character>();
		for (int i = 0; i <s.length(); i++) {
			h.add(s.charAt(i));
		}
		Iterator<Character> itr = h.iterator();
		while(itr.hasNext()) {
			uniqueStr +=itr.next();
			
		}
		System.out.println(uniqueStr);
		String u= uniqueStr.trim();
		getUniqueVowel(u);	
		getConsonents(u);
	}
	public static void getUniqueVowel(String str) {
		int count=0;
		for (int i = 0; i <str.length(); i++) {
			if (str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' ||str.charAt(i)=='u') {
				count ++;
			}
		}
		System.out.println("Unique vowels"+count);
	}
	
	public static void getConsonents(String str) {
		int count=0;
		System.out.println(str);
		for (int i = 0; i <str.length(); i++) {
			if (str.charAt(i) !='a' && str.charAt(i) !='e' && str.charAt(i) !='i' && str.charAt(i) !='o' && str.charAt(i) !='u') {
				count ++;
				System.out.println(str.charAt(i));
			}
		}
		System.out.println("Unique consonents"+count);
	}

}
