package comm.example;

import java.util.Date;

public class Employee implements Comparable<Object> {
	
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	
	
    public Employee(String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	public int getId() {
		int i=0;
		i++;
		return i;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public Date getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Employee emp = (Employee)o;
		if((this.salary)==(emp.getSalary()))
		{
			return 0;
		}
		else if((this.salary)>emp.getSalary())
		{
			return 1;
		}
		else 
		{
		 return -1;
		}
		
	}
	@Override
	public String toString() {
		
		return "Employee [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}
	
	


}
