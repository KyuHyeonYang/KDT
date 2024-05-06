package ch07_inheritance.sec11;

public class AnimalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//(1)다형성이 아닌 예
		Animal a=new Animal();
		a.show();
		
		Cat c=new Cat();
		c.show();
		
		Dog d=new Dog();
		d.show();
		System.out.println("--------------");
		//(2)다형성인 경우:부모클래스 타입에 여러자식 객체 대입
		//하나의 타입에 여러객체를 대입함으로서 다양한 기능 이용
		
		Animal ap=null;//참조변수만 선언
		//부모 Animal.타입 참조변수에cat타입 객체 대입
		ap=new Cat();//자동타입변환 발생
		ap.show();//오버라이딩 된 쇼 ()호출
		ap.sound();//오버라이딩 된 사운드()호출
		ap=new Dog();
		ap.show();
		ap.sound();
		
	}

}
