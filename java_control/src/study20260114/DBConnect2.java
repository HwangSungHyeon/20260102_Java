package study20260114;

import java.sql.*;

public class DBConnect2 {
	
	private Connection conn;
	private Statement st;
	private ResultSet rs;
	
	public DBConnect2() {
		connect();
	}
	
	private void connect() {
		// 데이터베이스 드라이버 실행 - 연결
		// 계정 로그인
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String username = "shsh";
			String password = "1234";
			String ur1 = "jdbc:mysql://localhost:3306/shsh";
			conn = DriverManager.getConnection(ur1, username, password);
			
			
		}catch(Exception e) {
			System.out.println("접속 실패");
		}
	}
	
	public Item[] type() {
		Item[] items = new Item[5];
		
		String sql = "select * from Item";
		
		try {
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			int i = 0;
			while(rs.next()) {
				Item temp = new Item(
				rs.getString("name"), rs.getInt("price"),
				rs.getString("main_image"), rs.getInt("stock")
						);
				
				items[i] = temp;
				i++;
			}
		}catch(Exception e) {
			System.out.println("질의 실패 및 객체생성 실패");
		}
		
		return items;
	}
	
}
