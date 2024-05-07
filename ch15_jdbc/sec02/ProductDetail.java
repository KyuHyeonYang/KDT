package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ProductDetail {

    public static void main(String[] args) throws SQLException {

        DBConnect db = new DBConnect();
        Connection con = db.getConnection();

        Scanner sc = new Scanner(System.in);
        System.out.print("상품번호를 입력 해 주세요 : ");
        String result = sc.nextLine();

        PreparedStatement pstmt = null;
        ResultSet rs = null;

        String sql = "select * from product where prdNo = ?";

        pstmt = con.prepareStatement(sql);
        pstmt.setString(1, result);

        rs = pstmt.executeQuery();

        rs.next();
        String prdNo = rs.getString(1); // 열 순서 번호로 사용해도 되고
        String prdName = rs.getString(2);
        int prdPrice = rs.getInt("prdPrice"); // 열 이름으로 사용해도 됨
        String prdMaker = rs.getString("prdMaker");
        String prdColor = rs.getString("prdColor");
        String ctgNo = rs.getString("ctgNo");

        System.out.println(prdNo +" "+ prdName +" "+ prdPrice+" "+prdMaker +" "+prdColor+" "+ctgNo);


    }
}
