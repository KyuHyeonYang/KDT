package ch12_thread.sec07;

public class CalcThread extends Thread {
	//계산 작업하는 쓰레드
	//생성자에서 이름설정
	public CalcThread(String name ) {
		setName(name);
	}
	@Override
	public void run() {
		for(int i=0;i<200000000;i++) {
			//반복수행되는 문장:여기서 하는 일 없음(반목만 수행될뿐)
		}
		System.out.println(getName());
	}
}
