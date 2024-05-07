package ch15_jdbc.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookInputInsertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			// insert 쿼리문 작성
			// 열의 값 자리에 '?' (placeholder)로 지정 - 바인딩 변수 
			String sql = "insert into book values(?, ?, ?, ?, ?, ?, ?)";
			
			// 쿼리문 전송을 위한 PreparedStatement 객체 생성 
			pstmt = con.prepareStatement(sql);
			
			System.out.print("도서번호 입력 : ");		
			String bookNo = sc.next();
			
			System.out.print("도서제목 입력 : ");	
			String bookName = sc.next();
			
			System.out.print("도서저자 입력 : ");	
			String bookAuthor = sc.next();
			
			System.out.print("도서가격 입력 : ");	
			int bookPrice = sc.nextInt();
			
			System.out.print("발행일 입력 : ");	
			String bookDate = sc.next();
			
			System.out.print("도서재고 입력 : ");	
			int bookStock = sc.nextInt();
			
			System.out.print("출판사번호 입력 : ");	
			String pubNo = sc.next();
			
			pstmt.setString(1, bookNo);
			pstmt.setString(2, bookName);
			pstmt.setString(3, bookAuthor);
			pstmt.setInt(4, bookPrice);
			pstmt.setString(5, bookDate); 
			pstmt.setInt(6, bookStock);
			pstmt.setString(7, pubNo);
			
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("도서 등록 성공!");
			}else {
				System.out.println("도서 등록 실패!");
			}
			
			// 리소스 반환
			pstmt.close();
			con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		sc.close();

	}

}
