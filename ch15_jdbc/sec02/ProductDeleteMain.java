package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class ProductDeleteMain {

    public static void main(String[] args) {

	DBConnect dbCon = new DBConnect();
	Connection con = dbCon.getConnection();
	PreparedStatement pstmt = null;

	Scanner sc = new Scanner(System.in);

	try {
	    System.out.println("제품 정보 삭제");
	    System.out.print("삭제할 제품번호 입력 : ");
	    String prdNo = sc.nextLine();

	    String sql = "delete from product where prdNo=?";

	    pstmt = con.prepareStatement(sql);
	    pstmt.setString(1, prdNo);

	    // 삭제되었으나 실패 출력
	    //pstmt.executeUpdate();
	    int result = pstmt.executeUpdate();
	    System.out.println(result);

	    if (result > 0) {
	    	System.out.println("삭제 성공!");
	    } else {
	    	System.out.println("삭제 실패!");
	    }

	    pstmt.close();
	    con.close();

	} catch (Exception e) {
	    System.out.println("오류 발생");
	    e.printStackTrace();
	}

	sc.close();
    }
}
