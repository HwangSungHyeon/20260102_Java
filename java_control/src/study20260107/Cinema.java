package study20260107;

import java.util.Scanner;

public class Cinema {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 배열 과제 (1차원 배열만 사용)
		// 영화관 좌석 예약 시스템
		// 0 : 빈좌석, 1 : 예약된 좌석
		// 사용자로부터 에약인원 수를 입력받아
		// 원하는 위치(인덱스)를 탐색하여 연속된 빈 좌석이 있으면 예약 처리하시오.
		// 규칙
		// - 연속된 빈 좌석이 있으면 1로 변경
		// - 예약이 완료되면 에약된 좌석 번호 출력
		// - 연속 좌석이 없으면 "연속 좌석이 없습니다" 출력
		// - 앞자리 우선 예약
		// 예시
		// 예약 인원수 : 3         예약 인원수 : 5
		// 3석 예약 완료           연속 좌석이 없습니다.
		
		int[] seats = new int[50];
        
        while(true) {
        	System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
            for(int i =0; i < 10; i++) {
    			for(int k = 0; k < 5; k++) {
    				if(seats[i*5+k] == 0)
    					System.out.printf("│ %3d ", 0);
    				else
    					System.out.printf("│ %3d ", seats[i*5+k]);
    			}
    			if(i == 9)
    				System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
    			else
    				System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
    		}
            
            System.out.print("예약 인원수 : ");
            int user = sc.nextInt();
            for (int i = 0; i < seats.length; i++) {
            	if(seats[i] == user) {
            		seats[i] = 1;
            	}
            }
        }
		
		
		
		
	}

}
