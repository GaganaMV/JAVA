package corejava;

import java.io.StringBufferInputStream;

public class StringEx {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		System.out.println(sb);
		sb.append("tanuja");
		StringBuffer s = new StringBuffer();
		s.append("tanuja");
		System.out.println(sb);
		System.out.println("CharAt: " + sb.charAt(0));
		System.out.println("Hashcode: " + sb.hashCode());
		System.out.println("compareTo: " + s.compareTo(sb));
		System.out.println("Cpacity: " + sb.capacity());
		System.out.println("equals: " + sb.equals(s));
		System.out.println("IndexOf: " + sb.indexOf("o"));
		System.out.println("isEmpty: " + sb.isEmpty());
		System.out.println("length: " + sb.length());
		System.out.println("Insert: " + sb.insert(5, 'm'));

		StringBuilder sb1 = new StringBuilder();
		sb1.append("Trupti");
		sb1.append("Vaidya");
		String str = "tanu";
		str.concat("t");
		System.out.println(sb1.reverse());
		System.out.println(s.reverse());
		System.out.println(s.replace(1, 4, str));
		
		
		

	}

}
