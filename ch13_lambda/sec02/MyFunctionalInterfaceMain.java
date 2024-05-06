package ch13_lambda.sec02;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		// (2) a -> { System.out.println(a); }
		// - 매개변수가 1개인 경우 괄호 생략 가능
		// (3) a -> System.out.println(a);
		// - 실행문이 1개인 경우 중괄호 {} 생략 가능
		MyFunctionalInterface =(int a)->
		System.out.println(a+"*,5="+);
		
	}
}
