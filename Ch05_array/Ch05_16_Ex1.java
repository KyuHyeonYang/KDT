package Ch05_array;

import java.util.Random;

public class Ch05_16_Ex1 {

	public static void main(String[] args) {
		// 랜덤 숫자 10개 생성해서 배열에 저장하고, 각 숫자의 반복 횟수 출력 
	
	Random r=new Random();
	 int[]num;
	 num=new int[10];
	 int[]count=new int[10];
	 
	
	 
  for(int i=0; i<num.length; i++){
			num[i]=r.nextInt();
			count[num[i]]++;
			
			 System.out.printf( "%d",num[i]);
	 }
 for(int i=0; i<count.length; i++) {
	 System.out.printf("\n%d의 개수 : %d",i,count[i]);
 }

	
			

	
	}

}
