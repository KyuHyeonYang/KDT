package ch02_variable;

public class Ch02_13_Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//큰 크기의 타입을 작은 크기의 타입으로 강제 타입변환 (형변환)시
		//데이터의 일부손실 발생
		//강제타입변환 실사용ex)234.54원->234원 
		//원단위절사 , 실수를 정수로 강제타입변환 
		
		int iVal =42600970;
		byte bVal =(byte)iVal;
		System.out.println(bVal);
		//실수값을 정수로 저장 시 강제 타입 변환 수행해서 
		//소수점 이하 값 손실
		double dVal =3.14159;
		iVal =(int) dVal;
		System.out.println(iVal);
		//변환할 타입의 최대값 최소값 범위확인
		System.out.println(Byte.MIN_VALUE);//-128
		System.out.println(Byte.MAX_VALUE);//127
		
		System.out.println(Integer.MIN_VALUE);//-2147483648
		System.out.println(Integer.MAX_VALUE);//2147483647
		//Byte,Integer:wraper(포장)클래스
		//-기본 타입에 대응되는 클래스,
	}

}
