package exam;

import java.io.*; 
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// Class name should be "Source",
// otherwise solution won't be accepted
public class A {
public static void main(String[] args) {
     Scanner in = new Scanner(System.in);
     System.out.println("enter a 1st number");
     int a=in.nextInt();
     System.out.println("enter a 2nd number");
     int b=in.nextInt();
     System.out.println("enter a 3rd number");
     int c=in.nextInt();
     
    
     int cnt=1;
     for(int i=a;i>0;i--){
     for(int j=1;j<=i;j++){
     System.out.print(" ");
     }
     for(int j=1; j<=cnt;j++){
     System.out.print(" "+cnt);
     }
     System.out.println();
     cnt++;
     }
     
     
     int cont=1;
     for(int i=b;i>0;i--){
     for(int j=1;j<=i;j++){
     System.out.print(" ");
     }
     for(int j=1; j<=cont;j++){
     System.out.print(" "+cont);
     }
     System.out.println();
     cont++;
     }
     
     int count=1;
     for(int i=c;i>0;i--){
     for(int j=1;j<=i;j++){
     System.out.print(" ");
     }
     for(int j=1; j<=count;j++){
     System.out.print(" "+count);
     }
     System.out.println();
     count++;
     }
}// Declare the variable
}