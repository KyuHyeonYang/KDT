package ch11_api_class.sec04;

import java.util.regex.Pattern;

public class PatternMain {

	public static void main(String[] args) {
		//정규식과 Pattern
		String regExp="(02|010)-\\d{3,4}-\\d{4}";//전화번호 형식지정
		//02 또는 010(그룹)
		//숫자 3~4개
		//숫자 4개
		String date="010-123-4567";
		boolean result =Pattern.matches(regExp,date);
		
		if(result) {
			System.out.println("전화번호 형식임");
			
		}else {
			System.out.println("전화번호 형식아님");
		}
		String regEx2="\\w+@\\w+\\.\\w+(\\.\\w+)?";
		//문자 1개 이상
		//@
		//문자1개이상
		//.
		//문자 1개이상
		//(.문자1개이상)전체가 0번 또는 1번
	}

}
