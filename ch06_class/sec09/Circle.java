package ch06_class.sec09;

public class Circle {
private int radius;
	
	// 매개변수가 있는 메소드 : 전달된 반지름 값을 받는 매개변수
	public void setCircle(int r) {
		radius = r; // radius 값 저장
	}
	
	// 반환값이 있는 매개변수 
	// 원의 넓이를 계산해서 바환 : 실수값 반환 
	// 반환형 : float
	public float getArea() {
		return radius * radius * 3.14f;
	}
}
