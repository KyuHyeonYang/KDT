package ch08_interface.sec08;

import java.util.ArrayList;

public interface IBookDAO {
/*추상 메소드 선언
도서 등록 
전체 도서 정보 조회
상세 도서 조회 (1개 도서 조회)
도서 정보 삭제
도서 정보 수정
도서 검색 (‘저자’로 검색) : 여러 도서 반환 
*/
	public void insertBook(BookDTO dto);
	public ArrayList<BookDTO>getAllBook();
	public BookDTO detailBook(String bookNo);
	public void deleteBook(String bookNo);
	public void updateBook(BookDTO dto);
	public ArrayList<BookDTO >searchBook(String bookAuthor);


//Date타입을 String 타입으로 변환:SimpleDateFormat사용
	//(1)날짜 타입으로 포맷설정
	//(2)객체.for
}
