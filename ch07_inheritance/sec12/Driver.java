package ch07_inheritance.sec12;

public class Driver {
	//매개변수가"vehicle"타입으로 받음
	//bus->vehicle로 자동 타입변환
	public void drive(Vehicle vehicle) {
		vehicle.run();//bus 또는 taxi 객체에 따라 재정의된 run()호출
		
	}

}
