package com.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddEmployeeController
 */




@WebServlet(
		urlPatterns= {"/addEmployee.do"}
		)
public class AddEmployeeController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doProcess(request, response);
	}
	
	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<form action='AddEmployeeDb.db' method='post'>");
		out.println("<html><body>");
		out.println("Name<input type='text' name='name'><br/>");
		out.println("Email<input type='email' name='email'><br/>");
		out.println("Password<input type='password' name='password'><br/>");
		out.println(
				"		<label for=\"input-3\">Country</label>\r\n" + 
				"		<select name=\"country\">\r\n" + 
				"		<option value=\"Unknmown\">Select...</option>\r\n" + 
				"		<option value=\"India\">India</option>\r\n" + 
				"		<option value=\"Us\">Us</option>\r\n" + 
				"		<option value=\"Australia\">Australia</option>\r\n" + 
				"		<option value=\"Uk\">Uk</option>\r\n" + 
				"		</select><br/>\r\n" + 
				"");
		
		
		out.println("</select><br/><input type='submit' value='addemployee'>");

		
		
	}

}
