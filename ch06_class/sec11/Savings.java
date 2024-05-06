package ch06_class.sec11;

import java.util.Scanner;

public class Savings {
	private String name;
	 private int deposit;
	 private int interest;
	 private int balance;
	 
	 public void setName() {
		 name="홍길동";
			
	 }
	 public void setBalance() {
		balance=10000;	
	 }
	 public String getName() {
			return name;
	 }
	 public void inputDeposit() {
			Scanner sc=new Scanner(System.in);
			System.out.println("예금액 입력: ");
			deposit=sc.nextInt();
			balance+=deposit;//잔액계산
			sc.close(); 
	 }
	 public void getInterest() {
		 interest=(int)(balance*0.1);
		 balance+=interest;

		
	 }
	 public int getBalance() {
		  return balance;
			
	 }
}
