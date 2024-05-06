package ch08_interface.sec03;

public class RemoteControlMain {

	public static void main(String[] args) {
		//인터ㅠㅔ이스 참조변수 선언:다형성
		IRemoteControl rc=null;
		
		//Television 객체를 인터페이스 참조변수에 대입
		rc= new Television();
		rc.turnOn();
		rc.setVolume(10);
		rc.setMute(true);
		rc.setMute(false);
		rc.turnOff();
		System.out.println("-----------");
		
		//Audio객체를 인터페이스 참조변수에 대입
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(12);
		rc.setMute(true);
		rc.turnOff();
		
		//static(정적)메소드 호출
		 IRemoteControl.changeBattery();
	}

}
