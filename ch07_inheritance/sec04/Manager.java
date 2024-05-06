package ch07_inheritance.sec04;

public class Manager  extends Employee{
	private String Position;

	
	//매개변수 4개있는 생성자
	//3개는 부모클래스에게 전달하고 ,1개는 자신이 사용(position)
	//자동생성입력:우클릭-src-Generate using Fields사용(private~ 까진 작성해야함)
	public Manager(String empNo, String empName, String empPart,String Position) {
		// 부모 클래스 생성자 호출하면서 필요한 개수 (3개)만큼 전달:super()
	super(empNo, empName, empPart);
	this.Position = Position;
	}


	@Override
	public String toString() {
		//부모 클래스의 toString()호출
		//super레퍼런스:부모클래스를 가리키는 레퍼런스
		
		return super.toString() + "\n직위: "  + Position ;
	}
	
}
