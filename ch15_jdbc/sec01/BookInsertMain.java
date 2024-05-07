package ch15_jdbc.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookInsertMain {

	public static void main(String[] args) {
		// DB 연결 
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		
		// 저장할 데이터 : 변수에 고정값 
		String bookNo = "1016";
		String bookName = "알고리즘";
		String bookAuthor = "김철수";
		int bookPrice = 25000;
		String bookDate = "2024-05-07"; 
		int bookStock = 10;
		String pubNo = "1";
		
		try {
			// insert 쿼리문 작성 
			// 열의 값 자리에 '?' (placeholder)로 지정 - 바인딩 변수 
			String sql = "insert into book values(?, ?, ?, ?, ?, ?, ?)";
			
			// 쿼리문 전송을  위한 PreparedStatement 객체 생성 
			pstmt = con.prepareStatement(sql);
			
			// 바인딩 변수 설정 
			// 바인딩 변수의 순서는 ?의 순서와 일치해야 함 
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookName);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate); // DB의 Date 타입을 setString()해도 됨
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);
			
			// 쿼리문 실행 (영향을 받은 행의 수 받아와서 결과 출력)
			// insert, update, delete문 : executeUpdate()
			// select : executeQuery()
			// insert문의 경우 결과 받아오지 않아도 됨 
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("도서 등록 성공!");
			} else {
				System.out.println("도서 등록 실패!");
			}
			
			// 리소스 반환 
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
