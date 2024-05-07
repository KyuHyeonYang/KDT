package ch15_jdbc.sec01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BookUpdateMain {

	public static void main(String[] args) {
		// 도서 정보 수정 
		// 특정 도서번호에 해당되는 도서 정보 update 
		
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
		PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("도서 정보 수정");
			System.out.print("수정할 도서번호 입력 : ");		
			String bookNo = sc.nextLine();
			
			System.out.print("도서명 입력 : ");	
			String bookName = sc.nextLine();
			
			System.out.print("도서저자 입력 : ");	
			String bookAuthor = sc.nextLine();
			
			System.out.print("도서가격 입력 : ");	
			int bookPrice = sc.nextInt(); // 가격(숫자) 입력하고 엔터 치면 
			// 숫자는 bookPrice에 들어가고 			
			// 엔터값은 다음 변수 bookDate으로 저장됨
			
			//앞의 엔터값이 다음 변수에 들어가지 않도록 읽어들여서 버림
			sc.nextLine();
			
			System.out.print("발행일 입력 : ");	
			String bookDate = sc.nextLine();
			
			System.out.print("도서재고 입력 : ");	
			int bookStock = sc.nextInt();
						
			// //앞의 엔터값이 다음 변수에 들어가지 않도록 읽어들여서 버림
			sc.nextLine();			
			
			System.out.print("출판사번호 입력 : ");	
			String pubNo = sc.nextLine();
			
			// 쿼리문 생성
			// 도서번호 찾아와서, 해당 도서 정보를 수정된 값으로 설정
			// 주의! : 기본키는 수정안 됨
			String sql = "update book set bookName=?, bookAuthor=?, bookPrice=?, "
					          + "bookDate=?, bookStock=?, pubNo=? where bookNo=?";

			// 쿼리문 전송을 위한 PreparedStatement 객체 생성 
			pstmt = con.prepareStatement(sql);
			
			// 순서 주의! : bookNo가 맨 마지막  
			pstmt.setString(1, bookName);
			pstmt.setString(2, bookAuthor);
			pstmt.setInt(3, bookPrice);
			pstmt.setString(4, bookDate); 
			pstmt.setInt(5, bookStock);
			pstmt.setString(6, pubNo);
			pstmt.setString(7, bookNo);			
			
			int result = pstmt.executeUpdate();
			
			if(result > 0) {
				System.out.println("도서 수정 성공!");
			}else {
				System.out.println("도서 수정 실패!");
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
