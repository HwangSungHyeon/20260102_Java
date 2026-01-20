package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원 삭제 프로그램
public class MemberDelete {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("삭제할 아이디 : "); // 삭제할 아이디 입력받기.
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
			String sql = "delete from member where id = ?"; // 키보드로 입력받아야 하는 값이라 ? 로 쓴다.
			pstmt = conn.prepareStatement(sql); // 객체생성 
			pstmt.setString(1, id);
			int result = pstmt.executeUpdate(); // table 에 변화가 있는 insert , update , delete 는 executeUpdate를 쓴다.
			if (result > 0) { // 0이 나오면 실패, 1이 나오면 성공.
				System.out.println("삭제성공 - "+ result);
			}else {
				System.out.println("삭제실패 - "+ result);
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
