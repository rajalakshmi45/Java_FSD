package comm.example;

import java.util.Date;

public class AgeComparator implements Comparable<Object>{
	
	private int id;
	private String name;
	private String department;
	private Date dateOfJoining;
	private int age;
	private int salary;
	

	public AgeComparator( String name, String department, Date dateOfJoining, int age, int salary) {
		super();
		this.name = name;
		this.department = department;
		this.dateOfJoining = dateOfJoining;
		this.age = age;
		this.salary = salary;
	}
	
   public int getId() {
		return id;
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
	public String toString() {
		return "AgeComparator [id=" + id + ", name=" + name + ", department=" + department + ", dateOfJoining="
				+ dateOfJoining + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		AgeComparator ac = (AgeComparator)o;
		if((this.age)==(ac.getAge()))
		{
			if((this.dateOfJoining).compareTo(ac.getDateOfJoining())==0)
			{
				return 0;
			}
			else if((this.dateOfJoining).compareTo(ac.getDateOfJoining())>0)
			{
				return 1;
			}
			else
			{
				return  -1;
			}
		}else if((this.age)>(ac.getAge()))
		{
			return 1;
		}else
		{
			return -1;
		}
		
	
	}
	
	

}
