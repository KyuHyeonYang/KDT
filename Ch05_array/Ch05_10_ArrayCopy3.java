package Ch05_array;

public class Ch05_10_ArrayCopy3 {

	public static void main(String[] args) {
		// 깊은 복사 Object객체의 clone() 메소드 사용
		
		int[]a= {1,2,3,4,};
		int[]b=a.clone();
		
		//a변경 전 출력
				for(int i=0;i<a.length;i++) {
					System.out.print(a[i]+" ");
					
				}
				
				
				//b:변경전 출력
				for(int i=0;i<b.length;i++) {
					System.out.print(b[i]+" ");
				
				}
				System.out.println("-----");
				//a의 첫번째 값 변경
				a[0]=0;
				//변경 후 출력
				for(int i=0;i<a.length;i++) {
					System.out.println(a[i]+" ");
				}

	}

}
