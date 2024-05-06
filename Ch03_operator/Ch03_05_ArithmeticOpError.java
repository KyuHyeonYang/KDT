package Ch03_operator;

public class Ch03_05_ArithmeticOpError {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//결과값 산출할 때 Overflow 주의
		int x =100000;
		int y =100000;
		
		int result=x*y;
		System.out.println(result);//1410065408
		
		
		//(1)나누기연산
		//정수0으로 나눌경우 예외발생 -실행종료
		//System.out.println(10/0);
		// java.lang.ArithmeticException: / by zero
		
		//실수 0.0으로 나눌경우 Infinity 출력
		System.out.println(10/0.0);
		
		//Double.isInfinity()사용해서 Infinity 인지 확인 가능 ,true 출력
		System.out.println(Double.isInfinite(10/0.0));
		
		//(2)%연산 
		//정수0으로 나눌경우 예외발생 -실행종료
		//System.out.println(10%0);   
		 //java.lang.ArithmeticException: / by zero
		//실수0.0으로 나눌 경우 NaN 출력
		System.out.println(10%0.0);
	}

}
