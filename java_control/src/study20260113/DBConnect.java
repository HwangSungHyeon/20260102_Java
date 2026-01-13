package study20260113;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnect {
	
	private Connection conn; // 데이터베이스 연결 유지
	private Statement st;    // 데이터베이스 쿼리문 전달 및 결과 받기
	private ResultSet rs;    // 데이터베이스의 결과를 저장
	
	public DBConnect() {
		connect();
	}
	
	private void connect() {
		// 데이터베이스 접속
		// 오류가 날거같은 코드는 try 안에 넣어주고
		// 오류가 날때 catch가 잡아주는 역할을 한다.
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "shsh";
			String password = "1234";
			String ur1 = "jdbc:mysql://localhost:3306/shsh";
			
			conn = DriverManager.getConnection(ur1, username, password);
			
		}catch(Exception e) {
			System.out.println("접속 실패");
			e.printStackTrace(); // 오류의 원인
		}
	}
	
	// product 테이블의 데이터 가져오기
	public Product[] selectData() {
		
		Product[] products = new Product[6];
		// 쿼리문 작성하기
		String sql = "select * from product";
		
		// 쿼리문 보내기
		try {
			st = conn.createStatement();
		}catch(Exception e) {
			System.out.println( "쿼리문 실패" );
		}
		
		// 결과 받기
		
		
		// 데이터들을 product 객체에 저장하기
		
		return products;
	}
	
	
}
