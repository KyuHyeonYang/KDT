package Ch05_array;

public class Ch05_01_Array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열선언
		int[]a=new int[3];//기본값으로 자동 초기화됨(정수:0)
		
		//배열에 값 저장하기 전에 초기화된 값 확인
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		//배열의 각 원소에 값 직접 저장
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		//배열의 각 원소의 값 출력:앞으로는 이렇게 하나씩 출력 안 함!=>for문 사용
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//배열의 전체 원소의 값 출력시 for문 사용
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		
		}
		//////////////////////////////////////////
		//배열 선언:참조 변수만 선언하고 나중에 메모리할당
		int[]b;//선언만 된 상태
		b=new int[5];///기본값 0으로 초기화됨
		
		//배열에 값 저장하기 전에 초기화된 값 확인 :기본값 0으로 초기화됨
		for(int i=0;i<b.length;i++) {
			System.out.println(b[i]);
		}

		//b에 1 2 3 4 5 저장
		for(int i=0; i<b.length;i++) {
			b[i]=i+1;
		}
			for(int i=0;i<b.length;i++) {
				System.out.println(b[i]);
			}
		//배열 이름 출력
			System.out.println(a);//[I@372f7a8d  :사용 잘 안함
			
		

	
	
	
	}

}
