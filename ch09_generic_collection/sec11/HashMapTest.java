package ch09_generic_collection.sec11;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {

		// Hash MAp
		Map<String, Integer> map = new HashMap<String, Integer>();

		// 객체저장:put(key,value)
		map.put("홍길동", 90);
		map.put("이몽룡", 80);
		map.put("성춘향", 95);
		map.put("홍길동", 85);// key중복(새로추가되지않고,값만 덮어씀)

		System.out.println("총 객체 수 : " + map.size());

		// key에 해당되는 value출력 :get(key)
		System.out.println(map.get("홍길동"));

		// 전체 객체 출력:방법1
		System.out.println("------------");
		for (String k : map.keySet()) {
			System.out.println(k + ":" + map.get(k));
		}
		// 전체 객체 출력:방법2
		System.out.println("-------------");
		Set<String> keySet = map.keySet();
		for (String k : keySet) {
			System.out.println(k + ":" + map.get(k));
		}
		// 전체 객체 출력:방법3
		System.out.println("--------------");
		map.forEach((key, value) -> {
			System.out.println(key + ":" + value);
		});
		// 전체 객체 출력 :방법4
		// for(Entry<String,Integer> entrySet: map.entrySet()) {
		// System.out.println(entrySet.getKey()+":"+entrySet.getValue());
		// }

		// System.out.println("------------------------------");
		// System.out.println(map.entrySet());
	}

}
