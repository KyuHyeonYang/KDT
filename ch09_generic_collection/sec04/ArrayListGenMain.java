package ch09_generic_collection.sec04;

import java.util.ArrayList;
import java.util.List;

public class ArrayListGenMain {

	public static void main(String[] args) {
		// 제네릭 타입인 경우 ArrayList
		//ArrayList<String> list = new ArrayList<String>();//클래스타입 변수 =클래스 객체
		List<String>list =new ArrayList<String>();
		list.add("Java");
		list.add("Datebase");
		list.add("HTML");
		list.add("Java");
		list.add("프로그래밍");
		System.out.println("총 객체 수: "+list.size());
		for (int i=0; i<list.size();i++) {
			System.out.println(list.get(i));
			
		}System.out.println();
		//list.add(100); String 타입이 아니면 오류남
		//항목제거
		list.remove(1);//인덱스1 (두번째 요소)제거
		for(String value:list) {
			System.out.println(value);
		}System.out.println();
		for(String value:list) {
			System.out.println(value.length());
		}
	}

}
