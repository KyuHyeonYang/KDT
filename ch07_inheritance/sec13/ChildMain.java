package ch07_inheritance.sec13;

public class ChildMain {

	public static void main(String[] args) {
		Child child=new Child();
		//부모 클래스 타입에 자식 클래스 객체 대입
		Parent parent=child;//자동 타입변환 발생
		//parent 변수는 child객체를 참조하지만
		//parent 클래스의 맴버만 사용가능
		
		parent.method1();//parent 메소드 사용가능
		//child 객체를 참조하지만 Child클래스 멤버는 사용할 수 없음
		
		//parent.method3();->호출 불가능
		
		parent.method2();//재정의된Child의 method2()호출
		//parent 타입이므로 Parent 클래스의 method2()를 실행하려고 하니 
		//Child 클래스에 재정의 되어 있는 것이 확인
		//그럼 부모클래스 멤버를 호출하지않고 자식 클래스에 재정의된 멤버 메소드가 호출됨
	}

}
