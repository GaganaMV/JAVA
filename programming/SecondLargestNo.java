package programming;

public class SecondLargestNo {
	public static void getSecondSmallest(int[] a,int total) {
		int temp = 0;
		
		for (int i = 0; i <a.length-1; i++) {
			for (int j = 0; j <a.length; j++) {
				if(a[i]>a[j]) {
					a[i]=a[j];
					a[j]=temp;
					temp=a[i];
				}
				
			}
		}
		System.out.println(a[1]);
	}
	 
	
	public static void getSecondLargest(int[] a,int total) {
		int temp = 0;
		
		for (int i = 0; i <a.length-1; i++) {
			for (int j = 0; j <a.length; j++) {
				if(a[i]>a[i+1]) {
					a[i]=a[j];
					a[j]=temp;
					temp=a[i];
				}
				
			}
		}
		System.out.println(a[total-1]);
	}

	public static void main(String[] args) {
		int a[]= {1,2,6,4,5};
		SecondLargestNo.getSecondLargest(a,5);
		SecondLargestNo.getSecondSmallest(a, 5);
		

	}

}
