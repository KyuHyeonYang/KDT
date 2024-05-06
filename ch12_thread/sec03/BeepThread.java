package ch12_thread.sec03;

import java.awt.Toolkit;

public class BeepThread extends Thread {

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
}
