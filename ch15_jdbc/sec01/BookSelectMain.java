package ch15_jdbc.sec01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookSelectMain {

	public static void main(String[] args) {
		// DB 연결 
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		ResultSet rs= null;		
		
		try {
			// select 쿼리문 작성 
			String sql = "select * from book order by bookNo";
			 
			// 쿼리문 전송을 위한 PreparedStatement 객체 생성 
			// Connection 인터페이스의 prepareStatement() 메소드를 사용하여 객체 생성 
			pstmt = con.prepareStatement(sql);
			
			
			// 쿼리문 실행시키고 결과 받아옴 
			// select 구문이므로 executeQuery() 메소드 사용 
			// 반환되는 결과는 ResultSet 객체가 받음 
			rs = pstmt.executeQuery();
			
			// 제목 출력 
			System.out.println("----- 전체 도서 정보 조회 ------");
			System.out.println("도서번호 \t 도서명 \t\t\t\t 저자 \t\t  가격 \t\t 발행일  \t재고 \t출판사번호");
			
			
			// executeQuery() 실행 결과로 받아온 ResultSet rs에서 데이터 추출 
			// ResultSet의 next() 메소드를 이용해서
			// 논리적 커서를 이동해가면 각 행, 열의 데이터를 바인딩해 옴
			// next() : 커서를 이동하면 다음 행 지정 
			// 다음 행이 있으면 true, 없으면 false 반환 
			// 모든 행을 가져오려면 반복문 사용 
			// 데이터 타입에 맞춰 getXXX() 메소드 사용 
			while(rs.next()) {
				String bookNo = rs.getString(1);
				String bookName = rs.getString(2);
				String bookAuthor = rs.getString(3);
				int bookPrice = rs.getInt(4);
				Date bookDate = rs.getDate(5);
				int bookStock = rs.getInt(6);
				String pubNo = rs.getString(7);
				
				// 한 행씩 출력 
				System.out.format("%-10s\t %-20s\t %-10s %6d %13s \t%3d %10s\n", 
						bookNo, bookName, bookAuthor, bookPrice, bookDate, bookStock, pubNo);
			}
			
			// 리소스 반환(닫기)
			rs.close();
			pstmt.close();
			con.close();			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
