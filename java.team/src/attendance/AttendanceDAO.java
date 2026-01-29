package attendance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AttendanceDAO {

	String dbDrv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/attendance_db?serverTimezone=Asia/Seoul";
	String dbUsr = "javaUser";
	String dbPwd = "1234";
	
	// 데이터베이스 관련 변수 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try {
	    if (rs != null) { rs.close(); }
	    if (pstmt != null) { pstmt.close(); }
	    if (conn != null) { conn.close(); }
		}catch (Exception e)  {
			e.printStackTrace();
		}
	}
	public int setUpdate(AttendanceDTO dto) {
		int result = 0;
		
		try {
			Class.forName(dbDrv); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			String sql = "update attendance set attendance_code = ? where student_id = ? AND attendance_date = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setLong(1, dto.getAttendance_code());
			pstmt.setInt(2, dto.getStudent_id());
			pstmt.setDate(3, dto.getAttendance_date());
			result = pstmt.executeUpdate(); // 0, 1
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	dbClose(rs, pstmt, conn);
	    }
		
		return result;
	}

	public int setDelete(AttendanceDTO dto) { // 삭제
		int result = 0;
		
		try {
			Class.forName(dbDrv); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   
			String sql = "delete from attendance where student_id = ? AND attendance_date";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getStudent_id());
			result = pstmt.executeUpdate(); // 0, 1
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	    } catch(Exception e) {
	    	e.printStackTrace();
	    } finally {
	    	dbClose(rs, pstmt, conn);
	    }
		
		return result;
	}
	
}
