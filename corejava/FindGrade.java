package corejava;

import java.util.Scanner;

public class FindGrade {
	public static void main(String[] args) {
		
		
		String grade = FindGrade.findGrade(45);
		System.out.println(grade);
		FindGrade g=new FindGrade();
		int marks = g.findMarks("A+");
		System.out.println(marks);
		FindGrade g1=new FindGrade();
		g1.grade(100);
		
		
	}
		
	
	public static String findGrade(int score) { 
		
		
		switch(score) {
		case 90:
			return "A+";
		case 80:
			return "A";
		case 75:
			return "B+";
		case 65:
			return "B";
			
		default:
			return "F";
			
		}
	}
	
	public int findMarks(String s) {
		switch(s) {
		case "A+":
			return 90;
		case "B+":
			return 70;
		default:
			return 0;
		}
		
	}
	
	public void grade(int marks) {
		switch(marks) {
		case 100:
			System.out.println("Distinction");
			break;
		case 85:
			System.out.println("A+");
			break;
		case 80:
			System.out.println("A");
			break;
		case 65:
			System.out.println("B");
			break;
		default:
			System.out.println("fail");
		}
		
		
	}

}
