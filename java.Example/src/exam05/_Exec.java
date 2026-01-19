package exam05;

import java.time.LocalDate;
import java.util.Scanner;

public class _Exec {

	public static void main(String[] args) {
		
		// 이름, 주민번호
/*
    001204-3234567
    이름
    주민번호
    나이
    성별
*/
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scanner.nextLine();
		
		System.out.print("주민번호 : ");
		String ssn = scanner.nextLine();
		
		String imsi = ssn.substring(7, 8);  // 한자리만 뽑으려면 원하는 인덱스 위치와 다음 위치를 넣어준다.
		
		String gender;
		if(imsi.equals("1") || imsi.equals("3")) {
			gender = "남자";
		}else {
			gender = "여자";
		}
		
		String temp = ssn.substring(0,2);
		
		int birthYear;
		if(imsi.equals("1") || imsi.equals("2")) {
			birthYear = 1900 + Integer.parseInt(temp);
		}else {
			birthYear = 2000 + Integer.parseInt(temp);
		}
		
		// 현재 날짜 정보 가져오기
		int year = LocalDate.now().getYear();
		int age = year - birthYear;
		
		System.out.printf("이름 : %s\n", name);
		System.out.printf("주민번호 : %s\n", ssn);
		System.out.printf("나이 : %s\n", age);
		System.out.printf("성별 : %s\n", gender);
	}

}
