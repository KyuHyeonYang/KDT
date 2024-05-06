package ch06_class.sec09;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		//객체생성
		Circle c= new Circle();
		
		System.out.println("반지름 입력: ");
		int radius=sc.nextInt();
		
		//넓이를 구하기 위해 setCircle()메소드 호출
		//setCircle()메소드는 매개변수가 1개 잇음:반드시 전달해야함
		c.setCircle(radius);//반지름 값 전달->setCircle()메소드의 매개변수가 받음
		
		//getArea()메소드 호출하고 반환된 값 받아서 출력
		 System.out.println("원의 넓이: "+c.getArea());
		 sc.close();
		
	}

}
