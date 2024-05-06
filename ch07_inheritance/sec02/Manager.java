package ch07_inheritance.sec02;

import java.util.Scanner;

public class Manager extends Employee {

	private String Position;
	Scanner sc = new Scanner(System.in);

	public void setManager() {

		setEmployee();
		System.out.print("직위입력: ");
		Position = sc.next();
		System.out.println("*********************");
		sc.close();
	}

	public void showManagerInfo() {
		System.out.println("직위 입력 :" + Position);
	}

}
