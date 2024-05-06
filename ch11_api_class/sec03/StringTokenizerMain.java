package ch11_api_class.sec03;

import java.util.StringTokenizer;

public class StringTokenizerMain {

	public static void main(String[] args) {
		// StringTokenizer클래스

		String text="홍길동/이몽룡/성춘향";
		//방법 1:전체 토큰 수를 얻어서 for문으로 반복
		StringTokenizer st=new StringTokenizer(text,"/");
		int countToken=st.countTokens();
		for(int i=0;i<countToken;i++) {
			String token=st.nextToken();
			System.out.println(token);
		}
	
		//방법2:남아있는 토큰을 확인하고 다음 토큰을 가져옴
		st=new StringTokenizer(text,"/");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	
	
	}
	

}
