package Ch04_control_stmt;

public class Ch04_12_RandomNum1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//랜덤 숫자 생성 :Math.random()
		/*double num =(int)Math.random()*10;*/
		int num=(int)( Math.random()*10);
		System.out.println(num);//0<num<1범위의 실수
		
		//(1)랜덤 숫자 생성:실수
		//(2)정수 부분 생성 :*10 하면 0.xx~9.xx(정수부분이 0~9)
		//(3)정수로 타입 변환 :(int):0~9사이의 정수
		//(4)범위 변경:1~10범위로 :베이스 값을 더하기 
	}

}
