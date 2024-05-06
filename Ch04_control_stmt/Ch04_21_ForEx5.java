package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_21_ForEx5 {

	public static void main(String[] args) {
		// 그림과 같이 입력한 학생 수 만큼 점수를 입력 받아 평균을 구하여 출력하는 프로그램 작성
		Scanner sc=new Scanner(System.in);
		int num=0;
		
		int sum=0;
		double avg;
		System.out.print("학생 수 입력:");
		num=sc.nextInt();
		
		
		for(int i=1;i<=num;i++) {
			System.out.printf("학생 %d점수 입력: ",i);
			int score=sc.nextInt();
			sum+=score;
			System.out.printf("평균:");
		}
		double avr=sum/num;
	    System.out.printf("평균:%.2f",avr);
		sc.close();
	}

}
