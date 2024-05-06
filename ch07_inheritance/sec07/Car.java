package ch07_inheritance.sec07;

public class Car  {
	private int carYear;
	private String carNo, carName, carMaker;

	@Override
	public String toString() {
		return "Car [carNo=" + carNo + ", carYear=" + carYear + ", carName=" + carName + ", carMaker=" + carMaker + "]";
	}

	public Car(int carYear, String carNo, String carName, String carMaker) {
		super();
		this.carYear = carYear;
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
	}

	public void setCarInfo() {
		carNo = "01가1234";
		carName = "아반떼";
		carMaker = "현대";
		carYear = 2023;

	}

	public void showCar() {

		System.out.println("차량번호: " + carNo);
		System.out.println("차종: " + carName);
		System.out.println("제조사: " + carMaker);
		System.out.println("연식: " + carYear);
	}

}
