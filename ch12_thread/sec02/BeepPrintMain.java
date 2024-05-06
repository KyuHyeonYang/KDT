package ch12_thread.sec02;

public class BeepPrintMain {

	public static void main(String[] args) {
		// 작업 스레드 생성 방법 1
		Runnable beepTask = new BeepTask();

		// 작업 스레드 생성방법 2
		 Thread thread= new Thread(beepTask);//작업 스레드 생성

		// 작업 스레드 생성방법3:익명 구현 객체 사용(BeepTask 사용 안함)
		/* Thread thread=new Thread(new Runnable() {
			
			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();
		
				// 비프음 5번 연속 출력
				for (int i = 0; i < 5; i++) {
					
				toolkit.beep();
				try {Thread.sleep(500);} catch (Exception e) {}
				}
				
			});*/

		// 작업 스레드 생성방법 4:람다식 사용(익명 구현객체를 사용한 방법을 람다식 사용해서 간단하게 표현)
		// BeepTask 클래스 별도로 생성하지 않고 이 자리에 코드입력
	/*	Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = Toolkit.getDefaultToolkit();

				// 비프음 5번 연속 출력
				for (int i = 0; i < 5; i++) {

					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
					}
				}

			}
		});*/

		thread.start();// BeepTask 객체의 run()메소드 실행

		// 땡 글자 5번 출력
		for (int i = 0; i < 5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
			}
		}

	}
}
