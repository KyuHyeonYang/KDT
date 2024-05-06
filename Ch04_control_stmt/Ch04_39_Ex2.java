package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_39_Ex2 {

	public static void main(String[] args) {
		// 
		//(2)입력된 문자열(value)이 숫자인지를 판별하는 프로그램
		/*실행 결과 , 비밀번호 입력 (모두 숫자로 입력) : 12345
		 * 2345는 숫자입니다
		 * 비밀번호 입력(모두 숫자로입력)12345a
		 * 12345a는 숫자가 아닙니다 */
		
		Scanner sc=new Scanner(System.in);
		
		char ch=' ';
		boolean isNumber=true;
		
		System.out.println("비밀번호 입력(모두 숫자로만 입력: ");
		String value=sc.next();
		for (int i=0; i<value.length();i++) {
			ch=value.charAt(i);
			
			
			if (!('0'<=ch&&ch<='9'))
				isNumber=false;
				break;
		}
		
	    if(isNumber) {
			System.out.println(value+"는 숫자입니다.");
	 	} else {
			System.out.println(value+"는 숫자가 아닙니다.");
	}
}
}

