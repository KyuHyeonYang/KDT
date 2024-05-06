package Ch04_control_stmt;

public class Ch04_22_For3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i=0, sum=0;
        
        for(;;) {
        	i++;
        	sum+=i;
        	//for 문 종료조건
        	if(sum>10)
        		break;
        	
        }
	System.out.println(i+", "+sum);
	}
	

}
