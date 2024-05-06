package ch08_interface.sec04;

public class SmartRCMain {

	public static void main(String[] args) {
	  //2개의 인터페이스를 구현한 스마트 TV의 모든 기능 확인

		SmartTelevision stv = new SmartTelevision();
		stv.turnOn();
		stv.turnOff();
		stv.search("www.naver.com");
	
	}

}
