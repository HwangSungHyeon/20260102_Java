package study20260106;

import java.util.Scanner;

public class LoopMain2 {
	
	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		// 1~50까지 숫자 하나를 제시하고 컴퓨터가 그 숫자를 맞출수 있도록 내가 범위를 점점 줄여가며
		// 컴퓨터가 맞출수 있도록 내가 랜덤 범위를 계속 줄일수있는 코딩
		
//		System.out.print("1~50 중 입력 :");
//		int user = scan.nextInt();
//		
//		int min = 1, max = 50;
//		
//		while(true) {
//			int com = (int)Math.floor(Math.random() * (max - min + 1) ) + min;
//			System.out.println(com);
//		
//			if(com > user) {
//				System.out.println("DOWN");
//				max = com - 1;
//			}
//			if(com < user) {
//				System.out.println("UP");
//				min = com + 1;
//			}
//			if(user == com) {
//				System.out.println("정답!");
//				break;
//			}
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 숫자야구
		
		System.out.println("========= 숫자야구 =========");
		
		int com1 = (int)Math.floor(Math.random() * 9) + 1 , com2 = 0, com3 = 0;
		
//		while(true) {   // 숫자 3개 중복없이 나오게 하기
//			com2 = (int)Math.floor(Math.random() * 9) + 1;
//			com3 = (int)Math.floor(Math.random() * 9) + 1;
//			if(com1 != com2 && com1 != com3 && com2 != com3)
//				break;
//		}
		
		do {
			com2 = (int)Math.floor(Math.random() * 9) + 1;
			com3 = (int)Math.floor(Math.random() * 9) + 1;
		} while(!(com1 != com2 && com1 != com3 && com2 != com3));  // 거짓으로 만들어줘야 do while문이 끝이 나므로 앞에 !(not 연산자)를 붙여준다.
		
		while(true) {
			int str = 0 , ball = 0;
			System.out.print("1~9 중에 숫자 세개 입력 : ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();
			
			if(com1 == user1) str++;
			if(com2 == user2) str++;
			if(com3 == user3) str++;
			
			if(user1 == com2 || user1 == com3) ball++;
			if(user2 == com1 || user2 == com3) ball++;
			if(user3 == com1 || user3 == com2) ball++;
			
			System.out.println(str+"스트라이크, "+ball+"볼, "+(3-str-ball)+"아웃");
			if(str == 3) {
				System.out.println("정답");
				break;
			}
		}
		
		
	}

}
