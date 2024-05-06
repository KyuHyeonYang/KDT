package ch12_thread.sec07;



public class ThreadPrioriyMain {

	public static void main(String[] args) {
		//쓰레드 우선순위
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+1);
			
			if (1!=10) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}else {
				{
					thread.setPriority(Thread.MAX_PRIORITY);
					//항상 최우선은 아니지만 대부분 우선순위가 높음
				}
			}
			
			//Thread.NORM_PRIORITY

		}

	}

}
