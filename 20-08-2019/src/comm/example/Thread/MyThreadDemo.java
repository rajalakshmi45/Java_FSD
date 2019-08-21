package comm.example.Thread;

public class MyThreadDemo implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          
		MyThreadDemo thread1 = new MyThreadDemo();
		MyThreadDemo2 thread2 = new MyThreadDemo2();
		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		t1.start();
		System.out.println(t1.isAlive());
		t2.start();
		System.out.println(t2.isAlive());
		try {
			t1.join();
		}catch (InterruptedException e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try
		{
			for(int i=0;i<20;i++)
		{
			System.out.println("i => "+i);
			if(i==10)
			{
				Thread.yield();
			}
		}
	}catch(Exception e)
		{
		
		}
	}

}
