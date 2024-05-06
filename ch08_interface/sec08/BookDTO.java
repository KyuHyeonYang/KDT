package ch08_interface.sec08;

public class BookDTO {
/*bookNo(기본키), bookName, bookAuthor, 
 * bookPrice, bookDate(Date / String), bookPublisher 
생성자 : 초기화
Getter / Setter
*/
	private String bookNo ;
	private String bookName;
	private String bookAuthor;
	private String bookPrice;
	private String bookDate;
	private String bookpublisher;
	public BookDTO(String bookNo, String bookName, String bookAuthor, String bookPrice, String bookDate,
			String bookpublisher) {
		super();
		this.bookNo = bookNo;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.bookDate = bookDate;
		this.bookpublisher = bookpublisher;
	}
	public String getBookNo() {
		return bookNo;
	}
	public void setBookNo(String bookNo) {
		this.bookNo = bookNo;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String getBookAuthor() {
		return bookAuthor;
	}
	public void setBookAuthor(String bookAuthor) {
		this.bookAuthor = bookAuthor;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(String bookPrice) {
		this.bookPrice = bookPrice;
	}
	public String getBookDate() {
		return bookDate;
	}
	public void setBookDate(String bookDate) {
		this.bookDate = bookDate;
	}
	public String getBookpublisher() {
		return bookpublisher;
	}
	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}
	
	
	
}
