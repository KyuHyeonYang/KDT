package Ch03_operator;

public class Ch03_01_IncreasementOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//증감연산자
		//연산식에 증감 연산자만 있는경우
		//변수의 앞,뒤 위치 상관없음:결과 동일
		int x=10;
		++x;//X=X+1와 동일
			System.out.println(x);
			System.out.println();
		//위치주의!!
		//변수의 앞,뒤 위치에 따라 결과다름
		int a=1;
		int b=1;
		//b=++a;//변수 앞에 위치:먼저 1 증가 후 증가된 나중에 사용:결과값:b=2
		b=a++;//변수 뒤에 위치:먼저 a 값을 b에 저장한 다음에 a값 증가 결과값:b=1
		System.out.println(b);
		System.out.println(a);
		
		/* 연산식에서의 위치주의 !
		 * 증감연산자가 변수 뒤에 있으면 다른 연산자 먼저 처리한 후 증감 연산자 처리*/
		int k=1;
		int m=1;
		int result1 =++k + 10;//증가된 k에 10을 더함 (먼저증가) 결과:12
		System.out.println(result1);
		
		int result2 =m++ + 10;//증가전 m에 10을 더한 후 나중에 증가 결과 :11
		System.out.println(result2);
	
	}

}
