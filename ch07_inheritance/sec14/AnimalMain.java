package ch07_inheritance.sec14;

import ch07_inheritance.sec11.Animal;
import ch07_inheritance.sec11.Cat;
import ch07_inheritance.sec11.Dog;

public class AnimalMain {

	public static void main(String[] args) {
		// (1)다형성이 아닌 예
		Animal a = new Animal();
		a.show();

		Cat c = new Cat();
		c.show();

		Dog d = new Dog();
		d.show();
		System.out.println("--------------");

		// (2)다형성인 경우:부모클래스 타입에 여러자식 객체 대입
		// 하나의 타입에 여러객체를 대입함으로서 다양한 기능 이용

		Animal ap = null;// 참조변수만 선언
		// 부모 Animal.타입 참조변수에cat타입 객체 대입
		ap = new Cat();// 자동타입변환 발생
		ap.show();// 오버라이딩 된 쇼 ()호출
		ap.sound();// 오버라이딩 된 사운드()호출
		// 부모 Animal.타입 참조변수에 Dog 타입 객체 대입
		ap = new Dog();
		ap.show();
		ap.sound();
		// ap:Animal 타입에 Dog타입 객체가 대입한 상태
		// Animal 타입이기 때문에 Animal클래스 메소드만 사용가능
		// (오버라이딩 된 경우에는 예외로 자식 클래스 메소드 사용가능)
		// Dog 클래스의 메소드 사용불가
		// ap.dogMethod();//사용불가:사용하기 위해서는 강제 타입 변환이 필요하다(타입 원위치)

		// Dog 클래스의 멤버메소드를 사용하기 위해
		// Dog 타입으로 강제 타입 변환 수행
		d = (Dog) ap;// Dog 타입으로 변환
		//d.dogMethod();// Dog 클래스의 멤버 사용 가능
		// 강제 타입변환이 가능한 이유
		// Dog타입이 Animal타입으로 자동 타입변환이 발생한 상태이므로
		// 다시 Dog타입으로 강제타입 변환이 가능

		Animal aa = new Animal();
		//Dog dd = (Dog) aa;// 실행시 예외 발생(컴파일 때 오류없음)
		// 동적 바인딩이기 때문에 싱행시 알수 있음
		// ClassCastException:강제 타입변환 예외 발생
		
		// 자동 타입 변환 되어 있는지 확인하고 타입 변경수행
		if(aa instanceof Dog) {
			Dog dd=(Dog)aa;
			System.out.println("Dog 타입으로 변환 성공");
		}else {
			System.out.println("Dog 타입으로 변환 불가");
		}

	}

}
