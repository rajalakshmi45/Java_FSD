package assignment.comm.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentDemo {
     
	private static Scanner sc = new Scanner(System.in);
	static List<String> list=new ArrayList<String>();
	
	
	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.out.println("Enter the firstname");
		String fname=sc.next();
		System.out.println("Enter the lastname");
		String lname=sc.next();
		System.out.println("Enter the cgpa");
		Double cgpa=sc.nextDouble();
		System.out.println("you want to continue");
		String str=sc.next();
		do
		{
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
			
			break;
			
		case 2:
			break;
		
		case 3:
			break;
			
		}
		
        
	   }while(str=="yes");
		
	}

}
