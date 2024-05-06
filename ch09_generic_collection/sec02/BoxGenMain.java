package ch09_generic_collection.sec02;

public class BoxGenMain {

	public static void main(String[] args) {
		// 제네릭 사용:객체 생성 시 구체적 타입 지정
		Box<String> box1 = new Box<String>();
		box1.setT("hello");
		String string = box1.getT();// 강제 타입 변환 필요 없음
		System.out.println(string);

		Box<Integer> box2 = new Box<Integer>();
		box2.setT(7);
		int value = box2.getT();
		System.out.println(value);// 강제 타입 변환 필요 없음

	}

}
