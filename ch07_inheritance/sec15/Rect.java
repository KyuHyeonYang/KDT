package ch07_inheritance.sec15;

public  class Rect extends DrawingObject {
	public Rect() {
		penColor = "blue";

	}

	@Override
	public void draw() {
		System.out.println(penColor + "색상으로 사각형 그리기");
	}
}
