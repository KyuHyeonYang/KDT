package ch07_inheritance.sec06;

class SuperClass {
	int x, y;

	public SuperClass() {
		x = 5;
		y = 10;

	}
}

class SubClass extends SuperClass {
	int x;

	public SubClass() {
		x = 10;
	}

	public void show() {
		// 부모클래스 필트(x),자식 클래스 필드 (x)

		System.out.println("x: " + x);// 자식클래스의x값
		System.out.println("this.x: " + this.x);
		System.out.println("super x:" + super.x);
		System.out.println("y: " + y);
		System.out.println("super y: " + super.y);
	}
}
		public class SuperTest {
			public static void main(String[] args) {
				SubClass sc = new SubClass();
				sc.show();

			}

		}
	
