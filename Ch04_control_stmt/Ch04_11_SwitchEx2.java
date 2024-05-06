package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_11_SwitchEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("주민등록 번호를 입력하세요.(111111-1111111");
		
		Scanner sc=new Scanner(System.in);
		String regNo =sc.next();
		
		char gender =regNo.charAt(7);
		
		switch(gender) {
		case '1': case'3':
			System.out.println("남자");
			break;
		case '2': case'4':
			System.out.println("여자");
			break;
		default:
			System.out.println("유효하지 않은 주민등록 번호 입니다.");
		}
			
		
	}

}
