package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_20_ForEx4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 숫자(정수) 10개를 입력 받아 양수, 음수, 0의 개수를 출력하는 프로그램 작성

		Scanner sc = new Scanner(System.in);
		int pos = 0;
		int neg = 0;
		int zero = 0;
		int num;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("\n숫자%d 입력: ", i);
			num = sc.nextInt();

			if (num > 0) {
				pos++;
			} else if (num < 0) {
				neg++;
			} else {
				zero++;
			}

			System.out.printf("양수 개수:%d", pos);
			System.out.printf("음수 개수:%d", neg);
			System.out.printf("0의 개수 :%d", zero);
		}
	}

}
