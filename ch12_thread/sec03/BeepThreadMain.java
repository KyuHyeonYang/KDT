package ch12_thread.sec03;

public class BeepThreadMain {

	public static void main(String[] args) {
		Thread thread = new BeepThread();
		thread.start();
		// 땡 글자 5번 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {}
			
		}
		// start()또 호출:IllegalThreadStateException 예외발생
		// thread.start();//한번만 실행되기 때문에 또 호출하면 오류\
		// 컴파일 오류는 없지만 런타일 오류 발생

		// 또 start() 호출하려면 새로운 쓰레드를 생성한 후 호출해야함
		thread = new BeepThread();
		thread.start();// 예외발생X
	}
}
