package Ch05_array;

public class Ch05_03_ArrayEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int avg=0;
		int [] score;
		score=new int[3];
		score[0]=83;
		score[1]=95;
		score[2]=88;
		
		for(int i=0; i<score.length;i++) {
			sum=+score[i];
			System.out.println(sum);
		}
		
		
	}

}
