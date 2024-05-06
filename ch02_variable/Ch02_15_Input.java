package ch02_variable;

import java.util.Scanner;
//자동 import:ctrl+shift+O
public class Ch02_15_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//입력받기위해서 Scanner 클래스 객체 생성
		Scanner sc = new Scanner(System.in);
		//입력 받은 값 변수 미리 선언
		int n1,n2;
		
		System.out.print("첫번째 숫자 입력:");
		n1 =sc.nextInt();
		
		System.out.print("두번째 숫자 입력: ");
		n2 =sc.nextInt();//입력한 값을 정수로 반환하여 n2에 저장
		
		System.out.println("---------------");
		System.out.println(n1);
		System.out.println(n2);
	
		//두 수의 합(+),두 수의 곱(*) 출력
		System.out.println("----------");
		System.out.println(n1+n2);
		System.out.println(n1*n2);
	}

}
