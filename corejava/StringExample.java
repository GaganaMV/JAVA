package corejava;

public class StringExample {
	public static void main(String[] args) {
		String str="tanuja";
		String s="sahana";
		System.out.println(str.toCharArray());
		
		String a="";
		
		String str1=new String("vaidya");
		System.out.println("String :"+str);
		System.out.println("Name :"+ str1);
		System.out.println("Name :"+ s);
		String s3=str+str1;
		System.out.println(s3);
		
		System.out.println("length of the string :" +str.length());
		System.out.println("upperCase:"+ str.toUpperCase());
		System.out.println("LowerCase" + str.toLowerCase());
		System.out.println("is the two strings are equal:" + str.equals(s));
		System.out.println( "is the two strings are equal:"+str.equalsIgnoreCase(s));
		System.out.println("Concat String:" + str.concat(" vaidya"));
		System.out.println(str.charAt(0));
		System.out.println(str.indexOf('a'));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.replace('a','m'));
		System.out.println(a.isEmpty());//consider whitespace
		System.out.println(a.isBlank());//doesn't consider whitespace
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
