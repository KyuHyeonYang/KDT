package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductInputInsertMain {

    public static void main(String[] args) {

	DBConnect dbCon = new DBConnect();
	Connection con = dbCon.getConnection();
	PreparedStatement pstmt = null;

	Scanner sc = new Scanner(System.in);

	try {

	    System.out.print("제품번호 입력 : ");
	    String prodNo = sc.nextLine();

	    System.out.print("제품이름 입력 : ");
	    String prdName = sc.nextLine();

	    System.out.print("가격 입력 : ");
	    int prdPrice = sc.nextInt();
	    sc.nextLine();

	    System.out.print("제조사 입력 : ");
	    String prdMaker = sc.nextLine();

	    System.out.print("제품 색상 입력 : ");
	    String prdColor = sc.nextLine();

	    System.out.print("카테고리 번호 입력 : ");
	    String ctgNo = sc.nextLine();

	    String sql = "insert into product values(?, ?, ?, ?, ?, ?)";
	    pstmt = con.prepareStatement(sql);

	    pstmt.setString(1, prodNo);
	    pstmt.setString(2, prdName);
	    pstmt.setInt(3, prdPrice);
	    pstmt.setString(4, prdMaker);
	    pstmt.setString(5, prdColor);
	    pstmt.setString(6, ctgNo);

	    int result = pstmt.executeUpdate();
	    System.out.println(result);

	    if (result > 0) {
		System.out.println("제품 등록 성공!");
	    } else {
		System.out.println("제품 등록 실패!");
	    }

	    // 리소스 반환
	    pstmt.close();
	    con.close();

	} catch (SQLException e) {
	    e.printStackTrace();
	}
	sc.close();

    }

}
