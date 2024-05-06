package ch07_inheritance.sec01;

public class ParentChildMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			// 자식 클래스 객체 생성
			Child ob = new Child();
			
			ob.setChild();
			ob.setParent(); // 부모 클래스 메소드 호출
			ob.showChild();
		

	}

}
