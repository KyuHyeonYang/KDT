package ch12_thread.sec08;

public class Calculator {
	private int memory;
	
	public int getMemory() {
		return memory;
	}
	//public void setMemory(int memory) {//동기화 되지 않은 경우
	public synchronized void setMemory(int memory) {	//동기화된 경우
	this.memory=memory;
		
		try {
			Thread.sleep(2000);//2초멈춤
		} catch (InterruptedException e) {}
		System.out.println(Thread.currentThread().getName()+":"+this.memory);
	}
}
