package ch06_class.sec13;



public class CarMain {

	public static void main(String[] args) {
		//Car클래스의 객체생성
		//매개변수가 있는 생성자로 정의 했기 때문에
		//객체야함 안 생성시 반드시 매개 변수로 값을 전달해하면 오류남
		//주의:매개변수가 정의된 순서대로,데이터 타입에 맞게 기술해야함
		
		Car c1=new Car("11가1234","소나타","현대",2024,1500);//객체 생성하면서 값 전달
		Car c2=new Car("22sk5678","K7","기아",2023,2000);
		
		c1.showCarInfo();
		c2.showCarInfo();
	

	}

}
