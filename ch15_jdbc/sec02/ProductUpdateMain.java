package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductUpdateMain {

    public static void main(String[] args) {

	DBConnect dbCon = new DBConnect();
	Connection con = dbCon.getConnection();
	PreparedStatement pstmt = null;

	Scanner sc = new Scanner(System.in);

	try {
	    System.out.println("제품 정보 수정 ");
	    System.out.print("수정할 제품번호 입력 : ");
	    String prodNo = sc.nextLine();

	    System.out.print("제품명 입력 : ");
	    String prdName = sc.nextLine();

	    System.out.print("가격 입력 : ");
	    int prdPrice = sc.nextInt();
	    sc.nextLine();

	    System.out.print("브랜드 입력 : ");
	    String prdMaker = sc.nextLine();

	    System.out.print("재고 입력 : ");
	    String prdColor = sc.nextLine();

	    System.out.print("카테고리 번호 입력 : ");
	    String ctgNo = sc.nextLine();

	    String sql = "update product set prdName=?, prdPrice=?, prdMaker=?, prdColor=?, ctgNo=? where prdNo=?";
	    pstmt = con.prepareStatement(sql);

	    pstmt.setString(1, prdName);
	    pstmt.setInt(2, prdPrice);
	    pstmt.setString(3, prdMaker);
	    pstmt.setString(4, prdColor);
	    pstmt.setString(5, ctgNo);
	    pstmt.setString(6, prodNo);

	    int result = pstmt.executeUpdate();

	    if (result > 0) {
		System.out.println("제품 수정 성공!");
	    } else {
		System.out.println("제품 수정 실패!");
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
