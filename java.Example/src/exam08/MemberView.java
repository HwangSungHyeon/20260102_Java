package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원 상세보기 프로그램
public class MemberView {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("상세보기할 아이디 : ");
		String id = sc.nextLine();
		sc.close();
		
		String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
		String dbUsr = "javaUser";
		String dbPwd = "1234";
		
		// 데이터베이스 관련 변수 선언
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
				
		// 예외처리
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속 ( "서버주소","사용자","패스워드" )
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			String sql = "select * from member where id = ?"; // 키보드로 입력받아야 하는 값이라 ? 로 쓴다.
			pstmt = conn.prepareStatement(sql); // 객체생성 
			pstmt.setString(1, id);
			rs = pstmt.executeQuery(); // table에 변화가 없는 select 는 executeQuery를 쓴다.
			if(rs.next()) {
				int no = rs.getInt("no");
				// String id = rs.getString("id"); // id 를 입력받기 때문에 굳이 또 해줄필요없다.
				String password = rs.getString("password");
				String name = rs.getString("name");
				String phone = rs.getString("phone");
				Date createdDate = rs.getDate("createdDate"); // DB 작업이기 때문에 sql로 import 해준다.
				System.out.printf("%s \t %s \t %s \t %s \t %s\n", no, id, name, phone, createdDate);
			} else {
				System.out.println("등록된 회원이 없습니다.");
			}
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		} catch(Exception e) {
			System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
		} finally {
			try { // 열린거 다 닫는작업
				if (rs != null) { rs.close(); }
				if (pstmt != null) { pstmt.close(); }
				if (conn != null) { conn.close(); }
				}catch (Exception e) {
					e.printStackTrace();
			}
		}
		System.out.println("===프로그램 종료===");
		
	}

}
