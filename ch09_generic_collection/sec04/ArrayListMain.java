package ch09_generic_collection.sec04;

import java.util.ArrayList;

public class ArrayListMain {

	public static void main(String[] args) {
		// 제네릭 타입이 아닌 경우 ArrayList 사용
		ArrayList list = new ArrayList();

		// 리스트 항목 추가 : add()
		list.add(100);
		list.add("홍길동");
		list.add(7.7);
		list.add("자바");
		list.add("홍길동");

		// 리스트 전체 내용 출력 : get(인덱스)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

	}

}
