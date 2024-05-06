package ch06_class.sec14;

public class Book {

 
		private int bookNo;		
		private	String bookName; 
		private String bookAuthor;  
		private int bookprice;
		
		public void setBookInfo() {		
			bookNo = 1001;
			bookName = "자바";
			bookAuthor = "홍길동";
			bookprice = 20000;
		}

		public Book(int bookNo, String bookName, String bookAuthor, int bookprice) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookprice = bookprice;
	}
		
			
			public void showBookInfo() {
				System.out.println("도서번호 : " + bookNo);
				System.out.println("도서명 : " + bookName);
				System.out.println("저자: " + bookAuthor);
				System.out.println("가격 : " +bookprice);
				
			
		
		}
}
