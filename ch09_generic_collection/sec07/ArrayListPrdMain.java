package ch09_generic_collection.sec07;

import java.util.ArrayList;

public class ArrayListPrdMain {

	public static void main(String[] args) {
		//3개의 상품 객체생성
		 Product p1=new Product(100,"책",20000);
		 Product p2=new Product(101,"펜",2000);
		
		ArrayList<Product>list =new ArrayList<>();
		
		 
		 
		list.add(p1);
		list.add(p2);
		list.add(new Product(103,"키보드",30000));
		
		for(Product prd : list) {
			System.out.println(prd);
		}
	}

}
