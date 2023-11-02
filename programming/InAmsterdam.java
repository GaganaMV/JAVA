package programming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InAmsterdam {
	int count=0;
	public int countAm(String s) {
		String str=s.toLowerCase();
		String[] a = str.split(" ");
		for (int i = 0; i < a.length; i++) {
			if(a[i].equals("am")) {
				count=count+1;
			}
			
		}
        return count;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		System.out.println("enter a String :");
		String a = input.readLine();
		InAmsterdam i=new InAmsterdam();
		System.out.println(i.countAm(a));
		
		
	}

}
