package ch12_thread.sec05;

public class MultiThreadMain {

	public static void main(String[] args) {
		Thread th1=new Thread(new MultiThread(1));
		Thread th2=new Thread(new MultiThread(1));

		Thread th3=new Thread(new MultiThread(1));

			th1.start();
			th2.start();
			th3.start();
		
	

	}

}
