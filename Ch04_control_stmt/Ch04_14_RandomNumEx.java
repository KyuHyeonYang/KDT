package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_14_RandomNumEx {

	public static void main(String[] args) {
		/*-        가위바위보 게임
		-        com : 컴퓨터 (랜덤 숫자 1 ~ 3)
		-        user : 당신 (입력 값)
		-        if문 사용
		-        숫자 입력
		-        실행 결과
		-        가위(1), 바위(2), 보(3) 중 하나 입력하세요 : 2
		-        당신은 2입니다.
		-        컴은 1입니다.
		-        당신이 이겼습니다.*/
		
		System.out.print("가위(1),바위(2),보(3) 중 하나를 입력하세요: ");
		
		Scanner sc=new Scanner(System.in);
		int user =sc.nextInt();
		int com=(int)( Math.random()*3)+1;
		
		System.out.println("\n당신은"+user+"입니다.");
		System.out.println("컴은"+com+"입니다.");
		
		switch(user-com) {
	        case -1: case 2:
	       
			System.out.println("당신이 졌습니다.");
			break;
	        case -2: case 1:
	        	System.out.println("당신이 이겼습니다");
		
	        case 0:
	        	System.out.println("비겼습니다.");
	        	break;
		}

	}

}
