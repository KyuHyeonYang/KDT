package ch07_inheritance.sec14;

public class Dog extends Animal{

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("강아지입니다");
	}

	@Override
	public void sound() {
		// TODO Auto-generated method stub
		System.out.println("멍멍");
	}

}
