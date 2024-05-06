package Ch05_array;

public class Ch05_13_Array2D {

	public static void main(String[] args) {
		// 2차원 배열 예제
		int[][]scores= {{100,100,100},
				        {20,20,20},
				        {30,30,30},
				        {40,40,40},
				        {50,50,50}};
		
		//2차원배열의 각 원소의 값 출력
		/*for(int i=0;i<scores.length;i++) {
			for (int j=0; j<scores[i].length;j++) {
				System.out.printf("scores[%d][%d]=%d%n",i,j,scores[i][j]);
			
			
			
		
			System.out.println();
			*/
			//2차원 테이블 형태로 값만 출력
			for(int i=0; i<scores.length;i++) {
				for (int j=0;j<scores[i].length;j++) {
					System.out.println(scores[i][j]+"\t");
					
				}
			}
			
		}
				
		
		

	}


