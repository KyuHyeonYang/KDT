package ch08_interface.sec05;

public class CImplClass implements InterfaceC {
	//상위,하위 모든 인터페이스의 모든 추상메소드 구현 필수
	@Override
	public void methodB() {
		System.out.println("ClmplClass 의  methodA()실행");
		
	}

	@Override
	public void methodA() {
		System.out.println("ClmplClass 의  methodB()실행");
		
	}

	@Override
	public void methodC() {
		System.out.println("ClmplClass 의  methodC()실행");
		
	}

	
	

}
