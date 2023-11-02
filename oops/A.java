package oops;

public class A {

	public static void main(String[] args) {
		int array[ ][ ] =  {{3, 5, 8}, {7, 54, 1, 12, 4}}; 
		System.out.println(array[0][2]);
		
		int arr[ ] = new int[3];
		for (int i = 0; i < 3; i++) {
		   arr[i] = i;
		} 

		int res = arr[0] + arr[2];
		System.out.println(res);
	}

}
