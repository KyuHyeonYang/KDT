package Ch05_array;

public class Ch05_07_ArrayFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//향상된 for문
		int[]scores= {95,71,88,92,89};
		int sum=0;
		
		//for(타입변수:배열)
		for (int score:scores) {
			sum+=score;
		}
		System.out.println("총점: "+sum);
		
		//운동선수 3명 배열에 저장 하고 향상된 for문 사용하여 전체 선수 출력
		String[]players={"kim","kim","lee"};
		
		
		
		for(String player:players) {
			
		}
		System.out.println(players);
	}

}
