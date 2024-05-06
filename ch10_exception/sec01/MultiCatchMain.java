package ch10_exception.sec01;

public class MultiCatchMain {

	public static void main(String[] args) {
// 다중 캐치블럭
		int[] arr = { 1, 2, 3 };
		/*try {
			System.out.println(Integer.parseInt("a100")); //=첫번째 예외만 처리
			System.out.println(arr[5]);

		} catch (ArithmeticException e) {
			System.out.println("배열의 인덱스 범위를 벗어났습니다.");

		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환 할 수 없습니다.");

		} finally {
			System.out.println("다시 실행하세요");
		}*/
		try {
			System.out.println(Integer.parseInt("a100"));//첫번째 예외만 처리
			System.out.println(arr[5]);

		} catch (ArithmeticException |NumberFormatException e) {//둘 중에 하나 걸리는게 나오는 것
			
			System.out.println("예외발생.");

		
		} finally {
			System.out.println("다시 실행하세요");
		}
	}

}
