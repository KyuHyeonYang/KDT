package ch02_variable;

public class Ch02_01_variable01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수형 변수 선언 및 초기화
		int year =0;
		int age =14;
		//변수에 저장되어 있는 값 출력
		System.out.println(year);
		System.out.println(age);
		
		//변수 값 변경
		year=age+2000; //변수 age의 값에 2000을 더해서 변수 year에 저장
		age=age+1;     //변수 age에 저장된 값에 1을 증가
		
		//변경된 변수값 출력
		System.out.println(year);
		System.out.println(age);
		
	}

}
