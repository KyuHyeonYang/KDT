package ch12_thread.sec08;

public class NonSyncMain {

	public static void main(String[] args) {
//쓰레드가 동기화 되어있지 않은 경우 잘못된 결과 초래하는 예
		Calculator cal= new Calculator();
		
		User1 user1=new User1();
		user1.setCalculator(cal);
		user1.start();
		
		User2 user2=new User2();
		user2.setCalculator(cal);
		user2.start();
		
		//<실행결과>user1:50/user2:50
		//user1:100을 예상했는데 user2가 실행되면서 중간에 50으로 저장됨
		
		//Caculaoter 클래스의 코드를 동기화 된 코드로 변경시
		//User1 100 user2 50으로 출력됨 
	}

}
