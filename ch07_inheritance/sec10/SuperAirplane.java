package ch07_inheritance.sec10;

public class SuperAirplane extends Airplane {
	public static final int NORMAL=1;
	public static final int SUPERSONIC=2;
	
	int flyMode=NORMAL;

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}else {
		super.fly();//Airplane 객체의 fly()메소드 호출(super사용)
			}
		}

}
