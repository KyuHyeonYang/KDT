package Ch05_array;

import java.util.Arrays;

public class Ch05_12_ArrayCopy5 {

	public static void main(String[] args) {
		// Array.copyOfRange(원본배열명, 시작인덱스, 끝인덱스)
		int[]a= {1,2,3,4};
		int[]b=Arrays.copyOfRange(a, 1, 3);//인덱스 1~2범위로 복사

		//a변경 전 출력
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println("  ");
		
		//b:변경전 출력
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		
		}
		System.out.println("  ");
		//a의 첫번째 값 변경
		a[0]=0;
		//변경 후 출력
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}

	}

}
