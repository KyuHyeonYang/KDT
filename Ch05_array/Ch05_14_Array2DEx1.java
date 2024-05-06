package Ch05_array;

public class Ch05_14_Array2DEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [][]num= {
				{5,9,3},
				{7,4,8},
				{9,5,7},
				{7,8,9,},
				{6,9,4},
		};
		
		System.out.println("각 행의 합 출력");
		System.out.println();
		
		
		for(int i=0; i<num.length;i++) {
			 
				int sum=0;
			for (int j=0;j<num[i].length;j++) {
					sum+=num[i][j];
					System.out.printf(num[i][j]+" ");
				}
			
			System.out.printf("%d"+"행의 합: "+sum);
		}
	}
	 
}
