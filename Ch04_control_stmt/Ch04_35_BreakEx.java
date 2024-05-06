package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_35_BreakEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int balance=100000;
		int withdrawal=0;
		System.out.println("현재 잔액: 100000");
		while(true) {
			
			System.out.print("인출액 입력: ");
			withdrawal=sc.nextInt();
			if(balance<withdrawal) {
				System.out.println("잔액 부족.현재 잔액: "+balance);
				break;
				
			}
			
			balance=balance-withdrawal;
			
		}
	}

}
