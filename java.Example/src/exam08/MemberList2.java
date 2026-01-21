package exam08;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberList2 {

	public static void main(String[] args) {
		
		List<MemberDTO> list = new ArrayList<>();
		
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
			String sql = "select * from member order by no asc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // table에 변화가 없는 select 는 executeQuery를 쓴다. 
			while(rs.next()) {
				// 목록에서는 while 문 안에 레코드를 가져와 객체를 리스트에 집어 넣는 방식으로 사용한다.
				MemberDTO memberDTO = new MemberDTO();
				memberDTO.setNo(rs.getInt("no"));
				memberDTO.setId(rs.getString("id"));
				memberDTO.setPassword(rs.getString("password"));
				memberDTO.setName(rs.getString("name"));
				memberDTO.setPhone(rs.getString("phone"));
				memberDTO.setCreateDate(rs.getDate("createdDate"));
				
				list.add(memberDTO);
			}
			System.out.println("-------------------------------------");
			
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
		
		// [주소, 주소, 주소, 주소, 주소, 주소]
		
		for (int i = 0; i < list.size(); i++) {
			MemberDTO dto = list.get(i);
//			String id = dto.getId();
//			System.out.printf("%s \t %s \t %s \t %s \t %s\n", 
//					dto.getNo(), dto.getId(), dto.getName(), dto.getPhone(), dto.getCreateDate());
			System.out.println(i + ". "+ list.get(i)); // list.get(i) 은 주소만 가지고 오는것. list.get(i).?? 는 주소안에 정한 값을 가지고 오는것.
		}
		
		System.out.println("===프로그램 종료===");
	}

}
