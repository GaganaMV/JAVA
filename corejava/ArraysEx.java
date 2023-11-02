package corejava;

import java.util.Iterator;

public class ArraysEx {
	public static void main(String[] args) {
		int[] num=new int[10];
		int numbers[]= {1,2,3,4,5};
		
		for (int i = 0; i <numbers.length; i++) {
			System.out.println(numbers[i]);
		}
		
		System.out.println(numbers.length);
		
		for(int i=0; i<numbers.length; i++) {
			System.out.println("Hello");
		}
		
		for (int i = 0; i < numbers.length; i++) {//0,1,
			for (int j = 0; j <= i; j++) {//0,1
				System.out.print("* ");
			}
			System.out.println();
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j <=i; j++) {
				System.out.print(numbers[i]);
				
			}System.out.println();
		}
		
		for (int i = 0; i <= 5; i++) {
			for (int j = 0; j <= 5; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
		int b[][]= {{1,3,5},{1,3,5},{1,3,4,5}};
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b.length; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
			
		}
		
		
	}

}
