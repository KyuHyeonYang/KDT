package ch10_exception.sec01;

import java.util.concurrent.ForkJoinTask;

public class CatchOrderMain {

	public static void main(String[] args) {
		//catch순서
		int []arr= {1,2,3};
		
		try {
			System.out.println(Integer.parseInt("a100")); //=첫번째 예외만 처리
			System.out.println(arr[5]);

		} catch (Exception e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");

		} //catch (NumberFormatException e) {//실행되지 않는 문장이라고 컴파일러 오류 알려줌
			//System.out.println("숫자로 변환 할 수 없습니다.");}

		finally {
			System.out.println("다시 실행하세요");
		}

	}

}
