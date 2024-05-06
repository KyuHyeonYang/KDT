package ch08_interface.sec03;

public class Audio implements IRemoteControl {
	// 멤버필드
	private int volume;
	private boolean mute;

	// 필수로 재정의해야 하는 추상메소드 자동 포함됨
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");

	}

//MAX 보다 크면 MAX로 설정 MIN보다 작으면 MIN으로 설정
	@Override
	public void setVolume(int volume) {
		if (volume > IRemoteControl.MAX_VOLUME) {
			this.volume = IRemoteControl.MAX_VOLUME;
		} else if (volume < IRemoteControl.MIN_VOLUME) {
			this.volume = IRemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 오디오 볼륨: " + this.volume);
	}
//default 메소드 재정의(오버라이딩선택)
//주의:default 적지않음
//클래스에서는 default가 접근 제한자이고 생략해서 사용하기때문이다.

	@Override
	public void setMute(boolean mute) {
	this.mute=mute;
	if(this.mute) {
		System.out.println("오디오 무음 처리 합니다.");
	}else {
		System.out.println("오디오 무음 해제합니다.");
	}
	}
	
}
