package ch06_class.sec13;

public class Car {
	// 멤버 변수 : 멤버 필드
	// 데이터를 저장하기 위한 변수 
	// private : 접근 제한자 (Car 클래스 외부에서 접근 불가)
	// CarMain의 main()에서 사용 불가
	private String carNo;		// 차량번호
	private String carName; // 차종
	private String carMaker;  // 제조회사
	private int carYear;  // 연식
	private int carCC;  // 배기량 
	
	// 매개변수가 있는 생성 (우클릭-src-generate constructor using filed)
	//객체 생성시 반드시 값 전달 받아야함
	public Car(String carNo, String carName, String carMaker, int carYear, int carCC) {
		super();
		this.carNo = carNo;
		this.carName = carName;
		this.carMaker = carMaker;
		this.carYear = carYear;
		this.carCC = carCC;
	}

	// (2) 멤버 변수의 값을 출력하는 메소드
	public void showCarInfo() {
		System.out.println("차량번호 : " + carNo);
		System.out.println("차종 : " + carName);
		System.out.println("제조회사 : " + carMaker);
		System.out.println("연식 : " +carYear);
		System.out.println("배기량 : " + carCC);
}


	}

