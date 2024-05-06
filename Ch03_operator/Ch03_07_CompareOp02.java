package Ch03_operator;

import java.util.Scanner;

public class Ch03_07_CompareOp02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//문자열 비교
		
		Scanner sc=new Scanner(System.in);
		
		String pass="1234";//이미 저장되어 있는 비밀번호 
		String userPass="";//로그인 시 입력하는 비밀번호 저장할 변수
		
		System.out.print("비밀번호 입력");
		userPass=sc.next();
				
		//문자열 비교 :equals() 메소드사용
	    //if~else 문 사용
		//입력한 비밀번호와 저장된 비밀번호가 같은지 비교
		//같으면 "PASS" 출력
		//다르면 "NO PASS"출력
		if (userPass.equals(pass))
			System.out.println("PASS");
		else
			System.out.println("NO PASS");
		sc.close();
	}

}
