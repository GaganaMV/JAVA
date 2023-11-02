package programming;

public class ReverseString {
	public static void main(String[] args) {
		String str="Nayan";
		String rev="";
		
		//using recursion
		for (int i = str.length()-1; i >=0; i--) {
			rev=rev+str.charAt(i);
		}System.out.println(rev);
		
		//without using recursion
		
		StringBuilder s=new StringBuilder();
		s.append(str);
		s.reverse();
		System.out.println(s);
		String str1="trupti";
		StringBuffer s1=new StringBuffer();
		s1.append(str1);
		s1.reverse();
		System.out.println(s1);
		
		//check for palindrome
		if(str.equalsIgnoreCase(rev)) {
			System.out.println("string is palindrome");
		}else {
			System.out.println("String is not apalindrome");
		}
		
	}
		
}


