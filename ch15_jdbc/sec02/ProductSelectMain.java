package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductSelectMain {

    public static void main(String[] args) {

	DBConnect dbCon = new DBConnect();
	Connection con = dbCon.getConnection();
	PreparedStatement pstmt = null;
	ResultSet rs = null;

	try {
	    String sql = "select * from product";
	    pstmt = con.prepareStatement(sql);
	    rs = pstmt.executeQuery(sql);

	    while (rs.next()) {
		String prodNo = rs.getString(1);
		String prdName = rs.getString(2);
		int prdPrice = rs.getInt(3);
		String prdMaker = rs.getString(4);
		String prdColor = rs.getString(5);
		String ctgNo = rs.getString(6);

		System.out.format("%-6s %-20s\t %10d %13s\t %10s %13s\n", prodNo, prdName, prdPrice, prdMaker, prdColor,
			ctgNo);

	    }

	} catch (SQLException e) {
	    e.printStackTrace();
	}
    }

}
