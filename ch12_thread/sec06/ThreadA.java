package ch12_thread.sec06;

public class ThreadA extends Thread {
//생성자에서 setName()호출하여 쓰레드 이름 설정`
	public ThreadA() {
setName("ThreadA");
}
	@Override
	public void run() {
		for(int i=0; i<2; i++) {
			System.out.println(getName()+"가 작업한 내용");
		}
	}
}
