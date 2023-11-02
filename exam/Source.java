package exam;
import java.io.*;

public class Source{
		  public static int inf_string(String a, String b){
		   
		   if(a.contains(b)){
		   return 1;
		   }else {
			   
		   }
		return 0;
		  
		     // return 1 if the string 'a' can be contained in 'b'.
		   }
		
		public static void main (String[] args) throws IOException,java.lang.NumberFormatException
		{
		int t;
		BufferedReader input = new BufferedReader (new InputStreamReader (System.in));
		t =Integer.parseInt(input.readLine());
		
		
		 while(t > 0)
		 {
		 String a = input.readLine();
		 String b = input.readLine();
	     int ans = inf_string(a, b);
		 if(ans == 1)
		 {
		System.out.println("YES");
		}
		else
		{
		System.out.println("NO");
		}
	    t--;
		}
		}
	
	}



