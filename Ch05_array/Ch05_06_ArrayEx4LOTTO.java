package Ch05_array;

public class Ch05_06_ArrayEx4LOTTO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//45개의 숫자를 중복없이 출력
		int []a= new int[45];
		
		for(int i=0; i<a.length;i++){
			a[i]=(i+1);
		
		}
			System.out.println();
		int temp=0;
		int j=0;
		
		
		for(int i=0;i<6;i++) {
			j=(int)(Math.random()*a.length);
			temp =a[i];
			a[i]=a[j];
			a[j]=temp;
		}
	
		
		for(int i=0;i<6;i++)
		System.out.printf("a[%d]=%d%n",i,a[i]);
	}
}
