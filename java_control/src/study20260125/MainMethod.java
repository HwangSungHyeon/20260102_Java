package study20260125;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List<WorkerDTO> workerList = new ArrayList<>();
		List<CompanyDTO> companyList = new ArrayList<>();
		
		while(true) {
			System.out.println("0: 직장인 정보 등록\n1: 회사 정보 등록\n2: 매칭\n3:회사조회\n4:정보수정\n5: 종료");
			String menu = sc.nextLine();
			if(menu.equals("0")) { // 직장인 정보 등록
				System.out.print("이름 : ");
				String name = sc.nextLine();
				System.out.print("소속 : ");
				String team = sc.nextLine();
				System.out.print("나이 : ");
				String age = sc.nextLine();
				System.out.print("연락처 : ");
				String phone = sc.nextLine();
				System.out.print("업무 : ");
				String work = sc.nextLine();
				System.out.print("희망지역 : ");
				String desiredArea = sc.nextLine();
				System.out.print("희망업무 : ");
				String desiredWork = sc.nextLine();
				
				WorkerDTO dto = new WorkerDTO(name, team, age, phone, work, desiredArea, desiredWork);
				workerList.add(dto);
				
			} else if(menu.equals("1")) { // 회사 정보 등록
				System.out.println("회사명 : ");
				String companyName = sc.nextLine();
				System.out.println("지역 : ");
				String area = sc.nextLine();
				System.out.println("채용 업무 : ");
				String recruitment = sc.nextLine();
				
				CompanyDTO dto = new CompanyDTO(companyName, area, recruitment);
				companyList.add(dto);
				
			} else if(menu.equals("2")) { // 매칭
				System.out.println("직장인 이름 입력 : ");
				String name = sc.nextLine();
				
				WorkerDTO worker = null;
				for(WorkerDTO w : workerList) {
					if(w.name.equals(name)) {
						worker = w;
					}
				}
				
				if(worker == null) {
					System.out.println("직장인을 찾지 못했습니다.");
				}
			} else if(menu.equals("3")) { // 회사조회
				System.out.println("회사명 입력 : ");
				String companyName = sc.nextLine();
				
				CompanyDTO company = null;
				for(CompanyDTO c : companyList) {
					if(c.recruitment.equals(companyName)) {
						company = c;
					}
				}
				
				if(company == null){
					System.out.println("회사 정보를 찾지 못했습니다.");
				} else {
					System.out.println("지역 : "+company.area);
					System.out.println("채용업무 : "+company.recruitment);
				}
				
			} else if(menu.equals("4")) { // 정보수정
				System.out.println("직장인 이름 입력 : ");
				String name = sc.nextLine();
				
				WorkerDTO worker = null;
				for(WorkerDTO w : workerList) {
					if(w.name.equals(name)) {
						worker = w;
					}
				}
				
				if(worker == null) {
					System.out.println("직장인을 찾지 못했습니다.");
				}
				
				System.out.print("소속 수정 : ");
				worker.team = sc.nextLine();
				System.out.print("나이 수정 : ");
				worker.age = sc.nextLine();
				System.out.print("연락처 수정 : ");
				worker.phone = sc.nextLine();
				System.out.print("업무 수정 : ");
				worker.work = sc.nextLine();
				System.out.print("희망지역 수정 : ");
				worker.desiredArea = sc.nextLine();
				System.out.print("희망업무 수정 : ");
				worker.desiredWork = sc.nextLine();
				
			} else if(menu.equals("5")) {
				System.out.println("종료");
				break;
			}
		}
	}

}
