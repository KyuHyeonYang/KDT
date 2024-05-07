package ch15_jdbc.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookDeleteMain {

	public static void main(String[] args) {
		// 도서 정보 삭제 
		// 특정 도서번호에 해당되는 도서 정보 delete 
		
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("도서 정보 삭제");
			System.out.print("삭제할 도서번호 입력 : ");		
			String bookNo = sc.nextLine();
			
			
			// 쿼리문 생성
			// 도서번호 찾아와서, 해당 도서 정보를 수정된 값으로 설정
			// 주의! : 기본키는 수정안 됨
			String sql = "delete from book where bookNo=?";

			// 쿼리문 전송을 위한 PreparedStatement 객체 생성 
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bookNo);			
			
			pstmt.executeUpdate();
			// System.out.println("도서 삭제 성공!");			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("도서 삭제 성공!");
			}else {
				System.out.println("도서 삭제 실패!");
			}
			
			
			// 리소스 반환
			pstmt.close();
			con.close();
			
		} catch (Exception e) {
			System.out.println("오류 발생");
			e.printStackTrace();
		}
		
		sc.close();

	}

}
