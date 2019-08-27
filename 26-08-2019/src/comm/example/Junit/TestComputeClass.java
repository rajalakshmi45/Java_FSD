package comm.example.Junit;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

public class TestComputeClass extends TestCase{

	public TestComputeClass(String name)
	{
		super(name);
		System.out.println(name);
	}
	
	int x,y;
	
	
	
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		
		super.setUp();
		System.out.println("initialize method");
		x=20;
		y=1;
	}

	@Override
	protected void tearDown() throws Exception {
		// TODO Auto-generated method stub
		super.tearDown();
		System.out.println("clean-up");
		x=0;
		y=0;
	}

	@Test
	public void testAdd() {
		System.out.println("add method");
		int cal = new Calculator(x,y).add();
		assertEquals(21,cal);
		//fail("Not yet implemented");
	}

	@Test
	public void testGreater() {
		System.out.println("greater method");
		int cal = new Calculator(x,y).greater();
		assertEquals(1,cal);
		//fail("Not yet implemented");
	}
	
	public static TestSuite CreateTestSuite()
	{
		TestSuite test=new TestSuite("alltest");
		 test.addTest(new TestComputeClass("addmethod"));
		return test;
	}
	
	public static void main(String args[])
	{
		TestRunner.run(TestComputeClass.class);
	}

}
