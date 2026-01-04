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
		
		Scanner kbd = new Scanner(System.in);
		System.out.print("시간(분) 입력 : ");
		int minutes = kbd.nextInt();
		int totalMoney = 0; // 총 요금
		
		if(minutes <= 30) {
			totalMoney = 1000;
		} else if (minutes < 240) {
			int extraMinutes = minutes - 30; // 4시간전 추가요금
			totalMoney = 1000 + (extraMinutes / 10) * 100;
		} else {
			int extraMinutes = minutes - 240; // 4시간 이후 추가요금
			totalMoney = 2500 + (extraMinutes / 10) * 100;
		}
		System.out.println("주차 요금 : "+totalMoney);
		
		
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