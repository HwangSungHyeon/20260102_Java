package study20260107;

import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1차원 배열 25의 크기
		//  배열에 무작위 숫자 저장하기(1~100) 중복없이.
		
		int[] bingo = new int[25];
		
		for(int i = 0; i < bingo.length; i++) { // 향상된 for문(int a : bingo)은 데이터를 저장할때는 적합하지 않다.
			bingo[i] = (int)Math.floor(Math.random() * 100) + 1; // 1~100 중 무작위 숫자
			for(int k = 0; k < i; k++) {      // i 보다 하나 작은 배열까지 비교
				if(bingo[i] == bingo[k]) {    // i 와 k 의 위치가 같을때
					i--;                      // i--을 해줌으로써 위에 있는 i++을 상쇄. 따라서 i 전까지 중복되는걸 비교하고 바꿔줌.
					break;
				}
			}
		}
		
		
		// 25개 숫자 빙고판 모양으로 출력하기
		//  5줄 5칸으로 출력하기
		
		// %d - 정수, %f - 실수, %c - 문자, %s - 문자열, %o - 8진수, %x - 16진수 
		
		while(true) {
			System.out.println("┌─────┬─────┬─────┬─────┬─────┐");  // ㅂ 한자키를 누르면 원하는 모양을 만들 수 있다.
			for(int i =0; i < 5; i++) {
				for(int k = 0; k < 5; k++) {
					if(bingo[i*5+k] == 0)
						System.out.printf("│ %3c ", '■');
					else
						System.out.printf("│ %3d ", bingo[i*5+k]); // %3d - 세자리씩 오른쪽 정렬하게 출력된다.
				}
				if(i == 4)
					System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
				else
					System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
			}
			
			// 빙고를 위해 숫자 입력 만들기
			System.out.print("입력 : ");
			int user = sc.nextInt();
			for(int i = 0; i < bingo.length; i++) {  // 배열에서 내가 입력한 숫자 찾기
				if(bingo[i] == user) { // 입력한 값이 배열에 있다면
					bingo[i] = 0;      // 화면에 체크 표시를 위해 0으로 변경
				}
			}
			
			// 가로 세로 대각선 빙고 확인 하기
			int end = 0; // 현재 및 빙고 인지.
			int row = 0; // 가로 방향(줄 단위) 0의 갯수가 몇개인지 확인
			int col = 0; // 세로 방향(열 단위)
			int cross1 = 0; // 대각선 방향
			int cross2 = 0;
			for(int i = 0; i < 5; i++) {  // 줄 단위 표현은 i 변수이다.
				row = 0;
				col = 0;
				for(int k = 0; k < 5; k++) {  // 열 단위 표현은 k 변수이다.
					if(bingo[i*5+k] == 0) row++;
					if(bingo[i+k*5] == 0) col++;
				}
				if(row == 5) end++;  // 해당 줄에 0이 5개라면 row는 5가되므로 1빙고 완성.
				if(col == 5) end++;
				if(bingo[i*6] == 0) cross1++;
				if(bingo[i*4+4] == 0) cross2++; // i*4+4, (i+1)*4 는 같지만 연산자가 더 적은 것을 써야되므로 첫번째 것을 쓴다.
				
				if(cross1 == 5) end++;
				if(cross2 == 5) end++;
			}
			
//			for(int i = 0; i <= 24; i = i+6) {
//				
//			}
			
			System.out.println(" 현재 완성 빙고 : "+ end+ "줄");
			
			if( end == 5) {
				System.out.println("5줄 빙고 완성!");
				break;
			}
		}
		
		
		
//		System.out.println( Arrays.toString(bingo)); // Arrays.toString 은 숫자를 문자열로 바꿔서 출력해주는 확인용 출력이다.

	}

}
