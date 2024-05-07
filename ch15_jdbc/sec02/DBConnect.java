package ch15_jdbc.sec02;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {

    public Connection getConnection() {

	Connection con = null;

	try {

	    Class.forName("com.mysql.cj.jdbc.Driver");

	    String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
	    String user = "root";
	    String pwd = "1234";

	    con = DriverManager.getConnection(url, user, pwd);

	    if (con != null) {
		System.out.println("DB 연결 성공 ");
	    } else {
		System.out.println("DB 연결 실패 ");
	    }

	} catch (Exception e) {
	    e.printStackTrace();

	}
	return con;
    }

}
