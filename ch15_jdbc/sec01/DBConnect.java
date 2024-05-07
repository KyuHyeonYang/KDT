package ch15_jdbc.sec01;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	// 데이터베이스 연결 후 
	// Connection 객체를 반환하는 메소드 
	public Connection getConnection() {
		
		Connection con = null;		
		
		try {
			// JDBC Driver 클래스의 객체 생성 : 런타임시 로드 (자동 로드 : 생략 가능)
			//Class.forName("com.mysql.cj.jdbc.Driver");
			
			// DB 연결을 위한 연결 주소, 사용자 계정, 비밀번호 문자열 생성 
			String url = "jdbc:mysql://localhost:3306/sqldb3?serverTimezone=UTC";
			String user = "root";
			String pwd = "1234";
			
			// DB 연결하기 위한 객체 생성 
			// DriverManager 클래스를 통해 Connection 객체 받아옴 
			// MySQL 서버 연결 : 주소, 사용자계정, 비밀번호 전송 
			con = DriverManager.getConnection(url, user, pwd);
			
			// Connection 객체가 생성되면(null이 아니면) DB 연결 성공 
			if(con != null) {
				System.out.println("DB 연결 성공!");
			} else {
				System.out.println("DB 연결 실패!");
			}			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con; // DB에 접속된 객체 반환 		
	}
}
