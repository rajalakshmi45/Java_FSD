package comm.example.Junit;

public class Calculator {

	private int x;
	private int y;
	private int result;
	
	public Calculator() {
		super();
	}
	
	public Calculator(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	public int add()
	{
		result=x+y;
		return result;
	}
	
	public int greater()
	{
		if(x>y)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
