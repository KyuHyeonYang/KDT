package ch02_variable;

public class Ch02_04_Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//상수 선언 및 값 설정
		final double PI =3.14;
		
		//변수 선언 및 초기화
		double radius =10;
		double circleArea =0;
		
		circleArea = radius*radius*PI;
		
		System.out.println("원의 넓이:"+circleArea);
	}

}
