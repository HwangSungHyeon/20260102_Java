package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원 수정 프로그램
public class MemberUpdate {

	public static void main(String[] args) {
				
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 아이디 : "); // 아이디를 바꾸는게 아니라 수정할 아이디 입력받기.
		String id = sc.nextLine();
		
		System.out.print("새로운 이름 : ");
		String name = sc.nextLine();
		
		System.out.print("새로운 전화번호 : ");
		String phone = sc.nextLine();
		
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
			String sql = "";
			sql += "update member set name = ?, phone = ? where id = ?"; // 키보드로 입력받아야 하는 값이라 ? 로 쓴다.
			pstmt = conn.prepareStatement(sql); // 객체생성
			pstmt.setString(1, name); // 물음표에 들어갈 내용이다. 자바에서 index와 같은데 DB에서의 index는 1부터 시작한다.
			pstmt.setString(2, phone);
			pstmt.setString(3, id);
			int result = pstmt.executeUpdate(); // table 에 변화가 있는 insert , update , delete 는 executeUpdate를 쓴다.
			if (result > 0) { // 0이 나오면 실패, 1이 나오면 성공.
				System.out.println("수정성공.");
			}else {
				System.out.println("수정실패.");
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
