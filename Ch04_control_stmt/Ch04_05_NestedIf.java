package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_05_NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);

		
		System.out.println("번호를 입력하세요. 1.현금 2.카드: ");
		int num=sc.nextInt();
		int amount=0;
		
		if(num==1||num==2) {System.out.print("지불액입력");
		amount=sc.nextInt();
	    }
		if(num==1) {
			System.out.println("할인율 10%");
			System.out.println("할인액"+(int)(amount*0.1)+"원");
			num=sc.nextInt();
		  }else if(num==2) {
			System.out.println("할인율 5%");
			System.out.println("할인액"+(int)(amount*0.05)+"원");
			
		} else   {
			System.out.println("잘못 입력하였습니다.종료합니다.");
		}
		
		
		
	}

}
