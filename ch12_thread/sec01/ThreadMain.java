package ch12_thread.sec01;

import java.awt.Toolkit;
import java.util.concurrent.ForkJoinTask;

public class ThreadMain {

	public static void main(String[] args) {
		/*작업 1: 땡 소리 출력
		 * 작업2: 땡 글자 출력
		 * 두가지 작업을 순서대로 처리
		 * 비프음ㅇ르 발생시키면서 동시에 땡 글자를 프린트 하려면
		 * 두 작업 중 하나를 다른 스레드 에서 실행시켜야함
		*/

		// 메인스레드만 있는경우
		Toolkit toolkit = Toolkit.getDefaultToolkit();

		// 비프음 5번 연속 출력
		for (int i = 0; i < 5; i++) {
			
		toolkit.beep();
		try {Thread.sleep(500);} catch (Exception e) {}
		
	}
//땡 글자 5번 출력
	for(int i=0;i<5;i++) {
		System.out.println("땡");
		try {Thread.sleep(500);} catch (Exception e) {}
	}
	}

}
