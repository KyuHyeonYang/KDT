package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_04_MultipleIfElseEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc=new Scanner(System.in);
		
		int num1,num2,num3;
		int max;
		System.out.print("숫자1 입력: ");
		num1=sc.nextInt();
		System.out.print("숫자2 입력: ");
		num2=sc.nextInt();
		System.out.print("숫자3 입력: ");
		num3=sc.nextInt();
		
		
		
		if(num1>num2&&num1>num3) {
			System.out.println("가장 큰 수 :"+num1);
		}else if(num2>num3) {
			 System.out.println("가장 큰 수 :"+num2);
		}else if(num3>num1) {
			
			System.out.println("가장 큰 수 :"+num3);
		}
		
	}

}
