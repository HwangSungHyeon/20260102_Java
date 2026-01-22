package exam28;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):1
		// -> -목록-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):2
		// -> -등록-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):3
		// -> -수정-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):4
		// -> -삭제-
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):0
		// -> ==프로그램 종료==
		// 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제):5
		// -> 선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("선택(0:종료, 1:목록, 2:등록, 3:수정, 4:삭제)");
			int num = sc.nextInt();
			if (num == 0) {
				System.out.println("==프로그램 종료==");
				break;
			} else if (num == 1) {
				System.out.println("-목록-");
			} else if (num == 2) {
				System.out.println("-등록-");
			} else if (num == 3) {
				System.out.println("-수정-");
			} else if (num == 4) {
				System.out.println("-삭제-");
			}
		}
		
	}

}
