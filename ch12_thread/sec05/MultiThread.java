package ch12_thread.sec05;

public class MultiThread implements Runnable {

	private int id;
	public MultiThread(int id) {
		this.id = id;

	}

	@Override
	public void run() {

		
		for (int i = 0; i < 5; i++) {
			System.out.printf("thread(%d),i:%d%n", id, i);
		}

	}

}
