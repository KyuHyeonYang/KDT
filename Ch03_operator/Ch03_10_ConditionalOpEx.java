package Ch03_operator;

import java.util.Scanner;

public class Ch03_10_ConditionalOpEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수하나 받아서 삼항연산자
		//90=A 80=B 80미만=C
		Scanner sc =new Scanner(System.in);
		System.out.println("점수를 입력하세요:");
		int score=sc.nextInt();
		String result=(score>90?"A":score>79?"B":"C");
		System.out.println(result);
		sc.close();
		
	
		
		
	}

}
