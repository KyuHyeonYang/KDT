package ch08_interface.sec04;

import javax.management.loading.PrivateClassLoader;

import ch08_interface.sec03.IRemoteControl;
//다중인터페이스 구현:2개의 인터페이스 구현
	//모든 인터페잇의 모든 추상 메소드를 오버라이딩 해야함
public class SmartTelevision implements IRemoteControl,ISearchable{

	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다");
		
	}

	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다");

		
	}

	@Override
	public void setVolume(int volume) {
		if(volume > IRemoteControl.MAX_VOLUME) {
			this.volume = IRemoteControl.MAX_VOLUME;
		} 
		else if (volume < IRemoteControl.MIN_VOLUME) {
			this.volume = IRemoteControl.MIN_VOLUME;
		}
		else {
			this.volume = volume;
		}
		System.out.println("현재 스마트 TV 볼륨:" + this.volume);
	}


		
	
	
}
