package ch12_thread.sec06;

public class ThreadMain {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 쓰레드 이름: "+mainThread.getName());
		
		Thread threadA= new ThreadA();
		System.out.println("작업 쓰레드 이름 : "+threadA.getName());
		threadA.start();
		
		Thread threadB= new ThreadB();
		System.out.println("작업 쓰레드 이름 : "+threadB.getName());
		threadB.start();

	}

}
