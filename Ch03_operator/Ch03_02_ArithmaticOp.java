package Ch03_operator;

import java.util.Scanner;

public class Ch03_02_ArithmaticOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner sc=new Scanner(System.in);
	
	System.out.print("정수 1 입력:");
	int x=sc.nextInt();
	System.out.print("정수 2 입력:");
	int y=sc.nextInt();    
	

    System.out.println((x+y));
    System.out.println((x-y));
    System.out.println((x*y));
    System.out.println((x/y));
    System.out.println((x%y));
    
    sc.close();
	}

}
