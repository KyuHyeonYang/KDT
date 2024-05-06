package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_08_Switch {

	public static void main(String[] args) {
		//swith 문
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("학년 입력: ");
		int year =sc.nextInt();
		
		switch(year) {
		case 1: 
			System.out.println("1학년");
		break;
        case 2:System.out.println("2학년");
        break;
		case 3:System.out.println("3학년");
		break;
		case 4:System.out.println("4학년");
		break;
		default:System.out.println("잘못 입력하였습니다.");
		}
		
	}

}
