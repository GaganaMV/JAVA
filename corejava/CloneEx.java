package corejava;

public class CloneEx {
	public static void main(String[] args) {
		int a[]= {1,2,5,7,6,8};
		int cloneArray[] =a.clone();
		
		
		int b[][]= {{1,2,3},{4,5,6},{4,5,6},{7,8,9}};
		int cloneA[][]=b.clone();
		System.out.println(cloneA[0]==b[0]);
		System.out.println(cloneA[1]==b[1]);
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(cloneA[i][j]+" ");
			}
			System.out.println();
		}
		
		
		for (int i = 0; i < cloneArray.length; i++) {
			System.out.println(cloneArray[i]);
		}
		
		System.out.println(cloneArray==a);
		System.out.println(a);
		System.out.println(cloneArray);
		
		
		//jagged array
		int arr[][]=new int[5][];
		arr[0]=new int[] {1,2,3};
		arr[1]=new int[] {4,65,76,9};
		arr[2]=new int[] {4,6,7,7};
		arr[3]=new int[] {4,5,6,8};
		arr[4]=new int[] {8,9,3,0};
		
	    for (int i = 0; i <arr.length; i++) {
	    	for (int j = 0; j < arr[i].length; j++) {
	    		System.out.print(arr[i][j]);
				
			}
	    	System.out.println();
	    }
			
		}   
	       
	
	        
	
	
	

	
	
	

}
