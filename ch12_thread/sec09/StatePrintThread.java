package ch12_thread.sec09;

public class StatePrintThread extends Thread {
	private Thread targetThread;

	// 생성자에서 초기화
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}

	@Override
	public void run() {
		// 무한반복 수행:TERMINATED상태가 되면 종료
		while(true) {
			//쓰레드 상태를 나타내는 열거 상수 문자열 반환
			Thread.State state=targetThread.getState();
			System.out.println("타겟 쓰레드 상태: "+state);
			if(state==Thread.State.NEW) {
				targetThread.start();
			}
			if(state==Thread.State.TERMINATED) {
				break;
			}
			try {
				Thread.sleep(500);//0.5초 정지
			} catch (InterruptedException e) {}
				
			
		}
		
	}
}
