package designPattern;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class JdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "test");

	    /*String query = "INSERT INTO employeedata VALUES(?,?,?,?)";
	    PreparedStatement preparedStatement = connection.prepareStatement(query);
	    preparedStatement.setInt(1,14);
	    preparedStatement.setString(2, "kavya");
	    preparedStatement.setString(3, "eloectric");
	    preparedStatement.setInt(4, 30000);*/
	    String query1="update employeedata set ename=? where eid=? ";
	    PreparedStatement update = connection.prepareStatement(query1);
	    String query2="delete from employeedata where eid=?";
	    PreparedStatement delete = connection.prepareStatement(query2);
	    delete.setInt(1, 14);
	    delete.executeUpdate();
	    
	   
	   
	    update.setString(1, "manya");
	    update.setInt(2, 2);
	    
	    
	    
	    /*int i=preparedStatement1.executeUpdate();*/
	    update.executeUpdate();
	    System.out.println("data updated");

	}
	

}
