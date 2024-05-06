package ch10_exception.sec01;

import java.util.Scanner;

public class ExceptionEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("정수 1 입력: ");
		int num1 = sc.nextInt();
		System.err.println("정수 2 입력: ");
		int num2 = sc.nextInt();
		try {
			System.out.println(num1 / num2);

		} catch (Exception e){//ArithmeticException 
			System.out.println("0으로 나눌 수 없습니다");

		}finally {
			System.out.println("종료");
		}

	}

}
