package ch02_variable;

public class Ch02_03_Variable02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 두 변수의 값
		int x=10;
		int y=20;
		int temp =0;//이전 값을 보관하기 위한 임시 변수 사용 
		
		//교환 전 값 출력
		System.out.println("x:"+x+",y:"+y);
		//문자열과 변수값 함께 출력 (+ 사용해서 연결)
		
		// 두 변수의 값 교환
		temp =x; //x값을 temp에 저장 
		x=y; //y값을 x에 저장(이전 x의 값 사라짐,덮어씀)
		y=temp;// temp에 저장되어 있는 x의 값을 y에 저장
		
		//교환 값 출력
		System.out.println("x:"+x+",y:"+y);
	}

}
