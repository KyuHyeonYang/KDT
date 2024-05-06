package ch08_interface.sec01;

public interface ISmartPhone {
	//추상메소드 선언(body없음)
	//구현 클래스에서 반드시 구현해야 할 메소드 규격 설정
	public void sendCall(); // 전환 걸기
	public void receiveCall(); // 전화 받기
	public void sendSMS(); // 메시지 보내기
	public void receiveSMS(); // 메시지 받기 
}
