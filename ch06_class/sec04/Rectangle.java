package ch06_class.sec04;

public class Rectangle {
 //사각형의 가로길이와 세로길이를 입력 받아서 넓이를 구하여 출력하는 프로그램 작성
 private int recx;
 private int recy;
 private int area;
 public void setXY(int recx,int recy){
	 this.recx=recx;
	 this.recy=recy;
 }
 public void ShowsetXY() {
	 area=recx*recy;
	 System.out.println("가로길이: "+recx);
	 System.out.println("세로길이: "+recy);
	 System.out.println("넓이: "+area);
 }
	 
	 
			
 }

	

