package ch02_variable;
//변수 사용범위
public class Ch02_06_Scope {
//메소드 추가
	public void showName() {
	//	System.out.println(name);//name사용 불가, name은 main메소드 내에서만 선언된 
		                         //지역변수 이므로 main 메소드 내에서만 사용가능.
		                         //다른 메소드 showName()에서는 사용 불가.
	}
	public static void main(String[] args) {
		//main()메소드 내에 선언된 지역변수
		//main()메소드에서만 사용가능
		
		String name ="홍길동";//변수 선언 및 초기화
		System.out.println(name);//변수 사용
	}

}
