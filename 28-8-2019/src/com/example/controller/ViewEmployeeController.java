package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.Dao.EmployeeImpl;
import com.example.model.Employee;

import comm.example.factory.MyConnectionFactory;

/**
 * Servlet implementation class ViewEmployeeController
 */
@WebServlet("/viewEmployee")
public class ViewEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
	private int uid=Employee.serialVersionUID;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {
			
			PrintWriter pw = response.getWriter();
			Connection connection=MyConnectionFactory.getMySqlConnectionForHR();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select name,email,password,country,uid from employee");
			pw.println("<table><tr>"
					+ "<td>Name</td>"
					+"<td>Email</td>"
					+ "<td>Password</td>"
					+ "<td>Country</td>"
					+"<td>Edit</td>"
					+"<td>Delete</td>"
					+ "</tr><br/>");
			while(rs.next()) {
				pw.println("<tr><td>"+rs.getString(1)+"</td>");
				pw.println("<td>"+rs.getString(2)+"</td>");
				pw.println("<td>"+rs.getString(3)+"</td>");
				pw.println("<td>"+rs.getString(4)+"</td>");
				pw.println("<td><a href='editEmployee?uid="+rs.getInt(5)+"'>edit</a></td>");
				pw.println("<td><a href='DeleteEmployee?uid="+rs.getInt(5)+"'>delete</td></tr>");
			}
			
			pw.println("</table>");
		
	}


}
