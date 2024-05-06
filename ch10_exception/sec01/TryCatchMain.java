package ch10_exception.sec01;

public class TryCatchMain {

	public static void main(String[] args) {
		//예외처리 try~catch
		int []arr= {1,2,3};
		try {
			//오류가 발생할 수 있는 문장을 여기에 위치시키고
			//예외가 발생하면 catch 문/finally 문 실행
			//예외가 발생하지 않으면 catch 문은 건너 뛰고 finally 문 실행
			System.out.println(arr[5]);
		}catch ( ArrayIndexOutOfBoundsException e) 	{
			System.out.println("배열범위를 벗어났습니다");
			
		}finally {
			System.out.println("무조건 실행되는 문장입니다");
		}
		
		System.out.println(arr[5]);

	}

}
