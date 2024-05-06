package ch06_class.sec02;

public class CarMain {

	public static void main(String[] args) {
		// Car 클래스 객체 생성
		Car c1 = new Car();
		Car c2 = new Car();
		Car c3 = new Car();
		
		c1.carNo = "11가1234"; // c1 객체의 멤버 변수에 저장
		c1.showCarInfo();
		
		c2.carNo = "22가5678"; // c2 객체의 멤버 변수에 저장
		c2.showCarInfo();
		
		c3.carNo = "33가1111";
		c3.showCarInfo();
}
}