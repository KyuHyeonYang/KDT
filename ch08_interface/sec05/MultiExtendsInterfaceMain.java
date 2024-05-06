package ch08_interface.sec05;

public class MultiExtendsInterfaceMain {

	public static void main(String[] args) {
		CImplClass c = new CImplClass();// 구현 클래스 객체 생성

		// InterfaceA 참조변수에 c객체 대입
		InterFaceA ia = c;
		ia.methodA();// InterFaceA의 메소드만 사용가능

		InterfaceB ib = c;//InterFaceB의 메소드만 사용가능
		ib.methodB();
		
		//다중상속 받은 메소드
		InterfaceC ic = c;//모든 메소드 사용가능 (A,B를 상속받았기 때문임)
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}

}
