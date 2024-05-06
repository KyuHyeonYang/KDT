package Ch03_operator;

import java.util.Scanner;

public class Ch03_08_LogicalOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//논리 연산자
		
		Scanner sc=new Scanner(System.in);
		
		char ch=' ';//스페이스로 초기화
		System.out.print("문자 하나 입력: ");
		ch=sc.next().charAt(0);// 입력한 문자열 중에서 첫번째 문자만 선택해서 저장

		//숫자인지 확인:아스키 코드값으로 비교(48~57)
		if('0'<=ch&&ch<='9') {
			System.out.println("숫자");
		}
		System.out.println((int)'0');//48
		System.out.println((int)'9');//57
		sc.close();
	
	
	//영문자 인지 확인 
	if('a'<ch&&ch<'z' || 'A'<ch&&ch<'Z') {
		System.out.println("영문자");
	}
	
	//한글인지 확인 :유니코드 사용
	if(ch>='\uAC00' && ch <='\uD7A3'){
			System.out.println("한글");
	}
	System.out.println('\uAC00');
	System.out.println('\uD7A3');
	//참ㄱㅎ:65~122사이에 특수문자도 포함(91~96)
	if(65<=ch&&ch<=122)
		System.out.println("영문자");
	////////////////////////////////////////////////////////////////////
	//입력된 숫자가 2또는 3의 배수인지 확인
	
	System.out.print("숫자입력");
	int i=sc.nextInt();
	
	if(i%2==0 || i%3==0) {
		System.out.println("2또는3의배수입니다");
	}
		System.out.println("입력한숫자:"+i);
	}
	
	
	
	
	
	
	}
	
	

