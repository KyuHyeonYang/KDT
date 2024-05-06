package ch09_generic_collection.sec06;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEmpMain {

	public static void main(String[] args) {
		// 사용자 정의 클래스 타입 사용
		
		//3명의 직원 객체 생성
		Employee e1=new Employee(100,"김사원",3000);
		Employee e2=new Employee(101,"이대리",4000);
		//Employee e3=new Employee(102,"박과장",5000);
		
		ArrayList<Employee>list= new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(new Employee(102,"박과장",5000));
		
		for(int i=0;i<list.size();i++) {
			Employee emp=list.get(i);
			System.out.println(emp);
		}
		//향상된 for문 사용해서 모든 객체 출력
		for(Employee employee: list) {
			System.out.println(employee);
		}
		//Iterator사용해서 출력
		Iterator<Employee>it= list.iterator();
		while(it.hasNext());
		 System.out.println(it.next());
	}

}
