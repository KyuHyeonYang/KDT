package Ch04_control_stmt;

public class Ch04_16_For2 {

	public static void main(String[] args) {
		
		int sum = 0;

		for (int i = 1;i <= 10; i+=2) {
			sum+=i;
			System.out.println(i);
		}
		System.out.println("1~10 홀수의 합:"+ sum);
	}

}
