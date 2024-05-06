package ch02_variable;

public class Ch02_14_Promotion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//연산식에서 자동 타입변환
		int iVal=10;
		double dVal=5.5;
		//iVal->double 로 자동 타입변환
		//작은 크기가 큰 크기 타입으로 자동 타입변환
		double result=iVal+dVal;
		System.out.println(result);//15.5
		/*연산시 주의!
		 * -정수 연산일경우 :int타입이 기본(4byte)
		 * -4바이트보다 작은 타입(바이트,char,short)은 int타입으로 변환된 후 연산 수행
		 * byteVal1+byteVal2의 결과가 int타입이므로 byte타입변수에 저장할 경우 
		 * 컴파일 에러 발생*/
		byte bVal1=10;
		byte bVal2=20;
		/*byte bresult=bVal1+bVal2;오류발생,
		 * int 타입으로 변환되어연산된 int 결과를 byte에 저장불가
		System.out.println(bresult);*/
		
		int iResult=bVal1+bVal2;
		System.out.println(iResult);
		
	
	}

}
