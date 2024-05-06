package ch07_inheritance.sec15;

public  class Circle  extends DrawingObject{
public Circle() {
	penColor="Yellow";
	
}
@Override
	public void draw() {
		System.out.println(penColor+"색상으로 원 그리기");
	}
}
