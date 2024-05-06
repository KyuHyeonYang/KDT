package Ch04_control_stmt;

public class Ch04_38_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//교재 연습문제
				//(1)두 개의 주사위를 던졌을 때 눈의 합이 6이 되는 모든 경우의 수를 출력하는 프로그램을 작성하시오
				
		
		
		
				for(int i=1; i<=6;i++) {
			      for (int j=1;j<=6;j++) {
			    	  if (i+j==6) {
			    		  System.out.printf("(%d,%d)",i,j);
			    		  continue;
			    	  }
	}

}
}
}