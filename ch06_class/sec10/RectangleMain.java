package ch06_class.sec10;

import java.util.Scanner;

public class RectangleMain {

	public static void main(String[] args) {
		//main()에서 가로길이와 세로길이를 입력 받아서 메소드로 전달해서 넓이 출력 
		Scanner sc=new Scanner(System.in);
		
		Rectangle r=new Rectangle();
		
		System.out.println("가로 입력: ");
		int recx=sc.nextInt();
	    System.out.println("세로 입력: ");
	    int recy=sc.nextInt();
	    r.setRectangle (recx,recy);
	    
	    
	    System.out.println("사각형의 넓이: " + r.getArea());
	}

}
