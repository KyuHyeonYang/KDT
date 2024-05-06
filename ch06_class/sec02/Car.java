package ch06_class.sec02;


	// 클래스 : 설계
//  사용자 정의 클래스 생성 : 개발자가 임의로 변수, 메소드 정의
// 데이터를 다루기 위한 멤버 변수
// 데이터를 조작해서 어떤한 기능을 수행하기 위한 멤버 메소드
// 클래스의 멤버 변수는 모든 메소드에서 사용 가능 (같은 멤버이기 때문에)

public class Car {
	// 멤버 변수 : 멤버 필드
	// 데이터를 저장하기 위한 변수 
	// 접근 제한자 private 삭제 : 기본은 default(default라고 적지 않음)
	String carNo;		// 차량번호
	String carName; // 차종
	String carMaker;  // 제조회사
	int carYear;  // 연식
	int carCC;  // 배기량 
	
	// 멤버 메소드
	public void showCarInfo() {
		System.out.println("차량번호 : " + carNo);
}
}
