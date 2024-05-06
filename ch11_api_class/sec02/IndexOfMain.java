package ch11_api_class.sec02;

public class IndexOfMain {

	public static void main(String[] args) {
		// indexOf() : 문자열 찾기
		// 전체문자열.indexOf(“자바”)
		// 매개값으로 주어진 문자열이 시작되는 인덱스 반환
		// 주어진 문자열이 포함되어 있지 않으면 -1 반환
		
		String title="자바 프로그래밍";
		int location=title.indexOf("프로그래밍");
		System.out.println(location);//인덱스 위치 3부터 시작

		//존재하지 않으면 -1반환
		if(title.indexOf("자바")!=-1) {
			System.out.println("자바 관련 도서");
		}else {
			System.out.println("자바관련 도서아님");
		}
	
	}

}
