package ch11_api_class.sec02;

import java.util.Scanner;

public class SubstringMain {

	public static void main(String[] args) {
	
		String regNo;
		//regNo="880818-1234567";
		Scanner scanner=new Scanner(System.in);
		System.out.print("주민등록번호를 입력하세요: ");
		regNo=scanner.next();
		System.out.println(regNo.substring(0, 6));
	}

}
