package ch11_api_class.sec04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class PatternMainEx {

	public static void main(String[] args) {
		String regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
		String date="java@naver.com";
	
		
		Scanner sc=new Scanner(System.in);
		System.out.print("이메일 주소를 입력하세요: ");
		String email=sc.next();
		boolean result =Pattern.matches(regExp,date);
		
		if(result) {
			System.out.println("이메일 형식이 맞습니다");
		}else {
			System.out.println("잘못입력하셨습니다");
			System.out.println("입력한 값:"+email);
			sc.close();
	}
	}
}
