package Ch04_control_stmt;

import java.util.Scanner;

public class Ch04_06_NestedIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=0;
		int qty=0;
	    int discount=0;
	    int laptop=1200000;
	    int camera=400000;
	  
		Scanner sc=new Scanner(System.in);
		
	    System.out.println("****상품정보***");
	    System.out.println("1.노트북:1,200,000원");
	    System.out.println("2.디지털카메라:400,000원");
	   
	    System.out.println("****상품번호입력");
		num=sc.nextInt();
		if(num>=3 ) {
			System.out.println("잘못 입력하였습니다.종료합니다.");
		}
		
		
		 System.out.println("****상품정보***");
		 System.out.println("1.노트북:1,200,000원");
		 System.out.println("2.디지털카메라:400,000원");
		 System.out.println("***********************");
		 System.out.print("****상품번호입력: ");
		 num=sc.nextInt();
		  if(num==1) {
			 System.out.println("상품명:노트북");
		 
		 System.out.print("****주문 수량 입력 : ");
		 qty=sc.nextInt();
		 System.out.println("****주문 내용********");}
	 if(num==1) {
			 System.out.println("상품명:노트북");
			 System.out.println("가격: "+laptop+"원");
			 System.out.println("주문수량: "+qty);
			 System.out.println("주문액: "+qty*laptop+"원");
			 System.out.println("할인액: "+qty*laptop*0.1+"원");
			 System.out.println("총지불액: "+qty*laptop*0.9+"원");
		
		
			 
		 
	 	}
	 else if(num==2) {
		 System.out.println("상품명:카메라");
	 
	 System.out.print("****주문 수량 입력 : ");
	 qty=sc.nextInt();
	 System.out.println("****주문 내용********");}
	 if(num==2) {
			 System.out.println("상품명: 디지털카메라");
			 System.out.println("가격: "+camera+"원");
			 System.out.println("주문수량: "+qty);
			 System.out.println("주문액: "+qty*camera+"원");
		 }
	   if(qty*camera>1000000) {
				 System.out.print("할인액: "+qty*camera*0.1+"원");
				 System.out.print("총지불액: "+qty*camera*0.9+"원");
		 }
	 else if(qty*camera>=500000) { 
			 System.out.println("할인액: "+qty*camera*0.05+"원");
				 System.out.println("총지불액: "+qty*camera*0.95+"원");
}
	 	 else if(qty*camera<499999) {
	 		 System.out.println("할인액 :0원");
	 		System.out.println("총지불액: "+qty*camera+"원");
	 	 }
	
	
	
	}

	}
	
	
	


