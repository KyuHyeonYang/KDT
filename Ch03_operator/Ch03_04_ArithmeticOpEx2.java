package Ch03_operator;

import java.util.Scanner;

public class Ch03_04_ArithmeticOpEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.print("시간입력 (초):");
		int sec=sc.nextInt();
		int sec2=sec%60;
		int minute=sec %3600 /60;
		int hour=sec/3600;    
		System.out.println(sec+"초는"+hour+"시간,"+minute+"분,"+sec2+"초입니다.");
		sc.close();
	}
	}  
	
	
