package ch06_class.sec10;

public class Rectangle {
	private int recx;
	private int recy;

	public void setRectangle(int x,int y) {
		recx=x;
		recy=y;
	}
	public int getArea() {
		return recx * recy;
	}

}
