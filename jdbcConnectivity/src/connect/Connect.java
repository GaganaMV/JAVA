package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Connect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "test");
		Statement stmnt = con.createStatement();
		stmnt.executeUpdate("insert into emp(eid,ename) values(19,'manyata')");

	}

}
