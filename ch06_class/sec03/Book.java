package ch06_class.sec03;

public class Book {
	int bookNo;		
	String bookName; 
	String bookAuthor;  
	int bookprice;
	public void setBookInfo() {		
		bookNo = 1001;
		bookName = "자바";
		bookAuthor = "홍길동";
		bookprice = 20000;
	}
		
	
	

		public void showBookInfo() {
			System.out.println("도서번호 : " + bookNo);
			System.out.println("도서명 : " + bookName);
			System.out.println("저자: " + bookAuthor);
			System.out.println("가격 : " +bookprice);
			
		
	
	}

}
