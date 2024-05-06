package ch13_lambda.sec01;



public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		//람다식:매개변수 없고, 리턴값도 없음
		//출력 :method call1
		//람다식
		MyFunctionalInterface f=()->{//매개변수가 없는 경우 반드시 빈 괄호 있어야함
			System.out.println("method call1");
		};
		
		
		//메소드 호출
		f.method();
	}

}
