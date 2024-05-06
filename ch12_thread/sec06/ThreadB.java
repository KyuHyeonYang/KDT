package ch12_thread.sec06;

public class ThreadB extends Thread {
	//쓰레드 이름 설정하지 않았음:Thread-n(숫자)포함된 이름으로 자동설정됨
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"가 작업한 내용");
		}
	}
}
