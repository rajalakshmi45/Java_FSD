package comm.example.swing;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import comm.example.factory.MyConnectionFactory;

public class RS2XMLConfig {
	private MyConnectionFactory factory;
	private Connection connection;
	public RS2XMLConfig() throws SQLException {
		factory = MyConnectionFactory.createObject();
		connection = factory.getConnection();
		
	}
	public ResultSet getAllEmployee() throws SQLException
	{
		Statement st = connection.createStatement();
		ResultSet rs = st.executeQuery("select id as ID,firstName as FirstName,lastName as LastName,email as Email from employee");
		return rs;
		
		
	}

}
