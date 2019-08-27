package comm.example.Employee;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import comm.example.model.Employee;
import comm.example.service.EmployeeService;
import comm.example.service.EmployeeServiceImpl;

public class Main {

	public static void main(String[] args) throws IOException, SQLException {
		// TODO Auto-generated method stub
		
		File inputFile = new File("Employee.txt");
		
		FileReader in = new FileReader(inputFile);
		
		BufferedReader inputStream = new BufferedReader(in);
		String str = inputStream.readLine();
		EmployeeService emp = new EmployeeServiceImpl();
	    while(str != null)
	    {
	    	String arr[] = str.split(" ");
	    	int arr1 = Integer.parseInt(arr[0]);
	    	String arr2 = arr[1];
	    	String arr3 = arr[2];
	    	String arr4 = arr[3];
	    	emp.createEmployee(new Employee(arr1,arr2,arr3,arr4));
	    	System.out.println(str);
	    	str=inputStream.readLine();
	    
	    }
	    inputStream.close();
	    in.close();
	    
	    

	}

}
