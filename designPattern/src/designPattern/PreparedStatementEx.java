package designPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

class PersonEntity{
	private int id;
	private String name;
	private String role;
	private int salary;
	
	public PersonEntity(int id, String name,String role,int salary) {
		super();
		this.id = id;
		this.name = name;
		this.role=role;
		this.salary=salary;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}

public class PreparedStatementEx {
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");
		
		
        
		
		
		

		PreparedStatement preparedStatement = connection.prepareStatement("insert into employeedata values(?,?,?,?");
		
		
		 

		preparedStatement.executeUpdate();
       System.out.println("table created");

      }

	public static void insert() {
		
	}


}
