package ch07_inheritance.sec09;

public class ComputerMain {

	public static void main(String[] args) {
		int r=10;
		
		//재정의 하지 않은 areaCircle()메소드 호출해서 결과 확인
		Calculator cal=new Calculator();
		System.out.println("원의 넓이: "+cal.areaCircle(r));
		
		//정밀하게 재정의한 메소드 호출(자식 클래스에서 재정의함)
		Computer com=new Computer();
		System.out.println("원의 넓이: "+com.areaCircle(r));
		

	}

}
