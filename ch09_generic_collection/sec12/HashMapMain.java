package ch09_generic_collection.sec12;

import java.util.HashMap;
import java.util.Map;

public class HashMapMain {

	public static void main(String[] args) {
		/*
		 * key:Student
		 * value:점수
		 * 학생 3명의 성적 저장하고 출력
		 * 1홍길동 90
		 * 2이몽룡 80
		 * 3성춘향 95*/
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("홍길동", 90);
		map.put("이몽룡", 80);
		map.put("성춘향", 95);
		
		for(String k:map.keySet()) {
			System.out.println(k+":"+map.get(k));
		}

	}

}
