package comm.example;

import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcDemo1 {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
		
		DriverManager.deregisterDriver(new org.h2.Driver());
		Class.forName("org.h2.Driver");

	}

}
