package attendance;

import java.sql.Date;
import java.util.Scanner;

public class AttendanceDTO {
	
	private int student_id; // 학생 아이디
	private int course_id;  // 강의 아이디
	private long attendance_code; // 출결
	private Date attendance_date; // 출결 날짜
	
	public AttendanceDTO() {
	}
	
	// method
	public void inputField(String type) {
		Scanner sc = new Scanner(System.in);
		
		try {
            if(type.equals("update") || type.equals("delete")) {
                System.out.print("학생 아이디 입력 : ");
                this.student_id = Integer.parseInt(sc.nextLine());

                System.out.print("출결 날짜 입력 (yyyy-MM-dd) : ");
                this.attendance_date = java.sql.Date.valueOf(sc.nextLine());
            }

            if(type.equals("update")) {
                System.out.print("수정할 출결 코드 입력 (1:출석, 1000000000:결석, 1000:지각, 100000:조퇴, 10000000:외출) : ");
                this.attendance_code = Long.parseLong(sc.nextLine());
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
	}
	
	private Date parseDate(String dateStr) {
		return Date.valueOf(dateStr);
    }

	private Date Date(String attendanceDate_) {
		return null;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public int getCourse_id() {
		return course_id;
	}

	public void setCourse_id(int course_id) {
		this.course_id = course_id;
	}

	public long getAttendance_code() {
		return attendance_code;
	}

	public void setAttendance_code(long attendance_code) {
		this.attendance_code = attendance_code;
	}

	public Date getAttendance_date() {
		return attendance_date;
	}

	public void setAttendance_date(Date attendance_date) {
		this.attendance_date = attendance_date;
	}


	

	
	
}
