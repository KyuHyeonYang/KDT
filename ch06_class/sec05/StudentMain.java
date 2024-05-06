package ch06_class.sec05;

import java.util.Scanner;

public class StudentMain {
	/*private String stdNo;
	private String stdName;
	private int stdYear;
	private int stdScore;*/
	public static void main(String[] args) {
		Student std = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.print("학번: ");
		String stdNo = sc.next();
		System.out.print("성명: ");
		String stdName = sc.next();
		System.out.print("학년: ");
		int stdYear = sc.nextInt();
		System.out.print("점수:  ");
		int stdScore = sc.nextInt();
		System.out.println();
		sc.close();
	
	}
		public void showStdInfo() {
		System.out.println("******학생 정보 출력*******");
		System.out.println("학번: "+ stdNo);
		System.out.println("성명: "+ stdName);
		System.out.println("학년: "+ stdYear);
		System.out.println("점수: "+ stdScore);
		}
}

