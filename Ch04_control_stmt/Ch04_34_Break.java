package Ch04_control_stmt;

public class Ch04_34_Break {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break문
		
		int i=0;
		
		while(true) {
			i+=3;
			if(i>20)break;
			
			System.out.println(i);
		}
	}

}
