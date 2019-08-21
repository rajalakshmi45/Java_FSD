package jdbc.comm.example;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// TODO Auto-generated method stub
	
		DriverManager.deregisterDriver(new org.h2.Driver());
		Class.forName("org.h2.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb","root","root");
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery("select * from course");
		while(resultSet.next()) {
		System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" " +resultSet.getInt(3));
		}
	}

}
