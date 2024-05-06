package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_19_ForEx3 {

	public static void main(String[] args) {
		//그림과 같이 시작 값과 마지막 값을 입력 받아서 두 수 사이의 합을 구하는 프로그램 작성
		int start,last;
		int sum=0;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.print("두 수를 입력하세요: ");
		start=sc.nextInt();
		last=sc.nextInt();
		
		for(int i=start; i<=last ; i++) {
			sum+=i;
			System.out.println("입력한 두 수사이의 합은:"+sum);
		}

	}

}
