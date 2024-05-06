package ch10_exception.sec01;

public class ExceptionMain {

	public static void main(String[] args) {
		//(1)NullPointerException
		/*String name=null;
		System.err.println(name);
		System.out.println(name.toString());*/
		
		
		//(2)ArrayIndexOutOfBoundsException
	/*	int[]arr= {1,2,3};
		System.out.println(arr[5]);*/
		
		//(3)NumberFormatException
		String data1="100";
		String data2="a100";
		//문자열을 숫자형으로 타입 변환 :Integer.parseInt()
		int val1=Integer.parseInt(data1);//숫자 형태의 문자열만 변환 가능
		System.out.println(val1);//100
		int val2=Integer.parseInt(data2);//문자가 섞여있는 숫자는 변환이 불가능
		System.out.println(val2);//NumberFormatException
	}

}
