package ch09_generic_collection.sec01;

public class NonGenMain {

	public static void main(String[] args) {
//제네릭을 사용하지 않은 경우:강제 타입 변환 발생(성능 저하 발생 가능)
		Box box=new Box();
		box.set("홍길동");//자동 타입 변환이 발생:String->Object 로
		
		String name=(String)box.get();//강제 타입 변환 발생:Object->String  으로
		System.err.println(name);
		
		
		Box box2=new Box();
		box2.set(7);//자동 타입 변환 :int->Integer 로 자동 박싱 ->Object로 타입 변환
		int no=(int)box2.get();//강제 타입변환 Object->Integer ->자동 언박싱 int로(객체->기본 타입으로 )
		System.err.println(no);
	}

}
