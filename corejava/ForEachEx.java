package corejava;

public class ForEachEx {
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		for (int i : a) {
			System.out.println(i);
		}
		
		String str="welcome to edubridge";
		String temp="";
		char[] c = str.toCharArray();
		for (char d : c) {
			if(d!=' ') {
				temp +=c;
			}
			System.out.println("temp:"+str);
		}
		
	}

}
