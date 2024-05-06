package Ch05_array;

public class Ch05_08_ArrayCopy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열의 복사
		//얕은 복사:주소만 복사(같은 주소(같은 객체))
		//배열 이름만 다르고 같은 위치의 값 참조
		//원본(복사본)한 쪽을 변경하면 다른 값도 변경됨
		int[]a= {1,2,3,4,};
		int[]b=a;//주소만 복사
		
		
		//변경 전 출력
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		
		//b:변경전 출력
		for(int i=0;i<b.length;i++) {
			System.out.print(b[i]+" ");
		
		}
		
		//a의 첫번째 값 변경
		a[0]=0;
		//변경 후 출력
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]+" ");
		}
	}

}
