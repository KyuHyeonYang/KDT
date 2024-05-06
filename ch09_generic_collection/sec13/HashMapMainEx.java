package ch09_generic_collection.sec13;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicPasswordFieldUI;

import ch02_variable.Ch02_13_Casting;

public class HashMapMainEx {

	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, String>();
	
		map.put("apple", "사과");
		map.put("summer", "여름");
		map.put("candy", "사탕");
		map.put("school", "학교");
		map.put("water", "물");

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("찾고 싶은 단어는?");
			String eng = sc.next();
			if (eng.equals("exit"))
				System.out.println("종료합니다.");
				break;
		}
			
			//입력한 키eng로 값 검색
		String korString=map.get(eng);
		if(korString==null) {
			System.out.println(eng+"는 없는 단어 입니다.");
		}else {
			System.out.println(kor);
		}
		
	}
}
