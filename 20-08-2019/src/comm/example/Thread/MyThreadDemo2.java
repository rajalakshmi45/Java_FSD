package comm.example.Thread;

public class MyThreadDemo2 implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
		for(int j=0;j<20;j++)
		{
			System.out.println("j => "+j);
		}
		}catch(Exception e)
		{
			
		}
	}

    	

}
