package ch11_api_class.sec02;

public class ReplaceMain {

	public static void main(String[] args) {
			//replce()
		String oldStr="자바는 객체지향 언어입니다. 풍부한 API를 제공합니다";
		String newStr=oldStr.replace("자바","Java");
		
		System.out.println(oldStr);
		System.out.println(newStr);

	}

}
