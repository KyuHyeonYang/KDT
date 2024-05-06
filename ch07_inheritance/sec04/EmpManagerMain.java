package ch07_inheritance.sec04;

public class EmpManagerMain {

	public static void main(String[] args) {
		// 자식클래스 객체 생성하면서
		// 자식 클래스의 생성자에게 매개변수 전달
		// 부모 클래스의 생성자에게 전달할 매개변수도 같이 전달
		Manager mg = new Manager("1234", "홍길동", "마케팅", "대리");

		// 자식 객체 정보출력 :자동으로 to String()호출
		System.out.println(mg);

	}

}
