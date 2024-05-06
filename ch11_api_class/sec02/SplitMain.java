package ch11_api_class.sec02;

public class SplitMain {

	public static void main(String[] args) {
		//Split()
		String phone="010-1234-5678";//구분자가 1개인경우
		String[]nums=phone.split("-");
		
		for(String num:nums) {
			System.out.println(num);
		}
		//구분자가 여러개인경우
		String text="홍길동&이몽룡,성춘향,김자바-강길동";
		String[] names=text.split("&|,|-");
		for(String name:names) {
			System.out.println(name);
		}
	
	
	}
	
	

}
