package comm.example.Thread2;

public class StackProducer implements Runnable {
	
	private MyStack myStack;

	public StackProducer(MyStack myStack) {
		super();
		this.myStack = myStack;
	}

	@Override
	public void run() {
		for(int i=0;i<26;i++)
		{
			
			int n=i+64;
			try {
				myStack.push((char) ((char)n+1));
				System.out.println("Push==>"+(char) ((char)n+1));
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		}

}

}
