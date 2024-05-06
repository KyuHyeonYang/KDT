package ch02_variable;

public class Ch02_17_printf {

	public static void main(String[] args) {
		// printf();형식화된 출력 메소드
		String name="홍길동";
		int age =20;
		float score =93.12345f;
		char grade ='A';
		
		System.out.printf("%s%d%f%c",name,age,score,grade);
		
		System.out.println();
		
		System.out.printf("성명:%s,나이:%d , 점수:%f , 학점: %c",name,age,score,grade);
		
		System.out.println('\n');
		//%n:줄바꿈
		System.out.printf("성명:%s,나이:%d,%n점수");
		//
		//참고
		System.out.printf("\n");
		double d=93.12345;
	//소수점 자릿수 지점 :%f->%.2f
		System.out.printf("성명:%s,나이:%d,%n,점수:%f,학점:%c",name,age,score,grade);
		System.out.printf("\n");

	//자릿수 지정 
		//10글자 공간 확보 (우측정렬):앞에 공백7개
				System.out.printf("성명:%10s",name);
				//10글자 공간 확보 (좌측정렬):뒤에 공백7개
				System.out.printf("%n성명:%-10s",name);
			
		
		//점도 자릿수에 포함
		System.out.printf("%n%7.3f",190.1234);//전체7자리.소수점 이하3자리.190.123
		System.out.printf("%n%8.3f",190.1234);//전체8자리.소수점 이하3자리. 190.123(앞에 공백 1개)
		
		System.out.printf("%n%5.3f",190.1234);//전제자릿수 상관없이 정수부분 다 출력.190.123
		System.out.printf("%n%6.3f",190.1234);//전체자릿수 상관없이 정수부분 다 출력.190.123
		System.out.printf("%n%1.3f",190.1234);//전체자릿수 상관없이 정수부분 다 출력.190.123
		System.out.printf("%n%0.3f",190.1234);//오류
		//MissingFormatWidthException
		
		
		
	}

}
