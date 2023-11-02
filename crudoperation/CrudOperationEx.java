package crudoperation;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Learner{
	private int lno;
	private String lname;
	private String ldegree;
	public Learner(int lno, String lname, String ldegree) {
		super();
		this.lno = lno;
		this.lname = lname;
		this.ldegree = ldegree;
	}
	public int getLno() {
		return lno;
	}
	public void setLno(int lno) {
		this.lno = lno;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getLdegree() {
		return ldegree;
	}
	public void setLdegree(String ldegree) {
		this.ldegree = ldegree;
	}
	@Override
	public String toString() {
		return "Learner [lno=" + lno + ", lname=" + lname + ", ldegree=" + ldegree + "]";
	}
	
	
}

public class CrudOperationEx {

	public static void main(String[] args) {
		ArrayList<Learner> learner=new ArrayList<Learner>();
		Scanner sc=new Scanner(System.in);
		int choice;
		do {
			System.out.println("1.Insert Data");
			System.out.println("2.Dispaly Data");
			System.out.println("3.Search Data");
			System.out.println("4.Delete Record");
			System.out.println("5.Update record");
			System.out.println("Enter your choice");
			choice=sc.nextInt();
			switch (choice) {
			case 1: 
				System.out.println("Enter lno");
				int lno=sc.nextInt();
				System.out.println("Enter lname");
				String lname=sc.next();
				System.out.println("Enter ldegree");
				String ldegree=sc.next();
				learner.add(new Learner(lno, lname, ldegree));
				System.out.println("record inserted successfully");
				break;
			
			case 2:
				Iterator<Learner> itr=learner.iterator();
				while(itr.hasNext()) {
					Learner l = itr.next();
					System.out.println(l);
				}
				
			case 3:
				boolean found =false;
				System.out.println("enter lno to search: ");
				int lnum = sc.nextInt();
				Iterator<Learner> i=learner.iterator();
				while(i.hasNext()) {
					Learner e = i.next();
					if(e.getLno()==lnum) {
						System.out.println(e);
						found=true;
					}
				}
				if(!found) {
					System.out.println("record not found");
				}
				
			case 4:
				System.out.println("enter lno to delete:");
				int i1 = sc.nextInt();
				learner.remove(i1);
				System.out.println("record Deleted Successfully!!");
			
			case 5:
				System.out.println("enter lno to update degree:");
				int lnumber = sc.nextInt();
				System.out.println("enter new degree name to update");
				String ldeg = sc.next();
				Iterator<Learner> l=learner.iterator();
				while(l.hasNext()) {
					Learner next = l.next();
					next.getLno();
					next.setLdegree(ldeg);
					
				}System.out.println("record updated Successfully");
				
				
				
				}
		}while(choice!=0);
		}
		

	}


