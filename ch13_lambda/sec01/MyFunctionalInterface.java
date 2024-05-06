package ch13_lambda.sec01;
@FunctionalInterface
public interface MyFunctionalInterface {
	//함수적 인터페이스:추상메소드가 1개만 있는 인터페이스
	//추상메소드:매개변수와 리턴값이 없는 메소드
	public void method();
	
	//public void method2();//추상 메소드가 2개 있으면 오류(함수적 인터페이스가 아님)
	//@FunctuonalInterface 어노테이션 사용하면 컴파일러가 오류 체크해줌
	
}
