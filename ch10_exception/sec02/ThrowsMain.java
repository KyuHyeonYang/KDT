package ch10_exception.sec02;

import java.security.PublicKey;

public class ThrowsMain {

	public static void main(String[] args)  {
		// 예외처리 떠넘기기:throws
		try {
			findclass();
		} catch ( ClassNotFoundException e) {
			 	System.out.println("클래스가 존재하지 않습니다");
		}
	}
		//findclass()메소드 
	public static void findclass()throws ClassNotFoundException{//Exception
		 Class class1=Class.forName("jave.lang.String2");
	}
	

}
