package collection;

import java.util.HashMap;

public class CountVowels {

	public static void main(String[] args) {
		char[] arr= {'a','e','e','k','i','z','z','j'};
		HashMap<Character, Integer> hm=countChar(arr);
		System.out.println(hm);
			
		
		
	}

	private static HashMap<Character, Integer> countChar(char[] arr) {
		HashMap<Character, Integer> hm=new HashMap<Character, Integer>();
		for (char c : arr) {
			if(hm.containsKey(c)){
				hm.put(c, hm.get(c)+1);
					
				}else {
					hm.put(c, 1);
				}
			}
		
			
		
		return hm;
	}

}
