package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_02_IfElseEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("정수입력: ");
		int num=sc.nextInt();
		if (num%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		sc.close();
	
		
		
		
		
		
	}

}
