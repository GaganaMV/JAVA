package com.maven.junitmavenproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultsetEx2 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employees", "root", "test");
		Statement stmnt = connection.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		ResultSet rs=stmnt.executeQuery("select * from emp");
	    int rs1 = stmnt.executeUpdate("insert into emp(eid,ename) values(24,'Ram')");
		while(rs.next()) {
			if(rs.getInt(1)==5) {
				rs.updateString(2, "yoganjani");
				rs.updateRow();
				System.out.println("Record Updated");
				rs.deleteRow();
				System.out.println("record deleted");
				
		}
		rs.absolute(rs1);
		rs.insertRow();
		}
		
		
		
	
		
	}

}
