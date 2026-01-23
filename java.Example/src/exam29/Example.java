package exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		/*
		  회원관리 : 목록, 상세보기, 등록, 수정, 삭제
		  아이디
		  비밀번호
		  이름
		  연락처
		  주소 : 대전, 서울, 충남
		*/
		List<MemberDTO> memberList = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("선택(0:프로그램 종료, 1:목록, 2:상세보기, 3:등록, 4:수정, 5:삭제):");
			String member = sc.nextLine();
			if(member.equals("0")) {
				break;
			} else if(member.equals("1")) {
				for(int i = 0; i < memberList.size(); i++) {
					memberList.get(i).display();
				}
			} else if(member.equals("2")) {
				System.out.println("상세보기");
			} else if(member.equals("3")) { // 등록
				System.out.print("아이디 : ");
				String id = sc.nextLine();
				System.out.print("비밀번호 : ");
				String password = sc.nextLine();
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("연락처 : ");
				String phone = sc.nextLine();
				System.out.print("주소 : ");
				String address = sc.nextLine();
				
				MemberDTO dto = new MemberDTO(id, password, name, phone, address);
				memberList.add(dto);
				
			} else if(member.equals("4")) { // 수정
				System.out.println("수정");
			} else if(member.equals("5")) {
				System.out.println("삭제");
			}
		}
		System.out.println("프로그램 종료");
	}

}
