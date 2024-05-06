package ch08_interface.sec03;

public class Television implements IRemoteControl {
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");

	}

	@Override
	public void turnOff() {
	System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		
			if (volume > IRemoteControl.MAX_VOLUME) {
				this.volume = IRemoteControl.MAX_VOLUME;
			} else if (volume < IRemoteControl.MIN_VOLUME) {
				this.volume = IRemoteControl.MIN_VOLUME;
			} else {
				this.volume = volume;
			}
			System.out.println("현재 TV 볼륨: " + this.volume);
		}

	

}
