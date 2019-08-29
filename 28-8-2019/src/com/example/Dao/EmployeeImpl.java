package com.example.Dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.example.model.Employee;

import comm.example.factory.MyConnectionFactory;

public class EmployeeImpl implements EmployeeDao {

	
	private Connection connection=null;
	private PreparedStatement pStatement=null;
	private Statement statement=null;
	private ResultSet resultSet=null;
	private String name;
	private String email;
	private String password;
	private String country;
	
	
	public void addEmployee(Employee employee) {
		try
		{
			connection=MyConnectionFactory.getMySqlConnectionForHR();
			PreparedStatement pst=connection.prepareStatement("insert into employee(name,email,password,country,uid) values(?,?,?,?,?)");
			pst.setString(1,employee.getName());
			pst.setString(2, employee.getEmail());
			pst.setString(3, employee.getPassword());
			pst.setString(4,employee.getCountry());
			pst.setInt(5, Employee.serialVersionUID++);
			pst.executeUpdate();
		}
		catch(Exception ex) {
			ex.printStackTrace();
			
		}
   }
	@Override
	public void deleteEmployee(int uid) {
		
		connection = MyConnectionFactory.getMySqlConnectionForHR();
		try {
			PreparedStatement pst = connection.prepareStatement("delete from employee where uid="+uid);
			pst.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		
	}
	
	public ArrayList<Employee> editEmployee(int uid) {
		
		ArrayList<Employee> list = new ArrayList<>();
		
		try
		{
			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			Statement st= connection.createStatement();
			ResultSet rs=st.executeQuery("select name,email,password,country from employee where uid="+uid);
		    while(rs.next())
		    {
		    	list.add(new Employee(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4)));
		    }
		}
		catch(Exception ex) {
			
			System.out.println("duplicate id");
			ex.printStackTrace();
			
		}
		return list;
   }
	public void updateEmployee(int uid,String name,String email,String password,String country) throws SQLException
	{
		connection=MyConnectionFactory.getMySqlConnectionForHR();
		System.out.println(name);
		System.out.println(email);
		System.out.println(password);
		System.out.println(country);
		System.out.println(uid);
		PreparedStatement pst=connection.prepareStatement("update employee set name=?,email=?,password=?,country=? where uid= ?");
		pst.setString(1, name);
		pst.setString(2, email);
		pst.setString(3, password);
		pst.setString(4, country);
		pst.setInt(5, uid);
		pst.executeUpdate();
		
	}
	
	

}
