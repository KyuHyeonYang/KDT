package ch07_inheritance.sec09;

public class Computer extends Calculator {

	//메소드 오버라이딩(재정의)(자식클래스에서 하는거임)
	@Override
	public double areaCircle(double r) {
		System.out.println("Computer  객체의 areaCircle()실행");
		return Math.PI*r*r;
	}//좀 더 정밀한 계산을 위해서 3.14159대신 MATH.PI 클래스의 상수를 사용
	

}
