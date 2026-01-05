package study20260105;

import java.util.Random;
import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {
		
//		for (int i = 1; i <= 10; i++) {
//			System.out.println( i );
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 0)
//				System.out.println( i );
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num = scan.nextInt();
//		
//		for (int i = 1; i <= num; i++) {
//			System.out.println( i );
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 1부터 12까지 출력하는데
		// 4의 배수에는 four 라고 출력하시오.
		
//		for (int i = 1; i <= 12; i++) {
//			if (i % 4 == 0)
//				System.out.println("four");
//			else 
//				System.out.println( i );
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int count = 0; // 무조건 밖에 있어야 한다.
//		
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 17 == 0) {
//				count++;    // 17의 배수가 만들어질때마다 카운트가 된다.
//			}
//		}
//		System.out.println(" 17의 배수 : "+count+"개");

//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 문제
		// 동전앞면 뒷면 맞추기 게임
		// 게임을 총 10판 진행 하기
		// 게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기
		
//		int count = 0;
//		
//		for (int i = 1; i <= 10; i++) {
//			int coin = (int)Math.floor(Math.random() * 2) + 1;
//			System.out.print("1-앞면, 2-뒷면 \n입력 : ");
//			int user = scan.nextInt();
//			
//			if (user == coin) {
//				System.out.println("맞추기 성공");
//				count++;
//			} else 
//				System.out.println("맞추기 실패");
//		}
//		System.out.println("내가 맞춘 횟수 : "+count);
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 무한 루프 - 반복문은 조건식이 참인경우에 계속 반복 수행을 한다.
		//          무조건 참이 되게 조건식을 설정하면 무한 반복을 할 수 있다.
		// 무한 루프는 지정된 횟수가 없기에 멈추지 않고 계속 동작한다.
		// 그래서 무한 루프 구현시 특정 조건을 걸어둔다.
		
		// 무한루프 예1
//		for( ; true;) {
//			
//		}
		
		// 무한루프 예2
//		for(;;) {
//			;
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// for 문은 무한루프를 잘 사용하지 않기 때문에 while 문을 쓴다.
		// 무한 루프가 계속 동작하면 밑에 있는 코드들이 실행되지 않는다.
//		while(true) {
//			System.out.println("나는 무한 루프이다.");
//		}
		
		// 무한루프를 멈추게 하는 방법은 if 문을 이용해라.
//		int i = 10;
//		while(true) {
//			System.out.println( i );
//			i++;
//			if( i == 40) break;  // break 는 반복문과 switch 문에만 사용한다.
//		}
		
		// 1~20까지 중 랜덤으로 나온 숫자 중에 11이 나오면 멈춤.
//		while(true) {
//			int num = (int)Math.floor(Math.random() * 20) + 1;
//			System.out.println( num );
//			if ( num == 11) break;
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
//		int com = (int)Math.floor(Math.random() * 50) + 1;
//		
//		while(true) {
//			System.out.print("1~50 중 입력 :");
//			int user = scan.nextInt();
//			
//			if(user > com) {
//				System.out.println("DOWN");
//			}
//			if(user < com) {
//				System.out.println("UP");
//			}
//			if(user == com) {
//				System.out.println("정답!");
//				break;
//			}
//		}
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 1월 5일 과제
		// 가위 바위 보 게임을 총 15판 진행
		// 게임을 진행하면서 1판 끝날때 마다
		// 몇승, 몇패, 몇무 출력하기.
		
		int win = 0;
		int lose = 0;
		int draw = 0;
		
		for (int i = 1; i <= 15; i++) {
			int com = (int)Math.floor(Math.random() * 3) + 1;
			System.out.println("가위바위보");
			System.out.print("1-가위, 2-바위, 3-보 \n입력 : ");
			int user = scan.nextInt();
			
			System.out.println("컴퓨터 : "+com+" 나 : "+user);
		
			int res = user - com;
			if(res == 0) {
				System.out.println("비김");
				draw++;
			} else if(res == -2 || res == 1) {
				System.out.println("나의 승리");
				win++;
			} else {
				System.out.println("나의 패배");
				lose++;
			}
			System.out.println(win+"승" + lose+"패" + draw+"무");
		}
		
		
		
		
//		ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
		
		// 1~50까지 숫자 하나를 제시하고 컴퓨터가 그 숫자를 맞출수 있도록 내가 범위를 점점 줄여가며
		// 컴퓨터가 맞출수 있도록 내가 랜덤 범위를 계속 줄일수있는 코딩
		
		
		
		
		
 
	}

}


/*
   1월 5일 과제
   
   가위 바위 보 게임을 총 15판 진행
   게임을 진행하면서 1판 끝날때 마다
   몇승, 몇패, 몇무 출력하기.
   
   1~50까지 숫자 하나를 제시하고 컴퓨터가 그 숫자를 맞출수 있도록 내가 범위를 점점 줄여가며
   컴퓨터가 맞출수 있도록 내가 랜덤 범위를 계속 줄일수있는 코딩
   
   반복문 - for, while, do~while
   반복문이란 특정 코드를 정해진 횟수만큼 동작시키는 과정이다. 또는 횟수의 제한없이 동작 시킬 수 있다.
   몇번 반복하겠냐고 정해져있는 경우는 for 문을 사용한다.
   for 문
   for (초기값 지정; 조건식; 증감식) {
       반복 실행할 내용;
       반복 실행 할 내용;
   }
   
   for(int i = 3; i <= 9; i++) {
   
   }
   
   1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다.
   그래야 몇번 반복 시킬것인지 작성하기도 편하고 파악하기도 빠르다.
   
   숫자는 거의 들어가지 않고 변수가 대부분을 차지한다.
   ex) 배열안에 있는 데이터만큼 반복시키는 for 문이다.(나중에 배열을 배우고 나서 씀)
   for (Member m : MemberList) {
   
   }
   
   
*/
