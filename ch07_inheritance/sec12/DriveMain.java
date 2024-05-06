package ch07_inheritance.sec12;

public class DriveMain {

	public static void main(String[] args) {
	//다형성
		Driver driver=new Driver();
		Bus bus=new Bus();
		Taxi taxi= new Taxi();
		
		driver.drive(bus);//bus 객체 전달->vehicle 타입이 받음(자동 타입 변환)
		driver.drive(taxi);//taxi 객체 전달->vehicle 타입이 받음(자동 타입 변환)

	}

}
