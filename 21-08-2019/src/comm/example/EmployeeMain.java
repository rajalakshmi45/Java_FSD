package comm.example;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EmployeeMain {
  
  private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		 Set<Employee> ln = new TreeSet<Employee>();
		 Set<AgeComparator> ln2 = new TreeSet<AgeComparator>();
		 System.out.println("Input the number of employee");
		 int n =sc.nextInt();
		 for(int i=0;i<n;i++)
		 {
		 System.out.printf("Enter the details of Employee %d ",(i+1));
		 String name=sc.next();
		 String department=sc.next();
		 String date=sc.next();
		 SimpleDateFormat d=new SimpleDateFormat("dd/mm/yyyy");
		 Date dates=null;
		 try
		 {
		  dates=  d.parse(date);
		 }catch(ParseException p)
		 {
			 p.printStackTrace();
		 }
		 int age=sc.nextInt();
		 int salary=sc.nextInt();
		 ln.add(new Employee(name,department,dates,age,salary));
		 ln2.add(new AgeComparator(name,department,dates,age,salary));
		 }
		 System.out.println("1.Sort employees by salary");
		 System.out.println("2.Sort employees by age and by date of joining");
		 int choice;
		 System.out.println("Enter your choice");
		 choice = sc.nextInt();
		 switch(choice)
		 {
		 case 1:
			 for(Employee e:ln)
			 {
				 System.out.println("Employee ID Name Department Date Of Joining Age Salary");
				 System.out.println(e);
			 }
			 break;
		 case 2:
			 for(AgeComparator a:ln2)
			 {
				 System.out.println("Employee ID Name Department Date Of Joining Age Salary");
				 System.out.println(a);
			 }
			 
			 
			 break;
		 }

		 
		 
		 
		 
		 
		

	}

}
