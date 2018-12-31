package sample;

public class StringBufThread implements Runnable{
	
	StringBuilder someValue = new StringBuilder("One");
	@Override
	public void run() {
		// TODO Auto-generated method stub
		someValue.append("Two");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		someValue.append("Three");
		System.out.println("String Builder Value :"+ someValue + " " + Thread.currentThread().getName());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		StringBufThread bufThread = new StringBufThread();
		Thread thread = new Thread(bufThread , "initial thread");
		thread.start();
		Thread.sleep(100);
		StringBufThread bufThread1 = new StringBufThread();
		Thread thread2 = new Thread(bufThread1 , "Second thread");
		thread2.start();
		bufThread.someValue.append("four");
	}

	

}
