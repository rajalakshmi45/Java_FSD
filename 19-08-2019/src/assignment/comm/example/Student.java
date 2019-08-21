package assignment.comm.example;

public class Student implements Comparable<Object>{
	
	private String fname;
	private String lname;
	private Double gpa;
	public Student(String fname, String lname, Double gpa) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.gpa = gpa;
	}
	
	
	public String getFname() {
		return fname;
	}


	public void setFname(String fname) {
		this.fname = fname;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public Double getGpa() {
		return gpa;
	}


	public void setGpa(Double gpa) {
		this.gpa = gpa;
	}


	@Override
	public int compareTo(Object o) {
		Student student=(Student)o;
		if((this.getGpa()==student.getGpa()))
		{
					return 0;
		}
		else if ((this.getGpa()>student.getGpa())) {
			return 1;
		}
		else  {
			return -1;
		}
      }
	}
	
	
	

