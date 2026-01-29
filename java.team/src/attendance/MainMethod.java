package attendance;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("선택(1.출결 등록, 2.출결 수정, 3.출결 삭제, 0. 프로그램 종료)");
			String menu = sc.nextLine();
			AttendanceDTO dto = new AttendanceDTO();
			AttendanceDAO dao = new AttendanceDAO();
			
			int result = 0;
			
			switch(menu) {
			case "1" :
				System.out.println("출결 등록");
				break;
			case "2" :
				dto.inputField("update");
				result = dao.setUpdate(dto);
				System.out.println("result : "+result);
				break;
			case "3" :
				dto.inputField("delete");
				result = dao.setDelete(dto);
				System.out.println("result : "+result);

			case "0" :
				System.out.println("프로그램 종료");
				return;
			}
		}
	}

}
