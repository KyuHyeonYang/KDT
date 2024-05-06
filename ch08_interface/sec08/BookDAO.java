package ch08_interface.sec08;

import java.util.ArrayList;

public class BookDAO implements IBookDAO {

	@Override
	public void insertBook(BookDTO dto) {
		System.out.println("도서번호:"+dto.getBookNo());
		System.out.println("도서명: "+dto.getBookName());
		System.out.println("저자: "+dto.getBookAuthor());
		System.out.println("가격: "+dto.getBookPrice());
		System.out.println("출판일: "+dto.getBookDate());
		System.out.println("출판사: "+dto.getBookpublisher());

	}

	@Override
	public ArrayList<BookDTO> getAllBook() {
	
		return null;
	}

	@Override
	public BookDTO detailBook(String bookNo) {
	
		return null;
	}

	@Override
	public void deleteBook(String bookNo) {
	

	}

	@Override
	public void updateBook(BookDTO dto) {
		

	}

	@Override
	public ArrayList<BookDTO> searchBook(String bookAuthor) {
		// TODO Auto-generated method stub
		return null;
	}

	
	

}
