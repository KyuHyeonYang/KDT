package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDetailMain {

    public static void main(String[] args) {

	DBConnect dbCon = new DBConnect();
	Connection con = dbCon.getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	Scanner sc = new Scanner(System.in);

	try {
	    System.out.println("상품 상세 정보 조회");
	    System.out.print("조회할 상품 번호 입력 : ");
	    String prdNo = sc.nextLine();

	    String sql = "select * from product where prdNo = ? ";

	    pstmt = con.prepareStatement(sql);
	    pstmt.setString(1, prdNo);
	    rs = pstmt.executeQuery();

	    rs.next();
		String prodNo = rs.getString(1);
		String prdName = rs.getString(2);
		int prdPrice = rs.getInt(3);
		String prdMaker = rs.getString(4);
		String prdColor = rs.getString(5);
		String ctgNo = rs.getString(6);

		System.out.format("%s\t %s\t %d\t %s\t %s\t %s\t", prodNo, prdName, prdPrice, prdMaker, prdColor,
			ctgNo);

	    pstmt.close();
	    con.close();

	} catch (SQLException e) {
	    System.out.println("오류 발생");
	    e.printStackTrace();
	}

	sc.close();

    }
}
