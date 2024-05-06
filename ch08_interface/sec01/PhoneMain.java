package ch08_interface.sec01;

public class PhoneMain {

	public static void main(String[] args) {
		// 인터페이스 참조변수 =new 클래스()
		//인터페이스 참조 변수에 클래스 타입의 객체대입
		ISmartPhone isp=new SamsungPhone();
		isp.sendCall();
		
		ISmartPhone iip=new IPhone();
		iip.sendCall();
		
	}

}
