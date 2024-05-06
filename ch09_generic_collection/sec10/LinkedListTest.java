package ch09_generic_collection.sec10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		// 성능비교
		// List=ArrayList
		// List=LinkedList
		// ArrayList=ArrayList
		// LinkedList=LinkedList

		List<String> listArrList = new ArrayList<String>();
		List<String> listLinkedList = new LinkedList<String>();

		ArrayList<String> arrayList = new ArrayList<String>();
		LinkedList<String> linkedList = new LinkedList<String>();

		long startTime = System.nanoTime();
		// 작업
		for (int i = 0; i < 10000; i++) {
			listArrList.add(0, String.valueOf(i));
		}
		long endTime = System.nanoTime();
		System.out.println("listArrList소요 시간: " + (endTime - startTime) + "ns");
		System.out.println("---------------------------------------------------------");
		startTime = System.nanoTime();
		// 작업
		for (int i = 0; i < 10000; i++) {
			listLinkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("listLinkedList소요 시간: " + (endTime - startTime) + "ns");

		System.out.println("=================================================================");
		startTime = System.nanoTime();
		// 작업
		for (int i = 0; i < 10000; i++) {
			arrayList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("arrayListList소요 시간: " + (endTime - startTime) + "ns");

		System.out.println("=================================================================");

		startTime = System.nanoTime();
		// 작업
		for (int i = 0; i < 10000; i++) {
			linkedList.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("linkedList 소요 시간: " + (endTime - startTime) + "ns");

	}
}
