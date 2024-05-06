package ch13_lambda.sec03;

import java.security.PublicKey;

import javax.management.loading.PrivateClassLoader;

public class MyFunctionalInterfaceMain {

	public static void main(String[] args) {
		//매개변수와 반환값이 있는 경우 
		MyFunctionalInterface plus=(x,y)->add(x, y);
		//return 문 만 있는 경우 중괄호와 return 생략가능
		//(x,y)->x+y; 로 작성
		System.out.println(plus.num(1, 2));

	}
		public static int add(int a,int y) {
			return a+y;
		}
}
