package comm.example.Thread2;


public class ProducerConsumerTester {
	
	private final static MyStack myStack=new MyStack();

	public static void main(String[] args) {
		
		StackConsumer stackconsumer = new StackConsumer(myStack);
		StackProducer stackproducer = new StackProducer(myStack);
		Thread t1 = new Thread(stackconsumer);
		Thread t2 = new Thread(stackproducer);
		t1.start();
		t2.start();
		

	}

}