package ch02_variable;

public class Ch02_02_IntialValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리값 초기화
		boolean isgood = false;
		System.out.println(isgood);
		System.out.println("--------");
		
		//문자값 초기화
		char ch1='\u0000'; //유니코드 공백문자
		char ch2=' ';//공백:''사이에 공백 필요 없으면 오류남
		System.out.println(ch1);
		System.out.println(ch2);
		
		char ch3 ='a';
		System.out.println(ch3);
		System.out.println("----------");
		
		//정수값 초기화
		byte b= 0;
		short s =0;
		int l = 0;
		long l1 =0; //0L로 자동변환
		long l2 =0l;//소문자 i
		long l3 =0L;//대문자 L
		//소문자 쓰라고 하셨는데 계속 오류남 ?
		//->소문자  l로 바꿔서 했더니 오류 안남.문장에  i가 있어서 그런 듯
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(l1);
		System.out.println(l2);
		System.out.println(l3);
		System.out.println("------");
	
	    //문자열
		String s1 = null;//인스턴스 객체생성 안된상태
		String s2 ="";//빈 문자열, 인스턴스 객체 생성되고 빈 값 저장된 상태
		String s3 ="홍길동";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		//인스턴스화 안되면 사용불가: 오류발생
		//문자열 관련 메소드 사용 시 오류
		
	
	}
	

}
