package ch07_inheritance.sec15;

public class Line extends DrawingObject {
 public Line () {
	 penColor="red";
	 
 }
 //부모 클래스의 추상메소드를 반드시 구현해야함 :추상 메소드 재정의
 @Override
	public void draw() {
	System.out.println(penColor+"색상으로 선 그리기");
	}
}
