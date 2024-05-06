package ch08_interface.sec04;

public interface IRemoteControl {
	// 상수 필드 선언 : 자동으로 public static final 붙음 (컴파일 과정에서)
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	// 추상 메소드 선언 : 자동으로 public abstract 붙음 (컴파일 과정에서)
	//반드시 오버라이딩 해야 함(필수)
	void turnOn();
	void turnOff();
	void setVolume(int volume);
	
	// 디폴트 메소드 선언 
	// 디폴트 메소드 : 실행 블록({  })이 있는 메소드
	// default 붙여야 함(이때의 default 접근제한자 아니고 메소드 유형의 의미)
	// 기본적으로 public 접근 제한 (생략하더라도 컴파일 과정에서 자동으로 붙음)
	// 오버라이딩 선택
	public default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다");
		} else {
			System.out.println("무음 해제합니다");
		}
	}
	
	// static 메소드 (정적 메소드) : 반드시 body {} 구현 해야 함
	// 실행 블록이 있는 메소드 
	public static void changeBattery() {
		System.out.println("배터리를 교체합니다");
	}

}
