package ch06_class.sec01;

public class CarMain {

		public static void main(String[] args) {
			// Car 클래스 사용 
			// (1) Car 클래스의 객체를 생성하고
			// (2) 객체를 통해서 메소드 호출
			Car c = new Car(); // 객체 생성
			// 엄밀히 말하면 인스턴스 c 생성
			
			// 객체.메소드() 호출해서 기능 수행
			c.setCarInfo();
			c.showCarInfo();
			//메소드는 작성했다고 해서 일을 수행하지 않음
			// 호출해야만 일을 수행함
		}

}
