package Ch05_array;

import java.util.Arrays;

public class Ch05_11_ArrayCopy4 {

	public static void main(String[] args) {
		//  Arrays.copyOf(원본배열명, 길이)
		int[]a= {1,2,3,4,};
		//int[]b= Arrays.copyOf(a,a.length);
		int[]b=Arrays.copyOf(a, 7);//원본 길이보다 크게복사하면 0으로 채움
		
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
