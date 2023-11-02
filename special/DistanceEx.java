package special;

import java.util.Scanner;

public class DistanceEx {
	
	

	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int u=36/1000;
		int a=5;
		System.out.println("enter time");
		int t=sc.nextInt();
		
		
		
		int distance;
		distance=(u*t+((a*t*t)/2));
		System.out.println(distance);

	}

}
