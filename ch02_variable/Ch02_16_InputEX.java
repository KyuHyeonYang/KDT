package ch02_variable;

import java.util.Scanner;

public class Ch02_16_InputEX {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		String name;
		int year;
		double score1;
		String grade;
 
		System.out.printf("이름: ");
	    name=sc.next();	
	    System.out.printf("학년: ");
		year=sc.nextInt();
		
	    System.out.printf("점수: ");
		score1=sc.nextDouble();
		
		System.out.printf("학점: ");
		grade=sc.next();
		
				
	
	}

}
