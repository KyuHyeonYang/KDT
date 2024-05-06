package ch10_exception.sec02;

import java.util.Scanner;

import ch06_class.sec17.Calculator;

public class ThrowsMainEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("정수 1 입력: ");
		int num1 = sc.nextInt();
		System.err.println("정수 2 입력: ");
		int num2 = sc.nextInt();
		
		try {
			calculate(num1,num2);
			

		} catch (ArithmeticException e){//ArithmeticException 
			System.out.println("0으로 나눌 수 없습니다");

		}
		sc.close();
		
		}
	public static void calculate(int num1,int num2) throws ArithmeticException{
		System.out.println(num1/num2);
	}

	

}
