package Ch04_control_stmt;

import java.text.DecimalFormat;

public class Ch04_07_NumberFormat {

	public static void main(String[] args) {
	
		// 천단위 구분표시
		int price = 1000000;

		// (1)DecimalFormat 클래스 사용
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println("1가격: " + df.format(price));

		// (2)printf()사용
		System.out.printf("\n2가격:%,d", price);

		// (3)String.format()사용
		System.out.println(String.format("\n3가격:%,d", price));
		System.out.println();

		// 소수점 이하 추력
		// 천단위 구분자 +소수점 자릿수 표시
		double num = 1234.4567;
		// (1)DecimalFormat 클래스 사용
		DecimalFormat df2 = new DecimalFormat("#,###.00");
		System.out.println("1가격: " + df);
	}

}
