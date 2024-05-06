package Ch05_array;

import java.util.Scanner;

public class Ch05_05_ArrayEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//숫자 5개 입력받아서 최대값을 구하여 출력
		
		int[]num=new int[5];
		int max=num[0];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("숫자입력: ");
		
		for(int i=0;i<num.length; i++) {
			num[i]=sc.nextInt();
			System.out.printf("num[]%d: ",i);
		 
			if(num[i]>max) {
				max=num[i];
			}
		}	
		System.out.println("입력된 값:");
		for(int i=0;i<num.length;i++) {
			System.out.printf("%d",num[i]);
		}
		System.out.printf("\n최대값:%d",max);
		}
		
	}


