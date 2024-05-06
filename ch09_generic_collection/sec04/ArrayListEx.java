package ch09_generic_collection.sec04;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {

	public static void main(String[] args) {
		// ArrayList를 사용하여 4개의 단어를 입력받아서
		// 가장 긴 단어의 길이를 출력하는 프로그램 작성
		Scanner sc = new Scanner(" ");
		ArrayList<String> list = new ArrayList<String>();

		String str = "";

		for (int i = 0; i < 4; i++) {
			System.out.print("단어를 입력하세요 >> ");
			list.add(sc.next());
			str = (str.length() - list.get(i).length() < 0) ? list.get(i) : str;
		}

		System.out.println(list);
		System.out.println("가장 긴 단어는 : " + str);
		System.out.println("가장 긴 단어의 길이는 : " + str.length());

		sc.close();
	}
}
