package Ch03_operator;

public class Ch03_06_CompareOp01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//비교연산자
		int n1=10;
		int n2=10;
		boolean result1 =(n1==n2);
		System.out.println(result1);//true
		boolean result2=(n1 !=n2);//!= :같지않다
		System.out.println(result2);//false
	
		char ch1='A';//65
		char ch2='B';//66
		boolean result3 =(ch1<ch2);
		System.out.println(result3);//true
		
		//'A'문자의 아스키 코드값 확인
		System.out.println((int)ch1);//65
	}

}
