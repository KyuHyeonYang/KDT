package ch07_inheritance.sec15;

public class DrawingMain {

	public static void main(String[] args) {
		Line line=new Line();
		line.draw();
		
		Circle circle=new Circle();
		circle.draw();
		
		Rect rect=new Rect();
		rect.draw();
	}

}
