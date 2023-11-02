package com.maven.junitmavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResulsetEx {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "test");
		//Statement statement=connection.createStatement();
		
		Statement statement=connection.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs=statement.executeQuery("select * from emp");
		while(rs.next()) {
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
		}
		rs.first();
		System.out.println("First row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.last();
		System.out.println("Last row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.absolute(3);
		System.out.println("Third row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.previous();
		System.out.println(" row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		rs.relative(-1);
		System.out.println(" row: ");
		System.out.println(rs.getInt(1)+":"+rs.getString(2));
		
		
	}

}
