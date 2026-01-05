package study20260102;

import java.util.Scanner;

public class MainMethod {

	public static void main(String[] args) {
		
		if(10 > 5) {
			System.out.println("5보다 크다.");
		}else {
			System.out.println("5보다 작다.");
		}
		
		// 바이킹 탑승 가능 : 145cm 이상
		// 기준값을 뒤에다 두는 것이 좋다.
		
		int tall = 160;
		
		if(tall >= 145) {
			System.out.println("탑승 가능");
		}else {
			System.out.println("탑승 불가능");
		}
		
		int age = 33;
		
		if((age/10) == 3) { //age >= 30 && age < 40
			System.out.println("30대 이다");
		}else {
			System.out.println("20대 이다");
		}
		
		// 주차장에 요금의 기본요금은 1000원이다.
		// 기본시간은 30분이다.
		// 10분 당 100원씩 추가 예) 39분은 1000원, 40분은 1100원
		// 단 4시간 이상 주차시 기본요금은 2500원이다.
		// 예) 3시간 59분 (230분) -> 3000원
		//     4시간 12분 (252분) -> 2600원
		// 문제 : 시간(분)을 입력받아 값을 출력
		
//		Scanner kbd = new Scanner(System.in);
//		System.out.print("시간(분) 입력 : ");
//		int minutes = kbd.nextInt();
//		int totalMoney = 0; // 총 요금
//		
//		if(minutes <= 30) {
//			totalMoney = 1000;
//		} else if (minutes < 240) {
//			int extraMinutes = minutes - 30; // 4시간전 추가요금
//			totalMoney = 1000 + (extraMinutes / 10) * 100;
//		} else {
//			int extraMinutes = minutes - 240; // 4시간 이후 추가요금
//			totalMoney = 2500 + (extraMinutes / 10) * 100;
//		}
//		System.out.println("주차 요금 : "+totalMoney);
		
		int cost = 1000; // 기본요금(30분)
		int inc = 100, incTime = 10; // 10분당 100원
		int time = 30; // 기본시간 30분
		
		// 주차 시간 총 몇분 입력
		Scanner scan = new Scanner(System.in); // 시스템(컴퓨터)으로부터 입력된 키 값 받기
		
		System.out.print("총 몇분 주차 : ");
		int pTime = scan.nextInt(); // 키보드 입력 값 받아서 정수로 변환하여 변수에 저장
		
		pTime /= 10;       // pTime = pTime/10
		if(pTime >= 24) {  // 4시간 이상 주차했다면  pTime >= 240
			cost = 2500;   // 4시간 이상에 대한 기본요금 변경
			pTime -= 24;    // 4시간 빼기, 4시간에 대한 요금은 2500원 나머지는 10분당 요금
		} else if(pTime > 3) {  // 4시간 이상이 아니라면, 기본시간 30분으로 계산해야 된다.
			pTime -= 3;    // 기본시간이 30분이니까 3빼기
		} else {           // 최초 기본시간 안에서 주차 한 경우 
			pTime = 0;
		}
		// 주차 요금 계산
		int price = cost + pTime * 100;
		System.out.println("주차 요금 : "+ price +"원");
	}

}


/*  제어문 
    
    조건문 - if , switch
    
    1.
    if (조건식) {
        조건식이 참일 경우 실행할 코드 ;
    }
    
    2.
    if (조건식) {
        조건식이 참일 경우 실행할 코드 ;
    }else{
        조건식이 거짓일 경우 실행할 코드 ;
    }
    
    3.
    if (조건식1) {
        조건식1이 참인 경우에 실행
    }else {
        조건식1이 거짓인 경우에 실행
        if (조건식2) {
            조건식2가 참인 경우에 실행
        }
    }
    
    4.
    if(조건식1) {
       조건식1이 참일 경우 실행
    }else if(조건식2) {
       조건식2가 참일 경우 실행
    }

*/ 