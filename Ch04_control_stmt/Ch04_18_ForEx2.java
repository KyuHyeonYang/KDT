package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_18_ForEx2 {

	public static void main(String[] args) {
		//   구구단의 단 수를 입력 받아서 해당 단을 출력하는 프로그램 작성
		
		System.out.print("숫자를 입력하세요(1~9)");
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		
		for(int i=1;i<=9;i++){
			System.out.println(num+"x"+i+"="+num*i);
			}
		}
	}


