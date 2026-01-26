package exam30;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("선택(1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제):");
			String menu = sc.nextLine();
			StudentDAO dao = new StudentDAO();
			StudentDTO dto = new StudentDTO();
			int result = 0;
			
			switch(menu) {
			case "1":
				List<StudentDTO> list = dao.getSelectAll();
				System.out.println("학번\t이름\t주민번호\t연락처\t주소\t등록일");
				System.out.println("--------------------------------------------");
				for(int i = 0; i < list.size(); i++) {
					list.get(i).display();
				}
				break;
			case "2":
				dto.inputField("view");
				StudentDTO resultDTO = dao.getSelectOne(dto);
				resultDTO.display();
				break;
			case "3":
				dto.inputField("chuga");
				result = dao.setInsert(dto);
				System.out.println("result : "+ result);
				
//				String name = "이성순";
//				String ssn = "123456-1234567";
//				String phone = "010-1111-1111";
//				String address = "서울";
				
				// 낱개로 보내주는 방법
//				int result = dao.setInsert(name, ssn, phone, address);
				
				// 배열로 보내주는 방법
//				String[] strs = {name, ssn, phone, address};
//				int result = dao.setInsert(strs);
				
				// Map으로 보내주는 방법
//				Map<String, String> map = new HashMap<>();
//				map.put("name", name);
//				map.put("ssn", ssn);
//				map.put("phone", phone);
//				map.put("address", address);
//				int result = dao.setInsert(map);
				
				break;
			case "4":
				dto.inputField("sujung");
				result = dao.setUpdate(dto);
				System.out.println("result : "+result);
				break;
			case "5":
				dto.inputField("sakje");
				result = dao.setDelete(dto);
				System.out.println("result : "+result);
				break;
			default:
				System.out.println("-프로그램 종료-");
				return;
			}
		}
	}

}
/*
	 학사관리 = 학생관리, 출결관리, 성적관리, 생활기록관리
	 1. 학사관리
	 테이블명 : student
	 학번 hakbun int not null auto_increment,
	 이름 name varchar(50) not null,
	 주민번호 ssn varchar(15) not null,
     전화번호 phone varchar(15) not null,
	 주소 address varchar(250) not null,
	 등록일 createdDate datetime DEFAULT CURRENT_TIMESTAMP
     
 * 기본키(PK) 관련
       후보키
       기본키
       대체키
       수퍼키
       
 */
