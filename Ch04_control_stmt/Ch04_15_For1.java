package Ch04_control_stmt;

public class Ch04_15_For1 {

	public static void main(String[] args) {
		// for문
		
		//for문 안에 선언된 변수 (int i)는 해당 for문 안에서만 사용가능
		
		for(int i=1; i<=5;i++) {
			System.out.println(i);
		}
		//옆으로 출력
		for(int i=1;i<=5;i++) {
			System.out.print(i);
		}
	
		//for 문 안에서 선언된 변수는 for문 밖에서 사용 불가
		//Sysoutln(i);//오류
		System.out.println("\n=========");
		for(int i=1,j=10;i<=10;i++,j--) {
			System.out.printf("(%d,%d)",i,j);
		}
		
	}

}
