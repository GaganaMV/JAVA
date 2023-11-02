package com.maven.junitmavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

class course{
	private int sid;
	private int cid;
	private String cname;
	public course(int sid, int cid, String cname) {
		super();
		this.sid = sid;
		this.cid = cid;
		this.cname = cname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	@Override
	public String toString() {
		return "course [sid=" + sid + ", cid=" + cid + ", cname=" + cname + "]";
	}
	
}

public class MenuDrivenEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Scanner sc=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbstudent", "root", "test");
		
		System.out.println("connection established");
		
		
		
		while(true) {
			System.out.println("1.insert data");
			System.out.println("2.update data");
			System.out.println("3.dispaly data");
			System.out.println("4.delete data");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("enter values to insert");
				System.out.println("enter student id");
				int id = sc.nextInt();
				System.out.println("enter course cid");
				int cid = sc.nextInt();
				System.out.println("enter course name");
				String cname = sc.next();
				PreparedStatement p = connection.prepareStatement("insert into course values(?,?,?)");
				p.setInt(1, id);
				p.setInt(2, cid);
				p.setString(3, cname);
				p.executeUpdate();
				System.out.println("Data successfully inserted");
				break;
			case 2:
				System.out.println("enter name which one you want to update");
				cname = sc.next();
				System.out.println("enter id for which row you want to update");
				id = sc.nextInt();
				PreparedStatement update = connection.prepareStatement("update course set cname=? where sid=?");
				
				update.setString(1, cname);
				update.setInt(2, id);
				System.out.println("data updated successully");
				update.executeUpdate();

			default:
				break;
			}
		}
		
		
		
		
		
		

	}

}
