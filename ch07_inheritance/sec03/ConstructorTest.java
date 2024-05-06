package ch07_inheritance.sec03;

//상속에서의 생성자
//매개변수 없는 기본생성자
class A {
	
	public A() {
		System.out.println("기본생성자  A");
	}

	// 매개변수가 1개인 생성자
	public A(int x) {//(4)
		System.out.println("매개변수 생성자A: " + x);
	}
}

//A클래스로부터 상속받음
class B extends A {
	// 매개변수 없는 기본생성자
	public B() {
		System.out.println("기본생성자B");
	}

	// 매개변수가 1개인 생성자
	public B(int x) {//(2)매개변수 1개인 생성자가 호출되었는데
							   //(3)보니까 상속을 받았음.그래서 부모클래스의 생성자를 호출해야하는데
							  //부모클래스의 생성자 중 매개변수가 있는 생성자를 콕 찝어서 선택
		super(x);
		System.out.println("매개변수 생성자B: " + x);//(5)부모클래스 생성자 실행 후 돌아와서 자식 클래스 생성자 실행
	}
}

public class ConstructorTest {

	public static void main(String[] args) {
		//자식 클래스B의 이스턴스 (객체)생성
	
		B b=new B(5);//(1)B클래스의 매개변수 1개인 생성자 호출

	}

}
