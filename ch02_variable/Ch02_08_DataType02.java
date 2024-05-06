package ch02_variable;

public class Ch02_08_DataType02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수형 변수 선언 및 초기화
		
		byte byteVal =10;
		short shortVal =1000;
		int intVal =21000000;//디폴트는 int이므로 문자 안붙임
		long longVal =1000000000000000000L;//8 byte정수 :L을 붙여 long임을 인식시킴
	     //리터럴 (값)에 숫자만 있고 문자 L이 없는 경우 int 타입으로 인식
		//L을 붙이면 이 숫자는 int타입이 아니라long타입이다 라는 의미
		//long 타입 숫자는 long타입으로 선언된 변수에 저장한다
		//숫자 리터럴 구분자 1_000_000 사용가능
		long bigNumber =100_000_000_000L;
		System.out.println(bigNumber);
		
		//실수형 변수 선언 및 초기화
		double doubleVal =0.12345678945141234; //8byte 실수:더 정밀함 (디폴트값)
		float floatVal =0.1234567890123455678f;//4byte 실수:f 안붙이면 오류
		System.out.println(doubleVal);
		System.out.println(floatVal);
		
		//지수표현 e사용
		double dVal = 3e6;
		System.out.println(dVal);
		
		double dVal2 =3e-3;
		System.out.println(dVal2);
	}

}
