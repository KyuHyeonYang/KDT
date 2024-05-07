package ch15_jdbc.sec01;

import java.sql.Connection;

public class DBConnectionMain {

	public static void main(String[] args) {
		// DB 연결 확인 
		DBConnect dbCon = new DBConnect();
		Connection con = dbCon.getConnection();
	}

}
