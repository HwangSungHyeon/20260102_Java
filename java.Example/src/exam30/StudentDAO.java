package exam30;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class StudentDAO {
	String dbDrv = "com.mysql.cj.jdbc.Driver";
	String dbUrl = "jdbc:mysql://localhost:3306/javaExample?serverTimezone=Asia/Seoul";
	String dbUsr = "javaUser";
	String dbPwd = "1234";
	
	// 데이터베이스 관련 변수 선언
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	private void dbClose(ResultSet rs, PreparedStatement pstmt, Connection conn) {
		try { // 열린거 다 닫는작업
	    if (rs != null) { rs.close(); }
	    if (pstmt != null) { pstmt.close(); }
	    if (conn != null) { conn.close(); }
		}catch (Exception e)  {
			e.printStackTrace();
		}
	}
	
	public List<StudentDTO> getSelectAll() { // 목록(전체이기 때문에 List 사용)
		List<StudentDTO> list = new ArrayList<>();
	
		// 예외처리
		try {
			Class.forName(dbDrv); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속 ( "서버주소","사용자","패스워드" )
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   껍데기는 같고 ㅡㅡ안에 있는 것들만 바꿔주면 등록, 수정, 삭제, 목록 다 가능하다.
			String sql = "select * from student order by hakbun desc";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery(); // DB에 있는 모든 내용이 여기에 들어가있다.
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getString("createdDate"));
				list.add(dto);
			}
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	    } catch(Exception e) {
		    System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
	    } finally {
	    	dbClose(rs, pstmt, conn);
	    }
	    return list;
    }
	
	public StudentDTO getSelectOne(StudentDTO paramDTO) { // 상세보기(한사람이기 때문에 StudentDTO dto = new StudentDTO(); 를 사용)
		StudentDTO dto = new StudentDTO();
		
		try {
			Class.forName(dbDrv); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속 ( "서버주소","사용자","패스워드" )
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   껍데기는 같고 ㅡㅡ안에 있는 것들만 바꿔주면 등록, 수정, 삭제, 목록 다 가능하다.
			String sql = "select * from student where hakbun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, paramDTO.getHakbun());
			rs = pstmt.executeQuery(); // DB에 있는 모든 내용이 여기에 들어가있다.
			if (rs.next()) {
				dto.setHakbun(rs.getInt("hakbun"));
				dto.setName(rs.getString("name"));
				dto.setSsn(rs.getString("ssn"));
				dto.setAddress(rs.getString("address"));
				dto.setCreatedDate(rs.getString("createdDate"));
			}
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	    } catch(Exception e) {
		    System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
	    } finally {
	    	dbClose(rs, pstmt, conn);
	    }
		return dto;
	}
	
	public int setInsert(StudentDTO dto) { // 추가
		int result = 0;
		
		try {
			Class.forName(dbDrv);
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd);
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
			String sql = "";
			sql += "insert into student (hakbun, name, ssn, phone, address, createdDate) values ";
			sql += "(null,?,?,?,?, now())";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getSsn());
			pstmt.setString(3, dto.getPhone());
			pstmt.setString(4, dto.getAddress());
			result = pstmt.executeUpdate(); // 0,1
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 또는 접속 실패/..");	
		} finally {
			dbClose(rs, pstmt, conn);
		}
		
		return result;
		
	}
	
	public int setUpdate(StudentDTO dto) {
		int result = 0;
		
		try {
			Class.forName(dbDrv); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속 ( "서버주소","사용자","패스워드" )
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   껍데기는 같고 ㅡㅡ안에 있는 것들만 바꿔주면 등록, 수정, 삭제, 목록 다 가능하다.
			String sql = "update student set phone = ?, address = ? where hakbun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getPhone());
			pstmt.setString(2, dto.getAddress());
			pstmt.setInt(3, dto.getHakbun());
			result = pstmt.executeUpdate(); // 0, 1
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	    } catch(Exception e) {
		    System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
	    } finally {
	    	dbClose(rs, pstmt, conn);
	    }
		
		return result;
	}

	public int setDelete(StudentDTO dto) { // 삭제
		int result = 0;
		
		try {
			Class.forName(dbDrv); // mysql Driver 로딩
			conn = DriverManager.getConnection(dbUrl, dbUsr, dbPwd); // 드라이버 접속 ( "서버주소","사용자","패스워드" )
			//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ   껍데기는 같고 ㅡㅡ안에 있는 것들만 바꿔주면 등록, 수정, 삭제, 목록 다 가능하다.
			String sql = "delete from student where hakbun = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, dto.getHakbun());
			result = pstmt.executeUpdate(); // 0, 1
		//ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
	    } catch(Exception e) {
		    System.out.println("드라이버 로딩 실패 또는 데이터베이스 접속 실패..");
	    } finally {
	    	dbClose(rs, pstmt, conn);
	    }
		
		return result;
	}
}
	
	// 낱개로 받는 방법
//	public int setInsert(String name, String ssn, String phone, String address) {
//	   System.out.println("-- setInsert() --");
//	   System.out.println("name : "+ name);
//	   System.out.println("ssn : "+ ssn);
//	   System.out.println("phone : "+ phone);
//	   System.out.println("address : "+ address);
	
	// 배열로 받는 방법
//	public int setInsert(String[] array) {
//	   System.out.println("-- setInsert() --");
//	   System.out.println("name : array[0]);
//	   System.out.println("ssn : "+ array[1]);
//	   System.out.println("phone : "+ array[2]);
//	   System.out.println("address : "+ array[3]);
	
	// Map으로 받는 방법
//	public int setInsert(Map<String, String> map) {
//		System.out.println("-- setInsert() --");
//		System.out.println("name : "+ map.get("name"));
//		System.out.println("ssn : "+ map.get("ssn"));
//		System.out.println("phone : "+ map.get("phone"));
//		System.out.println("address : "+ map.get("address"));
//		
//		return 0;
//	}

