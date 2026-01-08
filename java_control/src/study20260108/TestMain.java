package study20260108;

import java.util.Arrays;

public class TestMain {

	public static void main(String[] args) {
		
		// 이정도 까지는 해야 된다 - 배열 실습
		
		// 문제 1. 10개의 무작위 정수 값 저장하기 ( 배열에 )
		//        랜덤 범위는 1~50
		
//		int[] num = new int[10];
//		
//		for(int i = 0; i < num.length; i++) {
//			num[i] = (int)Math.floor(Math.random() * 50) + 1;
////			System.out.print(" " +num[i] );    출력방법 1
//		}
//		
//		for(int n : num)
//			System.out.println( n );        // 출력방법 2
//		
////		System.out.println(Arrays.toString(num));  출력 방법 3
//		
		
//		// 문제 2. 
//		// int[] score = { 99,66,77,56,78,98,83 };
//		// 1학년 3반 학생들의 성적을 배열에 저장하였다.
//		// 3반 학생들 성적의 평균값을 구하세요.
//		// 반복문을 이용하여 하세요 반드시!
//		
//		int[] score = { 99,66,77,56,78,98,83 };
//		int sum = 0;
//		
//		for(int i = 0; i < score.length; i++) {
//			sum = sum + score[i];  // 데이터의 합을 누적시켜줌
//		}
//		int avg = sum / score.length; // 데이터의 크기 만큼 총점을 나누어줌
//		System.out.println("총점 : "+sum);
//		System.out.println("평균 : "+avg);
		
		// 문제 3.
		// 정수 10개를 저장할 수 있는 배열을 선언
		// 1~50의 무작위 값 저장하기
		// 배열의 첫번째 값과 마지막 값 출력
		
		int[] num = new int[10];  // 기본 데이터타입만 가지고 만든 변수 빼고 나머지는 다 new를 붙여서 만들어줘야 한다.
		
		for(int i = 0; i < num.length; i++) {
			num[i] = (int)Math.floor(Math.random()*50)+1;
		}
		System.out.println("첫번째 값 : "+num[0]+"  마지막 값 : "+num[num.length-1]);  // num.length -1 을 하면 마지막 값을 구할 수 있다.
		
		// 문제 4.
		// 문제 3번의 배열에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력하세요.
		
//		for(int i = 0; i < num.length; i++) {
//			if(num[i] % 2 == 0)
//				System.out.println( num[i] );
//		}
		
		// 값을 변경하거나 이동하지 않기 때문에 이 for 문도 사용할 수 있다.
		for(int n : num) {
			if( n % 2 == 0)
				System.out.println( n );
		}
		
		System.out.println("\n");
		// 문제 5.
		// int[] temp = { 6, 0, 5, -2, 0, 4, 8, 0 }
		// temp 베열은 일별 최고기온을 저장한 것이다.
		// 배열에 저장된 기온 중 가장 높은 기온과 가장 낮은 기온을 찾으시오.
		// 0번 인덱스의 기온은 12월 11일 데이터이다.
		// 가장 높은 기온의 날짜와 가장 낮은 기온의 날짜도 출력하시오.
		// ( 가장 높은 기온, 가장 낮은 기온만 찾아서 출력하는 것만 해도 성공)
		
		// 힌트 int max = temp[0];
		//     int min = temp[0];
		       
		int[] temp = { 6, 0, 5, -2, 0, 4, 8, 0 };
		
		int max = temp[0];
		int min = temp[0];
		
		for(int i = 0; i < temp.length; i++) {
			if(max < temp[i]) max = temp[i];  // 가장 높은 값 찾기
			
			if(min > temp[i]) min = temp[i];  // 가장 낮은 값 찾기
		}
		
		System.out.println("가장 높은 기온 : " +max);
		System.out.println("가장 낮은 기온 : " +min);
		
		// 0번 인덱스의 기온은 12월 11일 이다.
		// 가장 높은(낮은) 기온이 몇번째 인덱스에 있는지 찾아야 한다.
		for(int i = 0; i < temp.length; i++) {
			if( temp[i] == max) {
				System.out.println("가장 높은 기온 : "+max+" 날짜 : 12월" + (i+11)+ "일");
			}
			if( temp[i] == min) {
				System.out.println("가장 낮은 기온 : "+min+" 날짜 : 12월" + (i+11)+ "일");
			}
		}
		
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
		System.out.println("가장 높은 기온 : "+max+" 날짜 : 12월" + maxDay+ "일");
		System.out.println("가장 낮은 기온 : "+min+" 날짜 : 12월" + minDay+ "일");
	}

}
