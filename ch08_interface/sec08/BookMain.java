package ch08_interface.sec08;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class BookMain {

	public static void main(String[] args) {
 BookDTO dto=new BookDTO("1001", "자바", "홍길동", "10000원", "24.01.01", "멀티캠퍼스");
 
 BookDAO dao=new BookDAO();
 dao.insertBook(dto);

	}
//String->Date 변환:SimpleDateFormat사용
/*	SimpleDateFormat fm=new SimpleDateFormat("yyyy-MM-dd");//형식지젖ㅇ
	Date date=fm.parse("2024-04-24");
	
	BookDTO dto=new BookDTO("1234567a", "어린왕자", "아무개",date,"동아출판");
	
	dao.insertBook(dto);*/  //->DATE타입 사용시
}
