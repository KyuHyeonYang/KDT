package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_10_SwitchEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
	    char grade=' ';
		System.out.println("점수 입력(0~100): ");
		int score=sc.nextInt();
		
		/*내가 작성한 코드
		switch (score) {
		case 100: case99:case98: case97: case96:
		case 95: case 94: case 93: case 92: case :91 case 90:
			grade ='A';
			break;
			
		case89:case88: case87: case86:
		case 85: case 84: case 83: case 82: case :81 case 80:
			grade ='B'
			break;*/
		switch(score/10) {
		case 10:
		case 9:
			grade='A';
			break;
		
		case 8:
			grade='B';
			break;
		case 7:
			grade='C';
			break;
		case 6:
			grade='D';
			break;
		case 5: case 4: case 3: case 2: case 1:
			grade='F';
			break;
		default :
			grade='F';
			break;
		
		}
		System.out.printf("학점: %c",grade);
		sc.close();
		
	}

}
