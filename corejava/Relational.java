package corejava;

public class Relational {
	public static void main(String[] args) {
		int a=10;
		int b=30;
		System.out.println("== "+ (a==b));
		System.out.println("!= " + (a!=b));
		System.out.println("> "+(a>b));
		System.out.println("< "+(a<b));
		
		String s1="Hello";
		String s2="Hello";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		//Bitwise Operator
		int c=7;
		int d=8;
		System.out.println("& :" +(c&d));
		System.out.println("|:"+(c|d));
		System.out.println("^:" + (c^d));
	    System.out.println("~:"+(~d));
		
	    
	    //Shift Operator
	    
	    int z=8;
	    
	    System.out.println(z<<2);
	    System.out.println(z>>>1);
	    
	    
	    //Ternary Operator
	    int febDays=29;
	    String display=febDays==28? "leap year":"Not a leap year";
	    System.out.println(display);
	    
	    int e=23;
	    String result=e%2==0? "even":"odd";
	    System.out.println("the result will be :"+result);
	    
	    int p=3;
	    int q=7;
	    int r=11;
	    
	    
	    int max=(p>q) ? (p>r?p : r):(q>r? q:r) ;
	    
	    int min=(p<q) ?(p<r?p:r):(q>r?q:r);
	    System.out.println("Min:"+min);
	    
	    System.out.println(max);
	    
	    int marks=88;
	    String res =marks>50? "pass":"fail";
	    System.out.println("result  :"+res);
	    
	    
	    //assignment operator
	    
	    a +=b;
	    System.out.println(a);
	    
		
	}

}