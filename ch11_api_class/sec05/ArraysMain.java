package ch11_api_class.sec05;

import java.util.Arrays;
import java.util.Collections;

public class ArraysMain {

	public static void main(String[] args) { 
		//Array클래스
		
	
			//String
			String []names= {"홍길동","성춘향","이몽룡"};
			Arrays.sort(names);
			for(String name:names) {
				System.out.printf(name+"");
			}
			Arrays.sort(names,Collections.reverseOrder());
			System.out.println("\n------------------------------");
			
			//int[]scores= {99,90,95}int 타입인 경우 Collections.reverseOrder()사용불가->Integer사용
			Integer[]scores= {99,90,95};
			//오름차순 정렬
			Arrays.sort(scores);
			for(int n:scores) {
				System.out.printf(n+"");
			System.out.println();
			//	Arrays.sort(scores,Collections.reverseOrder());//int[] 사용불가 
		}
	}

}
