package ch07_inheritance.sec01;

public class Child extends Parent{
private int c;
	
	public void setChild() {
		c = 20;
	}
	
	public void showChild() {
		// p = 100; // Parent 클래스의 멤버 필드 p는 private 선언. 자식 클래스에서 사용 불가 
		showParent(); // 부모 클래스 메소드 사용 
		System.out.println("자식 클래스 c : " + c);
	}

}
