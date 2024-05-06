package ch07_inheritance.sec10;

public class AirplaneMain {

	public static void main(String[] args) {
	SuperAirplane sa =new SuperAirplane();
	
	sa.takeOff();
	sa.fly();
	

	sa.flyMode=SuperAirplane.SUPERSONIC;
	sa.fly();//재정의된 fly()호출
	
	sa.flyMode=SuperAirplane.NORMAL;
	sa.fly();//부모클래스의 fly()호출(super 사용해서)

	sa.land();
	}

}
