package Ch03_operator;

import java.util.Scanner;

public class Ch03_03_ArithmeticOpEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		System.out.print("국어 점수 입력");
		int kor =sc.nextInt();
		
		System.out.print("영어 점수 입력");
		int eng=sc.nextInt();
		
		System.out.print("수학 점수 입력");
		int math=sc.nextInt();
		
	
		System.out.println("============");
		int total =kor + eng + math ;
		double average =total /3.0;
		System.out.println("총점 :"+total);
		
		System.out.println("평균 :"+average);
		
		
		//소수점이하 자릿수 표현
		//(1)pritf()사용
		System.out.printf("평균:%.2f",average);
		
		//(2)DecimalFormat 클래스 사용
		sc.close();
	}

}
