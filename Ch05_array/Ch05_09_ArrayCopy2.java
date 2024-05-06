package Ch05_array;

public class Ch05_09_ArrayCopy2 {

	public static void main(String[] args) {
		// 
		int[]a= {1,2,3,4};
		int[]b=new int[4];
		//각 원소의 값을 하나씩 저장
		for(int i=0; i<a.length;i++) {
			b[i]=a[i];
		}
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
