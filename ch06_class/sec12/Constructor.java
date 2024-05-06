package ch06_class.sec12;

public class Constructor {

	int x;
	int y;
	
	//생성자(메소드):객체가 생성될 때 자동 호출
	//클래스 이름과 동일하고 반환형 없다
	//역할:필드 값 초기화
	public Constructor() {
		x=100;
	}
	//멤버 메소드
	public void showx() {
		System.out.println("x: "+x);
	}
}
