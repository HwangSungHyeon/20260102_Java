package exam08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

// 회원 등록 프로그램
public class MemberInsert {

	public static void main(String[] args) {
		
		
//		int a =5;
//		int b = 0;
//		try {
//			double c = a / b;
//			System.out.println("c : "+c);
//		}catch(Exception e) {
//			e.printStackTrace();
//			System.out.println(b +"으로 나누어서 종료");
//		}finally {
//			System.out.println("에코.. 에러났네");
//		}
//		System.out.println("==프로그램 종료==");
				
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		
		System.out.print("비밀번호 : ");
		String password = sc.nextLine();
		
		System.out.print("이름 : ");
		String name = sc.nextLine();
		
		System.out.print("전화번호 : ");
		String phone = sc.nextLine();
		
		sc.close(); // 자바에서는 써도되고 안써도 된다.
		
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
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   껍데기는 같고 ㅡㅡ안에 있는 것들만 바꿔주면 등록, 수정, 삭제, 목록 다 가능하다.
			String sql = "";
			sql += "insert into member (no, id, password, name, phone, createdDate) values ";
			sql += "(null, ?, ?, ?, ?, now())"; // 객체 생성
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id); // 물음표에 들어갈 내용이다. 자바에서 index와 같은데 DB에서의 index는 1부터 시작한다.
			pstmt.setString(2, password);
			pstmt.setString(3, name);
			pstmt.setString(4, phone);
			int result = pstmt.executeUpdate(); // table 에 변화가 있는 insert , update , delete 는 executeUpdate를 쓴다.
			if (result > 0) { // 0이 나오면 실패, 1이 나오면 성공.
				System.out.println("등록성공.");
			}else {
				System.out.println("등록실패.");
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
