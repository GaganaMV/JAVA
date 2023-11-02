package java8Features;


import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


interface Add{
	int add(int a,int b);
}

interface Add3{
	int add(int a,int b,int c);
}

interface EvenO{
	String evenOdd(int a);
	
}
interface EvenOd{
	boolean evenOdd(int a);
	
}

interface RevString{
	String rev(String s);
}


interface Validate{
	boolean login(String uname,String password);
}



public class LamdaEx {
	boolean login(String uname,String password) {
		Validate v=( uname1,password1)->{
			return (uname1.equals("tanuja")&&(password1.equals("12345"))?true:false);
		};
		return v.login(uname,password);
		
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter username and Password");
		String uname = sc.next();
		String password = sc.next();
		LamdaEx l=new LamdaEx();
		System.out.println(l.login(uname, password));
		
		
		
		
		//single line lambda
		List<Integer> array=Arrays.asList(1,3,4);
		array.forEach(x->System.out.println(x));
		
		array.forEach(x->{x=x+2;System.out.println(x);});
		array.forEach((x)->{x=x/2; x=x+2;x=x*2;System.out.println(x);});
		
		Add add=(int a,int b)-> a+b;
		System.out.println(add.add(3, 4));
		
		Add3 add1=(int a,int b,int c)->a+b+c;
		System.out.println(add1.add(1, 3, 5));
		
		EvenOd evenOdd1=(int a)->a%2==0;
		System.out.println(evenOdd1.evenOdd(4));
		EvenO evenOdd=(int a)->{if(a%2==0){return "even";};return "odd";};
		System.out.println(evenOdd.evenOdd(7));
		
		
		RevString rv=(String s)->{String rev=""; 
		 for (int i =s.length()-1; i >=0; i--) {
			char c=s.charAt(i);
			rev=rev+c;
			
		 }
		return rev;} ;
		System.out.println(rv.rev("welcome"));
			
		

	}

}
