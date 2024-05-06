package ch12_thread.sec09;

public class TargetThread extends Thread {

	@Override
	public void run() {
		for(int i=0;i<1000000000;i++) {}//10억번 반복
		
		try {
			Thread.sleep(1500);//1.5초간 정지:TIMED_WATING상ㅌㅐ
		} catch (Exception e) {}
		for(int i=0;i<1000000000;i++) {}//10억번 반복, 실행대기 상태 또는 실행상태
	
		//반복문이 종료하면 쓰레드는 종료(TERMINATED 상태가 됨)
	
	}
}
