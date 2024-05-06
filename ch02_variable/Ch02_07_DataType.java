package ch02_variable;

public class Ch02_07_DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자형 변수 선언 및 초기화
		char a ='A'; //대문자 A
		char b ='\u0041';//문자 A의 유니코드
		char c = 65;//문자 A의 아스키코드 값
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		//문자형 변수를 정수형으로 변환하면 아스키모드 값 출력
		System.out.println((int)'A');//(int)는 정수형으로 변환해라 따라서 65출력
		System.out.println((int)'B');
		System.out.println((int)'Z');
		//65~90:대문자
		
		System.out.println((int)'a');
		System.out.println((int)'b');
		System.out.println((int)'z');
		//
	}

}
