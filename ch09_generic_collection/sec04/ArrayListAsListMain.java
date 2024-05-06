package ch09_generic_collection.sec04;


import java.util.Arrays;
import java.util.List;

public class ArrayListAsListMain {

	public static void main(String[] args) {
		// asList()사용해서 초기화
		List<String>list1=Arrays.asList("홍길동","이몽룡","성춘향");
		for(String name:list1) {
		System.out.println(name);
		}
		List<Integer>list2=Arrays.asList(1,2,3);
		for(int value:list2) {
			System.out.println(value);
		}
	}

}
