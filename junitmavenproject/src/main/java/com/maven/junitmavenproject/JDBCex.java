package com.maven.junitmavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCex {

	public static void main(String[] args) throws SQLException {
		
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");
			System.out.println(con);
			Statement create = con.createStatement();
			System.out.println("Database connection established!");
			ResultSet rs=null;
			rs=create.executeQuery("select * from emp1");
			while(rs.next()) {
				System.out.println("Eid :"+rs.getInt("eid"));
				
				System.out.println("Ename :"+rs.getString("ename"));
				
				System.out.println("Department:"+rs.getString("department"));
				
				System.out.println("City:"+rs.getString("city"));
				
				System.out.println("Date of Joining: "+rs.getDate("doj"));
				System.out.println();
				
			}
				
		
	}

}
