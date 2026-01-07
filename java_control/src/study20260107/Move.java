package study20260107;

import java.util.Scanner;

public class Move {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// 2차원 배열
		// 2차원 배열은 1차원 배열에 1차원 배열을 할당하는 것
		
		
//		String num = "가능";
//		
//		switch( num ) {  // switch 문도 반복문이므로 중괄호 안에 있는 모든게 다 실행됨. 범위에 대해서 표현하지 못한다(비교연산자X). 딱 떨어지는 값만 표현 가능.
//		                 // case 는 내가 원하는 곳에 실행하도록 변수를 정해주고 break 를 모두 넣어줘야 원하는 곳에만 실행한다.
//		                 // case 는 문자, 문자열(String)이 가능하고, 숫자 중에서 정수(int)는 가능하지만 실수(double, float)는 불가능하다.
//		case "가능":
//			System.out.println("2번 선택됨 실행!");
//			break;
//		case 4:
//			System.out.println("4번 선택됨");		
//			break;
//		case 20:
//			System.out.println("20번 선택인데...음");		
//			break;
//		case 54:
//			System.out.println("난 54번 인데?? 흠..");		
//			break;
//		}

//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		// 90~100 A, 80~89 B, 70~79 C, 나머지 F
//		int score = 88;
//		
//		switch( score/10 ) { // 범위에 대해서 표현하지 못한다고 하나하나 다 쓰면 안되고, 계산하여 간단하게 만드는게 좋다.
//		
//		case 10:
//		case 9:
//			System.out.println("A등급");
//			break;
//		case 8:
//			System.out.println("B등급");
//			break;
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int[][] arr = new int[3][4];
//		// 3의 크기인 1차원 배열에 4의 크기인 1차원 배열을 만드는것
//		// [0][1][2] 3의 크기인 배열 안에 [0][1][2][3] ,[0][1][2][3], [0][1][2][3] 4의 크기인 배열
//		
//		arr[0][0] = 1;
//		arr[0][1] = 2;
//		arr[0][2] = 20;
//		arr[0][3] = 50;
//		
//		for(int a= 0; a < arr.length; a++) {  // 2차원 배열의 첫번째 크기만큼 반복.  arr.length는 3의 크기인 배열의 길이
//			for(int b = 0; b < arr[a].length; b++) {  // 2차원 배열의 두번째 크기만큼 반복.  arr[a].length는 3안에 있는 4의 크기인 배열의 길이
// 				System.out.println( arr[a][b] );
//			}
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		
		int[][] board = {
				{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,2,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,0,0,0,0,0,0,0,0,0,0,0,0,0,1 },
				{ 1,1,1,1,1,1,1,1,1,1,1,1,1,1,1 }
		};
		
		int posX = 0, posY = 0;
		
		while(true) {
			for(int i = 0; i < board.length; i++) {
				for(int k = 0; k < board[i].length; k++) {
					
					if(board[i][k] == 1)
						System.out.printf("%c",'■');
					else if (board[i][k] == 0)
						System.out.printf(" ");
					else if (board[i][k] == 2) {
						System.out.printf("%c", '♂');
						posX = k; posY = i;
					}
				}
				System.out.println();
			}
			char key = scan.nextLine().charAt(0); // 문자열에서 문자를 하나 뽑아올 수 있는 방법
		
			// 이동하기 w 위, s 아래, a 왼쪽, d 오른쪽
			board[posY][posX] = 0;
			switch( key ) {
			
			case 'w':
				if (board[posY-1][posX] != 1) posY--;
				break;
			case 's':
				if (board[posY+1][posX] != 1) posY++;
				break;
			case 'a':
				if (board[posY][posX-1] != 1) posX--;
				break;
			case 'd':
				if (board[posY][posX+1] != 1) posX++;
				break;
			default :
				System.out.println("올바른 이동키를 입력하세요");
			}
			board[posY][posX] = 2;
				
		}
		
		
	}

}
