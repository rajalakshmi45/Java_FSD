package comm.example;

public class Student implements Comparable {
	
	private String firstName;
	private String lastName;
	private Double gpa;
	public Student(String firstName, String lastName, Double gpa) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getGpa() {
		return gpa;
	}
	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", gpa=" + gpa + "]";
	}
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		Student student = (Student)o;
		if(this.getGpa()==student.getGpa())
		{
			return 0;
		}
		else if((this.getGpa()>student.getGpa()))
		{
			return 1;
		}
		else 
		{
		return -1;
		}
	}
	
	

}
