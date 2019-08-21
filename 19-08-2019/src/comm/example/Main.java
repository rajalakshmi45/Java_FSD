package comm.example;

import java.util.HashSet;

import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<Student> set = new HashSet<Student>();
		set.add(new Student("renu","s",8.4));
		set.add(new Student("raji","s",8.0));
		set.add(new Student("lavya","p",6.0));
		Student std=null;
		Object[] obj=set.toArray();
		for(Object o: obj)
		{
			
		}
		
		

	}

}
