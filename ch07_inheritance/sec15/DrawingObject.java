package ch07_inheritance.sec15;

public abstract class DrawingObject {

	public String penColor;
	
	//추상메소드 선언:선언만 되어있고 body{}를 구현하지 않은 메소드
	//상속받은 클래스에서 반드시 재정의 해야함
	public abstract void draw();
}
